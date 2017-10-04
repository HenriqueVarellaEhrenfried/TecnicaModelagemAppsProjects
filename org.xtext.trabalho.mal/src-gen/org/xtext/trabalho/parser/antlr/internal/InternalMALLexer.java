package org.xtext.trabalho.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMALLexer extends Lexer {
    public static final int T__19=19;
    public static final int RULE_BIT=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_WRD=8;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_OID=10;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_CHR=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMALLexer() {;} 
    public InternalMALLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMALLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMAL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:11:7: ( ';' )
            // InternalMAL.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:12:7: ( 'MODULE' )
            // InternalMAL.g:12:9: 'MODULE'
            {
            match("MODULE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:13:7: ( 'ATOM' )
            // InternalMAL.g:13:9: 'ATOM'
            {
            match("ATOM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:14:7: ( ':' )
            // InternalMAL.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:15:7: ( 'INCLUDE' )
            // InternalMAL.g:15:9: 'INCLUDE'
            {
            match("INCLUDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:16:7: ( 'UNSAFE' )
            // InternalMAL.g:16:9: 'UNSAFE'
            {
            match("UNSAFE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:17:7: ( 'COMMAND' )
            // InternalMAL.g:17:9: 'COMMAND'
            {
            match("COMMAND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:18:7: ( 'ADDRESS' )
            // InternalMAL.g:18:9: 'ADDRESS'
            {
            match("ADDRESS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:19:7: ( 'PATTERN' )
            // InternalMAL.g:19:9: 'PATTERN'
            {
            match("PATTERN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:20:7: ( 'INLINE' )
            // InternalMAL.g:20:9: 'INLINE'
            {
            match("INLINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:21:7: ( 'FUNCTION' )
            // InternalMAL.g:21:9: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:22:7: ( 'END' )
            // InternalMAL.g:22:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:23:7: ( 'FACTORY' )
            // InternalMAL.g:23:9: 'FACTORY'
            {
            match("FACTORY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:24:7: ( 'COMMENT' )
            // InternalMAL.g:24:9: 'COMMENT'
            {
            match("COMMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:25:7: ( '(' )
            // InternalMAL.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:26:7: ( ')' )
            // InternalMAL.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:27:7: ( '.' )
            // InternalMAL.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:28:7: ( ',' )
            // InternalMAL.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:29:7: ( 'BAT' )
            // InternalMAL.g:29:9: 'BAT'
            {
            match("BAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:30:7: ( '[' )
            // InternalMAL.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:31:7: ( ']' )
            // InternalMAL.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:32:7: ( 'any' )
            // InternalMAL.g:32:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:33:7: ( '_' )
            // InternalMAL.g:33:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:34:7: ( ':=' )
            // InternalMAL.g:34:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:35:7: ( 'RETURN' )
            // InternalMAL.g:35:9: 'RETURN'
            {
            match("RETURN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:36:7: ( 'BARRIER' )
            // InternalMAL.g:36:9: 'BARRIER'
            {
            match("BARRIER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:37:7: ( 'CATCH' )
            // InternalMAL.g:37:9: 'CATCH'
            {
            match("CATCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:38:7: ( 'LEAVE' )
            // InternalMAL.g:38:9: 'LEAVE'
            {
            match("LEAVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:39:7: ( 'REDO' )
            // InternalMAL.g:39:9: 'REDO'
            {
            match("REDO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:40:7: ( 'RAISE' )
            // InternalMAL.g:40:9: 'RAISE'
            {
            match("RAISE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:41:7: ( '+' )
            // InternalMAL.g:41:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:42:7: ( '-' )
            // InternalMAL.g:42:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:43:7: ( '*' )
            // InternalMAL.g:43:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:44:7: ( '/' )
            // InternalMAL.g:44:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:45:7: ( 'NIL' )
            // InternalMAL.g:45:9: 'NIL'
            {
            match("NIL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_BIT"
    public final void mRULE_BIT() throws RecognitionException {
        try {
            int _type = RULE_BIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2068:10: ( ( '0' | '1' ) )
            // InternalMAL.g:2068:12: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT"

    // $ANTLR start "RULE_CHR"
    public final void mRULE_CHR() throws RecognitionException {
        try {
            int _type = RULE_CHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2070:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) )
            // InternalMAL.g:2070:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHR"

    // $ANTLR start "RULE_WRD"
    public final void mRULE_WRD() throws RecognitionException {
        try {
            int _type = RULE_WRD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2072:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMAL.g:2072:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMAL.g:2072:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMAL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WRD"

    // $ANTLR start "RULE_OID"
    public final void mRULE_OID() throws RecognitionException {
        try {
            int _type = RULE_OID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2074:10: ( '1' .. '9' ( '0' .. '9' )* )
            // InternalMAL.g:2074:12: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 
            // InternalMAL.g:2074:21: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMAL.g:2074:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2076:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMAL.g:2076:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMAL.g:2076:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMAL.g:2076:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMAL.g:2076:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMAL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2078:10: ( ( '0' .. '9' )+ )
            // InternalMAL.g:2078:12: ( '0' .. '9' )+
            {
            // InternalMAL.g:2078:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMAL.g:2078:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2080:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMAL.g:2080:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMAL.g:2080:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMAL.g:2080:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMAL.g:2080:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMAL.g:2080:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMAL.g:2080:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMAL.g:2080:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMAL.g:2080:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMAL.g:2080:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMAL.g:2080:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2082:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMAL.g:2082:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMAL.g:2082:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMAL.g:2082:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2084:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMAL.g:2084:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMAL.g:2084:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMAL.g:2084:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMAL.g:2084:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMAL.g:2084:41: ( '\\r' )? '\\n'
                    {
                    // InternalMAL.g:2084:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMAL.g:2084:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2086:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMAL.g:2086:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMAL.g:2086:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMAL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMAL.g:2088:16: ( . )
            // InternalMAL.g:2088:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMAL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_BIT | RULE_CHR | RULE_WRD | RULE_OID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=46;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMAL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMAL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMAL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMAL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMAL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalMAL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalMAL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalMAL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalMAL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalMAL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalMAL.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalMAL.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalMAL.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalMAL.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalMAL.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalMAL.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalMAL.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalMAL.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalMAL.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalMAL.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalMAL.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalMAL.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalMAL.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalMAL.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalMAL.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalMAL.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalMAL.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalMAL.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalMAL.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalMAL.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalMAL.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalMAL.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalMAL.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalMAL.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalMAL.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalMAL.g:1:220: RULE_BIT
                {
                mRULE_BIT(); 

                }
                break;
            case 37 :
                // InternalMAL.g:1:229: RULE_CHR
                {
                mRULE_CHR(); 

                }
                break;
            case 38 :
                // InternalMAL.g:1:238: RULE_WRD
                {
                mRULE_WRD(); 

                }
                break;
            case 39 :
                // InternalMAL.g:1:247: RULE_OID
                {
                mRULE_OID(); 

                }
                break;
            case 40 :
                // InternalMAL.g:1:256: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // InternalMAL.g:1:264: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // InternalMAL.g:1:273: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalMAL.g:1:285: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // InternalMAL.g:1:301: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // InternalMAL.g:1:317: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalMAL.g:1:325: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\2\46\1\53\6\46\4\uffff\1\46\2\uffff\1\46\1\74\2\46\3\uffff\1\105\1\46\1\107\2\46\1\107\3\43\3\uffff\1\116\1\uffff\3\116\2\uffff\10\116\4\uffff\1\116\2\uffff\1\116\1\uffff\3\116\6\uffff\1\116\1\uffff\1\142\4\uffff\1\116\1\uffff\12\116\1\156\1\157\1\116\1\161\4\116\1\166\1\uffff\1\116\1\170\11\116\2\uffff\1\116\1\uffff\1\116\1\u0085\2\116\1\uffff\1\116\1\uffff\6\116\1\u008f\5\116\1\uffff\1\u0095\1\u0096\1\u0097\2\116\1\u009a\1\u009b\2\116\1\uffff\4\116\1\u00a2\3\uffff\1\u00a3\1\u00a4\2\uffff\1\u00a5\1\u00a6\1\u00a7\1\116\1\u00a9\1\u00aa\6\uffff\1\u00ab\3\uffff";
    static final String DFA14_eofS =
        "\u00ac\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\2\60\1\75\6\60\4\uffff\1\60\2\uffff\4\60\3\uffff\1\52\5\60\1\101\2\0\3\uffff\1\60\1\uffff\3\60\2\uffff\10\60\4\uffff\1\60\2\uffff\1\60\1\uffff\3\60\6\uffff\1\60\1\uffff\1\60\4\uffff\1\60\1\uffff\23\60\1\uffff\13\60\2\uffff\1\60\1\uffff\4\60\1\uffff\1\60\1\uffff\14\60\1\uffff\11\60\1\uffff\5\60\3\uffff\2\60\2\uffff\6\60\6\uffff\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\2\172\1\75\6\172\4\uffff\1\172\2\uffff\4\172\3\uffff\1\57\1\172\1\71\1\172\2\71\1\172\2\uffff\3\uffff\1\172\1\uffff\3\172\2\uffff\10\172\4\uffff\1\172\2\uffff\1\172\1\uffff\3\172\6\uffff\1\172\1\uffff\1\71\4\uffff\1\172\1\uffff\23\172\1\uffff\13\172\2\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\14\172\1\uffff\11\172\1\uffff\5\172\3\uffff\2\172\2\uffff\6\172\6\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\11\uffff\1\17\1\20\1\21\1\22\1\uffff\1\24\1\25\4\uffff\1\37\1\40\1\41\11\uffff\1\55\1\56\1\1\1\uffff\1\45\3\uffff\1\30\1\4\10\uffff\1\17\1\20\1\21\1\22\1\uffff\1\24\1\25\1\uffff\1\27\3\uffff\1\37\1\40\1\41\1\53\1\54\1\42\1\uffff\1\44\1\uffff\1\51\1\50\1\52\1\55\1\uffff\1\46\23\uffff\1\47\13\uffff\1\14\1\23\1\uffff\1\26\4\uffff\1\43\1\uffff\1\3\14\uffff\1\35\11\uffff\1\33\5\uffff\1\36\1\34\1\2\2\uffff\1\12\1\6\6\uffff\1\31\1\10\1\5\1\7\1\16\1\11\1\uffff\1\15\1\32\1\13";
    static final String DFA14_specialS =
        "\1\2\37\uffff\1\1\1\0\u008a\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\40\4\43\1\41\1\13\1\14\1\30\1\26\1\16\1\27\1\15\1\31\1\36\1\33\10\35\1\4\1\1\5\43\1\3\1\17\1\7\1\34\1\12\1\11\2\34\1\5\2\34\1\25\1\2\1\32\1\34\1\10\1\34\1\24\2\34\1\6\5\34\1\20\1\43\1\21\1\37\1\23\1\43\1\22\31\34\uff85\43",
            "",
            "\12\47\7\uffff\16\47\1\45\13\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\3\47\1\51\17\47\1\50\6\47\4\uffff\1\47\1\uffff\32\47",
            "\1\52",
            "\12\47\7\uffff\15\47\1\54\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\55\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\1\57\15\47\1\56\13\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\1\60\31\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\1\62\23\47\1\61\5\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\63\14\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\1\70\31\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\73\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\1\76\3\47\1\75\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\77\25\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\103\4\uffff\1\104",
            "\12\47\7\uffff\10\47\1\106\21\47\4\uffff\1\47\1\uffff\32\47",
            "\12\110",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\110",
            "\12\111",
            "\32\112\4\uffff\1\112\1\uffff\32\112",
            "\0\113",
            "\0\113",
            "",
            "",
            "",
            "\12\47\7\uffff\3\47\1\115\26\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\16\47\1\117\13\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\3\47\1\120\26\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\2\47\1\121\10\47\1\122\16\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\22\47\1\123\7\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\14\47\1\124\15\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\23\47\1\125\6\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\23\47\1\126\6\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\127\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\2\47\1\130\27\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\3\47\1\131\26\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\21\47\1\133\1\47\1\132\6\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\134\1\47",
            "",
            "\12\47\7\uffff\3\47\1\136\17\47\1\135\6\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\10\47\1\137\21\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\1\140\31\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\13\47\1\141\16\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\110",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\24\47\1\143\5\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\14\47\1\144\15\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\21\47\1\145\10\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\13\47\1\146\16\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\10\47\1\147\21\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\1\150\31\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\14\47\1\151\15\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\2\47\1\152\27\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\23\47\1\153\6\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\2\47\1\154\27\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\23\47\1\155\6\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\21\47\1\160\10\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\24\47\1\162\5\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\16\47\1\163\13\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\22\47\1\164\7\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\25\47\1\165\4\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\13\47\1\167\16\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\171\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\24\47\1\172\5\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\173\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\5\47\1\174\24\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\1\175\3\47\1\176\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\7\47\1\177\22\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\u0080\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\23\47\1\u0081\6\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\16\47\1\u0082\13\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\10\47\1\u0083\21\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\21\47\1\u0084\10\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\u0086\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\u0087\25\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\4\47\1\u0088\25\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\22\47\1\u0089\7\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\3\47\1\u008a\26\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\u008b\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\u008c\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\u008d\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\u008e\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\21\47\1\u0090\10\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\10\47\1\u0091\21\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\21\47\1\u0092\10\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\u0093\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\u0094\14\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\22\47\1\u0098\7\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\4\47\1\u0099\25\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\3\47\1\u009c\26\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\23\47\1\u009d\6\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\15\47\1\u009e\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\16\47\1\u009f\13\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\30\47\1\u00a0\1\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\21\47\1\u00a1\10\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\15\47\1\u00a8\14\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_BIT | RULE_CHR | RULE_WRD | RULE_OID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( ((LA14_33>='\u0000' && LA14_33<='\uFFFF')) ) {s = 75;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 75;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==';') ) {s = 1;}

                        else if ( (LA14_0=='M') ) {s = 2;}

                        else if ( (LA14_0=='A') ) {s = 3;}

                        else if ( (LA14_0==':') ) {s = 4;}

                        else if ( (LA14_0=='I') ) {s = 5;}

                        else if ( (LA14_0=='U') ) {s = 6;}

                        else if ( (LA14_0=='C') ) {s = 7;}

                        else if ( (LA14_0=='P') ) {s = 8;}

                        else if ( (LA14_0=='F') ) {s = 9;}

                        else if ( (LA14_0=='E') ) {s = 10;}

                        else if ( (LA14_0=='(') ) {s = 11;}

                        else if ( (LA14_0==')') ) {s = 12;}

                        else if ( (LA14_0=='.') ) {s = 13;}

                        else if ( (LA14_0==',') ) {s = 14;}

                        else if ( (LA14_0=='B') ) {s = 15;}

                        else if ( (LA14_0=='[') ) {s = 16;}

                        else if ( (LA14_0==']') ) {s = 17;}

                        else if ( (LA14_0=='a') ) {s = 18;}

                        else if ( (LA14_0=='_') ) {s = 19;}

                        else if ( (LA14_0=='R') ) {s = 20;}

                        else if ( (LA14_0=='L') ) {s = 21;}

                        else if ( (LA14_0=='+') ) {s = 22;}

                        else if ( (LA14_0=='-') ) {s = 23;}

                        else if ( (LA14_0=='*') ) {s = 24;}

                        else if ( (LA14_0=='/') ) {s = 25;}

                        else if ( (LA14_0=='N') ) {s = 26;}

                        else if ( (LA14_0=='1') ) {s = 27;}

                        else if ( (LA14_0=='D'||(LA14_0>='G' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='K')||LA14_0=='O'||LA14_0=='Q'||(LA14_0>='S' && LA14_0<='T')||(LA14_0>='V' && LA14_0<='Z')||(LA14_0>='b' && LA14_0<='z')) ) {s = 28;}

                        else if ( ((LA14_0>='2' && LA14_0<='9')) ) {s = 29;}

                        else if ( (LA14_0=='0') ) {s = 30;}

                        else if ( (LA14_0=='^') ) {s = 31;}

                        else if ( (LA14_0=='\"') ) {s = 32;}

                        else if ( (LA14_0=='\'') ) {s = 33;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 34;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='<' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}