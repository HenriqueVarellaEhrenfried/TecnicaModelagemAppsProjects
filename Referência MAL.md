# MAL Reference

The primary textual interface to the Monetdb kernel is a simple, assembly-like language, called MAL. The language reflects the virtual machine architecture around the kernel libraries and has been designed for speed of parsing, ease of analysis, and ease of target compilation by query compilers. The language is not meant as a primary programming language, or scripting language. Such use is even discouraged.

Furthermore, a MAL program is considered a specification of intended computation and data flow behavior. It should be understood that its actual evaluation depends on the execution paradigm choosen in a scenario. The program blocks can both be interpreted as ordered sequences of assembler instructions, or as a representation of a data-flow graph that should be resolved in a dataflow driven manner. The language syntax uses a functional style definition of actions and mark those that affect the flow explicitly. Flow of control keywords identify a point to chance the interpretation paradigm and denote a synchronization point.

MAL is the target language for query compilers front-ends. Even simple SQL queries generate a long sequence of MAL instructions. They represent both the administrative actions to ensure binding and transaction control, the flow dependencies to produce the query result, and the steps needed to prepare the result set for delivery to the front-end.

Only when the algebraic structure is too limited (**e.g.** updates), or the database back-end lacks feasible builtin bulk operators, one has to rely on more detailed flow of control primitives. But even in that case, the basic blocks to be processed by a MAL back-end are considered large, **e.g.** tens of simple bulk assignment instructions.

The remainder of this chapter provide a concise overview of the language features and illustrative examples

## Table of Contents

- [MAL Reference](#mal-reference)
    - [Table of Contents](#table-of-contents)
    - [Literals](#literals)
    - [Variables](#variables)
    - [Instructions](#instructions)
    - [Type System](#type-system)
            - [Type resolutions](#type-resolutions)
    - [Exceptions](#exceptions)
            - [Exception control](#exception-control)
            - [Builtin exceptions](#builtin-exceptions)
    - [Modules](#modules)
            - [Name Space Management.](#name-space-management)
    - [Functions](#functions)
            - [Side-effects](#side-effects)
        - [Polymorphism](#polymorphism)
        - [C-functions](#c-functions)
    - [Factories](#factories)
        - [Example Factories](#example-factories)
        - [Ownership](#ownership)

## Literals

Literals in MAL follow the lexical conventions of the programming language C. A default type is attached, **e.g.** the literal 1 is typed as an int value. Likewise, the literal 3.14 is typed flt rather than dbl.

A literal can be coerced to another type by tagging it with a type qualifier, provided a coercion operation is defined. 

For example, 1:lng marks the literal 1 as of type lng. and "1999-12-10":date creates a date literal.

MonetDB comes with the hardwired types:

* bit
* bte 
* chr 
* wrd 
* sht 
* int 
* lng 
* oid 
* flt 
* dbl  
* str 

The kernel code has been optimized to deal with these types efficiently, **i.e.** without unnecessary function call overheads. In addition, the system supports temporal types date, daytime, time, timestamp, timezone, extensions to deal with IPv4 addresses and URLs using inet, url, UUID and JSON formatted strings. An 128-integer arithmetic is compiled in on platforms that can support it.

## Variables

Variables are denoted by identifers and implicitly defined upon first assignment. They take on a type through a type classifier or inherit it from the context in which they are first used, see MAL [Type System](#type-system) .

Variables are organized into two classes: **user defined** and **internal variables**. 

User defined variables start with a letter and temporary variables, **e.g.** generated internally by optimizers, start with X_. 

In general internal variables can not be used in MAL programs directly, but they may become visible in MAL program listings or during debugging.

MAL variables are internally represented by their position into the symbol table and runtime value stack.  

Internal variable names  are recognized by the parser and an error is produced if their name does not align with the expected position in the symbol table.

## Instructions

A MAL instruction has purposely a simple format. It is syntactically represented by an assignment, where an expression (function call) delivers results to multiple target variables. The assignment patterns recognized are illustrated below.

```
     (t1,..,t32) := module.fcn(a1,..,a32);
     t1 := module.fcn(a1,..,a32);
     t1 := v1 operator v2;
     t1 := literal;
     (t1,..,tn) := (a1,..,an);
```

Operators are grouped into user defined modules. Omission of the module name is interpreted as the user module.

Simple binary arithmetic operations are merely provided as a short-hand, **e.g.** the expression `t:=2+2`  is converted directly into `t:= calc.+(2,2)`.

Target variables are optional. The compiler introduces internal variables to hold the result of the expression upon need. They won't show up when you list the MAL program unless they are being used elsewhere.

Each instruction should fit on a single line, which makes it easy for the parser to recover upon encountering a syntax error. 

Comments start with a sharp '##' and continues to the end of the line. They are retained in the internal code representation to ease debugging of compiler generated MAL programs.

The data structure to represent a MAL block is kept simple. It contains a sequence of MAL statements and a symbol table. The MAL instruction record is a code byte string overlaid with the instruction pattern, which contains references into the symbol tables and administrative data for the interpreter. This method leads to a large allocated block, which can be easily freed. Variable- and statement- block together describe the static part of a MAL procedure. It carries enough information to produce a listing and to aid symbolic debugging.

The complete MAL syntax can be found [here](https://github.com/HenriqueVarellaEhrenfried/TecnicaModelagemAppsProjects/blob/master/Sintaxe%20MAL.md) 

## Type System


MonetDB supports an extensible type system to accomodate a wide spectrum of database kernels and application needs. The type administration keeps track of their properties and provides access to the underlying implementations. MonetDB comes with the hardwired scalar types bit, bte, sht, int, lng,  hge, oid, flt, dbl and str. The kernel code has been optimized to deal with these types efficiently, **i.e.** without unnecessary function call overheads.

A small collection of user-defined atom types is shipped with the sysem.

They implement types considered essential for end-user applications, such as:

* color 
* date 
* daytime 
* time 
* timestamp 
* timezone 
* blob 
* inet 
* url 
* json

They are implemented using the type extension mechanism described below. As such, they provide examples for future extensions. 

A concrete example is the 'blob' datatype in the MonetDB atom module library(see ../modules/atoms/blob.mx)

#### Type resolutions

MAL is mostly a strongly typed language. Given the interpretative nature of many of the MAL instructions, when and where type resolution takes place is a critical design issue. Performing it too late, **i.e.** at each instruction call, leads to performance overhead if we derive the same information over and over again. However, many built-in operators have polymorphic typed signatures, so we cannot escape it altogether. Consider the small illustrative MAL program:

```
     function sample(nme:str, val:any_1):bit;
        c := 2 * 3;
        b := bbp.bind(nme);  ##find a BAT
        h := algebra.select(b,val,val);
        t := aggr.count(h);
        x := io.print(t);
        y := io.print(val);
     end sample;
```

The function definition is polymorphic typed on the 2nd argument, it becomes a concrete type upon invocation. The system could attempt a type check, but quickly runs into assumptions that generally do not hold. The first assignment can be type checked during parsing and a symbolic optimizer could even evaluate the expression once. Looking up a BAT in the buffer pool leads to an element :bat[:oid,tt] where tt is a runtime dependent type, which means that the selection operation can not be type-checked immediately. It is an example of an embedded polypmorphic statement, which requires intervention of the user/optimizer to make the type explicit before the type resolver becomes active. The operation count can be checked, if it is given a BAT argument. This assumes that we can infer that 'h' is indeed a BAT, which requires assurance that algebra.select produces one. However, there are no rules to avoid addition of new operators, or to differentiate among different implementations based on the argument types. Since print(t) contains an undetermined typed argument we should postpone type checking as well. The last print statement can be checked upon function invocation.

Life becomes really complex if the body contains a loop with variable types. For then we also have to keep track of the original state of the function. Or alternatively, type checking should consider the runtime stack rather than the function definition itself.

These examples give little room to achieve our prime objective, **i.e.** a fast and early type resolution scheme. Any non-polymorphic function can be type checked and marked type-safe upon completion. Type checking polymorphic functions are post-poned until a concrete type instance is known. It leads to a clone, which can be type checked and is entered into the symbol table.

Defining your own types
For the courageous at heart, you may enter the difficult world of extending the code. The easiest way is to derive the atom modules from one shipped in the source distributed. More involved atomary types require a study of the atom structures (gdk_atoms), because you have to develop a handful routines complying with the signatures required in the kernel library. They are registered upon loading the atom module.

 ## Flow Control

 The flow of control within a MAL program block can be changed by tagging a statement with either 
 
* RETURN 
* YIELD 
* BARRIER 
* CATCH 
* LEAVE,REDO 
* EXIT

The flow modifiers RETURN and YIELD mark the end of a call and return one or more results to the calling environment. The RETURN and YIELD are followed by a target list or an assignment, which is executed first.

The BARRIER (CATCH) and EXIT pair mark a guarded statement block. They may be nested to form a proper hierarchy identified by their primary target variable, also called the control variable.

The LEAVE and REDO are conditional flow modifiers. The control variable is used after the assignment statement has been evaluated to decide on the flow-of-control action to be taken. Built-in controls exists for booleans and numeric values. The guarded block is opened when the control variable holds true, when its numeric value >= 0, or when it is a non-empty string. The nil value blocks entry in all cases.

Once inside the guarded block you have an option to prematurely LEAVE it at the exit statement or to REDO interpretation just after the corresponding barrier statement. Much like 'break' and 'continue' statements in the programming language C. The action is taken when the condition is met.

The EXIT marks the exit for a block. Its optional assignment can be used to re-initialize the barrier control variables or wrap-up any related administration.

The guarded blocks can be properly nested to form a hierarchy of basic blocks. The control flow within and between blocks is simple enough to deal with during an optimizer stage. The REDO and LEAVE statements mark the partial end of a block. Statements within these blocks can be re-arranged in accordance with the data-flow dependencies. The partial blocks order can not be changed that easily. It depends on the mutual exclusion of the data flows within each partial block.

Common guarded blocks in imperative languages are the for-loop and if-then-else constructs. They can be simulated as follows.

Consider the statement `for(i=1;i<10;i++) print(i)`. The (optimized) MAL block to implement this becomes:

```
          i:= 1;
     barrier B:= i<10;
          io.print(i);
          i:= i+1;
     redo B:= i<10;
     exit B;
```

Translation of the statement `if(i<1) print("ok"); else print("wrong");` becomes:

```
         i:=1;
     barrier ifpart:= i<1;
         io.print("ok");
     exit ifpart;
     barrier elsepart:= i>=1;
         io.print("wrong");
     exit elsepart;
```

Note that both guarded blocks can be interchanged without affecting the outcome. Moreover, neither block would have been entered if the variable happens to be assigned nil.

The primitives are sufficient to model a wide variety of iterators, whose pattern look like:

```
     barrier i:= M.newIterator(T);
         elm:= M.getElement(T,i);
         ...
         leave i:= M.noMoreElements(T);
         ...
         redo i:= M.hasMoreElements(T);
     exit i:= M.exitIterator(T);
```

The semantics obeyed by the iterator implementations is as follows. The redo expression updates the target variable i and control proceeds at the first statement after the barrier when the barrier is opened by i. If the barrier could not be re-opened, execution proceeds with the first statement after the redo. Likewise, the leave control statement skips to the exit when the control variable i shows a closed barrier block. Otherwise, it continues with the next instruction. Note, in both failed cases the control variable is possibly changed.

A recurring situation is to iterate over the elements in a BAT. This is supported by an iterator implementation for BATs as follows:

```
     barrier (idx,hd,tl):= bat.newIterator(B);
         ...
         redo (idx,hd,tl):= bat.hasMoreElements(B);
     exit (ids,hd,tl);
```

Where idx is an integer to denote the row in the BAT, hd and tl denote values of the current element.

## Exceptions

MAL comes with an exception handling mechanism, similar in style as found in modern programming languages. Exceptions are considered rare situations that alter the flow of control to a place where they can be handled. After the exceptional case has been handled the following options exist a) continue where it went wrong, b) retry the failed instruction, c) leave the block where the exception was handled, or d) pass the exception to an enclosing call. The current implementation of the MAL interpreter only supports c) and d).

#### Exception control
The exception handling keywords are: CATCH and RAISE The CATCH marks a point in the dataflow where an exception raised can be dealt with. Any statement between the point where it is raised and the catch block is ignored. Moreover, the CATCH ...EXIT block is ignored when no errors have occurred in the preceeding dataflow structure. Within the catch block, the exception variable can be manipulated without constraints.

An exception message is linked with a exception variable of type string. If this variable is defined in the receiving block, the exception message can be delivered. Otherwise, it implicitly raises the exception in the surrounding scope. The variable ANYexception can be used to catch them irrespective of their class.

After an exception has been dealt with, the catch block can be left at the normal exit.

Both LEAVE and REDO are conditional flow of control modifiers, which trigger on a non-empty string variable. An exception raised within a catch-block terminates the function and returns control to the enclosing environment.

The argument to the catch statement is a target list, which holds the exception variables you are interested in.

The snippet below illustrates how an exception raised in the function io.read is caught using the exception variable IOerror. After dealing with it locally, it raises a new exception FATALerror for the enclosing call.

```
     	io.write("Welcome");
     	...
     catch IOerror:str;
     	io.print("input error on reading password");
     raise FATALerror:= "Can't handle it";
     exit IOerror;
```
Since CATCH is a flow control modifier it can be attached to any assignment statement. This statement is executed whenever there is no exception outstanding, but will be ignored when control is moved to the block otherwise.

#### Builtin exceptions
The policy implemented in the MAL modules, and recognized by the interpreter, is to return a string value by default. A NULL return value indicates succesful execution; otherwise the string encodes information to analyse the error occurred.

This string pattern is strictly formatted and easy to analyse. It starts with the name of the exception variable to be set, followed by an indication where the exception was raise, **i.e.** the function name and the program counter, and concludes with specific information needed to interpret and handle the exception.

**For example**, the exception string 'MALException:Admin.main[2]:address of function missing' denotes an exception raised while typechecking a MAL program.

The exceptions captured within the kernel are marked as 'GDKerror'. At that level there is no knowledge about the MAL context, which makes interpretation difficult for the average programmer. Exceptions in the MAL language layer are denoted by 'MALerror', and query language exceptiosn fall in their own class, **e.g.** 'SQLerror'. 

Exceptions can be cascaded to form a trail of exceptions recognized during the exection.

## Modules

#### Name Space Management.
Significant speed improvement at type resolution and during the optimization phases can be gained when each module or function identifier is replaced by a fixed length internal identifier. This translation is done once during parsing. Variables are always stored local to the MAL block in which they are used.

The number of module and function names is expected to be limited. Therefore, the namespace manager is organized as a shared global table. The alternative is a namespace per client. However, this would force passing around the client identity or an expensive operation to deduce this from the process id. The price paid is that updates to the namespace should be protected against concurrent access. The current version is protected with locks, which by itself may cause quite some overhead.

The space can, however, also become polluted with identifiers generated on the fly. Compilers are adviced to be conservative in their naming, or explicitly manage the name space by deletion of non-used names once in a while.

The SQL compiler currently pollutes the name space with function names, because it guarantees a global unique name for each query plan for the duration of the server session.

## Functions

MAL comes with a standard functional abstraction scheme. Functions are represented by MAL instruction lists, enclosed by a function signature and end statement. The function signature lists the arguments and their types. The end statement marks the end of this sequence. Its argument is the function name.

An illustrative example is:

```
     function user.helloWorld(msg:str):str;
         io.print(msg);
         msg:= "done";
         return msg;
     end user.helloWorld;
```

The module name 'user' designates the collection to which this function belongs. A missing module name is considered a reference to the current module, **i.e.** the last module or atom context openend. All user defined functions are assembled in the module user by default.

The functional abstraction scheme comes with several variations: commands, patterns, and factories. They are discussed shortly.

#### Side-effects
Functions can be pre-pended with the keyword unsafe, which designates that execution of the function may change the state of the database or sends information to the client. Unsafe functions are critical for the optimizers, because their order of execution should be guaranteed. Functions that return a value of type :void are considered unsafe by default.

Inline functions.
Functions prepended with the keyword inline are a target for the optimizers to be inlined. This is particularly useful when a vectorized version can be used in cases where only scalar function is known.

### Polymorphism 

Polymorphic functions are characterised by type variables denoted by

:any

and an optional index. Each time a polymorphic MAL function is called, the symbol table is first inspected for the matching strongly typed version. If it does not exists, a copy of the MAL program is generated, whereafter the type variables are replaced with their concrete types. The new MAL program is immediately type checked and, if no errors occured, added to the symbol table.

The generic type variable :any designates an unknown type, which may be filled at type resolution time. Unlike indexed polymorphic type arguments, :any type arguments match possibly with different concrete types.

An example of a parameterised function is shown below:
```
     function user.helloWorld(msg:any_1):any_1;
         io.print(msg);
         return user.helloWorld;
     end helloWorld;
```     
The type variables ensure that the return type equals the argument type. Type variables can be used at any place where a type name is permitted. Beware that polymorphic typed variables are propagated throughout the function body. This may invalidate type resolutions decisions taken earlier (See  [MAL Type System](#type-system)).

This version of helloWorld can also be used for other arguments types, **i.e.** bit,sht,lng,flt,dbl,.... For example, calling helloWorld(3.14:flt) echoes a float value.
 
### C-functions

The MAL function body can also be implemented with a C-function. They are introduced to the MAL type checker by providing their signature and an

address qualifier for linkage.

We distinguish both command and pattern C-function blocks. They differ in the information accessible at run time. The command variant calls the underlying C-function, passing pointers to the arguments on the MAL runtime stack. The pattern command is passed pointers to the MAL definition block, the runtime stack, and the instruction itself. It can be used to analyse the types of the arguments directly.

For example, the definitions below link the kernel routine BKCinsert_bun with the function bat.insert(). It does not fully specify the result type. The io.print() pattern applies to any BAT argument list, provided they match on the head column type. Such a polymorphic type list may only be used in the context of a pattern.

```
     command bat.insert(b:bat[:any_1,:any_2], ht:any_1, tt:any_2)
     	:bat[:any_1,:any_2]
     address BKCinsert_bun;
     
     pattern io.print(b1:bat[:any_1,:any]...):int
     address IOtable; 
```

## Factories

A convenient programming construct is the co-routine, which is specified as an ordinary function, but maintains its own state between calls, and permits re-entry other than by the first statement.

The random generator example is used to illustrate its definition and use.

```
     factory random(seed:int,limit:int):int;
         rnd:=seed;
         lim:= limit;
     barrier lim;
         leave lim:= lim-1;
         rnd:= rnd*125;
         yield rnd:= rnd % 32676;
         redo lim;
     exit lim;
     end random;
```
The first time this factory is called, a plant is created in the local system to handle the requests. The plant contains the stack frame and synchronizes access.

In this case it initializes the generator. The random number is generated and yield as a result of the call. The factory plant is then put to sleep. The second call received by the factory wakes it up at the point where it went to sleep. In this case it will find a redo statement and produces the next random number. Note that also in this case a seed and limit value are expected, but they are ignored in the body. This factory can be called upon to generate at most 'limit' random numbers using the 'seed' to initialize the generator. Thereafter it is being removed, **i.e.** reset to the original state.

A cooperative group of factories can be readily constructed. For example, assume we would like the random factories to respond to both random(seed,limit) and random(). This can be defined as follows:

```
     factory random(seed:int,limit:int):int;
         rnd:=seed;
         lim:= limit;
     barrier lim;
         leave lim:= lim-1;
         rnd:= rnd*125;
         yield rnd:= rnd % 32676;
         redo lim;
     exit lim;
     end random;
     
     factory random():int;
     barrier forever:=true;
         yield random(0,0);
         redo forever;
     exit forever;
     end random;
```

### Example Factories


Complex Factories
The factory scheme can be used to model a volcano-style query processor. Each node in the query tree is an iterator that calls upon the operands to produce a chunk, which are combined into a new chunk for consumption of the parent. The prototypical join(R,S) query illustrates it. The plan does not test for all boundary conditions, it merely implements a nested loop. The end of a sequence is identified by a NIL chunk.

```
     factory query();
         Left:= sql.bind("relationA");
         Right:= sql.bind("relationB");
         rc:= sql.joinStep(Left,Right);
     barrier rc!= nil;
         io.print(rc);
         rc:= sql.joinStep(Left,Right);
         redo rc!= nil;
     exit rc;
     end query;
     
     ##nested loop join
     factory sql.joinStep(Left:bat[:any,:any],Right:bat[:any,:any]):bat[:any,:any];
         lc:= bat.chunkStep(Left);
     barrier outer:= lc != nil;
         rc:= bat.chunkStep(Right);
         barrier inner:= rc != nil;
             chunk:= algebra.join(lc,rc);
             yield chunk;
             rc:= bat.chunkStep(Right);
             redo inner:= rc != nil;
         exit inner;
         lc:= bat.chunkStep(Left);
         redo outer:= lc != nil;
     exit outer;
         ## we have seen everything
         return nil;
     end joinStep;
     
     ##factory for left branch
     factory chunkStepL(L:bat[:any,:any]):bat[:any,:any];
         i:= 0;
         j:= 20;
         cnt:= algebra.count(L);
     barrier outer:= j<cnt;
         chunk:= algebra.slice(L,i,j);
         i:= j;
         j:= i+ 20;
         yield chunk;
         redo loop:= j<cnt;
     exit outer;
         ## send last portion
         chunk:= algebra.slice(L,i,cnt);
         yielD chunk;
         return nil;
     end chunkStep;
     
     ##factory for right leg
     factory chunkStepR(L:bat[:any,:any]):bat[:any,:any];
```

So far we haven't re-used the pattern that both legs are identical. This could be modeled by a generic chunk factory. Choosing a new factory for each query steps reduces the administrative overhead.

Materialized Views
An area where factories might be useful are support for materialized views, **i.e.** the result of a query is retained for ease of access. A simple strategy is to prepare the result once and return it on each successive call. Provided the arguments have not been changed. For example:

```
     factory view1(l:int, h:int):bat[:oid,:str];
         a:bat[:oid,:int]:= bbp.bind("emp","age");
         b:bat[:oid,:str]:= bbp.bind("emp","name");
     barrier always := true;
         lOld := l;
         hOld := h;
         c := algebra.select(a,l,h);
         d := algebra.semijoin(b,c);
     barrier available := true;
         yield d;
         leave available := calc.!=(lOld,l);
         leave available := calc.!=(hOld,h);
         redo available := true;
     exit available;
         redo always;
     exit always;
     end view1;
```

The code should be extended to also check validity of the BATs. It requires a check against the last transaction identifier known.

The Factory concept is still rather experimental and many questions should be considered, **e.g.** What is the lifetime of a factory? Does it persists after all clients has disappeared? What additional control do you need? Can you throw an exception to a Factory?

### Ownership

For simple cases, **e.g.** implementation of a random function, it suffices to ensure that the state is secured between calls. But, in a database context there are multiple clients active. This means we have to be more precise on the relationship between a co-routine and the client for which it works.

The co-routine concept researched in Monet 5 is the notion of a 'factory', which consists of 'factory plants' at possibly different locations and with different policies to handle requests. Factory management is limited to its owner, which is derived from the module in which it is placed. By default Admin is the owner of all modules.

The factory produces elements for multiple clients. Sharing the factory state or even remote processing is up to the factory owner. They are set through properties for the factory plant.

The default policy is to instantiate one shared plant for each factory. If necessary, the factory can keep track of a client list to differentiate the states. A possible implementation would be:

```
     factory random(seed:int,clientid:int):int;
         clt:= bat.new(:int,:int);
         bat.insert(clt,clientid,seed);
     barrier always:=true;
         rnd:= algebra.find(clt,clientid);
     catch   rnd; ##failed to find client
         bat.insert(clt,clientid,seed);
         rnd:= algebra.find(clt,clientid);
     exit    rnd;
         rnd:= rnd * 125;
         rnd:= rnd % 32676;
         algebra.replace(clt,clientid,rnd);
         yield rnd;
         redo always;
     exit always;
     end random;
```

The operators to built client aware factories are, factories.getCaller(), which returns a client index, factories.getModule() and factories.getFunction(), which returns the identity of scope enclosed.

To illustrate, the client specific random generator can be shielded using the factory:

```
     factory random(seed:int):int;
     barrier always:=true;
         clientid:= factories.getCaller();
         yield user.random(seed, clientid);
         redo always;
     exit always;
     end random;
```