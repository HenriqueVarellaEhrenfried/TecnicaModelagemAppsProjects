# MAL Syntax

* The MAL syntax is summarized below in extended BNF. 

* Alternative constructs are seperated by | and grouped by parenthesis. 

* Optional parts are marked with square brackets. 

* A repetition is marked with either '+' or '*' to indicate at least once and many times, respectively. 

* Lexical tokens are illustrated in small capitals.


The syntax:

```
program	: (statement ';') *
statement	: moduleStmt [helpinfo] | definition [helpinfo]
 	| includeStmt | stmt
moduleStmt	: MODULE ident | ATOM ident [':'ident]
includeStmt	: INCLUDE identifier | INCLUDE string_literal
definition	: [UNSAFE] COMMAND header ADDRESS identifier
 	| [UNSAFE] PATTERN header ADDRESS identifier
 	| [INLINE | UNSAFE ] FUNCTION header statement* END name
 	| FACTORY header statement* END name
helpinfo	: COMMENT string_literal
header	: name '(' params ')' result
name	: [ moduleName '.' ] name
result	: typeName | '(' params ')'
params	: binding [',' binding]*
binding	: identifier typeName
typeName	: scalarType | columnType | ':' any ['_' digit]
scalarType	: ':' identifier
columnType	: ':' BAT '[' ':' colElmType ']'
colElmType	: scalarType | anyType
stmt	: [flow] varlist [':=' expr ]
flow	| RETURN  | BARRIER | CATCH | LEAVE | REDO | RAISE
varlist	: variable | '(' variable [',' variable ] * ')'
variable	: identifier
expr	: fcncall | [factor operator] factor
factor	: literal_constant | NIL | var
fcncall	: moduleName '.' name '(' [args] ')'
args	: factor [',' factor]*

```