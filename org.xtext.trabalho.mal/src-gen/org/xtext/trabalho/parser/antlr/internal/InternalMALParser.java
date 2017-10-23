package org.xtext.trabalho.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.trabalho.services.MALGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMALParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WRD", "RULE_STRING", "RULE_BIT", "RULE_CHR", "RULE_INT", "RULE_OID", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'MODULE'", "'module'", "'ATOM'", "'atom'", "':'", "'INCLUDE'", "'include'", "'UNSAFE'", "'unsafe'", "'COMMAND'", "'command'", "'ADDRESS'", "'address'", "'PATTERN'", "'pattern'", "'INLINE'", "'inline'", "'FUNCTION'", "'function'", "'END'", "'end'", "'FACTORY'", "'factory'", "'COMMENT'", "'comment'", "'('", "')'", "'.'", "','", "'BAT'", "'bat'", "'['", "']'", "'any'", "'_'", "':='", "'RETURN'", "'return'", "'BARRIER'", "'barrier'", "'CATCH'", "'catch'", "'LEAVE'", "'leave'", "'REDO'", "'redo'", "'RAISE'", "'raise'", "'+'", "'-'", "'*'", "'/'", "'NIL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_BIT=6;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_WRD=4;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_OID=9;
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


        public InternalMALParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMALParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMALParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMAL.g"; }



     	private MALGrammarAccess grammarAccess;

        public InternalMALParser(TokenStream input, MALGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MALGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMAL.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMAL.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMAL.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMAL.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_elements_0_0= ruleStatement ) ) otherlv_1= ';' )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:77:2: ( ( ( (lv_elements_0_0= ruleStatement ) ) otherlv_1= ';' )* )
            // InternalMAL.g:78:2: ( ( (lv_elements_0_0= ruleStatement ) ) otherlv_1= ';' )*
            {
            // InternalMAL.g:78:2: ( ( (lv_elements_0_0= ruleStatement ) ) otherlv_1= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WRD||(LA1_0>=16 && LA1_0<=19)||(LA1_0>=21 && LA1_0<=26)||(LA1_0>=29 && LA1_0<=34)||(LA1_0>=37 && LA1_0<=38)||LA1_0==41||(LA1_0>=52 && LA1_0<=63)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMAL.g:79:3: ( (lv_elements_0_0= ruleStatement ) ) otherlv_1= ';'
            	    {
            	    // InternalMAL.g:79:3: ( (lv_elements_0_0= ruleStatement ) )
            	    // InternalMAL.g:80:4: (lv_elements_0_0= ruleStatement )
            	    {
            	    // InternalMAL.g:80:4: (lv_elements_0_0= ruleStatement )
            	    // InternalMAL.g:81:5: lv_elements_0_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getElementsStatementParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"org.xtext.trabalho.MAL.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	    			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getSemicolonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalMAL.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMAL.g:106:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMAL.g:107:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMAL.g:113:1: ruleStatement returns [EObject current=null] : ( (this_ModuleStmt_0= ruleModuleStmt ( (lv_help_1_0= ruleHelpinfo ) )? ) | (this_Definition_2= ruleDefinition ( (lv_help_3_0= ruleHelpinfo ) )? ) | this_IncludeStmt_4= ruleIncludeStmt | this_Stmt_5= ruleStmt ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ModuleStmt_0 = null;

        EObject lv_help_1_0 = null;

        EObject this_Definition_2 = null;

        EObject lv_help_3_0 = null;

        EObject this_IncludeStmt_4 = null;

        EObject this_Stmt_5 = null;



        	enterRule();

        try {
            // InternalMAL.g:119:2: ( ( (this_ModuleStmt_0= ruleModuleStmt ( (lv_help_1_0= ruleHelpinfo ) )? ) | (this_Definition_2= ruleDefinition ( (lv_help_3_0= ruleHelpinfo ) )? ) | this_IncludeStmt_4= ruleIncludeStmt | this_Stmt_5= ruleStmt ) )
            // InternalMAL.g:120:2: ( (this_ModuleStmt_0= ruleModuleStmt ( (lv_help_1_0= ruleHelpinfo ) )? ) | (this_Definition_2= ruleDefinition ( (lv_help_3_0= ruleHelpinfo ) )? ) | this_IncludeStmt_4= ruleIncludeStmt | this_Stmt_5= ruleStmt )
            {
            // InternalMAL.g:120:2: ( (this_ModuleStmt_0= ruleModuleStmt ( (lv_help_1_0= ruleHelpinfo ) )? ) | (this_Definition_2= ruleDefinition ( (lv_help_3_0= ruleHelpinfo ) )? ) | this_IncludeStmt_4= ruleIncludeStmt | this_Stmt_5= ruleStmt )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt4=1;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 37:
            case 38:
                {
                alt4=2;
                }
                break;
            case 21:
            case 22:
                {
                alt4=3;
                }
                break;
            case RULE_WRD:
            case 41:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMAL.g:121:3: (this_ModuleStmt_0= ruleModuleStmt ( (lv_help_1_0= ruleHelpinfo ) )? )
                    {
                    // InternalMAL.g:121:3: (this_ModuleStmt_0= ruleModuleStmt ( (lv_help_1_0= ruleHelpinfo ) )? )
                    // InternalMAL.g:122:4: this_ModuleStmt_0= ruleModuleStmt ( (lv_help_1_0= ruleHelpinfo ) )?
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getModuleStmtParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_ModuleStmt_0=ruleModuleStmt();

                    state._fsp--;


                    				current = this_ModuleStmt_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMAL.g:130:4: ( (lv_help_1_0= ruleHelpinfo ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=39 && LA2_0<=40)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalMAL.g:131:5: (lv_help_1_0= ruleHelpinfo )
                            {
                            // InternalMAL.g:131:5: (lv_help_1_0= ruleHelpinfo )
                            // InternalMAL.g:132:6: lv_help_1_0= ruleHelpinfo
                            {

                            						newCompositeNode(grammarAccess.getStatementAccess().getHelpHelpinfoParserRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_help_1_0=ruleHelpinfo();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getStatementRule());
                            						}
                            						set(
                            							current,
                            							"help",
                            							true,
                            							"org.xtext.trabalho.MAL.Helpinfo");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:151:3: (this_Definition_2= ruleDefinition ( (lv_help_3_0= ruleHelpinfo ) )? )
                    {
                    // InternalMAL.g:151:3: (this_Definition_2= ruleDefinition ( (lv_help_3_0= ruleHelpinfo ) )? )
                    // InternalMAL.g:152:4: this_Definition_2= ruleDefinition ( (lv_help_3_0= ruleHelpinfo ) )?
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_Definition_2=ruleDefinition();

                    state._fsp--;


                    				current = this_Definition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMAL.g:160:4: ( (lv_help_3_0= ruleHelpinfo ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=39 && LA3_0<=40)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalMAL.g:161:5: (lv_help_3_0= ruleHelpinfo )
                            {
                            // InternalMAL.g:161:5: (lv_help_3_0= ruleHelpinfo )
                            // InternalMAL.g:162:6: lv_help_3_0= ruleHelpinfo
                            {

                            						newCompositeNode(grammarAccess.getStatementAccess().getHelpHelpinfoParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_help_3_0=ruleHelpinfo();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getStatementRule());
                            						}
                            						set(
                            							current,
                            							"help",
                            							true,
                            							"org.xtext.trabalho.MAL.Helpinfo");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:181:3: this_IncludeStmt_4= ruleIncludeStmt
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIncludeStmtParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IncludeStmt_4=ruleIncludeStmt();

                    state._fsp--;


                    			current = this_IncludeStmt_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMAL.g:190:3: this_Stmt_5= ruleStmt
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStmtParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stmt_5=ruleStmt();

                    state._fsp--;


                    			current = this_Stmt_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleModuleStmt"
    // InternalMAL.g:202:1: entryRuleModuleStmt returns [EObject current=null] : iv_ruleModuleStmt= ruleModuleStmt EOF ;
    public final EObject entryRuleModuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleStmt = null;


        try {
            // InternalMAL.g:202:51: (iv_ruleModuleStmt= ruleModuleStmt EOF )
            // InternalMAL.g:203:2: iv_ruleModuleStmt= ruleModuleStmt EOF
            {
             newCompositeNode(grammarAccess.getModuleStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleStmt=ruleModuleStmt();

            state._fsp--;

             current =iv_ruleModuleStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleStmt"


    // $ANTLR start "ruleModuleStmt"
    // InternalMAL.g:209:1: ruleModuleStmt returns [EObject current=null] : ( ( (otherlv_0= 'MODULE' | otherlv_1= 'module' ) ( (lv_ident_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'ATOM' | otherlv_4= 'atom' ) ( (lv_ident_5_0= RULE_WRD ) ) (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )? ) ) ;
    public final EObject ruleModuleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ident_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ident_5_0=null;
        Token otherlv_6=null;
        Token lv_second_ident_7_0=null;


        	enterRule();

        try {
            // InternalMAL.g:215:2: ( ( ( (otherlv_0= 'MODULE' | otherlv_1= 'module' ) ( (lv_ident_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'ATOM' | otherlv_4= 'atom' ) ( (lv_ident_5_0= RULE_WRD ) ) (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )? ) ) )
            // InternalMAL.g:216:2: ( ( (otherlv_0= 'MODULE' | otherlv_1= 'module' ) ( (lv_ident_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'ATOM' | otherlv_4= 'atom' ) ( (lv_ident_5_0= RULE_WRD ) ) (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )? ) )
            {
            // InternalMAL.g:216:2: ( ( (otherlv_0= 'MODULE' | otherlv_1= 'module' ) ( (lv_ident_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'ATOM' | otherlv_4= 'atom' ) ( (lv_ident_5_0= RULE_WRD ) ) (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMAL.g:217:3: ( (otherlv_0= 'MODULE' | otherlv_1= 'module' ) ( (lv_ident_2_0= RULE_WRD ) ) )
                    {
                    // InternalMAL.g:217:3: ( (otherlv_0= 'MODULE' | otherlv_1= 'module' ) ( (lv_ident_2_0= RULE_WRD ) ) )
                    // InternalMAL.g:218:4: (otherlv_0= 'MODULE' | otherlv_1= 'module' ) ( (lv_ident_2_0= RULE_WRD ) )
                    {
                    // InternalMAL.g:218:4: (otherlv_0= 'MODULE' | otherlv_1= 'module' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==17) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMAL.g:219:5: otherlv_0= 'MODULE'
                            {
                            otherlv_0=(Token)match(input,16,FOLLOW_6); 

                            					newLeafNode(otherlv_0, grammarAccess.getModuleStmtAccess().getMODULEKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:224:5: otherlv_1= 'module'
                            {
                            otherlv_1=(Token)match(input,17,FOLLOW_6); 

                            					newLeafNode(otherlv_1, grammarAccess.getModuleStmtAccess().getModuleKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:229:4: ( (lv_ident_2_0= RULE_WRD ) )
                    // InternalMAL.g:230:5: (lv_ident_2_0= RULE_WRD )
                    {
                    // InternalMAL.g:230:5: (lv_ident_2_0= RULE_WRD )
                    // InternalMAL.g:231:6: lv_ident_2_0= RULE_WRD
                    {
                    lv_ident_2_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

                    						newLeafNode(lv_ident_2_0, grammarAccess.getModuleStmtAccess().getIdentWRDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModuleStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ident",
                    							lv_ident_2_0,
                    							"org.xtext.trabalho.MAL.WRD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:249:3: ( (otherlv_3= 'ATOM' | otherlv_4= 'atom' ) ( (lv_ident_5_0= RULE_WRD ) ) (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )? )
                    {
                    // InternalMAL.g:249:3: ( (otherlv_3= 'ATOM' | otherlv_4= 'atom' ) ( (lv_ident_5_0= RULE_WRD ) ) (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )? )
                    // InternalMAL.g:250:4: (otherlv_3= 'ATOM' | otherlv_4= 'atom' ) ( (lv_ident_5_0= RULE_WRD ) ) (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )?
                    {
                    // InternalMAL.g:250:4: (otherlv_3= 'ATOM' | otherlv_4= 'atom' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==19) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMAL.g:251:5: otherlv_3= 'ATOM'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getModuleStmtAccess().getATOMKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:256:5: otherlv_4= 'atom'
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getModuleStmtAccess().getAtomKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:261:4: ( (lv_ident_5_0= RULE_WRD ) )
                    // InternalMAL.g:262:5: (lv_ident_5_0= RULE_WRD )
                    {
                    // InternalMAL.g:262:5: (lv_ident_5_0= RULE_WRD )
                    // InternalMAL.g:263:6: lv_ident_5_0= RULE_WRD
                    {
                    lv_ident_5_0=(Token)match(input,RULE_WRD,FOLLOW_7); 

                    						newLeafNode(lv_ident_5_0, grammarAccess.getModuleStmtAccess().getIdentWRDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModuleStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ident",
                    							lv_ident_5_0,
                    							"org.xtext.trabalho.MAL.WRD");
                    					

                    }


                    }

                    // InternalMAL.g:279:4: (otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMAL.g:280:5: otherlv_6= ':' ( (lv_second_ident_7_0= RULE_WRD ) )
                            {
                            otherlv_6=(Token)match(input,20,FOLLOW_6); 

                            					newLeafNode(otherlv_6, grammarAccess.getModuleStmtAccess().getColonKeyword_1_2_0());
                            				
                            // InternalMAL.g:284:5: ( (lv_second_ident_7_0= RULE_WRD ) )
                            // InternalMAL.g:285:6: (lv_second_ident_7_0= RULE_WRD )
                            {
                            // InternalMAL.g:285:6: (lv_second_ident_7_0= RULE_WRD )
                            // InternalMAL.g:286:7: lv_second_ident_7_0= RULE_WRD
                            {
                            lv_second_ident_7_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

                            							newLeafNode(lv_second_ident_7_0, grammarAccess.getModuleStmtAccess().getSecond_identWRDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModuleStmtRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"second_ident",
                            								true,
                            								"org.xtext.trabalho.MAL.WRD");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleStmt"


    // $ANTLR start "entryRuleIncludeStmt"
    // InternalMAL.g:308:1: entryRuleIncludeStmt returns [EObject current=null] : iv_ruleIncludeStmt= ruleIncludeStmt EOF ;
    public final EObject entryRuleIncludeStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeStmt = null;


        try {
            // InternalMAL.g:308:52: (iv_ruleIncludeStmt= ruleIncludeStmt EOF )
            // InternalMAL.g:309:2: iv_ruleIncludeStmt= ruleIncludeStmt EOF
            {
             newCompositeNode(grammarAccess.getIncludeStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludeStmt=ruleIncludeStmt();

            state._fsp--;

             current =iv_ruleIncludeStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeStmt"


    // $ANTLR start "ruleIncludeStmt"
    // InternalMAL.g:315:1: ruleIncludeStmt returns [EObject current=null] : ( ( (otherlv_0= 'INCLUDE' | otherlv_1= 'include' ) ( (lv_identifier_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'INCLUDE' | otherlv_4= 'include' ) ( (lv_string_literal_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleIncludeStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_identifier_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_string_literal_5_0=null;


        	enterRule();

        try {
            // InternalMAL.g:321:2: ( ( ( (otherlv_0= 'INCLUDE' | otherlv_1= 'include' ) ( (lv_identifier_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'INCLUDE' | otherlv_4= 'include' ) ( (lv_string_literal_5_0= RULE_STRING ) ) ) ) )
            // InternalMAL.g:322:2: ( ( (otherlv_0= 'INCLUDE' | otherlv_1= 'include' ) ( (lv_identifier_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'INCLUDE' | otherlv_4= 'include' ) ( (lv_string_literal_5_0= RULE_STRING ) ) ) )
            {
            // InternalMAL.g:322:2: ( ( (otherlv_0= 'INCLUDE' | otherlv_1= 'include' ) ( (lv_identifier_2_0= RULE_WRD ) ) ) | ( (otherlv_3= 'INCLUDE' | otherlv_4= 'include' ) ( (lv_string_literal_5_0= RULE_STRING ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_WRD) ) {
                    alt11=1;
                }
                else if ( (LA11_1==RULE_STRING) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==22) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_WRD) ) {
                    alt11=1;
                }
                else if ( (LA11_2==RULE_STRING) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMAL.g:323:3: ( (otherlv_0= 'INCLUDE' | otherlv_1= 'include' ) ( (lv_identifier_2_0= RULE_WRD ) ) )
                    {
                    // InternalMAL.g:323:3: ( (otherlv_0= 'INCLUDE' | otherlv_1= 'include' ) ( (lv_identifier_2_0= RULE_WRD ) ) )
                    // InternalMAL.g:324:4: (otherlv_0= 'INCLUDE' | otherlv_1= 'include' ) ( (lv_identifier_2_0= RULE_WRD ) )
                    {
                    // InternalMAL.g:324:4: (otherlv_0= 'INCLUDE' | otherlv_1= 'include' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==22) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMAL.g:325:5: otherlv_0= 'INCLUDE'
                            {
                            otherlv_0=(Token)match(input,21,FOLLOW_6); 

                            					newLeafNode(otherlv_0, grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:330:5: otherlv_1= 'include'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_6); 

                            					newLeafNode(otherlv_1, grammarAccess.getIncludeStmtAccess().getIncludeKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:335:4: ( (lv_identifier_2_0= RULE_WRD ) )
                    // InternalMAL.g:336:5: (lv_identifier_2_0= RULE_WRD )
                    {
                    // InternalMAL.g:336:5: (lv_identifier_2_0= RULE_WRD )
                    // InternalMAL.g:337:6: lv_identifier_2_0= RULE_WRD
                    {
                    lv_identifier_2_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

                    						newLeafNode(lv_identifier_2_0, grammarAccess.getIncludeStmtAccess().getIdentifierWRDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIncludeStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"identifier",
                    							lv_identifier_2_0,
                    							"org.xtext.trabalho.MAL.WRD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:355:3: ( (otherlv_3= 'INCLUDE' | otherlv_4= 'include' ) ( (lv_string_literal_5_0= RULE_STRING ) ) )
                    {
                    // InternalMAL.g:355:3: ( (otherlv_3= 'INCLUDE' | otherlv_4= 'include' ) ( (lv_string_literal_5_0= RULE_STRING ) ) )
                    // InternalMAL.g:356:4: (otherlv_3= 'INCLUDE' | otherlv_4= 'include' ) ( (lv_string_literal_5_0= RULE_STRING ) )
                    {
                    // InternalMAL.g:356:4: (otherlv_3= 'INCLUDE' | otherlv_4= 'include' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==22) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMAL.g:357:5: otherlv_3= 'INCLUDE'
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_8); 

                            					newLeafNode(otherlv_3, grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:362:5: otherlv_4= 'include'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_8); 

                            					newLeafNode(otherlv_4, grammarAccess.getIncludeStmtAccess().getIncludeKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:367:4: ( (lv_string_literal_5_0= RULE_STRING ) )
                    // InternalMAL.g:368:5: (lv_string_literal_5_0= RULE_STRING )
                    {
                    // InternalMAL.g:368:5: (lv_string_literal_5_0= RULE_STRING )
                    // InternalMAL.g:369:6: lv_string_literal_5_0= RULE_STRING
                    {
                    lv_string_literal_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_string_literal_5_0, grammarAccess.getIncludeStmtAccess().getString_literalSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIncludeStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string_literal",
                    							lv_string_literal_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeStmt"


    // $ANTLR start "entryRuleDefinition"
    // InternalMAL.g:390:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMAL.g:390:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMAL.g:391:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMAL.g:397:1: ruleDefinition returns [EObject current=null] : ( ( (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )? (otherlv_2= 'COMMAND' | otherlv_3= 'command' ) ( (lv_header_4_0= ruleHeader ) ) (otherlv_5= 'ADDRESS' | otherlv_6= 'address' ) ( (lv_identifier_7_0= RULE_WRD ) ) ) | ( (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )? (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' ) ( (lv_header_12_0= ruleHeader ) ) (otherlv_13= 'ADDRESS' | otherlv_14= 'address' ) ( (lv_identifier_15_0= RULE_WRD ) ) ) | ( ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )? (otherlv_20= 'FUNCTION' | otherlv_21= 'function' ) ( (lv_header_22_0= ruleHeader ) ) ( (lv_statements_23_0= ruleStatement ) )* (otherlv_24= 'END' | otherlv_25= 'end' ) ( (lv_function_name_26_0= ruleName ) ) ) | ( (otherlv_27= 'FACTORY' | otherlv_28= 'factory' ) ( (lv_header_29_0= ruleHeader ) ) ( (lv_statements_30_0= ruleStatement ) )* (otherlv_31= 'END' | otherlv_32= 'end' ) ( (lv_factory_name_33_0= ruleName ) ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_identifier_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_identifier_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_header_4_0 = null;

        EObject lv_header_12_0 = null;

        EObject lv_header_22_0 = null;

        EObject lv_statements_23_0 = null;

        EObject lv_function_name_26_0 = null;

        EObject lv_header_29_0 = null;

        EObject lv_statements_30_0 = null;

        EObject lv_factory_name_33_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:403:2: ( ( ( (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )? (otherlv_2= 'COMMAND' | otherlv_3= 'command' ) ( (lv_header_4_0= ruleHeader ) ) (otherlv_5= 'ADDRESS' | otherlv_6= 'address' ) ( (lv_identifier_7_0= RULE_WRD ) ) ) | ( (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )? (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' ) ( (lv_header_12_0= ruleHeader ) ) (otherlv_13= 'ADDRESS' | otherlv_14= 'address' ) ( (lv_identifier_15_0= RULE_WRD ) ) ) | ( ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )? (otherlv_20= 'FUNCTION' | otherlv_21= 'function' ) ( (lv_header_22_0= ruleHeader ) ) ( (lv_statements_23_0= ruleStatement ) )* (otherlv_24= 'END' | otherlv_25= 'end' ) ( (lv_function_name_26_0= ruleName ) ) ) | ( (otherlv_27= 'FACTORY' | otherlv_28= 'factory' ) ( (lv_header_29_0= ruleHeader ) ) ( (lv_statements_30_0= ruleStatement ) )* (otherlv_31= 'END' | otherlv_32= 'end' ) ( (lv_factory_name_33_0= ruleName ) ) ) ) )
            // InternalMAL.g:404:2: ( ( (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )? (otherlv_2= 'COMMAND' | otherlv_3= 'command' ) ( (lv_header_4_0= ruleHeader ) ) (otherlv_5= 'ADDRESS' | otherlv_6= 'address' ) ( (lv_identifier_7_0= RULE_WRD ) ) ) | ( (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )? (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' ) ( (lv_header_12_0= ruleHeader ) ) (otherlv_13= 'ADDRESS' | otherlv_14= 'address' ) ( (lv_identifier_15_0= RULE_WRD ) ) ) | ( ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )? (otherlv_20= 'FUNCTION' | otherlv_21= 'function' ) ( (lv_header_22_0= ruleHeader ) ) ( (lv_statements_23_0= ruleStatement ) )* (otherlv_24= 'END' | otherlv_25= 'end' ) ( (lv_function_name_26_0= ruleName ) ) ) | ( (otherlv_27= 'FACTORY' | otherlv_28= 'factory' ) ( (lv_header_29_0= ruleHeader ) ) ( (lv_statements_30_0= ruleStatement ) )* (otherlv_31= 'END' | otherlv_32= 'end' ) ( (lv_factory_name_33_0= ruleName ) ) ) )
            {
            // InternalMAL.g:404:2: ( ( (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )? (otherlv_2= 'COMMAND' | otherlv_3= 'command' ) ( (lv_header_4_0= ruleHeader ) ) (otherlv_5= 'ADDRESS' | otherlv_6= 'address' ) ( (lv_identifier_7_0= RULE_WRD ) ) ) | ( (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )? (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' ) ( (lv_header_12_0= ruleHeader ) ) (otherlv_13= 'ADDRESS' | otherlv_14= 'address' ) ( (lv_identifier_15_0= RULE_WRD ) ) ) | ( ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )? (otherlv_20= 'FUNCTION' | otherlv_21= 'function' ) ( (lv_header_22_0= ruleHeader ) ) ( (lv_statements_23_0= ruleStatement ) )* (otherlv_24= 'END' | otherlv_25= 'end' ) ( (lv_function_name_26_0= ruleName ) ) ) | ( (otherlv_27= 'FACTORY' | otherlv_28= 'factory' ) ( (lv_header_29_0= ruleHeader ) ) ( (lv_statements_30_0= ruleStatement ) )* (otherlv_31= 'END' | otherlv_32= 'end' ) ( (lv_factory_name_33_0= ruleName ) ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                switch ( input.LA(2) ) {
                case 25:
                case 26:
                    {
                    alt27=1;
                    }
                    break;
                case 29:
                case 30:
                    {
                    alt27=2;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt27=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                switch ( input.LA(2) ) {
                case 29:
                case 30:
                    {
                    alt27=2;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt27=3;
                    }
                    break;
                case 25:
                case 26:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }

                }
                break;
            case 25:
            case 26:
                {
                alt27=1;
                }
                break;
            case 29:
            case 30:
                {
                alt27=2;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt27=3;
                }
                break;
            case 37:
            case 38:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMAL.g:405:3: ( (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )? (otherlv_2= 'COMMAND' | otherlv_3= 'command' ) ( (lv_header_4_0= ruleHeader ) ) (otherlv_5= 'ADDRESS' | otherlv_6= 'address' ) ( (lv_identifier_7_0= RULE_WRD ) ) )
                    {
                    // InternalMAL.g:405:3: ( (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )? (otherlv_2= 'COMMAND' | otherlv_3= 'command' ) ( (lv_header_4_0= ruleHeader ) ) (otherlv_5= 'ADDRESS' | otherlv_6= 'address' ) ( (lv_identifier_7_0= RULE_WRD ) ) )
                    // InternalMAL.g:406:4: (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )? (otherlv_2= 'COMMAND' | otherlv_3= 'command' ) ( (lv_header_4_0= ruleHeader ) ) (otherlv_5= 'ADDRESS' | otherlv_6= 'address' ) ( (lv_identifier_7_0= RULE_WRD ) )
                    {
                    // InternalMAL.g:406:4: (otherlv_0= 'UNSAFE' | otherlv_1= 'unsafe' )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==24) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMAL.g:407:5: otherlv_0= 'UNSAFE'
                            {
                            otherlv_0=(Token)match(input,23,FOLLOW_9); 

                            					newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:412:5: otherlv_1= 'unsafe'
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_9); 

                            					newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getUnsafeKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:417:4: (otherlv_2= 'COMMAND' | otherlv_3= 'command' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==26) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMAL.g:418:5: otherlv_2= 'COMMAND'
                            {
                            otherlv_2=(Token)match(input,25,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getCOMMANDKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:423:5: otherlv_3= 'command'
                            {
                            otherlv_3=(Token)match(input,26,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getCommandKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:428:4: ( (lv_header_4_0= ruleHeader ) )
                    // InternalMAL.g:429:5: (lv_header_4_0= ruleHeader )
                    {
                    // InternalMAL.g:429:5: (lv_header_4_0= ruleHeader )
                    // InternalMAL.g:430:6: lv_header_4_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_header_4_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_4_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMAL.g:447:4: (otherlv_5= 'ADDRESS' | otherlv_6= 'address' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==28) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMAL.g:448:5: otherlv_5= 'ADDRESS'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getADDRESSKeyword_0_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:453:5: otherlv_6= 'address'
                            {
                            otherlv_6=(Token)match(input,28,FOLLOW_6); 

                            					newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getAddressKeyword_0_3_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:458:4: ( (lv_identifier_7_0= RULE_WRD ) )
                    // InternalMAL.g:459:5: (lv_identifier_7_0= RULE_WRD )
                    {
                    // InternalMAL.g:459:5: (lv_identifier_7_0= RULE_WRD )
                    // InternalMAL.g:460:6: lv_identifier_7_0= RULE_WRD
                    {
                    lv_identifier_7_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

                    						newLeafNode(lv_identifier_7_0, grammarAccess.getDefinitionAccess().getIdentifierWRDTerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"identifier",
                    							lv_identifier_7_0,
                    							"org.xtext.trabalho.MAL.WRD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:478:3: ( (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )? (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' ) ( (lv_header_12_0= ruleHeader ) ) (otherlv_13= 'ADDRESS' | otherlv_14= 'address' ) ( (lv_identifier_15_0= RULE_WRD ) ) )
                    {
                    // InternalMAL.g:478:3: ( (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )? (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' ) ( (lv_header_12_0= ruleHeader ) ) (otherlv_13= 'ADDRESS' | otherlv_14= 'address' ) ( (lv_identifier_15_0= RULE_WRD ) ) )
                    // InternalMAL.g:479:4: (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )? (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' ) ( (lv_header_12_0= ruleHeader ) ) (otherlv_13= 'ADDRESS' | otherlv_14= 'address' ) ( (lv_identifier_15_0= RULE_WRD ) )
                    {
                    // InternalMAL.g:479:4: (otherlv_8= 'UNSAFE' | otherlv_9= 'unsafe' )?
                    int alt15=3;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==24) ) {
                        alt15=2;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMAL.g:480:5: otherlv_8= 'UNSAFE'
                            {
                            otherlv_8=(Token)match(input,23,FOLLOW_11); 

                            					newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:485:5: otherlv_9= 'unsafe'
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_11); 

                            					newLeafNode(otherlv_9, grammarAccess.getDefinitionAccess().getUnsafeKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:490:4: (otherlv_10= 'PATTERN' | otherlv_11= 'pattern' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==29) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==30) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMAL.g:491:5: otherlv_10= 'PATTERN'
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_6); 

                            					newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getPATTERNKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:496:5: otherlv_11= 'pattern'
                            {
                            otherlv_11=(Token)match(input,30,FOLLOW_6); 

                            					newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getPatternKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:501:4: ( (lv_header_12_0= ruleHeader ) )
                    // InternalMAL.g:502:5: (lv_header_12_0= ruleHeader )
                    {
                    // InternalMAL.g:502:5: (lv_header_12_0= ruleHeader )
                    // InternalMAL.g:503:6: lv_header_12_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_header_12_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_12_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMAL.g:520:4: (otherlv_13= 'ADDRESS' | otherlv_14= 'address' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==28) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMAL.g:521:5: otherlv_13= 'ADDRESS'
                            {
                            otherlv_13=(Token)match(input,27,FOLLOW_6); 

                            					newLeafNode(otherlv_13, grammarAccess.getDefinitionAccess().getADDRESSKeyword_1_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:526:5: otherlv_14= 'address'
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_6); 

                            					newLeafNode(otherlv_14, grammarAccess.getDefinitionAccess().getAddressKeyword_1_3_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:531:4: ( (lv_identifier_15_0= RULE_WRD ) )
                    // InternalMAL.g:532:5: (lv_identifier_15_0= RULE_WRD )
                    {
                    // InternalMAL.g:532:5: (lv_identifier_15_0= RULE_WRD )
                    // InternalMAL.g:533:6: lv_identifier_15_0= RULE_WRD
                    {
                    lv_identifier_15_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

                    						newLeafNode(lv_identifier_15_0, grammarAccess.getDefinitionAccess().getIdentifierWRDTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"identifier",
                    							lv_identifier_15_0,
                    							"org.xtext.trabalho.MAL.WRD");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:551:3: ( ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )? (otherlv_20= 'FUNCTION' | otherlv_21= 'function' ) ( (lv_header_22_0= ruleHeader ) ) ( (lv_statements_23_0= ruleStatement ) )* (otherlv_24= 'END' | otherlv_25= 'end' ) ( (lv_function_name_26_0= ruleName ) ) )
                    {
                    // InternalMAL.g:551:3: ( ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )? (otherlv_20= 'FUNCTION' | otherlv_21= 'function' ) ( (lv_header_22_0= ruleHeader ) ) ( (lv_statements_23_0= ruleStatement ) )* (otherlv_24= 'END' | otherlv_25= 'end' ) ( (lv_function_name_26_0= ruleName ) ) )
                    // InternalMAL.g:552:4: ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )? (otherlv_20= 'FUNCTION' | otherlv_21= 'function' ) ( (lv_header_22_0= ruleHeader ) ) ( (lv_statements_23_0= ruleStatement ) )* (otherlv_24= 'END' | otherlv_25= 'end' ) ( (lv_function_name_26_0= ruleName ) )
                    {
                    // InternalMAL.g:552:4: ( (otherlv_16= 'INLINE' | otherlv_17= 'inline' ) | (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' ) )?
                    int alt20=3;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=31 && LA20_0<=32)) ) {
                        alt20=1;
                    }
                    else if ( ((LA20_0>=23 && LA20_0<=24)) ) {
                        alt20=2;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMAL.g:553:5: (otherlv_16= 'INLINE' | otherlv_17= 'inline' )
                            {
                            // InternalMAL.g:553:5: (otherlv_16= 'INLINE' | otherlv_17= 'inline' )
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==31) ) {
                                alt18=1;
                            }
                            else if ( (LA18_0==32) ) {
                                alt18=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 0, input);

                                throw nvae;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalMAL.g:554:6: otherlv_16= 'INLINE'
                                    {
                                    otherlv_16=(Token)match(input,31,FOLLOW_12); 

                                    						newLeafNode(otherlv_16, grammarAccess.getDefinitionAccess().getINLINEKeyword_2_0_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMAL.g:559:6: otherlv_17= 'inline'
                                    {
                                    otherlv_17=(Token)match(input,32,FOLLOW_12); 

                                    						newLeafNode(otherlv_17, grammarAccess.getDefinitionAccess().getInlineKeyword_2_0_0_1());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalMAL.g:565:5: (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' )
                            {
                            // InternalMAL.g:565:5: (otherlv_18= 'UNSAFE' | otherlv_19= 'unsafe' )
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==23) ) {
                                alt19=1;
                            }
                            else if ( (LA19_0==24) ) {
                                alt19=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 0, input);

                                throw nvae;
                            }
                            switch (alt19) {
                                case 1 :
                                    // InternalMAL.g:566:6: otherlv_18= 'UNSAFE'
                                    {
                                    otherlv_18=(Token)match(input,23,FOLLOW_12); 

                                    						newLeafNode(otherlv_18, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_2_0_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMAL.g:571:6: otherlv_19= 'unsafe'
                                    {
                                    otherlv_19=(Token)match(input,24,FOLLOW_12); 

                                    						newLeafNode(otherlv_19, grammarAccess.getDefinitionAccess().getUnsafeKeyword_2_0_1_1());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalMAL.g:577:4: (otherlv_20= 'FUNCTION' | otherlv_21= 'function' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==33) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==34) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMAL.g:578:5: otherlv_20= 'FUNCTION'
                            {
                            otherlv_20=(Token)match(input,33,FOLLOW_6); 

                            					newLeafNode(otherlv_20, grammarAccess.getDefinitionAccess().getFUNCTIONKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:583:5: otherlv_21= 'function'
                            {
                            otherlv_21=(Token)match(input,34,FOLLOW_6); 

                            					newLeafNode(otherlv_21, grammarAccess.getDefinitionAccess().getFunctionKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:588:4: ( (lv_header_22_0= ruleHeader ) )
                    // InternalMAL.g:589:5: (lv_header_22_0= ruleHeader )
                    {
                    // InternalMAL.g:589:5: (lv_header_22_0= ruleHeader )
                    // InternalMAL.g:590:6: lv_header_22_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_header_22_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_22_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMAL.g:607:4: ( (lv_statements_23_0= ruleStatement ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_WRD||(LA22_0>=16 && LA22_0<=19)||(LA22_0>=21 && LA22_0<=26)||(LA22_0>=29 && LA22_0<=34)||(LA22_0>=37 && LA22_0<=38)||LA22_0==41||(LA22_0>=52 && LA22_0<=63)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMAL.g:608:5: (lv_statements_23_0= ruleStatement )
                    	    {
                    	    // InternalMAL.g:608:5: (lv_statements_23_0= ruleStatement )
                    	    // InternalMAL.g:609:6: lv_statements_23_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_statements_23_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_23_0,
                    	    							"org.xtext.trabalho.MAL.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // InternalMAL.g:626:4: (otherlv_24= 'END' | otherlv_25= 'end' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==35) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==36) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMAL.g:627:5: otherlv_24= 'END'
                            {
                            otherlv_24=(Token)match(input,35,FOLLOW_6); 

                            					newLeafNode(otherlv_24, grammarAccess.getDefinitionAccess().getENDKeyword_2_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:632:5: otherlv_25= 'end'
                            {
                            otherlv_25=(Token)match(input,36,FOLLOW_6); 

                            					newLeafNode(otherlv_25, grammarAccess.getDefinitionAccess().getEndKeyword_2_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:637:4: ( (lv_function_name_26_0= ruleName ) )
                    // InternalMAL.g:638:5: (lv_function_name_26_0= ruleName )
                    {
                    // InternalMAL.g:638:5: (lv_function_name_26_0= ruleName )
                    // InternalMAL.g:639:6: lv_function_name_26_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getFunction_nameNameParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_function_name_26_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"function_name",
                    							lv_function_name_26_0,
                    							"org.xtext.trabalho.MAL.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:658:3: ( (otherlv_27= 'FACTORY' | otherlv_28= 'factory' ) ( (lv_header_29_0= ruleHeader ) ) ( (lv_statements_30_0= ruleStatement ) )* (otherlv_31= 'END' | otherlv_32= 'end' ) ( (lv_factory_name_33_0= ruleName ) ) )
                    {
                    // InternalMAL.g:658:3: ( (otherlv_27= 'FACTORY' | otherlv_28= 'factory' ) ( (lv_header_29_0= ruleHeader ) ) ( (lv_statements_30_0= ruleStatement ) )* (otherlv_31= 'END' | otherlv_32= 'end' ) ( (lv_factory_name_33_0= ruleName ) ) )
                    // InternalMAL.g:659:4: (otherlv_27= 'FACTORY' | otherlv_28= 'factory' ) ( (lv_header_29_0= ruleHeader ) ) ( (lv_statements_30_0= ruleStatement ) )* (otherlv_31= 'END' | otherlv_32= 'end' ) ( (lv_factory_name_33_0= ruleName ) )
                    {
                    // InternalMAL.g:659:4: (otherlv_27= 'FACTORY' | otherlv_28= 'factory' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==37) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==38) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMAL.g:660:5: otherlv_27= 'FACTORY'
                            {
                            otherlv_27=(Token)match(input,37,FOLLOW_6); 

                            					newLeafNode(otherlv_27, grammarAccess.getDefinitionAccess().getFACTORYKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:665:5: otherlv_28= 'factory'
                            {
                            otherlv_28=(Token)match(input,38,FOLLOW_6); 

                            					newLeafNode(otherlv_28, grammarAccess.getDefinitionAccess().getFactoryKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:670:4: ( (lv_header_29_0= ruleHeader ) )
                    // InternalMAL.g:671:5: (lv_header_29_0= ruleHeader )
                    {
                    // InternalMAL.g:671:5: (lv_header_29_0= ruleHeader )
                    // InternalMAL.g:672:6: lv_header_29_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_header_29_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_29_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMAL.g:689:4: ( (lv_statements_30_0= ruleStatement ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_WRD||(LA25_0>=16 && LA25_0<=19)||(LA25_0>=21 && LA25_0<=26)||(LA25_0>=29 && LA25_0<=34)||(LA25_0>=37 && LA25_0<=38)||LA25_0==41||(LA25_0>=52 && LA25_0<=63)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMAL.g:690:5: (lv_statements_30_0= ruleStatement )
                    	    {
                    	    // InternalMAL.g:690:5: (lv_statements_30_0= ruleStatement )
                    	    // InternalMAL.g:691:6: lv_statements_30_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_statements_30_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_30_0,
                    	    							"org.xtext.trabalho.MAL.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // InternalMAL.g:708:4: (otherlv_31= 'END' | otherlv_32= 'end' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==35) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==36) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMAL.g:709:5: otherlv_31= 'END'
                            {
                            otherlv_31=(Token)match(input,35,FOLLOW_6); 

                            					newLeafNode(otherlv_31, grammarAccess.getDefinitionAccess().getENDKeyword_3_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:714:5: otherlv_32= 'end'
                            {
                            otherlv_32=(Token)match(input,36,FOLLOW_6); 

                            					newLeafNode(otherlv_32, grammarAccess.getDefinitionAccess().getEndKeyword_3_3_1());
                            				

                            }
                            break;

                    }

                    // InternalMAL.g:719:4: ( (lv_factory_name_33_0= ruleName ) )
                    // InternalMAL.g:720:5: (lv_factory_name_33_0= ruleName )
                    {
                    // InternalMAL.g:720:5: (lv_factory_name_33_0= ruleName )
                    // InternalMAL.g:721:6: lv_factory_name_33_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getFactory_nameNameParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_factory_name_33_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"factory_name",
                    							lv_factory_name_33_0,
                    							"org.xtext.trabalho.MAL.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleHelpinfo"
    // InternalMAL.g:743:1: entryRuleHelpinfo returns [EObject current=null] : iv_ruleHelpinfo= ruleHelpinfo EOF ;
    public final EObject entryRuleHelpinfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpinfo = null;


        try {
            // InternalMAL.g:743:49: (iv_ruleHelpinfo= ruleHelpinfo EOF )
            // InternalMAL.g:744:2: iv_ruleHelpinfo= ruleHelpinfo EOF
            {
             newCompositeNode(grammarAccess.getHelpinfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHelpinfo=ruleHelpinfo();

            state._fsp--;

             current =iv_ruleHelpinfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHelpinfo"


    // $ANTLR start "ruleHelpinfo"
    // InternalMAL.g:750:1: ruleHelpinfo returns [EObject current=null] : ( (otherlv_0= 'COMMENT' | otherlv_1= 'comment' ) ( (lv_string_literal_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHelpinfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_literal_2_0=null;


        	enterRule();

        try {
            // InternalMAL.g:756:2: ( ( (otherlv_0= 'COMMENT' | otherlv_1= 'comment' ) ( (lv_string_literal_2_0= RULE_STRING ) ) ) )
            // InternalMAL.g:757:2: ( (otherlv_0= 'COMMENT' | otherlv_1= 'comment' ) ( (lv_string_literal_2_0= RULE_STRING ) ) )
            {
            // InternalMAL.g:757:2: ( (otherlv_0= 'COMMENT' | otherlv_1= 'comment' ) ( (lv_string_literal_2_0= RULE_STRING ) ) )
            // InternalMAL.g:758:3: (otherlv_0= 'COMMENT' | otherlv_1= 'comment' ) ( (lv_string_literal_2_0= RULE_STRING ) )
            {
            // InternalMAL.g:758:3: (otherlv_0= 'COMMENT' | otherlv_1= 'comment' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            else if ( (LA28_0==40) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMAL.g:759:4: otherlv_0= 'COMMENT'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getHelpinfoAccess().getCOMMENTKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMAL.g:764:4: otherlv_1= 'comment'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelpinfoAccess().getCommentKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMAL.g:769:3: ( (lv_string_literal_2_0= RULE_STRING ) )
            // InternalMAL.g:770:4: (lv_string_literal_2_0= RULE_STRING )
            {
            // InternalMAL.g:770:4: (lv_string_literal_2_0= RULE_STRING )
            // InternalMAL.g:771:5: lv_string_literal_2_0= RULE_STRING
            {
            lv_string_literal_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_string_literal_2_0, grammarAccess.getHelpinfoAccess().getString_literalSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHelpinfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string_literal",
            						lv_string_literal_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHelpinfo"


    // $ANTLR start "entryRuleHeader"
    // InternalMAL.g:791:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalMAL.g:791:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalMAL.g:792:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMAL.g:798:1: ruleHeader returns [EObject current=null] : ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_header_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_return_type_4_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:804:2: ( ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) ) )
            // InternalMAL.g:805:2: ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) )
            {
            // InternalMAL.g:805:2: ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) )
            // InternalMAL.g:806:3: ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) )
            {
            // InternalMAL.g:806:3: ( (lv_header_name_0_0= ruleName ) )
            // InternalMAL.g:807:4: (lv_header_name_0_0= ruleName )
            {
            // InternalMAL.g:807:4: (lv_header_name_0_0= ruleName )
            // InternalMAL.g:808:5: lv_header_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getHeader_nameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_header_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"header_name",
            						lv_header_name_0_0,
            						"org.xtext.trabalho.MAL.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMAL.g:829:3: ( (lv_params_2_0= ruleParams ) )
            // InternalMAL.g:830:4: (lv_params_2_0= ruleParams )
            {
            // InternalMAL.g:830:4: (lv_params_2_0= ruleParams )
            // InternalMAL.g:831:5: lv_params_2_0= ruleParams
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getParamsParamsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_params_2_0=ruleParams();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"params",
            						lv_params_2_0,
            						"org.xtext.trabalho.MAL.Params");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3());
            		
            // InternalMAL.g:852:3: ( (lv_return_type_4_0= ruleResult ) )
            // InternalMAL.g:853:4: (lv_return_type_4_0= ruleResult )
            {
            // InternalMAL.g:853:4: (lv_return_type_4_0= ruleResult )
            // InternalMAL.g:854:5: lv_return_type_4_0= ruleResult
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getReturn_typeResultParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_return_type_4_0=ruleResult();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"return_type",
            						lv_return_type_4_0,
            						"org.xtext.trabalho.MAL.Result");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleName"
    // InternalMAL.g:875:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalMAL.g:875:45: (iv_ruleName= ruleName EOF )
            // InternalMAL.g:876:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMAL.g:882:1: ruleName returns [EObject current=null] : ( (this_ModuleName_0= ruleModuleName otherlv_1= '.' )? ( (lv_id_2_0= RULE_WRD ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        EObject this_ModuleName_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:888:2: ( ( (this_ModuleName_0= ruleModuleName otherlv_1= '.' )? ( (lv_id_2_0= RULE_WRD ) ) ) )
            // InternalMAL.g:889:2: ( (this_ModuleName_0= ruleModuleName otherlv_1= '.' )? ( (lv_id_2_0= RULE_WRD ) ) )
            {
            // InternalMAL.g:889:2: ( (this_ModuleName_0= ruleModuleName otherlv_1= '.' )? ( (lv_id_2_0= RULE_WRD ) ) )
            // InternalMAL.g:890:3: (this_ModuleName_0= ruleModuleName otherlv_1= '.' )? ( (lv_id_2_0= RULE_WRD ) )
            {
            // InternalMAL.g:890:3: (this_ModuleName_0= ruleModuleName otherlv_1= '.' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_WRD) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==43) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalMAL.g:891:4: this_ModuleName_0= ruleModuleName otherlv_1= '.'
                    {

                    				newCompositeNode(grammarAccess.getNameAccess().getModuleNameParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_ModuleName_0=ruleModuleName();

                    state._fsp--;


                    				current = this_ModuleName_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getNameAccess().getFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMAL.g:904:3: ( (lv_id_2_0= RULE_WRD ) )
            // InternalMAL.g:905:4: (lv_id_2_0= RULE_WRD )
            {
            // InternalMAL.g:905:4: (lv_id_2_0= RULE_WRD )
            // InternalMAL.g:906:5: lv_id_2_0= RULE_WRD
            {
            lv_id_2_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

            					newLeafNode(lv_id_2_0, grammarAccess.getNameAccess().getIdWRDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.trabalho.MAL.WRD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleResult"
    // InternalMAL.g:926:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalMAL.g:926:47: (iv_ruleResult= ruleResult EOF )
            // InternalMAL.g:927:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalMAL.g:933:1: ruleResult returns [EObject current=null] : (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TypeName_0 = null;

        EObject this_Params_2 = null;



        	enterRule();

        try {
            // InternalMAL.g:939:2: ( (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) ) )
            // InternalMAL.g:940:2: (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) )
            {
            // InternalMAL.g:940:2: (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            else if ( (LA30_0==41) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMAL.g:941:3: this_TypeName_0= ruleTypeName
                    {

                    			newCompositeNode(grammarAccess.getResultAccess().getTypeNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeName_0=ruleTypeName();

                    state._fsp--;


                    			current = this_TypeName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:950:3: (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' )
                    {
                    // InternalMAL.g:950:3: (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' )
                    // InternalMAL.g:951:4: otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getResultAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getResultAccess().getParamsParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Params_2=ruleParams();

                    state._fsp--;


                    				current = this_Params_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getResultAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParams"
    // InternalMAL.g:972:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalMAL.g:972:47: (iv_ruleParams= ruleParams EOF )
            // InternalMAL.g:973:2: iv_ruleParams= ruleParams EOF
            {
             newCompositeNode(grammarAccess.getParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParams=ruleParams();

            state._fsp--;

             current =iv_ruleParams; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalMAL.g:979:1: ruleParams returns [EObject current=null] : ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bind_0_0 = null;

        EObject lv_bind_2_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:985:2: ( ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* ) )
            // InternalMAL.g:986:2: ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* )
            {
            // InternalMAL.g:986:2: ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* )
            // InternalMAL.g:987:3: ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )*
            {
            // InternalMAL.g:987:3: ( (lv_bind_0_0= ruleBinding ) )
            // InternalMAL.g:988:4: (lv_bind_0_0= ruleBinding )
            {
            // InternalMAL.g:988:4: (lv_bind_0_0= ruleBinding )
            // InternalMAL.g:989:5: lv_bind_0_0= ruleBinding
            {

            					newCompositeNode(grammarAccess.getParamsAccess().getBindBindingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_bind_0_0=ruleBinding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamsRule());
            					}
            					add(
            						current,
            						"bind",
            						lv_bind_0_0,
            						"org.xtext.trabalho.MAL.Binding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMAL.g:1006:3: (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMAL.g:1007:4: otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMAL.g:1011:4: ( (lv_bind_2_0= ruleBinding ) )
            	    // InternalMAL.g:1012:5: (lv_bind_2_0= ruleBinding )
            	    {
            	    // InternalMAL.g:1012:5: (lv_bind_2_0= ruleBinding )
            	    // InternalMAL.g:1013:6: lv_bind_2_0= ruleBinding
            	    {

            	    						newCompositeNode(grammarAccess.getParamsAccess().getBindBindingParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_bind_2_0=ruleBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParamsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bind",
            	    							lv_bind_2_0,
            	    							"org.xtext.trabalho.MAL.Binding");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleBinding"
    // InternalMAL.g:1035:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMAL.g:1035:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMAL.g:1036:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalMAL.g:1042:1: ruleBinding returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_WRD ) ) ( (lv_type_1_0= ruleTypeName ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1048:2: ( ( ( (lv_identifier_0_0= RULE_WRD ) ) ( (lv_type_1_0= ruleTypeName ) ) ) )
            // InternalMAL.g:1049:2: ( ( (lv_identifier_0_0= RULE_WRD ) ) ( (lv_type_1_0= ruleTypeName ) ) )
            {
            // InternalMAL.g:1049:2: ( ( (lv_identifier_0_0= RULE_WRD ) ) ( (lv_type_1_0= ruleTypeName ) ) )
            // InternalMAL.g:1050:3: ( (lv_identifier_0_0= RULE_WRD ) ) ( (lv_type_1_0= ruleTypeName ) )
            {
            // InternalMAL.g:1050:3: ( (lv_identifier_0_0= RULE_WRD ) )
            // InternalMAL.g:1051:4: (lv_identifier_0_0= RULE_WRD )
            {
            // InternalMAL.g:1051:4: (lv_identifier_0_0= RULE_WRD )
            // InternalMAL.g:1052:5: lv_identifier_0_0= RULE_WRD
            {
            lv_identifier_0_0=(Token)match(input,RULE_WRD,FOLLOW_19); 

            					newLeafNode(lv_identifier_0_0, grammarAccess.getBindingAccess().getIdentifierWRDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"org.xtext.trabalho.MAL.WRD");
            				

            }


            }

            // InternalMAL.g:1068:3: ( (lv_type_1_0= ruleTypeName ) )
            // InternalMAL.g:1069:4: (lv_type_1_0= ruleTypeName )
            {
            // InternalMAL.g:1069:4: (lv_type_1_0= ruleTypeName )
            // InternalMAL.g:1070:5: lv_type_1_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getTypeTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.trabalho.MAL.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleTypeName"
    // InternalMAL.g:1091:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalMAL.g:1091:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMAL.g:1092:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalMAL.g:1098:1: ruleTypeName returns [EObject current=null] : (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ScalarType_0 = null;

        EObject this_ColumnType_1 = null;

        EObject this_AnyType_3 = null;



        	enterRule();

        try {
            // InternalMAL.g:1104:2: ( (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) ) )
            // InternalMAL.g:1105:2: (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) )
            {
            // InternalMAL.g:1105:2: (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt32=3;
                    }
                    break;
                case 45:
                case 46:
                    {
                    alt32=2;
                    }
                    break;
                case RULE_WRD:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMAL.g:1106:3: this_ScalarType_0= ruleScalarType
                    {

                    			newCompositeNode(grammarAccess.getTypeNameAccess().getScalarTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarType_0=ruleScalarType();

                    state._fsp--;


                    			current = this_ScalarType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1115:3: this_ColumnType_1= ruleColumnType
                    {

                    			newCompositeNode(grammarAccess.getTypeNameAccess().getColumnTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnType_1=ruleColumnType();

                    state._fsp--;


                    			current = this_ColumnType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMAL.g:1124:3: (otherlv_2= ':' this_AnyType_3= ruleAnyType )
                    {
                    // InternalMAL.g:1124:3: (otherlv_2= ':' this_AnyType_3= ruleAnyType )
                    // InternalMAL.g:1125:4: otherlv_2= ':' this_AnyType_3= ruleAnyType
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeNameAccess().getColonKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getTypeNameAccess().getAnyTypeParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_AnyType_3=ruleAnyType();

                    state._fsp--;


                    				current = this_AnyType_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleScalarType"
    // InternalMAL.g:1142:1: entryRuleScalarType returns [EObject current=null] : iv_ruleScalarType= ruleScalarType EOF ;
    public final EObject entryRuleScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarType = null;


        try {
            // InternalMAL.g:1142:51: (iv_ruleScalarType= ruleScalarType EOF )
            // InternalMAL.g:1143:2: iv_ruleScalarType= ruleScalarType EOF
            {
             newCompositeNode(grammarAccess.getScalarTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarType=ruleScalarType();

            state._fsp--;

             current =iv_ruleScalarType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarType"


    // $ANTLR start "ruleScalarType"
    // InternalMAL.g:1149:1: ruleScalarType returns [EObject current=null] : (otherlv_0= ':' ( (lv_identifier_1_0= RULE_WRD ) ) ) ;
    public final EObject ruleScalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1155:2: ( (otherlv_0= ':' ( (lv_identifier_1_0= RULE_WRD ) ) ) )
            // InternalMAL.g:1156:2: (otherlv_0= ':' ( (lv_identifier_1_0= RULE_WRD ) ) )
            {
            // InternalMAL.g:1156:2: (otherlv_0= ':' ( (lv_identifier_1_0= RULE_WRD ) ) )
            // InternalMAL.g:1157:3: otherlv_0= ':' ( (lv_identifier_1_0= RULE_WRD ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarTypeAccess().getColonKeyword_0());
            		
            // InternalMAL.g:1161:3: ( (lv_identifier_1_0= RULE_WRD ) )
            // InternalMAL.g:1162:4: (lv_identifier_1_0= RULE_WRD )
            {
            // InternalMAL.g:1162:4: (lv_identifier_1_0= RULE_WRD )
            // InternalMAL.g:1163:5: lv_identifier_1_0= RULE_WRD
            {
            lv_identifier_1_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

            					newLeafNode(lv_identifier_1_0, grammarAccess.getScalarTypeAccess().getIdentifierWRDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"org.xtext.trabalho.MAL.WRD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarType"


    // $ANTLR start "entryRuleColumnType"
    // InternalMAL.g:1183:1: entryRuleColumnType returns [EObject current=null] : iv_ruleColumnType= ruleColumnType EOF ;
    public final EObject entryRuleColumnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnType = null;


        try {
            // InternalMAL.g:1183:51: (iv_ruleColumnType= ruleColumnType EOF )
            // InternalMAL.g:1184:2: iv_ruleColumnType= ruleColumnType EOF
            {
             newCompositeNode(grammarAccess.getColumnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnType=ruleColumnType();

            state._fsp--;

             current =iv_ruleColumnType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnType"


    // $ANTLR start "ruleColumnType"
    // InternalMAL.g:1190:1: ruleColumnType returns [EObject current=null] : (otherlv_0= ':' (otherlv_1= 'BAT' | otherlv_2= 'bat' ) otherlv_3= '[' otherlv_4= ':' this_ColElmType_5= ruleColElmType otherlv_6= ']' ) ;
    public final EObject ruleColumnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ColElmType_5 = null;



        	enterRule();

        try {
            // InternalMAL.g:1196:2: ( (otherlv_0= ':' (otherlv_1= 'BAT' | otherlv_2= 'bat' ) otherlv_3= '[' otherlv_4= ':' this_ColElmType_5= ruleColElmType otherlv_6= ']' ) )
            // InternalMAL.g:1197:2: (otherlv_0= ':' (otherlv_1= 'BAT' | otherlv_2= 'bat' ) otherlv_3= '[' otherlv_4= ':' this_ColElmType_5= ruleColElmType otherlv_6= ']' )
            {
            // InternalMAL.g:1197:2: (otherlv_0= ':' (otherlv_1= 'BAT' | otherlv_2= 'bat' ) otherlv_3= '[' otherlv_4= ':' this_ColElmType_5= ruleColElmType otherlv_6= ']' )
            // InternalMAL.g:1198:3: otherlv_0= ':' (otherlv_1= 'BAT' | otherlv_2= 'bat' ) otherlv_3= '[' otherlv_4= ':' this_ColElmType_5= ruleColElmType otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnTypeAccess().getColonKeyword_0());
            		
            // InternalMAL.g:1202:3: (otherlv_1= 'BAT' | otherlv_2= 'bat' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            else if ( (LA33_0==46) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMAL.g:1203:4: otherlv_1= 'BAT'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnTypeAccess().getBATKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1208:4: otherlv_2= 'bat'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getColumnTypeAccess().getBatKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,47,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnTypeAccess().getLeftSquareBracketKeyword_2());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnTypeAccess().getColonKeyword_3());
            		

            			newCompositeNode(grammarAccess.getColumnTypeAccess().getColElmTypeParserRuleCall_4());
            		
            pushFollow(FOLLOW_24);
            this_ColElmType_5=ruleColElmType();

            state._fsp--;


            			current = this_ColElmType_5;
            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getColumnTypeAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "entryRuleColElmType"
    // InternalMAL.g:1237:1: entryRuleColElmType returns [EObject current=null] : iv_ruleColElmType= ruleColElmType EOF ;
    public final EObject entryRuleColElmType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColElmType = null;


        try {
            // InternalMAL.g:1237:51: (iv_ruleColElmType= ruleColElmType EOF )
            // InternalMAL.g:1238:2: iv_ruleColElmType= ruleColElmType EOF
            {
             newCompositeNode(grammarAccess.getColElmTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColElmType=ruleColElmType();

            state._fsp--;

             current =iv_ruleColElmType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColElmType"


    // $ANTLR start "ruleColElmType"
    // InternalMAL.g:1244:1: ruleColElmType returns [EObject current=null] : (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType ) ;
    public final EObject ruleColElmType() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarType_0 = null;

        EObject this_AnyType_1 = null;



        	enterRule();

        try {
            // InternalMAL.g:1250:2: ( (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType ) )
            // InternalMAL.g:1251:2: (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType )
            {
            // InternalMAL.g:1251:2: (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            else if ( (LA34_0==49) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMAL.g:1252:3: this_ScalarType_0= ruleScalarType
                    {

                    			newCompositeNode(grammarAccess.getColElmTypeAccess().getScalarTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarType_0=ruleScalarType();

                    state._fsp--;


                    			current = this_ScalarType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1261:3: this_AnyType_1= ruleAnyType
                    {

                    			newCompositeNode(grammarAccess.getColElmTypeAccess().getAnyTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyType_1=ruleAnyType();

                    state._fsp--;


                    			current = this_AnyType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColElmType"


    // $ANTLR start "entryRuleAnyType"
    // InternalMAL.g:1273:1: entryRuleAnyType returns [EObject current=null] : iv_ruleAnyType= ruleAnyType EOF ;
    public final EObject entryRuleAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyType = null;


        try {
            // InternalMAL.g:1273:48: (iv_ruleAnyType= ruleAnyType EOF )
            // InternalMAL.g:1274:2: iv_ruleAnyType= ruleAnyType EOF
            {
             newCompositeNode(grammarAccess.getAnyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyType=ruleAnyType();

            state._fsp--;

             current =iv_ruleAnyType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyType"


    // $ANTLR start "ruleAnyType"
    // InternalMAL.g:1280:1: ruleAnyType returns [EObject current=null] : ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_WRD ) ) )? ) ;
    public final EObject ruleAnyType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_digit_2_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1286:2: ( ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_WRD ) ) )? ) )
            // InternalMAL.g:1287:2: ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_WRD ) ) )? )
            {
            // InternalMAL.g:1287:2: ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_WRD ) ) )? )
            // InternalMAL.g:1288:3: ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_WRD ) ) )?
            {
            // InternalMAL.g:1288:3: ( (lv_type_0_0= 'any' ) )
            // InternalMAL.g:1289:4: (lv_type_0_0= 'any' )
            {
            // InternalMAL.g:1289:4: (lv_type_0_0= 'any' )
            // InternalMAL.g:1290:5: lv_type_0_0= 'any'
            {
            lv_type_0_0=(Token)match(input,49,FOLLOW_25); 

            					newLeafNode(lv_type_0_0, grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnyTypeRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "any");
            				

            }


            }

            // InternalMAL.g:1302:3: (otherlv_1= '_' ( (lv_digit_2_0= RULE_WRD ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMAL.g:1303:4: otherlv_1= '_' ( (lv_digit_2_0= RULE_WRD ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getAnyTypeAccess().get_Keyword_1_0());
                    			
                    // InternalMAL.g:1307:4: ( (lv_digit_2_0= RULE_WRD ) )
                    // InternalMAL.g:1308:5: (lv_digit_2_0= RULE_WRD )
                    {
                    // InternalMAL.g:1308:5: (lv_digit_2_0= RULE_WRD )
                    // InternalMAL.g:1309:6: lv_digit_2_0= RULE_WRD
                    {
                    lv_digit_2_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

                    						newLeafNode(lv_digit_2_0, grammarAccess.getAnyTypeAccess().getDigitWRDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnyTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"digit",
                    							lv_digit_2_0,
                    							"org.xtext.trabalho.MAL.WRD");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyType"


    // $ANTLR start "entryRuleStmt"
    // InternalMAL.g:1330:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMAL.g:1330:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMAL.g:1331:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMAL.g:1337:1: ruleStmt returns [EObject current=null] : ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_flow_0_0 = null;

        EObject lv_list_of_variables_1_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1343:2: ( ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? ) )
            // InternalMAL.g:1344:2: ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? )
            {
            // InternalMAL.g:1344:2: ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )? )
            // InternalMAL.g:1345:3: ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )?
            {
            // InternalMAL.g:1345:3: ( (lv_flow_0_0= ruleFlow ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=52 && LA36_0<=63)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMAL.g:1346:4: (lv_flow_0_0= ruleFlow )
                    {
                    // InternalMAL.g:1346:4: (lv_flow_0_0= ruleFlow )
                    // InternalMAL.g:1347:5: lv_flow_0_0= ruleFlow
                    {

                    					newCompositeNode(grammarAccess.getStmtAccess().getFlowFlowParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_flow_0_0=ruleFlow();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStmtRule());
                    					}
                    					set(
                    						current,
                    						"flow",
                    						true,
                    						"org.xtext.trabalho.MAL.Flow");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMAL.g:1364:3: ( (lv_list_of_variables_1_0= ruleVarlist ) )
            // InternalMAL.g:1365:4: (lv_list_of_variables_1_0= ruleVarlist )
            {
            // InternalMAL.g:1365:4: (lv_list_of_variables_1_0= ruleVarlist )
            // InternalMAL.g:1366:5: lv_list_of_variables_1_0= ruleVarlist
            {

            					newCompositeNode(grammarAccess.getStmtAccess().getList_of_variablesVarlistParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_list_of_variables_1_0=ruleVarlist();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStmtRule());
            					}
            					set(
            						current,
            						"list_of_variables",
            						lv_list_of_variables_1_0,
            						"org.xtext.trabalho.MAL.Varlist");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMAL.g:1383:3: (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMAL.g:1384:4: otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getStmtAccess().getColonEqualsSignKeyword_2_0());
                    			
                    // InternalMAL.g:1388:4: ( (lv_exp_3_0= ruleExpr ) )
                    // InternalMAL.g:1389:5: (lv_exp_3_0= ruleExpr )
                    {
                    // InternalMAL.g:1389:5: (lv_exp_3_0= ruleExpr )
                    // InternalMAL.g:1390:6: lv_exp_3_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getStmtAccess().getExpExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_3_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStmtRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_3_0,
                    							"org.xtext.trabalho.MAL.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleFlow"
    // InternalMAL.g:1412:1: entryRuleFlow returns [String current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final String entryRuleFlow() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlow = null;


        try {
            // InternalMAL.g:1412:44: (iv_ruleFlow= ruleFlow EOF )
            // InternalMAL.g:1413:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // InternalMAL.g:1419:1: ruleFlow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'RETURN' | kw= 'return' ) | (kw= 'BARRIER' | kw= 'barrier' ) | (kw= 'CATCH' | kw= 'catch' ) | (kw= 'LEAVE' | kw= 'leave' ) | (kw= 'REDO' | kw= 'redo' ) | (kw= 'RAISE' | kw= 'raise' ) ) ;
    public final AntlrDatatypeRuleToken ruleFlow() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMAL.g:1425:2: ( ( (kw= 'RETURN' | kw= 'return' ) | (kw= 'BARRIER' | kw= 'barrier' ) | (kw= 'CATCH' | kw= 'catch' ) | (kw= 'LEAVE' | kw= 'leave' ) | (kw= 'REDO' | kw= 'redo' ) | (kw= 'RAISE' | kw= 'raise' ) ) )
            // InternalMAL.g:1426:2: ( (kw= 'RETURN' | kw= 'return' ) | (kw= 'BARRIER' | kw= 'barrier' ) | (kw= 'CATCH' | kw= 'catch' ) | (kw= 'LEAVE' | kw= 'leave' ) | (kw= 'REDO' | kw= 'redo' ) | (kw= 'RAISE' | kw= 'raise' ) )
            {
            // InternalMAL.g:1426:2: ( (kw= 'RETURN' | kw= 'return' ) | (kw= 'BARRIER' | kw= 'barrier' ) | (kw= 'CATCH' | kw= 'catch' ) | (kw= 'LEAVE' | kw= 'leave' ) | (kw= 'REDO' | kw= 'redo' ) | (kw= 'RAISE' | kw= 'raise' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
                {
                alt44=1;
                }
                break;
            case 54:
            case 55:
                {
                alt44=2;
                }
                break;
            case 56:
            case 57:
                {
                alt44=3;
                }
                break;
            case 58:
            case 59:
                {
                alt44=4;
                }
                break;
            case 60:
            case 61:
                {
                alt44=5;
                }
                break;
            case 62:
            case 63:
                {
                alt44=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMAL.g:1427:3: (kw= 'RETURN' | kw= 'return' )
                    {
                    // InternalMAL.g:1427:3: (kw= 'RETURN' | kw= 'return' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==52) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==53) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalMAL.g:1428:4: kw= 'RETURN'
                            {
                            kw=(Token)match(input,52,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getRETURNKeyword_0_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:1434:4: kw= 'return'
                            {
                            kw=(Token)match(input,53,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getReturnKeyword_0_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1441:3: (kw= 'BARRIER' | kw= 'barrier' )
                    {
                    // InternalMAL.g:1441:3: (kw= 'BARRIER' | kw= 'barrier' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==54) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==55) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMAL.g:1442:4: kw= 'BARRIER'
                            {
                            kw=(Token)match(input,54,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getBARRIERKeyword_1_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:1448:4: kw= 'barrier'
                            {
                            kw=(Token)match(input,55,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getBarrierKeyword_1_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1455:3: (kw= 'CATCH' | kw= 'catch' )
                    {
                    // InternalMAL.g:1455:3: (kw= 'CATCH' | kw= 'catch' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==56) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==57) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMAL.g:1456:4: kw= 'CATCH'
                            {
                            kw=(Token)match(input,56,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getCATCHKeyword_2_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:1462:4: kw= 'catch'
                            {
                            kw=(Token)match(input,57,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getCatchKeyword_2_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:1469:3: (kw= 'LEAVE' | kw= 'leave' )
                    {
                    // InternalMAL.g:1469:3: (kw= 'LEAVE' | kw= 'leave' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==58) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==59) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMAL.g:1470:4: kw= 'LEAVE'
                            {
                            kw=(Token)match(input,58,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getLEAVEKeyword_3_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:1476:4: kw= 'leave'
                            {
                            kw=(Token)match(input,59,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getLeaveKeyword_3_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalMAL.g:1483:3: (kw= 'REDO' | kw= 'redo' )
                    {
                    // InternalMAL.g:1483:3: (kw= 'REDO' | kw= 'redo' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==60) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==61) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMAL.g:1484:4: kw= 'REDO'
                            {
                            kw=(Token)match(input,60,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getREDOKeyword_4_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:1490:4: kw= 'redo'
                            {
                            kw=(Token)match(input,61,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getRedoKeyword_4_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalMAL.g:1497:3: (kw= 'RAISE' | kw= 'raise' )
                    {
                    // InternalMAL.g:1497:3: (kw= 'RAISE' | kw= 'raise' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==62) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==63) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMAL.g:1498:4: kw= 'RAISE'
                            {
                            kw=(Token)match(input,62,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getRAISEKeyword_5_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:1504:4: kw= 'raise'
                            {
                            kw=(Token)match(input,63,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getFlowAccess().getRaiseKeyword_5_1());
                            			

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleVarlist"
    // InternalMAL.g:1514:1: entryRuleVarlist returns [EObject current=null] : iv_ruleVarlist= ruleVarlist EOF ;
    public final EObject entryRuleVarlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarlist = null;


        try {
            // InternalMAL.g:1514:48: (iv_ruleVarlist= ruleVarlist EOF )
            // InternalMAL.g:1515:2: iv_ruleVarlist= ruleVarlist EOF
            {
             newCompositeNode(grammarAccess.getVarlistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarlist=ruleVarlist();

            state._fsp--;

             current =iv_ruleVarlist; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarlist"


    // $ANTLR start "ruleVarlist"
    // InternalMAL.g:1521:1: ruleVarlist returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) ) ;
    public final EObject ruleVarlist() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_variables_4_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1527:2: ( ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) ) )
            // InternalMAL.g:1528:2: ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) )
            {
            // InternalMAL.g:1528:2: ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_WRD) ) {
                alt46=1;
            }
            else if ( (LA46_0==41) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMAL.g:1529:3: ( (lv_variables_0_0= ruleVariable ) )
                    {
                    // InternalMAL.g:1529:3: ( (lv_variables_0_0= ruleVariable ) )
                    // InternalMAL.g:1530:4: (lv_variables_0_0= ruleVariable )
                    {
                    // InternalMAL.g:1530:4: (lv_variables_0_0= ruleVariable )
                    // InternalMAL.g:1531:5: lv_variables_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variables_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarlistRule());
                    					}
                    					add(
                    						current,
                    						"variables",
                    						lv_variables_0_0,
                    						"org.xtext.trabalho.MAL.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1549:3: (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' )
                    {
                    // InternalMAL.g:1549:3: (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' )
                    // InternalMAL.g:1550:4: otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getVarlistAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMAL.g:1554:4: ( (lv_variables_2_0= ruleVariable ) )
                    // InternalMAL.g:1555:5: (lv_variables_2_0= ruleVariable )
                    {
                    // InternalMAL.g:1555:5: (lv_variables_2_0= ruleVariable )
                    // InternalMAL.g:1556:6: lv_variables_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_variables_2_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarlistRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_2_0,
                    							"org.xtext.trabalho.MAL.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMAL.g:1573:4: (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==44) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMAL.g:1574:5: otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,44,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVarlistAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMAL.g:1578:5: ( (lv_variables_4_0= ruleVariable ) )
                    	    // InternalMAL.g:1579:6: (lv_variables_4_0= ruleVariable )
                    	    {
                    	    // InternalMAL.g:1579:6: (lv_variables_4_0= ruleVariable )
                    	    // InternalMAL.g:1580:7: lv_variables_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_variables_4_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVarlistRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_4_0,
                    	    								"org.xtext.trabalho.MAL.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarlistAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarlist"


    // $ANTLR start "entryRuleVariable"
    // InternalMAL.g:1607:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMAL.g:1607:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMAL.g:1608:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMAL.g:1614:1: ruleVariable returns [EObject current=null] : ( (lv_identifier_0_0= RULE_WRD ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1620:2: ( ( (lv_identifier_0_0= RULE_WRD ) ) )
            // InternalMAL.g:1621:2: ( (lv_identifier_0_0= RULE_WRD ) )
            {
            // InternalMAL.g:1621:2: ( (lv_identifier_0_0= RULE_WRD ) )
            // InternalMAL.g:1622:3: (lv_identifier_0_0= RULE_WRD )
            {
            // InternalMAL.g:1622:3: (lv_identifier_0_0= RULE_WRD )
            // InternalMAL.g:1623:4: lv_identifier_0_0= RULE_WRD
            {
            lv_identifier_0_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

            				newLeafNode(lv_identifier_0_0, grammarAccess.getVariableAccess().getIdentifierWRDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"identifier",
            					lv_identifier_0_0,
            					"org.xtext.trabalho.MAL.WRD");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpr"
    // InternalMAL.g:1642:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalMAL.g:1642:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalMAL.g:1643:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMAL.g:1649:1: ruleExpr returns [EObject current=null] : (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Fcncall_0 = null;

        EObject lv_left_factor_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_factor_3_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1655:2: ( (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) ) )
            // InternalMAL.g:1656:2: (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) )
            {
            // InternalMAL.g:1656:2: (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_WRD) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||LA48_1==RULE_WRD||(LA48_1>=15 && LA48_1<=19)||(LA48_1>=21 && LA48_1<=26)||(LA48_1>=29 && LA48_1<=38)||LA48_1==41||(LA48_1>=52 && LA48_1<=67)) ) {
                    alt48=2;
                }
                else if ( (LA48_1==43) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_OID)||LA48_0==68) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalMAL.g:1657:3: this_Fcncall_0= ruleFcncall
                    {

                    			newCompositeNode(grammarAccess.getExprAccess().getFcncallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fcncall_0=ruleFcncall();

                    state._fsp--;


                    			current = this_Fcncall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1666:3: ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) )
                    {
                    // InternalMAL.g:1666:3: ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) )
                    // InternalMAL.g:1667:4: ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) )
                    {
                    // InternalMAL.g:1667:4: ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )?
                    int alt47=2;
                    alt47 = dfa47.predict(input);
                    switch (alt47) {
                        case 1 :
                            // InternalMAL.g:1668:5: ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) )
                            {
                            // InternalMAL.g:1668:5: ( (lv_left_factor_1_0= ruleFactor ) )
                            // InternalMAL.g:1669:6: (lv_left_factor_1_0= ruleFactor )
                            {
                            // InternalMAL.g:1669:6: (lv_left_factor_1_0= ruleFactor )
                            // InternalMAL.g:1670:7: lv_left_factor_1_0= ruleFactor
                            {

                            							newCompositeNode(grammarAccess.getExprAccess().getLeft_factorFactorParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_30);
                            lv_left_factor_1_0=ruleFactor();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getExprRule());
                            							}
                            							set(
                            								current,
                            								"left_factor",
                            								lv_left_factor_1_0,
                            								"org.xtext.trabalho.MAL.Factor");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMAL.g:1687:5: ( (lv_operator_2_0= ruleOperator ) )
                            // InternalMAL.g:1688:6: (lv_operator_2_0= ruleOperator )
                            {
                            // InternalMAL.g:1688:6: (lv_operator_2_0= ruleOperator )
                            // InternalMAL.g:1689:7: lv_operator_2_0= ruleOperator
                            {

                            							newCompositeNode(grammarAccess.getExprAccess().getOperatorOperatorParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_operator_2_0=ruleOperator();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getExprRule());
                            							}
                            							set(
                            								current,
                            								"operator",
                            								lv_operator_2_0,
                            								"org.xtext.trabalho.MAL.Operator");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMAL.g:1707:4: ( (lv_right_factor_3_0= ruleFactor ) )
                    // InternalMAL.g:1708:5: (lv_right_factor_3_0= ruleFactor )
                    {
                    // InternalMAL.g:1708:5: (lv_right_factor_3_0= ruleFactor )
                    // InternalMAL.g:1709:6: lv_right_factor_3_0= ruleFactor
                    {

                    						newCompositeNode(grammarAccess.getExprAccess().getRight_factorFactorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_factor_3_0=ruleFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprRule());
                    						}
                    						set(
                    							current,
                    							"right_factor",
                    							lv_right_factor_3_0,
                    							"org.xtext.trabalho.MAL.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOperator"
    // InternalMAL.g:1731:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalMAL.g:1731:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalMAL.g:1732:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMAL.g:1738:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMAL.g:1744:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalMAL.g:1745:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalMAL.g:1745:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt49=1;
                }
                break;
            case 65:
                {
                alt49=2;
                }
                break;
            case 66:
                {
                alt49=3;
                }
                break;
            case 67:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalMAL.g:1746:3: kw= '+'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1752:3: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMAL.g:1758:3: kw= '*'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMAL.g:1764:3: kw= '/'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleFactor"
    // InternalMAL.g:1773:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMAL.g:1773:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMAL.g:1774:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMAL.g:1780:1: ruleFactor returns [EObject current=null] : ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMAL.g:1786:2: ( ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) ) )
            // InternalMAL.g:1787:2: ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) )
            {
            // InternalMAL.g:1787:2: ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_WRD && LA50_0<=RULE_OID)) ) {
                alt50=1;
            }
            else if ( (LA50_0==68) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMAL.g:1788:3: ( () ruleLiteral_constant )
                    {
                    // InternalMAL.g:1788:3: ( () ruleLiteral_constant )
                    // InternalMAL.g:1789:4: () ruleLiteral_constant
                    {
                    // InternalMAL.g:1789:4: ()
                    // InternalMAL.g:1790:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getFactorAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getFactorAccess().getLiteral_constantParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLiteral_constant();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1805:3: ( () otherlv_3= 'NIL' )
                    {
                    // InternalMAL.g:1805:3: ( () otherlv_3= 'NIL' )
                    // InternalMAL.g:1806:4: () otherlv_3= 'NIL'
                    {
                    // InternalMAL.g:1806:4: ()
                    // InternalMAL.g:1807:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getFactorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,68,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getNILKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFcncall"
    // InternalMAL.g:1822:1: entryRuleFcncall returns [EObject current=null] : iv_ruleFcncall= ruleFcncall EOF ;
    public final EObject entryRuleFcncall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFcncall = null;


        try {
            // InternalMAL.g:1822:48: (iv_ruleFcncall= ruleFcncall EOF )
            // InternalMAL.g:1823:2: iv_ruleFcncall= ruleFcncall EOF
            {
             newCompositeNode(grammarAccess.getFcncallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFcncall=ruleFcncall();

            state._fsp--;

             current =iv_ruleFcncall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFcncall"


    // $ANTLR start "ruleFcncall"
    // InternalMAL.g:1829:1: ruleFcncall returns [EObject current=null] : ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' ) ;
    public final EObject ruleFcncall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_module_0_0 = null;

        EObject lv_function_name_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1835:2: ( ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' ) )
            // InternalMAL.g:1836:2: ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' )
            {
            // InternalMAL.g:1836:2: ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' )
            // InternalMAL.g:1837:3: ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')'
            {
            // InternalMAL.g:1837:3: ( (lv_module_0_0= ruleModuleName ) )
            // InternalMAL.g:1838:4: (lv_module_0_0= ruleModuleName )
            {
            // InternalMAL.g:1838:4: (lv_module_0_0= ruleModuleName )
            // InternalMAL.g:1839:5: lv_module_0_0= ruleModuleName
            {

            					newCompositeNode(grammarAccess.getFcncallAccess().getModuleModuleNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_module_0_0=ruleModuleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFcncallRule());
            					}
            					set(
            						current,
            						"module",
            						lv_module_0_0,
            						"org.xtext.trabalho.MAL.ModuleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFcncallAccess().getFullStopKeyword_1());
            		
            // InternalMAL.g:1860:3: ( (lv_function_name_2_0= ruleName ) )
            // InternalMAL.g:1861:4: (lv_function_name_2_0= ruleName )
            {
            // InternalMAL.g:1861:4: (lv_function_name_2_0= ruleName )
            // InternalMAL.g:1862:5: lv_function_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFcncallAccess().getFunction_nameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_function_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFcncallRule());
            					}
            					set(
            						current,
            						"function_name",
            						lv_function_name_2_0,
            						"org.xtext.trabalho.MAL.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getFcncallAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMAL.g:1883:3: ( (lv_args_4_0= ruleArgs ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_WRD && LA51_0<=RULE_OID)||LA51_0==68) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMAL.g:1884:4: (lv_args_4_0= ruleArgs )
                    {
                    // InternalMAL.g:1884:4: (lv_args_4_0= ruleArgs )
                    // InternalMAL.g:1885:5: lv_args_4_0= ruleArgs
                    {

                    					newCompositeNode(grammarAccess.getFcncallAccess().getArgsArgsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_args_4_0=ruleArgs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFcncallRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						true,
                    						"org.xtext.trabalho.MAL.Args");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFcncallAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFcncall"


    // $ANTLR start "entryRuleArgs"
    // InternalMAL.g:1910:1: entryRuleArgs returns [EObject current=null] : iv_ruleArgs= ruleArgs EOF ;
    public final EObject entryRuleArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgs = null;


        try {
            // InternalMAL.g:1910:45: (iv_ruleArgs= ruleArgs EOF )
            // InternalMAL.g:1911:2: iv_ruleArgs= ruleArgs EOF
            {
             newCompositeNode(grammarAccess.getArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgs=ruleArgs();

            state._fsp--;

             current =iv_ruleArgs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgs"


    // $ANTLR start "ruleArgs"
    // InternalMAL.g:1917:1: ruleArgs returns [EObject current=null] : (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* ) ;
    public final EObject ruleArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Factor_0 = null;

        EObject lv_factor1_2_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1923:2: ( (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* ) )
            // InternalMAL.g:1924:2: (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* )
            {
            // InternalMAL.g:1924:2: (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* )
            // InternalMAL.g:1925:3: this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getArgsAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMAL.g:1933:3: (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==44) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMAL.g:1934:4: otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_28); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMAL.g:1938:4: ( (lv_factor1_2_0= ruleFactor ) )
            	    // InternalMAL.g:1939:5: (lv_factor1_2_0= ruleFactor )
            	    {
            	    // InternalMAL.g:1939:5: (lv_factor1_2_0= ruleFactor )
            	    // InternalMAL.g:1940:6: lv_factor1_2_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getArgsAccess().getFactor1FactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_factor1_2_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArgsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factor1",
            	    							lv_factor1_2_0,
            	    							"org.xtext.trabalho.MAL.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgs"


    // $ANTLR start "entryRuleModuleName"
    // InternalMAL.g:1962:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // InternalMAL.g:1962:51: (iv_ruleModuleName= ruleModuleName EOF )
            // InternalMAL.g:1963:2: iv_ruleModuleName= ruleModuleName EOF
            {
             newCompositeNode(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleName=ruleModuleName();

            state._fsp--;

             current =iv_ruleModuleName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleName"


    // $ANTLR start "ruleModuleName"
    // InternalMAL.g:1969:1: ruleModuleName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_WRD ) ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1975:2: ( ( (lv_identifier_0_0= RULE_WRD ) ) )
            // InternalMAL.g:1976:2: ( (lv_identifier_0_0= RULE_WRD ) )
            {
            // InternalMAL.g:1976:2: ( (lv_identifier_0_0= RULE_WRD ) )
            // InternalMAL.g:1977:3: (lv_identifier_0_0= RULE_WRD )
            {
            // InternalMAL.g:1977:3: (lv_identifier_0_0= RULE_WRD )
            // InternalMAL.g:1978:4: lv_identifier_0_0= RULE_WRD
            {
            lv_identifier_0_0=(Token)match(input,RULE_WRD,FOLLOW_2); 

            				newLeafNode(lv_identifier_0_0, grammarAccess.getModuleNameAccess().getIdentifierWRDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModuleNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"identifier",
            					lv_identifier_0_0,
            					"org.xtext.trabalho.MAL.WRD");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleName"


    // $ANTLR start "entryRuleLiteral_constant"
    // InternalMAL.g:1997:1: entryRuleLiteral_constant returns [String current=null] : iv_ruleLiteral_constant= ruleLiteral_constant EOF ;
    public final String entryRuleLiteral_constant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral_constant = null;


        try {
            // InternalMAL.g:1997:56: (iv_ruleLiteral_constant= ruleLiteral_constant EOF )
            // InternalMAL.g:1998:2: iv_ruleLiteral_constant= ruleLiteral_constant EOF
            {
             newCompositeNode(grammarAccess.getLiteral_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral_constant=ruleLiteral_constant();

            state._fsp--;

             current =iv_ruleLiteral_constant.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral_constant"


    // $ANTLR start "ruleLiteral_constant"
    // InternalMAL.g:2004:1: ruleLiteral_constant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR ) ;
    public final AntlrDatatypeRuleToken ruleLiteral_constant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIT_0=null;
        Token this_CHR_2=null;
        Token this_WRD_3=null;
        Token this_INT_4=null;
        Token this_OID_5=null;
        AntlrDatatypeRuleToken this_Bte_1 = null;

        AntlrDatatypeRuleToken this_FLT_6 = null;

        AntlrDatatypeRuleToken this_STR_7 = null;



        	enterRule();

        try {
            // InternalMAL.g:2010:2: ( (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR ) )
            // InternalMAL.g:2011:2: (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR )
            {
            // InternalMAL.g:2011:2: (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR )
            int alt53=8;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalMAL.g:2012:3: this_BIT_0= RULE_BIT
                    {
                    this_BIT_0=(Token)match(input,RULE_BIT,FOLLOW_2); 

                    			current.merge(this_BIT_0);
                    		

                    			newLeafNode(this_BIT_0, grammarAccess.getLiteral_constantAccess().getBITTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:2020:3: this_Bte_1= ruleBte
                    {

                    			newCompositeNode(grammarAccess.getLiteral_constantAccess().getBteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bte_1=ruleBte();

                    state._fsp--;


                    			current.merge(this_Bte_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMAL.g:2031:3: this_CHR_2= RULE_CHR
                    {
                    this_CHR_2=(Token)match(input,RULE_CHR,FOLLOW_2); 

                    			current.merge(this_CHR_2);
                    		

                    			newLeafNode(this_CHR_2, grammarAccess.getLiteral_constantAccess().getCHRTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMAL.g:2039:3: this_WRD_3= RULE_WRD
                    {
                    this_WRD_3=(Token)match(input,RULE_WRD,FOLLOW_2); 

                    			current.merge(this_WRD_3);
                    		

                    			newLeafNode(this_WRD_3, grammarAccess.getLiteral_constantAccess().getWRDTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMAL.g:2047:3: this_INT_4= RULE_INT
                    {
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_4);
                    		

                    			newLeafNode(this_INT_4, grammarAccess.getLiteral_constantAccess().getINTTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMAL.g:2055:3: this_OID_5= RULE_OID
                    {
                    this_OID_5=(Token)match(input,RULE_OID,FOLLOW_2); 

                    			current.merge(this_OID_5);
                    		

                    			newLeafNode(this_OID_5, grammarAccess.getLiteral_constantAccess().getOIDTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMAL.g:2063:3: this_FLT_6= ruleFLT
                    {

                    			newCompositeNode(grammarAccess.getLiteral_constantAccess().getFLTParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLT_6=ruleFLT();

                    state._fsp--;


                    			current.merge(this_FLT_6);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMAL.g:2074:3: this_STR_7= ruleSTR
                    {

                    			newCompositeNode(grammarAccess.getLiteral_constantAccess().getSTRParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_STR_7=ruleSTR();

                    state._fsp--;


                    			current.merge(this_STR_7);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral_constant"


    // $ANTLR start "entryRuleBte"
    // InternalMAL.g:2088:1: entryRuleBte returns [String current=null] : iv_ruleBte= ruleBte EOF ;
    public final String entryRuleBte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBte = null;


        try {
            // InternalMAL.g:2088:43: (iv_ruleBte= ruleBte EOF )
            // InternalMAL.g:2089:2: iv_ruleBte= ruleBte EOF
            {
             newCompositeNode(grammarAccess.getBteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBte=ruleBte();

            state._fsp--;

             current =iv_ruleBte.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBte"


    // $ANTLR start "ruleBte"
    // InternalMAL.g:2095:1: ruleBte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT ) ;
    public final AntlrDatatypeRuleToken ruleBte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIT_0=null;
        Token this_BIT_1=null;
        Token this_BIT_2=null;
        Token this_BIT_3=null;
        Token this_BIT_4=null;
        Token this_BIT_5=null;
        Token this_BIT_6=null;
        Token this_BIT_7=null;


        	enterRule();

        try {
            // InternalMAL.g:2101:2: ( (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT ) )
            // InternalMAL.g:2102:2: (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT )
            {
            // InternalMAL.g:2102:2: (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT )
            // InternalMAL.g:2103:3: this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT
            {
            this_BIT_0=(Token)match(input,RULE_BIT,FOLLOW_32); 

            			current.merge(this_BIT_0);
            		

            			newLeafNode(this_BIT_0, grammarAccess.getBteAccess().getBITTerminalRuleCall_0());
            		
            this_BIT_1=(Token)match(input,RULE_BIT,FOLLOW_32); 

            			current.merge(this_BIT_1);
            		

            			newLeafNode(this_BIT_1, grammarAccess.getBteAccess().getBITTerminalRuleCall_1());
            		
            this_BIT_2=(Token)match(input,RULE_BIT,FOLLOW_32); 

            			current.merge(this_BIT_2);
            		

            			newLeafNode(this_BIT_2, grammarAccess.getBteAccess().getBITTerminalRuleCall_2());
            		
            this_BIT_3=(Token)match(input,RULE_BIT,FOLLOW_32); 

            			current.merge(this_BIT_3);
            		

            			newLeafNode(this_BIT_3, grammarAccess.getBteAccess().getBITTerminalRuleCall_3());
            		
            this_BIT_4=(Token)match(input,RULE_BIT,FOLLOW_32); 

            			current.merge(this_BIT_4);
            		

            			newLeafNode(this_BIT_4, grammarAccess.getBteAccess().getBITTerminalRuleCall_4());
            		
            this_BIT_5=(Token)match(input,RULE_BIT,FOLLOW_32); 

            			current.merge(this_BIT_5);
            		

            			newLeafNode(this_BIT_5, grammarAccess.getBteAccess().getBITTerminalRuleCall_5());
            		
            this_BIT_6=(Token)match(input,RULE_BIT,FOLLOW_32); 

            			current.merge(this_BIT_6);
            		

            			newLeafNode(this_BIT_6, grammarAccess.getBteAccess().getBITTerminalRuleCall_6());
            		
            this_BIT_7=(Token)match(input,RULE_BIT,FOLLOW_2); 

            			current.merge(this_BIT_7);
            		

            			newLeafNode(this_BIT_7, grammarAccess.getBteAccess().getBITTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBte"


    // $ANTLR start "entryRuleFLT"
    // InternalMAL.g:2163:1: entryRuleFLT returns [String current=null] : iv_ruleFLT= ruleFLT EOF ;
    public final String entryRuleFLT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLT = null;


        try {
            // InternalMAL.g:2163:43: (iv_ruleFLT= ruleFLT EOF )
            // InternalMAL.g:2164:2: iv_ruleFLT= ruleFLT EOF
            {
             newCompositeNode(grammarAccess.getFLTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLT=ruleFLT();

            state._fsp--;

             current =iv_ruleFLT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLT"


    // $ANTLR start "ruleFLT"
    // InternalMAL.g:2170:1: ruleFLT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMAL.g:2176:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMAL.g:2177:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMAL.g:2177:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMAL.g:2178:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLTAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,43,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLTAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLTAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLT"


    // $ANTLR start "entryRuleSTR"
    // InternalMAL.g:2201:1: entryRuleSTR returns [String current=null] : iv_ruleSTR= ruleSTR EOF ;
    public final String entryRuleSTR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR = null;


        try {
            // InternalMAL.g:2201:43: (iv_ruleSTR= ruleSTR EOF )
            // InternalMAL.g:2202:2: iv_ruleSTR= ruleSTR EOF
            {
             newCompositeNode(grammarAccess.getSTRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTR=ruleSTR();

            state._fsp--;

             current =iv_ruleSTR.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTR"


    // $ANTLR start "ruleSTR"
    // InternalMAL.g:2208:1: ruleSTR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSTR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMAL.g:2214:2: (this_STRING_0= RULE_STRING )
            // InternalMAL.g:2215:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getSTRAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTR"

    // Delegated rules


    protected DFA47 dfa47 = new DFA47(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\uffff\7\12\5\uffff\1\12\4\uffff\1\12";
    static final String dfa_3s = "\10\4\1\6\2\uffff\1\10\1\6\1\4\4\6\1\4";
    static final String dfa_4s = "\1\104\7\103\1\6\2\uffff\1\10\1\6\1\103\4\6\1\103";
    static final String dfa_5s = "\11\uffff\1\1\1\2\10\uffff";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\6\1\1\1\2\1\4\1\5\72\uffff\1\7",
            "\1\12\1\uffff\1\10\10\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\1\uffff\1\13\10\uffff\14\12\4\11",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\1\12\12\uffff\14\12\4\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1667:4: ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )?";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\uffff\1\10\2\uffff\1\12\6\uffff";
    static final String dfa_10s = "\2\4\2\uffff\1\4\6\uffff";
    static final String dfa_11s = "\1\11\1\103\2\uffff\1\103\6\uffff";
    static final String dfa_12s = "\2\uffff\1\3\1\4\1\uffff\1\6\1\10\1\2\1\1\1\7\1\5";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\6\1\1\1\2\1\4\1\5",
            "\1\10\1\uffff\1\7\10\uffff\5\10\1\uffff\6\10\2\uffff\12\10\2\uffff\2\10\1\uffff\1\10\7\uffff\20\10",
            "",
            "",
            "\1\12\12\uffff\5\12\1\uffff\6\12\2\uffff\12\12\2\uffff\2\12\1\11\1\12\7\uffff\20\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2011:2: (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xFFF00267E7EF0012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFF0027FE7EF0010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFFF80267E7EF0010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000003F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000400000003F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});

}