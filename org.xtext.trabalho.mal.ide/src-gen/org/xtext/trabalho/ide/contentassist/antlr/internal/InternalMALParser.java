package org.xtext.trabalho.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.trabalho.services.MALGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMALParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BIT", "RULE_CHR", "RULE_WRD", "RULE_INT", "RULE_OID", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INLINE'", "'UNSAFE'", "'RETURN'", "'BARRIER'", "'CATCH'", "'LEAVE'", "'REDO'", "'RAISE'", "'+'", "'-'", "'*'", "'/'", "';'", "'MODULE'", "'ATOM'", "':'", "'INCLUDE'", "'COMMAND'", "'ADDRESS'", "'PATTERN'", "'FUNCTION'", "'END'", "'FACTORY'", "'COMMENT'", "'('", "')'", "'.'", "','", "'BAT'", "'['", "']'", "'_'", "':='", "'NIL'", "'any'"
    };
    public static final int T__19=19;
    public static final int RULE_BIT=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_WRD=7;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    public static final int RULE_CHR=6;
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

    	public void setGrammarAccess(MALGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMAL.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMAL.g:54:1: ( ruleProgram EOF )
            // InternalMAL.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMAL.g:62:1: ruleProgram : ( ( rule__Program__Group__0 )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:66:2: ( ( ( rule__Program__Group__0 )* ) )
            // InternalMAL.g:67:2: ( ( rule__Program__Group__0 )* )
            {
            // InternalMAL.g:67:2: ( ( rule__Program__Group__0 )* )
            // InternalMAL.g:68:3: ( rule__Program__Group__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMAL.g:69:3: ( rule__Program__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=15 && LA1_0<=22)||(LA1_0>=28 && LA1_0<=29)||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=34 && LA1_0<=35)||LA1_0==37||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMAL.g:69:4: rule__Program__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalMAL.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMAL.g:79:1: ( ruleStatement EOF )
            // InternalMAL.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMAL.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMAL.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMAL.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalMAL.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMAL.g:94:3: ( rule__Statement__Alternatives )
            // InternalMAL.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleModuleStmt"
    // InternalMAL.g:103:1: entryRuleModuleStmt : ruleModuleStmt EOF ;
    public final void entryRuleModuleStmt() throws RecognitionException {
        try {
            // InternalMAL.g:104:1: ( ruleModuleStmt EOF )
            // InternalMAL.g:105:1: ruleModuleStmt EOF
            {
             before(grammarAccess.getModuleStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleStmt();

            state._fsp--;

             after(grammarAccess.getModuleStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModuleStmt"


    // $ANTLR start "ruleModuleStmt"
    // InternalMAL.g:112:1: ruleModuleStmt : ( ( rule__ModuleStmt__Alternatives ) ) ;
    public final void ruleModuleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:116:2: ( ( ( rule__ModuleStmt__Alternatives ) ) )
            // InternalMAL.g:117:2: ( ( rule__ModuleStmt__Alternatives ) )
            {
            // InternalMAL.g:117:2: ( ( rule__ModuleStmt__Alternatives ) )
            // InternalMAL.g:118:3: ( rule__ModuleStmt__Alternatives )
            {
             before(grammarAccess.getModuleStmtAccess().getAlternatives()); 
            // InternalMAL.g:119:3: ( rule__ModuleStmt__Alternatives )
            // InternalMAL.g:119:4: rule__ModuleStmt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModuleStmtAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleStmt"


    // $ANTLR start "entryRuleIncludeStmt"
    // InternalMAL.g:128:1: entryRuleIncludeStmt : ruleIncludeStmt EOF ;
    public final void entryRuleIncludeStmt() throws RecognitionException {
        try {
            // InternalMAL.g:129:1: ( ruleIncludeStmt EOF )
            // InternalMAL.g:130:1: ruleIncludeStmt EOF
            {
             before(grammarAccess.getIncludeStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleIncludeStmt();

            state._fsp--;

             after(grammarAccess.getIncludeStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIncludeStmt"


    // $ANTLR start "ruleIncludeStmt"
    // InternalMAL.g:137:1: ruleIncludeStmt : ( ( rule__IncludeStmt__Alternatives ) ) ;
    public final void ruleIncludeStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:141:2: ( ( ( rule__IncludeStmt__Alternatives ) ) )
            // InternalMAL.g:142:2: ( ( rule__IncludeStmt__Alternatives ) )
            {
            // InternalMAL.g:142:2: ( ( rule__IncludeStmt__Alternatives ) )
            // InternalMAL.g:143:3: ( rule__IncludeStmt__Alternatives )
            {
             before(grammarAccess.getIncludeStmtAccess().getAlternatives()); 
            // InternalMAL.g:144:3: ( rule__IncludeStmt__Alternatives )
            // InternalMAL.g:144:4: rule__IncludeStmt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStmt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIncludeStmtAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncludeStmt"


    // $ANTLR start "entryRuleDefinition"
    // InternalMAL.g:153:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalMAL.g:154:1: ( ruleDefinition EOF )
            // InternalMAL.g:155:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMAL.g:162:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:166:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalMAL.g:167:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalMAL.g:167:2: ( ( rule__Definition__Alternatives ) )
            // InternalMAL.g:168:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalMAL.g:169:3: ( rule__Definition__Alternatives )
            // InternalMAL.g:169:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleHelpinfo"
    // InternalMAL.g:178:1: entryRuleHelpinfo : ruleHelpinfo EOF ;
    public final void entryRuleHelpinfo() throws RecognitionException {
        try {
            // InternalMAL.g:179:1: ( ruleHelpinfo EOF )
            // InternalMAL.g:180:1: ruleHelpinfo EOF
            {
             before(grammarAccess.getHelpinfoRule()); 
            pushFollow(FOLLOW_1);
            ruleHelpinfo();

            state._fsp--;

             after(grammarAccess.getHelpinfoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHelpinfo"


    // $ANTLR start "ruleHelpinfo"
    // InternalMAL.g:187:1: ruleHelpinfo : ( ( rule__Helpinfo__Group__0 ) ) ;
    public final void ruleHelpinfo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:191:2: ( ( ( rule__Helpinfo__Group__0 ) ) )
            // InternalMAL.g:192:2: ( ( rule__Helpinfo__Group__0 ) )
            {
            // InternalMAL.g:192:2: ( ( rule__Helpinfo__Group__0 ) )
            // InternalMAL.g:193:3: ( rule__Helpinfo__Group__0 )
            {
             before(grammarAccess.getHelpinfoAccess().getGroup()); 
            // InternalMAL.g:194:3: ( rule__Helpinfo__Group__0 )
            // InternalMAL.g:194:4: rule__Helpinfo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Helpinfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelpinfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHelpinfo"


    // $ANTLR start "entryRuleHeader"
    // InternalMAL.g:203:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalMAL.g:204:1: ( ruleHeader EOF )
            // InternalMAL.g:205:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalMAL.g:212:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:216:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalMAL.g:217:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalMAL.g:217:2: ( ( rule__Header__Group__0 ) )
            // InternalMAL.g:218:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalMAL.g:219:3: ( rule__Header__Group__0 )
            // InternalMAL.g:219:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleName"
    // InternalMAL.g:228:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalMAL.g:229:1: ( ruleName EOF )
            // InternalMAL.g:230:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMAL.g:237:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:241:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalMAL.g:242:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalMAL.g:242:2: ( ( rule__Name__Group__0 ) )
            // InternalMAL.g:243:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalMAL.g:244:3: ( rule__Name__Group__0 )
            // InternalMAL.g:244:4: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleResult"
    // InternalMAL.g:253:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalMAL.g:254:1: ( ruleResult EOF )
            // InternalMAL.g:255:1: ruleResult EOF
            {
             before(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalMAL.g:262:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:266:2: ( ( ( rule__Result__Alternatives ) ) )
            // InternalMAL.g:267:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalMAL.g:267:2: ( ( rule__Result__Alternatives ) )
            // InternalMAL.g:268:3: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // InternalMAL.g:269:3: ( rule__Result__Alternatives )
            // InternalMAL.g:269:4: rule__Result__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Result__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParams"
    // InternalMAL.g:278:1: entryRuleParams : ruleParams EOF ;
    public final void entryRuleParams() throws RecognitionException {
        try {
            // InternalMAL.g:279:1: ( ruleParams EOF )
            // InternalMAL.g:280:1: ruleParams EOF
            {
             before(grammarAccess.getParamsRule()); 
            pushFollow(FOLLOW_1);
            ruleParams();

            state._fsp--;

             after(grammarAccess.getParamsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // InternalMAL.g:287:1: ruleParams : ( ( rule__Params__Group__0 ) ) ;
    public final void ruleParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:291:2: ( ( ( rule__Params__Group__0 ) ) )
            // InternalMAL.g:292:2: ( ( rule__Params__Group__0 ) )
            {
            // InternalMAL.g:292:2: ( ( rule__Params__Group__0 ) )
            // InternalMAL.g:293:3: ( rule__Params__Group__0 )
            {
             before(grammarAccess.getParamsAccess().getGroup()); 
            // InternalMAL.g:294:3: ( rule__Params__Group__0 )
            // InternalMAL.g:294:4: rule__Params__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleBinding"
    // InternalMAL.g:303:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalMAL.g:304:1: ( ruleBinding EOF )
            // InternalMAL.g:305:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalMAL.g:312:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:316:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalMAL.g:317:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalMAL.g:317:2: ( ( rule__Binding__Group__0 ) )
            // InternalMAL.g:318:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalMAL.g:319:3: ( rule__Binding__Group__0 )
            // InternalMAL.g:319:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleTypeName"
    // InternalMAL.g:328:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // InternalMAL.g:329:1: ( ruleTypeName EOF )
            // InternalMAL.g:330:1: ruleTypeName EOF
            {
             before(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalMAL.g:337:1: ruleTypeName : ( ( rule__TypeName__Alternatives ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:341:2: ( ( ( rule__TypeName__Alternatives ) ) )
            // InternalMAL.g:342:2: ( ( rule__TypeName__Alternatives ) )
            {
            // InternalMAL.g:342:2: ( ( rule__TypeName__Alternatives ) )
            // InternalMAL.g:343:3: ( rule__TypeName__Alternatives )
            {
             before(grammarAccess.getTypeNameAccess().getAlternatives()); 
            // InternalMAL.g:344:3: ( rule__TypeName__Alternatives )
            // InternalMAL.g:344:4: rule__TypeName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleScalarType"
    // InternalMAL.g:353:1: entryRuleScalarType : ruleScalarType EOF ;
    public final void entryRuleScalarType() throws RecognitionException {
        try {
            // InternalMAL.g:354:1: ( ruleScalarType EOF )
            // InternalMAL.g:355:1: ruleScalarType EOF
            {
             before(grammarAccess.getScalarTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleScalarType();

            state._fsp--;

             after(grammarAccess.getScalarTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScalarType"


    // $ANTLR start "ruleScalarType"
    // InternalMAL.g:362:1: ruleScalarType : ( ( rule__ScalarType__Group__0 ) ) ;
    public final void ruleScalarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:366:2: ( ( ( rule__ScalarType__Group__0 ) ) )
            // InternalMAL.g:367:2: ( ( rule__ScalarType__Group__0 ) )
            {
            // InternalMAL.g:367:2: ( ( rule__ScalarType__Group__0 ) )
            // InternalMAL.g:368:3: ( rule__ScalarType__Group__0 )
            {
             before(grammarAccess.getScalarTypeAccess().getGroup()); 
            // InternalMAL.g:369:3: ( rule__ScalarType__Group__0 )
            // InternalMAL.g:369:4: rule__ScalarType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScalarType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScalarTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScalarType"


    // $ANTLR start "entryRuleColumnType"
    // InternalMAL.g:378:1: entryRuleColumnType : ruleColumnType EOF ;
    public final void entryRuleColumnType() throws RecognitionException {
        try {
            // InternalMAL.g:379:1: ( ruleColumnType EOF )
            // InternalMAL.g:380:1: ruleColumnType EOF
            {
             before(grammarAccess.getColumnTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnType();

            state._fsp--;

             after(grammarAccess.getColumnTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnType"


    // $ANTLR start "ruleColumnType"
    // InternalMAL.g:387:1: ruleColumnType : ( ( rule__ColumnType__Group__0 ) ) ;
    public final void ruleColumnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:391:2: ( ( ( rule__ColumnType__Group__0 ) ) )
            // InternalMAL.g:392:2: ( ( rule__ColumnType__Group__0 ) )
            {
            // InternalMAL.g:392:2: ( ( rule__ColumnType__Group__0 ) )
            // InternalMAL.g:393:3: ( rule__ColumnType__Group__0 )
            {
             before(grammarAccess.getColumnTypeAccess().getGroup()); 
            // InternalMAL.g:394:3: ( rule__ColumnType__Group__0 )
            // InternalMAL.g:394:4: rule__ColumnType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "entryRuleColElmType"
    // InternalMAL.g:403:1: entryRuleColElmType : ruleColElmType EOF ;
    public final void entryRuleColElmType() throws RecognitionException {
        try {
            // InternalMAL.g:404:1: ( ruleColElmType EOF )
            // InternalMAL.g:405:1: ruleColElmType EOF
            {
             before(grammarAccess.getColElmTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleColElmType();

            state._fsp--;

             after(grammarAccess.getColElmTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColElmType"


    // $ANTLR start "ruleColElmType"
    // InternalMAL.g:412:1: ruleColElmType : ( ( rule__ColElmType__Alternatives ) ) ;
    public final void ruleColElmType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:416:2: ( ( ( rule__ColElmType__Alternatives ) ) )
            // InternalMAL.g:417:2: ( ( rule__ColElmType__Alternatives ) )
            {
            // InternalMAL.g:417:2: ( ( rule__ColElmType__Alternatives ) )
            // InternalMAL.g:418:3: ( rule__ColElmType__Alternatives )
            {
             before(grammarAccess.getColElmTypeAccess().getAlternatives()); 
            // InternalMAL.g:419:3: ( rule__ColElmType__Alternatives )
            // InternalMAL.g:419:4: rule__ColElmType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColElmType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColElmTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColElmType"


    // $ANTLR start "entryRuleAnyType"
    // InternalMAL.g:428:1: entryRuleAnyType : ruleAnyType EOF ;
    public final void entryRuleAnyType() throws RecognitionException {
        try {
            // InternalMAL.g:429:1: ( ruleAnyType EOF )
            // InternalMAL.g:430:1: ruleAnyType EOF
            {
             before(grammarAccess.getAnyTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyType();

            state._fsp--;

             after(grammarAccess.getAnyTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyType"


    // $ANTLR start "ruleAnyType"
    // InternalMAL.g:437:1: ruleAnyType : ( ( rule__AnyType__Group__0 ) ) ;
    public final void ruleAnyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:441:2: ( ( ( rule__AnyType__Group__0 ) ) )
            // InternalMAL.g:442:2: ( ( rule__AnyType__Group__0 ) )
            {
            // InternalMAL.g:442:2: ( ( rule__AnyType__Group__0 ) )
            // InternalMAL.g:443:3: ( rule__AnyType__Group__0 )
            {
             before(grammarAccess.getAnyTypeAccess().getGroup()); 
            // InternalMAL.g:444:3: ( rule__AnyType__Group__0 )
            // InternalMAL.g:444:4: rule__AnyType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyType"


    // $ANTLR start "entryRuleStmt"
    // InternalMAL.g:453:1: entryRuleStmt : ruleStmt EOF ;
    public final void entryRuleStmt() throws RecognitionException {
        try {
            // InternalMAL.g:454:1: ( ruleStmt EOF )
            // InternalMAL.g:455:1: ruleStmt EOF
            {
             before(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleStmt();

            state._fsp--;

             after(grammarAccess.getStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMAL.g:462:1: ruleStmt : ( ( rule__Stmt__Group__0 ) ) ;
    public final void ruleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:466:2: ( ( ( rule__Stmt__Group__0 ) ) )
            // InternalMAL.g:467:2: ( ( rule__Stmt__Group__0 ) )
            {
            // InternalMAL.g:467:2: ( ( rule__Stmt__Group__0 ) )
            // InternalMAL.g:468:3: ( rule__Stmt__Group__0 )
            {
             before(grammarAccess.getStmtAccess().getGroup()); 
            // InternalMAL.g:469:3: ( rule__Stmt__Group__0 )
            // InternalMAL.g:469:4: rule__Stmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleFlow"
    // InternalMAL.g:478:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // InternalMAL.g:479:1: ( ruleFlow EOF )
            // InternalMAL.g:480:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // InternalMAL.g:487:1: ruleFlow : ( ( rule__Flow__Alternatives ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:491:2: ( ( ( rule__Flow__Alternatives ) ) )
            // InternalMAL.g:492:2: ( ( rule__Flow__Alternatives ) )
            {
            // InternalMAL.g:492:2: ( ( rule__Flow__Alternatives ) )
            // InternalMAL.g:493:3: ( rule__Flow__Alternatives )
            {
             before(grammarAccess.getFlowAccess().getAlternatives()); 
            // InternalMAL.g:494:3: ( rule__Flow__Alternatives )
            // InternalMAL.g:494:4: rule__Flow__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Flow__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleVarlist"
    // InternalMAL.g:503:1: entryRuleVarlist : ruleVarlist EOF ;
    public final void entryRuleVarlist() throws RecognitionException {
        try {
            // InternalMAL.g:504:1: ( ruleVarlist EOF )
            // InternalMAL.g:505:1: ruleVarlist EOF
            {
             before(grammarAccess.getVarlistRule()); 
            pushFollow(FOLLOW_1);
            ruleVarlist();

            state._fsp--;

             after(grammarAccess.getVarlistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarlist"


    // $ANTLR start "ruleVarlist"
    // InternalMAL.g:512:1: ruleVarlist : ( ( rule__Varlist__Alternatives ) ) ;
    public final void ruleVarlist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:516:2: ( ( ( rule__Varlist__Alternatives ) ) )
            // InternalMAL.g:517:2: ( ( rule__Varlist__Alternatives ) )
            {
            // InternalMAL.g:517:2: ( ( rule__Varlist__Alternatives ) )
            // InternalMAL.g:518:3: ( rule__Varlist__Alternatives )
            {
             before(grammarAccess.getVarlistAccess().getAlternatives()); 
            // InternalMAL.g:519:3: ( rule__Varlist__Alternatives )
            // InternalMAL.g:519:4: rule__Varlist__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Varlist__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVarlistAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarlist"


    // $ANTLR start "entryRuleVariable"
    // InternalMAL.g:528:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMAL.g:529:1: ( ruleVariable EOF )
            // InternalMAL.g:530:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMAL.g:537:1: ruleVariable : ( ( rule__Variable__IdentifierAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:541:2: ( ( ( rule__Variable__IdentifierAssignment ) ) )
            // InternalMAL.g:542:2: ( ( rule__Variable__IdentifierAssignment ) )
            {
            // InternalMAL.g:542:2: ( ( rule__Variable__IdentifierAssignment ) )
            // InternalMAL.g:543:3: ( rule__Variable__IdentifierAssignment )
            {
             before(grammarAccess.getVariableAccess().getIdentifierAssignment()); 
            // InternalMAL.g:544:3: ( rule__Variable__IdentifierAssignment )
            // InternalMAL.g:544:4: rule__Variable__IdentifierAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__IdentifierAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getIdentifierAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpr"
    // InternalMAL.g:553:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalMAL.g:554:1: ( ruleExpr EOF )
            // InternalMAL.g:555:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMAL.g:562:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:566:2: ( ( ( rule__Expr__Alternatives ) ) )
            // InternalMAL.g:567:2: ( ( rule__Expr__Alternatives ) )
            {
            // InternalMAL.g:567:2: ( ( rule__Expr__Alternatives ) )
            // InternalMAL.g:568:3: ( rule__Expr__Alternatives )
            {
             before(grammarAccess.getExprAccess().getAlternatives()); 
            // InternalMAL.g:569:3: ( rule__Expr__Alternatives )
            // InternalMAL.g:569:4: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOperator"
    // InternalMAL.g:578:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalMAL.g:579:1: ( ruleOperator EOF )
            // InternalMAL.g:580:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMAL.g:587:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:591:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMAL.g:592:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMAL.g:592:2: ( ( rule__Operator__Alternatives ) )
            // InternalMAL.g:593:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMAL.g:594:3: ( rule__Operator__Alternatives )
            // InternalMAL.g:594:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleFactor"
    // InternalMAL.g:603:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMAL.g:604:1: ( ruleFactor EOF )
            // InternalMAL.g:605:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMAL.g:612:1: ruleFactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:616:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalMAL.g:617:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalMAL.g:617:2: ( ( rule__Factor__Alternatives ) )
            // InternalMAL.g:618:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalMAL.g:619:3: ( rule__Factor__Alternatives )
            // InternalMAL.g:619:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFcncall"
    // InternalMAL.g:628:1: entryRuleFcncall : ruleFcncall EOF ;
    public final void entryRuleFcncall() throws RecognitionException {
        try {
            // InternalMAL.g:629:1: ( ruleFcncall EOF )
            // InternalMAL.g:630:1: ruleFcncall EOF
            {
             before(grammarAccess.getFcncallRule()); 
            pushFollow(FOLLOW_1);
            ruleFcncall();

            state._fsp--;

             after(grammarAccess.getFcncallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFcncall"


    // $ANTLR start "ruleFcncall"
    // InternalMAL.g:637:1: ruleFcncall : ( ( rule__Fcncall__Group__0 ) ) ;
    public final void ruleFcncall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:641:2: ( ( ( rule__Fcncall__Group__0 ) ) )
            // InternalMAL.g:642:2: ( ( rule__Fcncall__Group__0 ) )
            {
            // InternalMAL.g:642:2: ( ( rule__Fcncall__Group__0 ) )
            // InternalMAL.g:643:3: ( rule__Fcncall__Group__0 )
            {
             before(grammarAccess.getFcncallAccess().getGroup()); 
            // InternalMAL.g:644:3: ( rule__Fcncall__Group__0 )
            // InternalMAL.g:644:4: rule__Fcncall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fcncall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFcncallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFcncall"


    // $ANTLR start "entryRuleArgs"
    // InternalMAL.g:653:1: entryRuleArgs : ruleArgs EOF ;
    public final void entryRuleArgs() throws RecognitionException {
        try {
            // InternalMAL.g:654:1: ( ruleArgs EOF )
            // InternalMAL.g:655:1: ruleArgs EOF
            {
             before(grammarAccess.getArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getArgsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgs"


    // $ANTLR start "ruleArgs"
    // InternalMAL.g:662:1: ruleArgs : ( ( rule__Args__Group__0 ) ) ;
    public final void ruleArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:666:2: ( ( ( rule__Args__Group__0 ) ) )
            // InternalMAL.g:667:2: ( ( rule__Args__Group__0 ) )
            {
            // InternalMAL.g:667:2: ( ( rule__Args__Group__0 ) )
            // InternalMAL.g:668:3: ( rule__Args__Group__0 )
            {
             before(grammarAccess.getArgsAccess().getGroup()); 
            // InternalMAL.g:669:3: ( rule__Args__Group__0 )
            // InternalMAL.g:669:4: rule__Args__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Args__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgs"


    // $ANTLR start "entryRuleModuleName"
    // InternalMAL.g:678:1: entryRuleModuleName : ruleModuleName EOF ;
    public final void entryRuleModuleName() throws RecognitionException {
        try {
            // InternalMAL.g:679:1: ( ruleModuleName EOF )
            // InternalMAL.g:680:1: ruleModuleName EOF
            {
             before(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_1);
            ruleModuleName();

            state._fsp--;

             after(grammarAccess.getModuleNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModuleName"


    // $ANTLR start "ruleModuleName"
    // InternalMAL.g:687:1: ruleModuleName : ( ( rule__ModuleName__IdentifierAssignment ) ) ;
    public final void ruleModuleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:691:2: ( ( ( rule__ModuleName__IdentifierAssignment ) ) )
            // InternalMAL.g:692:2: ( ( rule__ModuleName__IdentifierAssignment ) )
            {
            // InternalMAL.g:692:2: ( ( rule__ModuleName__IdentifierAssignment ) )
            // InternalMAL.g:693:3: ( rule__ModuleName__IdentifierAssignment )
            {
             before(grammarAccess.getModuleNameAccess().getIdentifierAssignment()); 
            // InternalMAL.g:694:3: ( rule__ModuleName__IdentifierAssignment )
            // InternalMAL.g:694:4: rule__ModuleName__IdentifierAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ModuleName__IdentifierAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModuleNameAccess().getIdentifierAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleName"


    // $ANTLR start "entryRuleLiteral_constant"
    // InternalMAL.g:703:1: entryRuleLiteral_constant : ruleLiteral_constant EOF ;
    public final void entryRuleLiteral_constant() throws RecognitionException {
        try {
            // InternalMAL.g:704:1: ( ruleLiteral_constant EOF )
            // InternalMAL.g:705:1: ruleLiteral_constant EOF
            {
             before(grammarAccess.getLiteral_constantRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral_constant();

            state._fsp--;

             after(grammarAccess.getLiteral_constantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral_constant"


    // $ANTLR start "ruleLiteral_constant"
    // InternalMAL.g:712:1: ruleLiteral_constant : ( ( rule__Literal_constant__Alternatives ) ) ;
    public final void ruleLiteral_constant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:716:2: ( ( ( rule__Literal_constant__Alternatives ) ) )
            // InternalMAL.g:717:2: ( ( rule__Literal_constant__Alternatives ) )
            {
            // InternalMAL.g:717:2: ( ( rule__Literal_constant__Alternatives ) )
            // InternalMAL.g:718:3: ( rule__Literal_constant__Alternatives )
            {
             before(grammarAccess.getLiteral_constantAccess().getAlternatives()); 
            // InternalMAL.g:719:3: ( rule__Literal_constant__Alternatives )
            // InternalMAL.g:719:4: rule__Literal_constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal_constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteral_constantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral_constant"


    // $ANTLR start "entryRuleBte"
    // InternalMAL.g:728:1: entryRuleBte : ruleBte EOF ;
    public final void entryRuleBte() throws RecognitionException {
        try {
            // InternalMAL.g:729:1: ( ruleBte EOF )
            // InternalMAL.g:730:1: ruleBte EOF
            {
             before(grammarAccess.getBteRule()); 
            pushFollow(FOLLOW_1);
            ruleBte();

            state._fsp--;

             after(grammarAccess.getBteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBte"


    // $ANTLR start "ruleBte"
    // InternalMAL.g:737:1: ruleBte : ( ( rule__Bte__Group__0 ) ) ;
    public final void ruleBte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:741:2: ( ( ( rule__Bte__Group__0 ) ) )
            // InternalMAL.g:742:2: ( ( rule__Bte__Group__0 ) )
            {
            // InternalMAL.g:742:2: ( ( rule__Bte__Group__0 ) )
            // InternalMAL.g:743:3: ( rule__Bte__Group__0 )
            {
             before(grammarAccess.getBteAccess().getGroup()); 
            // InternalMAL.g:744:3: ( rule__Bte__Group__0 )
            // InternalMAL.g:744:4: rule__Bte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBte"


    // $ANTLR start "entryRuleFLT"
    // InternalMAL.g:753:1: entryRuleFLT : ruleFLT EOF ;
    public final void entryRuleFLT() throws RecognitionException {
        try {
            // InternalMAL.g:754:1: ( ruleFLT EOF )
            // InternalMAL.g:755:1: ruleFLT EOF
            {
             before(grammarAccess.getFLTRule()); 
            pushFollow(FOLLOW_1);
            ruleFLT();

            state._fsp--;

             after(grammarAccess.getFLTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLT"


    // $ANTLR start "ruleFLT"
    // InternalMAL.g:762:1: ruleFLT : ( ( rule__FLT__Group__0 ) ) ;
    public final void ruleFLT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:766:2: ( ( ( rule__FLT__Group__0 ) ) )
            // InternalMAL.g:767:2: ( ( rule__FLT__Group__0 ) )
            {
            // InternalMAL.g:767:2: ( ( rule__FLT__Group__0 ) )
            // InternalMAL.g:768:3: ( rule__FLT__Group__0 )
            {
             before(grammarAccess.getFLTAccess().getGroup()); 
            // InternalMAL.g:769:3: ( rule__FLT__Group__0 )
            // InternalMAL.g:769:4: rule__FLT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLT"


    // $ANTLR start "entryRuleSTR"
    // InternalMAL.g:778:1: entryRuleSTR : ruleSTR EOF ;
    public final void entryRuleSTR() throws RecognitionException {
        try {
            // InternalMAL.g:779:1: ( ruleSTR EOF )
            // InternalMAL.g:780:1: ruleSTR EOF
            {
             before(grammarAccess.getSTRRule()); 
            pushFollow(FOLLOW_1);
            ruleSTR();

            state._fsp--;

             after(grammarAccess.getSTRRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSTR"


    // $ANTLR start "ruleSTR"
    // InternalMAL.g:787:1: ruleSTR : ( RULE_STRING ) ;
    public final void ruleSTR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:791:2: ( ( RULE_STRING ) )
            // InternalMAL.g:792:2: ( RULE_STRING )
            {
            // InternalMAL.g:792:2: ( RULE_STRING )
            // InternalMAL.g:793:3: RULE_STRING
            {
             before(grammarAccess.getSTRAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSTRAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTR"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMAL.g:802:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIncludeStmt ) | ( ruleStmt ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:806:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIncludeStmt ) | ( ruleStmt ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
                {
                alt2=1;
                }
                break;
            case 15:
            case 16:
            case 32:
            case 34:
            case 35:
            case 37:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 39:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMAL.g:807:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalMAL.g:807:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalMAL.g:808:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalMAL.g:809:3: ( rule__Statement__Group_0__0 )
                    // InternalMAL.g:809:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:813:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalMAL.g:813:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalMAL.g:814:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalMAL.g:815:3: ( rule__Statement__Group_1__0 )
                    // InternalMAL.g:815:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:819:2: ( ruleIncludeStmt )
                    {
                    // InternalMAL.g:819:2: ( ruleIncludeStmt )
                    // InternalMAL.g:820:3: ruleIncludeStmt
                    {
                     before(grammarAccess.getStatementAccess().getIncludeStmtParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIncludeStmt();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIncludeStmtParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:825:2: ( ruleStmt )
                    {
                    // InternalMAL.g:825:2: ( ruleStmt )
                    // InternalMAL.g:826:3: ruleStmt
                    {
                     before(grammarAccess.getStatementAccess().getStmtParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStmt();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStmtParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__ModuleStmt__Alternatives"
    // InternalMAL.g:835:1: rule__ModuleStmt__Alternatives : ( ( ( rule__ModuleStmt__Group_0__0 ) ) | ( ( rule__ModuleStmt__Group_1__0 ) ) );
    public final void rule__ModuleStmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:839:1: ( ( ( rule__ModuleStmt__Group_0__0 ) ) | ( ( rule__ModuleStmt__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMAL.g:840:2: ( ( rule__ModuleStmt__Group_0__0 ) )
                    {
                    // InternalMAL.g:840:2: ( ( rule__ModuleStmt__Group_0__0 ) )
                    // InternalMAL.g:841:3: ( rule__ModuleStmt__Group_0__0 )
                    {
                     before(grammarAccess.getModuleStmtAccess().getGroup_0()); 
                    // InternalMAL.g:842:3: ( rule__ModuleStmt__Group_0__0 )
                    // InternalMAL.g:842:4: rule__ModuleStmt__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleStmt__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleStmtAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:846:2: ( ( rule__ModuleStmt__Group_1__0 ) )
                    {
                    // InternalMAL.g:846:2: ( ( rule__ModuleStmt__Group_1__0 ) )
                    // InternalMAL.g:847:3: ( rule__ModuleStmt__Group_1__0 )
                    {
                     before(grammarAccess.getModuleStmtAccess().getGroup_1()); 
                    // InternalMAL.g:848:3: ( rule__ModuleStmt__Group_1__0 )
                    // InternalMAL.g:848:4: rule__ModuleStmt__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleStmt__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleStmtAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Alternatives"


    // $ANTLR start "rule__IncludeStmt__Alternatives"
    // InternalMAL.g:856:1: rule__IncludeStmt__Alternatives : ( ( ( rule__IncludeStmt__Group_0__0 ) ) | ( ( rule__IncludeStmt__Group_1__0 ) ) );
    public final void rule__IncludeStmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:860:1: ( ( ( rule__IncludeStmt__Group_0__0 ) ) | ( ( rule__IncludeStmt__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMAL.g:861:2: ( ( rule__IncludeStmt__Group_0__0 ) )
                    {
                    // InternalMAL.g:861:2: ( ( rule__IncludeStmt__Group_0__0 ) )
                    // InternalMAL.g:862:3: ( rule__IncludeStmt__Group_0__0 )
                    {
                     before(grammarAccess.getIncludeStmtAccess().getGroup_0()); 
                    // InternalMAL.g:863:3: ( rule__IncludeStmt__Group_0__0 )
                    // InternalMAL.g:863:4: rule__IncludeStmt__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IncludeStmt__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIncludeStmtAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:867:2: ( ( rule__IncludeStmt__Group_1__0 ) )
                    {
                    // InternalMAL.g:867:2: ( ( rule__IncludeStmt__Group_1__0 ) )
                    // InternalMAL.g:868:3: ( rule__IncludeStmt__Group_1__0 )
                    {
                     before(grammarAccess.getIncludeStmtAccess().getGroup_1()); 
                    // InternalMAL.g:869:3: ( rule__IncludeStmt__Group_1__0 )
                    // InternalMAL.g:869:4: rule__IncludeStmt__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IncludeStmt__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIncludeStmtAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Alternatives"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalMAL.g:877:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:881:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt5=1;
                    }
                    break;
                case 34:
                    {
                    alt5=2;
                    }
                    break;
                case 35:
                    {
                    alt5=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 15:
            case 35:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMAL.g:882:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalMAL.g:882:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalMAL.g:883:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalMAL.g:884:3: ( rule__Definition__Group_0__0 )
                    // InternalMAL.g:884:4: rule__Definition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:888:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalMAL.g:888:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalMAL.g:889:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalMAL.g:890:3: ( rule__Definition__Group_1__0 )
                    // InternalMAL.g:890:4: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:894:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalMAL.g:894:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalMAL.g:895:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalMAL.g:896:3: ( rule__Definition__Group_2__0 )
                    // InternalMAL.g:896:4: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:900:2: ( ( rule__Definition__Group_3__0 ) )
                    {
                    // InternalMAL.g:900:2: ( ( rule__Definition__Group_3__0 ) )
                    // InternalMAL.g:901:3: ( rule__Definition__Group_3__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_3()); 
                    // InternalMAL.g:902:3: ( rule__Definition__Group_3__0 )
                    // InternalMAL.g:902:4: rule__Definition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Definition__Alternatives_2_0"
    // InternalMAL.g:910:1: rule__Definition__Alternatives_2_0 : ( ( 'INLINE' ) | ( 'UNSAFE' ) );
    public final void rule__Definition__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:914:1: ( ( 'INLINE' ) | ( 'UNSAFE' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMAL.g:915:2: ( 'INLINE' )
                    {
                    // InternalMAL.g:915:2: ( 'INLINE' )
                    // InternalMAL.g:916:3: 'INLINE'
                    {
                     before(grammarAccess.getDefinitionAccess().getINLINEKeyword_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getINLINEKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:921:2: ( 'UNSAFE' )
                    {
                    // InternalMAL.g:921:2: ( 'UNSAFE' )
                    // InternalMAL.g:922:3: 'UNSAFE'
                    {
                     before(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives_2_0"


    // $ANTLR start "rule__Result__Alternatives"
    // InternalMAL.g:931:1: rule__Result__Alternatives : ( ( ruleTypeName ) | ( ( rule__Result__Group_1__0 ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:935:1: ( ( ruleTypeName ) | ( ( rule__Result__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMAL.g:936:2: ( ruleTypeName )
                    {
                    // InternalMAL.g:936:2: ( ruleTypeName )
                    // InternalMAL.g:937:3: ruleTypeName
                    {
                     before(grammarAccess.getResultAccess().getTypeNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeName();

                    state._fsp--;

                     after(grammarAccess.getResultAccess().getTypeNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:942:2: ( ( rule__Result__Group_1__0 ) )
                    {
                    // InternalMAL.g:942:2: ( ( rule__Result__Group_1__0 ) )
                    // InternalMAL.g:943:3: ( rule__Result__Group_1__0 )
                    {
                     before(grammarAccess.getResultAccess().getGroup_1()); 
                    // InternalMAL.g:944:3: ( rule__Result__Group_1__0 )
                    // InternalMAL.g:944:4: rule__Result__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Result__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResultAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Alternatives"


    // $ANTLR start "rule__TypeName__Alternatives"
    // InternalMAL.g:952:1: rule__TypeName__Alternatives : ( ( ruleScalarType ) | ( ruleColumnType ) | ( ( rule__TypeName__Group_2__0 ) ) );
    public final void rule__TypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:956:1: ( ( ruleScalarType ) | ( ruleColumnType ) | ( ( rule__TypeName__Group_2__0 ) ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt8=1;
                    }
                    break;
                case 49:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMAL.g:957:2: ( ruleScalarType )
                    {
                    // InternalMAL.g:957:2: ( ruleScalarType )
                    // InternalMAL.g:958:3: ruleScalarType
                    {
                     before(grammarAccess.getTypeNameAccess().getScalarTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScalarType();

                    state._fsp--;

                     after(grammarAccess.getTypeNameAccess().getScalarTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:963:2: ( ruleColumnType )
                    {
                    // InternalMAL.g:963:2: ( ruleColumnType )
                    // InternalMAL.g:964:3: ruleColumnType
                    {
                     before(grammarAccess.getTypeNameAccess().getColumnTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnType();

                    state._fsp--;

                     after(grammarAccess.getTypeNameAccess().getColumnTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:969:2: ( ( rule__TypeName__Group_2__0 ) )
                    {
                    // InternalMAL.g:969:2: ( ( rule__TypeName__Group_2__0 ) )
                    // InternalMAL.g:970:3: ( rule__TypeName__Group_2__0 )
                    {
                     before(grammarAccess.getTypeNameAccess().getGroup_2()); 
                    // InternalMAL.g:971:3: ( rule__TypeName__Group_2__0 )
                    // InternalMAL.g:971:4: rule__TypeName__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeName__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeNameAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Alternatives"


    // $ANTLR start "rule__ColElmType__Alternatives"
    // InternalMAL.g:979:1: rule__ColElmType__Alternatives : ( ( ruleScalarType ) | ( ruleAnyType ) );
    public final void rule__ColElmType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:983:1: ( ( ruleScalarType ) | ( ruleAnyType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==49) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMAL.g:984:2: ( ruleScalarType )
                    {
                    // InternalMAL.g:984:2: ( ruleScalarType )
                    // InternalMAL.g:985:3: ruleScalarType
                    {
                     before(grammarAccess.getColElmTypeAccess().getScalarTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScalarType();

                    state._fsp--;

                     after(grammarAccess.getColElmTypeAccess().getScalarTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:990:2: ( ruleAnyType )
                    {
                    // InternalMAL.g:990:2: ( ruleAnyType )
                    // InternalMAL.g:991:3: ruleAnyType
                    {
                     before(grammarAccess.getColElmTypeAccess().getAnyTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAnyType();

                    state._fsp--;

                     after(grammarAccess.getColElmTypeAccess().getAnyTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColElmType__Alternatives"


    // $ANTLR start "rule__Flow__Alternatives"
    // InternalMAL.g:1000:1: rule__Flow__Alternatives : ( ( 'RETURN' ) | ( 'BARRIER' ) | ( 'CATCH' ) | ( 'LEAVE' ) | ( 'REDO' ) | ( 'RAISE' ) );
    public final void rule__Flow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1004:1: ( ( 'RETURN' ) | ( 'BARRIER' ) | ( 'CATCH' ) | ( 'LEAVE' ) | ( 'REDO' ) | ( 'RAISE' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 20:
                {
                alt10=4;
                }
                break;
            case 21:
                {
                alt10=5;
                }
                break;
            case 22:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMAL.g:1005:2: ( 'RETURN' )
                    {
                    // InternalMAL.g:1005:2: ( 'RETURN' )
                    // InternalMAL.g:1006:3: 'RETURN'
                    {
                     before(grammarAccess.getFlowAccess().getRETURNKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getRETURNKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1011:2: ( 'BARRIER' )
                    {
                    // InternalMAL.g:1011:2: ( 'BARRIER' )
                    // InternalMAL.g:1012:3: 'BARRIER'
                    {
                     before(grammarAccess.getFlowAccess().getBARRIERKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getBARRIERKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1017:2: ( 'CATCH' )
                    {
                    // InternalMAL.g:1017:2: ( 'CATCH' )
                    // InternalMAL.g:1018:3: 'CATCH'
                    {
                     before(grammarAccess.getFlowAccess().getCATCHKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getCATCHKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:1023:2: ( 'LEAVE' )
                    {
                    // InternalMAL.g:1023:2: ( 'LEAVE' )
                    // InternalMAL.g:1024:3: 'LEAVE'
                    {
                     before(grammarAccess.getFlowAccess().getLEAVEKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getLEAVEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMAL.g:1029:2: ( 'REDO' )
                    {
                    // InternalMAL.g:1029:2: ( 'REDO' )
                    // InternalMAL.g:1030:3: 'REDO'
                    {
                     before(grammarAccess.getFlowAccess().getREDOKeyword_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getREDOKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMAL.g:1035:2: ( 'RAISE' )
                    {
                    // InternalMAL.g:1035:2: ( 'RAISE' )
                    // InternalMAL.g:1036:3: 'RAISE'
                    {
                     before(grammarAccess.getFlowAccess().getRAISEKeyword_5()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getRAISEKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Alternatives"


    // $ANTLR start "rule__Varlist__Alternatives"
    // InternalMAL.g:1045:1: rule__Varlist__Alternatives : ( ( ( rule__Varlist__VariablesAssignment_0 ) ) | ( ( rule__Varlist__Group_1__0 ) ) );
    public final void rule__Varlist__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1049:1: ( ( ( rule__Varlist__VariablesAssignment_0 ) ) | ( ( rule__Varlist__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMAL.g:1050:2: ( ( rule__Varlist__VariablesAssignment_0 ) )
                    {
                    // InternalMAL.g:1050:2: ( ( rule__Varlist__VariablesAssignment_0 ) )
                    // InternalMAL.g:1051:3: ( rule__Varlist__VariablesAssignment_0 )
                    {
                     before(grammarAccess.getVarlistAccess().getVariablesAssignment_0()); 
                    // InternalMAL.g:1052:3: ( rule__Varlist__VariablesAssignment_0 )
                    // InternalMAL.g:1052:4: rule__Varlist__VariablesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Varlist__VariablesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarlistAccess().getVariablesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1056:2: ( ( rule__Varlist__Group_1__0 ) )
                    {
                    // InternalMAL.g:1056:2: ( ( rule__Varlist__Group_1__0 ) )
                    // InternalMAL.g:1057:3: ( rule__Varlist__Group_1__0 )
                    {
                     before(grammarAccess.getVarlistAccess().getGroup_1()); 
                    // InternalMAL.g:1058:3: ( rule__Varlist__Group_1__0 )
                    // InternalMAL.g:1058:4: rule__Varlist__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Varlist__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarlistAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Alternatives"


    // $ANTLR start "rule__Expr__Alternatives"
    // InternalMAL.g:1066:1: rule__Expr__Alternatives : ( ( ruleFcncall ) | ( ( rule__Expr__Group_1__0 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1070:1: ( ( ruleFcncall ) | ( ( rule__Expr__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||(LA12_1>=15 && LA12_1<=29)||(LA12_1>=31 && LA12_1<=32)||(LA12_1>=34 && LA12_1<=37)||LA12_1==39) ) {
                    alt12=2;
                }
                else if ( (LA12_1==41) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_OID)||LA12_0==48) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMAL.g:1071:2: ( ruleFcncall )
                    {
                    // InternalMAL.g:1071:2: ( ruleFcncall )
                    // InternalMAL.g:1072:3: ruleFcncall
                    {
                     before(grammarAccess.getExprAccess().getFcncallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFcncall();

                    state._fsp--;

                     after(grammarAccess.getExprAccess().getFcncallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1077:2: ( ( rule__Expr__Group_1__0 ) )
                    {
                    // InternalMAL.g:1077:2: ( ( rule__Expr__Group_1__0 ) )
                    // InternalMAL.g:1078:3: ( rule__Expr__Group_1__0 )
                    {
                     before(grammarAccess.getExprAccess().getGroup_1()); 
                    // InternalMAL.g:1079:3: ( rule__Expr__Group_1__0 )
                    // InternalMAL.g:1079:4: rule__Expr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMAL.g:1087:1: rule__Operator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1091:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            case 26:
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
                    // InternalMAL.g:1092:2: ( '+' )
                    {
                    // InternalMAL.g:1092:2: ( '+' )
                    // InternalMAL.g:1093:3: '+'
                    {
                     before(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1098:2: ( '-' )
                    {
                    // InternalMAL.g:1098:2: ( '-' )
                    // InternalMAL.g:1099:3: '-'
                    {
                     before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1104:2: ( '*' )
                    {
                    // InternalMAL.g:1104:2: ( '*' )
                    // InternalMAL.g:1105:3: '*'
                    {
                     before(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:1110:2: ( '/' )
                    {
                    // InternalMAL.g:1110:2: ( '/' )
                    // InternalMAL.g:1111:3: '/'
                    {
                     before(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalMAL.g:1120:1: rule__Factor__Alternatives : ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ruleVariable ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1124:1: ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( ruleVariable ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BIT:
            case RULE_CHR:
            case RULE_WRD:
            case RULE_INT:
            case RULE_OID:
                {
                alt14=1;
                }
                break;
            case 48:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMAL.g:1125:2: ( ( rule__Factor__Group_0__0 ) )
                    {
                    // InternalMAL.g:1125:2: ( ( rule__Factor__Group_0__0 ) )
                    // InternalMAL.g:1126:3: ( rule__Factor__Group_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_0()); 
                    // InternalMAL.g:1127:3: ( rule__Factor__Group_0__0 )
                    // InternalMAL.g:1127:4: rule__Factor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1131:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalMAL.g:1131:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalMAL.g:1132:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalMAL.g:1133:3: ( rule__Factor__Group_1__0 )
                    // InternalMAL.g:1133:4: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1137:2: ( ruleVariable )
                    {
                    // InternalMAL.g:1137:2: ( ruleVariable )
                    // InternalMAL.g:1138:3: ruleVariable
                    {
                     before(grammarAccess.getFactorAccess().getVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getFactorAccess().getVariableParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__Literal_constant__Alternatives"
    // InternalMAL.g:1147:1: rule__Literal_constant__Alternatives : ( ( RULE_BIT ) | ( ruleBte ) | ( RULE_CHR ) | ( RULE_WRD ) | ( RULE_INT ) | ( RULE_OID ) | ( ruleFLT ) | ( ruleSTR ) );
    public final void rule__Literal_constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1151:1: ( ( RULE_BIT ) | ( ruleBte ) | ( RULE_CHR ) | ( RULE_WRD ) | ( RULE_INT ) | ( RULE_OID ) | ( ruleFLT ) | ( ruleSTR ) )
            int alt15=8;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMAL.g:1152:2: ( RULE_BIT )
                    {
                    // InternalMAL.g:1152:2: ( RULE_BIT )
                    // InternalMAL.g:1153:3: RULE_BIT
                    {
                     before(grammarAccess.getLiteral_constantAccess().getBITTerminalRuleCall_0()); 
                    match(input,RULE_BIT,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getBITTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1158:2: ( ruleBte )
                    {
                    // InternalMAL.g:1158:2: ( ruleBte )
                    // InternalMAL.g:1159:3: ruleBte
                    {
                     before(grammarAccess.getLiteral_constantAccess().getBteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBte();

                    state._fsp--;

                     after(grammarAccess.getLiteral_constantAccess().getBteParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1164:2: ( RULE_CHR )
                    {
                    // InternalMAL.g:1164:2: ( RULE_CHR )
                    // InternalMAL.g:1165:3: RULE_CHR
                    {
                     before(grammarAccess.getLiteral_constantAccess().getCHRTerminalRuleCall_2()); 
                    match(input,RULE_CHR,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getCHRTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:1170:2: ( RULE_WRD )
                    {
                    // InternalMAL.g:1170:2: ( RULE_WRD )
                    // InternalMAL.g:1171:3: RULE_WRD
                    {
                     before(grammarAccess.getLiteral_constantAccess().getWRDTerminalRuleCall_3()); 
                    match(input,RULE_WRD,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getWRDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMAL.g:1176:2: ( RULE_INT )
                    {
                    // InternalMAL.g:1176:2: ( RULE_INT )
                    // InternalMAL.g:1177:3: RULE_INT
                    {
                     before(grammarAccess.getLiteral_constantAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getINTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMAL.g:1182:2: ( RULE_OID )
                    {
                    // InternalMAL.g:1182:2: ( RULE_OID )
                    // InternalMAL.g:1183:3: RULE_OID
                    {
                     before(grammarAccess.getLiteral_constantAccess().getOIDTerminalRuleCall_5()); 
                    match(input,RULE_OID,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getOIDTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMAL.g:1188:2: ( ruleFLT )
                    {
                    // InternalMAL.g:1188:2: ( ruleFLT )
                    // InternalMAL.g:1189:3: ruleFLT
                    {
                     before(grammarAccess.getLiteral_constantAccess().getFLTParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleFLT();

                    state._fsp--;

                     after(grammarAccess.getLiteral_constantAccess().getFLTParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMAL.g:1194:2: ( ruleSTR )
                    {
                    // InternalMAL.g:1194:2: ( ruleSTR )
                    // InternalMAL.g:1195:3: ruleSTR
                    {
                     before(grammarAccess.getLiteral_constantAccess().getSTRParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSTR();

                    state._fsp--;

                     after(grammarAccess.getLiteral_constantAccess().getSTRParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal_constant__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMAL.g:1204:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1208:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMAL.g:1209:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMAL.g:1216:1: rule__Program__Group__0__Impl : ( ( rule__Program__ElementsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1220:1: ( ( ( rule__Program__ElementsAssignment_0 ) ) )
            // InternalMAL.g:1221:1: ( ( rule__Program__ElementsAssignment_0 ) )
            {
            // InternalMAL.g:1221:1: ( ( rule__Program__ElementsAssignment_0 ) )
            // InternalMAL.g:1222:2: ( rule__Program__ElementsAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getElementsAssignment_0()); 
            // InternalMAL.g:1223:2: ( rule__Program__ElementsAssignment_0 )
            // InternalMAL.g:1223:3: rule__Program__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMAL.g:1231:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1235:1: ( rule__Program__Group__1__Impl )
            // InternalMAL.g:1236:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMAL.g:1242:1: rule__Program__Group__1__Impl : ( ';' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1246:1: ( ( ';' ) )
            // InternalMAL.g:1247:1: ( ';' )
            {
            // InternalMAL.g:1247:1: ( ';' )
            // InternalMAL.g:1248:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalMAL.g:1258:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1262:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMAL.g:1263:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalMAL.g:1270:1: rule__Statement__Group_0__0__Impl : ( ruleModuleStmt ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1274:1: ( ( ruleModuleStmt ) )
            // InternalMAL.g:1275:1: ( ruleModuleStmt )
            {
            // InternalMAL.g:1275:1: ( ruleModuleStmt )
            // InternalMAL.g:1276:2: ruleModuleStmt
            {
             before(grammarAccess.getStatementAccess().getModuleStmtParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleStmt();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getModuleStmtParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalMAL.g:1285:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1289:1: ( rule__Statement__Group_0__1__Impl )
            // InternalMAL.g:1290:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalMAL.g:1296:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__HelpAssignment_0_1 )? ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1300:1: ( ( ( rule__Statement__HelpAssignment_0_1 )? ) )
            // InternalMAL.g:1301:1: ( ( rule__Statement__HelpAssignment_0_1 )? )
            {
            // InternalMAL.g:1301:1: ( ( rule__Statement__HelpAssignment_0_1 )? )
            // InternalMAL.g:1302:2: ( rule__Statement__HelpAssignment_0_1 )?
            {
             before(grammarAccess.getStatementAccess().getHelpAssignment_0_1()); 
            // InternalMAL.g:1303:2: ( rule__Statement__HelpAssignment_0_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMAL.g:1303:3: rule__Statement__HelpAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__HelpAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getHelpAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalMAL.g:1312:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1316:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalMAL.g:1317:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalMAL.g:1324:1: rule__Statement__Group_1__0__Impl : ( ruleDefinition ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1328:1: ( ( ruleDefinition ) )
            // InternalMAL.g:1329:1: ( ruleDefinition )
            {
            // InternalMAL.g:1329:1: ( ruleDefinition )
            // InternalMAL.g:1330:2: ruleDefinition
            {
             before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalMAL.g:1339:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1343:1: ( rule__Statement__Group_1__1__Impl )
            // InternalMAL.g:1344:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalMAL.g:1350:1: rule__Statement__Group_1__1__Impl : ( ( rule__Statement__HelpAssignment_1_1 )? ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1354:1: ( ( ( rule__Statement__HelpAssignment_1_1 )? ) )
            // InternalMAL.g:1355:1: ( ( rule__Statement__HelpAssignment_1_1 )? )
            {
            // InternalMAL.g:1355:1: ( ( rule__Statement__HelpAssignment_1_1 )? )
            // InternalMAL.g:1356:2: ( rule__Statement__HelpAssignment_1_1 )?
            {
             before(grammarAccess.getStatementAccess().getHelpAssignment_1_1()); 
            // InternalMAL.g:1357:2: ( rule__Statement__HelpAssignment_1_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMAL.g:1357:3: rule__Statement__HelpAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__HelpAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getHelpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__ModuleStmt__Group_0__0"
    // InternalMAL.g:1366:1: rule__ModuleStmt__Group_0__0 : rule__ModuleStmt__Group_0__0__Impl rule__ModuleStmt__Group_0__1 ;
    public final void rule__ModuleStmt__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1370:1: ( rule__ModuleStmt__Group_0__0__Impl rule__ModuleStmt__Group_0__1 )
            // InternalMAL.g:1371:2: rule__ModuleStmt__Group_0__0__Impl rule__ModuleStmt__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ModuleStmt__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_0__0"


    // $ANTLR start "rule__ModuleStmt__Group_0__0__Impl"
    // InternalMAL.g:1378:1: rule__ModuleStmt__Group_0__0__Impl : ( 'MODULE' ) ;
    public final void rule__ModuleStmt__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1382:1: ( ( 'MODULE' ) )
            // InternalMAL.g:1383:1: ( 'MODULE' )
            {
            // InternalMAL.g:1383:1: ( 'MODULE' )
            // InternalMAL.g:1384:2: 'MODULE'
            {
             before(grammarAccess.getModuleStmtAccess().getMODULEKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getMODULEKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_0__0__Impl"


    // $ANTLR start "rule__ModuleStmt__Group_0__1"
    // InternalMAL.g:1393:1: rule__ModuleStmt__Group_0__1 : rule__ModuleStmt__Group_0__1__Impl ;
    public final void rule__ModuleStmt__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1397:1: ( rule__ModuleStmt__Group_0__1__Impl )
            // InternalMAL.g:1398:2: rule__ModuleStmt__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_0__1"


    // $ANTLR start "rule__ModuleStmt__Group_0__1__Impl"
    // InternalMAL.g:1404:1: rule__ModuleStmt__Group_0__1__Impl : ( ( rule__ModuleStmt__IdentAssignment_0_1 ) ) ;
    public final void rule__ModuleStmt__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1408:1: ( ( ( rule__ModuleStmt__IdentAssignment_0_1 ) ) )
            // InternalMAL.g:1409:1: ( ( rule__ModuleStmt__IdentAssignment_0_1 ) )
            {
            // InternalMAL.g:1409:1: ( ( rule__ModuleStmt__IdentAssignment_0_1 ) )
            // InternalMAL.g:1410:2: ( rule__ModuleStmt__IdentAssignment_0_1 )
            {
             before(grammarAccess.getModuleStmtAccess().getIdentAssignment_0_1()); 
            // InternalMAL.g:1411:2: ( rule__ModuleStmt__IdentAssignment_0_1 )
            // InternalMAL.g:1411:3: rule__ModuleStmt__IdentAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__IdentAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleStmtAccess().getIdentAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_0__1__Impl"


    // $ANTLR start "rule__ModuleStmt__Group_1__0"
    // InternalMAL.g:1420:1: rule__ModuleStmt__Group_1__0 : rule__ModuleStmt__Group_1__0__Impl rule__ModuleStmt__Group_1__1 ;
    public final void rule__ModuleStmt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1424:1: ( rule__ModuleStmt__Group_1__0__Impl rule__ModuleStmt__Group_1__1 )
            // InternalMAL.g:1425:2: rule__ModuleStmt__Group_1__0__Impl rule__ModuleStmt__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ModuleStmt__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1__0"


    // $ANTLR start "rule__ModuleStmt__Group_1__0__Impl"
    // InternalMAL.g:1432:1: rule__ModuleStmt__Group_1__0__Impl : ( 'ATOM' ) ;
    public final void rule__ModuleStmt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1436:1: ( ( 'ATOM' ) )
            // InternalMAL.g:1437:1: ( 'ATOM' )
            {
            // InternalMAL.g:1437:1: ( 'ATOM' )
            // InternalMAL.g:1438:2: 'ATOM'
            {
             before(grammarAccess.getModuleStmtAccess().getATOMKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getATOMKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1__0__Impl"


    // $ANTLR start "rule__ModuleStmt__Group_1__1"
    // InternalMAL.g:1447:1: rule__ModuleStmt__Group_1__1 : rule__ModuleStmt__Group_1__1__Impl rule__ModuleStmt__Group_1__2 ;
    public final void rule__ModuleStmt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1451:1: ( rule__ModuleStmt__Group_1__1__Impl rule__ModuleStmt__Group_1__2 )
            // InternalMAL.g:1452:2: rule__ModuleStmt__Group_1__1__Impl rule__ModuleStmt__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__ModuleStmt__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1__1"


    // $ANTLR start "rule__ModuleStmt__Group_1__1__Impl"
    // InternalMAL.g:1459:1: rule__ModuleStmt__Group_1__1__Impl : ( ( rule__ModuleStmt__IdentAssignment_1_1 ) ) ;
    public final void rule__ModuleStmt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1463:1: ( ( ( rule__ModuleStmt__IdentAssignment_1_1 ) ) )
            // InternalMAL.g:1464:1: ( ( rule__ModuleStmt__IdentAssignment_1_1 ) )
            {
            // InternalMAL.g:1464:1: ( ( rule__ModuleStmt__IdentAssignment_1_1 ) )
            // InternalMAL.g:1465:2: ( rule__ModuleStmt__IdentAssignment_1_1 )
            {
             before(grammarAccess.getModuleStmtAccess().getIdentAssignment_1_1()); 
            // InternalMAL.g:1466:2: ( rule__ModuleStmt__IdentAssignment_1_1 )
            // InternalMAL.g:1466:3: rule__ModuleStmt__IdentAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__IdentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleStmtAccess().getIdentAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1__1__Impl"


    // $ANTLR start "rule__ModuleStmt__Group_1__2"
    // InternalMAL.g:1474:1: rule__ModuleStmt__Group_1__2 : rule__ModuleStmt__Group_1__2__Impl ;
    public final void rule__ModuleStmt__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1478:1: ( rule__ModuleStmt__Group_1__2__Impl )
            // InternalMAL.g:1479:2: rule__ModuleStmt__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1__2"


    // $ANTLR start "rule__ModuleStmt__Group_1__2__Impl"
    // InternalMAL.g:1485:1: rule__ModuleStmt__Group_1__2__Impl : ( ( rule__ModuleStmt__Group_1_2__0 )? ) ;
    public final void rule__ModuleStmt__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1489:1: ( ( ( rule__ModuleStmt__Group_1_2__0 )? ) )
            // InternalMAL.g:1490:1: ( ( rule__ModuleStmt__Group_1_2__0 )? )
            {
            // InternalMAL.g:1490:1: ( ( rule__ModuleStmt__Group_1_2__0 )? )
            // InternalMAL.g:1491:2: ( rule__ModuleStmt__Group_1_2__0 )?
            {
             before(grammarAccess.getModuleStmtAccess().getGroup_1_2()); 
            // InternalMAL.g:1492:2: ( rule__ModuleStmt__Group_1_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMAL.g:1492:3: rule__ModuleStmt__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModuleStmt__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleStmtAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1__2__Impl"


    // $ANTLR start "rule__ModuleStmt__Group_1_2__0"
    // InternalMAL.g:1501:1: rule__ModuleStmt__Group_1_2__0 : rule__ModuleStmt__Group_1_2__0__Impl rule__ModuleStmt__Group_1_2__1 ;
    public final void rule__ModuleStmt__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1505:1: ( rule__ModuleStmt__Group_1_2__0__Impl rule__ModuleStmt__Group_1_2__1 )
            // InternalMAL.g:1506:2: rule__ModuleStmt__Group_1_2__0__Impl rule__ModuleStmt__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ModuleStmt__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1_2__0"


    // $ANTLR start "rule__ModuleStmt__Group_1_2__0__Impl"
    // InternalMAL.g:1513:1: rule__ModuleStmt__Group_1_2__0__Impl : ( ':' ) ;
    public final void rule__ModuleStmt__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1517:1: ( ( ':' ) )
            // InternalMAL.g:1518:1: ( ':' )
            {
            // InternalMAL.g:1518:1: ( ':' )
            // InternalMAL.g:1519:2: ':'
            {
             before(grammarAccess.getModuleStmtAccess().getColonKeyword_1_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getColonKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1_2__0__Impl"


    // $ANTLR start "rule__ModuleStmt__Group_1_2__1"
    // InternalMAL.g:1528:1: rule__ModuleStmt__Group_1_2__1 : rule__ModuleStmt__Group_1_2__1__Impl ;
    public final void rule__ModuleStmt__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1532:1: ( rule__ModuleStmt__Group_1_2__1__Impl )
            // InternalMAL.g:1533:2: rule__ModuleStmt__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1_2__1"


    // $ANTLR start "rule__ModuleStmt__Group_1_2__1__Impl"
    // InternalMAL.g:1539:1: rule__ModuleStmt__Group_1_2__1__Impl : ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) ) ;
    public final void rule__ModuleStmt__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1543:1: ( ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) ) )
            // InternalMAL.g:1544:1: ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) )
            {
            // InternalMAL.g:1544:1: ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) )
            // InternalMAL.g:1545:2: ( rule__ModuleStmt__Second_identAssignment_1_2_1 )
            {
             before(grammarAccess.getModuleStmtAccess().getSecond_identAssignment_1_2_1()); 
            // InternalMAL.g:1546:2: ( rule__ModuleStmt__Second_identAssignment_1_2_1 )
            // InternalMAL.g:1546:3: rule__ModuleStmt__Second_identAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Second_identAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleStmtAccess().getSecond_identAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Group_1_2__1__Impl"


    // $ANTLR start "rule__IncludeStmt__Group_0__0"
    // InternalMAL.g:1555:1: rule__IncludeStmt__Group_0__0 : rule__IncludeStmt__Group_0__0__Impl rule__IncludeStmt__Group_0__1 ;
    public final void rule__IncludeStmt__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1559:1: ( rule__IncludeStmt__Group_0__0__Impl rule__IncludeStmt__Group_0__1 )
            // InternalMAL.g:1560:2: rule__IncludeStmt__Group_0__0__Impl rule__IncludeStmt__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__IncludeStmt__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IncludeStmt__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_0__0"


    // $ANTLR start "rule__IncludeStmt__Group_0__0__Impl"
    // InternalMAL.g:1567:1: rule__IncludeStmt__Group_0__0__Impl : ( 'INCLUDE' ) ;
    public final void rule__IncludeStmt__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1571:1: ( ( 'INCLUDE' ) )
            // InternalMAL.g:1572:1: ( 'INCLUDE' )
            {
            // InternalMAL.g:1572:1: ( 'INCLUDE' )
            // InternalMAL.g:1573:2: 'INCLUDE'
            {
             before(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_0__0__Impl"


    // $ANTLR start "rule__IncludeStmt__Group_0__1"
    // InternalMAL.g:1582:1: rule__IncludeStmt__Group_0__1 : rule__IncludeStmt__Group_0__1__Impl ;
    public final void rule__IncludeStmt__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1586:1: ( rule__IncludeStmt__Group_0__1__Impl )
            // InternalMAL.g:1587:2: rule__IncludeStmt__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStmt__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_0__1"


    // $ANTLR start "rule__IncludeStmt__Group_0__1__Impl"
    // InternalMAL.g:1593:1: rule__IncludeStmt__Group_0__1__Impl : ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) ) ;
    public final void rule__IncludeStmt__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1597:1: ( ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) ) )
            // InternalMAL.g:1598:1: ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) )
            {
            // InternalMAL.g:1598:1: ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) )
            // InternalMAL.g:1599:2: ( rule__IncludeStmt__IdentifierAssignment_0_1 )
            {
             before(grammarAccess.getIncludeStmtAccess().getIdentifierAssignment_0_1()); 
            // InternalMAL.g:1600:2: ( rule__IncludeStmt__IdentifierAssignment_0_1 )
            // InternalMAL.g:1600:3: rule__IncludeStmt__IdentifierAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStmt__IdentifierAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeStmtAccess().getIdentifierAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_0__1__Impl"


    // $ANTLR start "rule__IncludeStmt__Group_1__0"
    // InternalMAL.g:1609:1: rule__IncludeStmt__Group_1__0 : rule__IncludeStmt__Group_1__0__Impl rule__IncludeStmt__Group_1__1 ;
    public final void rule__IncludeStmt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1613:1: ( rule__IncludeStmt__Group_1__0__Impl rule__IncludeStmt__Group_1__1 )
            // InternalMAL.g:1614:2: rule__IncludeStmt__Group_1__0__Impl rule__IncludeStmt__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__IncludeStmt__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IncludeStmt__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_1__0"


    // $ANTLR start "rule__IncludeStmt__Group_1__0__Impl"
    // InternalMAL.g:1621:1: rule__IncludeStmt__Group_1__0__Impl : ( 'INCLUDE' ) ;
    public final void rule__IncludeStmt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1625:1: ( ( 'INCLUDE' ) )
            // InternalMAL.g:1626:1: ( 'INCLUDE' )
            {
            // InternalMAL.g:1626:1: ( 'INCLUDE' )
            // InternalMAL.g:1627:2: 'INCLUDE'
            {
             before(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_1__0__Impl"


    // $ANTLR start "rule__IncludeStmt__Group_1__1"
    // InternalMAL.g:1636:1: rule__IncludeStmt__Group_1__1 : rule__IncludeStmt__Group_1__1__Impl ;
    public final void rule__IncludeStmt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1640:1: ( rule__IncludeStmt__Group_1__1__Impl )
            // InternalMAL.g:1641:2: rule__IncludeStmt__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStmt__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_1__1"


    // $ANTLR start "rule__IncludeStmt__Group_1__1__Impl"
    // InternalMAL.g:1647:1: rule__IncludeStmt__Group_1__1__Impl : ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) ) ;
    public final void rule__IncludeStmt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1651:1: ( ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) ) )
            // InternalMAL.g:1652:1: ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) )
            {
            // InternalMAL.g:1652:1: ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) )
            // InternalMAL.g:1653:2: ( rule__IncludeStmt__String_literalAssignment_1_1 )
            {
             before(grammarAccess.getIncludeStmtAccess().getString_literalAssignment_1_1()); 
            // InternalMAL.g:1654:2: ( rule__IncludeStmt__String_literalAssignment_1_1 )
            // InternalMAL.g:1654:3: rule__IncludeStmt__String_literalAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStmt__String_literalAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeStmtAccess().getString_literalAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_0__0"
    // InternalMAL.g:1663:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1667:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalMAL.g:1668:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0"


    // $ANTLR start "rule__Definition__Group_0__0__Impl"
    // InternalMAL.g:1675:1: rule__Definition__Group_0__0__Impl : ( ( 'UNSAFE' )? ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1679:1: ( ( ( 'UNSAFE' )? ) )
            // InternalMAL.g:1680:1: ( ( 'UNSAFE' )? )
            {
            // InternalMAL.g:1680:1: ( ( 'UNSAFE' )? )
            // InternalMAL.g:1681:2: ( 'UNSAFE' )?
            {
             before(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_0_0()); 
            // InternalMAL.g:1682:2: ( 'UNSAFE' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMAL.g:1682:3: 'UNSAFE'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0__Impl"


    // $ANTLR start "rule__Definition__Group_0__1"
    // InternalMAL.g:1690:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1694:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalMAL.g:1695:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1"


    // $ANTLR start "rule__Definition__Group_0__1__Impl"
    // InternalMAL.g:1702:1: rule__Definition__Group_0__1__Impl : ( 'COMMAND' ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1706:1: ( ( 'COMMAND' ) )
            // InternalMAL.g:1707:1: ( 'COMMAND' )
            {
            // InternalMAL.g:1707:1: ( 'COMMAND' )
            // InternalMAL.g:1708:2: 'COMMAND'
            {
             before(grammarAccess.getDefinitionAccess().getCOMMANDKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getCOMMANDKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1__Impl"


    // $ANTLR start "rule__Definition__Group_0__2"
    // InternalMAL.g:1717:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1721:1: ( rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 )
            // InternalMAL.g:1722:2: rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2"


    // $ANTLR start "rule__Definition__Group_0__2__Impl"
    // InternalMAL.g:1729:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__HeaderAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1733:1: ( ( ( rule__Definition__HeaderAssignment_0_2 ) ) )
            // InternalMAL.g:1734:1: ( ( rule__Definition__HeaderAssignment_0_2 ) )
            {
            // InternalMAL.g:1734:1: ( ( rule__Definition__HeaderAssignment_0_2 ) )
            // InternalMAL.g:1735:2: ( rule__Definition__HeaderAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_0_2()); 
            // InternalMAL.g:1736:2: ( rule__Definition__HeaderAssignment_0_2 )
            // InternalMAL.g:1736:3: rule__Definition__HeaderAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__HeaderAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getHeaderAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2__Impl"


    // $ANTLR start "rule__Definition__Group_0__3"
    // InternalMAL.g:1744:1: rule__Definition__Group_0__3 : rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 ;
    public final void rule__Definition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1748:1: ( rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 )
            // InternalMAL.g:1749:2: rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3"


    // $ANTLR start "rule__Definition__Group_0__3__Impl"
    // InternalMAL.g:1756:1: rule__Definition__Group_0__3__Impl : ( 'ADDRESS' ) ;
    public final void rule__Definition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1760:1: ( ( 'ADDRESS' ) )
            // InternalMAL.g:1761:1: ( 'ADDRESS' )
            {
            // InternalMAL.g:1761:1: ( 'ADDRESS' )
            // InternalMAL.g:1762:2: 'ADDRESS'
            {
             before(grammarAccess.getDefinitionAccess().getADDRESSKeyword_0_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getADDRESSKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3__Impl"


    // $ANTLR start "rule__Definition__Group_0__4"
    // InternalMAL.g:1771:1: rule__Definition__Group_0__4 : rule__Definition__Group_0__4__Impl ;
    public final void rule__Definition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1775:1: ( rule__Definition__Group_0__4__Impl )
            // InternalMAL.g:1776:2: rule__Definition__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4"


    // $ANTLR start "rule__Definition__Group_0__4__Impl"
    // InternalMAL.g:1782:1: rule__Definition__Group_0__4__Impl : ( ( rule__Definition__IdentifierAssignment_0_4 ) ) ;
    public final void rule__Definition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1786:1: ( ( ( rule__Definition__IdentifierAssignment_0_4 ) ) )
            // InternalMAL.g:1787:1: ( ( rule__Definition__IdentifierAssignment_0_4 ) )
            {
            // InternalMAL.g:1787:1: ( ( rule__Definition__IdentifierAssignment_0_4 ) )
            // InternalMAL.g:1788:2: ( rule__Definition__IdentifierAssignment_0_4 )
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierAssignment_0_4()); 
            // InternalMAL.g:1789:2: ( rule__Definition__IdentifierAssignment_0_4 )
            // InternalMAL.g:1789:3: rule__Definition__IdentifierAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__IdentifierAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getIdentifierAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4__Impl"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalMAL.g:1798:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1802:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalMAL.g:1803:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Definition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0"


    // $ANTLR start "rule__Definition__Group_1__0__Impl"
    // InternalMAL.g:1810:1: rule__Definition__Group_1__0__Impl : ( ( 'UNSAFE' )? ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1814:1: ( ( ( 'UNSAFE' )? ) )
            // InternalMAL.g:1815:1: ( ( 'UNSAFE' )? )
            {
            // InternalMAL.g:1815:1: ( ( 'UNSAFE' )? )
            // InternalMAL.g:1816:2: ( 'UNSAFE' )?
            {
             before(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_1_0()); 
            // InternalMAL.g:1817:2: ( 'UNSAFE' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMAL.g:1817:3: 'UNSAFE'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1__1"
    // InternalMAL.g:1825:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1829:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalMAL.g:1830:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1"


    // $ANTLR start "rule__Definition__Group_1__1__Impl"
    // InternalMAL.g:1837:1: rule__Definition__Group_1__1__Impl : ( 'PATTERN' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1841:1: ( ( 'PATTERN' ) )
            // InternalMAL.g:1842:1: ( 'PATTERN' )
            {
            // InternalMAL.g:1842:1: ( 'PATTERN' )
            // InternalMAL.g:1843:2: 'PATTERN'
            {
             before(grammarAccess.getDefinitionAccess().getPATTERNKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getPATTERNKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__2"
    // InternalMAL.g:1852:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1856:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalMAL.g:1857:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2"


    // $ANTLR start "rule__Definition__Group_1__2__Impl"
    // InternalMAL.g:1864:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__HeaderAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1868:1: ( ( ( rule__Definition__HeaderAssignment_1_2 ) ) )
            // InternalMAL.g:1869:1: ( ( rule__Definition__HeaderAssignment_1_2 ) )
            {
            // InternalMAL.g:1869:1: ( ( rule__Definition__HeaderAssignment_1_2 ) )
            // InternalMAL.g:1870:2: ( rule__Definition__HeaderAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_1_2()); 
            // InternalMAL.g:1871:2: ( rule__Definition__HeaderAssignment_1_2 )
            // InternalMAL.g:1871:3: rule__Definition__HeaderAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__HeaderAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getHeaderAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__3"
    // InternalMAL.g:1879:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1883:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalMAL.g:1884:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3"


    // $ANTLR start "rule__Definition__Group_1__3__Impl"
    // InternalMAL.g:1891:1: rule__Definition__Group_1__3__Impl : ( 'ADDRESS' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1895:1: ( ( 'ADDRESS' ) )
            // InternalMAL.g:1896:1: ( 'ADDRESS' )
            {
            // InternalMAL.g:1896:1: ( 'ADDRESS' )
            // InternalMAL.g:1897:2: 'ADDRESS'
            {
             before(grammarAccess.getDefinitionAccess().getADDRESSKeyword_1_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getADDRESSKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3__Impl"


    // $ANTLR start "rule__Definition__Group_1__4"
    // InternalMAL.g:1906:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1910:1: ( rule__Definition__Group_1__4__Impl )
            // InternalMAL.g:1911:2: rule__Definition__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4"


    // $ANTLR start "rule__Definition__Group_1__4__Impl"
    // InternalMAL.g:1917:1: rule__Definition__Group_1__4__Impl : ( ( rule__Definition__IdentifierAssignment_1_4 ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1921:1: ( ( ( rule__Definition__IdentifierAssignment_1_4 ) ) )
            // InternalMAL.g:1922:1: ( ( rule__Definition__IdentifierAssignment_1_4 ) )
            {
            // InternalMAL.g:1922:1: ( ( rule__Definition__IdentifierAssignment_1_4 ) )
            // InternalMAL.g:1923:2: ( rule__Definition__IdentifierAssignment_1_4 )
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierAssignment_1_4()); 
            // InternalMAL.g:1924:2: ( rule__Definition__IdentifierAssignment_1_4 )
            // InternalMAL.g:1924:3: rule__Definition__IdentifierAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__IdentifierAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getIdentifierAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // InternalMAL.g:1933:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1937:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalMAL.g:1938:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // InternalMAL.g:1945:1: rule__Definition__Group_2__0__Impl : ( ( rule__Definition__Alternatives_2_0 )? ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1949:1: ( ( ( rule__Definition__Alternatives_2_0 )? ) )
            // InternalMAL.g:1950:1: ( ( rule__Definition__Alternatives_2_0 )? )
            {
            // InternalMAL.g:1950:1: ( ( rule__Definition__Alternatives_2_0 )? )
            // InternalMAL.g:1951:2: ( rule__Definition__Alternatives_2_0 )?
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_2_0()); 
            // InternalMAL.g:1952:2: ( rule__Definition__Alternatives_2_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=15 && LA21_0<=16)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMAL.g:1952:3: rule__Definition__Alternatives_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Alternatives_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // InternalMAL.g:1960:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1964:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalMAL.g:1965:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // InternalMAL.g:1972:1: rule__Definition__Group_2__1__Impl : ( 'FUNCTION' ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1976:1: ( ( 'FUNCTION' ) )
            // InternalMAL.g:1977:1: ( 'FUNCTION' )
            {
            // InternalMAL.g:1977:1: ( 'FUNCTION' )
            // InternalMAL.g:1978:2: 'FUNCTION'
            {
             before(grammarAccess.getDefinitionAccess().getFUNCTIONKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getFUNCTIONKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__2"
    // InternalMAL.g:1987:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1991:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalMAL.g:1992:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2"


    // $ANTLR start "rule__Definition__Group_2__2__Impl"
    // InternalMAL.g:1999:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__HeaderAssignment_2_2 ) ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2003:1: ( ( ( rule__Definition__HeaderAssignment_2_2 ) ) )
            // InternalMAL.g:2004:1: ( ( rule__Definition__HeaderAssignment_2_2 ) )
            {
            // InternalMAL.g:2004:1: ( ( rule__Definition__HeaderAssignment_2_2 ) )
            // InternalMAL.g:2005:2: ( rule__Definition__HeaderAssignment_2_2 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_2_2()); 
            // InternalMAL.g:2006:2: ( rule__Definition__HeaderAssignment_2_2 )
            // InternalMAL.g:2006:3: rule__Definition__HeaderAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__HeaderAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getHeaderAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_2__3"
    // InternalMAL.g:2014:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2018:1: ( rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 )
            // InternalMAL.g:2019:2: rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3"


    // $ANTLR start "rule__Definition__Group_2__3__Impl"
    // InternalMAL.g:2026:1: rule__Definition__Group_2__3__Impl : ( ( rule__Definition__StatementsAssignment_2_3 )* ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2030:1: ( ( ( rule__Definition__StatementsAssignment_2_3 )* ) )
            // InternalMAL.g:2031:1: ( ( rule__Definition__StatementsAssignment_2_3 )* )
            {
            // InternalMAL.g:2031:1: ( ( rule__Definition__StatementsAssignment_2_3 )* )
            // InternalMAL.g:2032:2: ( rule__Definition__StatementsAssignment_2_3 )*
            {
             before(grammarAccess.getDefinitionAccess().getStatementsAssignment_2_3()); 
            // InternalMAL.g:2033:2: ( rule__Definition__StatementsAssignment_2_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=15 && LA22_0<=22)||(LA22_0>=28 && LA22_0<=29)||(LA22_0>=31 && LA22_0<=32)||(LA22_0>=34 && LA22_0<=35)||LA22_0==37||LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMAL.g:2033:3: rule__Definition__StatementsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Definition__StatementsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getStatementsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__3__Impl"


    // $ANTLR start "rule__Definition__Group_2__4"
    // InternalMAL.g:2041:1: rule__Definition__Group_2__4 : rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5 ;
    public final void rule__Definition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2045:1: ( rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5 )
            // InternalMAL.g:2046:2: rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__4"


    // $ANTLR start "rule__Definition__Group_2__4__Impl"
    // InternalMAL.g:2053:1: rule__Definition__Group_2__4__Impl : ( 'END' ) ;
    public final void rule__Definition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2057:1: ( ( 'END' ) )
            // InternalMAL.g:2058:1: ( 'END' )
            {
            // InternalMAL.g:2058:1: ( 'END' )
            // InternalMAL.g:2059:2: 'END'
            {
             before(grammarAccess.getDefinitionAccess().getENDKeyword_2_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getENDKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__4__Impl"


    // $ANTLR start "rule__Definition__Group_2__5"
    // InternalMAL.g:2068:1: rule__Definition__Group_2__5 : rule__Definition__Group_2__5__Impl ;
    public final void rule__Definition__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2072:1: ( rule__Definition__Group_2__5__Impl )
            // InternalMAL.g:2073:2: rule__Definition__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__5"


    // $ANTLR start "rule__Definition__Group_2__5__Impl"
    // InternalMAL.g:2079:1: rule__Definition__Group_2__5__Impl : ( ( rule__Definition__Function_nameAssignment_2_5 ) ) ;
    public final void rule__Definition__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2083:1: ( ( ( rule__Definition__Function_nameAssignment_2_5 ) ) )
            // InternalMAL.g:2084:1: ( ( rule__Definition__Function_nameAssignment_2_5 ) )
            {
            // InternalMAL.g:2084:1: ( ( rule__Definition__Function_nameAssignment_2_5 ) )
            // InternalMAL.g:2085:2: ( rule__Definition__Function_nameAssignment_2_5 )
            {
             before(grammarAccess.getDefinitionAccess().getFunction_nameAssignment_2_5()); 
            // InternalMAL.g:2086:2: ( rule__Definition__Function_nameAssignment_2_5 )
            // InternalMAL.g:2086:3: rule__Definition__Function_nameAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Function_nameAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getFunction_nameAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__5__Impl"


    // $ANTLR start "rule__Definition__Group_3__0"
    // InternalMAL.g:2095:1: rule__Definition__Group_3__0 : rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 ;
    public final void rule__Definition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2099:1: ( rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 )
            // InternalMAL.g:2100:2: rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__0"


    // $ANTLR start "rule__Definition__Group_3__0__Impl"
    // InternalMAL.g:2107:1: rule__Definition__Group_3__0__Impl : ( 'FACTORY' ) ;
    public final void rule__Definition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2111:1: ( ( 'FACTORY' ) )
            // InternalMAL.g:2112:1: ( 'FACTORY' )
            {
            // InternalMAL.g:2112:1: ( 'FACTORY' )
            // InternalMAL.g:2113:2: 'FACTORY'
            {
             before(grammarAccess.getDefinitionAccess().getFACTORYKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getFACTORYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__0__Impl"


    // $ANTLR start "rule__Definition__Group_3__1"
    // InternalMAL.g:2122:1: rule__Definition__Group_3__1 : rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 ;
    public final void rule__Definition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2126:1: ( rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 )
            // InternalMAL.g:2127:2: rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__1"


    // $ANTLR start "rule__Definition__Group_3__1__Impl"
    // InternalMAL.g:2134:1: rule__Definition__Group_3__1__Impl : ( ( rule__Definition__HeaderAssignment_3_1 ) ) ;
    public final void rule__Definition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2138:1: ( ( ( rule__Definition__HeaderAssignment_3_1 ) ) )
            // InternalMAL.g:2139:1: ( ( rule__Definition__HeaderAssignment_3_1 ) )
            {
            // InternalMAL.g:2139:1: ( ( rule__Definition__HeaderAssignment_3_1 ) )
            // InternalMAL.g:2140:2: ( rule__Definition__HeaderAssignment_3_1 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_3_1()); 
            // InternalMAL.g:2141:2: ( rule__Definition__HeaderAssignment_3_1 )
            // InternalMAL.g:2141:3: rule__Definition__HeaderAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__HeaderAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getHeaderAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__1__Impl"


    // $ANTLR start "rule__Definition__Group_3__2"
    // InternalMAL.g:2149:1: rule__Definition__Group_3__2 : rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 ;
    public final void rule__Definition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2153:1: ( rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 )
            // InternalMAL.g:2154:2: rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__Definition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__2"


    // $ANTLR start "rule__Definition__Group_3__2__Impl"
    // InternalMAL.g:2161:1: rule__Definition__Group_3__2__Impl : ( ( rule__Definition__StatementsAssignment_3_2 )* ) ;
    public final void rule__Definition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2165:1: ( ( ( rule__Definition__StatementsAssignment_3_2 )* ) )
            // InternalMAL.g:2166:1: ( ( rule__Definition__StatementsAssignment_3_2 )* )
            {
            // InternalMAL.g:2166:1: ( ( rule__Definition__StatementsAssignment_3_2 )* )
            // InternalMAL.g:2167:2: ( rule__Definition__StatementsAssignment_3_2 )*
            {
             before(grammarAccess.getDefinitionAccess().getStatementsAssignment_3_2()); 
            // InternalMAL.g:2168:2: ( rule__Definition__StatementsAssignment_3_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=15 && LA23_0<=22)||(LA23_0>=28 && LA23_0<=29)||(LA23_0>=31 && LA23_0<=32)||(LA23_0>=34 && LA23_0<=35)||LA23_0==37||LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMAL.g:2168:3: rule__Definition__StatementsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Definition__StatementsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getStatementsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__2__Impl"


    // $ANTLR start "rule__Definition__Group_3__3"
    // InternalMAL.g:2176:1: rule__Definition__Group_3__3 : rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 ;
    public final void rule__Definition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2180:1: ( rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 )
            // InternalMAL.g:2181:2: rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__3"


    // $ANTLR start "rule__Definition__Group_3__3__Impl"
    // InternalMAL.g:2188:1: rule__Definition__Group_3__3__Impl : ( 'END' ) ;
    public final void rule__Definition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2192:1: ( ( 'END' ) )
            // InternalMAL.g:2193:1: ( 'END' )
            {
            // InternalMAL.g:2193:1: ( 'END' )
            // InternalMAL.g:2194:2: 'END'
            {
             before(grammarAccess.getDefinitionAccess().getENDKeyword_3_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getENDKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__3__Impl"


    // $ANTLR start "rule__Definition__Group_3__4"
    // InternalMAL.g:2203:1: rule__Definition__Group_3__4 : rule__Definition__Group_3__4__Impl ;
    public final void rule__Definition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2207:1: ( rule__Definition__Group_3__4__Impl )
            // InternalMAL.g:2208:2: rule__Definition__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__4"


    // $ANTLR start "rule__Definition__Group_3__4__Impl"
    // InternalMAL.g:2214:1: rule__Definition__Group_3__4__Impl : ( ( rule__Definition__Factory_nameAssignment_3_4 ) ) ;
    public final void rule__Definition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2218:1: ( ( ( rule__Definition__Factory_nameAssignment_3_4 ) ) )
            // InternalMAL.g:2219:1: ( ( rule__Definition__Factory_nameAssignment_3_4 ) )
            {
            // InternalMAL.g:2219:1: ( ( rule__Definition__Factory_nameAssignment_3_4 ) )
            // InternalMAL.g:2220:2: ( rule__Definition__Factory_nameAssignment_3_4 )
            {
             before(grammarAccess.getDefinitionAccess().getFactory_nameAssignment_3_4()); 
            // InternalMAL.g:2221:2: ( rule__Definition__Factory_nameAssignment_3_4 )
            // InternalMAL.g:2221:3: rule__Definition__Factory_nameAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Factory_nameAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getFactory_nameAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_3__4__Impl"


    // $ANTLR start "rule__Helpinfo__Group__0"
    // InternalMAL.g:2230:1: rule__Helpinfo__Group__0 : rule__Helpinfo__Group__0__Impl rule__Helpinfo__Group__1 ;
    public final void rule__Helpinfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2234:1: ( rule__Helpinfo__Group__0__Impl rule__Helpinfo__Group__1 )
            // InternalMAL.g:2235:2: rule__Helpinfo__Group__0__Impl rule__Helpinfo__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Helpinfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Helpinfo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helpinfo__Group__0"


    // $ANTLR start "rule__Helpinfo__Group__0__Impl"
    // InternalMAL.g:2242:1: rule__Helpinfo__Group__0__Impl : ( 'COMMENT' ) ;
    public final void rule__Helpinfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2246:1: ( ( 'COMMENT' ) )
            // InternalMAL.g:2247:1: ( 'COMMENT' )
            {
            // InternalMAL.g:2247:1: ( 'COMMENT' )
            // InternalMAL.g:2248:2: 'COMMENT'
            {
             before(grammarAccess.getHelpinfoAccess().getCOMMENTKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getHelpinfoAccess().getCOMMENTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helpinfo__Group__0__Impl"


    // $ANTLR start "rule__Helpinfo__Group__1"
    // InternalMAL.g:2257:1: rule__Helpinfo__Group__1 : rule__Helpinfo__Group__1__Impl ;
    public final void rule__Helpinfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2261:1: ( rule__Helpinfo__Group__1__Impl )
            // InternalMAL.g:2262:2: rule__Helpinfo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Helpinfo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helpinfo__Group__1"


    // $ANTLR start "rule__Helpinfo__Group__1__Impl"
    // InternalMAL.g:2268:1: rule__Helpinfo__Group__1__Impl : ( ( rule__Helpinfo__String_literalAssignment_1 ) ) ;
    public final void rule__Helpinfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2272:1: ( ( ( rule__Helpinfo__String_literalAssignment_1 ) ) )
            // InternalMAL.g:2273:1: ( ( rule__Helpinfo__String_literalAssignment_1 ) )
            {
            // InternalMAL.g:2273:1: ( ( rule__Helpinfo__String_literalAssignment_1 ) )
            // InternalMAL.g:2274:2: ( rule__Helpinfo__String_literalAssignment_1 )
            {
             before(grammarAccess.getHelpinfoAccess().getString_literalAssignment_1()); 
            // InternalMAL.g:2275:2: ( rule__Helpinfo__String_literalAssignment_1 )
            // InternalMAL.g:2275:3: rule__Helpinfo__String_literalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Helpinfo__String_literalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHelpinfoAccess().getString_literalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helpinfo__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalMAL.g:2284:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2288:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMAL.g:2289:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalMAL.g:2296:1: rule__Header__Group__0__Impl : ( ( rule__Header__Header_nameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2300:1: ( ( ( rule__Header__Header_nameAssignment_0 ) ) )
            // InternalMAL.g:2301:1: ( ( rule__Header__Header_nameAssignment_0 ) )
            {
            // InternalMAL.g:2301:1: ( ( rule__Header__Header_nameAssignment_0 ) )
            // InternalMAL.g:2302:2: ( rule__Header__Header_nameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getHeader_nameAssignment_0()); 
            // InternalMAL.g:2303:2: ( rule__Header__Header_nameAssignment_0 )
            // InternalMAL.g:2303:3: rule__Header__Header_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Header_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getHeader_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalMAL.g:2311:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2315:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMAL.g:2316:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalMAL.g:2323:1: rule__Header__Group__1__Impl : ( '(' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2327:1: ( ( '(' ) )
            // InternalMAL.g:2328:1: ( '(' )
            {
            // InternalMAL.g:2328:1: ( '(' )
            // InternalMAL.g:2329:2: '('
            {
             before(grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalMAL.g:2338:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2342:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalMAL.g:2343:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalMAL.g:2350:1: rule__Header__Group__2__Impl : ( ( rule__Header__ParamsAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2354:1: ( ( ( rule__Header__ParamsAssignment_2 ) ) )
            // InternalMAL.g:2355:1: ( ( rule__Header__ParamsAssignment_2 ) )
            {
            // InternalMAL.g:2355:1: ( ( rule__Header__ParamsAssignment_2 ) )
            // InternalMAL.g:2356:2: ( rule__Header__ParamsAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getParamsAssignment_2()); 
            // InternalMAL.g:2357:2: ( rule__Header__ParamsAssignment_2 )
            // InternalMAL.g:2357:3: rule__Header__ParamsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header__ParamsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getParamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // InternalMAL.g:2365:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2369:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalMAL.g:2370:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // InternalMAL.g:2377:1: rule__Header__Group__3__Impl : ( ')' ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2381:1: ( ( ')' ) )
            // InternalMAL.g:2382:1: ( ')' )
            {
            // InternalMAL.g:2382:1: ( ')' )
            // InternalMAL.g:2383:2: ')'
            {
             before(grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // InternalMAL.g:2392:1: rule__Header__Group__4 : rule__Header__Group__4__Impl ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2396:1: ( rule__Header__Group__4__Impl )
            // InternalMAL.g:2397:2: rule__Header__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // InternalMAL.g:2403:1: rule__Header__Group__4__Impl : ( ( rule__Header__Return_typeAssignment_4 ) ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2407:1: ( ( ( rule__Header__Return_typeAssignment_4 ) ) )
            // InternalMAL.g:2408:1: ( ( rule__Header__Return_typeAssignment_4 ) )
            {
            // InternalMAL.g:2408:1: ( ( rule__Header__Return_typeAssignment_4 ) )
            // InternalMAL.g:2409:2: ( rule__Header__Return_typeAssignment_4 )
            {
             before(grammarAccess.getHeaderAccess().getReturn_typeAssignment_4()); 
            // InternalMAL.g:2410:2: ( rule__Header__Return_typeAssignment_4 )
            // InternalMAL.g:2410:3: rule__Header__Return_typeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Header__Return_typeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getReturn_typeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalMAL.g:2419:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2423:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMAL.g:2424:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMAL.g:2431:1: rule__Name__Group__0__Impl : ( ( rule__Name__Group_0__0 )* ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2435:1: ( ( ( rule__Name__Group_0__0 )* ) )
            // InternalMAL.g:2436:1: ( ( rule__Name__Group_0__0 )* )
            {
            // InternalMAL.g:2436:1: ( ( rule__Name__Group_0__0 )* )
            // InternalMAL.g:2437:2: ( rule__Name__Group_0__0 )*
            {
             before(grammarAccess.getNameAccess().getGroup_0()); 
            // InternalMAL.g:2438:2: ( rule__Name__Group_0__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==41) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalMAL.g:2438:3: rule__Name__Group_0__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Name__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getNameAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // InternalMAL.g:2446:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2450:1: ( rule__Name__Group__1__Impl )
            // InternalMAL.g:2451:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMAL.g:2457:1: rule__Name__Group__1__Impl : ( ( rule__Name__IdAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2461:1: ( ( ( rule__Name__IdAssignment_1 ) ) )
            // InternalMAL.g:2462:1: ( ( rule__Name__IdAssignment_1 ) )
            {
            // InternalMAL.g:2462:1: ( ( rule__Name__IdAssignment_1 ) )
            // InternalMAL.g:2463:2: ( rule__Name__IdAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getIdAssignment_1()); 
            // InternalMAL.g:2464:2: ( rule__Name__IdAssignment_1 )
            // InternalMAL.g:2464:3: rule__Name__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Name__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Name__Group_0__0"
    // InternalMAL.g:2473:1: rule__Name__Group_0__0 : rule__Name__Group_0__0__Impl rule__Name__Group_0__1 ;
    public final void rule__Name__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2477:1: ( rule__Name__Group_0__0__Impl rule__Name__Group_0__1 )
            // InternalMAL.g:2478:2: rule__Name__Group_0__0__Impl rule__Name__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Name__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_0__0"


    // $ANTLR start "rule__Name__Group_0__0__Impl"
    // InternalMAL.g:2485:1: rule__Name__Group_0__0__Impl : ( ( rule__Name__MnAssignment_0_0 ) ) ;
    public final void rule__Name__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2489:1: ( ( ( rule__Name__MnAssignment_0_0 ) ) )
            // InternalMAL.g:2490:1: ( ( rule__Name__MnAssignment_0_0 ) )
            {
            // InternalMAL.g:2490:1: ( ( rule__Name__MnAssignment_0_0 ) )
            // InternalMAL.g:2491:2: ( rule__Name__MnAssignment_0_0 )
            {
             before(grammarAccess.getNameAccess().getMnAssignment_0_0()); 
            // InternalMAL.g:2492:2: ( rule__Name__MnAssignment_0_0 )
            // InternalMAL.g:2492:3: rule__Name__MnAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Name__MnAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getMnAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_0__0__Impl"


    // $ANTLR start "rule__Name__Group_0__1"
    // InternalMAL.g:2500:1: rule__Name__Group_0__1 : rule__Name__Group_0__1__Impl ;
    public final void rule__Name__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2504:1: ( rule__Name__Group_0__1__Impl )
            // InternalMAL.g:2505:2: rule__Name__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_0__1"


    // $ANTLR start "rule__Name__Group_0__1__Impl"
    // InternalMAL.g:2511:1: rule__Name__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Name__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2515:1: ( ( '.' ) )
            // InternalMAL.g:2516:1: ( '.' )
            {
            // InternalMAL.g:2516:1: ( '.' )
            // InternalMAL.g:2517:2: '.'
            {
             before(grammarAccess.getNameAccess().getFullStopKeyword_0_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group_0__1__Impl"


    // $ANTLR start "rule__Result__Group_1__0"
    // InternalMAL.g:2527:1: rule__Result__Group_1__0 : rule__Result__Group_1__0__Impl rule__Result__Group_1__1 ;
    public final void rule__Result__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2531:1: ( rule__Result__Group_1__0__Impl rule__Result__Group_1__1 )
            // InternalMAL.g:2532:2: rule__Result__Group_1__0__Impl rule__Result__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Result__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Result__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_1__0"


    // $ANTLR start "rule__Result__Group_1__0__Impl"
    // InternalMAL.g:2539:1: rule__Result__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Result__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2543:1: ( ( '(' ) )
            // InternalMAL.g:2544:1: ( '(' )
            {
            // InternalMAL.g:2544:1: ( '(' )
            // InternalMAL.g:2545:2: '('
            {
             before(grammarAccess.getResultAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getResultAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_1__0__Impl"


    // $ANTLR start "rule__Result__Group_1__1"
    // InternalMAL.g:2554:1: rule__Result__Group_1__1 : rule__Result__Group_1__1__Impl rule__Result__Group_1__2 ;
    public final void rule__Result__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2558:1: ( rule__Result__Group_1__1__Impl rule__Result__Group_1__2 )
            // InternalMAL.g:2559:2: rule__Result__Group_1__1__Impl rule__Result__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Result__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Result__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_1__1"


    // $ANTLR start "rule__Result__Group_1__1__Impl"
    // InternalMAL.g:2566:1: rule__Result__Group_1__1__Impl : ( ruleParams ) ;
    public final void rule__Result__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2570:1: ( ( ruleParams ) )
            // InternalMAL.g:2571:1: ( ruleParams )
            {
            // InternalMAL.g:2571:1: ( ruleParams )
            // InternalMAL.g:2572:2: ruleParams
            {
             before(grammarAccess.getResultAccess().getParamsParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleParams();

            state._fsp--;

             after(grammarAccess.getResultAccess().getParamsParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_1__1__Impl"


    // $ANTLR start "rule__Result__Group_1__2"
    // InternalMAL.g:2581:1: rule__Result__Group_1__2 : rule__Result__Group_1__2__Impl ;
    public final void rule__Result__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2585:1: ( rule__Result__Group_1__2__Impl )
            // InternalMAL.g:2586:2: rule__Result__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Result__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_1__2"


    // $ANTLR start "rule__Result__Group_1__2__Impl"
    // InternalMAL.g:2592:1: rule__Result__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Result__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2596:1: ( ( ')' ) )
            // InternalMAL.g:2597:1: ( ')' )
            {
            // InternalMAL.g:2597:1: ( ')' )
            // InternalMAL.g:2598:2: ')'
            {
             before(grammarAccess.getResultAccess().getRightParenthesisKeyword_1_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getResultAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_1__2__Impl"


    // $ANTLR start "rule__Params__Group__0"
    // InternalMAL.g:2608:1: rule__Params__Group__0 : rule__Params__Group__0__Impl rule__Params__Group__1 ;
    public final void rule__Params__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2612:1: ( rule__Params__Group__0__Impl rule__Params__Group__1 )
            // InternalMAL.g:2613:2: rule__Params__Group__0__Impl rule__Params__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Params__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__0"


    // $ANTLR start "rule__Params__Group__0__Impl"
    // InternalMAL.g:2620:1: rule__Params__Group__0__Impl : ( ( rule__Params__BindAssignment_0 ) ) ;
    public final void rule__Params__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2624:1: ( ( ( rule__Params__BindAssignment_0 ) ) )
            // InternalMAL.g:2625:1: ( ( rule__Params__BindAssignment_0 ) )
            {
            // InternalMAL.g:2625:1: ( ( rule__Params__BindAssignment_0 ) )
            // InternalMAL.g:2626:2: ( rule__Params__BindAssignment_0 )
            {
             before(grammarAccess.getParamsAccess().getBindAssignment_0()); 
            // InternalMAL.g:2627:2: ( rule__Params__BindAssignment_0 )
            // InternalMAL.g:2627:3: rule__Params__BindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Params__BindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getBindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__0__Impl"


    // $ANTLR start "rule__Params__Group__1"
    // InternalMAL.g:2635:1: rule__Params__Group__1 : rule__Params__Group__1__Impl ;
    public final void rule__Params__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2639:1: ( rule__Params__Group__1__Impl )
            // InternalMAL.g:2640:2: rule__Params__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__1"


    // $ANTLR start "rule__Params__Group__1__Impl"
    // InternalMAL.g:2646:1: rule__Params__Group__1__Impl : ( ( rule__Params__Group_1__0 )* ) ;
    public final void rule__Params__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2650:1: ( ( ( rule__Params__Group_1__0 )* ) )
            // InternalMAL.g:2651:1: ( ( rule__Params__Group_1__0 )* )
            {
            // InternalMAL.g:2651:1: ( ( rule__Params__Group_1__0 )* )
            // InternalMAL.g:2652:2: ( rule__Params__Group_1__0 )*
            {
             before(grammarAccess.getParamsAccess().getGroup_1()); 
            // InternalMAL.g:2653:2: ( rule__Params__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMAL.g:2653:3: rule__Params__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Params__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getParamsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group__1__Impl"


    // $ANTLR start "rule__Params__Group_1__0"
    // InternalMAL.g:2662:1: rule__Params__Group_1__0 : rule__Params__Group_1__0__Impl rule__Params__Group_1__1 ;
    public final void rule__Params__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2666:1: ( rule__Params__Group_1__0__Impl rule__Params__Group_1__1 )
            // InternalMAL.g:2667:2: rule__Params__Group_1__0__Impl rule__Params__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Params__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Params__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__0"


    // $ANTLR start "rule__Params__Group_1__0__Impl"
    // InternalMAL.g:2674:1: rule__Params__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Params__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2678:1: ( ( ',' ) )
            // InternalMAL.g:2679:1: ( ',' )
            {
            // InternalMAL.g:2679:1: ( ',' )
            // InternalMAL.g:2680:2: ','
            {
             before(grammarAccess.getParamsAccess().getCommaKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParamsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__0__Impl"


    // $ANTLR start "rule__Params__Group_1__1"
    // InternalMAL.g:2689:1: rule__Params__Group_1__1 : rule__Params__Group_1__1__Impl ;
    public final void rule__Params__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2693:1: ( rule__Params__Group_1__1__Impl )
            // InternalMAL.g:2694:2: rule__Params__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Params__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__1"


    // $ANTLR start "rule__Params__Group_1__1__Impl"
    // InternalMAL.g:2700:1: rule__Params__Group_1__1__Impl : ( ( rule__Params__BindAssignment_1_1 ) ) ;
    public final void rule__Params__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2704:1: ( ( ( rule__Params__BindAssignment_1_1 ) ) )
            // InternalMAL.g:2705:1: ( ( rule__Params__BindAssignment_1_1 ) )
            {
            // InternalMAL.g:2705:1: ( ( rule__Params__BindAssignment_1_1 ) )
            // InternalMAL.g:2706:2: ( rule__Params__BindAssignment_1_1 )
            {
             before(grammarAccess.getParamsAccess().getBindAssignment_1_1()); 
            // InternalMAL.g:2707:2: ( rule__Params__BindAssignment_1_1 )
            // InternalMAL.g:2707:3: rule__Params__BindAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Params__BindAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParamsAccess().getBindAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__Group_1__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalMAL.g:2716:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2720:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalMAL.g:2721:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalMAL.g:2728:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__IdentifierAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2732:1: ( ( ( rule__Binding__IdentifierAssignment_0 ) ) )
            // InternalMAL.g:2733:1: ( ( rule__Binding__IdentifierAssignment_0 ) )
            {
            // InternalMAL.g:2733:1: ( ( rule__Binding__IdentifierAssignment_0 ) )
            // InternalMAL.g:2734:2: ( rule__Binding__IdentifierAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getIdentifierAssignment_0()); 
            // InternalMAL.g:2735:2: ( rule__Binding__IdentifierAssignment_0 )
            // InternalMAL.g:2735:3: rule__Binding__IdentifierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__IdentifierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getIdentifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalMAL.g:2743:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2747:1: ( rule__Binding__Group__1__Impl )
            // InternalMAL.g:2748:2: rule__Binding__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalMAL.g:2754:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__TypeAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2758:1: ( ( ( rule__Binding__TypeAssignment_1 ) ) )
            // InternalMAL.g:2759:1: ( ( rule__Binding__TypeAssignment_1 ) )
            {
            // InternalMAL.g:2759:1: ( ( rule__Binding__TypeAssignment_1 ) )
            // InternalMAL.g:2760:2: ( rule__Binding__TypeAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getTypeAssignment_1()); 
            // InternalMAL.g:2761:2: ( rule__Binding__TypeAssignment_1 )
            // InternalMAL.g:2761:3: rule__Binding__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__TypeName__Group_2__0"
    // InternalMAL.g:2770:1: rule__TypeName__Group_2__0 : rule__TypeName__Group_2__0__Impl rule__TypeName__Group_2__1 ;
    public final void rule__TypeName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2774:1: ( rule__TypeName__Group_2__0__Impl rule__TypeName__Group_2__1 )
            // InternalMAL.g:2775:2: rule__TypeName__Group_2__0__Impl rule__TypeName__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__TypeName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeName__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group_2__0"


    // $ANTLR start "rule__TypeName__Group_2__0__Impl"
    // InternalMAL.g:2782:1: rule__TypeName__Group_2__0__Impl : ( ':' ) ;
    public final void rule__TypeName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2786:1: ( ( ':' ) )
            // InternalMAL.g:2787:1: ( ':' )
            {
            // InternalMAL.g:2787:1: ( ':' )
            // InternalMAL.g:2788:2: ':'
            {
             before(grammarAccess.getTypeNameAccess().getColonKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeNameAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group_2__0__Impl"


    // $ANTLR start "rule__TypeName__Group_2__1"
    // InternalMAL.g:2797:1: rule__TypeName__Group_2__1 : rule__TypeName__Group_2__1__Impl ;
    public final void rule__TypeName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2801:1: ( rule__TypeName__Group_2__1__Impl )
            // InternalMAL.g:2802:2: rule__TypeName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeName__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group_2__1"


    // $ANTLR start "rule__TypeName__Group_2__1__Impl"
    // InternalMAL.g:2808:1: rule__TypeName__Group_2__1__Impl : ( ruleAnyType ) ;
    public final void rule__TypeName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2812:1: ( ( ruleAnyType ) )
            // InternalMAL.g:2813:1: ( ruleAnyType )
            {
            // InternalMAL.g:2813:1: ( ruleAnyType )
            // InternalMAL.g:2814:2: ruleAnyType
            {
             before(grammarAccess.getTypeNameAccess().getAnyTypeParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAnyType();

            state._fsp--;

             after(grammarAccess.getTypeNameAccess().getAnyTypeParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group_2__1__Impl"


    // $ANTLR start "rule__ScalarType__Group__0"
    // InternalMAL.g:2824:1: rule__ScalarType__Group__0 : rule__ScalarType__Group__0__Impl rule__ScalarType__Group__1 ;
    public final void rule__ScalarType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2828:1: ( rule__ScalarType__Group__0__Impl rule__ScalarType__Group__1 )
            // InternalMAL.g:2829:2: rule__ScalarType__Group__0__Impl rule__ScalarType__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ScalarType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScalarType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarType__Group__0"


    // $ANTLR start "rule__ScalarType__Group__0__Impl"
    // InternalMAL.g:2836:1: rule__ScalarType__Group__0__Impl : ( ':' ) ;
    public final void rule__ScalarType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2840:1: ( ( ':' ) )
            // InternalMAL.g:2841:1: ( ':' )
            {
            // InternalMAL.g:2841:1: ( ':' )
            // InternalMAL.g:2842:2: ':'
            {
             before(grammarAccess.getScalarTypeAccess().getColonKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getScalarTypeAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarType__Group__0__Impl"


    // $ANTLR start "rule__ScalarType__Group__1"
    // InternalMAL.g:2851:1: rule__ScalarType__Group__1 : rule__ScalarType__Group__1__Impl ;
    public final void rule__ScalarType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2855:1: ( rule__ScalarType__Group__1__Impl )
            // InternalMAL.g:2856:2: rule__ScalarType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScalarType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarType__Group__1"


    // $ANTLR start "rule__ScalarType__Group__1__Impl"
    // InternalMAL.g:2862:1: rule__ScalarType__Group__1__Impl : ( ( rule__ScalarType__IdentifierAssignment_1 ) ) ;
    public final void rule__ScalarType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2866:1: ( ( ( rule__ScalarType__IdentifierAssignment_1 ) ) )
            // InternalMAL.g:2867:1: ( ( rule__ScalarType__IdentifierAssignment_1 ) )
            {
            // InternalMAL.g:2867:1: ( ( rule__ScalarType__IdentifierAssignment_1 ) )
            // InternalMAL.g:2868:2: ( rule__ScalarType__IdentifierAssignment_1 )
            {
             before(grammarAccess.getScalarTypeAccess().getIdentifierAssignment_1()); 
            // InternalMAL.g:2869:2: ( rule__ScalarType__IdentifierAssignment_1 )
            // InternalMAL.g:2869:3: rule__ScalarType__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScalarType__IdentifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScalarTypeAccess().getIdentifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarType__Group__1__Impl"


    // $ANTLR start "rule__ColumnType__Group__0"
    // InternalMAL.g:2878:1: rule__ColumnType__Group__0 : rule__ColumnType__Group__0__Impl rule__ColumnType__Group__1 ;
    public final void rule__ColumnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2882:1: ( rule__ColumnType__Group__0__Impl rule__ColumnType__Group__1 )
            // InternalMAL.g:2883:2: rule__ColumnType__Group__0__Impl rule__ColumnType__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ColumnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__0"


    // $ANTLR start "rule__ColumnType__Group__0__Impl"
    // InternalMAL.g:2890:1: rule__ColumnType__Group__0__Impl : ( ':' ) ;
    public final void rule__ColumnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2894:1: ( ( ':' ) )
            // InternalMAL.g:2895:1: ( ':' )
            {
            // InternalMAL.g:2895:1: ( ':' )
            // InternalMAL.g:2896:2: ':'
            {
             before(grammarAccess.getColumnTypeAccess().getColonKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__0__Impl"


    // $ANTLR start "rule__ColumnType__Group__1"
    // InternalMAL.g:2905:1: rule__ColumnType__Group__1 : rule__ColumnType__Group__1__Impl rule__ColumnType__Group__2 ;
    public final void rule__ColumnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2909:1: ( rule__ColumnType__Group__1__Impl rule__ColumnType__Group__2 )
            // InternalMAL.g:2910:2: rule__ColumnType__Group__1__Impl rule__ColumnType__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ColumnType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__1"


    // $ANTLR start "rule__ColumnType__Group__1__Impl"
    // InternalMAL.g:2917:1: rule__ColumnType__Group__1__Impl : ( 'BAT' ) ;
    public final void rule__ColumnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2921:1: ( ( 'BAT' ) )
            // InternalMAL.g:2922:1: ( 'BAT' )
            {
            // InternalMAL.g:2922:1: ( 'BAT' )
            // InternalMAL.g:2923:2: 'BAT'
            {
             before(grammarAccess.getColumnTypeAccess().getBATKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getBATKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__1__Impl"


    // $ANTLR start "rule__ColumnType__Group__2"
    // InternalMAL.g:2932:1: rule__ColumnType__Group__2 : rule__ColumnType__Group__2__Impl rule__ColumnType__Group__3 ;
    public final void rule__ColumnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2936:1: ( rule__ColumnType__Group__2__Impl rule__ColumnType__Group__3 )
            // InternalMAL.g:2937:2: rule__ColumnType__Group__2__Impl rule__ColumnType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ColumnType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__2"


    // $ANTLR start "rule__ColumnType__Group__2__Impl"
    // InternalMAL.g:2944:1: rule__ColumnType__Group__2__Impl : ( '[' ) ;
    public final void rule__ColumnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2948:1: ( ( '[' ) )
            // InternalMAL.g:2949:1: ( '[' )
            {
            // InternalMAL.g:2949:1: ( '[' )
            // InternalMAL.g:2950:2: '['
            {
             before(grammarAccess.getColumnTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__2__Impl"


    // $ANTLR start "rule__ColumnType__Group__3"
    // InternalMAL.g:2959:1: rule__ColumnType__Group__3 : rule__ColumnType__Group__3__Impl rule__ColumnType__Group__4 ;
    public final void rule__ColumnType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2963:1: ( rule__ColumnType__Group__3__Impl rule__ColumnType__Group__4 )
            // InternalMAL.g:2964:2: rule__ColumnType__Group__3__Impl rule__ColumnType__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ColumnType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__3"


    // $ANTLR start "rule__ColumnType__Group__3__Impl"
    // InternalMAL.g:2971:1: rule__ColumnType__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2975:1: ( ( ':' ) )
            // InternalMAL.g:2976:1: ( ':' )
            {
            // InternalMAL.g:2976:1: ( ':' )
            // InternalMAL.g:2977:2: ':'
            {
             before(grammarAccess.getColumnTypeAccess().getColonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__3__Impl"


    // $ANTLR start "rule__ColumnType__Group__4"
    // InternalMAL.g:2986:1: rule__ColumnType__Group__4 : rule__ColumnType__Group__4__Impl rule__ColumnType__Group__5 ;
    public final void rule__ColumnType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2990:1: ( rule__ColumnType__Group__4__Impl rule__ColumnType__Group__5 )
            // InternalMAL.g:2991:2: rule__ColumnType__Group__4__Impl rule__ColumnType__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ColumnType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__4"


    // $ANTLR start "rule__ColumnType__Group__4__Impl"
    // InternalMAL.g:2998:1: rule__ColumnType__Group__4__Impl : ( ruleColElmType ) ;
    public final void rule__ColumnType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3002:1: ( ( ruleColElmType ) )
            // InternalMAL.g:3003:1: ( ruleColElmType )
            {
            // InternalMAL.g:3003:1: ( ruleColElmType )
            // InternalMAL.g:3004:2: ruleColElmType
            {
             before(grammarAccess.getColumnTypeAccess().getColElmTypeParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleColElmType();

            state._fsp--;

             after(grammarAccess.getColumnTypeAccess().getColElmTypeParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__4__Impl"


    // $ANTLR start "rule__ColumnType__Group__5"
    // InternalMAL.g:3013:1: rule__ColumnType__Group__5 : rule__ColumnType__Group__5__Impl ;
    public final void rule__ColumnType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3017:1: ( rule__ColumnType__Group__5__Impl )
            // InternalMAL.g:3018:2: rule__ColumnType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__5"


    // $ANTLR start "rule__ColumnType__Group__5__Impl"
    // InternalMAL.g:3024:1: rule__ColumnType__Group__5__Impl : ( ']' ) ;
    public final void rule__ColumnType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3028:1: ( ( ']' ) )
            // InternalMAL.g:3029:1: ( ']' )
            {
            // InternalMAL.g:3029:1: ( ']' )
            // InternalMAL.g:3030:2: ']'
            {
             before(grammarAccess.getColumnTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getColumnTypeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Group__5__Impl"


    // $ANTLR start "rule__AnyType__Group__0"
    // InternalMAL.g:3040:1: rule__AnyType__Group__0 : rule__AnyType__Group__0__Impl rule__AnyType__Group__1 ;
    public final void rule__AnyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3044:1: ( rule__AnyType__Group__0__Impl rule__AnyType__Group__1 )
            // InternalMAL.g:3045:2: rule__AnyType__Group__0__Impl rule__AnyType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AnyType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group__0"


    // $ANTLR start "rule__AnyType__Group__0__Impl"
    // InternalMAL.g:3052:1: rule__AnyType__Group__0__Impl : ( ( rule__AnyType__TypeAssignment_0 ) ) ;
    public final void rule__AnyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3056:1: ( ( ( rule__AnyType__TypeAssignment_0 ) ) )
            // InternalMAL.g:3057:1: ( ( rule__AnyType__TypeAssignment_0 ) )
            {
            // InternalMAL.g:3057:1: ( ( rule__AnyType__TypeAssignment_0 ) )
            // InternalMAL.g:3058:2: ( rule__AnyType__TypeAssignment_0 )
            {
             before(grammarAccess.getAnyTypeAccess().getTypeAssignment_0()); 
            // InternalMAL.g:3059:2: ( rule__AnyType__TypeAssignment_0 )
            // InternalMAL.g:3059:3: rule__AnyType__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group__0__Impl"


    // $ANTLR start "rule__AnyType__Group__1"
    // InternalMAL.g:3067:1: rule__AnyType__Group__1 : rule__AnyType__Group__1__Impl ;
    public final void rule__AnyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3071:1: ( rule__AnyType__Group__1__Impl )
            // InternalMAL.g:3072:2: rule__AnyType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group__1"


    // $ANTLR start "rule__AnyType__Group__1__Impl"
    // InternalMAL.g:3078:1: rule__AnyType__Group__1__Impl : ( ( rule__AnyType__Group_1__0 )? ) ;
    public final void rule__AnyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3082:1: ( ( ( rule__AnyType__Group_1__0 )? ) )
            // InternalMAL.g:3083:1: ( ( rule__AnyType__Group_1__0 )? )
            {
            // InternalMAL.g:3083:1: ( ( rule__AnyType__Group_1__0 )? )
            // InternalMAL.g:3084:2: ( rule__AnyType__Group_1__0 )?
            {
             before(grammarAccess.getAnyTypeAccess().getGroup_1()); 
            // InternalMAL.g:3085:2: ( rule__AnyType__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMAL.g:3085:3: rule__AnyType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group__1__Impl"


    // $ANTLR start "rule__AnyType__Group_1__0"
    // InternalMAL.g:3094:1: rule__AnyType__Group_1__0 : rule__AnyType__Group_1__0__Impl rule__AnyType__Group_1__1 ;
    public final void rule__AnyType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3098:1: ( rule__AnyType__Group_1__0__Impl rule__AnyType__Group_1__1 )
            // InternalMAL.g:3099:2: rule__AnyType__Group_1__0__Impl rule__AnyType__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__AnyType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group_1__0"


    // $ANTLR start "rule__AnyType__Group_1__0__Impl"
    // InternalMAL.g:3106:1: rule__AnyType__Group_1__0__Impl : ( '_' ) ;
    public final void rule__AnyType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3110:1: ( ( '_' ) )
            // InternalMAL.g:3111:1: ( '_' )
            {
            // InternalMAL.g:3111:1: ( '_' )
            // InternalMAL.g:3112:2: '_'
            {
             before(grammarAccess.getAnyTypeAccess().get_Keyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAnyTypeAccess().get_Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group_1__0__Impl"


    // $ANTLR start "rule__AnyType__Group_1__1"
    // InternalMAL.g:3121:1: rule__AnyType__Group_1__1 : rule__AnyType__Group_1__1__Impl ;
    public final void rule__AnyType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3125:1: ( rule__AnyType__Group_1__1__Impl )
            // InternalMAL.g:3126:2: rule__AnyType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group_1__1"


    // $ANTLR start "rule__AnyType__Group_1__1__Impl"
    // InternalMAL.g:3132:1: rule__AnyType__Group_1__1__Impl : ( ( rule__AnyType__DigitAssignment_1_1 ) ) ;
    public final void rule__AnyType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3136:1: ( ( ( rule__AnyType__DigitAssignment_1_1 ) ) )
            // InternalMAL.g:3137:1: ( ( rule__AnyType__DigitAssignment_1_1 ) )
            {
            // InternalMAL.g:3137:1: ( ( rule__AnyType__DigitAssignment_1_1 ) )
            // InternalMAL.g:3138:2: ( rule__AnyType__DigitAssignment_1_1 )
            {
             before(grammarAccess.getAnyTypeAccess().getDigitAssignment_1_1()); 
            // InternalMAL.g:3139:2: ( rule__AnyType__DigitAssignment_1_1 )
            // InternalMAL.g:3139:3: rule__AnyType__DigitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__DigitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyTypeAccess().getDigitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__Group_1__1__Impl"


    // $ANTLR start "rule__Stmt__Group__0"
    // InternalMAL.g:3148:1: rule__Stmt__Group__0 : rule__Stmt__Group__0__Impl rule__Stmt__Group__1 ;
    public final void rule__Stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3152:1: ( rule__Stmt__Group__0__Impl rule__Stmt__Group__1 )
            // InternalMAL.g:3153:2: rule__Stmt__Group__0__Impl rule__Stmt__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Stmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0"


    // $ANTLR start "rule__Stmt__Group__0__Impl"
    // InternalMAL.g:3160:1: rule__Stmt__Group__0__Impl : ( ( rule__Stmt__FlowAssignment_0 )? ) ;
    public final void rule__Stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3164:1: ( ( ( rule__Stmt__FlowAssignment_0 )? ) )
            // InternalMAL.g:3165:1: ( ( rule__Stmt__FlowAssignment_0 )? )
            {
            // InternalMAL.g:3165:1: ( ( rule__Stmt__FlowAssignment_0 )? )
            // InternalMAL.g:3166:2: ( rule__Stmt__FlowAssignment_0 )?
            {
             before(grammarAccess.getStmtAccess().getFlowAssignment_0()); 
            // InternalMAL.g:3167:2: ( rule__Stmt__FlowAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=17 && LA27_0<=22)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMAL.g:3167:3: rule__Stmt__FlowAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stmt__FlowAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStmtAccess().getFlowAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0__Impl"


    // $ANTLR start "rule__Stmt__Group__1"
    // InternalMAL.g:3175:1: rule__Stmt__Group__1 : rule__Stmt__Group__1__Impl rule__Stmt__Group__2 ;
    public final void rule__Stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3179:1: ( rule__Stmt__Group__1__Impl rule__Stmt__Group__2 )
            // InternalMAL.g:3180:2: rule__Stmt__Group__1__Impl rule__Stmt__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Stmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1"


    // $ANTLR start "rule__Stmt__Group__1__Impl"
    // InternalMAL.g:3187:1: rule__Stmt__Group__1__Impl : ( ( rule__Stmt__List_of_variablesAssignment_1 ) ) ;
    public final void rule__Stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3191:1: ( ( ( rule__Stmt__List_of_variablesAssignment_1 ) ) )
            // InternalMAL.g:3192:1: ( ( rule__Stmt__List_of_variablesAssignment_1 ) )
            {
            // InternalMAL.g:3192:1: ( ( rule__Stmt__List_of_variablesAssignment_1 ) )
            // InternalMAL.g:3193:2: ( rule__Stmt__List_of_variablesAssignment_1 )
            {
             before(grammarAccess.getStmtAccess().getList_of_variablesAssignment_1()); 
            // InternalMAL.g:3194:2: ( rule__Stmt__List_of_variablesAssignment_1 )
            // InternalMAL.g:3194:3: rule__Stmt__List_of_variablesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__List_of_variablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStmtAccess().getList_of_variablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1__Impl"


    // $ANTLR start "rule__Stmt__Group__2"
    // InternalMAL.g:3202:1: rule__Stmt__Group__2 : rule__Stmt__Group__2__Impl ;
    public final void rule__Stmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3206:1: ( rule__Stmt__Group__2__Impl )
            // InternalMAL.g:3207:2: rule__Stmt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__2"


    // $ANTLR start "rule__Stmt__Group__2__Impl"
    // InternalMAL.g:3213:1: rule__Stmt__Group__2__Impl : ( ( rule__Stmt__Group_2__0 ) ) ;
    public final void rule__Stmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3217:1: ( ( ( rule__Stmt__Group_2__0 ) ) )
            // InternalMAL.g:3218:1: ( ( rule__Stmt__Group_2__0 ) )
            {
            // InternalMAL.g:3218:1: ( ( rule__Stmt__Group_2__0 ) )
            // InternalMAL.g:3219:2: ( rule__Stmt__Group_2__0 )
            {
             before(grammarAccess.getStmtAccess().getGroup_2()); 
            // InternalMAL.g:3220:2: ( rule__Stmt__Group_2__0 )
            // InternalMAL.g:3220:3: rule__Stmt__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getStmtAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__2__Impl"


    // $ANTLR start "rule__Stmt__Group_2__0"
    // InternalMAL.g:3229:1: rule__Stmt__Group_2__0 : rule__Stmt__Group_2__0__Impl rule__Stmt__Group_2__1 ;
    public final void rule__Stmt__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3233:1: ( rule__Stmt__Group_2__0__Impl rule__Stmt__Group_2__1 )
            // InternalMAL.g:3234:2: rule__Stmt__Group_2__0__Impl rule__Stmt__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Stmt__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stmt__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group_2__0"


    // $ANTLR start "rule__Stmt__Group_2__0__Impl"
    // InternalMAL.g:3241:1: rule__Stmt__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__Stmt__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3245:1: ( ( ':=' ) )
            // InternalMAL.g:3246:1: ( ':=' )
            {
            // InternalMAL.g:3246:1: ( ':=' )
            // InternalMAL.g:3247:2: ':='
            {
             before(grammarAccess.getStmtAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStmtAccess().getColonEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group_2__0__Impl"


    // $ANTLR start "rule__Stmt__Group_2__1"
    // InternalMAL.g:3256:1: rule__Stmt__Group_2__1 : rule__Stmt__Group_2__1__Impl ;
    public final void rule__Stmt__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3260:1: ( rule__Stmt__Group_2__1__Impl )
            // InternalMAL.g:3261:2: rule__Stmt__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group_2__1"


    // $ANTLR start "rule__Stmt__Group_2__1__Impl"
    // InternalMAL.g:3267:1: rule__Stmt__Group_2__1__Impl : ( ( rule__Stmt__ExpAssignment_2_1 ) ) ;
    public final void rule__Stmt__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3271:1: ( ( ( rule__Stmt__ExpAssignment_2_1 ) ) )
            // InternalMAL.g:3272:1: ( ( rule__Stmt__ExpAssignment_2_1 ) )
            {
            // InternalMAL.g:3272:1: ( ( rule__Stmt__ExpAssignment_2_1 ) )
            // InternalMAL.g:3273:2: ( rule__Stmt__ExpAssignment_2_1 )
            {
             before(grammarAccess.getStmtAccess().getExpAssignment_2_1()); 
            // InternalMAL.g:3274:2: ( rule__Stmt__ExpAssignment_2_1 )
            // InternalMAL.g:3274:3: rule__Stmt__ExpAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stmt__ExpAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStmtAccess().getExpAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group_2__1__Impl"


    // $ANTLR start "rule__Varlist__Group_1__0"
    // InternalMAL.g:3283:1: rule__Varlist__Group_1__0 : rule__Varlist__Group_1__0__Impl rule__Varlist__Group_1__1 ;
    public final void rule__Varlist__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3287:1: ( rule__Varlist__Group_1__0__Impl rule__Varlist__Group_1__1 )
            // InternalMAL.g:3288:2: rule__Varlist__Group_1__0__Impl rule__Varlist__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Varlist__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Varlist__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__0"


    // $ANTLR start "rule__Varlist__Group_1__0__Impl"
    // InternalMAL.g:3295:1: rule__Varlist__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Varlist__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3299:1: ( ( '(' ) )
            // InternalMAL.g:3300:1: ( '(' )
            {
            // InternalMAL.g:3300:1: ( '(' )
            // InternalMAL.g:3301:2: '('
            {
             before(grammarAccess.getVarlistAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVarlistAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__0__Impl"


    // $ANTLR start "rule__Varlist__Group_1__1"
    // InternalMAL.g:3310:1: rule__Varlist__Group_1__1 : rule__Varlist__Group_1__1__Impl rule__Varlist__Group_1__2 ;
    public final void rule__Varlist__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3314:1: ( rule__Varlist__Group_1__1__Impl rule__Varlist__Group_1__2 )
            // InternalMAL.g:3315:2: rule__Varlist__Group_1__1__Impl rule__Varlist__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__Varlist__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Varlist__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__1"


    // $ANTLR start "rule__Varlist__Group_1__1__Impl"
    // InternalMAL.g:3322:1: rule__Varlist__Group_1__1__Impl : ( ( rule__Varlist__VariablesAssignment_1_1 ) ) ;
    public final void rule__Varlist__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3326:1: ( ( ( rule__Varlist__VariablesAssignment_1_1 ) ) )
            // InternalMAL.g:3327:1: ( ( rule__Varlist__VariablesAssignment_1_1 ) )
            {
            // InternalMAL.g:3327:1: ( ( rule__Varlist__VariablesAssignment_1_1 ) )
            // InternalMAL.g:3328:2: ( rule__Varlist__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getVarlistAccess().getVariablesAssignment_1_1()); 
            // InternalMAL.g:3329:2: ( rule__Varlist__VariablesAssignment_1_1 )
            // InternalMAL.g:3329:3: rule__Varlist__VariablesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Varlist__VariablesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarlistAccess().getVariablesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__1__Impl"


    // $ANTLR start "rule__Varlist__Group_1__2"
    // InternalMAL.g:3337:1: rule__Varlist__Group_1__2 : rule__Varlist__Group_1__2__Impl rule__Varlist__Group_1__3 ;
    public final void rule__Varlist__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3341:1: ( rule__Varlist__Group_1__2__Impl rule__Varlist__Group_1__3 )
            // InternalMAL.g:3342:2: rule__Varlist__Group_1__2__Impl rule__Varlist__Group_1__3
            {
            pushFollow(FOLLOW_30);
            rule__Varlist__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Varlist__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__2"


    // $ANTLR start "rule__Varlist__Group_1__2__Impl"
    // InternalMAL.g:3349:1: rule__Varlist__Group_1__2__Impl : ( ( rule__Varlist__Group_1_2__0 )* ) ;
    public final void rule__Varlist__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3353:1: ( ( ( rule__Varlist__Group_1_2__0 )* ) )
            // InternalMAL.g:3354:1: ( ( rule__Varlist__Group_1_2__0 )* )
            {
            // InternalMAL.g:3354:1: ( ( rule__Varlist__Group_1_2__0 )* )
            // InternalMAL.g:3355:2: ( rule__Varlist__Group_1_2__0 )*
            {
             before(grammarAccess.getVarlistAccess().getGroup_1_2()); 
            // InternalMAL.g:3356:2: ( rule__Varlist__Group_1_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMAL.g:3356:3: rule__Varlist__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Varlist__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getVarlistAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__2__Impl"


    // $ANTLR start "rule__Varlist__Group_1__3"
    // InternalMAL.g:3364:1: rule__Varlist__Group_1__3 : rule__Varlist__Group_1__3__Impl ;
    public final void rule__Varlist__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3368:1: ( rule__Varlist__Group_1__3__Impl )
            // InternalMAL.g:3369:2: rule__Varlist__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Varlist__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__3"


    // $ANTLR start "rule__Varlist__Group_1__3__Impl"
    // InternalMAL.g:3375:1: rule__Varlist__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Varlist__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3379:1: ( ( ')' ) )
            // InternalMAL.g:3380:1: ( ')' )
            {
            // InternalMAL.g:3380:1: ( ')' )
            // InternalMAL.g:3381:2: ')'
            {
             before(grammarAccess.getVarlistAccess().getRightParenthesisKeyword_1_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVarlistAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1__3__Impl"


    // $ANTLR start "rule__Varlist__Group_1_2__0"
    // InternalMAL.g:3391:1: rule__Varlist__Group_1_2__0 : rule__Varlist__Group_1_2__0__Impl rule__Varlist__Group_1_2__1 ;
    public final void rule__Varlist__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3395:1: ( rule__Varlist__Group_1_2__0__Impl rule__Varlist__Group_1_2__1 )
            // InternalMAL.g:3396:2: rule__Varlist__Group_1_2__0__Impl rule__Varlist__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Varlist__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Varlist__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1_2__0"


    // $ANTLR start "rule__Varlist__Group_1_2__0__Impl"
    // InternalMAL.g:3403:1: rule__Varlist__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Varlist__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3407:1: ( ( ',' ) )
            // InternalMAL.g:3408:1: ( ',' )
            {
            // InternalMAL.g:3408:1: ( ',' )
            // InternalMAL.g:3409:2: ','
            {
             before(grammarAccess.getVarlistAccess().getCommaKeyword_1_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVarlistAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1_2__0__Impl"


    // $ANTLR start "rule__Varlist__Group_1_2__1"
    // InternalMAL.g:3418:1: rule__Varlist__Group_1_2__1 : rule__Varlist__Group_1_2__1__Impl ;
    public final void rule__Varlist__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3422:1: ( rule__Varlist__Group_1_2__1__Impl )
            // InternalMAL.g:3423:2: rule__Varlist__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Varlist__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1_2__1"


    // $ANTLR start "rule__Varlist__Group_1_2__1__Impl"
    // InternalMAL.g:3429:1: rule__Varlist__Group_1_2__1__Impl : ( ( rule__Varlist__VariablesAssignment_1_2_1 ) ) ;
    public final void rule__Varlist__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3433:1: ( ( ( rule__Varlist__VariablesAssignment_1_2_1 ) ) )
            // InternalMAL.g:3434:1: ( ( rule__Varlist__VariablesAssignment_1_2_1 ) )
            {
            // InternalMAL.g:3434:1: ( ( rule__Varlist__VariablesAssignment_1_2_1 ) )
            // InternalMAL.g:3435:2: ( rule__Varlist__VariablesAssignment_1_2_1 )
            {
             before(grammarAccess.getVarlistAccess().getVariablesAssignment_1_2_1()); 
            // InternalMAL.g:3436:2: ( rule__Varlist__VariablesAssignment_1_2_1 )
            // InternalMAL.g:3436:3: rule__Varlist__VariablesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Varlist__VariablesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVarlistAccess().getVariablesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__Group_1_2__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // InternalMAL.g:3445:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3449:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // InternalMAL.g:3450:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // InternalMAL.g:3457:1: rule__Expr__Group_1__0__Impl : ( ( rule__Expr__Group_1_0__0 )? ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3461:1: ( ( ( rule__Expr__Group_1_0__0 )? ) )
            // InternalMAL.g:3462:1: ( ( rule__Expr__Group_1_0__0 )? )
            {
            // InternalMAL.g:3462:1: ( ( rule__Expr__Group_1_0__0 )? )
            // InternalMAL.g:3463:2: ( rule__Expr__Group_1_0__0 )?
            {
             before(grammarAccess.getExprAccess().getGroup_1_0()); 
            // InternalMAL.g:3464:2: ( rule__Expr__Group_1_0__0 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalMAL.g:3464:3: rule__Expr__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expr__Group_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExprAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // InternalMAL.g:3472:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3476:1: ( rule__Expr__Group_1__1__Impl )
            // InternalMAL.g:3477:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // InternalMAL.g:3483:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__Right_factorAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3487:1: ( ( ( rule__Expr__Right_factorAssignment_1_1 ) ) )
            // InternalMAL.g:3488:1: ( ( rule__Expr__Right_factorAssignment_1_1 ) )
            {
            // InternalMAL.g:3488:1: ( ( rule__Expr__Right_factorAssignment_1_1 ) )
            // InternalMAL.g:3489:2: ( rule__Expr__Right_factorAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getRight_factorAssignment_1_1()); 
            // InternalMAL.g:3490:2: ( rule__Expr__Right_factorAssignment_1_1 )
            // InternalMAL.g:3490:3: rule__Expr__Right_factorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Right_factorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getRight_factorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Expr__Group_1_0__0"
    // InternalMAL.g:3499:1: rule__Expr__Group_1_0__0 : rule__Expr__Group_1_0__0__Impl rule__Expr__Group_1_0__1 ;
    public final void rule__Expr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3503:1: ( rule__Expr__Group_1_0__0__Impl rule__Expr__Group_1_0__1 )
            // InternalMAL.g:3504:2: rule__Expr__Group_1_0__0__Impl rule__Expr__Group_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__Expr__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1_0__0"


    // $ANTLR start "rule__Expr__Group_1_0__0__Impl"
    // InternalMAL.g:3511:1: rule__Expr__Group_1_0__0__Impl : ( ( rule__Expr__Left_factorAssignment_1_0_0 ) ) ;
    public final void rule__Expr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3515:1: ( ( ( rule__Expr__Left_factorAssignment_1_0_0 ) ) )
            // InternalMAL.g:3516:1: ( ( rule__Expr__Left_factorAssignment_1_0_0 ) )
            {
            // InternalMAL.g:3516:1: ( ( rule__Expr__Left_factorAssignment_1_0_0 ) )
            // InternalMAL.g:3517:2: ( rule__Expr__Left_factorAssignment_1_0_0 )
            {
             before(grammarAccess.getExprAccess().getLeft_factorAssignment_1_0_0()); 
            // InternalMAL.g:3518:2: ( rule__Expr__Left_factorAssignment_1_0_0 )
            // InternalMAL.g:3518:3: rule__Expr__Left_factorAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Left_factorAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getLeft_factorAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expr__Group_1_0__1"
    // InternalMAL.g:3526:1: rule__Expr__Group_1_0__1 : rule__Expr__Group_1_0__1__Impl ;
    public final void rule__Expr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3530:1: ( rule__Expr__Group_1_0__1__Impl )
            // InternalMAL.g:3531:2: rule__Expr__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1_0__1"


    // $ANTLR start "rule__Expr__Group_1_0__1__Impl"
    // InternalMAL.g:3537:1: rule__Expr__Group_1_0__1__Impl : ( ( rule__Expr__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Expr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3541:1: ( ( ( rule__Expr__OperatorAssignment_1_0_1 ) ) )
            // InternalMAL.g:3542:1: ( ( rule__Expr__OperatorAssignment_1_0_1 ) )
            {
            // InternalMAL.g:3542:1: ( ( rule__Expr__OperatorAssignment_1_0_1 ) )
            // InternalMAL.g:3543:2: ( rule__Expr__OperatorAssignment_1_0_1 )
            {
             before(grammarAccess.getExprAccess().getOperatorAssignment_1_0_1()); 
            // InternalMAL.g:3544:2: ( rule__Expr__OperatorAssignment_1_0_1 )
            // InternalMAL.g:3544:3: rule__Expr__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expr__OperatorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getOperatorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_0__0"
    // InternalMAL.g:3553:1: rule__Factor__Group_0__0 : rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 ;
    public final void rule__Factor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3557:1: ( rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 )
            // InternalMAL.g:3558:2: rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Factor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__0"


    // $ANTLR start "rule__Factor__Group_0__0__Impl"
    // InternalMAL.g:3565:1: rule__Factor__Group_0__0__Impl : ( () ) ;
    public final void rule__Factor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3569:1: ( ( () ) )
            // InternalMAL.g:3570:1: ( () )
            {
            // InternalMAL.g:3570:1: ( () )
            // InternalMAL.g:3571:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorAction_0_0()); 
            // InternalMAL.g:3572:2: ()
            // InternalMAL.g:3572:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getFactorAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_0__1"
    // InternalMAL.g:3580:1: rule__Factor__Group_0__1 : rule__Factor__Group_0__1__Impl ;
    public final void rule__Factor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3584:1: ( rule__Factor__Group_0__1__Impl )
            // InternalMAL.g:3585:2: rule__Factor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__1"


    // $ANTLR start "rule__Factor__Group_0__1__Impl"
    // InternalMAL.g:3591:1: rule__Factor__Group_0__1__Impl : ( ruleLiteral_constant ) ;
    public final void rule__Factor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3595:1: ( ( ruleLiteral_constant ) )
            // InternalMAL.g:3596:1: ( ruleLiteral_constant )
            {
            // InternalMAL.g:3596:1: ( ruleLiteral_constant )
            // InternalMAL.g:3597:2: ruleLiteral_constant
            {
             before(grammarAccess.getFactorAccess().getLiteral_constantParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleLiteral_constant();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getLiteral_constantParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalMAL.g:3607:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3611:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalMAL.g:3612:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalMAL.g:3619:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3623:1: ( ( () ) )
            // InternalMAL.g:3624:1: ( () )
            {
            // InternalMAL.g:3624:1: ( () )
            // InternalMAL.g:3625:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorAction_1_0()); 
            // InternalMAL.g:3626:2: ()
            // InternalMAL.g:3626:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getFactorAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalMAL.g:3634:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3638:1: ( rule__Factor__Group_1__1__Impl )
            // InternalMAL.g:3639:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalMAL.g:3645:1: rule__Factor__Group_1__1__Impl : ( 'NIL' ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3649:1: ( ( 'NIL' ) )
            // InternalMAL.g:3650:1: ( 'NIL' )
            {
            // InternalMAL.g:3650:1: ( 'NIL' )
            // InternalMAL.g:3651:2: 'NIL'
            {
             before(grammarAccess.getFactorAccess().getNILKeyword_1_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNILKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Fcncall__Group__0"
    // InternalMAL.g:3661:1: rule__Fcncall__Group__0 : rule__Fcncall__Group__0__Impl rule__Fcncall__Group__1 ;
    public final void rule__Fcncall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3665:1: ( rule__Fcncall__Group__0__Impl rule__Fcncall__Group__1 )
            // InternalMAL.g:3666:2: rule__Fcncall__Group__0__Impl rule__Fcncall__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Fcncall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fcncall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__0"


    // $ANTLR start "rule__Fcncall__Group__0__Impl"
    // InternalMAL.g:3673:1: rule__Fcncall__Group__0__Impl : ( ( rule__Fcncall__ModuleAssignment_0 ) ) ;
    public final void rule__Fcncall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3677:1: ( ( ( rule__Fcncall__ModuleAssignment_0 ) ) )
            // InternalMAL.g:3678:1: ( ( rule__Fcncall__ModuleAssignment_0 ) )
            {
            // InternalMAL.g:3678:1: ( ( rule__Fcncall__ModuleAssignment_0 ) )
            // InternalMAL.g:3679:2: ( rule__Fcncall__ModuleAssignment_0 )
            {
             before(grammarAccess.getFcncallAccess().getModuleAssignment_0()); 
            // InternalMAL.g:3680:2: ( rule__Fcncall__ModuleAssignment_0 )
            // InternalMAL.g:3680:3: rule__Fcncall__ModuleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fcncall__ModuleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFcncallAccess().getModuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__0__Impl"


    // $ANTLR start "rule__Fcncall__Group__1"
    // InternalMAL.g:3688:1: rule__Fcncall__Group__1 : rule__Fcncall__Group__1__Impl rule__Fcncall__Group__2 ;
    public final void rule__Fcncall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3692:1: ( rule__Fcncall__Group__1__Impl rule__Fcncall__Group__2 )
            // InternalMAL.g:3693:2: rule__Fcncall__Group__1__Impl rule__Fcncall__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Fcncall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fcncall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__1"


    // $ANTLR start "rule__Fcncall__Group__1__Impl"
    // InternalMAL.g:3700:1: rule__Fcncall__Group__1__Impl : ( '.' ) ;
    public final void rule__Fcncall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3704:1: ( ( '.' ) )
            // InternalMAL.g:3705:1: ( '.' )
            {
            // InternalMAL.g:3705:1: ( '.' )
            // InternalMAL.g:3706:2: '.'
            {
             before(grammarAccess.getFcncallAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFcncallAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__1__Impl"


    // $ANTLR start "rule__Fcncall__Group__2"
    // InternalMAL.g:3715:1: rule__Fcncall__Group__2 : rule__Fcncall__Group__2__Impl rule__Fcncall__Group__3 ;
    public final void rule__Fcncall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3719:1: ( rule__Fcncall__Group__2__Impl rule__Fcncall__Group__3 )
            // InternalMAL.g:3720:2: rule__Fcncall__Group__2__Impl rule__Fcncall__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Fcncall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fcncall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__2"


    // $ANTLR start "rule__Fcncall__Group__2__Impl"
    // InternalMAL.g:3727:1: rule__Fcncall__Group__2__Impl : ( ( rule__Fcncall__Function_nameAssignment_2 ) ) ;
    public final void rule__Fcncall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3731:1: ( ( ( rule__Fcncall__Function_nameAssignment_2 ) ) )
            // InternalMAL.g:3732:1: ( ( rule__Fcncall__Function_nameAssignment_2 ) )
            {
            // InternalMAL.g:3732:1: ( ( rule__Fcncall__Function_nameAssignment_2 ) )
            // InternalMAL.g:3733:2: ( rule__Fcncall__Function_nameAssignment_2 )
            {
             before(grammarAccess.getFcncallAccess().getFunction_nameAssignment_2()); 
            // InternalMAL.g:3734:2: ( rule__Fcncall__Function_nameAssignment_2 )
            // InternalMAL.g:3734:3: rule__Fcncall__Function_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fcncall__Function_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFcncallAccess().getFunction_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__2__Impl"


    // $ANTLR start "rule__Fcncall__Group__3"
    // InternalMAL.g:3742:1: rule__Fcncall__Group__3 : rule__Fcncall__Group__3__Impl rule__Fcncall__Group__4 ;
    public final void rule__Fcncall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3746:1: ( rule__Fcncall__Group__3__Impl rule__Fcncall__Group__4 )
            // InternalMAL.g:3747:2: rule__Fcncall__Group__3__Impl rule__Fcncall__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Fcncall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fcncall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__3"


    // $ANTLR start "rule__Fcncall__Group__3__Impl"
    // InternalMAL.g:3754:1: rule__Fcncall__Group__3__Impl : ( '(' ) ;
    public final void rule__Fcncall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3758:1: ( ( '(' ) )
            // InternalMAL.g:3759:1: ( '(' )
            {
            // InternalMAL.g:3759:1: ( '(' )
            // InternalMAL.g:3760:2: '('
            {
             before(grammarAccess.getFcncallAccess().getLeftParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFcncallAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__3__Impl"


    // $ANTLR start "rule__Fcncall__Group__4"
    // InternalMAL.g:3769:1: rule__Fcncall__Group__4 : rule__Fcncall__Group__4__Impl rule__Fcncall__Group__5 ;
    public final void rule__Fcncall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3773:1: ( rule__Fcncall__Group__4__Impl rule__Fcncall__Group__5 )
            // InternalMAL.g:3774:2: rule__Fcncall__Group__4__Impl rule__Fcncall__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Fcncall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fcncall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__4"


    // $ANTLR start "rule__Fcncall__Group__4__Impl"
    // InternalMAL.g:3781:1: rule__Fcncall__Group__4__Impl : ( ( rule__Fcncall__ArgsAssignment_4 )? ) ;
    public final void rule__Fcncall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3785:1: ( ( ( rule__Fcncall__ArgsAssignment_4 )? ) )
            // InternalMAL.g:3786:1: ( ( rule__Fcncall__ArgsAssignment_4 )? )
            {
            // InternalMAL.g:3786:1: ( ( rule__Fcncall__ArgsAssignment_4 )? )
            // InternalMAL.g:3787:2: ( rule__Fcncall__ArgsAssignment_4 )?
            {
             before(grammarAccess.getFcncallAccess().getArgsAssignment_4()); 
            // InternalMAL.g:3788:2: ( rule__Fcncall__ArgsAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMAL.g:3788:3: rule__Fcncall__ArgsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fcncall__ArgsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFcncallAccess().getArgsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__4__Impl"


    // $ANTLR start "rule__Fcncall__Group__5"
    // InternalMAL.g:3796:1: rule__Fcncall__Group__5 : rule__Fcncall__Group__5__Impl ;
    public final void rule__Fcncall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3800:1: ( rule__Fcncall__Group__5__Impl )
            // InternalMAL.g:3801:2: rule__Fcncall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fcncall__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__5"


    // $ANTLR start "rule__Fcncall__Group__5__Impl"
    // InternalMAL.g:3807:1: rule__Fcncall__Group__5__Impl : ( ')' ) ;
    public final void rule__Fcncall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3811:1: ( ( ')' ) )
            // InternalMAL.g:3812:1: ( ')' )
            {
            // InternalMAL.g:3812:1: ( ')' )
            // InternalMAL.g:3813:2: ')'
            {
             before(grammarAccess.getFcncallAccess().getRightParenthesisKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFcncallAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Group__5__Impl"


    // $ANTLR start "rule__Args__Group__0"
    // InternalMAL.g:3823:1: rule__Args__Group__0 : rule__Args__Group__0__Impl rule__Args__Group__1 ;
    public final void rule__Args__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3827:1: ( rule__Args__Group__0__Impl rule__Args__Group__1 )
            // InternalMAL.g:3828:2: rule__Args__Group__0__Impl rule__Args__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Args__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Args__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__0"


    // $ANTLR start "rule__Args__Group__0__Impl"
    // InternalMAL.g:3835:1: rule__Args__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Args__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3839:1: ( ( ruleFactor ) )
            // InternalMAL.g:3840:1: ( ruleFactor )
            {
            // InternalMAL.g:3840:1: ( ruleFactor )
            // InternalMAL.g:3841:2: ruleFactor
            {
             before(grammarAccess.getArgsAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getArgsAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__0__Impl"


    // $ANTLR start "rule__Args__Group__1"
    // InternalMAL.g:3850:1: rule__Args__Group__1 : rule__Args__Group__1__Impl ;
    public final void rule__Args__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3854:1: ( rule__Args__Group__1__Impl )
            // InternalMAL.g:3855:2: rule__Args__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Args__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__1"


    // $ANTLR start "rule__Args__Group__1__Impl"
    // InternalMAL.g:3861:1: rule__Args__Group__1__Impl : ( ( rule__Args__Group_1__0 )* ) ;
    public final void rule__Args__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3865:1: ( ( ( rule__Args__Group_1__0 )* ) )
            // InternalMAL.g:3866:1: ( ( rule__Args__Group_1__0 )* )
            {
            // InternalMAL.g:3866:1: ( ( rule__Args__Group_1__0 )* )
            // InternalMAL.g:3867:2: ( rule__Args__Group_1__0 )*
            {
             before(grammarAccess.getArgsAccess().getGroup_1()); 
            // InternalMAL.g:3868:2: ( rule__Args__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMAL.g:3868:3: rule__Args__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Args__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getArgsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group__1__Impl"


    // $ANTLR start "rule__Args__Group_1__0"
    // InternalMAL.g:3877:1: rule__Args__Group_1__0 : rule__Args__Group_1__0__Impl rule__Args__Group_1__1 ;
    public final void rule__Args__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3881:1: ( rule__Args__Group_1__0__Impl rule__Args__Group_1__1 )
            // InternalMAL.g:3882:2: rule__Args__Group_1__0__Impl rule__Args__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Args__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Args__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_1__0"


    // $ANTLR start "rule__Args__Group_1__0__Impl"
    // InternalMAL.g:3889:1: rule__Args__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Args__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3893:1: ( ( ',' ) )
            // InternalMAL.g:3894:1: ( ',' )
            {
            // InternalMAL.g:3894:1: ( ',' )
            // InternalMAL.g:3895:2: ','
            {
             before(grammarAccess.getArgsAccess().getCommaKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getArgsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_1__0__Impl"


    // $ANTLR start "rule__Args__Group_1__1"
    // InternalMAL.g:3904:1: rule__Args__Group_1__1 : rule__Args__Group_1__1__Impl ;
    public final void rule__Args__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3908:1: ( rule__Args__Group_1__1__Impl )
            // InternalMAL.g:3909:2: rule__Args__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Args__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_1__1"


    // $ANTLR start "rule__Args__Group_1__1__Impl"
    // InternalMAL.g:3915:1: rule__Args__Group_1__1__Impl : ( ( rule__Args__Factor1Assignment_1_1 ) ) ;
    public final void rule__Args__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3919:1: ( ( ( rule__Args__Factor1Assignment_1_1 ) ) )
            // InternalMAL.g:3920:1: ( ( rule__Args__Factor1Assignment_1_1 ) )
            {
            // InternalMAL.g:3920:1: ( ( rule__Args__Factor1Assignment_1_1 ) )
            // InternalMAL.g:3921:2: ( rule__Args__Factor1Assignment_1_1 )
            {
             before(grammarAccess.getArgsAccess().getFactor1Assignment_1_1()); 
            // InternalMAL.g:3922:2: ( rule__Args__Factor1Assignment_1_1 )
            // InternalMAL.g:3922:3: rule__Args__Factor1Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Args__Factor1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArgsAccess().getFactor1Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Group_1__1__Impl"


    // $ANTLR start "rule__Bte__Group__0"
    // InternalMAL.g:3931:1: rule__Bte__Group__0 : rule__Bte__Group__0__Impl rule__Bte__Group__1 ;
    public final void rule__Bte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3935:1: ( rule__Bte__Group__0__Impl rule__Bte__Group__1 )
            // InternalMAL.g:3936:2: rule__Bte__Group__0__Impl rule__Bte__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Bte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bte__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__0"


    // $ANTLR start "rule__Bte__Group__0__Impl"
    // InternalMAL.g:3943:1: rule__Bte__Group__0__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3947:1: ( ( RULE_BIT ) )
            // InternalMAL.g:3948:1: ( RULE_BIT )
            {
            // InternalMAL.g:3948:1: ( RULE_BIT )
            // InternalMAL.g:3949:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_0()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__0__Impl"


    // $ANTLR start "rule__Bte__Group__1"
    // InternalMAL.g:3958:1: rule__Bte__Group__1 : rule__Bte__Group__1__Impl rule__Bte__Group__2 ;
    public final void rule__Bte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3962:1: ( rule__Bte__Group__1__Impl rule__Bte__Group__2 )
            // InternalMAL.g:3963:2: rule__Bte__Group__1__Impl rule__Bte__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Bte__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bte__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__1"


    // $ANTLR start "rule__Bte__Group__1__Impl"
    // InternalMAL.g:3970:1: rule__Bte__Group__1__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3974:1: ( ( RULE_BIT ) )
            // InternalMAL.g:3975:1: ( RULE_BIT )
            {
            // InternalMAL.g:3975:1: ( RULE_BIT )
            // InternalMAL.g:3976:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_1()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__1__Impl"


    // $ANTLR start "rule__Bte__Group__2"
    // InternalMAL.g:3985:1: rule__Bte__Group__2 : rule__Bte__Group__2__Impl rule__Bte__Group__3 ;
    public final void rule__Bte__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3989:1: ( rule__Bte__Group__2__Impl rule__Bte__Group__3 )
            // InternalMAL.g:3990:2: rule__Bte__Group__2__Impl rule__Bte__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Bte__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bte__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__2"


    // $ANTLR start "rule__Bte__Group__2__Impl"
    // InternalMAL.g:3997:1: rule__Bte__Group__2__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4001:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4002:1: ( RULE_BIT )
            {
            // InternalMAL.g:4002:1: ( RULE_BIT )
            // InternalMAL.g:4003:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_2()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__2__Impl"


    // $ANTLR start "rule__Bte__Group__3"
    // InternalMAL.g:4012:1: rule__Bte__Group__3 : rule__Bte__Group__3__Impl rule__Bte__Group__4 ;
    public final void rule__Bte__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4016:1: ( rule__Bte__Group__3__Impl rule__Bte__Group__4 )
            // InternalMAL.g:4017:2: rule__Bte__Group__3__Impl rule__Bte__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Bte__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bte__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__3"


    // $ANTLR start "rule__Bte__Group__3__Impl"
    // InternalMAL.g:4024:1: rule__Bte__Group__3__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4028:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4029:1: ( RULE_BIT )
            {
            // InternalMAL.g:4029:1: ( RULE_BIT )
            // InternalMAL.g:4030:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_3()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__3__Impl"


    // $ANTLR start "rule__Bte__Group__4"
    // InternalMAL.g:4039:1: rule__Bte__Group__4 : rule__Bte__Group__4__Impl rule__Bte__Group__5 ;
    public final void rule__Bte__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4043:1: ( rule__Bte__Group__4__Impl rule__Bte__Group__5 )
            // InternalMAL.g:4044:2: rule__Bte__Group__4__Impl rule__Bte__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Bte__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bte__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__4"


    // $ANTLR start "rule__Bte__Group__4__Impl"
    // InternalMAL.g:4051:1: rule__Bte__Group__4__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4055:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4056:1: ( RULE_BIT )
            {
            // InternalMAL.g:4056:1: ( RULE_BIT )
            // InternalMAL.g:4057:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_4()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__4__Impl"


    // $ANTLR start "rule__Bte__Group__5"
    // InternalMAL.g:4066:1: rule__Bte__Group__5 : rule__Bte__Group__5__Impl rule__Bte__Group__6 ;
    public final void rule__Bte__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4070:1: ( rule__Bte__Group__5__Impl rule__Bte__Group__6 )
            // InternalMAL.g:4071:2: rule__Bte__Group__5__Impl rule__Bte__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Bte__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bte__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__5"


    // $ANTLR start "rule__Bte__Group__5__Impl"
    // InternalMAL.g:4078:1: rule__Bte__Group__5__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4082:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4083:1: ( RULE_BIT )
            {
            // InternalMAL.g:4083:1: ( RULE_BIT )
            // InternalMAL.g:4084:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_5()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__5__Impl"


    // $ANTLR start "rule__Bte__Group__6"
    // InternalMAL.g:4093:1: rule__Bte__Group__6 : rule__Bte__Group__6__Impl rule__Bte__Group__7 ;
    public final void rule__Bte__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4097:1: ( rule__Bte__Group__6__Impl rule__Bte__Group__7 )
            // InternalMAL.g:4098:2: rule__Bte__Group__6__Impl rule__Bte__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__Bte__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bte__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__6"


    // $ANTLR start "rule__Bte__Group__6__Impl"
    // InternalMAL.g:4105:1: rule__Bte__Group__6__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4109:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4110:1: ( RULE_BIT )
            {
            // InternalMAL.g:4110:1: ( RULE_BIT )
            // InternalMAL.g:4111:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_6()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__6__Impl"


    // $ANTLR start "rule__Bte__Group__7"
    // InternalMAL.g:4120:1: rule__Bte__Group__7 : rule__Bte__Group__7__Impl ;
    public final void rule__Bte__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4124:1: ( rule__Bte__Group__7__Impl )
            // InternalMAL.g:4125:2: rule__Bte__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bte__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__7"


    // $ANTLR start "rule__Bte__Group__7__Impl"
    // InternalMAL.g:4131:1: rule__Bte__Group__7__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4135:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4136:1: ( RULE_BIT )
            {
            // InternalMAL.g:4136:1: ( RULE_BIT )
            // InternalMAL.g:4137:2: RULE_BIT
            {
             before(grammarAccess.getBteAccess().getBITTerminalRuleCall_7()); 
            match(input,RULE_BIT,FOLLOW_2); 
             after(grammarAccess.getBteAccess().getBITTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bte__Group__7__Impl"


    // $ANTLR start "rule__FLT__Group__0"
    // InternalMAL.g:4147:1: rule__FLT__Group__0 : rule__FLT__Group__0__Impl rule__FLT__Group__1 ;
    public final void rule__FLT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4151:1: ( rule__FLT__Group__0__Impl rule__FLT__Group__1 )
            // InternalMAL.g:4152:2: rule__FLT__Group__0__Impl rule__FLT__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FLT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLT__Group__0"


    // $ANTLR start "rule__FLT__Group__0__Impl"
    // InternalMAL.g:4159:1: rule__FLT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4163:1: ( ( RULE_INT ) )
            // InternalMAL.g:4164:1: ( RULE_INT )
            {
            // InternalMAL.g:4164:1: ( RULE_INT )
            // InternalMAL.g:4165:2: RULE_INT
            {
             before(grammarAccess.getFLTAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLTAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLT__Group__0__Impl"


    // $ANTLR start "rule__FLT__Group__1"
    // InternalMAL.g:4174:1: rule__FLT__Group__1 : rule__FLT__Group__1__Impl rule__FLT__Group__2 ;
    public final void rule__FLT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4178:1: ( rule__FLT__Group__1__Impl rule__FLT__Group__2 )
            // InternalMAL.g:4179:2: rule__FLT__Group__1__Impl rule__FLT__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__FLT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLT__Group__1"


    // $ANTLR start "rule__FLT__Group__1__Impl"
    // InternalMAL.g:4186:1: rule__FLT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4190:1: ( ( '.' ) )
            // InternalMAL.g:4191:1: ( '.' )
            {
            // InternalMAL.g:4191:1: ( '.' )
            // InternalMAL.g:4192:2: '.'
            {
             before(grammarAccess.getFLTAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFLTAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLT__Group__1__Impl"


    // $ANTLR start "rule__FLT__Group__2"
    // InternalMAL.g:4201:1: rule__FLT__Group__2 : rule__FLT__Group__2__Impl ;
    public final void rule__FLT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4205:1: ( rule__FLT__Group__2__Impl )
            // InternalMAL.g:4206:2: rule__FLT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLT__Group__2"


    // $ANTLR start "rule__FLT__Group__2__Impl"
    // InternalMAL.g:4212:1: rule__FLT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4216:1: ( ( RULE_INT ) )
            // InternalMAL.g:4217:1: ( RULE_INT )
            {
            // InternalMAL.g:4217:1: ( RULE_INT )
            // InternalMAL.g:4218:2: RULE_INT
            {
             before(grammarAccess.getFLTAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLTAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLT__Group__2__Impl"


    // $ANTLR start "rule__Program__ElementsAssignment_0"
    // InternalMAL.g:4228:1: rule__Program__ElementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__Program__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4232:1: ( ( ruleStatement ) )
            // InternalMAL.g:4233:2: ( ruleStatement )
            {
            // InternalMAL.g:4233:2: ( ruleStatement )
            // InternalMAL.g:4234:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getElementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getElementsStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ElementsAssignment_0"


    // $ANTLR start "rule__Statement__HelpAssignment_0_1"
    // InternalMAL.g:4243:1: rule__Statement__HelpAssignment_0_1 : ( ruleHelpinfo ) ;
    public final void rule__Statement__HelpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4247:1: ( ( ruleHelpinfo ) )
            // InternalMAL.g:4248:2: ( ruleHelpinfo )
            {
            // InternalMAL.g:4248:2: ( ruleHelpinfo )
            // InternalMAL.g:4249:3: ruleHelpinfo
            {
             before(grammarAccess.getStatementAccess().getHelpHelpinfoParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelpinfo();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getHelpHelpinfoParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__HelpAssignment_0_1"


    // $ANTLR start "rule__Statement__HelpAssignment_1_1"
    // InternalMAL.g:4258:1: rule__Statement__HelpAssignment_1_1 : ( ruleHelpinfo ) ;
    public final void rule__Statement__HelpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4262:1: ( ( ruleHelpinfo ) )
            // InternalMAL.g:4263:2: ( ruleHelpinfo )
            {
            // InternalMAL.g:4263:2: ( ruleHelpinfo )
            // InternalMAL.g:4264:3: ruleHelpinfo
            {
             before(grammarAccess.getStatementAccess().getHelpHelpinfoParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelpinfo();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getHelpHelpinfoParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__HelpAssignment_1_1"


    // $ANTLR start "rule__ModuleStmt__IdentAssignment_0_1"
    // InternalMAL.g:4273:1: rule__ModuleStmt__IdentAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ModuleStmt__IdentAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4277:1: ( ( RULE_ID ) )
            // InternalMAL.g:4278:2: ( RULE_ID )
            {
            // InternalMAL.g:4278:2: ( RULE_ID )
            // InternalMAL.g:4279:3: RULE_ID
            {
             before(grammarAccess.getModuleStmtAccess().getIdentIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getIdentIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__IdentAssignment_0_1"


    // $ANTLR start "rule__ModuleStmt__IdentAssignment_1_1"
    // InternalMAL.g:4288:1: rule__ModuleStmt__IdentAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ModuleStmt__IdentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4292:1: ( ( RULE_ID ) )
            // InternalMAL.g:4293:2: ( RULE_ID )
            {
            // InternalMAL.g:4293:2: ( RULE_ID )
            // InternalMAL.g:4294:3: RULE_ID
            {
             before(grammarAccess.getModuleStmtAccess().getIdentIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getIdentIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__IdentAssignment_1_1"


    // $ANTLR start "rule__ModuleStmt__Second_identAssignment_1_2_1"
    // InternalMAL.g:4303:1: rule__ModuleStmt__Second_identAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__ModuleStmt__Second_identAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4307:1: ( ( RULE_ID ) )
            // InternalMAL.g:4308:2: ( RULE_ID )
            {
            // InternalMAL.g:4308:2: ( RULE_ID )
            // InternalMAL.g:4309:3: RULE_ID
            {
             before(grammarAccess.getModuleStmtAccess().getSecond_identIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getSecond_identIDTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleStmt__Second_identAssignment_1_2_1"


    // $ANTLR start "rule__IncludeStmt__IdentifierAssignment_0_1"
    // InternalMAL.g:4318:1: rule__IncludeStmt__IdentifierAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__IncludeStmt__IdentifierAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4322:1: ( ( RULE_ID ) )
            // InternalMAL.g:4323:2: ( RULE_ID )
            {
            // InternalMAL.g:4323:2: ( RULE_ID )
            // InternalMAL.g:4324:3: RULE_ID
            {
             before(grammarAccess.getIncludeStmtAccess().getIdentifierIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncludeStmtAccess().getIdentifierIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__IdentifierAssignment_0_1"


    // $ANTLR start "rule__IncludeStmt__String_literalAssignment_1_1"
    // InternalMAL.g:4333:1: rule__IncludeStmt__String_literalAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__IncludeStmt__String_literalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4337:1: ( ( RULE_STRING ) )
            // InternalMAL.g:4338:2: ( RULE_STRING )
            {
            // InternalMAL.g:4338:2: ( RULE_STRING )
            // InternalMAL.g:4339:3: RULE_STRING
            {
             before(grammarAccess.getIncludeStmtAccess().getString_literalSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludeStmtAccess().getString_literalSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeStmt__String_literalAssignment_1_1"


    // $ANTLR start "rule__Definition__HeaderAssignment_0_2"
    // InternalMAL.g:4348:1: rule__Definition__HeaderAssignment_0_2 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4352:1: ( ( ruleHeader ) )
            // InternalMAL.g:4353:2: ( ruleHeader )
            {
            // InternalMAL.g:4353:2: ( ruleHeader )
            // InternalMAL.g:4354:3: ruleHeader
            {
             before(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__HeaderAssignment_0_2"


    // $ANTLR start "rule__Definition__IdentifierAssignment_0_4"
    // InternalMAL.g:4363:1: rule__Definition__IdentifierAssignment_0_4 : ( RULE_ID ) ;
    public final void rule__Definition__IdentifierAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4367:1: ( ( RULE_ID ) )
            // InternalMAL.g:4368:2: ( RULE_ID )
            {
            // InternalMAL.g:4368:2: ( RULE_ID )
            // InternalMAL.g:4369:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierIDTerminalRuleCall_0_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getIdentifierIDTerminalRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__IdentifierAssignment_0_4"


    // $ANTLR start "rule__Definition__HeaderAssignment_1_2"
    // InternalMAL.g:4378:1: rule__Definition__HeaderAssignment_1_2 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4382:1: ( ( ruleHeader ) )
            // InternalMAL.g:4383:2: ( ruleHeader )
            {
            // InternalMAL.g:4383:2: ( ruleHeader )
            // InternalMAL.g:4384:3: ruleHeader
            {
             before(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__HeaderAssignment_1_2"


    // $ANTLR start "rule__Definition__IdentifierAssignment_1_4"
    // InternalMAL.g:4393:1: rule__Definition__IdentifierAssignment_1_4 : ( RULE_ID ) ;
    public final void rule__Definition__IdentifierAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4397:1: ( ( RULE_ID ) )
            // InternalMAL.g:4398:2: ( RULE_ID )
            {
            // InternalMAL.g:4398:2: ( RULE_ID )
            // InternalMAL.g:4399:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierIDTerminalRuleCall_1_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getIdentifierIDTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__IdentifierAssignment_1_4"


    // $ANTLR start "rule__Definition__HeaderAssignment_2_2"
    // InternalMAL.g:4408:1: rule__Definition__HeaderAssignment_2_2 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4412:1: ( ( ruleHeader ) )
            // InternalMAL.g:4413:2: ( ruleHeader )
            {
            // InternalMAL.g:4413:2: ( ruleHeader )
            // InternalMAL.g:4414:3: ruleHeader
            {
             before(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__HeaderAssignment_2_2"


    // $ANTLR start "rule__Definition__StatementsAssignment_2_3"
    // InternalMAL.g:4423:1: rule__Definition__StatementsAssignment_2_3 : ( ruleStatement ) ;
    public final void rule__Definition__StatementsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4427:1: ( ( ruleStatement ) )
            // InternalMAL.g:4428:2: ( ruleStatement )
            {
            // InternalMAL.g:4428:2: ( ruleStatement )
            // InternalMAL.g:4429:3: ruleStatement
            {
             before(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__StatementsAssignment_2_3"


    // $ANTLR start "rule__Definition__Function_nameAssignment_2_5"
    // InternalMAL.g:4438:1: rule__Definition__Function_nameAssignment_2_5 : ( ruleName ) ;
    public final void rule__Definition__Function_nameAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4442:1: ( ( ruleName ) )
            // InternalMAL.g:4443:2: ( ruleName )
            {
            // InternalMAL.g:4443:2: ( ruleName )
            // InternalMAL.g:4444:3: ruleName
            {
             before(grammarAccess.getDefinitionAccess().getFunction_nameNameParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getFunction_nameNameParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Function_nameAssignment_2_5"


    // $ANTLR start "rule__Definition__HeaderAssignment_3_1"
    // InternalMAL.g:4453:1: rule__Definition__HeaderAssignment_3_1 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4457:1: ( ( ruleHeader ) )
            // InternalMAL.g:4458:2: ( ruleHeader )
            {
            // InternalMAL.g:4458:2: ( ruleHeader )
            // InternalMAL.g:4459:3: ruleHeader
            {
             before(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getHeaderHeaderParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__HeaderAssignment_3_1"


    // $ANTLR start "rule__Definition__StatementsAssignment_3_2"
    // InternalMAL.g:4468:1: rule__Definition__StatementsAssignment_3_2 : ( ruleStatement ) ;
    public final void rule__Definition__StatementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4472:1: ( ( ruleStatement ) )
            // InternalMAL.g:4473:2: ( ruleStatement )
            {
            // InternalMAL.g:4473:2: ( ruleStatement )
            // InternalMAL.g:4474:3: ruleStatement
            {
             before(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getStatementsStatementParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__StatementsAssignment_3_2"


    // $ANTLR start "rule__Definition__Factory_nameAssignment_3_4"
    // InternalMAL.g:4483:1: rule__Definition__Factory_nameAssignment_3_4 : ( ruleName ) ;
    public final void rule__Definition__Factory_nameAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4487:1: ( ( ruleName ) )
            // InternalMAL.g:4488:2: ( ruleName )
            {
            // InternalMAL.g:4488:2: ( ruleName )
            // InternalMAL.g:4489:3: ruleName
            {
             before(grammarAccess.getDefinitionAccess().getFactory_nameNameParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getFactory_nameNameParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Factory_nameAssignment_3_4"


    // $ANTLR start "rule__Helpinfo__String_literalAssignment_1"
    // InternalMAL.g:4498:1: rule__Helpinfo__String_literalAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Helpinfo__String_literalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4502:1: ( ( RULE_STRING ) )
            // InternalMAL.g:4503:2: ( RULE_STRING )
            {
            // InternalMAL.g:4503:2: ( RULE_STRING )
            // InternalMAL.g:4504:3: RULE_STRING
            {
             before(grammarAccess.getHelpinfoAccess().getString_literalSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHelpinfoAccess().getString_literalSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Helpinfo__String_literalAssignment_1"


    // $ANTLR start "rule__Header__Header_nameAssignment_0"
    // InternalMAL.g:4513:1: rule__Header__Header_nameAssignment_0 : ( ruleName ) ;
    public final void rule__Header__Header_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4517:1: ( ( ruleName ) )
            // InternalMAL.g:4518:2: ( ruleName )
            {
            // InternalMAL.g:4518:2: ( ruleName )
            // InternalMAL.g:4519:3: ruleName
            {
             before(grammarAccess.getHeaderAccess().getHeader_nameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getHeader_nameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Header_nameAssignment_0"


    // $ANTLR start "rule__Header__ParamsAssignment_2"
    // InternalMAL.g:4528:1: rule__Header__ParamsAssignment_2 : ( ruleParams ) ;
    public final void rule__Header__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4532:1: ( ( ruleParams ) )
            // InternalMAL.g:4533:2: ( ruleParams )
            {
            // InternalMAL.g:4533:2: ( ruleParams )
            // InternalMAL.g:4534:3: ruleParams
            {
             before(grammarAccess.getHeaderAccess().getParamsParamsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParams();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getParamsParamsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__ParamsAssignment_2"


    // $ANTLR start "rule__Header__Return_typeAssignment_4"
    // InternalMAL.g:4543:1: rule__Header__Return_typeAssignment_4 : ( ruleResult ) ;
    public final void rule__Header__Return_typeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4547:1: ( ( ruleResult ) )
            // InternalMAL.g:4548:2: ( ruleResult )
            {
            // InternalMAL.g:4548:2: ( ruleResult )
            // InternalMAL.g:4549:3: ruleResult
            {
             before(grammarAccess.getHeaderAccess().getReturn_typeResultParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getReturn_typeResultParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Return_typeAssignment_4"


    // $ANTLR start "rule__Name__MnAssignment_0_0"
    // InternalMAL.g:4558:1: rule__Name__MnAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Name__MnAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4562:1: ( ( ( RULE_ID ) ) )
            // InternalMAL.g:4563:2: ( ( RULE_ID ) )
            {
            // InternalMAL.g:4563:2: ( ( RULE_ID ) )
            // InternalMAL.g:4564:3: ( RULE_ID )
            {
             before(grammarAccess.getNameAccess().getMnModuleNameCrossReference_0_0_0()); 
            // InternalMAL.g:4565:3: ( RULE_ID )
            // InternalMAL.g:4566:4: RULE_ID
            {
             before(grammarAccess.getNameAccess().getMnModuleNameIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getMnModuleNameIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getNameAccess().getMnModuleNameCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__MnAssignment_0_0"


    // $ANTLR start "rule__Name__IdAssignment_1"
    // InternalMAL.g:4577:1: rule__Name__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4581:1: ( ( RULE_ID ) )
            // InternalMAL.g:4582:2: ( RULE_ID )
            {
            // InternalMAL.g:4582:2: ( RULE_ID )
            // InternalMAL.g:4583:3: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__IdAssignment_1"


    // $ANTLR start "rule__Params__BindAssignment_0"
    // InternalMAL.g:4592:1: rule__Params__BindAssignment_0 : ( ruleBinding ) ;
    public final void rule__Params__BindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4596:1: ( ( ruleBinding ) )
            // InternalMAL.g:4597:2: ( ruleBinding )
            {
            // InternalMAL.g:4597:2: ( ruleBinding )
            // InternalMAL.g:4598:3: ruleBinding
            {
             before(grammarAccess.getParamsAccess().getBindBindingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getParamsAccess().getBindBindingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__BindAssignment_0"


    // $ANTLR start "rule__Params__BindAssignment_1_1"
    // InternalMAL.g:4607:1: rule__Params__BindAssignment_1_1 : ( ruleBinding ) ;
    public final void rule__Params__BindAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4611:1: ( ( ruleBinding ) )
            // InternalMAL.g:4612:2: ( ruleBinding )
            {
            // InternalMAL.g:4612:2: ( ruleBinding )
            // InternalMAL.g:4613:3: ruleBinding
            {
             before(grammarAccess.getParamsAccess().getBindBindingParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getParamsAccess().getBindBindingParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Params__BindAssignment_1_1"


    // $ANTLR start "rule__Binding__IdentifierAssignment_0"
    // InternalMAL.g:4622:1: rule__Binding__IdentifierAssignment_0 : ( RULE_ID ) ;
    public final void rule__Binding__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4626:1: ( ( RULE_ID ) )
            // InternalMAL.g:4627:2: ( RULE_ID )
            {
            // InternalMAL.g:4627:2: ( RULE_ID )
            // InternalMAL.g:4628:3: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getIdentifierIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getIdentifierIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__IdentifierAssignment_0"


    // $ANTLR start "rule__Binding__TypeAssignment_1"
    // InternalMAL.g:4637:1: rule__Binding__TypeAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Binding__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4641:1: ( ( ruleTypeName ) )
            // InternalMAL.g:4642:2: ( ruleTypeName )
            {
            // InternalMAL.g:4642:2: ( ruleTypeName )
            // InternalMAL.g:4643:3: ruleTypeName
            {
             before(grammarAccess.getBindingAccess().getTypeTypeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getTypeTypeNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__TypeAssignment_1"


    // $ANTLR start "rule__ScalarType__IdentifierAssignment_1"
    // InternalMAL.g:4652:1: rule__ScalarType__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScalarType__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4656:1: ( ( RULE_ID ) )
            // InternalMAL.g:4657:2: ( RULE_ID )
            {
            // InternalMAL.g:4657:2: ( RULE_ID )
            // InternalMAL.g:4658:3: RULE_ID
            {
             before(grammarAccess.getScalarTypeAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScalarTypeAccess().getIdentifierIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScalarType__IdentifierAssignment_1"


    // $ANTLR start "rule__AnyType__TypeAssignment_0"
    // InternalMAL.g:4667:1: rule__AnyType__TypeAssignment_0 : ( ( 'any' ) ) ;
    public final void rule__AnyType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4671:1: ( ( ( 'any' ) ) )
            // InternalMAL.g:4672:2: ( ( 'any' ) )
            {
            // InternalMAL.g:4672:2: ( ( 'any' ) )
            // InternalMAL.g:4673:3: ( 'any' )
            {
             before(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_0_0()); 
            // InternalMAL.g:4674:3: ( 'any' )
            // InternalMAL.g:4675:4: 'any'
            {
             before(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_0_0()); 

            }

             after(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__TypeAssignment_0"


    // $ANTLR start "rule__AnyType__DigitAssignment_1_1"
    // InternalMAL.g:4686:1: rule__AnyType__DigitAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AnyType__DigitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4690:1: ( ( RULE_ID ) )
            // InternalMAL.g:4691:2: ( RULE_ID )
            {
            // InternalMAL.g:4691:2: ( RULE_ID )
            // InternalMAL.g:4692:3: RULE_ID
            {
             before(grammarAccess.getAnyTypeAccess().getDigitIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnyTypeAccess().getDigitIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyType__DigitAssignment_1_1"


    // $ANTLR start "rule__Stmt__FlowAssignment_0"
    // InternalMAL.g:4701:1: rule__Stmt__FlowAssignment_0 : ( ruleFlow ) ;
    public final void rule__Stmt__FlowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4705:1: ( ( ruleFlow ) )
            // InternalMAL.g:4706:2: ( ruleFlow )
            {
            // InternalMAL.g:4706:2: ( ruleFlow )
            // InternalMAL.g:4707:3: ruleFlow
            {
             before(grammarAccess.getStmtAccess().getFlowFlowParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getStmtAccess().getFlowFlowParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__FlowAssignment_0"


    // $ANTLR start "rule__Stmt__List_of_variablesAssignment_1"
    // InternalMAL.g:4716:1: rule__Stmt__List_of_variablesAssignment_1 : ( ruleVarlist ) ;
    public final void rule__Stmt__List_of_variablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4720:1: ( ( ruleVarlist ) )
            // InternalMAL.g:4721:2: ( ruleVarlist )
            {
            // InternalMAL.g:4721:2: ( ruleVarlist )
            // InternalMAL.g:4722:3: ruleVarlist
            {
             before(grammarAccess.getStmtAccess().getList_of_variablesVarlistParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarlist();

            state._fsp--;

             after(grammarAccess.getStmtAccess().getList_of_variablesVarlistParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__List_of_variablesAssignment_1"


    // $ANTLR start "rule__Stmt__ExpAssignment_2_1"
    // InternalMAL.g:4731:1: rule__Stmt__ExpAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Stmt__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4735:1: ( ( ruleExpr ) )
            // InternalMAL.g:4736:2: ( ruleExpr )
            {
            // InternalMAL.g:4736:2: ( ruleExpr )
            // InternalMAL.g:4737:3: ruleExpr
            {
             before(grammarAccess.getStmtAccess().getExpExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getStmtAccess().getExpExprParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__ExpAssignment_2_1"


    // $ANTLR start "rule__Varlist__VariablesAssignment_0"
    // InternalMAL.g:4746:1: rule__Varlist__VariablesAssignment_0 : ( ruleVariable ) ;
    public final void rule__Varlist__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4750:1: ( ( ruleVariable ) )
            // InternalMAL.g:4751:2: ( ruleVariable )
            {
            // InternalMAL.g:4751:2: ( ruleVariable )
            // InternalMAL.g:4752:3: ruleVariable
            {
             before(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__VariablesAssignment_0"


    // $ANTLR start "rule__Varlist__VariablesAssignment_1_1"
    // InternalMAL.g:4761:1: rule__Varlist__VariablesAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__Varlist__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4765:1: ( ( ruleVariable ) )
            // InternalMAL.g:4766:2: ( ruleVariable )
            {
            // InternalMAL.g:4766:2: ( ruleVariable )
            // InternalMAL.g:4767:3: ruleVariable
            {
             before(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__VariablesAssignment_1_1"


    // $ANTLR start "rule__Varlist__VariablesAssignment_1_2_1"
    // InternalMAL.g:4776:1: rule__Varlist__VariablesAssignment_1_2_1 : ( ruleVariable ) ;
    public final void rule__Varlist__VariablesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4780:1: ( ( ruleVariable ) )
            // InternalMAL.g:4781:2: ( ruleVariable )
            {
            // InternalMAL.g:4781:2: ( ruleVariable )
            // InternalMAL.g:4782:3: ruleVariable
            {
             before(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVarlistAccess().getVariablesVariableParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Varlist__VariablesAssignment_1_2_1"


    // $ANTLR start "rule__Variable__IdentifierAssignment"
    // InternalMAL.g:4791:1: rule__Variable__IdentifierAssignment : ( RULE_ID ) ;
    public final void rule__Variable__IdentifierAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4795:1: ( ( RULE_ID ) )
            // InternalMAL.g:4796:2: ( RULE_ID )
            {
            // InternalMAL.g:4796:2: ( RULE_ID )
            // InternalMAL.g:4797:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getIdentifierIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getIdentifierIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__IdentifierAssignment"


    // $ANTLR start "rule__Expr__Left_factorAssignment_1_0_0"
    // InternalMAL.g:4806:1: rule__Expr__Left_factorAssignment_1_0_0 : ( ruleFactor ) ;
    public final void rule__Expr__Left_factorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4810:1: ( ( ruleFactor ) )
            // InternalMAL.g:4811:2: ( ruleFactor )
            {
            // InternalMAL.g:4811:2: ( ruleFactor )
            // InternalMAL.g:4812:3: ruleFactor
            {
             before(grammarAccess.getExprAccess().getLeft_factorFactorParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExprAccess().getLeft_factorFactorParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Left_factorAssignment_1_0_0"


    // $ANTLR start "rule__Expr__OperatorAssignment_1_0_1"
    // InternalMAL.g:4821:1: rule__Expr__OperatorAssignment_1_0_1 : ( ruleOperator ) ;
    public final void rule__Expr__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4825:1: ( ( ruleOperator ) )
            // InternalMAL.g:4826:2: ( ruleOperator )
            {
            // InternalMAL.g:4826:2: ( ruleOperator )
            // InternalMAL.g:4827:3: ruleOperator
            {
             before(grammarAccess.getExprAccess().getOperatorOperatorParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExprAccess().getOperatorOperatorParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__Expr__Right_factorAssignment_1_1"
    // InternalMAL.g:4836:1: rule__Expr__Right_factorAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Expr__Right_factorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4840:1: ( ( ruleFactor ) )
            // InternalMAL.g:4841:2: ( ruleFactor )
            {
            // InternalMAL.g:4841:2: ( ruleFactor )
            // InternalMAL.g:4842:3: ruleFactor
            {
             before(grammarAccess.getExprAccess().getRight_factorFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExprAccess().getRight_factorFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Right_factorAssignment_1_1"


    // $ANTLR start "rule__Fcncall__ModuleAssignment_0"
    // InternalMAL.g:4851:1: rule__Fcncall__ModuleAssignment_0 : ( ruleModuleName ) ;
    public final void rule__Fcncall__ModuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4855:1: ( ( ruleModuleName ) )
            // InternalMAL.g:4856:2: ( ruleModuleName )
            {
            // InternalMAL.g:4856:2: ( ruleModuleName )
            // InternalMAL.g:4857:3: ruleModuleName
            {
             before(grammarAccess.getFcncallAccess().getModuleModuleNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleName();

            state._fsp--;

             after(grammarAccess.getFcncallAccess().getModuleModuleNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__ModuleAssignment_0"


    // $ANTLR start "rule__Fcncall__Function_nameAssignment_2"
    // InternalMAL.g:4866:1: rule__Fcncall__Function_nameAssignment_2 : ( ruleName ) ;
    public final void rule__Fcncall__Function_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4870:1: ( ( ruleName ) )
            // InternalMAL.g:4871:2: ( ruleName )
            {
            // InternalMAL.g:4871:2: ( ruleName )
            // InternalMAL.g:4872:3: ruleName
            {
             before(grammarAccess.getFcncallAccess().getFunction_nameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFcncallAccess().getFunction_nameNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__Function_nameAssignment_2"


    // $ANTLR start "rule__Fcncall__ArgsAssignment_4"
    // InternalMAL.g:4881:1: rule__Fcncall__ArgsAssignment_4 : ( ruleArgs ) ;
    public final void rule__Fcncall__ArgsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4885:1: ( ( ruleArgs ) )
            // InternalMAL.g:4886:2: ( ruleArgs )
            {
            // InternalMAL.g:4886:2: ( ruleArgs )
            // InternalMAL.g:4887:3: ruleArgs
            {
             before(grammarAccess.getFcncallAccess().getArgsArgsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArgs();

            state._fsp--;

             after(grammarAccess.getFcncallAccess().getArgsArgsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fcncall__ArgsAssignment_4"


    // $ANTLR start "rule__Args__Factor1Assignment_1_1"
    // InternalMAL.g:4896:1: rule__Args__Factor1Assignment_1_1 : ( ruleFactor ) ;
    public final void rule__Args__Factor1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4900:1: ( ( ruleFactor ) )
            // InternalMAL.g:4901:2: ( ruleFactor )
            {
            // InternalMAL.g:4901:2: ( ruleFactor )
            // InternalMAL.g:4902:3: ruleFactor
            {
             before(grammarAccess.getArgsAccess().getFactor1FactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getArgsAccess().getFactor1FactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Args__Factor1Assignment_1_1"


    // $ANTLR start "rule__ModuleName__IdentifierAssignment"
    // InternalMAL.g:4911:1: rule__ModuleName__IdentifierAssignment : ( RULE_ID ) ;
    public final void rule__ModuleName__IdentifierAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4915:1: ( ( RULE_ID ) )
            // InternalMAL.g:4916:2: ( RULE_ID )
            {
            // InternalMAL.g:4916:2: ( RULE_ID )
            // InternalMAL.g:4917:3: RULE_ID
            {
             before(grammarAccess.getModuleNameAccess().getIdentifierIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleNameAccess().getIdentifierIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleName__IdentifierAssignment"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\10\2\uffff\1\11\6\uffff";
    static final String dfa_3s = "\1\4\1\5\2\uffff\1\12\6\uffff";
    static final String dfa_4s = "\1\11\1\52\2\uffff\1\52\6\uffff";
    static final String dfa_5s = "\2\uffff\1\3\1\4\1\uffff\1\6\1\10\1\2\1\1\1\5\1\7";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\1\1\2\1\3\1\4\1\5",
            "\1\7\4\uffff\1\10\4\uffff\17\10\1\uffff\2\10\1\uffff\4\10\1\uffff\2\10\1\uffff\1\10",
            "",
            "",
            "\1\11\4\uffff\17\11\1\uffff\2\11\1\uffff\4\11\1\uffff\2\11\1\12\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1147:1: rule__Literal_constant__Alternatives : ( ( RULE_BIT ) | ( ruleBte ) | ( RULE_CHR ) | ( RULE_WRD ) | ( RULE_INT ) | ( RULE_OID ) | ( ruleFLT ) | ( ruleSTR ) );";
        }
    }
    static final String dfa_8s = "\24\uffff";
    static final String dfa_9s = "\1\uffff\10\13\5\uffff\1\13\4\uffff\1\13";
    static final String dfa_10s = "\1\4\1\5\7\12\1\5\2\uffff\1\10\1\5\1\12\4\5\1\12";
    static final String dfa_11s = "\1\60\3\47\1\51\4\47\1\5\2\uffff\1\10\1\5\1\47\4\5\1\47";
    static final String dfa_12s = "\12\uffff\1\1\1\2\10\uffff";
    static final String dfa_13s = "\24\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\1\1\1\2\1\3\1\4\1\5\1\10\45\uffff\1\7",
            "\1\11\4\uffff\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13\1\uffff\1\14",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\13\4\uffff\10\13\4\12\3\13\1\uffff\2\13\1\uffff\4\13\1\uffff\1\13"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3464:2: ( rule__Expr__Group_1_0__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000ADB07F8402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800018000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000BDB07F8400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000ADB07F8400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00010000000007F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00010100000007F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000100L});

}