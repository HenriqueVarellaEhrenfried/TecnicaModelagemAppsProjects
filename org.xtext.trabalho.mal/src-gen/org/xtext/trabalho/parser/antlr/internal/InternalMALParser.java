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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BIT", "RULE_CHR", "RULE_WRD", "RULE_INT", "RULE_OID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'MODULE'", "'ATOM'", "':'", "'INCLUDE'", "'UNSAFE'", "'COMMAND'", "'ADDRESS'", "'PATTERN'", "'INLINE'", "'FUNCTION'", "'END'", "'FACTORY'", "'COMMENT'", "'('", "')'", "'.'", "','", "'BAT'", "'['", "']'", "'any'", "'_'", "':='", "'RETURN'", "'BARRIER'", "'CATCH'", "'LEAVE'", "'REDO'", "'RAISE'", "'+'", "'-'", "'*'", "'/'", "'NIL'"
    };
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

                if ( (LA1_0==RULE_ID||(LA1_0>=16 && LA1_0<=17)||(LA1_0>=19 && LA1_0<=21)||(LA1_0>=23 && LA1_0<=25)||LA1_0==27||LA1_0==29||(LA1_0>=39 && LA1_0<=44)) ) {
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
                {
                alt4=1;
                }
                break;
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 27:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
            case 29:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
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

                    if ( (LA2_0==28) ) {
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

                    if ( (LA3_0==28) ) {
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
    // InternalMAL.g:209:1: ruleModuleStmt returns [EObject current=null] : ( (otherlv_0= 'MODULE' ( (lv_ident_1_0= RULE_ID ) ) ) | (otherlv_2= 'ATOM' ( (lv_ident_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )? ) ) ;
    public final EObject ruleModuleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ident_1_0=null;
        Token otherlv_2=null;
        Token lv_ident_3_0=null;
        Token otherlv_4=null;
        Token lv_second_ident_5_0=null;


        	enterRule();

        try {
            // InternalMAL.g:215:2: ( ( (otherlv_0= 'MODULE' ( (lv_ident_1_0= RULE_ID ) ) ) | (otherlv_2= 'ATOM' ( (lv_ident_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )? ) ) )
            // InternalMAL.g:216:2: ( (otherlv_0= 'MODULE' ( (lv_ident_1_0= RULE_ID ) ) ) | (otherlv_2= 'ATOM' ( (lv_ident_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )? ) )
            {
            // InternalMAL.g:216:2: ( (otherlv_0= 'MODULE' ( (lv_ident_1_0= RULE_ID ) ) ) | (otherlv_2= 'ATOM' ( (lv_ident_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMAL.g:217:3: (otherlv_0= 'MODULE' ( (lv_ident_1_0= RULE_ID ) ) )
                    {
                    // InternalMAL.g:217:3: (otherlv_0= 'MODULE' ( (lv_ident_1_0= RULE_ID ) ) )
                    // InternalMAL.g:218:4: otherlv_0= 'MODULE' ( (lv_ident_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getModuleStmtAccess().getMODULEKeyword_0_0());
                    			
                    // InternalMAL.g:222:4: ( (lv_ident_1_0= RULE_ID ) )
                    // InternalMAL.g:223:5: (lv_ident_1_0= RULE_ID )
                    {
                    // InternalMAL.g:223:5: (lv_ident_1_0= RULE_ID )
                    // InternalMAL.g:224:6: lv_ident_1_0= RULE_ID
                    {
                    lv_ident_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_ident_1_0, grammarAccess.getModuleStmtAccess().getIdentIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModuleStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ident",
                    							lv_ident_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:242:3: (otherlv_2= 'ATOM' ( (lv_ident_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )? )
                    {
                    // InternalMAL.g:242:3: (otherlv_2= 'ATOM' ( (lv_ident_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )? )
                    // InternalMAL.g:243:4: otherlv_2= 'ATOM' ( (lv_ident_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )?
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getModuleStmtAccess().getATOMKeyword_1_0());
                    			
                    // InternalMAL.g:247:4: ( (lv_ident_3_0= RULE_ID ) )
                    // InternalMAL.g:248:5: (lv_ident_3_0= RULE_ID )
                    {
                    // InternalMAL.g:248:5: (lv_ident_3_0= RULE_ID )
                    // InternalMAL.g:249:6: lv_ident_3_0= RULE_ID
                    {
                    lv_ident_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_ident_3_0, grammarAccess.getModuleStmtAccess().getIdentIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModuleStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ident",
                    							lv_ident_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMAL.g:265:4: (otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMAL.g:266:5: otherlv_4= ':' ( (lv_second_ident_5_0= RULE_ID ) )
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getModuleStmtAccess().getColonKeyword_1_2_0());
                            				
                            // InternalMAL.g:270:5: ( (lv_second_ident_5_0= RULE_ID ) )
                            // InternalMAL.g:271:6: (lv_second_ident_5_0= RULE_ID )
                            {
                            // InternalMAL.g:271:6: (lv_second_ident_5_0= RULE_ID )
                            // InternalMAL.g:272:7: lv_second_ident_5_0= RULE_ID
                            {
                            lv_second_ident_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_second_ident_5_0, grammarAccess.getModuleStmtAccess().getSecond_identIDTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModuleStmtRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"second_ident",
                            								true,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

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
    // InternalMAL.g:294:1: entryRuleIncludeStmt returns [EObject current=null] : iv_ruleIncludeStmt= ruleIncludeStmt EOF ;
    public final EObject entryRuleIncludeStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeStmt = null;


        try {
            // InternalMAL.g:294:52: (iv_ruleIncludeStmt= ruleIncludeStmt EOF )
            // InternalMAL.g:295:2: iv_ruleIncludeStmt= ruleIncludeStmt EOF
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
    // InternalMAL.g:301:1: ruleIncludeStmt returns [EObject current=null] : ( (otherlv_0= 'INCLUDE' ( (lv_identifier_1_0= RULE_ID ) ) ) | (otherlv_2= 'INCLUDE' ( (lv_string_literal_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleIncludeStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token lv_string_literal_3_0=null;


        	enterRule();

        try {
            // InternalMAL.g:307:2: ( ( (otherlv_0= 'INCLUDE' ( (lv_identifier_1_0= RULE_ID ) ) ) | (otherlv_2= 'INCLUDE' ( (lv_string_literal_3_0= RULE_STRING ) ) ) ) )
            // InternalMAL.g:308:2: ( (otherlv_0= 'INCLUDE' ( (lv_identifier_1_0= RULE_ID ) ) ) | (otherlv_2= 'INCLUDE' ( (lv_string_literal_3_0= RULE_STRING ) ) ) )
            {
            // InternalMAL.g:308:2: ( (otherlv_0= 'INCLUDE' ( (lv_identifier_1_0= RULE_ID ) ) ) | (otherlv_2= 'INCLUDE' ( (lv_string_literal_3_0= RULE_STRING ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMAL.g:309:3: (otherlv_0= 'INCLUDE' ( (lv_identifier_1_0= RULE_ID ) ) )
                    {
                    // InternalMAL.g:309:3: (otherlv_0= 'INCLUDE' ( (lv_identifier_1_0= RULE_ID ) ) )
                    // InternalMAL.g:310:4: otherlv_0= 'INCLUDE' ( (lv_identifier_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_0_0());
                    			
                    // InternalMAL.g:314:4: ( (lv_identifier_1_0= RULE_ID ) )
                    // InternalMAL.g:315:5: (lv_identifier_1_0= RULE_ID )
                    {
                    // InternalMAL.g:315:5: (lv_identifier_1_0= RULE_ID )
                    // InternalMAL.g:316:6: lv_identifier_1_0= RULE_ID
                    {
                    lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_identifier_1_0, grammarAccess.getIncludeStmtAccess().getIdentifierIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIncludeStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"identifier",
                    							lv_identifier_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:334:3: (otherlv_2= 'INCLUDE' ( (lv_string_literal_3_0= RULE_STRING ) ) )
                    {
                    // InternalMAL.g:334:3: (otherlv_2= 'INCLUDE' ( (lv_string_literal_3_0= RULE_STRING ) ) )
                    // InternalMAL.g:335:4: otherlv_2= 'INCLUDE' ( (lv_string_literal_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_1_0());
                    			
                    // InternalMAL.g:339:4: ( (lv_string_literal_3_0= RULE_STRING ) )
                    // InternalMAL.g:340:5: (lv_string_literal_3_0= RULE_STRING )
                    {
                    // InternalMAL.g:340:5: (lv_string_literal_3_0= RULE_STRING )
                    // InternalMAL.g:341:6: lv_string_literal_3_0= RULE_STRING
                    {
                    lv_string_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_string_literal_3_0, grammarAccess.getIncludeStmtAccess().getString_literalSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIncludeStmtRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string_literal",
                    							lv_string_literal_3_0,
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
    // InternalMAL.g:362:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMAL.g:362:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMAL.g:363:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalMAL.g:369:1: ruleDefinition returns [EObject current=null] : ( ( (otherlv_0= 'UNSAFE' )? otherlv_1= 'COMMAND' ( (lv_header_2_0= ruleHeader ) ) otherlv_3= 'ADDRESS' ( (lv_identifier_4_0= RULE_ID ) ) ) | ( (otherlv_5= 'UNSAFE' )? otherlv_6= 'PATTERN' ( (lv_header_7_0= ruleHeader ) ) otherlv_8= 'ADDRESS' ( (lv_identifier_9_0= RULE_ID ) ) ) | ( (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )? otherlv_12= 'FUNCTION' ( (lv_header_13_0= ruleHeader ) ) ( (lv_statements_14_0= ruleStatement ) )* otherlv_15= 'END' ( (lv_function_name_16_0= ruleName ) ) ) | (otherlv_17= 'FACTORY' ( (lv_header_18_0= ruleHeader ) ) ( (lv_statements_19_0= ruleStatement ) )* otherlv_20= 'END' ( (lv_factory_name_21_0= ruleName ) ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_identifier_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_identifier_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_header_2_0 = null;

        EObject lv_header_7_0 = null;

        EObject lv_header_13_0 = null;

        EObject lv_statements_14_0 = null;

        EObject lv_function_name_16_0 = null;

        EObject lv_header_18_0 = null;

        EObject lv_statements_19_0 = null;

        EObject lv_factory_name_21_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:375:2: ( ( ( (otherlv_0= 'UNSAFE' )? otherlv_1= 'COMMAND' ( (lv_header_2_0= ruleHeader ) ) otherlv_3= 'ADDRESS' ( (lv_identifier_4_0= RULE_ID ) ) ) | ( (otherlv_5= 'UNSAFE' )? otherlv_6= 'PATTERN' ( (lv_header_7_0= ruleHeader ) ) otherlv_8= 'ADDRESS' ( (lv_identifier_9_0= RULE_ID ) ) ) | ( (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )? otherlv_12= 'FUNCTION' ( (lv_header_13_0= ruleHeader ) ) ( (lv_statements_14_0= ruleStatement ) )* otherlv_15= 'END' ( (lv_function_name_16_0= ruleName ) ) ) | (otherlv_17= 'FACTORY' ( (lv_header_18_0= ruleHeader ) ) ( (lv_statements_19_0= ruleStatement ) )* otherlv_20= 'END' ( (lv_factory_name_21_0= ruleName ) ) ) ) )
            // InternalMAL.g:376:2: ( ( (otherlv_0= 'UNSAFE' )? otherlv_1= 'COMMAND' ( (lv_header_2_0= ruleHeader ) ) otherlv_3= 'ADDRESS' ( (lv_identifier_4_0= RULE_ID ) ) ) | ( (otherlv_5= 'UNSAFE' )? otherlv_6= 'PATTERN' ( (lv_header_7_0= ruleHeader ) ) otherlv_8= 'ADDRESS' ( (lv_identifier_9_0= RULE_ID ) ) ) | ( (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )? otherlv_12= 'FUNCTION' ( (lv_header_13_0= ruleHeader ) ) ( (lv_statements_14_0= ruleStatement ) )* otherlv_15= 'END' ( (lv_function_name_16_0= ruleName ) ) ) | (otherlv_17= 'FACTORY' ( (lv_header_18_0= ruleHeader ) ) ( (lv_statements_19_0= ruleStatement ) )* otherlv_20= 'END' ( (lv_factory_name_21_0= ruleName ) ) ) )
            {
            // InternalMAL.g:376:2: ( ( (otherlv_0= 'UNSAFE' )? otherlv_1= 'COMMAND' ( (lv_header_2_0= ruleHeader ) ) otherlv_3= 'ADDRESS' ( (lv_identifier_4_0= RULE_ID ) ) ) | ( (otherlv_5= 'UNSAFE' )? otherlv_6= 'PATTERN' ( (lv_header_7_0= ruleHeader ) ) otherlv_8= 'ADDRESS' ( (lv_identifier_9_0= RULE_ID ) ) ) | ( (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )? otherlv_12= 'FUNCTION' ( (lv_header_13_0= ruleHeader ) ) ( (lv_statements_14_0= ruleStatement ) )* otherlv_15= 'END' ( (lv_function_name_16_0= ruleName ) ) ) | (otherlv_17= 'FACTORY' ( (lv_header_18_0= ruleHeader ) ) ( (lv_statements_19_0= ruleStatement ) )* otherlv_20= 'END' ( (lv_factory_name_21_0= ruleName ) ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt13=3;
                    }
                    break;
                case 21:
                    {
                    alt13=1;
                    }
                    break;
                case 23:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
            case 25:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMAL.g:377:3: ( (otherlv_0= 'UNSAFE' )? otherlv_1= 'COMMAND' ( (lv_header_2_0= ruleHeader ) ) otherlv_3= 'ADDRESS' ( (lv_identifier_4_0= RULE_ID ) ) )
                    {
                    // InternalMAL.g:377:3: ( (otherlv_0= 'UNSAFE' )? otherlv_1= 'COMMAND' ( (lv_header_2_0= ruleHeader ) ) otherlv_3= 'ADDRESS' ( (lv_identifier_4_0= RULE_ID ) ) )
                    // InternalMAL.g:378:4: (otherlv_0= 'UNSAFE' )? otherlv_1= 'COMMAND' ( (lv_header_2_0= ruleHeader ) ) otherlv_3= 'ADDRESS' ( (lv_identifier_4_0= RULE_ID ) )
                    {
                    // InternalMAL.g:378:4: (otherlv_0= 'UNSAFE' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMAL.g:379:5: otherlv_0= 'UNSAFE'
                            {
                            otherlv_0=(Token)match(input,20,FOLLOW_9); 

                            					newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_0_0());
                            				

                            }
                            break;

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getCOMMANDKeyword_0_1());
                    			
                    // InternalMAL.g:388:4: ( (lv_header_2_0= ruleHeader ) )
                    // InternalMAL.g:389:5: (lv_header_2_0= ruleHeader )
                    {
                    // InternalMAL.g:389:5: (lv_header_2_0= ruleHeader )
                    // InternalMAL.g:390:6: lv_header_2_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_header_2_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_2_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getADDRESSKeyword_0_3());
                    			
                    // InternalMAL.g:411:4: ( (lv_identifier_4_0= RULE_ID ) )
                    // InternalMAL.g:412:5: (lv_identifier_4_0= RULE_ID )
                    {
                    // InternalMAL.g:412:5: (lv_identifier_4_0= RULE_ID )
                    // InternalMAL.g:413:6: lv_identifier_4_0= RULE_ID
                    {
                    lv_identifier_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_identifier_4_0, grammarAccess.getDefinitionAccess().getIdentifierIDTerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"identifier",
                    							lv_identifier_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:431:3: ( (otherlv_5= 'UNSAFE' )? otherlv_6= 'PATTERN' ( (lv_header_7_0= ruleHeader ) ) otherlv_8= 'ADDRESS' ( (lv_identifier_9_0= RULE_ID ) ) )
                    {
                    // InternalMAL.g:431:3: ( (otherlv_5= 'UNSAFE' )? otherlv_6= 'PATTERN' ( (lv_header_7_0= ruleHeader ) ) otherlv_8= 'ADDRESS' ( (lv_identifier_9_0= RULE_ID ) ) )
                    // InternalMAL.g:432:4: (otherlv_5= 'UNSAFE' )? otherlv_6= 'PATTERN' ( (lv_header_7_0= ruleHeader ) ) otherlv_8= 'ADDRESS' ( (lv_identifier_9_0= RULE_ID ) )
                    {
                    // InternalMAL.g:432:4: (otherlv_5= 'UNSAFE' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==20) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMAL.g:433:5: otherlv_5= 'UNSAFE'
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_11); 

                            					newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_1_0());
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getPATTERNKeyword_1_1());
                    			
                    // InternalMAL.g:442:4: ( (lv_header_7_0= ruleHeader ) )
                    // InternalMAL.g:443:5: (lv_header_7_0= ruleHeader )
                    {
                    // InternalMAL.g:443:5: (lv_header_7_0= ruleHeader )
                    // InternalMAL.g:444:6: lv_header_7_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_header_7_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_7_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getADDRESSKeyword_1_3());
                    			
                    // InternalMAL.g:465:4: ( (lv_identifier_9_0= RULE_ID ) )
                    // InternalMAL.g:466:5: (lv_identifier_9_0= RULE_ID )
                    {
                    // InternalMAL.g:466:5: (lv_identifier_9_0= RULE_ID )
                    // InternalMAL.g:467:6: lv_identifier_9_0= RULE_ID
                    {
                    lv_identifier_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_identifier_9_0, grammarAccess.getDefinitionAccess().getIdentifierIDTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"identifier",
                    							lv_identifier_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:485:3: ( (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )? otherlv_12= 'FUNCTION' ( (lv_header_13_0= ruleHeader ) ) ( (lv_statements_14_0= ruleStatement ) )* otherlv_15= 'END' ( (lv_function_name_16_0= ruleName ) ) )
                    {
                    // InternalMAL.g:485:3: ( (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )? otherlv_12= 'FUNCTION' ( (lv_header_13_0= ruleHeader ) ) ( (lv_statements_14_0= ruleStatement ) )* otherlv_15= 'END' ( (lv_function_name_16_0= ruleName ) ) )
                    // InternalMAL.g:486:4: (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )? otherlv_12= 'FUNCTION' ( (lv_header_13_0= ruleHeader ) ) ( (lv_statements_14_0= ruleStatement ) )* otherlv_15= 'END' ( (lv_function_name_16_0= ruleName ) )
                    {
                    // InternalMAL.g:486:4: (otherlv_10= 'INLINE' | otherlv_11= 'UNSAFE' )?
                    int alt10=3;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==20) ) {
                        alt10=2;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMAL.g:487:5: otherlv_10= 'INLINE'
                            {
                            otherlv_10=(Token)match(input,24,FOLLOW_12); 

                            					newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getINLINEKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMAL.g:492:5: otherlv_11= 'UNSAFE'
                            {
                            otherlv_11=(Token)match(input,20,FOLLOW_12); 

                            					newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getUNSAFEKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getDefinitionAccess().getFUNCTIONKeyword_2_1());
                    			
                    // InternalMAL.g:501:4: ( (lv_header_13_0= ruleHeader ) )
                    // InternalMAL.g:502:5: (lv_header_13_0= ruleHeader )
                    {
                    // InternalMAL.g:502:5: (lv_header_13_0= ruleHeader )
                    // InternalMAL.g:503:6: lv_header_13_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_header_13_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_13_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMAL.g:520:4: ( (lv_statements_14_0= ruleStatement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||(LA11_0>=16 && LA11_0<=17)||(LA11_0>=19 && LA11_0<=21)||(LA11_0>=23 && LA11_0<=25)||LA11_0==27||LA11_0==29||(LA11_0>=39 && LA11_0<=44)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMAL.g:521:5: (lv_statements_14_0= ruleStatement )
                    	    {
                    	    // InternalMAL.g:521:5: (lv_statements_14_0= ruleStatement )
                    	    // InternalMAL.g:522:6: lv_statements_14_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_statements_14_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_14_0,
                    	    							"org.xtext.trabalho.MAL.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getDefinitionAccess().getENDKeyword_2_4());
                    			
                    // InternalMAL.g:543:4: ( (lv_function_name_16_0= ruleName ) )
                    // InternalMAL.g:544:5: (lv_function_name_16_0= ruleName )
                    {
                    // InternalMAL.g:544:5: (lv_function_name_16_0= ruleName )
                    // InternalMAL.g:545:6: lv_function_name_16_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getFunction_nameNameParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_function_name_16_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"function_name",
                    							lv_function_name_16_0,
                    							"org.xtext.trabalho.MAL.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:564:3: (otherlv_17= 'FACTORY' ( (lv_header_18_0= ruleHeader ) ) ( (lv_statements_19_0= ruleStatement ) )* otherlv_20= 'END' ( (lv_factory_name_21_0= ruleName ) ) )
                    {
                    // InternalMAL.g:564:3: (otherlv_17= 'FACTORY' ( (lv_header_18_0= ruleHeader ) ) ( (lv_statements_19_0= ruleStatement ) )* otherlv_20= 'END' ( (lv_factory_name_21_0= ruleName ) ) )
                    // InternalMAL.g:565:4: otherlv_17= 'FACTORY' ( (lv_header_18_0= ruleHeader ) ) ( (lv_statements_19_0= ruleStatement ) )* otherlv_20= 'END' ( (lv_factory_name_21_0= ruleName ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getDefinitionAccess().getFACTORYKeyword_3_0());
                    			
                    // InternalMAL.g:569:4: ( (lv_header_18_0= ruleHeader ) )
                    // InternalMAL.g:570:5: (lv_header_18_0= ruleHeader )
                    {
                    // InternalMAL.g:570:5: (lv_header_18_0= ruleHeader )
                    // InternalMAL.g:571:6: lv_header_18_0= ruleHeader
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_header_18_0=ruleHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_18_0,
                    							"org.xtext.trabalho.MAL.Header");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMAL.g:588:4: ( (lv_statements_19_0= ruleStatement ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||(LA12_0>=16 && LA12_0<=17)||(LA12_0>=19 && LA12_0<=21)||(LA12_0>=23 && LA12_0<=25)||LA12_0==27||LA12_0==29||(LA12_0>=39 && LA12_0<=44)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMAL.g:589:5: (lv_statements_19_0= ruleStatement )
                    	    {
                    	    // InternalMAL.g:589:5: (lv_statements_19_0= ruleStatement )
                    	    // InternalMAL.g:590:6: lv_statements_19_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_statements_19_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_19_0,
                    	    							"org.xtext.trabalho.MAL.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getDefinitionAccess().getENDKeyword_3_3());
                    			
                    // InternalMAL.g:611:4: ( (lv_factory_name_21_0= ruleName ) )
                    // InternalMAL.g:612:5: (lv_factory_name_21_0= ruleName )
                    {
                    // InternalMAL.g:612:5: (lv_factory_name_21_0= ruleName )
                    // InternalMAL.g:613:6: lv_factory_name_21_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getFactory_nameNameParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_factory_name_21_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"factory_name",
                    							lv_factory_name_21_0,
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
    // InternalMAL.g:635:1: entryRuleHelpinfo returns [EObject current=null] : iv_ruleHelpinfo= ruleHelpinfo EOF ;
    public final EObject entryRuleHelpinfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpinfo = null;


        try {
            // InternalMAL.g:635:49: (iv_ruleHelpinfo= ruleHelpinfo EOF )
            // InternalMAL.g:636:2: iv_ruleHelpinfo= ruleHelpinfo EOF
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
    // InternalMAL.g:642:1: ruleHelpinfo returns [EObject current=null] : (otherlv_0= 'COMMENT' ( (lv_string_literal_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHelpinfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_string_literal_1_0=null;


        	enterRule();

        try {
            // InternalMAL.g:648:2: ( (otherlv_0= 'COMMENT' ( (lv_string_literal_1_0= RULE_STRING ) ) ) )
            // InternalMAL.g:649:2: (otherlv_0= 'COMMENT' ( (lv_string_literal_1_0= RULE_STRING ) ) )
            {
            // InternalMAL.g:649:2: (otherlv_0= 'COMMENT' ( (lv_string_literal_1_0= RULE_STRING ) ) )
            // InternalMAL.g:650:3: otherlv_0= 'COMMENT' ( (lv_string_literal_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHelpinfoAccess().getCOMMENTKeyword_0());
            		
            // InternalMAL.g:654:3: ( (lv_string_literal_1_0= RULE_STRING ) )
            // InternalMAL.g:655:4: (lv_string_literal_1_0= RULE_STRING )
            {
            // InternalMAL.g:655:4: (lv_string_literal_1_0= RULE_STRING )
            // InternalMAL.g:656:5: lv_string_literal_1_0= RULE_STRING
            {
            lv_string_literal_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_string_literal_1_0, grammarAccess.getHelpinfoAccess().getString_literalSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHelpinfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string_literal",
            						lv_string_literal_1_0,
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
    // InternalMAL.g:676:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalMAL.g:676:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalMAL.g:677:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalMAL.g:683:1: ruleHeader returns [EObject current=null] : ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_header_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_return_type_4_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:689:2: ( ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) ) )
            // InternalMAL.g:690:2: ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) )
            {
            // InternalMAL.g:690:2: ( ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) ) )
            // InternalMAL.g:691:3: ( (lv_header_name_0_0= ruleName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleParams ) ) otherlv_3= ')' ( (lv_return_type_4_0= ruleResult ) )
            {
            // InternalMAL.g:691:3: ( (lv_header_name_0_0= ruleName ) )
            // InternalMAL.g:692:4: (lv_header_name_0_0= ruleName )
            {
            // InternalMAL.g:692:4: (lv_header_name_0_0= ruleName )
            // InternalMAL.g:693:5: lv_header_name_0_0= ruleName
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

            otherlv_1=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMAL.g:714:3: ( (lv_params_2_0= ruleParams ) )
            // InternalMAL.g:715:4: (lv_params_2_0= ruleParams )
            {
            // InternalMAL.g:715:4: (lv_params_2_0= ruleParams )
            // InternalMAL.g:716:5: lv_params_2_0= ruleParams
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

            otherlv_3=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3());
            		
            // InternalMAL.g:737:3: ( (lv_return_type_4_0= ruleResult ) )
            // InternalMAL.g:738:4: (lv_return_type_4_0= ruleResult )
            {
            // InternalMAL.g:738:4: (lv_return_type_4_0= ruleResult )
            // InternalMAL.g:739:5: lv_return_type_4_0= ruleResult
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
    // InternalMAL.g:760:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalMAL.g:760:45: (iv_ruleName= ruleName EOF )
            // InternalMAL.g:761:2: iv_ruleName= ruleName EOF
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
    // InternalMAL.g:767:1: ruleName returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_id_2_0= RULE_ID ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;


        	enterRule();

        try {
            // InternalMAL.g:773:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_id_2_0= RULE_ID ) ) ) )
            // InternalMAL.g:774:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_id_2_0= RULE_ID ) ) )
            {
            // InternalMAL.g:774:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_id_2_0= RULE_ID ) ) )
            // InternalMAL.g:775:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )* ( (lv_id_2_0= RULE_ID ) )
            {
            // InternalMAL.g:775:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==31) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalMAL.g:776:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
            	    {
            	    // InternalMAL.g:776:4: ( (otherlv_0= RULE_ID ) )
            	    // InternalMAL.g:777:5: (otherlv_0= RULE_ID )
            	    {
            	    // InternalMAL.g:777:5: (otherlv_0= RULE_ID )
            	    // InternalMAL.g:778:6: otherlv_0= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNameRule());
            	    						}
            	    					
            	    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    						newLeafNode(otherlv_0, grammarAccess.getNameAccess().getMnModuleNameCrossReference_0_0_0());
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,31,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNameAccess().getFullStopKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalMAL.g:794:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalMAL.g:795:4: (lv_id_2_0= RULE_ID )
            {
            // InternalMAL.g:795:4: (lv_id_2_0= RULE_ID )
            // InternalMAL.g:796:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_2_0, grammarAccess.getNameAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalMAL.g:816:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalMAL.g:816:47: (iv_ruleResult= ruleResult EOF )
            // InternalMAL.g:817:2: iv_ruleResult= ruleResult EOF
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
    // InternalMAL.g:823:1: ruleResult returns [EObject current=null] : (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TypeName_0 = null;

        EObject this_Params_2 = null;



        	enterRule();

        try {
            // InternalMAL.g:829:2: ( (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) ) )
            // InternalMAL.g:830:2: (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) )
            {
            // InternalMAL.g:830:2: (this_TypeName_0= ruleTypeName | (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMAL.g:831:3: this_TypeName_0= ruleTypeName
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
                    // InternalMAL.g:840:3: (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' )
                    {
                    // InternalMAL.g:840:3: (otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')' )
                    // InternalMAL.g:841:4: otherlv_1= '(' this_Params_2= ruleParams otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getResultAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getResultAccess().getParamsParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Params_2=ruleParams();

                    state._fsp--;


                    				current = this_Params_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMAL.g:862:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalMAL.g:862:47: (iv_ruleParams= ruleParams EOF )
            // InternalMAL.g:863:2: iv_ruleParams= ruleParams EOF
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
    // InternalMAL.g:869:1: ruleParams returns [EObject current=null] : ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bind_0_0 = null;

        EObject lv_bind_2_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:875:2: ( ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* ) )
            // InternalMAL.g:876:2: ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* )
            {
            // InternalMAL.g:876:2: ( ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )* )
            // InternalMAL.g:877:3: ( (lv_bind_0_0= ruleBinding ) ) (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )*
            {
            // InternalMAL.g:877:3: ( (lv_bind_0_0= ruleBinding ) )
            // InternalMAL.g:878:4: (lv_bind_0_0= ruleBinding )
            {
            // InternalMAL.g:878:4: (lv_bind_0_0= ruleBinding )
            // InternalMAL.g:879:5: lv_bind_0_0= ruleBinding
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

            // InternalMAL.g:896:3: (otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMAL.g:897:4: otherlv_1= ',' ( (lv_bind_2_0= ruleBinding ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMAL.g:901:4: ( (lv_bind_2_0= ruleBinding ) )
            	    // InternalMAL.g:902:5: (lv_bind_2_0= ruleBinding )
            	    {
            	    // InternalMAL.g:902:5: (lv_bind_2_0= ruleBinding )
            	    // InternalMAL.g:903:6: lv_bind_2_0= ruleBinding
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
            	    break loop16;
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
    // InternalMAL.g:925:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMAL.g:925:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMAL.g:926:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalMAL.g:932:1: ruleBinding returns [EObject current=null] : ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeName ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:938:2: ( ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeName ) ) ) )
            // InternalMAL.g:939:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeName ) ) )
            {
            // InternalMAL.g:939:2: ( ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeName ) ) )
            // InternalMAL.g:940:3: ( (lv_identifier_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeName ) )
            {
            // InternalMAL.g:940:3: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMAL.g:941:4: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMAL.g:941:4: (lv_identifier_0_0= RULE_ID )
            // InternalMAL.g:942:5: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_identifier_0_0, grammarAccess.getBindingAccess().getIdentifierIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifier",
            						lv_identifier_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMAL.g:958:3: ( (lv_type_1_0= ruleTypeName ) )
            // InternalMAL.g:959:4: (lv_type_1_0= ruleTypeName )
            {
            // InternalMAL.g:959:4: (lv_type_1_0= ruleTypeName )
            // InternalMAL.g:960:5: lv_type_1_0= ruleTypeName
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
    // InternalMAL.g:981:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // InternalMAL.g:981:49: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMAL.g:982:2: iv_ruleTypeName= ruleTypeName EOF
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
    // InternalMAL.g:988:1: ruleTypeName returns [EObject current=null] : (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ScalarType_0 = null;

        EObject this_ColumnType_1 = null;

        EObject this_AnyType_3 = null;



        	enterRule();

        try {
            // InternalMAL.g:994:2: ( (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) ) )
            // InternalMAL.g:995:2: (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) )
            {
            // InternalMAL.g:995:2: (this_ScalarType_0= ruleScalarType | this_ColumnType_1= ruleColumnType | (otherlv_2= ':' this_AnyType_3= ruleAnyType ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt17=3;
                    }
                    break;
                case 33:
                    {
                    alt17=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMAL.g:996:3: this_ScalarType_0= ruleScalarType
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
                    // InternalMAL.g:1005:3: this_ColumnType_1= ruleColumnType
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
                    // InternalMAL.g:1014:3: (otherlv_2= ':' this_AnyType_3= ruleAnyType )
                    {
                    // InternalMAL.g:1014:3: (otherlv_2= ':' this_AnyType_3= ruleAnyType )
                    // InternalMAL.g:1015:4: otherlv_2= ':' this_AnyType_3= ruleAnyType
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_20); 

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
    // InternalMAL.g:1032:1: entryRuleScalarType returns [EObject current=null] : iv_ruleScalarType= ruleScalarType EOF ;
    public final EObject entryRuleScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarType = null;


        try {
            // InternalMAL.g:1032:51: (iv_ruleScalarType= ruleScalarType EOF )
            // InternalMAL.g:1033:2: iv_ruleScalarType= ruleScalarType EOF
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
    // InternalMAL.g:1039:1: ruleScalarType returns [EObject current=null] : (otherlv_0= ':' ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScalarType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1045:2: ( (otherlv_0= ':' ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // InternalMAL.g:1046:2: (otherlv_0= ':' ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // InternalMAL.g:1046:2: (otherlv_0= ':' ( (lv_identifier_1_0= RULE_ID ) ) )
            // InternalMAL.g:1047:3: otherlv_0= ':' ( (lv_identifier_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarTypeAccess().getColonKeyword_0());
            		
            // InternalMAL.g:1051:3: ( (lv_identifier_1_0= RULE_ID ) )
            // InternalMAL.g:1052:4: (lv_identifier_1_0= RULE_ID )
            {
            // InternalMAL.g:1052:4: (lv_identifier_1_0= RULE_ID )
            // InternalMAL.g:1053:5: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_identifier_1_0, grammarAccess.getScalarTypeAccess().getIdentifierIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifier",
            						lv_identifier_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalMAL.g:1073:1: entryRuleColumnType returns [EObject current=null] : iv_ruleColumnType= ruleColumnType EOF ;
    public final EObject entryRuleColumnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnType = null;


        try {
            // InternalMAL.g:1073:51: (iv_ruleColumnType= ruleColumnType EOF )
            // InternalMAL.g:1074:2: iv_ruleColumnType= ruleColumnType EOF
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
    // InternalMAL.g:1080:1: ruleColumnType returns [EObject current=null] : (otherlv_0= ':' otherlv_1= 'BAT' otherlv_2= '[' otherlv_3= ':' this_ColElmType_4= ruleColElmType otherlv_5= ']' ) ;
    public final EObject ruleColumnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ColElmType_4 = null;



        	enterRule();

        try {
            // InternalMAL.g:1086:2: ( (otherlv_0= ':' otherlv_1= 'BAT' otherlv_2= '[' otherlv_3= ':' this_ColElmType_4= ruleColElmType otherlv_5= ']' ) )
            // InternalMAL.g:1087:2: (otherlv_0= ':' otherlv_1= 'BAT' otherlv_2= '[' otherlv_3= ':' this_ColElmType_4= ruleColElmType otherlv_5= ']' )
            {
            // InternalMAL.g:1087:2: (otherlv_0= ':' otherlv_1= 'BAT' otherlv_2= '[' otherlv_3= ':' this_ColElmType_4= ruleColElmType otherlv_5= ']' )
            // InternalMAL.g:1088:3: otherlv_0= ':' otherlv_1= 'BAT' otherlv_2= '[' otherlv_3= ':' this_ColElmType_4= ruleColElmType otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnTypeAccess().getColonKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnTypeAccess().getBATKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnTypeAccess().getLeftSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnTypeAccess().getColonKeyword_3());
            		

            			newCompositeNode(grammarAccess.getColumnTypeAccess().getColElmTypeParserRuleCall_4());
            		
            pushFollow(FOLLOW_24);
            this_ColElmType_4=ruleColElmType();

            state._fsp--;


            			current = this_ColElmType_4;
            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnTypeAccess().getRightSquareBracketKeyword_5());
            		

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
    // InternalMAL.g:1120:1: entryRuleColElmType returns [EObject current=null] : iv_ruleColElmType= ruleColElmType EOF ;
    public final EObject entryRuleColElmType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColElmType = null;


        try {
            // InternalMAL.g:1120:51: (iv_ruleColElmType= ruleColElmType EOF )
            // InternalMAL.g:1121:2: iv_ruleColElmType= ruleColElmType EOF
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
    // InternalMAL.g:1127:1: ruleColElmType returns [EObject current=null] : (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType ) ;
    public final EObject ruleColElmType() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarType_0 = null;

        EObject this_AnyType_1 = null;



        	enterRule();

        try {
            // InternalMAL.g:1133:2: ( (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType ) )
            // InternalMAL.g:1134:2: (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType )
            {
            // InternalMAL.g:1134:2: (this_ScalarType_0= ruleScalarType | this_AnyType_1= ruleAnyType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMAL.g:1135:3: this_ScalarType_0= ruleScalarType
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
                    // InternalMAL.g:1144:3: this_AnyType_1= ruleAnyType
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
    // InternalMAL.g:1156:1: entryRuleAnyType returns [EObject current=null] : iv_ruleAnyType= ruleAnyType EOF ;
    public final EObject entryRuleAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyType = null;


        try {
            // InternalMAL.g:1156:48: (iv_ruleAnyType= ruleAnyType EOF )
            // InternalMAL.g:1157:2: iv_ruleAnyType= ruleAnyType EOF
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
    // InternalMAL.g:1163:1: ruleAnyType returns [EObject current=null] : ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAnyType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_digit_2_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1169:2: ( ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_ID ) ) )? ) )
            // InternalMAL.g:1170:2: ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_ID ) ) )? )
            {
            // InternalMAL.g:1170:2: ( ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_ID ) ) )? )
            // InternalMAL.g:1171:3: ( (lv_type_0_0= 'any' ) ) (otherlv_1= '_' ( (lv_digit_2_0= RULE_ID ) ) )?
            {
            // InternalMAL.g:1171:3: ( (lv_type_0_0= 'any' ) )
            // InternalMAL.g:1172:4: (lv_type_0_0= 'any' )
            {
            // InternalMAL.g:1172:4: (lv_type_0_0= 'any' )
            // InternalMAL.g:1173:5: lv_type_0_0= 'any'
            {
            lv_type_0_0=(Token)match(input,36,FOLLOW_25); 

            					newLeafNode(lv_type_0_0, grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnyTypeRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "any");
            				

            }


            }

            // InternalMAL.g:1185:3: (otherlv_1= '_' ( (lv_digit_2_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMAL.g:1186:4: otherlv_1= '_' ( (lv_digit_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getAnyTypeAccess().get_Keyword_1_0());
                    			
                    // InternalMAL.g:1190:4: ( (lv_digit_2_0= RULE_ID ) )
                    // InternalMAL.g:1191:5: (lv_digit_2_0= RULE_ID )
                    {
                    // InternalMAL.g:1191:5: (lv_digit_2_0= RULE_ID )
                    // InternalMAL.g:1192:6: lv_digit_2_0= RULE_ID
                    {
                    lv_digit_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_digit_2_0, grammarAccess.getAnyTypeAccess().getDigitIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnyTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"digit",
                    							lv_digit_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // InternalMAL.g:1213:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMAL.g:1213:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMAL.g:1214:2: iv_ruleStmt= ruleStmt EOF
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
    // InternalMAL.g:1220:1: ruleStmt returns [EObject current=null] : ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) ) ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_flow_0_0 = null;

        EObject lv_list_of_variables_1_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1226:2: ( ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) ) ) )
            // InternalMAL.g:1227:2: ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) ) )
            {
            // InternalMAL.g:1227:2: ( ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) ) )
            // InternalMAL.g:1228:3: ( (lv_flow_0_0= ruleFlow ) )? ( (lv_list_of_variables_1_0= ruleVarlist ) ) (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )
            {
            // InternalMAL.g:1228:3: ( (lv_flow_0_0= ruleFlow ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=39 && LA20_0<=44)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMAL.g:1229:4: (lv_flow_0_0= ruleFlow )
                    {
                    // InternalMAL.g:1229:4: (lv_flow_0_0= ruleFlow )
                    // InternalMAL.g:1230:5: lv_flow_0_0= ruleFlow
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

            // InternalMAL.g:1247:3: ( (lv_list_of_variables_1_0= ruleVarlist ) )
            // InternalMAL.g:1248:4: (lv_list_of_variables_1_0= ruleVarlist )
            {
            // InternalMAL.g:1248:4: (lv_list_of_variables_1_0= ruleVarlist )
            // InternalMAL.g:1249:5: lv_list_of_variables_1_0= ruleVarlist
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

            // InternalMAL.g:1266:3: (otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) ) )
            // InternalMAL.g:1267:4: otherlv_2= ':=' ( (lv_exp_3_0= ruleExpr ) )
            {
            otherlv_2=(Token)match(input,38,FOLLOW_28); 

            				newLeafNode(otherlv_2, grammarAccess.getStmtAccess().getColonEqualsSignKeyword_2_0());
            			
            // InternalMAL.g:1271:4: ( (lv_exp_3_0= ruleExpr ) )
            // InternalMAL.g:1272:5: (lv_exp_3_0= ruleExpr )
            {
            // InternalMAL.g:1272:5: (lv_exp_3_0= ruleExpr )
            // InternalMAL.g:1273:6: lv_exp_3_0= ruleExpr
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
    // InternalMAL.g:1295:1: entryRuleFlow returns [String current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final String entryRuleFlow() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFlow = null;


        try {
            // InternalMAL.g:1295:44: (iv_ruleFlow= ruleFlow EOF )
            // InternalMAL.g:1296:2: iv_ruleFlow= ruleFlow EOF
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
    // InternalMAL.g:1302:1: ruleFlow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RETURN' | kw= 'BARRIER' | kw= 'CATCH' | kw= 'LEAVE' | kw= 'REDO' | kw= 'RAISE' ) ;
    public final AntlrDatatypeRuleToken ruleFlow() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMAL.g:1308:2: ( (kw= 'RETURN' | kw= 'BARRIER' | kw= 'CATCH' | kw= 'LEAVE' | kw= 'REDO' | kw= 'RAISE' ) )
            // InternalMAL.g:1309:2: (kw= 'RETURN' | kw= 'BARRIER' | kw= 'CATCH' | kw= 'LEAVE' | kw= 'REDO' | kw= 'RAISE' )
            {
            // InternalMAL.g:1309:2: (kw= 'RETURN' | kw= 'BARRIER' | kw= 'CATCH' | kw= 'LEAVE' | kw= 'REDO' | kw= 'RAISE' )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 40:
                {
                alt21=2;
                }
                break;
            case 41:
                {
                alt21=3;
                }
                break;
            case 42:
                {
                alt21=4;
                }
                break;
            case 43:
                {
                alt21=5;
                }
                break;
            case 44:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMAL.g:1310:3: kw= 'RETURN'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFlowAccess().getRETURNKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1316:3: kw= 'BARRIER'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFlowAccess().getBARRIERKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMAL.g:1322:3: kw= 'CATCH'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFlowAccess().getCATCHKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMAL.g:1328:3: kw= 'LEAVE'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFlowAccess().getLEAVEKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMAL.g:1334:3: kw= 'REDO'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFlowAccess().getREDOKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMAL.g:1340:3: kw= 'RAISE'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFlowAccess().getRAISEKeyword_5());
                    		

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
    // InternalMAL.g:1349:1: entryRuleVarlist returns [EObject current=null] : iv_ruleVarlist= ruleVarlist EOF ;
    public final EObject entryRuleVarlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarlist = null;


        try {
            // InternalMAL.g:1349:48: (iv_ruleVarlist= ruleVarlist EOF )
            // InternalMAL.g:1350:2: iv_ruleVarlist= ruleVarlist EOF
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
    // InternalMAL.g:1356:1: ruleVarlist returns [EObject current=null] : ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) ) ;
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
            // InternalMAL.g:1362:2: ( ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) ) )
            // InternalMAL.g:1363:2: ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) )
            {
            // InternalMAL.g:1363:2: ( ( (lv_variables_0_0= ruleVariable ) ) | (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==29) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMAL.g:1364:3: ( (lv_variables_0_0= ruleVariable ) )
                    {
                    // InternalMAL.g:1364:3: ( (lv_variables_0_0= ruleVariable ) )
                    // InternalMAL.g:1365:4: (lv_variables_0_0= ruleVariable )
                    {
                    // InternalMAL.g:1365:4: (lv_variables_0_0= ruleVariable )
                    // InternalMAL.g:1366:5: lv_variables_0_0= ruleVariable
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
                    // InternalMAL.g:1384:3: (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' )
                    {
                    // InternalMAL.g:1384:3: (otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')' )
                    // InternalMAL.g:1385:4: otherlv_1= '(' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getVarlistAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMAL.g:1389:4: ( (lv_variables_2_0= ruleVariable ) )
                    // InternalMAL.g:1390:5: (lv_variables_2_0= ruleVariable )
                    {
                    // InternalMAL.g:1390:5: (lv_variables_2_0= ruleVariable )
                    // InternalMAL.g:1391:6: lv_variables_2_0= ruleVariable
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

                    // InternalMAL.g:1408:4: (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==32) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMAL.g:1409:5: otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getVarlistAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMAL.g:1413:5: ( (lv_variables_4_0= ruleVariable ) )
                    	    // InternalMAL.g:1414:6: (lv_variables_4_0= ruleVariable )
                    	    {
                    	    // InternalMAL.g:1414:6: (lv_variables_4_0= ruleVariable )
                    	    // InternalMAL.g:1415:7: lv_variables_4_0= ruleVariable
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMAL.g:1442:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMAL.g:1442:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMAL.g:1443:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMAL.g:1449:1: ruleVariable returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1455:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMAL.g:1456:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMAL.g:1456:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMAL.g:1457:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMAL.g:1457:3: (lv_identifier_0_0= RULE_ID )
            // InternalMAL.g:1458:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_identifier_0_0, grammarAccess.getVariableAccess().getIdentifierIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"identifier",
            					lv_identifier_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalMAL.g:1477:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalMAL.g:1477:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalMAL.g:1478:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalMAL.g:1484:1: ruleExpr returns [EObject current=null] : (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Fcncall_0 = null;

        EObject lv_left_factor_1_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_right_factor_3_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1490:2: ( (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) ) )
            // InternalMAL.g:1491:2: (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) )
            {
            // InternalMAL.g:1491:2: (this_Fcncall_0= ruleFcncall | ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||LA25_1==RULE_ID||(LA25_1>=15 && LA25_1<=17)||(LA25_1>=19 && LA25_1<=21)||(LA25_1>=23 && LA25_1<=27)||LA25_1==29||(LA25_1>=39 && LA25_1<=48)) ) {
                    alt25=2;
                }
                else if ( (LA25_1==31) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_OID)||LA25_0==49) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMAL.g:1492:3: this_Fcncall_0= ruleFcncall
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
                    // InternalMAL.g:1501:3: ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) )
                    {
                    // InternalMAL.g:1501:3: ( ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) ) )
                    // InternalMAL.g:1502:4: ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )? ( (lv_right_factor_3_0= ruleFactor ) )
                    {
                    // InternalMAL.g:1502:4: ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )?
                    int alt24=2;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // InternalMAL.g:1503:5: ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) )
                            {
                            // InternalMAL.g:1503:5: ( (lv_left_factor_1_0= ruleFactor ) )
                            // InternalMAL.g:1504:6: (lv_left_factor_1_0= ruleFactor )
                            {
                            // InternalMAL.g:1504:6: (lv_left_factor_1_0= ruleFactor )
                            // InternalMAL.g:1505:7: lv_left_factor_1_0= ruleFactor
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

                            // InternalMAL.g:1522:5: ( (lv_operator_2_0= ruleOperator ) )
                            // InternalMAL.g:1523:6: (lv_operator_2_0= ruleOperator )
                            {
                            // InternalMAL.g:1523:6: (lv_operator_2_0= ruleOperator )
                            // InternalMAL.g:1524:7: lv_operator_2_0= ruleOperator
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

                    // InternalMAL.g:1542:4: ( (lv_right_factor_3_0= ruleFactor ) )
                    // InternalMAL.g:1543:5: (lv_right_factor_3_0= ruleFactor )
                    {
                    // InternalMAL.g:1543:5: (lv_right_factor_3_0= ruleFactor )
                    // InternalMAL.g:1544:6: lv_right_factor_3_0= ruleFactor
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
    // InternalMAL.g:1566:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalMAL.g:1566:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalMAL.g:1567:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalMAL.g:1573:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMAL.g:1579:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalMAL.g:1580:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalMAL.g:1580:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt26=1;
                }
                break;
            case 46:
                {
                alt26=2;
                }
                break;
            case 47:
                {
                alt26=3;
                }
                break;
            case 48:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMAL.g:1581:3: kw= '+'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1587:3: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMAL.g:1593:3: kw= '*'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMAL.g:1599:3: kw= '/'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalMAL.g:1608:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMAL.g:1608:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMAL.g:1609:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalMAL.g:1615:1: ruleFactor returns [EObject current=null] : ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) | this_Variable_4= ruleVariable ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Variable_4 = null;



        	enterRule();

        try {
            // InternalMAL.g:1621:2: ( ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) | this_Variable_4= ruleVariable ) )
            // InternalMAL.g:1622:2: ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) | this_Variable_4= ruleVariable )
            {
            // InternalMAL.g:1622:2: ( ( () ruleLiteral_constant ) | ( () otherlv_3= 'NIL' ) | this_Variable_4= ruleVariable )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BIT:
            case RULE_CHR:
            case RULE_WRD:
            case RULE_INT:
            case RULE_OID:
                {
                alt27=1;
                }
                break;
            case 49:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMAL.g:1623:3: ( () ruleLiteral_constant )
                    {
                    // InternalMAL.g:1623:3: ( () ruleLiteral_constant )
                    // InternalMAL.g:1624:4: () ruleLiteral_constant
                    {
                    // InternalMAL.g:1624:4: ()
                    // InternalMAL.g:1625:5: 
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
                    // InternalMAL.g:1640:3: ( () otherlv_3= 'NIL' )
                    {
                    // InternalMAL.g:1640:3: ( () otherlv_3= 'NIL' )
                    // InternalMAL.g:1641:4: () otherlv_3= 'NIL'
                    {
                    // InternalMAL.g:1641:4: ()
                    // InternalMAL.g:1642:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFactorAccess().getFactorAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getNILKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1654:3: this_Variable_4= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getFactorAccess().getVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_4;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFcncall"
    // InternalMAL.g:1666:1: entryRuleFcncall returns [EObject current=null] : iv_ruleFcncall= ruleFcncall EOF ;
    public final EObject entryRuleFcncall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFcncall = null;


        try {
            // InternalMAL.g:1666:48: (iv_ruleFcncall= ruleFcncall EOF )
            // InternalMAL.g:1667:2: iv_ruleFcncall= ruleFcncall EOF
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
    // InternalMAL.g:1673:1: ruleFcncall returns [EObject current=null] : ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' ) ;
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
            // InternalMAL.g:1679:2: ( ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' ) )
            // InternalMAL.g:1680:2: ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' )
            {
            // InternalMAL.g:1680:2: ( ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')' )
            // InternalMAL.g:1681:3: ( (lv_module_0_0= ruleModuleName ) ) otherlv_1= '.' ( (lv_function_name_2_0= ruleName ) ) otherlv_3= '(' ( (lv_args_4_0= ruleArgs ) )? otherlv_5= ')'
            {
            // InternalMAL.g:1681:3: ( (lv_module_0_0= ruleModuleName ) )
            // InternalMAL.g:1682:4: (lv_module_0_0= ruleModuleName )
            {
            // InternalMAL.g:1682:4: (lv_module_0_0= ruleModuleName )
            // InternalMAL.g:1683:5: lv_module_0_0= ruleModuleName
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

            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFcncallAccess().getFullStopKeyword_1());
            		
            // InternalMAL.g:1704:3: ( (lv_function_name_2_0= ruleName ) )
            // InternalMAL.g:1705:4: (lv_function_name_2_0= ruleName )
            {
            // InternalMAL.g:1705:4: (lv_function_name_2_0= ruleName )
            // InternalMAL.g:1706:5: lv_function_name_2_0= ruleName
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

            otherlv_3=(Token)match(input,29,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getFcncallAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMAL.g:1727:3: ( (lv_args_4_0= ruleArgs ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_OID)||LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMAL.g:1728:4: (lv_args_4_0= ruleArgs )
                    {
                    // InternalMAL.g:1728:4: (lv_args_4_0= ruleArgs )
                    // InternalMAL.g:1729:5: lv_args_4_0= ruleArgs
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

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMAL.g:1754:1: entryRuleArgs returns [EObject current=null] : iv_ruleArgs= ruleArgs EOF ;
    public final EObject entryRuleArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgs = null;


        try {
            // InternalMAL.g:1754:45: (iv_ruleArgs= ruleArgs EOF )
            // InternalMAL.g:1755:2: iv_ruleArgs= ruleArgs EOF
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
    // InternalMAL.g:1761:1: ruleArgs returns [EObject current=null] : (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* ) ;
    public final EObject ruleArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Factor_0 = null;

        EObject lv_factor1_2_0 = null;



        	enterRule();

        try {
            // InternalMAL.g:1767:2: ( (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* ) )
            // InternalMAL.g:1768:2: (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* )
            {
            // InternalMAL.g:1768:2: (this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )* )
            // InternalMAL.g:1769:3: this_Factor_0= ruleFactor (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getArgsAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMAL.g:1777:3: (otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMAL.g:1778:4: otherlv_1= ',' ( (lv_factor1_2_0= ruleFactor ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_28); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMAL.g:1782:4: ( (lv_factor1_2_0= ruleFactor ) )
            	    // InternalMAL.g:1783:5: (lv_factor1_2_0= ruleFactor )
            	    {
            	    // InternalMAL.g:1783:5: (lv_factor1_2_0= ruleFactor )
            	    // InternalMAL.g:1784:6: lv_factor1_2_0= ruleFactor
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
            	    break loop29;
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
    // InternalMAL.g:1806:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // InternalMAL.g:1806:51: (iv_ruleModuleName= ruleModuleName EOF )
            // InternalMAL.g:1807:2: iv_ruleModuleName= ruleModuleName EOF
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
    // InternalMAL.g:1813:1: ruleModuleName returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;


        	enterRule();

        try {
            // InternalMAL.g:1819:2: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // InternalMAL.g:1820:2: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // InternalMAL.g:1820:2: ( (lv_identifier_0_0= RULE_ID ) )
            // InternalMAL.g:1821:3: (lv_identifier_0_0= RULE_ID )
            {
            // InternalMAL.g:1821:3: (lv_identifier_0_0= RULE_ID )
            // InternalMAL.g:1822:4: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_identifier_0_0, grammarAccess.getModuleNameAccess().getIdentifierIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModuleNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"identifier",
            					lv_identifier_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalMAL.g:1841:1: entryRuleLiteral_constant returns [String current=null] : iv_ruleLiteral_constant= ruleLiteral_constant EOF ;
    public final String entryRuleLiteral_constant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral_constant = null;


        try {
            // InternalMAL.g:1841:56: (iv_ruleLiteral_constant= ruleLiteral_constant EOF )
            // InternalMAL.g:1842:2: iv_ruleLiteral_constant= ruleLiteral_constant EOF
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
    // InternalMAL.g:1848:1: ruleLiteral_constant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR ) ;
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
            // InternalMAL.g:1854:2: ( (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR ) )
            // InternalMAL.g:1855:2: (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR )
            {
            // InternalMAL.g:1855:2: (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR )
            int alt30=8;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalMAL.g:1856:3: this_BIT_0= RULE_BIT
                    {
                    this_BIT_0=(Token)match(input,RULE_BIT,FOLLOW_2); 

                    			current.merge(this_BIT_0);
                    		

                    			newLeafNode(this_BIT_0, grammarAccess.getLiteral_constantAccess().getBITTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMAL.g:1864:3: this_Bte_1= ruleBte
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
                    // InternalMAL.g:1875:3: this_CHR_2= RULE_CHR
                    {
                    this_CHR_2=(Token)match(input,RULE_CHR,FOLLOW_2); 

                    			current.merge(this_CHR_2);
                    		

                    			newLeafNode(this_CHR_2, grammarAccess.getLiteral_constantAccess().getCHRTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMAL.g:1883:3: this_WRD_3= RULE_WRD
                    {
                    this_WRD_3=(Token)match(input,RULE_WRD,FOLLOW_2); 

                    			current.merge(this_WRD_3);
                    		

                    			newLeafNode(this_WRD_3, grammarAccess.getLiteral_constantAccess().getWRDTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMAL.g:1891:3: this_INT_4= RULE_INT
                    {
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_4);
                    		

                    			newLeafNode(this_INT_4, grammarAccess.getLiteral_constantAccess().getINTTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMAL.g:1899:3: this_OID_5= RULE_OID
                    {
                    this_OID_5=(Token)match(input,RULE_OID,FOLLOW_2); 

                    			current.merge(this_OID_5);
                    		

                    			newLeafNode(this_OID_5, grammarAccess.getLiteral_constantAccess().getOIDTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMAL.g:1907:3: this_FLT_6= ruleFLT
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
                    // InternalMAL.g:1918:3: this_STR_7= ruleSTR
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
    // InternalMAL.g:1932:1: entryRuleBte returns [String current=null] : iv_ruleBte= ruleBte EOF ;
    public final String entryRuleBte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBte = null;


        try {
            // InternalMAL.g:1932:43: (iv_ruleBte= ruleBte EOF )
            // InternalMAL.g:1933:2: iv_ruleBte= ruleBte EOF
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
    // InternalMAL.g:1939:1: ruleBte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT ) ;
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
            // InternalMAL.g:1945:2: ( (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT ) )
            // InternalMAL.g:1946:2: (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT )
            {
            // InternalMAL.g:1946:2: (this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT )
            // InternalMAL.g:1947:3: this_BIT_0= RULE_BIT this_BIT_1= RULE_BIT this_BIT_2= RULE_BIT this_BIT_3= RULE_BIT this_BIT_4= RULE_BIT this_BIT_5= RULE_BIT this_BIT_6= RULE_BIT this_BIT_7= RULE_BIT
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
    // InternalMAL.g:2007:1: entryRuleFLT returns [String current=null] : iv_ruleFLT= ruleFLT EOF ;
    public final String entryRuleFLT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLT = null;


        try {
            // InternalMAL.g:2007:43: (iv_ruleFLT= ruleFLT EOF )
            // InternalMAL.g:2008:2: iv_ruleFLT= ruleFLT EOF
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
    // InternalMAL.g:2014:1: ruleFLT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMAL.g:2020:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMAL.g:2021:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMAL.g:2021:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMAL.g:2022:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLTAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,31,FOLLOW_33); 

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
    // InternalMAL.g:2045:1: entryRuleSTR returns [String current=null] : iv_ruleSTR= ruleSTR EOF ;
    public final String entryRuleSTR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR = null;


        try {
            // InternalMAL.g:2045:43: (iv_ruleSTR= ruleSTR EOF )
            // InternalMAL.g:2046:2: iv_ruleSTR= ruleSTR EOF
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
    // InternalMAL.g:2052:1: ruleSTR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSTR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMAL.g:2058:2: (this_STRING_0= RULE_STRING )
            // InternalMAL.g:2059:2: this_STRING_0= RULE_STRING
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


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\uffff\10\13\5\uffff\1\13\4\uffff\1\13";
    static final String dfa_3s = "\11\4\1\6\2\uffff\1\11\1\6\1\4\4\6\1\4";
    static final String dfa_4s = "\1\61\10\60\1\6\2\uffff\1\11\1\6\1\60\4\6\1\60";
    static final String dfa_5s = "\12\uffff\1\1\1\2\10\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\1\6\1\1\1\2\1\3\1\4\1\5\46\uffff\1\7",
            "\1\13\1\uffff\1\11\10\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\1\uffff\1\14\7\uffff\6\13\4\12",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\13\12\uffff\3\13\1\uffff\3\13\1\uffff\5\13\1\uffff\1\13\11\uffff\6\13\4\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1502:4: ( ( (lv_left_factor_1_0= ruleFactor ) ) ( (lv_operator_2_0= ruleOperator ) ) )?";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\uffff\1\10\2\uffff\1\12\6\uffff";
    static final String dfa_10s = "\1\5\1\4\2\uffff\1\4\6\uffff";
    static final String dfa_11s = "\1\12\1\60\2\uffff\1\60\6\uffff";
    static final String dfa_12s = "\2\uffff\1\3\1\4\1\uffff\1\6\1\10\1\2\1\1\1\7\1\5";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\1\1\1\2\1\3\1\4\1\5",
            "\1\10\1\uffff\1\7\10\uffff\3\10\1\uffff\3\10\1\uffff\5\10\1\uffff\2\10\1\uffff\1\10\6\uffff\12\10",
            "",
            "",
            "\1\12\12\uffff\3\12\1\uffff\3\12\1\uffff\5\12\1\uffff\2\12\1\11\1\12\6\uffff\12\12",
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

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1855:2: (this_BIT_0= RULE_BIT | this_Bte_1= ruleBte | this_CHR_2= RULE_CHR | this_WRD_3= RULE_WRD | this_INT_4= RULE_INT | this_OID_5= RULE_OID | this_FLT_6= ruleFLT | this_STR_7= ruleSTR )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00001F802BBB0012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001F802FBB0010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00001FC02BBB0010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00020000000007F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00020000400007F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000200L});

}