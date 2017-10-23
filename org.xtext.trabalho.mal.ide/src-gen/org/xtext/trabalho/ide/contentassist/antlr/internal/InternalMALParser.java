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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BIT", "RULE_CHR", "RULE_WRD", "RULE_INT", "RULE_OID", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODULE'", "'module'", "'ATOM'", "'atom'", "'INCLUDE'", "'include'", "'UNSAFE'", "'unsafe'", "'COMMAND'", "'command'", "'ADDRESS'", "'address'", "'PATTERN'", "'pattern'", "'INLINE'", "'inline'", "'FUNCTION'", "'function'", "'END'", "'end'", "'FACTORY'", "'factory'", "'COMMENT'", "'comment'", "'BAT'", "'bat'", "'RETURN'", "'return'", "'BARRIER'", "'barrier'", "'CATCH'", "'catch'", "'LEAVE'", "'leave'", "'REDO'", "'redo'", "'RAISE'", "'raise'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'!'", "'NIL'", "'nil'", "';'", "':'", "'('", "')'", "'.'", "','", "'['", "']'", "'_'", "':='", "'any'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_BIT=5;
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
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_WRD=7;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int RULE_OID=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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

                if ( (LA1_0==RULE_WRD||(LA1_0>=15 && LA1_0<=24)||(LA1_0>=27 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=41 && LA1_0<=52)||LA1_0==70) ) {
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
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt2=1;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 35:
            case 36:
                {
                alt2=2;
                }
                break;
            case 19:
            case 20:
                {
                alt2=3;
                }
                break;
            case RULE_WRD:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 70:
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

            if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=17 && LA3_0<=18)) ) {
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


    // $ANTLR start "rule__ModuleStmt__Alternatives_0_0"
    // InternalMAL.g:856:1: rule__ModuleStmt__Alternatives_0_0 : ( ( 'MODULE' ) | ( 'module' ) );
    public final void rule__ModuleStmt__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:860:1: ( ( 'MODULE' ) | ( 'module' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMAL.g:861:2: ( 'MODULE' )
                    {
                    // InternalMAL.g:861:2: ( 'MODULE' )
                    // InternalMAL.g:862:3: 'MODULE'
                    {
                     before(grammarAccess.getModuleStmtAccess().getMODULEKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getModuleStmtAccess().getMODULEKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:867:2: ( 'module' )
                    {
                    // InternalMAL.g:867:2: ( 'module' )
                    // InternalMAL.g:868:3: 'module'
                    {
                     before(grammarAccess.getModuleStmtAccess().getModuleKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getModuleStmtAccess().getModuleKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ModuleStmt__Alternatives_0_0"


    // $ANTLR start "rule__ModuleStmt__Alternatives_1_0"
    // InternalMAL.g:877:1: rule__ModuleStmt__Alternatives_1_0 : ( ( 'ATOM' ) | ( 'atom' ) );
    public final void rule__ModuleStmt__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:881:1: ( ( 'ATOM' ) | ( 'atom' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMAL.g:882:2: ( 'ATOM' )
                    {
                    // InternalMAL.g:882:2: ( 'ATOM' )
                    // InternalMAL.g:883:3: 'ATOM'
                    {
                     before(grammarAccess.getModuleStmtAccess().getATOMKeyword_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getModuleStmtAccess().getATOMKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:888:2: ( 'atom' )
                    {
                    // InternalMAL.g:888:2: ( 'atom' )
                    // InternalMAL.g:889:3: 'atom'
                    {
                     before(grammarAccess.getModuleStmtAccess().getAtomKeyword_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getModuleStmtAccess().getAtomKeyword_1_0_1()); 

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
    // $ANTLR end "rule__ModuleStmt__Alternatives_1_0"


    // $ANTLR start "rule__IncludeStmt__Alternatives"
    // InternalMAL.g:898:1: rule__IncludeStmt__Alternatives : ( ( ( rule__IncludeStmt__Group_0__0 ) ) | ( ( rule__IncludeStmt__Group_1__0 ) ) );
    public final void rule__IncludeStmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:902:1: ( ( ( rule__IncludeStmt__Group_0__0 ) ) | ( ( rule__IncludeStmt__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_STRING) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_WRD) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==20) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_STRING) ) {
                    alt6=2;
                }
                else if ( (LA6_2==RULE_WRD) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMAL.g:903:2: ( ( rule__IncludeStmt__Group_0__0 ) )
                    {
                    // InternalMAL.g:903:2: ( ( rule__IncludeStmt__Group_0__0 ) )
                    // InternalMAL.g:904:3: ( rule__IncludeStmt__Group_0__0 )
                    {
                     before(grammarAccess.getIncludeStmtAccess().getGroup_0()); 
                    // InternalMAL.g:905:3: ( rule__IncludeStmt__Group_0__0 )
                    // InternalMAL.g:905:4: rule__IncludeStmt__Group_0__0
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
                    // InternalMAL.g:909:2: ( ( rule__IncludeStmt__Group_1__0 ) )
                    {
                    // InternalMAL.g:909:2: ( ( rule__IncludeStmt__Group_1__0 ) )
                    // InternalMAL.g:910:3: ( rule__IncludeStmt__Group_1__0 )
                    {
                     before(grammarAccess.getIncludeStmtAccess().getGroup_1()); 
                    // InternalMAL.g:911:3: ( rule__IncludeStmt__Group_1__0 )
                    // InternalMAL.g:911:4: rule__IncludeStmt__Group_1__0
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


    // $ANTLR start "rule__IncludeStmt__Alternatives_0_0"
    // InternalMAL.g:919:1: rule__IncludeStmt__Alternatives_0_0 : ( ( 'INCLUDE' ) | ( 'include' ) );
    public final void rule__IncludeStmt__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:923:1: ( ( 'INCLUDE' ) | ( 'include' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMAL.g:924:2: ( 'INCLUDE' )
                    {
                    // InternalMAL.g:924:2: ( 'INCLUDE' )
                    // InternalMAL.g:925:3: 'INCLUDE'
                    {
                     before(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_0_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:930:2: ( 'include' )
                    {
                    // InternalMAL.g:930:2: ( 'include' )
                    // InternalMAL.g:931:3: 'include'
                    {
                     before(grammarAccess.getIncludeStmtAccess().getIncludeKeyword_0_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getIncludeStmtAccess().getIncludeKeyword_0_0_1()); 

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
    // $ANTLR end "rule__IncludeStmt__Alternatives_0_0"


    // $ANTLR start "rule__IncludeStmt__Alternatives_1_0"
    // InternalMAL.g:940:1: rule__IncludeStmt__Alternatives_1_0 : ( ( 'INCLUDE' ) | ( 'include' ) );
    public final void rule__IncludeStmt__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:944:1: ( ( 'INCLUDE' ) | ( 'include' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMAL.g:945:2: ( 'INCLUDE' )
                    {
                    // InternalMAL.g:945:2: ( 'INCLUDE' )
                    // InternalMAL.g:946:3: 'INCLUDE'
                    {
                     before(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getIncludeStmtAccess().getINCLUDEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:951:2: ( 'include' )
                    {
                    // InternalMAL.g:951:2: ( 'include' )
                    // InternalMAL.g:952:3: 'include'
                    {
                     before(grammarAccess.getIncludeStmtAccess().getIncludeKeyword_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getIncludeStmtAccess().getIncludeKeyword_1_0_1()); 

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
    // $ANTLR end "rule__IncludeStmt__Alternatives_1_0"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalMAL.g:961:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:965:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) | ( ( rule__Definition__Group_2__0 ) ) | ( ( rule__Definition__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                switch ( input.LA(2) ) {
                case 23:
                case 24:
                    {
                    alt9=1;
                    }
                    break;
                case 31:
                case 32:
                    {
                    alt9=3;
                    }
                    break;
                case 27:
                case 28:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                switch ( input.LA(2) ) {
                case 27:
                case 28:
                    {
                    alt9=2;
                    }
                    break;
                case 23:
                case 24:
                    {
                    alt9=1;
                    }
                    break;
                case 31:
                case 32:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }

                }
                break;
            case 23:
            case 24:
                {
                alt9=1;
                }
                break;
            case 27:
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt9=3;
                }
                break;
            case 35:
            case 36:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMAL.g:966:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalMAL.g:966:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalMAL.g:967:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalMAL.g:968:3: ( rule__Definition__Group_0__0 )
                    // InternalMAL.g:968:4: rule__Definition__Group_0__0
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
                    // InternalMAL.g:972:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalMAL.g:972:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalMAL.g:973:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalMAL.g:974:3: ( rule__Definition__Group_1__0 )
                    // InternalMAL.g:974:4: rule__Definition__Group_1__0
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
                    // InternalMAL.g:978:2: ( ( rule__Definition__Group_2__0 ) )
                    {
                    // InternalMAL.g:978:2: ( ( rule__Definition__Group_2__0 ) )
                    // InternalMAL.g:979:3: ( rule__Definition__Group_2__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_2()); 
                    // InternalMAL.g:980:3: ( rule__Definition__Group_2__0 )
                    // InternalMAL.g:980:4: rule__Definition__Group_2__0
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
                    // InternalMAL.g:984:2: ( ( rule__Definition__Group_3__0 ) )
                    {
                    // InternalMAL.g:984:2: ( ( rule__Definition__Group_3__0 ) )
                    // InternalMAL.g:985:3: ( rule__Definition__Group_3__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_3()); 
                    // InternalMAL.g:986:3: ( rule__Definition__Group_3__0 )
                    // InternalMAL.g:986:4: rule__Definition__Group_3__0
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


    // $ANTLR start "rule__Definition__Alternatives_0_0"
    // InternalMAL.g:994:1: rule__Definition__Alternatives_0_0 : ( ( 'UNSAFE' ) | ( 'unsafe' ) );
    public final void rule__Definition__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:998:1: ( ( 'UNSAFE' ) | ( 'unsafe' ) )
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
                    // InternalMAL.g:999:2: ( 'UNSAFE' )
                    {
                    // InternalMAL.g:999:2: ( 'UNSAFE' )
                    // InternalMAL.g:1000:3: 'UNSAFE'
                    {
                     before(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1005:2: ( 'unsafe' )
                    {
                    // InternalMAL.g:1005:2: ( 'unsafe' )
                    // InternalMAL.g:1006:3: 'unsafe'
                    {
                     before(grammarAccess.getDefinitionAccess().getUnsafeKeyword_0_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getUnsafeKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_0_0"


    // $ANTLR start "rule__Definition__Alternatives_0_1"
    // InternalMAL.g:1015:1: rule__Definition__Alternatives_0_1 : ( ( 'COMMAND' ) | ( 'command' ) );
    public final void rule__Definition__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1019:1: ( ( 'COMMAND' ) | ( 'command' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMAL.g:1020:2: ( 'COMMAND' )
                    {
                    // InternalMAL.g:1020:2: ( 'COMMAND' )
                    // InternalMAL.g:1021:3: 'COMMAND'
                    {
                     before(grammarAccess.getDefinitionAccess().getCOMMANDKeyword_0_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getCOMMANDKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1026:2: ( 'command' )
                    {
                    // InternalMAL.g:1026:2: ( 'command' )
                    // InternalMAL.g:1027:3: 'command'
                    {
                     before(grammarAccess.getDefinitionAccess().getCommandKeyword_0_1_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getCommandKeyword_0_1_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_0_1"


    // $ANTLR start "rule__Definition__Alternatives_0_3"
    // InternalMAL.g:1036:1: rule__Definition__Alternatives_0_3 : ( ( 'ADDRESS' ) | ( 'address' ) );
    public final void rule__Definition__Alternatives_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1040:1: ( ( 'ADDRESS' ) | ( 'address' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMAL.g:1041:2: ( 'ADDRESS' )
                    {
                    // InternalMAL.g:1041:2: ( 'ADDRESS' )
                    // InternalMAL.g:1042:3: 'ADDRESS'
                    {
                     before(grammarAccess.getDefinitionAccess().getADDRESSKeyword_0_3_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getADDRESSKeyword_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1047:2: ( 'address' )
                    {
                    // InternalMAL.g:1047:2: ( 'address' )
                    // InternalMAL.g:1048:3: 'address'
                    {
                     before(grammarAccess.getDefinitionAccess().getAddressKeyword_0_3_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getAddressKeyword_0_3_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_0_3"


    // $ANTLR start "rule__Definition__Alternatives_1_0"
    // InternalMAL.g:1057:1: rule__Definition__Alternatives_1_0 : ( ( 'UNSAFE' ) | ( 'unsafe' ) );
    public final void rule__Definition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1061:1: ( ( 'UNSAFE' ) | ( 'unsafe' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMAL.g:1062:2: ( 'UNSAFE' )
                    {
                    // InternalMAL.g:1062:2: ( 'UNSAFE' )
                    // InternalMAL.g:1063:3: 'UNSAFE'
                    {
                     before(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_1_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1068:2: ( 'unsafe' )
                    {
                    // InternalMAL.g:1068:2: ( 'unsafe' )
                    // InternalMAL.g:1069:3: 'unsafe'
                    {
                     before(grammarAccess.getDefinitionAccess().getUnsafeKeyword_1_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getUnsafeKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_1_0"


    // $ANTLR start "rule__Definition__Alternatives_1_1"
    // InternalMAL.g:1078:1: rule__Definition__Alternatives_1_1 : ( ( 'PATTERN' ) | ( 'pattern' ) );
    public final void rule__Definition__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1082:1: ( ( 'PATTERN' ) | ( 'pattern' ) )
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
                    // InternalMAL.g:1083:2: ( 'PATTERN' )
                    {
                    // InternalMAL.g:1083:2: ( 'PATTERN' )
                    // InternalMAL.g:1084:3: 'PATTERN'
                    {
                     before(grammarAccess.getDefinitionAccess().getPATTERNKeyword_1_1_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getPATTERNKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1089:2: ( 'pattern' )
                    {
                    // InternalMAL.g:1089:2: ( 'pattern' )
                    // InternalMAL.g:1090:3: 'pattern'
                    {
                     before(grammarAccess.getDefinitionAccess().getPatternKeyword_1_1_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getPatternKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_1_1"


    // $ANTLR start "rule__Definition__Alternatives_1_3"
    // InternalMAL.g:1099:1: rule__Definition__Alternatives_1_3 : ( ( 'ADDRESS' ) | ( 'address' ) );
    public final void rule__Definition__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1103:1: ( ( 'ADDRESS' ) | ( 'address' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMAL.g:1104:2: ( 'ADDRESS' )
                    {
                    // InternalMAL.g:1104:2: ( 'ADDRESS' )
                    // InternalMAL.g:1105:3: 'ADDRESS'
                    {
                     before(grammarAccess.getDefinitionAccess().getADDRESSKeyword_1_3_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getADDRESSKeyword_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1110:2: ( 'address' )
                    {
                    // InternalMAL.g:1110:2: ( 'address' )
                    // InternalMAL.g:1111:3: 'address'
                    {
                     before(grammarAccess.getDefinitionAccess().getAddressKeyword_1_3_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getAddressKeyword_1_3_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_1_3"


    // $ANTLR start "rule__Definition__Alternatives_2_0"
    // InternalMAL.g:1120:1: rule__Definition__Alternatives_2_0 : ( ( ( rule__Definition__Alternatives_2_0_0 ) ) | ( ( rule__Definition__Alternatives_2_0_1 ) ) );
    public final void rule__Definition__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1124:1: ( ( ( rule__Definition__Alternatives_2_0_0 ) ) | ( ( rule__Definition__Alternatives_2_0_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=29 && LA16_0<=30)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=21 && LA16_0<=22)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMAL.g:1125:2: ( ( rule__Definition__Alternatives_2_0_0 ) )
                    {
                    // InternalMAL.g:1125:2: ( ( rule__Definition__Alternatives_2_0_0 ) )
                    // InternalMAL.g:1126:3: ( rule__Definition__Alternatives_2_0_0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getAlternatives_2_0_0()); 
                    // InternalMAL.g:1127:3: ( rule__Definition__Alternatives_2_0_0 )
                    // InternalMAL.g:1127:4: rule__Definition__Alternatives_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Alternatives_2_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getAlternatives_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1131:2: ( ( rule__Definition__Alternatives_2_0_1 ) )
                    {
                    // InternalMAL.g:1131:2: ( ( rule__Definition__Alternatives_2_0_1 ) )
                    // InternalMAL.g:1132:3: ( rule__Definition__Alternatives_2_0_1 )
                    {
                     before(grammarAccess.getDefinitionAccess().getAlternatives_2_0_1()); 
                    // InternalMAL.g:1133:3: ( rule__Definition__Alternatives_2_0_1 )
                    // InternalMAL.g:1133:4: rule__Definition__Alternatives_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Alternatives_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getAlternatives_2_0_1()); 

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


    // $ANTLR start "rule__Definition__Alternatives_2_0_0"
    // InternalMAL.g:1141:1: rule__Definition__Alternatives_2_0_0 : ( ( 'INLINE' ) | ( 'inline' ) );
    public final void rule__Definition__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1145:1: ( ( 'INLINE' ) | ( 'inline' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMAL.g:1146:2: ( 'INLINE' )
                    {
                    // InternalMAL.g:1146:2: ( 'INLINE' )
                    // InternalMAL.g:1147:3: 'INLINE'
                    {
                     before(grammarAccess.getDefinitionAccess().getINLINEKeyword_2_0_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getINLINEKeyword_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1152:2: ( 'inline' )
                    {
                    // InternalMAL.g:1152:2: ( 'inline' )
                    // InternalMAL.g:1153:3: 'inline'
                    {
                     before(grammarAccess.getDefinitionAccess().getInlineKeyword_2_0_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getInlineKeyword_2_0_0_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_2_0_0"


    // $ANTLR start "rule__Definition__Alternatives_2_0_1"
    // InternalMAL.g:1162:1: rule__Definition__Alternatives_2_0_1 : ( ( 'UNSAFE' ) | ( 'unsafe' ) );
    public final void rule__Definition__Alternatives_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1166:1: ( ( 'UNSAFE' ) | ( 'unsafe' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==22) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMAL.g:1167:2: ( 'UNSAFE' )
                    {
                    // InternalMAL.g:1167:2: ( 'UNSAFE' )
                    // InternalMAL.g:1168:3: 'UNSAFE'
                    {
                     before(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_2_0_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getUNSAFEKeyword_2_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1173:2: ( 'unsafe' )
                    {
                    // InternalMAL.g:1173:2: ( 'unsafe' )
                    // InternalMAL.g:1174:3: 'unsafe'
                    {
                     before(grammarAccess.getDefinitionAccess().getUnsafeKeyword_2_0_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getUnsafeKeyword_2_0_1_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_2_0_1"


    // $ANTLR start "rule__Definition__Alternatives_2_1"
    // InternalMAL.g:1183:1: rule__Definition__Alternatives_2_1 : ( ( 'FUNCTION' ) | ( 'function' ) );
    public final void rule__Definition__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1187:1: ( ( 'FUNCTION' ) | ( 'function' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMAL.g:1188:2: ( 'FUNCTION' )
                    {
                    // InternalMAL.g:1188:2: ( 'FUNCTION' )
                    // InternalMAL.g:1189:3: 'FUNCTION'
                    {
                     before(grammarAccess.getDefinitionAccess().getFUNCTIONKeyword_2_1_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getFUNCTIONKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1194:2: ( 'function' )
                    {
                    // InternalMAL.g:1194:2: ( 'function' )
                    // InternalMAL.g:1195:3: 'function'
                    {
                     before(grammarAccess.getDefinitionAccess().getFunctionKeyword_2_1_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getFunctionKeyword_2_1_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_2_1"


    // $ANTLR start "rule__Definition__Alternatives_2_4"
    // InternalMAL.g:1204:1: rule__Definition__Alternatives_2_4 : ( ( 'END' ) | ( 'end' ) );
    public final void rule__Definition__Alternatives_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1208:1: ( ( 'END' ) | ( 'end' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            else if ( (LA20_0==34) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMAL.g:1209:2: ( 'END' )
                    {
                    // InternalMAL.g:1209:2: ( 'END' )
                    // InternalMAL.g:1210:3: 'END'
                    {
                     before(grammarAccess.getDefinitionAccess().getENDKeyword_2_4_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getENDKeyword_2_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1215:2: ( 'end' )
                    {
                    // InternalMAL.g:1215:2: ( 'end' )
                    // InternalMAL.g:1216:3: 'end'
                    {
                     before(grammarAccess.getDefinitionAccess().getEndKeyword_2_4_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getEndKeyword_2_4_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_2_4"


    // $ANTLR start "rule__Definition__Alternatives_3_0"
    // InternalMAL.g:1225:1: rule__Definition__Alternatives_3_0 : ( ( 'FACTORY' ) | ( 'factory' ) );
    public final void rule__Definition__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1229:1: ( ( 'FACTORY' ) | ( 'factory' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            else if ( (LA21_0==36) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMAL.g:1230:2: ( 'FACTORY' )
                    {
                    // InternalMAL.g:1230:2: ( 'FACTORY' )
                    // InternalMAL.g:1231:3: 'FACTORY'
                    {
                     before(grammarAccess.getDefinitionAccess().getFACTORYKeyword_3_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getFACTORYKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1236:2: ( 'factory' )
                    {
                    // InternalMAL.g:1236:2: ( 'factory' )
                    // InternalMAL.g:1237:3: 'factory'
                    {
                     before(grammarAccess.getDefinitionAccess().getFactoryKeyword_3_0_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getFactoryKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_3_0"


    // $ANTLR start "rule__Definition__Alternatives_3_3"
    // InternalMAL.g:1246:1: rule__Definition__Alternatives_3_3 : ( ( 'END' ) | ( 'end' ) );
    public final void rule__Definition__Alternatives_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1250:1: ( ( 'END' ) | ( 'end' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( (LA22_0==34) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMAL.g:1251:2: ( 'END' )
                    {
                    // InternalMAL.g:1251:2: ( 'END' )
                    // InternalMAL.g:1252:3: 'END'
                    {
                     before(grammarAccess.getDefinitionAccess().getENDKeyword_3_3_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getENDKeyword_3_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1257:2: ( 'end' )
                    {
                    // InternalMAL.g:1257:2: ( 'end' )
                    // InternalMAL.g:1258:3: 'end'
                    {
                     before(grammarAccess.getDefinitionAccess().getEndKeyword_3_3_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getDefinitionAccess().getEndKeyword_3_3_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives_3_3"


    // $ANTLR start "rule__Helpinfo__Alternatives_0"
    // InternalMAL.g:1267:1: rule__Helpinfo__Alternatives_0 : ( ( 'COMMENT' ) | ( 'comment' ) );
    public final void rule__Helpinfo__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1271:1: ( ( 'COMMENT' ) | ( 'comment' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMAL.g:1272:2: ( 'COMMENT' )
                    {
                    // InternalMAL.g:1272:2: ( 'COMMENT' )
                    // InternalMAL.g:1273:3: 'COMMENT'
                    {
                     before(grammarAccess.getHelpinfoAccess().getCOMMENTKeyword_0_0()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getHelpinfoAccess().getCOMMENTKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1278:2: ( 'comment' )
                    {
                    // InternalMAL.g:1278:2: ( 'comment' )
                    // InternalMAL.g:1279:3: 'comment'
                    {
                     before(grammarAccess.getHelpinfoAccess().getCommentKeyword_0_1()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getHelpinfoAccess().getCommentKeyword_0_1()); 

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
    // $ANTLR end "rule__Helpinfo__Alternatives_0"


    // $ANTLR start "rule__Result__Alternatives"
    // InternalMAL.g:1288:1: rule__Result__Alternatives : ( ( ruleTypeName ) | ( ( rule__Result__Group_1__0 ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1292:1: ( ( ruleTypeName ) | ( ( rule__Result__Group_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==69) ) {
                alt24=1;
            }
            else if ( (LA24_0==70) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMAL.g:1293:2: ( ruleTypeName )
                    {
                    // InternalMAL.g:1293:2: ( ruleTypeName )
                    // InternalMAL.g:1294:3: ruleTypeName
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
                    // InternalMAL.g:1299:2: ( ( rule__Result__Group_1__0 ) )
                    {
                    // InternalMAL.g:1299:2: ( ( rule__Result__Group_1__0 ) )
                    // InternalMAL.g:1300:3: ( rule__Result__Group_1__0 )
                    {
                     before(grammarAccess.getResultAccess().getGroup_1()); 
                    // InternalMAL.g:1301:3: ( rule__Result__Group_1__0 )
                    // InternalMAL.g:1301:4: rule__Result__Group_1__0
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
    // InternalMAL.g:1309:1: rule__TypeName__Alternatives : ( ( ruleScalarType ) | ( ruleColumnType ) | ( ruleAnyType ) );
    public final void rule__TypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1313:1: ( ( ruleScalarType ) | ( ruleColumnType ) | ( ruleAnyType ) )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==69) ) {
                switch ( input.LA(2) ) {
                case 78:
                    {
                    alt25=3;
                    }
                    break;
                case 39:
                case 40:
                    {
                    alt25=2;
                    }
                    break;
                case RULE_WRD:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMAL.g:1314:2: ( ruleScalarType )
                    {
                    // InternalMAL.g:1314:2: ( ruleScalarType )
                    // InternalMAL.g:1315:3: ruleScalarType
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
                    // InternalMAL.g:1320:2: ( ruleColumnType )
                    {
                    // InternalMAL.g:1320:2: ( ruleColumnType )
                    // InternalMAL.g:1321:3: ruleColumnType
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
                    // InternalMAL.g:1326:2: ( ruleAnyType )
                    {
                    // InternalMAL.g:1326:2: ( ruleAnyType )
                    // InternalMAL.g:1327:3: ruleAnyType
                    {
                     before(grammarAccess.getTypeNameAccess().getAnyTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAnyType();

                    state._fsp--;

                     after(grammarAccess.getTypeNameAccess().getAnyTypeParserRuleCall_2()); 

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


    // $ANTLR start "rule__ColumnType__Alternatives_1"
    // InternalMAL.g:1336:1: rule__ColumnType__Alternatives_1 : ( ( 'BAT' ) | ( 'bat' ) );
    public final void rule__ColumnType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1340:1: ( ( 'BAT' ) | ( 'bat' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMAL.g:1341:2: ( 'BAT' )
                    {
                    // InternalMAL.g:1341:2: ( 'BAT' )
                    // InternalMAL.g:1342:3: 'BAT'
                    {
                     before(grammarAccess.getColumnTypeAccess().getBATKeyword_1_0()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getColumnTypeAccess().getBATKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1347:2: ( 'bat' )
                    {
                    // InternalMAL.g:1347:2: ( 'bat' )
                    // InternalMAL.g:1348:3: 'bat'
                    {
                     before(grammarAccess.getColumnTypeAccess().getBatKeyword_1_1()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getColumnTypeAccess().getBatKeyword_1_1()); 

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
    // $ANTLR end "rule__ColumnType__Alternatives_1"


    // $ANTLR start "rule__ColElmType__Alternatives"
    // InternalMAL.g:1357:1: rule__ColElmType__Alternatives : ( ( ruleScalarType ) | ( ruleAnyType ) );
    public final void rule__ColElmType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1361:1: ( ( ruleScalarType ) | ( ruleAnyType ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==69) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==78) ) {
                    alt27=2;
                }
                else if ( (LA27_1==RULE_WRD) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMAL.g:1362:2: ( ruleScalarType )
                    {
                    // InternalMAL.g:1362:2: ( ruleScalarType )
                    // InternalMAL.g:1363:3: ruleScalarType
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
                    // InternalMAL.g:1368:2: ( ruleAnyType )
                    {
                    // InternalMAL.g:1368:2: ( ruleAnyType )
                    // InternalMAL.g:1369:3: ruleAnyType
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
    // InternalMAL.g:1378:1: rule__Flow__Alternatives : ( ( ( rule__Flow__Alternatives_0 ) ) | ( ( rule__Flow__Alternatives_1 ) ) | ( ( rule__Flow__Alternatives_2 ) ) | ( ( rule__Flow__Alternatives_3 ) ) | ( ( rule__Flow__Alternatives_4 ) ) | ( ( rule__Flow__Alternatives_5 ) ) );
    public final void rule__Flow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1382:1: ( ( ( rule__Flow__Alternatives_0 ) ) | ( ( rule__Flow__Alternatives_1 ) ) | ( ( rule__Flow__Alternatives_2 ) ) | ( ( rule__Flow__Alternatives_3 ) ) | ( ( rule__Flow__Alternatives_4 ) ) | ( ( rule__Flow__Alternatives_5 ) ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 41:
            case 42:
                {
                alt28=1;
                }
                break;
            case 43:
            case 44:
                {
                alt28=2;
                }
                break;
            case 45:
            case 46:
                {
                alt28=3;
                }
                break;
            case 47:
            case 48:
                {
                alt28=4;
                }
                break;
            case 49:
            case 50:
                {
                alt28=5;
                }
                break;
            case 51:
            case 52:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMAL.g:1383:2: ( ( rule__Flow__Alternatives_0 ) )
                    {
                    // InternalMAL.g:1383:2: ( ( rule__Flow__Alternatives_0 ) )
                    // InternalMAL.g:1384:3: ( rule__Flow__Alternatives_0 )
                    {
                     before(grammarAccess.getFlowAccess().getAlternatives_0()); 
                    // InternalMAL.g:1385:3: ( rule__Flow__Alternatives_0 )
                    // InternalMAL.g:1385:4: rule__Flow__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Flow__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFlowAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1389:2: ( ( rule__Flow__Alternatives_1 ) )
                    {
                    // InternalMAL.g:1389:2: ( ( rule__Flow__Alternatives_1 ) )
                    // InternalMAL.g:1390:3: ( rule__Flow__Alternatives_1 )
                    {
                     before(grammarAccess.getFlowAccess().getAlternatives_1()); 
                    // InternalMAL.g:1391:3: ( rule__Flow__Alternatives_1 )
                    // InternalMAL.g:1391:4: rule__Flow__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Flow__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFlowAccess().getAlternatives_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1395:2: ( ( rule__Flow__Alternatives_2 ) )
                    {
                    // InternalMAL.g:1395:2: ( ( rule__Flow__Alternatives_2 ) )
                    // InternalMAL.g:1396:3: ( rule__Flow__Alternatives_2 )
                    {
                     before(grammarAccess.getFlowAccess().getAlternatives_2()); 
                    // InternalMAL.g:1397:3: ( rule__Flow__Alternatives_2 )
                    // InternalMAL.g:1397:4: rule__Flow__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Flow__Alternatives_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFlowAccess().getAlternatives_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:1401:2: ( ( rule__Flow__Alternatives_3 ) )
                    {
                    // InternalMAL.g:1401:2: ( ( rule__Flow__Alternatives_3 ) )
                    // InternalMAL.g:1402:3: ( rule__Flow__Alternatives_3 )
                    {
                     before(grammarAccess.getFlowAccess().getAlternatives_3()); 
                    // InternalMAL.g:1403:3: ( rule__Flow__Alternatives_3 )
                    // InternalMAL.g:1403:4: rule__Flow__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Flow__Alternatives_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFlowAccess().getAlternatives_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMAL.g:1407:2: ( ( rule__Flow__Alternatives_4 ) )
                    {
                    // InternalMAL.g:1407:2: ( ( rule__Flow__Alternatives_4 ) )
                    // InternalMAL.g:1408:3: ( rule__Flow__Alternatives_4 )
                    {
                     before(grammarAccess.getFlowAccess().getAlternatives_4()); 
                    // InternalMAL.g:1409:3: ( rule__Flow__Alternatives_4 )
                    // InternalMAL.g:1409:4: rule__Flow__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Flow__Alternatives_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFlowAccess().getAlternatives_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMAL.g:1413:2: ( ( rule__Flow__Alternatives_5 ) )
                    {
                    // InternalMAL.g:1413:2: ( ( rule__Flow__Alternatives_5 ) )
                    // InternalMAL.g:1414:3: ( rule__Flow__Alternatives_5 )
                    {
                     before(grammarAccess.getFlowAccess().getAlternatives_5()); 
                    // InternalMAL.g:1415:3: ( rule__Flow__Alternatives_5 )
                    // InternalMAL.g:1415:4: rule__Flow__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Flow__Alternatives_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFlowAccess().getAlternatives_5()); 

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


    // $ANTLR start "rule__Flow__Alternatives_0"
    // InternalMAL.g:1423:1: rule__Flow__Alternatives_0 : ( ( 'RETURN' ) | ( 'return' ) );
    public final void rule__Flow__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1427:1: ( ( 'RETURN' ) | ( 'return' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            else if ( (LA29_0==42) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMAL.g:1428:2: ( 'RETURN' )
                    {
                    // InternalMAL.g:1428:2: ( 'RETURN' )
                    // InternalMAL.g:1429:3: 'RETURN'
                    {
                     before(grammarAccess.getFlowAccess().getRETURNKeyword_0_0()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getRETURNKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1434:2: ( 'return' )
                    {
                    // InternalMAL.g:1434:2: ( 'return' )
                    // InternalMAL.g:1435:3: 'return'
                    {
                     before(grammarAccess.getFlowAccess().getReturnKeyword_0_1()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getReturnKeyword_0_1()); 

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
    // $ANTLR end "rule__Flow__Alternatives_0"


    // $ANTLR start "rule__Flow__Alternatives_1"
    // InternalMAL.g:1444:1: rule__Flow__Alternatives_1 : ( ( 'BARRIER' ) | ( 'barrier' ) );
    public final void rule__Flow__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1448:1: ( ( 'BARRIER' ) | ( 'barrier' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            else if ( (LA30_0==44) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMAL.g:1449:2: ( 'BARRIER' )
                    {
                    // InternalMAL.g:1449:2: ( 'BARRIER' )
                    // InternalMAL.g:1450:3: 'BARRIER'
                    {
                     before(grammarAccess.getFlowAccess().getBARRIERKeyword_1_0()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getBARRIERKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1455:2: ( 'barrier' )
                    {
                    // InternalMAL.g:1455:2: ( 'barrier' )
                    // InternalMAL.g:1456:3: 'barrier'
                    {
                     before(grammarAccess.getFlowAccess().getBarrierKeyword_1_1()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getBarrierKeyword_1_1()); 

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
    // $ANTLR end "rule__Flow__Alternatives_1"


    // $ANTLR start "rule__Flow__Alternatives_2"
    // InternalMAL.g:1465:1: rule__Flow__Alternatives_2 : ( ( 'CATCH' ) | ( 'catch' ) );
    public final void rule__Flow__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1469:1: ( ( 'CATCH' ) | ( 'catch' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            else if ( (LA31_0==46) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMAL.g:1470:2: ( 'CATCH' )
                    {
                    // InternalMAL.g:1470:2: ( 'CATCH' )
                    // InternalMAL.g:1471:3: 'CATCH'
                    {
                     before(grammarAccess.getFlowAccess().getCATCHKeyword_2_0()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getCATCHKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1476:2: ( 'catch' )
                    {
                    // InternalMAL.g:1476:2: ( 'catch' )
                    // InternalMAL.g:1477:3: 'catch'
                    {
                     before(grammarAccess.getFlowAccess().getCatchKeyword_2_1()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getCatchKeyword_2_1()); 

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
    // $ANTLR end "rule__Flow__Alternatives_2"


    // $ANTLR start "rule__Flow__Alternatives_3"
    // InternalMAL.g:1486:1: rule__Flow__Alternatives_3 : ( ( 'LEAVE' ) | ( 'leave' ) );
    public final void rule__Flow__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1490:1: ( ( 'LEAVE' ) | ( 'leave' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            else if ( (LA32_0==48) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMAL.g:1491:2: ( 'LEAVE' )
                    {
                    // InternalMAL.g:1491:2: ( 'LEAVE' )
                    // InternalMAL.g:1492:3: 'LEAVE'
                    {
                     before(grammarAccess.getFlowAccess().getLEAVEKeyword_3_0()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getLEAVEKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1497:2: ( 'leave' )
                    {
                    // InternalMAL.g:1497:2: ( 'leave' )
                    // InternalMAL.g:1498:3: 'leave'
                    {
                     before(grammarAccess.getFlowAccess().getLeaveKeyword_3_1()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getLeaveKeyword_3_1()); 

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
    // $ANTLR end "rule__Flow__Alternatives_3"


    // $ANTLR start "rule__Flow__Alternatives_4"
    // InternalMAL.g:1507:1: rule__Flow__Alternatives_4 : ( ( 'REDO' ) | ( 'redo' ) );
    public final void rule__Flow__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1511:1: ( ( 'REDO' ) | ( 'redo' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            else if ( (LA33_0==50) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMAL.g:1512:2: ( 'REDO' )
                    {
                    // InternalMAL.g:1512:2: ( 'REDO' )
                    // InternalMAL.g:1513:3: 'REDO'
                    {
                     before(grammarAccess.getFlowAccess().getREDOKeyword_4_0()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getREDOKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1518:2: ( 'redo' )
                    {
                    // InternalMAL.g:1518:2: ( 'redo' )
                    // InternalMAL.g:1519:3: 'redo'
                    {
                     before(grammarAccess.getFlowAccess().getRedoKeyword_4_1()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getRedoKeyword_4_1()); 

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
    // $ANTLR end "rule__Flow__Alternatives_4"


    // $ANTLR start "rule__Flow__Alternatives_5"
    // InternalMAL.g:1528:1: rule__Flow__Alternatives_5 : ( ( 'RAISE' ) | ( 'raise' ) );
    public final void rule__Flow__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1532:1: ( ( 'RAISE' ) | ( 'raise' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            else if ( (LA34_0==52) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMAL.g:1533:2: ( 'RAISE' )
                    {
                    // InternalMAL.g:1533:2: ( 'RAISE' )
                    // InternalMAL.g:1534:3: 'RAISE'
                    {
                     before(grammarAccess.getFlowAccess().getRAISEKeyword_5_0()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getRAISEKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1539:2: ( 'raise' )
                    {
                    // InternalMAL.g:1539:2: ( 'raise' )
                    // InternalMAL.g:1540:3: 'raise'
                    {
                     before(grammarAccess.getFlowAccess().getRaiseKeyword_5_1()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getFlowAccess().getRaiseKeyword_5_1()); 

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
    // $ANTLR end "rule__Flow__Alternatives_5"


    // $ANTLR start "rule__Varlist__Alternatives"
    // InternalMAL.g:1549:1: rule__Varlist__Alternatives : ( ( ( rule__Varlist__VariablesAssignment_0 ) ) | ( ( rule__Varlist__Group_1__0 ) ) );
    public final void rule__Varlist__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1553:1: ( ( ( rule__Varlist__VariablesAssignment_0 ) ) | ( ( rule__Varlist__Group_1__0 ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_WRD) ) {
                alt35=1;
            }
            else if ( (LA35_0==70) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMAL.g:1554:2: ( ( rule__Varlist__VariablesAssignment_0 ) )
                    {
                    // InternalMAL.g:1554:2: ( ( rule__Varlist__VariablesAssignment_0 ) )
                    // InternalMAL.g:1555:3: ( rule__Varlist__VariablesAssignment_0 )
                    {
                     before(grammarAccess.getVarlistAccess().getVariablesAssignment_0()); 
                    // InternalMAL.g:1556:3: ( rule__Varlist__VariablesAssignment_0 )
                    // InternalMAL.g:1556:4: rule__Varlist__VariablesAssignment_0
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
                    // InternalMAL.g:1560:2: ( ( rule__Varlist__Group_1__0 ) )
                    {
                    // InternalMAL.g:1560:2: ( ( rule__Varlist__Group_1__0 ) )
                    // InternalMAL.g:1561:3: ( rule__Varlist__Group_1__0 )
                    {
                     before(grammarAccess.getVarlistAccess().getGroup_1()); 
                    // InternalMAL.g:1562:3: ( rule__Varlist__Group_1__0 )
                    // InternalMAL.g:1562:4: rule__Varlist__Group_1__0
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
    // InternalMAL.g:1570:1: rule__Expr__Alternatives : ( ( ruleFcncall ) | ( ( rule__Expr__Group_1__0 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1574:1: ( ( ruleFcncall ) | ( ( rule__Expr__Group_1__0 ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_WRD) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==72) ) {
                    alt36=1;
                }
                else if ( (LA36_1==EOF||LA36_1==RULE_WRD||(LA36_1>=15 && LA36_1<=24)||(LA36_1>=27 && LA36_1<=36)||(LA36_1>=41 && LA36_1<=65)||LA36_1==68||LA36_1==70) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_CHR)||(LA36_0>=RULE_INT && LA36_0<=RULE_OID)||(LA36_0>=66 && LA36_0<=67)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMAL.g:1575:2: ( ruleFcncall )
                    {
                    // InternalMAL.g:1575:2: ( ruleFcncall )
                    // InternalMAL.g:1576:3: ruleFcncall
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
                    // InternalMAL.g:1581:2: ( ( rule__Expr__Group_1__0 ) )
                    {
                    // InternalMAL.g:1581:2: ( ( rule__Expr__Group_1__0 ) )
                    // InternalMAL.g:1582:3: ( rule__Expr__Group_1__0 )
                    {
                     before(grammarAccess.getExprAccess().getGroup_1()); 
                    // InternalMAL.g:1583:3: ( rule__Expr__Group_1__0 )
                    // InternalMAL.g:1583:4: rule__Expr__Group_1__0
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
    // InternalMAL.g:1591:1: rule__Operator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '>' ) | ( '<' ) | ( '=' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) | ( '&&' ) | ( '||' ) | ( '!' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1595:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '>' ) | ( '<' ) | ( '=' ) | ( '<=' ) | ( '>=' ) | ( '!=' ) | ( '&&' ) | ( '||' ) | ( '!' ) )
            int alt37=13;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt37=1;
                }
                break;
            case 54:
                {
                alt37=2;
                }
                break;
            case 55:
                {
                alt37=3;
                }
                break;
            case 56:
                {
                alt37=4;
                }
                break;
            case 57:
                {
                alt37=5;
                }
                break;
            case 58:
                {
                alt37=6;
                }
                break;
            case 59:
                {
                alt37=7;
                }
                break;
            case 60:
                {
                alt37=8;
                }
                break;
            case 61:
                {
                alt37=9;
                }
                break;
            case 62:
                {
                alt37=10;
                }
                break;
            case 63:
                {
                alt37=11;
                }
                break;
            case 64:
                {
                alt37=12;
                }
                break;
            case 65:
                {
                alt37=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMAL.g:1596:2: ( '+' )
                    {
                    // InternalMAL.g:1596:2: ( '+' )
                    // InternalMAL.g:1597:3: '+'
                    {
                     before(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1602:2: ( '-' )
                    {
                    // InternalMAL.g:1602:2: ( '-' )
                    // InternalMAL.g:1603:3: '-'
                    {
                     before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMAL.g:1608:2: ( '*' )
                    {
                    // InternalMAL.g:1608:2: ( '*' )
                    // InternalMAL.g:1609:3: '*'
                    {
                     before(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:1614:2: ( '/' )
                    {
                    // InternalMAL.g:1614:2: ( '/' )
                    // InternalMAL.g:1615:3: '/'
                    {
                     before(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMAL.g:1620:2: ( '>' )
                    {
                    // InternalMAL.g:1620:2: ( '>' )
                    // InternalMAL.g:1621:3: '>'
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMAL.g:1626:2: ( '<' )
                    {
                    // InternalMAL.g:1626:2: ( '<' )
                    // InternalMAL.g:1627:3: '<'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_5()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMAL.g:1632:2: ( '=' )
                    {
                    // InternalMAL.g:1632:2: ( '=' )
                    // InternalMAL.g:1633:3: '='
                    {
                     before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_6()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMAL.g:1638:2: ( '<=' )
                    {
                    // InternalMAL.g:1638:2: ( '<=' )
                    // InternalMAL.g:1639:3: '<='
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_7()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMAL.g:1644:2: ( '>=' )
                    {
                    // InternalMAL.g:1644:2: ( '>=' )
                    // InternalMAL.g:1645:3: '>='
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_8()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMAL.g:1650:2: ( '!=' )
                    {
                    // InternalMAL.g:1650:2: ( '!=' )
                    // InternalMAL.g:1651:3: '!='
                    {
                     before(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_9()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMAL.g:1656:2: ( '&&' )
                    {
                    // InternalMAL.g:1656:2: ( '&&' )
                    // InternalMAL.g:1657:3: '&&'
                    {
                     before(grammarAccess.getOperatorAccess().getAmpersandAmpersandKeyword_10()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getAmpersandAmpersandKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMAL.g:1662:2: ( '||' )
                    {
                    // InternalMAL.g:1662:2: ( '||' )
                    // InternalMAL.g:1663:3: '||'
                    {
                     before(grammarAccess.getOperatorAccess().getVerticalLineVerticalLineKeyword_11()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getVerticalLineVerticalLineKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMAL.g:1668:2: ( '!' )
                    {
                    // InternalMAL.g:1668:2: ( '!' )
                    // InternalMAL.g:1669:3: '!'
                    {
                     before(grammarAccess.getOperatorAccess().getExclamationMarkKeyword_12()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getExclamationMarkKeyword_12()); 

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
    // InternalMAL.g:1678:1: rule__Factor__Alternatives : ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1682:1: ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_OID)) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=66 && LA38_0<=67)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMAL.g:1683:2: ( ( rule__Factor__Group_0__0 ) )
                    {
                    // InternalMAL.g:1683:2: ( ( rule__Factor__Group_0__0 ) )
                    // InternalMAL.g:1684:3: ( rule__Factor__Group_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_0()); 
                    // InternalMAL.g:1685:3: ( rule__Factor__Group_0__0 )
                    // InternalMAL.g:1685:4: rule__Factor__Group_0__0
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
                    // InternalMAL.g:1689:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalMAL.g:1689:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalMAL.g:1690:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalMAL.g:1691:3: ( rule__Factor__Group_1__0 )
                    // InternalMAL.g:1691:4: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Factor__Alternatives_1_1"
    // InternalMAL.g:1699:1: rule__Factor__Alternatives_1_1 : ( ( 'NIL' ) | ( 'nil' ) );
    public final void rule__Factor__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1703:1: ( ( 'NIL' ) | ( 'nil' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            else if ( (LA39_0==67) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMAL.g:1704:2: ( 'NIL' )
                    {
                    // InternalMAL.g:1704:2: ( 'NIL' )
                    // InternalMAL.g:1705:3: 'NIL'
                    {
                     before(grammarAccess.getFactorAccess().getNILKeyword_1_1_0()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getFactorAccess().getNILKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1710:2: ( 'nil' )
                    {
                    // InternalMAL.g:1710:2: ( 'nil' )
                    // InternalMAL.g:1711:3: 'nil'
                    {
                     before(grammarAccess.getFactorAccess().getNilKeyword_1_1_1()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getFactorAccess().getNilKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Factor__Alternatives_1_1"


    // $ANTLR start "rule__Literal_constant__Alternatives"
    // InternalMAL.g:1720:1: rule__Literal_constant__Alternatives : ( ( RULE_BIT ) | ( ruleBte ) | ( RULE_CHR ) | ( RULE_WRD ) | ( RULE_INT ) | ( RULE_OID ) | ( ruleFLT ) | ( ruleSTR ) );
    public final void rule__Literal_constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1724:1: ( ( RULE_BIT ) | ( ruleBte ) | ( RULE_CHR ) | ( RULE_WRD ) | ( RULE_INT ) | ( RULE_OID ) | ( ruleFLT ) | ( ruleSTR ) )
            int alt40=8;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalMAL.g:1725:2: ( RULE_BIT )
                    {
                    // InternalMAL.g:1725:2: ( RULE_BIT )
                    // InternalMAL.g:1726:3: RULE_BIT
                    {
                     before(grammarAccess.getLiteral_constantAccess().getBITTerminalRuleCall_0()); 
                    match(input,RULE_BIT,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getBITTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMAL.g:1731:2: ( ruleBte )
                    {
                    // InternalMAL.g:1731:2: ( ruleBte )
                    // InternalMAL.g:1732:3: ruleBte
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
                    // InternalMAL.g:1737:2: ( RULE_CHR )
                    {
                    // InternalMAL.g:1737:2: ( RULE_CHR )
                    // InternalMAL.g:1738:3: RULE_CHR
                    {
                     before(grammarAccess.getLiteral_constantAccess().getCHRTerminalRuleCall_2()); 
                    match(input,RULE_CHR,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getCHRTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMAL.g:1743:2: ( RULE_WRD )
                    {
                    // InternalMAL.g:1743:2: ( RULE_WRD )
                    // InternalMAL.g:1744:3: RULE_WRD
                    {
                     before(grammarAccess.getLiteral_constantAccess().getWRDTerminalRuleCall_3()); 
                    match(input,RULE_WRD,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getWRDTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMAL.g:1749:2: ( RULE_INT )
                    {
                    // InternalMAL.g:1749:2: ( RULE_INT )
                    // InternalMAL.g:1750:3: RULE_INT
                    {
                     before(grammarAccess.getLiteral_constantAccess().getINTTerminalRuleCall_4()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getINTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMAL.g:1755:2: ( RULE_OID )
                    {
                    // InternalMAL.g:1755:2: ( RULE_OID )
                    // InternalMAL.g:1756:3: RULE_OID
                    {
                     before(grammarAccess.getLiteral_constantAccess().getOIDTerminalRuleCall_5()); 
                    match(input,RULE_OID,FOLLOW_2); 
                     after(grammarAccess.getLiteral_constantAccess().getOIDTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMAL.g:1761:2: ( ruleFLT )
                    {
                    // InternalMAL.g:1761:2: ( ruleFLT )
                    // InternalMAL.g:1762:3: ruleFLT
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
                    // InternalMAL.g:1767:2: ( ruleSTR )
                    {
                    // InternalMAL.g:1767:2: ( ruleSTR )
                    // InternalMAL.g:1768:3: ruleSTR
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
    // InternalMAL.g:1777:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1781:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMAL.g:1782:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalMAL.g:1789:1: rule__Program__Group__0__Impl : ( ( rule__Program__ElementsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1793:1: ( ( ( rule__Program__ElementsAssignment_0 ) ) )
            // InternalMAL.g:1794:1: ( ( rule__Program__ElementsAssignment_0 ) )
            {
            // InternalMAL.g:1794:1: ( ( rule__Program__ElementsAssignment_0 ) )
            // InternalMAL.g:1795:2: ( rule__Program__ElementsAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getElementsAssignment_0()); 
            // InternalMAL.g:1796:2: ( rule__Program__ElementsAssignment_0 )
            // InternalMAL.g:1796:3: rule__Program__ElementsAssignment_0
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
    // InternalMAL.g:1804:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1808:1: ( rule__Program__Group__1__Impl )
            // InternalMAL.g:1809:2: rule__Program__Group__1__Impl
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
    // InternalMAL.g:1815:1: rule__Program__Group__1__Impl : ( ';' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1819:1: ( ( ';' ) )
            // InternalMAL.g:1820:1: ( ';' )
            {
            // InternalMAL.g:1820:1: ( ';' )
            // InternalMAL.g:1821:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMAL.g:1831:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1835:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMAL.g:1836:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalMAL.g:1843:1: rule__Statement__Group_0__0__Impl : ( ruleModuleStmt ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1847:1: ( ( ruleModuleStmt ) )
            // InternalMAL.g:1848:1: ( ruleModuleStmt )
            {
            // InternalMAL.g:1848:1: ( ruleModuleStmt )
            // InternalMAL.g:1849:2: ruleModuleStmt
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
    // InternalMAL.g:1858:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1862:1: ( rule__Statement__Group_0__1__Impl )
            // InternalMAL.g:1863:2: rule__Statement__Group_0__1__Impl
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
    // InternalMAL.g:1869:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__HelpAssignment_0_1 )? ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1873:1: ( ( ( rule__Statement__HelpAssignment_0_1 )? ) )
            // InternalMAL.g:1874:1: ( ( rule__Statement__HelpAssignment_0_1 )? )
            {
            // InternalMAL.g:1874:1: ( ( rule__Statement__HelpAssignment_0_1 )? )
            // InternalMAL.g:1875:2: ( rule__Statement__HelpAssignment_0_1 )?
            {
             before(grammarAccess.getStatementAccess().getHelpAssignment_0_1()); 
            // InternalMAL.g:1876:2: ( rule__Statement__HelpAssignment_0_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=37 && LA41_0<=38)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMAL.g:1876:3: rule__Statement__HelpAssignment_0_1
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
    // InternalMAL.g:1885:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1889:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalMAL.g:1890:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
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
    // InternalMAL.g:1897:1: rule__Statement__Group_1__0__Impl : ( ruleDefinition ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1901:1: ( ( ruleDefinition ) )
            // InternalMAL.g:1902:1: ( ruleDefinition )
            {
            // InternalMAL.g:1902:1: ( ruleDefinition )
            // InternalMAL.g:1903:2: ruleDefinition
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
    // InternalMAL.g:1912:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1916:1: ( rule__Statement__Group_1__1__Impl )
            // InternalMAL.g:1917:2: rule__Statement__Group_1__1__Impl
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
    // InternalMAL.g:1923:1: rule__Statement__Group_1__1__Impl : ( ( rule__Statement__HelpAssignment_1_1 )? ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1927:1: ( ( ( rule__Statement__HelpAssignment_1_1 )? ) )
            // InternalMAL.g:1928:1: ( ( rule__Statement__HelpAssignment_1_1 )? )
            {
            // InternalMAL.g:1928:1: ( ( rule__Statement__HelpAssignment_1_1 )? )
            // InternalMAL.g:1929:2: ( rule__Statement__HelpAssignment_1_1 )?
            {
             before(grammarAccess.getStatementAccess().getHelpAssignment_1_1()); 
            // InternalMAL.g:1930:2: ( rule__Statement__HelpAssignment_1_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=37 && LA42_0<=38)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMAL.g:1930:3: rule__Statement__HelpAssignment_1_1
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
    // InternalMAL.g:1939:1: rule__ModuleStmt__Group_0__0 : rule__ModuleStmt__Group_0__0__Impl rule__ModuleStmt__Group_0__1 ;
    public final void rule__ModuleStmt__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1943:1: ( rule__ModuleStmt__Group_0__0__Impl rule__ModuleStmt__Group_0__1 )
            // InternalMAL.g:1944:2: rule__ModuleStmt__Group_0__0__Impl rule__ModuleStmt__Group_0__1
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
    // InternalMAL.g:1951:1: rule__ModuleStmt__Group_0__0__Impl : ( ( rule__ModuleStmt__Alternatives_0_0 ) ) ;
    public final void rule__ModuleStmt__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1955:1: ( ( ( rule__ModuleStmt__Alternatives_0_0 ) ) )
            // InternalMAL.g:1956:1: ( ( rule__ModuleStmt__Alternatives_0_0 ) )
            {
            // InternalMAL.g:1956:1: ( ( rule__ModuleStmt__Alternatives_0_0 ) )
            // InternalMAL.g:1957:2: ( rule__ModuleStmt__Alternatives_0_0 )
            {
             before(grammarAccess.getModuleStmtAccess().getAlternatives_0_0()); 
            // InternalMAL.g:1958:2: ( rule__ModuleStmt__Alternatives_0_0 )
            // InternalMAL.g:1958:3: rule__ModuleStmt__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleStmtAccess().getAlternatives_0_0()); 

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
    // InternalMAL.g:1966:1: rule__ModuleStmt__Group_0__1 : rule__ModuleStmt__Group_0__1__Impl ;
    public final void rule__ModuleStmt__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1970:1: ( rule__ModuleStmt__Group_0__1__Impl )
            // InternalMAL.g:1971:2: rule__ModuleStmt__Group_0__1__Impl
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
    // InternalMAL.g:1977:1: rule__ModuleStmt__Group_0__1__Impl : ( ( rule__ModuleStmt__IdentAssignment_0_1 ) ) ;
    public final void rule__ModuleStmt__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1981:1: ( ( ( rule__ModuleStmt__IdentAssignment_0_1 ) ) )
            // InternalMAL.g:1982:1: ( ( rule__ModuleStmt__IdentAssignment_0_1 ) )
            {
            // InternalMAL.g:1982:1: ( ( rule__ModuleStmt__IdentAssignment_0_1 ) )
            // InternalMAL.g:1983:2: ( rule__ModuleStmt__IdentAssignment_0_1 )
            {
             before(grammarAccess.getModuleStmtAccess().getIdentAssignment_0_1()); 
            // InternalMAL.g:1984:2: ( rule__ModuleStmt__IdentAssignment_0_1 )
            // InternalMAL.g:1984:3: rule__ModuleStmt__IdentAssignment_0_1
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
    // InternalMAL.g:1993:1: rule__ModuleStmt__Group_1__0 : rule__ModuleStmt__Group_1__0__Impl rule__ModuleStmt__Group_1__1 ;
    public final void rule__ModuleStmt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:1997:1: ( rule__ModuleStmt__Group_1__0__Impl rule__ModuleStmt__Group_1__1 )
            // InternalMAL.g:1998:2: rule__ModuleStmt__Group_1__0__Impl rule__ModuleStmt__Group_1__1
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
    // InternalMAL.g:2005:1: rule__ModuleStmt__Group_1__0__Impl : ( ( rule__ModuleStmt__Alternatives_1_0 ) ) ;
    public final void rule__ModuleStmt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2009:1: ( ( ( rule__ModuleStmt__Alternatives_1_0 ) ) )
            // InternalMAL.g:2010:1: ( ( rule__ModuleStmt__Alternatives_1_0 ) )
            {
            // InternalMAL.g:2010:1: ( ( rule__ModuleStmt__Alternatives_1_0 ) )
            // InternalMAL.g:2011:2: ( rule__ModuleStmt__Alternatives_1_0 )
            {
             before(grammarAccess.getModuleStmtAccess().getAlternatives_1_0()); 
            // InternalMAL.g:2012:2: ( rule__ModuleStmt__Alternatives_1_0 )
            // InternalMAL.g:2012:3: rule__ModuleStmt__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ModuleStmt__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleStmtAccess().getAlternatives_1_0()); 

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
    // InternalMAL.g:2020:1: rule__ModuleStmt__Group_1__1 : rule__ModuleStmt__Group_1__1__Impl rule__ModuleStmt__Group_1__2 ;
    public final void rule__ModuleStmt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2024:1: ( rule__ModuleStmt__Group_1__1__Impl rule__ModuleStmt__Group_1__2 )
            // InternalMAL.g:2025:2: rule__ModuleStmt__Group_1__1__Impl rule__ModuleStmt__Group_1__2
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
    // InternalMAL.g:2032:1: rule__ModuleStmt__Group_1__1__Impl : ( ( rule__ModuleStmt__IdentAssignment_1_1 ) ) ;
    public final void rule__ModuleStmt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2036:1: ( ( ( rule__ModuleStmt__IdentAssignment_1_1 ) ) )
            // InternalMAL.g:2037:1: ( ( rule__ModuleStmt__IdentAssignment_1_1 ) )
            {
            // InternalMAL.g:2037:1: ( ( rule__ModuleStmt__IdentAssignment_1_1 ) )
            // InternalMAL.g:2038:2: ( rule__ModuleStmt__IdentAssignment_1_1 )
            {
             before(grammarAccess.getModuleStmtAccess().getIdentAssignment_1_1()); 
            // InternalMAL.g:2039:2: ( rule__ModuleStmt__IdentAssignment_1_1 )
            // InternalMAL.g:2039:3: rule__ModuleStmt__IdentAssignment_1_1
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
    // InternalMAL.g:2047:1: rule__ModuleStmt__Group_1__2 : rule__ModuleStmt__Group_1__2__Impl ;
    public final void rule__ModuleStmt__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2051:1: ( rule__ModuleStmt__Group_1__2__Impl )
            // InternalMAL.g:2052:2: rule__ModuleStmt__Group_1__2__Impl
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
    // InternalMAL.g:2058:1: rule__ModuleStmt__Group_1__2__Impl : ( ( rule__ModuleStmt__Group_1_2__0 )? ) ;
    public final void rule__ModuleStmt__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2062:1: ( ( ( rule__ModuleStmt__Group_1_2__0 )? ) )
            // InternalMAL.g:2063:1: ( ( rule__ModuleStmt__Group_1_2__0 )? )
            {
            // InternalMAL.g:2063:1: ( ( rule__ModuleStmt__Group_1_2__0 )? )
            // InternalMAL.g:2064:2: ( rule__ModuleStmt__Group_1_2__0 )?
            {
             before(grammarAccess.getModuleStmtAccess().getGroup_1_2()); 
            // InternalMAL.g:2065:2: ( rule__ModuleStmt__Group_1_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==69) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMAL.g:2065:3: rule__ModuleStmt__Group_1_2__0
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
    // InternalMAL.g:2074:1: rule__ModuleStmt__Group_1_2__0 : rule__ModuleStmt__Group_1_2__0__Impl rule__ModuleStmt__Group_1_2__1 ;
    public final void rule__ModuleStmt__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2078:1: ( rule__ModuleStmt__Group_1_2__0__Impl rule__ModuleStmt__Group_1_2__1 )
            // InternalMAL.g:2079:2: rule__ModuleStmt__Group_1_2__0__Impl rule__ModuleStmt__Group_1_2__1
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
    // InternalMAL.g:2086:1: rule__ModuleStmt__Group_1_2__0__Impl : ( ':' ) ;
    public final void rule__ModuleStmt__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2090:1: ( ( ':' ) )
            // InternalMAL.g:2091:1: ( ':' )
            {
            // InternalMAL.g:2091:1: ( ':' )
            // InternalMAL.g:2092:2: ':'
            {
             before(grammarAccess.getModuleStmtAccess().getColonKeyword_1_2_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMAL.g:2101:1: rule__ModuleStmt__Group_1_2__1 : rule__ModuleStmt__Group_1_2__1__Impl ;
    public final void rule__ModuleStmt__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2105:1: ( rule__ModuleStmt__Group_1_2__1__Impl )
            // InternalMAL.g:2106:2: rule__ModuleStmt__Group_1_2__1__Impl
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
    // InternalMAL.g:2112:1: rule__ModuleStmt__Group_1_2__1__Impl : ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) ) ;
    public final void rule__ModuleStmt__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2116:1: ( ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) ) )
            // InternalMAL.g:2117:1: ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) )
            {
            // InternalMAL.g:2117:1: ( ( rule__ModuleStmt__Second_identAssignment_1_2_1 ) )
            // InternalMAL.g:2118:2: ( rule__ModuleStmt__Second_identAssignment_1_2_1 )
            {
             before(grammarAccess.getModuleStmtAccess().getSecond_identAssignment_1_2_1()); 
            // InternalMAL.g:2119:2: ( rule__ModuleStmt__Second_identAssignment_1_2_1 )
            // InternalMAL.g:2119:3: rule__ModuleStmt__Second_identAssignment_1_2_1
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
    // InternalMAL.g:2128:1: rule__IncludeStmt__Group_0__0 : rule__IncludeStmt__Group_0__0__Impl rule__IncludeStmt__Group_0__1 ;
    public final void rule__IncludeStmt__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2132:1: ( rule__IncludeStmt__Group_0__0__Impl rule__IncludeStmt__Group_0__1 )
            // InternalMAL.g:2133:2: rule__IncludeStmt__Group_0__0__Impl rule__IncludeStmt__Group_0__1
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
    // InternalMAL.g:2140:1: rule__IncludeStmt__Group_0__0__Impl : ( ( rule__IncludeStmt__Alternatives_0_0 ) ) ;
    public final void rule__IncludeStmt__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2144:1: ( ( ( rule__IncludeStmt__Alternatives_0_0 ) ) )
            // InternalMAL.g:2145:1: ( ( rule__IncludeStmt__Alternatives_0_0 ) )
            {
            // InternalMAL.g:2145:1: ( ( rule__IncludeStmt__Alternatives_0_0 ) )
            // InternalMAL.g:2146:2: ( rule__IncludeStmt__Alternatives_0_0 )
            {
             before(grammarAccess.getIncludeStmtAccess().getAlternatives_0_0()); 
            // InternalMAL.g:2147:2: ( rule__IncludeStmt__Alternatives_0_0 )
            // InternalMAL.g:2147:3: rule__IncludeStmt__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStmt__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeStmtAccess().getAlternatives_0_0()); 

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
    // InternalMAL.g:2155:1: rule__IncludeStmt__Group_0__1 : rule__IncludeStmt__Group_0__1__Impl ;
    public final void rule__IncludeStmt__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2159:1: ( rule__IncludeStmt__Group_0__1__Impl )
            // InternalMAL.g:2160:2: rule__IncludeStmt__Group_0__1__Impl
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
    // InternalMAL.g:2166:1: rule__IncludeStmt__Group_0__1__Impl : ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) ) ;
    public final void rule__IncludeStmt__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2170:1: ( ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) ) )
            // InternalMAL.g:2171:1: ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) )
            {
            // InternalMAL.g:2171:1: ( ( rule__IncludeStmt__IdentifierAssignment_0_1 ) )
            // InternalMAL.g:2172:2: ( rule__IncludeStmt__IdentifierAssignment_0_1 )
            {
             before(grammarAccess.getIncludeStmtAccess().getIdentifierAssignment_0_1()); 
            // InternalMAL.g:2173:2: ( rule__IncludeStmt__IdentifierAssignment_0_1 )
            // InternalMAL.g:2173:3: rule__IncludeStmt__IdentifierAssignment_0_1
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
    // InternalMAL.g:2182:1: rule__IncludeStmt__Group_1__0 : rule__IncludeStmt__Group_1__0__Impl rule__IncludeStmt__Group_1__1 ;
    public final void rule__IncludeStmt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2186:1: ( rule__IncludeStmt__Group_1__0__Impl rule__IncludeStmt__Group_1__1 )
            // InternalMAL.g:2187:2: rule__IncludeStmt__Group_1__0__Impl rule__IncludeStmt__Group_1__1
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
    // InternalMAL.g:2194:1: rule__IncludeStmt__Group_1__0__Impl : ( ( rule__IncludeStmt__Alternatives_1_0 ) ) ;
    public final void rule__IncludeStmt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2198:1: ( ( ( rule__IncludeStmt__Alternatives_1_0 ) ) )
            // InternalMAL.g:2199:1: ( ( rule__IncludeStmt__Alternatives_1_0 ) )
            {
            // InternalMAL.g:2199:1: ( ( rule__IncludeStmt__Alternatives_1_0 ) )
            // InternalMAL.g:2200:2: ( rule__IncludeStmt__Alternatives_1_0 )
            {
             before(grammarAccess.getIncludeStmtAccess().getAlternatives_1_0()); 
            // InternalMAL.g:2201:2: ( rule__IncludeStmt__Alternatives_1_0 )
            // InternalMAL.g:2201:3: rule__IncludeStmt__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__IncludeStmt__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeStmtAccess().getAlternatives_1_0()); 

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
    // InternalMAL.g:2209:1: rule__IncludeStmt__Group_1__1 : rule__IncludeStmt__Group_1__1__Impl ;
    public final void rule__IncludeStmt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2213:1: ( rule__IncludeStmt__Group_1__1__Impl )
            // InternalMAL.g:2214:2: rule__IncludeStmt__Group_1__1__Impl
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
    // InternalMAL.g:2220:1: rule__IncludeStmt__Group_1__1__Impl : ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) ) ;
    public final void rule__IncludeStmt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2224:1: ( ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) ) )
            // InternalMAL.g:2225:1: ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) )
            {
            // InternalMAL.g:2225:1: ( ( rule__IncludeStmt__String_literalAssignment_1_1 ) )
            // InternalMAL.g:2226:2: ( rule__IncludeStmt__String_literalAssignment_1_1 )
            {
             before(grammarAccess.getIncludeStmtAccess().getString_literalAssignment_1_1()); 
            // InternalMAL.g:2227:2: ( rule__IncludeStmt__String_literalAssignment_1_1 )
            // InternalMAL.g:2227:3: rule__IncludeStmt__String_literalAssignment_1_1
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
    // InternalMAL.g:2236:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2240:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalMAL.g:2241:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
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
    // InternalMAL.g:2248:1: rule__Definition__Group_0__0__Impl : ( ( rule__Definition__Alternatives_0_0 )? ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2252:1: ( ( ( rule__Definition__Alternatives_0_0 )? ) )
            // InternalMAL.g:2253:1: ( ( rule__Definition__Alternatives_0_0 )? )
            {
            // InternalMAL.g:2253:1: ( ( rule__Definition__Alternatives_0_0 )? )
            // InternalMAL.g:2254:2: ( rule__Definition__Alternatives_0_0 )?
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_0_0()); 
            // InternalMAL.g:2255:2: ( rule__Definition__Alternatives_0_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=21 && LA44_0<=22)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMAL.g:2255:3: rule__Definition__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Alternatives_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_0_0()); 

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
    // InternalMAL.g:2263:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2267:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalMAL.g:2268:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
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
    // InternalMAL.g:2275:1: rule__Definition__Group_0__1__Impl : ( ( rule__Definition__Alternatives_0_1 ) ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2279:1: ( ( ( rule__Definition__Alternatives_0_1 ) ) )
            // InternalMAL.g:2280:1: ( ( rule__Definition__Alternatives_0_1 ) )
            {
            // InternalMAL.g:2280:1: ( ( rule__Definition__Alternatives_0_1 ) )
            // InternalMAL.g:2281:2: ( rule__Definition__Alternatives_0_1 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_0_1()); 
            // InternalMAL.g:2282:2: ( rule__Definition__Alternatives_0_1 )
            // InternalMAL.g:2282:3: rule__Definition__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_0_1()); 

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
    // InternalMAL.g:2290:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2294:1: ( rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 )
            // InternalMAL.g:2295:2: rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3
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
    // InternalMAL.g:2302:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__HeaderAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2306:1: ( ( ( rule__Definition__HeaderAssignment_0_2 ) ) )
            // InternalMAL.g:2307:1: ( ( rule__Definition__HeaderAssignment_0_2 ) )
            {
            // InternalMAL.g:2307:1: ( ( rule__Definition__HeaderAssignment_0_2 ) )
            // InternalMAL.g:2308:2: ( rule__Definition__HeaderAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_0_2()); 
            // InternalMAL.g:2309:2: ( rule__Definition__HeaderAssignment_0_2 )
            // InternalMAL.g:2309:3: rule__Definition__HeaderAssignment_0_2
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
    // InternalMAL.g:2317:1: rule__Definition__Group_0__3 : rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 ;
    public final void rule__Definition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2321:1: ( rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 )
            // InternalMAL.g:2322:2: rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4
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
    // InternalMAL.g:2329:1: rule__Definition__Group_0__3__Impl : ( ( rule__Definition__Alternatives_0_3 ) ) ;
    public final void rule__Definition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2333:1: ( ( ( rule__Definition__Alternatives_0_3 ) ) )
            // InternalMAL.g:2334:1: ( ( rule__Definition__Alternatives_0_3 ) )
            {
            // InternalMAL.g:2334:1: ( ( rule__Definition__Alternatives_0_3 ) )
            // InternalMAL.g:2335:2: ( rule__Definition__Alternatives_0_3 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_0_3()); 
            // InternalMAL.g:2336:2: ( rule__Definition__Alternatives_0_3 )
            // InternalMAL.g:2336:3: rule__Definition__Alternatives_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_0_3()); 

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
    // InternalMAL.g:2344:1: rule__Definition__Group_0__4 : rule__Definition__Group_0__4__Impl ;
    public final void rule__Definition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2348:1: ( rule__Definition__Group_0__4__Impl )
            // InternalMAL.g:2349:2: rule__Definition__Group_0__4__Impl
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
    // InternalMAL.g:2355:1: rule__Definition__Group_0__4__Impl : ( ( rule__Definition__IdentifierAssignment_0_4 ) ) ;
    public final void rule__Definition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2359:1: ( ( ( rule__Definition__IdentifierAssignment_0_4 ) ) )
            // InternalMAL.g:2360:1: ( ( rule__Definition__IdentifierAssignment_0_4 ) )
            {
            // InternalMAL.g:2360:1: ( ( rule__Definition__IdentifierAssignment_0_4 ) )
            // InternalMAL.g:2361:2: ( rule__Definition__IdentifierAssignment_0_4 )
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierAssignment_0_4()); 
            // InternalMAL.g:2362:2: ( rule__Definition__IdentifierAssignment_0_4 )
            // InternalMAL.g:2362:3: rule__Definition__IdentifierAssignment_0_4
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
    // InternalMAL.g:2371:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2375:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalMAL.g:2376:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
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
    // InternalMAL.g:2383:1: rule__Definition__Group_1__0__Impl : ( ( rule__Definition__Alternatives_1_0 )? ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2387:1: ( ( ( rule__Definition__Alternatives_1_0 )? ) )
            // InternalMAL.g:2388:1: ( ( rule__Definition__Alternatives_1_0 )? )
            {
            // InternalMAL.g:2388:1: ( ( rule__Definition__Alternatives_1_0 )? )
            // InternalMAL.g:2389:2: ( rule__Definition__Alternatives_1_0 )?
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_1_0()); 
            // InternalMAL.g:2390:2: ( rule__Definition__Alternatives_1_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=21 && LA45_0<=22)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMAL.g:2390:3: rule__Definition__Alternatives_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Alternatives_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_1_0()); 

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
    // InternalMAL.g:2398:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2402:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalMAL.g:2403:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
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
    // InternalMAL.g:2410:1: rule__Definition__Group_1__1__Impl : ( ( rule__Definition__Alternatives_1_1 ) ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2414:1: ( ( ( rule__Definition__Alternatives_1_1 ) ) )
            // InternalMAL.g:2415:1: ( ( rule__Definition__Alternatives_1_1 ) )
            {
            // InternalMAL.g:2415:1: ( ( rule__Definition__Alternatives_1_1 ) )
            // InternalMAL.g:2416:2: ( rule__Definition__Alternatives_1_1 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_1_1()); 
            // InternalMAL.g:2417:2: ( rule__Definition__Alternatives_1_1 )
            // InternalMAL.g:2417:3: rule__Definition__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_1_1()); 

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
    // InternalMAL.g:2425:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2429:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalMAL.g:2430:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
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
    // InternalMAL.g:2437:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__HeaderAssignment_1_2 ) ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2441:1: ( ( ( rule__Definition__HeaderAssignment_1_2 ) ) )
            // InternalMAL.g:2442:1: ( ( rule__Definition__HeaderAssignment_1_2 ) )
            {
            // InternalMAL.g:2442:1: ( ( rule__Definition__HeaderAssignment_1_2 ) )
            // InternalMAL.g:2443:2: ( rule__Definition__HeaderAssignment_1_2 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_1_2()); 
            // InternalMAL.g:2444:2: ( rule__Definition__HeaderAssignment_1_2 )
            // InternalMAL.g:2444:3: rule__Definition__HeaderAssignment_1_2
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
    // InternalMAL.g:2452:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2456:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalMAL.g:2457:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
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
    // InternalMAL.g:2464:1: rule__Definition__Group_1__3__Impl : ( ( rule__Definition__Alternatives_1_3 ) ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2468:1: ( ( ( rule__Definition__Alternatives_1_3 ) ) )
            // InternalMAL.g:2469:1: ( ( rule__Definition__Alternatives_1_3 ) )
            {
            // InternalMAL.g:2469:1: ( ( rule__Definition__Alternatives_1_3 ) )
            // InternalMAL.g:2470:2: ( rule__Definition__Alternatives_1_3 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_1_3()); 
            // InternalMAL.g:2471:2: ( rule__Definition__Alternatives_1_3 )
            // InternalMAL.g:2471:3: rule__Definition__Alternatives_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_1_3()); 

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
    // InternalMAL.g:2479:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2483:1: ( rule__Definition__Group_1__4__Impl )
            // InternalMAL.g:2484:2: rule__Definition__Group_1__4__Impl
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
    // InternalMAL.g:2490:1: rule__Definition__Group_1__4__Impl : ( ( rule__Definition__IdentifierAssignment_1_4 ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2494:1: ( ( ( rule__Definition__IdentifierAssignment_1_4 ) ) )
            // InternalMAL.g:2495:1: ( ( rule__Definition__IdentifierAssignment_1_4 ) )
            {
            // InternalMAL.g:2495:1: ( ( rule__Definition__IdentifierAssignment_1_4 ) )
            // InternalMAL.g:2496:2: ( rule__Definition__IdentifierAssignment_1_4 )
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierAssignment_1_4()); 
            // InternalMAL.g:2497:2: ( rule__Definition__IdentifierAssignment_1_4 )
            // InternalMAL.g:2497:3: rule__Definition__IdentifierAssignment_1_4
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
    // InternalMAL.g:2506:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2510:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalMAL.g:2511:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
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
    // InternalMAL.g:2518:1: rule__Definition__Group_2__0__Impl : ( ( rule__Definition__Alternatives_2_0 )? ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2522:1: ( ( ( rule__Definition__Alternatives_2_0 )? ) )
            // InternalMAL.g:2523:1: ( ( rule__Definition__Alternatives_2_0 )? )
            {
            // InternalMAL.g:2523:1: ( ( rule__Definition__Alternatives_2_0 )? )
            // InternalMAL.g:2524:2: ( rule__Definition__Alternatives_2_0 )?
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_2_0()); 
            // InternalMAL.g:2525:2: ( rule__Definition__Alternatives_2_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=21 && LA46_0<=22)||(LA46_0>=29 && LA46_0<=30)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMAL.g:2525:3: rule__Definition__Alternatives_2_0
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
    // InternalMAL.g:2533:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2537:1: ( rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2 )
            // InternalMAL.g:2538:2: rule__Definition__Group_2__1__Impl rule__Definition__Group_2__2
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
    // InternalMAL.g:2545:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__Alternatives_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2549:1: ( ( ( rule__Definition__Alternatives_2_1 ) ) )
            // InternalMAL.g:2550:1: ( ( rule__Definition__Alternatives_2_1 ) )
            {
            // InternalMAL.g:2550:1: ( ( rule__Definition__Alternatives_2_1 ) )
            // InternalMAL.g:2551:2: ( rule__Definition__Alternatives_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_2_1()); 
            // InternalMAL.g:2552:2: ( rule__Definition__Alternatives_2_1 )
            // InternalMAL.g:2552:3: rule__Definition__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_2_1()); 

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
    // InternalMAL.g:2560:1: rule__Definition__Group_2__2 : rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 ;
    public final void rule__Definition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2564:1: ( rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3 )
            // InternalMAL.g:2565:2: rule__Definition__Group_2__2__Impl rule__Definition__Group_2__3
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
    // InternalMAL.g:2572:1: rule__Definition__Group_2__2__Impl : ( ( rule__Definition__HeaderAssignment_2_2 ) ) ;
    public final void rule__Definition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2576:1: ( ( ( rule__Definition__HeaderAssignment_2_2 ) ) )
            // InternalMAL.g:2577:1: ( ( rule__Definition__HeaderAssignment_2_2 ) )
            {
            // InternalMAL.g:2577:1: ( ( rule__Definition__HeaderAssignment_2_2 ) )
            // InternalMAL.g:2578:2: ( rule__Definition__HeaderAssignment_2_2 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_2_2()); 
            // InternalMAL.g:2579:2: ( rule__Definition__HeaderAssignment_2_2 )
            // InternalMAL.g:2579:3: rule__Definition__HeaderAssignment_2_2
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
    // InternalMAL.g:2587:1: rule__Definition__Group_2__3 : rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 ;
    public final void rule__Definition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2591:1: ( rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4 )
            // InternalMAL.g:2592:2: rule__Definition__Group_2__3__Impl rule__Definition__Group_2__4
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
    // InternalMAL.g:2599:1: rule__Definition__Group_2__3__Impl : ( ( rule__Definition__StatementsAssignment_2_3 )* ) ;
    public final void rule__Definition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2603:1: ( ( ( rule__Definition__StatementsAssignment_2_3 )* ) )
            // InternalMAL.g:2604:1: ( ( rule__Definition__StatementsAssignment_2_3 )* )
            {
            // InternalMAL.g:2604:1: ( ( rule__Definition__StatementsAssignment_2_3 )* )
            // InternalMAL.g:2605:2: ( rule__Definition__StatementsAssignment_2_3 )*
            {
             before(grammarAccess.getDefinitionAccess().getStatementsAssignment_2_3()); 
            // InternalMAL.g:2606:2: ( rule__Definition__StatementsAssignment_2_3 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_WRD||(LA47_0>=15 && LA47_0<=24)||(LA47_0>=27 && LA47_0<=32)||(LA47_0>=35 && LA47_0<=36)||(LA47_0>=41 && LA47_0<=52)||LA47_0==70) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMAL.g:2606:3: rule__Definition__StatementsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Definition__StatementsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalMAL.g:2614:1: rule__Definition__Group_2__4 : rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5 ;
    public final void rule__Definition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2618:1: ( rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5 )
            // InternalMAL.g:2619:2: rule__Definition__Group_2__4__Impl rule__Definition__Group_2__5
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
    // InternalMAL.g:2626:1: rule__Definition__Group_2__4__Impl : ( ( rule__Definition__Alternatives_2_4 ) ) ;
    public final void rule__Definition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2630:1: ( ( ( rule__Definition__Alternatives_2_4 ) ) )
            // InternalMAL.g:2631:1: ( ( rule__Definition__Alternatives_2_4 ) )
            {
            // InternalMAL.g:2631:1: ( ( rule__Definition__Alternatives_2_4 ) )
            // InternalMAL.g:2632:2: ( rule__Definition__Alternatives_2_4 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_2_4()); 
            // InternalMAL.g:2633:2: ( rule__Definition__Alternatives_2_4 )
            // InternalMAL.g:2633:3: rule__Definition__Alternatives_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_2_4();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_2_4()); 

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
    // InternalMAL.g:2641:1: rule__Definition__Group_2__5 : rule__Definition__Group_2__5__Impl ;
    public final void rule__Definition__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2645:1: ( rule__Definition__Group_2__5__Impl )
            // InternalMAL.g:2646:2: rule__Definition__Group_2__5__Impl
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
    // InternalMAL.g:2652:1: rule__Definition__Group_2__5__Impl : ( ( rule__Definition__Function_nameAssignment_2_5 ) ) ;
    public final void rule__Definition__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2656:1: ( ( ( rule__Definition__Function_nameAssignment_2_5 ) ) )
            // InternalMAL.g:2657:1: ( ( rule__Definition__Function_nameAssignment_2_5 ) )
            {
            // InternalMAL.g:2657:1: ( ( rule__Definition__Function_nameAssignment_2_5 ) )
            // InternalMAL.g:2658:2: ( rule__Definition__Function_nameAssignment_2_5 )
            {
             before(grammarAccess.getDefinitionAccess().getFunction_nameAssignment_2_5()); 
            // InternalMAL.g:2659:2: ( rule__Definition__Function_nameAssignment_2_5 )
            // InternalMAL.g:2659:3: rule__Definition__Function_nameAssignment_2_5
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
    // InternalMAL.g:2668:1: rule__Definition__Group_3__0 : rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 ;
    public final void rule__Definition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2672:1: ( rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1 )
            // InternalMAL.g:2673:2: rule__Definition__Group_3__0__Impl rule__Definition__Group_3__1
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
    // InternalMAL.g:2680:1: rule__Definition__Group_3__0__Impl : ( ( rule__Definition__Alternatives_3_0 ) ) ;
    public final void rule__Definition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2684:1: ( ( ( rule__Definition__Alternatives_3_0 ) ) )
            // InternalMAL.g:2685:1: ( ( rule__Definition__Alternatives_3_0 ) )
            {
            // InternalMAL.g:2685:1: ( ( rule__Definition__Alternatives_3_0 ) )
            // InternalMAL.g:2686:2: ( rule__Definition__Alternatives_3_0 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_3_0()); 
            // InternalMAL.g:2687:2: ( rule__Definition__Alternatives_3_0 )
            // InternalMAL.g:2687:3: rule__Definition__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_3_0()); 

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
    // InternalMAL.g:2695:1: rule__Definition__Group_3__1 : rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 ;
    public final void rule__Definition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2699:1: ( rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2 )
            // InternalMAL.g:2700:2: rule__Definition__Group_3__1__Impl rule__Definition__Group_3__2
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
    // InternalMAL.g:2707:1: rule__Definition__Group_3__1__Impl : ( ( rule__Definition__HeaderAssignment_3_1 ) ) ;
    public final void rule__Definition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2711:1: ( ( ( rule__Definition__HeaderAssignment_3_1 ) ) )
            // InternalMAL.g:2712:1: ( ( rule__Definition__HeaderAssignment_3_1 ) )
            {
            // InternalMAL.g:2712:1: ( ( rule__Definition__HeaderAssignment_3_1 ) )
            // InternalMAL.g:2713:2: ( rule__Definition__HeaderAssignment_3_1 )
            {
             before(grammarAccess.getDefinitionAccess().getHeaderAssignment_3_1()); 
            // InternalMAL.g:2714:2: ( rule__Definition__HeaderAssignment_3_1 )
            // InternalMAL.g:2714:3: rule__Definition__HeaderAssignment_3_1
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
    // InternalMAL.g:2722:1: rule__Definition__Group_3__2 : rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 ;
    public final void rule__Definition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2726:1: ( rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3 )
            // InternalMAL.g:2727:2: rule__Definition__Group_3__2__Impl rule__Definition__Group_3__3
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
    // InternalMAL.g:2734:1: rule__Definition__Group_3__2__Impl : ( ( rule__Definition__StatementsAssignment_3_2 )* ) ;
    public final void rule__Definition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2738:1: ( ( ( rule__Definition__StatementsAssignment_3_2 )* ) )
            // InternalMAL.g:2739:1: ( ( rule__Definition__StatementsAssignment_3_2 )* )
            {
            // InternalMAL.g:2739:1: ( ( rule__Definition__StatementsAssignment_3_2 )* )
            // InternalMAL.g:2740:2: ( rule__Definition__StatementsAssignment_3_2 )*
            {
             before(grammarAccess.getDefinitionAccess().getStatementsAssignment_3_2()); 
            // InternalMAL.g:2741:2: ( rule__Definition__StatementsAssignment_3_2 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_WRD||(LA48_0>=15 && LA48_0<=24)||(LA48_0>=27 && LA48_0<=32)||(LA48_0>=35 && LA48_0<=36)||(LA48_0>=41 && LA48_0<=52)||LA48_0==70) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMAL.g:2741:3: rule__Definition__StatementsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Definition__StatementsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalMAL.g:2749:1: rule__Definition__Group_3__3 : rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 ;
    public final void rule__Definition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2753:1: ( rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4 )
            // InternalMAL.g:2754:2: rule__Definition__Group_3__3__Impl rule__Definition__Group_3__4
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
    // InternalMAL.g:2761:1: rule__Definition__Group_3__3__Impl : ( ( rule__Definition__Alternatives_3_3 ) ) ;
    public final void rule__Definition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2765:1: ( ( ( rule__Definition__Alternatives_3_3 ) ) )
            // InternalMAL.g:2766:1: ( ( rule__Definition__Alternatives_3_3 ) )
            {
            // InternalMAL.g:2766:1: ( ( rule__Definition__Alternatives_3_3 ) )
            // InternalMAL.g:2767:2: ( rule__Definition__Alternatives_3_3 )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives_3_3()); 
            // InternalMAL.g:2768:2: ( rule__Definition__Alternatives_3_3 )
            // InternalMAL.g:2768:3: rule__Definition__Alternatives_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives_3_3()); 

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
    // InternalMAL.g:2776:1: rule__Definition__Group_3__4 : rule__Definition__Group_3__4__Impl ;
    public final void rule__Definition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2780:1: ( rule__Definition__Group_3__4__Impl )
            // InternalMAL.g:2781:2: rule__Definition__Group_3__4__Impl
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
    // InternalMAL.g:2787:1: rule__Definition__Group_3__4__Impl : ( ( rule__Definition__Factory_nameAssignment_3_4 ) ) ;
    public final void rule__Definition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2791:1: ( ( ( rule__Definition__Factory_nameAssignment_3_4 ) ) )
            // InternalMAL.g:2792:1: ( ( rule__Definition__Factory_nameAssignment_3_4 ) )
            {
            // InternalMAL.g:2792:1: ( ( rule__Definition__Factory_nameAssignment_3_4 ) )
            // InternalMAL.g:2793:2: ( rule__Definition__Factory_nameAssignment_3_4 )
            {
             before(grammarAccess.getDefinitionAccess().getFactory_nameAssignment_3_4()); 
            // InternalMAL.g:2794:2: ( rule__Definition__Factory_nameAssignment_3_4 )
            // InternalMAL.g:2794:3: rule__Definition__Factory_nameAssignment_3_4
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
    // InternalMAL.g:2803:1: rule__Helpinfo__Group__0 : rule__Helpinfo__Group__0__Impl rule__Helpinfo__Group__1 ;
    public final void rule__Helpinfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2807:1: ( rule__Helpinfo__Group__0__Impl rule__Helpinfo__Group__1 )
            // InternalMAL.g:2808:2: rule__Helpinfo__Group__0__Impl rule__Helpinfo__Group__1
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
    // InternalMAL.g:2815:1: rule__Helpinfo__Group__0__Impl : ( ( rule__Helpinfo__Alternatives_0 ) ) ;
    public final void rule__Helpinfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2819:1: ( ( ( rule__Helpinfo__Alternatives_0 ) ) )
            // InternalMAL.g:2820:1: ( ( rule__Helpinfo__Alternatives_0 ) )
            {
            // InternalMAL.g:2820:1: ( ( rule__Helpinfo__Alternatives_0 ) )
            // InternalMAL.g:2821:2: ( rule__Helpinfo__Alternatives_0 )
            {
             before(grammarAccess.getHelpinfoAccess().getAlternatives_0()); 
            // InternalMAL.g:2822:2: ( rule__Helpinfo__Alternatives_0 )
            // InternalMAL.g:2822:3: rule__Helpinfo__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Helpinfo__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getHelpinfoAccess().getAlternatives_0()); 

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
    // InternalMAL.g:2830:1: rule__Helpinfo__Group__1 : rule__Helpinfo__Group__1__Impl ;
    public final void rule__Helpinfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2834:1: ( rule__Helpinfo__Group__1__Impl )
            // InternalMAL.g:2835:2: rule__Helpinfo__Group__1__Impl
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
    // InternalMAL.g:2841:1: rule__Helpinfo__Group__1__Impl : ( ( rule__Helpinfo__String_literalAssignment_1 ) ) ;
    public final void rule__Helpinfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2845:1: ( ( ( rule__Helpinfo__String_literalAssignment_1 ) ) )
            // InternalMAL.g:2846:1: ( ( rule__Helpinfo__String_literalAssignment_1 ) )
            {
            // InternalMAL.g:2846:1: ( ( rule__Helpinfo__String_literalAssignment_1 ) )
            // InternalMAL.g:2847:2: ( rule__Helpinfo__String_literalAssignment_1 )
            {
             before(grammarAccess.getHelpinfoAccess().getString_literalAssignment_1()); 
            // InternalMAL.g:2848:2: ( rule__Helpinfo__String_literalAssignment_1 )
            // InternalMAL.g:2848:3: rule__Helpinfo__String_literalAssignment_1
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
    // InternalMAL.g:2857:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2861:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalMAL.g:2862:2: rule__Header__Group__0__Impl rule__Header__Group__1
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
    // InternalMAL.g:2869:1: rule__Header__Group__0__Impl : ( ( rule__Header__Header_nameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2873:1: ( ( ( rule__Header__Header_nameAssignment_0 ) ) )
            // InternalMAL.g:2874:1: ( ( rule__Header__Header_nameAssignment_0 ) )
            {
            // InternalMAL.g:2874:1: ( ( rule__Header__Header_nameAssignment_0 ) )
            // InternalMAL.g:2875:2: ( rule__Header__Header_nameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getHeader_nameAssignment_0()); 
            // InternalMAL.g:2876:2: ( rule__Header__Header_nameAssignment_0 )
            // InternalMAL.g:2876:3: rule__Header__Header_nameAssignment_0
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
    // InternalMAL.g:2884:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2888:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalMAL.g:2889:2: rule__Header__Group__1__Impl rule__Header__Group__2
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
    // InternalMAL.g:2896:1: rule__Header__Group__1__Impl : ( '(' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2900:1: ( ( '(' ) )
            // InternalMAL.g:2901:1: ( '(' )
            {
            // InternalMAL.g:2901:1: ( '(' )
            // InternalMAL.g:2902:2: '('
            {
             before(grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMAL.g:2911:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2915:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalMAL.g:2916:2: rule__Header__Group__2__Impl rule__Header__Group__3
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
    // InternalMAL.g:2923:1: rule__Header__Group__2__Impl : ( ( rule__Header__ParamsAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2927:1: ( ( ( rule__Header__ParamsAssignment_2 ) ) )
            // InternalMAL.g:2928:1: ( ( rule__Header__ParamsAssignment_2 ) )
            {
            // InternalMAL.g:2928:1: ( ( rule__Header__ParamsAssignment_2 ) )
            // InternalMAL.g:2929:2: ( rule__Header__ParamsAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getParamsAssignment_2()); 
            // InternalMAL.g:2930:2: ( rule__Header__ParamsAssignment_2 )
            // InternalMAL.g:2930:3: rule__Header__ParamsAssignment_2
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
    // InternalMAL.g:2938:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2942:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalMAL.g:2943:2: rule__Header__Group__3__Impl rule__Header__Group__4
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
    // InternalMAL.g:2950:1: rule__Header__Group__3__Impl : ( ')' ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2954:1: ( ( ')' ) )
            // InternalMAL.g:2955:1: ( ')' )
            {
            // InternalMAL.g:2955:1: ( ')' )
            // InternalMAL.g:2956:2: ')'
            {
             before(grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMAL.g:2965:1: rule__Header__Group__4 : rule__Header__Group__4__Impl ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2969:1: ( rule__Header__Group__4__Impl )
            // InternalMAL.g:2970:2: rule__Header__Group__4__Impl
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
    // InternalMAL.g:2976:1: rule__Header__Group__4__Impl : ( ( rule__Header__Return_typeAssignment_4 ) ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2980:1: ( ( ( rule__Header__Return_typeAssignment_4 ) ) )
            // InternalMAL.g:2981:1: ( ( rule__Header__Return_typeAssignment_4 ) )
            {
            // InternalMAL.g:2981:1: ( ( rule__Header__Return_typeAssignment_4 ) )
            // InternalMAL.g:2982:2: ( rule__Header__Return_typeAssignment_4 )
            {
             before(grammarAccess.getHeaderAccess().getReturn_typeAssignment_4()); 
            // InternalMAL.g:2983:2: ( rule__Header__Return_typeAssignment_4 )
            // InternalMAL.g:2983:3: rule__Header__Return_typeAssignment_4
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
    // InternalMAL.g:2992:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:2996:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMAL.g:2997:2: rule__Name__Group__0__Impl rule__Name__Group__1
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
    // InternalMAL.g:3004:1: rule__Name__Group__0__Impl : ( ( rule__Name__Group_0__0 )? ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3008:1: ( ( ( rule__Name__Group_0__0 )? ) )
            // InternalMAL.g:3009:1: ( ( rule__Name__Group_0__0 )? )
            {
            // InternalMAL.g:3009:1: ( ( rule__Name__Group_0__0 )? )
            // InternalMAL.g:3010:2: ( rule__Name__Group_0__0 )?
            {
             before(grammarAccess.getNameAccess().getGroup_0()); 
            // InternalMAL.g:3011:2: ( rule__Name__Group_0__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_WRD) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==72) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalMAL.g:3011:3: rule__Name__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalMAL.g:3019:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3023:1: ( rule__Name__Group__1__Impl )
            // InternalMAL.g:3024:2: rule__Name__Group__1__Impl
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
    // InternalMAL.g:3030:1: rule__Name__Group__1__Impl : ( ( rule__Name__IdAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3034:1: ( ( ( rule__Name__IdAssignment_1 ) ) )
            // InternalMAL.g:3035:1: ( ( rule__Name__IdAssignment_1 ) )
            {
            // InternalMAL.g:3035:1: ( ( rule__Name__IdAssignment_1 ) )
            // InternalMAL.g:3036:2: ( rule__Name__IdAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getIdAssignment_1()); 
            // InternalMAL.g:3037:2: ( rule__Name__IdAssignment_1 )
            // InternalMAL.g:3037:3: rule__Name__IdAssignment_1
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
    // InternalMAL.g:3046:1: rule__Name__Group_0__0 : rule__Name__Group_0__0__Impl rule__Name__Group_0__1 ;
    public final void rule__Name__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3050:1: ( rule__Name__Group_0__0__Impl rule__Name__Group_0__1 )
            // InternalMAL.g:3051:2: rule__Name__Group_0__0__Impl rule__Name__Group_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMAL.g:3058:1: rule__Name__Group_0__0__Impl : ( ruleModuleName ) ;
    public final void rule__Name__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3062:1: ( ( ruleModuleName ) )
            // InternalMAL.g:3063:1: ( ruleModuleName )
            {
            // InternalMAL.g:3063:1: ( ruleModuleName )
            // InternalMAL.g:3064:2: ruleModuleName
            {
             before(grammarAccess.getNameAccess().getModuleNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModuleName();

            state._fsp--;

             after(grammarAccess.getNameAccess().getModuleNameParserRuleCall_0_0()); 

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
    // InternalMAL.g:3073:1: rule__Name__Group_0__1 : rule__Name__Group_0__1__Impl ;
    public final void rule__Name__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3077:1: ( rule__Name__Group_0__1__Impl )
            // InternalMAL.g:3078:2: rule__Name__Group_0__1__Impl
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
    // InternalMAL.g:3084:1: rule__Name__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Name__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3088:1: ( ( '.' ) )
            // InternalMAL.g:3089:1: ( '.' )
            {
            // InternalMAL.g:3089:1: ( '.' )
            // InternalMAL.g:3090:2: '.'
            {
             before(grammarAccess.getNameAccess().getFullStopKeyword_0_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMAL.g:3100:1: rule__Result__Group_1__0 : rule__Result__Group_1__0__Impl rule__Result__Group_1__1 ;
    public final void rule__Result__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3104:1: ( rule__Result__Group_1__0__Impl rule__Result__Group_1__1 )
            // InternalMAL.g:3105:2: rule__Result__Group_1__0__Impl rule__Result__Group_1__1
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
    // InternalMAL.g:3112:1: rule__Result__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Result__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3116:1: ( ( '(' ) )
            // InternalMAL.g:3117:1: ( '(' )
            {
            // InternalMAL.g:3117:1: ( '(' )
            // InternalMAL.g:3118:2: '('
            {
             before(grammarAccess.getResultAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMAL.g:3127:1: rule__Result__Group_1__1 : rule__Result__Group_1__1__Impl rule__Result__Group_1__2 ;
    public final void rule__Result__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3131:1: ( rule__Result__Group_1__1__Impl rule__Result__Group_1__2 )
            // InternalMAL.g:3132:2: rule__Result__Group_1__1__Impl rule__Result__Group_1__2
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
    // InternalMAL.g:3139:1: rule__Result__Group_1__1__Impl : ( ruleParams ) ;
    public final void rule__Result__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3143:1: ( ( ruleParams ) )
            // InternalMAL.g:3144:1: ( ruleParams )
            {
            // InternalMAL.g:3144:1: ( ruleParams )
            // InternalMAL.g:3145:2: ruleParams
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
    // InternalMAL.g:3154:1: rule__Result__Group_1__2 : rule__Result__Group_1__2__Impl ;
    public final void rule__Result__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3158:1: ( rule__Result__Group_1__2__Impl )
            // InternalMAL.g:3159:2: rule__Result__Group_1__2__Impl
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
    // InternalMAL.g:3165:1: rule__Result__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Result__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3169:1: ( ( ')' ) )
            // InternalMAL.g:3170:1: ( ')' )
            {
            // InternalMAL.g:3170:1: ( ')' )
            // InternalMAL.g:3171:2: ')'
            {
             before(grammarAccess.getResultAccess().getRightParenthesisKeyword_1_2()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMAL.g:3181:1: rule__Params__Group__0 : rule__Params__Group__0__Impl rule__Params__Group__1 ;
    public final void rule__Params__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3185:1: ( rule__Params__Group__0__Impl rule__Params__Group__1 )
            // InternalMAL.g:3186:2: rule__Params__Group__0__Impl rule__Params__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMAL.g:3193:1: rule__Params__Group__0__Impl : ( ( rule__Params__BindAssignment_0 ) ) ;
    public final void rule__Params__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3197:1: ( ( ( rule__Params__BindAssignment_0 ) ) )
            // InternalMAL.g:3198:1: ( ( rule__Params__BindAssignment_0 ) )
            {
            // InternalMAL.g:3198:1: ( ( rule__Params__BindAssignment_0 ) )
            // InternalMAL.g:3199:2: ( rule__Params__BindAssignment_0 )
            {
             before(grammarAccess.getParamsAccess().getBindAssignment_0()); 
            // InternalMAL.g:3200:2: ( rule__Params__BindAssignment_0 )
            // InternalMAL.g:3200:3: rule__Params__BindAssignment_0
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
    // InternalMAL.g:3208:1: rule__Params__Group__1 : rule__Params__Group__1__Impl ;
    public final void rule__Params__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3212:1: ( rule__Params__Group__1__Impl )
            // InternalMAL.g:3213:2: rule__Params__Group__1__Impl
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
    // InternalMAL.g:3219:1: rule__Params__Group__1__Impl : ( ( rule__Params__Group_1__0 )* ) ;
    public final void rule__Params__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3223:1: ( ( ( rule__Params__Group_1__0 )* ) )
            // InternalMAL.g:3224:1: ( ( rule__Params__Group_1__0 )* )
            {
            // InternalMAL.g:3224:1: ( ( rule__Params__Group_1__0 )* )
            // InternalMAL.g:3225:2: ( rule__Params__Group_1__0 )*
            {
             before(grammarAccess.getParamsAccess().getGroup_1()); 
            // InternalMAL.g:3226:2: ( rule__Params__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==73) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMAL.g:3226:3: rule__Params__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Params__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalMAL.g:3235:1: rule__Params__Group_1__0 : rule__Params__Group_1__0__Impl rule__Params__Group_1__1 ;
    public final void rule__Params__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3239:1: ( rule__Params__Group_1__0__Impl rule__Params__Group_1__1 )
            // InternalMAL.g:3240:2: rule__Params__Group_1__0__Impl rule__Params__Group_1__1
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
    // InternalMAL.g:3247:1: rule__Params__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Params__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3251:1: ( ( ',' ) )
            // InternalMAL.g:3252:1: ( ',' )
            {
            // InternalMAL.g:3252:1: ( ',' )
            // InternalMAL.g:3253:2: ','
            {
             before(grammarAccess.getParamsAccess().getCommaKeyword_1_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMAL.g:3262:1: rule__Params__Group_1__1 : rule__Params__Group_1__1__Impl ;
    public final void rule__Params__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3266:1: ( rule__Params__Group_1__1__Impl )
            // InternalMAL.g:3267:2: rule__Params__Group_1__1__Impl
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
    // InternalMAL.g:3273:1: rule__Params__Group_1__1__Impl : ( ( rule__Params__BindAssignment_1_1 ) ) ;
    public final void rule__Params__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3277:1: ( ( ( rule__Params__BindAssignment_1_1 ) ) )
            // InternalMAL.g:3278:1: ( ( rule__Params__BindAssignment_1_1 ) )
            {
            // InternalMAL.g:3278:1: ( ( rule__Params__BindAssignment_1_1 ) )
            // InternalMAL.g:3279:2: ( rule__Params__BindAssignment_1_1 )
            {
             before(grammarAccess.getParamsAccess().getBindAssignment_1_1()); 
            // InternalMAL.g:3280:2: ( rule__Params__BindAssignment_1_1 )
            // InternalMAL.g:3280:3: rule__Params__BindAssignment_1_1
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
    // InternalMAL.g:3289:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3293:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalMAL.g:3294:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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
    // InternalMAL.g:3301:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__IdentifierAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3305:1: ( ( ( rule__Binding__IdentifierAssignment_0 ) ) )
            // InternalMAL.g:3306:1: ( ( rule__Binding__IdentifierAssignment_0 ) )
            {
            // InternalMAL.g:3306:1: ( ( rule__Binding__IdentifierAssignment_0 ) )
            // InternalMAL.g:3307:2: ( rule__Binding__IdentifierAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getIdentifierAssignment_0()); 
            // InternalMAL.g:3308:2: ( rule__Binding__IdentifierAssignment_0 )
            // InternalMAL.g:3308:3: rule__Binding__IdentifierAssignment_0
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
    // InternalMAL.g:3316:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3320:1: ( rule__Binding__Group__1__Impl )
            // InternalMAL.g:3321:2: rule__Binding__Group__1__Impl
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
    // InternalMAL.g:3327:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__TypeAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3331:1: ( ( ( rule__Binding__TypeAssignment_1 ) ) )
            // InternalMAL.g:3332:1: ( ( rule__Binding__TypeAssignment_1 ) )
            {
            // InternalMAL.g:3332:1: ( ( rule__Binding__TypeAssignment_1 ) )
            // InternalMAL.g:3333:2: ( rule__Binding__TypeAssignment_1 )
            {
             before(grammarAccess.getBindingAccess().getTypeAssignment_1()); 
            // InternalMAL.g:3334:2: ( rule__Binding__TypeAssignment_1 )
            // InternalMAL.g:3334:3: rule__Binding__TypeAssignment_1
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


    // $ANTLR start "rule__ScalarType__Group__0"
    // InternalMAL.g:3343:1: rule__ScalarType__Group__0 : rule__ScalarType__Group__0__Impl rule__ScalarType__Group__1 ;
    public final void rule__ScalarType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3347:1: ( rule__ScalarType__Group__0__Impl rule__ScalarType__Group__1 )
            // InternalMAL.g:3348:2: rule__ScalarType__Group__0__Impl rule__ScalarType__Group__1
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
    // InternalMAL.g:3355:1: rule__ScalarType__Group__0__Impl : ( ':' ) ;
    public final void rule__ScalarType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3359:1: ( ( ':' ) )
            // InternalMAL.g:3360:1: ( ':' )
            {
            // InternalMAL.g:3360:1: ( ':' )
            // InternalMAL.g:3361:2: ':'
            {
             before(grammarAccess.getScalarTypeAccess().getColonKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMAL.g:3370:1: rule__ScalarType__Group__1 : rule__ScalarType__Group__1__Impl ;
    public final void rule__ScalarType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3374:1: ( rule__ScalarType__Group__1__Impl )
            // InternalMAL.g:3375:2: rule__ScalarType__Group__1__Impl
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
    // InternalMAL.g:3381:1: rule__ScalarType__Group__1__Impl : ( ( rule__ScalarType__IdentifierAssignment_1 ) ) ;
    public final void rule__ScalarType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3385:1: ( ( ( rule__ScalarType__IdentifierAssignment_1 ) ) )
            // InternalMAL.g:3386:1: ( ( rule__ScalarType__IdentifierAssignment_1 ) )
            {
            // InternalMAL.g:3386:1: ( ( rule__ScalarType__IdentifierAssignment_1 ) )
            // InternalMAL.g:3387:2: ( rule__ScalarType__IdentifierAssignment_1 )
            {
             before(grammarAccess.getScalarTypeAccess().getIdentifierAssignment_1()); 
            // InternalMAL.g:3388:2: ( rule__ScalarType__IdentifierAssignment_1 )
            // InternalMAL.g:3388:3: rule__ScalarType__IdentifierAssignment_1
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
    // InternalMAL.g:3397:1: rule__ColumnType__Group__0 : rule__ColumnType__Group__0__Impl rule__ColumnType__Group__1 ;
    public final void rule__ColumnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3401:1: ( rule__ColumnType__Group__0__Impl rule__ColumnType__Group__1 )
            // InternalMAL.g:3402:2: rule__ColumnType__Group__0__Impl rule__ColumnType__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMAL.g:3409:1: rule__ColumnType__Group__0__Impl : ( ':' ) ;
    public final void rule__ColumnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3413:1: ( ( ':' ) )
            // InternalMAL.g:3414:1: ( ':' )
            {
            // InternalMAL.g:3414:1: ( ':' )
            // InternalMAL.g:3415:2: ':'
            {
             before(grammarAccess.getColumnTypeAccess().getColonKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMAL.g:3424:1: rule__ColumnType__Group__1 : rule__ColumnType__Group__1__Impl rule__ColumnType__Group__2 ;
    public final void rule__ColumnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3428:1: ( rule__ColumnType__Group__1__Impl rule__ColumnType__Group__2 )
            // InternalMAL.g:3429:2: rule__ColumnType__Group__1__Impl rule__ColumnType__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMAL.g:3436:1: rule__ColumnType__Group__1__Impl : ( ( rule__ColumnType__Alternatives_1 ) ) ;
    public final void rule__ColumnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3440:1: ( ( ( rule__ColumnType__Alternatives_1 ) ) )
            // InternalMAL.g:3441:1: ( ( rule__ColumnType__Alternatives_1 ) )
            {
            // InternalMAL.g:3441:1: ( ( rule__ColumnType__Alternatives_1 ) )
            // InternalMAL.g:3442:2: ( rule__ColumnType__Alternatives_1 )
            {
             before(grammarAccess.getColumnTypeAccess().getAlternatives_1()); 
            // InternalMAL.g:3443:2: ( rule__ColumnType__Alternatives_1 )
            // InternalMAL.g:3443:3: rule__ColumnType__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnTypeAccess().getAlternatives_1()); 

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
    // InternalMAL.g:3451:1: rule__ColumnType__Group__2 : rule__ColumnType__Group__2__Impl rule__ColumnType__Group__3 ;
    public final void rule__ColumnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3455:1: ( rule__ColumnType__Group__2__Impl rule__ColumnType__Group__3 )
            // InternalMAL.g:3456:2: rule__ColumnType__Group__2__Impl rule__ColumnType__Group__3
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
    // InternalMAL.g:3463:1: rule__ColumnType__Group__2__Impl : ( '[' ) ;
    public final void rule__ColumnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3467:1: ( ( '[' ) )
            // InternalMAL.g:3468:1: ( '[' )
            {
            // InternalMAL.g:3468:1: ( '[' )
            // InternalMAL.g:3469:2: '['
            {
             before(grammarAccess.getColumnTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,74,FOLLOW_2); 
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
    // InternalMAL.g:3478:1: rule__ColumnType__Group__3 : rule__ColumnType__Group__3__Impl rule__ColumnType__Group__4 ;
    public final void rule__ColumnType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3482:1: ( rule__ColumnType__Group__3__Impl rule__ColumnType__Group__4 )
            // InternalMAL.g:3483:2: rule__ColumnType__Group__3__Impl rule__ColumnType__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMAL.g:3490:1: rule__ColumnType__Group__3__Impl : ( ':' ) ;
    public final void rule__ColumnType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3494:1: ( ( ':' ) )
            // InternalMAL.g:3495:1: ( ':' )
            {
            // InternalMAL.g:3495:1: ( ':' )
            // InternalMAL.g:3496:2: ':'
            {
             before(grammarAccess.getColumnTypeAccess().getColonKeyword_3()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMAL.g:3505:1: rule__ColumnType__Group__4 : rule__ColumnType__Group__4__Impl rule__ColumnType__Group__5 ;
    public final void rule__ColumnType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3509:1: ( rule__ColumnType__Group__4__Impl rule__ColumnType__Group__5 )
            // InternalMAL.g:3510:2: rule__ColumnType__Group__4__Impl rule__ColumnType__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMAL.g:3517:1: rule__ColumnType__Group__4__Impl : ( ruleColElmType ) ;
    public final void rule__ColumnType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3521:1: ( ( ruleColElmType ) )
            // InternalMAL.g:3522:1: ( ruleColElmType )
            {
            // InternalMAL.g:3522:1: ( ruleColElmType )
            // InternalMAL.g:3523:2: ruleColElmType
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
    // InternalMAL.g:3532:1: rule__ColumnType__Group__5 : rule__ColumnType__Group__5__Impl ;
    public final void rule__ColumnType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3536:1: ( rule__ColumnType__Group__5__Impl )
            // InternalMAL.g:3537:2: rule__ColumnType__Group__5__Impl
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
    // InternalMAL.g:3543:1: rule__ColumnType__Group__5__Impl : ( ']' ) ;
    public final void rule__ColumnType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3547:1: ( ( ']' ) )
            // InternalMAL.g:3548:1: ( ']' )
            {
            // InternalMAL.g:3548:1: ( ']' )
            // InternalMAL.g:3549:2: ']'
            {
             before(grammarAccess.getColumnTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,75,FOLLOW_2); 
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
    // InternalMAL.g:3559:1: rule__AnyType__Group__0 : rule__AnyType__Group__0__Impl rule__AnyType__Group__1 ;
    public final void rule__AnyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3563:1: ( rule__AnyType__Group__0__Impl rule__AnyType__Group__1 )
            // InternalMAL.g:3564:2: rule__AnyType__Group__0__Impl rule__AnyType__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMAL.g:3571:1: rule__AnyType__Group__0__Impl : ( ':' ) ;
    public final void rule__AnyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3575:1: ( ( ':' ) )
            // InternalMAL.g:3576:1: ( ':' )
            {
            // InternalMAL.g:3576:1: ( ':' )
            // InternalMAL.g:3577:2: ':'
            {
             before(grammarAccess.getAnyTypeAccess().getColonKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getAnyTypeAccess().getColonKeyword_0()); 

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
    // InternalMAL.g:3586:1: rule__AnyType__Group__1 : rule__AnyType__Group__1__Impl rule__AnyType__Group__2 ;
    public final void rule__AnyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3590:1: ( rule__AnyType__Group__1__Impl rule__AnyType__Group__2 )
            // InternalMAL.g:3591:2: rule__AnyType__Group__1__Impl rule__AnyType__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__AnyType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyType__Group__2();

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
    // InternalMAL.g:3598:1: rule__AnyType__Group__1__Impl : ( ( rule__AnyType__TypeAssignment_1 ) ) ;
    public final void rule__AnyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3602:1: ( ( ( rule__AnyType__TypeAssignment_1 ) ) )
            // InternalMAL.g:3603:1: ( ( rule__AnyType__TypeAssignment_1 ) )
            {
            // InternalMAL.g:3603:1: ( ( rule__AnyType__TypeAssignment_1 ) )
            // InternalMAL.g:3604:2: ( rule__AnyType__TypeAssignment_1 )
            {
             before(grammarAccess.getAnyTypeAccess().getTypeAssignment_1()); 
            // InternalMAL.g:3605:2: ( rule__AnyType__TypeAssignment_1 )
            // InternalMAL.g:3605:3: rule__AnyType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyTypeAccess().getTypeAssignment_1()); 

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


    // $ANTLR start "rule__AnyType__Group__2"
    // InternalMAL.g:3613:1: rule__AnyType__Group__2 : rule__AnyType__Group__2__Impl ;
    public final void rule__AnyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3617:1: ( rule__AnyType__Group__2__Impl )
            // InternalMAL.g:3618:2: rule__AnyType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__Group__2__Impl();

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
    // $ANTLR end "rule__AnyType__Group__2"


    // $ANTLR start "rule__AnyType__Group__2__Impl"
    // InternalMAL.g:3624:1: rule__AnyType__Group__2__Impl : ( ( rule__AnyType__Group_2__0 )? ) ;
    public final void rule__AnyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3628:1: ( ( ( rule__AnyType__Group_2__0 )? ) )
            // InternalMAL.g:3629:1: ( ( rule__AnyType__Group_2__0 )? )
            {
            // InternalMAL.g:3629:1: ( ( rule__AnyType__Group_2__0 )? )
            // InternalMAL.g:3630:2: ( rule__AnyType__Group_2__0 )?
            {
             before(grammarAccess.getAnyTypeAccess().getGroup_2()); 
            // InternalMAL.g:3631:2: ( rule__AnyType__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==76) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMAL.g:3631:3: rule__AnyType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnyType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AnyType__Group__2__Impl"


    // $ANTLR start "rule__AnyType__Group_2__0"
    // InternalMAL.g:3640:1: rule__AnyType__Group_2__0 : rule__AnyType__Group_2__0__Impl rule__AnyType__Group_2__1 ;
    public final void rule__AnyType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3644:1: ( rule__AnyType__Group_2__0__Impl rule__AnyType__Group_2__1 )
            // InternalMAL.g:3645:2: rule__AnyType__Group_2__0__Impl rule__AnyType__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__AnyType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyType__Group_2__1();

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
    // $ANTLR end "rule__AnyType__Group_2__0"


    // $ANTLR start "rule__AnyType__Group_2__0__Impl"
    // InternalMAL.g:3652:1: rule__AnyType__Group_2__0__Impl : ( '_' ) ;
    public final void rule__AnyType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3656:1: ( ( '_' ) )
            // InternalMAL.g:3657:1: ( '_' )
            {
            // InternalMAL.g:3657:1: ( '_' )
            // InternalMAL.g:3658:2: '_'
            {
             before(grammarAccess.getAnyTypeAccess().get_Keyword_2_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getAnyTypeAccess().get_Keyword_2_0()); 

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
    // $ANTLR end "rule__AnyType__Group_2__0__Impl"


    // $ANTLR start "rule__AnyType__Group_2__1"
    // InternalMAL.g:3667:1: rule__AnyType__Group_2__1 : rule__AnyType__Group_2__1__Impl ;
    public final void rule__AnyType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3671:1: ( rule__AnyType__Group_2__1__Impl )
            // InternalMAL.g:3672:2: rule__AnyType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__Group_2__1__Impl();

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
    // $ANTLR end "rule__AnyType__Group_2__1"


    // $ANTLR start "rule__AnyType__Group_2__1__Impl"
    // InternalMAL.g:3678:1: rule__AnyType__Group_2__1__Impl : ( ( rule__AnyType__DigitAssignment_2_1 ) ) ;
    public final void rule__AnyType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3682:1: ( ( ( rule__AnyType__DigitAssignment_2_1 ) ) )
            // InternalMAL.g:3683:1: ( ( rule__AnyType__DigitAssignment_2_1 ) )
            {
            // InternalMAL.g:3683:1: ( ( rule__AnyType__DigitAssignment_2_1 ) )
            // InternalMAL.g:3684:2: ( rule__AnyType__DigitAssignment_2_1 )
            {
             before(grammarAccess.getAnyTypeAccess().getDigitAssignment_2_1()); 
            // InternalMAL.g:3685:2: ( rule__AnyType__DigitAssignment_2_1 )
            // InternalMAL.g:3685:3: rule__AnyType__DigitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AnyType__DigitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyTypeAccess().getDigitAssignment_2_1()); 

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
    // $ANTLR end "rule__AnyType__Group_2__1__Impl"


    // $ANTLR start "rule__Stmt__Group__0"
    // InternalMAL.g:3694:1: rule__Stmt__Group__0 : rule__Stmt__Group__0__Impl rule__Stmt__Group__1 ;
    public final void rule__Stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3698:1: ( rule__Stmt__Group__0__Impl rule__Stmt__Group__1 )
            // InternalMAL.g:3699:2: rule__Stmt__Group__0__Impl rule__Stmt__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMAL.g:3706:1: rule__Stmt__Group__0__Impl : ( ( rule__Stmt__FlowAssignment_0 )? ) ;
    public final void rule__Stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3710:1: ( ( ( rule__Stmt__FlowAssignment_0 )? ) )
            // InternalMAL.g:3711:1: ( ( rule__Stmt__FlowAssignment_0 )? )
            {
            // InternalMAL.g:3711:1: ( ( rule__Stmt__FlowAssignment_0 )? )
            // InternalMAL.g:3712:2: ( rule__Stmt__FlowAssignment_0 )?
            {
             before(grammarAccess.getStmtAccess().getFlowAssignment_0()); 
            // InternalMAL.g:3713:2: ( rule__Stmt__FlowAssignment_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=41 && LA52_0<=52)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMAL.g:3713:3: rule__Stmt__FlowAssignment_0
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
    // InternalMAL.g:3721:1: rule__Stmt__Group__1 : rule__Stmt__Group__1__Impl rule__Stmt__Group__2 ;
    public final void rule__Stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3725:1: ( rule__Stmt__Group__1__Impl rule__Stmt__Group__2 )
            // InternalMAL.g:3726:2: rule__Stmt__Group__1__Impl rule__Stmt__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMAL.g:3733:1: rule__Stmt__Group__1__Impl : ( ( rule__Stmt__List_of_variablesAssignment_1 ) ) ;
    public final void rule__Stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3737:1: ( ( ( rule__Stmt__List_of_variablesAssignment_1 ) ) )
            // InternalMAL.g:3738:1: ( ( rule__Stmt__List_of_variablesAssignment_1 ) )
            {
            // InternalMAL.g:3738:1: ( ( rule__Stmt__List_of_variablesAssignment_1 ) )
            // InternalMAL.g:3739:2: ( rule__Stmt__List_of_variablesAssignment_1 )
            {
             before(grammarAccess.getStmtAccess().getList_of_variablesAssignment_1()); 
            // InternalMAL.g:3740:2: ( rule__Stmt__List_of_variablesAssignment_1 )
            // InternalMAL.g:3740:3: rule__Stmt__List_of_variablesAssignment_1
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
    // InternalMAL.g:3748:1: rule__Stmt__Group__2 : rule__Stmt__Group__2__Impl ;
    public final void rule__Stmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3752:1: ( rule__Stmt__Group__2__Impl )
            // InternalMAL.g:3753:2: rule__Stmt__Group__2__Impl
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
    // InternalMAL.g:3759:1: rule__Stmt__Group__2__Impl : ( ( rule__Stmt__Group_2__0 )? ) ;
    public final void rule__Stmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3763:1: ( ( ( rule__Stmt__Group_2__0 )? ) )
            // InternalMAL.g:3764:1: ( ( rule__Stmt__Group_2__0 )? )
            {
            // InternalMAL.g:3764:1: ( ( rule__Stmt__Group_2__0 )? )
            // InternalMAL.g:3765:2: ( rule__Stmt__Group_2__0 )?
            {
             before(grammarAccess.getStmtAccess().getGroup_2()); 
            // InternalMAL.g:3766:2: ( rule__Stmt__Group_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==77) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMAL.g:3766:3: rule__Stmt__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stmt__Group_2__0();

                    state._fsp--;


                    }
                    break;

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
    // InternalMAL.g:3775:1: rule__Stmt__Group_2__0 : rule__Stmt__Group_2__0__Impl rule__Stmt__Group_2__1 ;
    public final void rule__Stmt__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3779:1: ( rule__Stmt__Group_2__0__Impl rule__Stmt__Group_2__1 )
            // InternalMAL.g:3780:2: rule__Stmt__Group_2__0__Impl rule__Stmt__Group_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMAL.g:3787:1: rule__Stmt__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__Stmt__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3791:1: ( ( ':=' ) )
            // InternalMAL.g:3792:1: ( ':=' )
            {
            // InternalMAL.g:3792:1: ( ':=' )
            // InternalMAL.g:3793:2: ':='
            {
             before(grammarAccess.getStmtAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalMAL.g:3802:1: rule__Stmt__Group_2__1 : rule__Stmt__Group_2__1__Impl ;
    public final void rule__Stmt__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3806:1: ( rule__Stmt__Group_2__1__Impl )
            // InternalMAL.g:3807:2: rule__Stmt__Group_2__1__Impl
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
    // InternalMAL.g:3813:1: rule__Stmt__Group_2__1__Impl : ( ( rule__Stmt__ExpAssignment_2_1 ) ) ;
    public final void rule__Stmt__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3817:1: ( ( ( rule__Stmt__ExpAssignment_2_1 ) ) )
            // InternalMAL.g:3818:1: ( ( rule__Stmt__ExpAssignment_2_1 ) )
            {
            // InternalMAL.g:3818:1: ( ( rule__Stmt__ExpAssignment_2_1 ) )
            // InternalMAL.g:3819:2: ( rule__Stmt__ExpAssignment_2_1 )
            {
             before(grammarAccess.getStmtAccess().getExpAssignment_2_1()); 
            // InternalMAL.g:3820:2: ( rule__Stmt__ExpAssignment_2_1 )
            // InternalMAL.g:3820:3: rule__Stmt__ExpAssignment_2_1
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
    // InternalMAL.g:3829:1: rule__Varlist__Group_1__0 : rule__Varlist__Group_1__0__Impl rule__Varlist__Group_1__1 ;
    public final void rule__Varlist__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3833:1: ( rule__Varlist__Group_1__0__Impl rule__Varlist__Group_1__1 )
            // InternalMAL.g:3834:2: rule__Varlist__Group_1__0__Impl rule__Varlist__Group_1__1
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
    // InternalMAL.g:3841:1: rule__Varlist__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Varlist__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3845:1: ( ( '(' ) )
            // InternalMAL.g:3846:1: ( '(' )
            {
            // InternalMAL.g:3846:1: ( '(' )
            // InternalMAL.g:3847:2: '('
            {
             before(grammarAccess.getVarlistAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMAL.g:3856:1: rule__Varlist__Group_1__1 : rule__Varlist__Group_1__1__Impl rule__Varlist__Group_1__2 ;
    public final void rule__Varlist__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3860:1: ( rule__Varlist__Group_1__1__Impl rule__Varlist__Group_1__2 )
            // InternalMAL.g:3861:2: rule__Varlist__Group_1__1__Impl rule__Varlist__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMAL.g:3868:1: rule__Varlist__Group_1__1__Impl : ( ( rule__Varlist__VariablesAssignment_1_1 ) ) ;
    public final void rule__Varlist__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3872:1: ( ( ( rule__Varlist__VariablesAssignment_1_1 ) ) )
            // InternalMAL.g:3873:1: ( ( rule__Varlist__VariablesAssignment_1_1 ) )
            {
            // InternalMAL.g:3873:1: ( ( rule__Varlist__VariablesAssignment_1_1 ) )
            // InternalMAL.g:3874:2: ( rule__Varlist__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getVarlistAccess().getVariablesAssignment_1_1()); 
            // InternalMAL.g:3875:2: ( rule__Varlist__VariablesAssignment_1_1 )
            // InternalMAL.g:3875:3: rule__Varlist__VariablesAssignment_1_1
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
    // InternalMAL.g:3883:1: rule__Varlist__Group_1__2 : rule__Varlist__Group_1__2__Impl rule__Varlist__Group_1__3 ;
    public final void rule__Varlist__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3887:1: ( rule__Varlist__Group_1__2__Impl rule__Varlist__Group_1__3 )
            // InternalMAL.g:3888:2: rule__Varlist__Group_1__2__Impl rule__Varlist__Group_1__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalMAL.g:3895:1: rule__Varlist__Group_1__2__Impl : ( ( rule__Varlist__Group_1_2__0 )* ) ;
    public final void rule__Varlist__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3899:1: ( ( ( rule__Varlist__Group_1_2__0 )* ) )
            // InternalMAL.g:3900:1: ( ( rule__Varlist__Group_1_2__0 )* )
            {
            // InternalMAL.g:3900:1: ( ( rule__Varlist__Group_1_2__0 )* )
            // InternalMAL.g:3901:2: ( rule__Varlist__Group_1_2__0 )*
            {
             before(grammarAccess.getVarlistAccess().getGroup_1_2()); 
            // InternalMAL.g:3902:2: ( rule__Varlist__Group_1_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==73) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMAL.g:3902:3: rule__Varlist__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Varlist__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalMAL.g:3910:1: rule__Varlist__Group_1__3 : rule__Varlist__Group_1__3__Impl ;
    public final void rule__Varlist__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3914:1: ( rule__Varlist__Group_1__3__Impl )
            // InternalMAL.g:3915:2: rule__Varlist__Group_1__3__Impl
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
    // InternalMAL.g:3921:1: rule__Varlist__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Varlist__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3925:1: ( ( ')' ) )
            // InternalMAL.g:3926:1: ( ')' )
            {
            // InternalMAL.g:3926:1: ( ')' )
            // InternalMAL.g:3927:2: ')'
            {
             before(grammarAccess.getVarlistAccess().getRightParenthesisKeyword_1_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMAL.g:3937:1: rule__Varlist__Group_1_2__0 : rule__Varlist__Group_1_2__0__Impl rule__Varlist__Group_1_2__1 ;
    public final void rule__Varlist__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3941:1: ( rule__Varlist__Group_1_2__0__Impl rule__Varlist__Group_1_2__1 )
            // InternalMAL.g:3942:2: rule__Varlist__Group_1_2__0__Impl rule__Varlist__Group_1_2__1
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
    // InternalMAL.g:3949:1: rule__Varlist__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Varlist__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3953:1: ( ( ',' ) )
            // InternalMAL.g:3954:1: ( ',' )
            {
            // InternalMAL.g:3954:1: ( ',' )
            // InternalMAL.g:3955:2: ','
            {
             before(grammarAccess.getVarlistAccess().getCommaKeyword_1_2_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMAL.g:3964:1: rule__Varlist__Group_1_2__1 : rule__Varlist__Group_1_2__1__Impl ;
    public final void rule__Varlist__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3968:1: ( rule__Varlist__Group_1_2__1__Impl )
            // InternalMAL.g:3969:2: rule__Varlist__Group_1_2__1__Impl
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
    // InternalMAL.g:3975:1: rule__Varlist__Group_1_2__1__Impl : ( ( rule__Varlist__VariablesAssignment_1_2_1 ) ) ;
    public final void rule__Varlist__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3979:1: ( ( ( rule__Varlist__VariablesAssignment_1_2_1 ) ) )
            // InternalMAL.g:3980:1: ( ( rule__Varlist__VariablesAssignment_1_2_1 ) )
            {
            // InternalMAL.g:3980:1: ( ( rule__Varlist__VariablesAssignment_1_2_1 ) )
            // InternalMAL.g:3981:2: ( rule__Varlist__VariablesAssignment_1_2_1 )
            {
             before(grammarAccess.getVarlistAccess().getVariablesAssignment_1_2_1()); 
            // InternalMAL.g:3982:2: ( rule__Varlist__VariablesAssignment_1_2_1 )
            // InternalMAL.g:3982:3: rule__Varlist__VariablesAssignment_1_2_1
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
    // InternalMAL.g:3991:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:3995:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // InternalMAL.g:3996:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMAL.g:4003:1: rule__Expr__Group_1__0__Impl : ( ( rule__Expr__Group_1_0__0 )? ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4007:1: ( ( ( rule__Expr__Group_1_0__0 )? ) )
            // InternalMAL.g:4008:1: ( ( rule__Expr__Group_1_0__0 )? )
            {
            // InternalMAL.g:4008:1: ( ( rule__Expr__Group_1_0__0 )? )
            // InternalMAL.g:4009:2: ( rule__Expr__Group_1_0__0 )?
            {
             before(grammarAccess.getExprAccess().getGroup_1_0()); 
            // InternalMAL.g:4010:2: ( rule__Expr__Group_1_0__0 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalMAL.g:4010:3: rule__Expr__Group_1_0__0
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
    // InternalMAL.g:4018:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4022:1: ( rule__Expr__Group_1__1__Impl )
            // InternalMAL.g:4023:2: rule__Expr__Group_1__1__Impl
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
    // InternalMAL.g:4029:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__Right_factorAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4033:1: ( ( ( rule__Expr__Right_factorAssignment_1_1 ) ) )
            // InternalMAL.g:4034:1: ( ( rule__Expr__Right_factorAssignment_1_1 ) )
            {
            // InternalMAL.g:4034:1: ( ( rule__Expr__Right_factorAssignment_1_1 ) )
            // InternalMAL.g:4035:2: ( rule__Expr__Right_factorAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getRight_factorAssignment_1_1()); 
            // InternalMAL.g:4036:2: ( rule__Expr__Right_factorAssignment_1_1 )
            // InternalMAL.g:4036:3: rule__Expr__Right_factorAssignment_1_1
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
    // InternalMAL.g:4045:1: rule__Expr__Group_1_0__0 : rule__Expr__Group_1_0__0__Impl rule__Expr__Group_1_0__1 ;
    public final void rule__Expr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4049:1: ( rule__Expr__Group_1_0__0__Impl rule__Expr__Group_1_0__1 )
            // InternalMAL.g:4050:2: rule__Expr__Group_1_0__0__Impl rule__Expr__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMAL.g:4057:1: rule__Expr__Group_1_0__0__Impl : ( ( rule__Expr__Left_factorAssignment_1_0_0 ) ) ;
    public final void rule__Expr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4061:1: ( ( ( rule__Expr__Left_factorAssignment_1_0_0 ) ) )
            // InternalMAL.g:4062:1: ( ( rule__Expr__Left_factorAssignment_1_0_0 ) )
            {
            // InternalMAL.g:4062:1: ( ( rule__Expr__Left_factorAssignment_1_0_0 ) )
            // InternalMAL.g:4063:2: ( rule__Expr__Left_factorAssignment_1_0_0 )
            {
             before(grammarAccess.getExprAccess().getLeft_factorAssignment_1_0_0()); 
            // InternalMAL.g:4064:2: ( rule__Expr__Left_factorAssignment_1_0_0 )
            // InternalMAL.g:4064:3: rule__Expr__Left_factorAssignment_1_0_0
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
    // InternalMAL.g:4072:1: rule__Expr__Group_1_0__1 : rule__Expr__Group_1_0__1__Impl ;
    public final void rule__Expr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4076:1: ( rule__Expr__Group_1_0__1__Impl )
            // InternalMAL.g:4077:2: rule__Expr__Group_1_0__1__Impl
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
    // InternalMAL.g:4083:1: rule__Expr__Group_1_0__1__Impl : ( ( rule__Expr__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Expr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4087:1: ( ( ( rule__Expr__OperatorAssignment_1_0_1 ) ) )
            // InternalMAL.g:4088:1: ( ( rule__Expr__OperatorAssignment_1_0_1 ) )
            {
            // InternalMAL.g:4088:1: ( ( rule__Expr__OperatorAssignment_1_0_1 ) )
            // InternalMAL.g:4089:2: ( rule__Expr__OperatorAssignment_1_0_1 )
            {
             before(grammarAccess.getExprAccess().getOperatorAssignment_1_0_1()); 
            // InternalMAL.g:4090:2: ( rule__Expr__OperatorAssignment_1_0_1 )
            // InternalMAL.g:4090:3: rule__Expr__OperatorAssignment_1_0_1
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
    // InternalMAL.g:4099:1: rule__Factor__Group_0__0 : rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 ;
    public final void rule__Factor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4103:1: ( rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 )
            // InternalMAL.g:4104:2: rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMAL.g:4111:1: rule__Factor__Group_0__0__Impl : ( () ) ;
    public final void rule__Factor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4115:1: ( ( () ) )
            // InternalMAL.g:4116:1: ( () )
            {
            // InternalMAL.g:4116:1: ( () )
            // InternalMAL.g:4117:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorAction_0_0()); 
            // InternalMAL.g:4118:2: ()
            // InternalMAL.g:4118:3: 
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
    // InternalMAL.g:4126:1: rule__Factor__Group_0__1 : rule__Factor__Group_0__1__Impl ;
    public final void rule__Factor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4130:1: ( rule__Factor__Group_0__1__Impl )
            // InternalMAL.g:4131:2: rule__Factor__Group_0__1__Impl
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
    // InternalMAL.g:4137:1: rule__Factor__Group_0__1__Impl : ( ruleLiteral_constant ) ;
    public final void rule__Factor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4141:1: ( ( ruleLiteral_constant ) )
            // InternalMAL.g:4142:1: ( ruleLiteral_constant )
            {
            // InternalMAL.g:4142:1: ( ruleLiteral_constant )
            // InternalMAL.g:4143:2: ruleLiteral_constant
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
    // InternalMAL.g:4153:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4157:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalMAL.g:4158:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMAL.g:4165:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4169:1: ( ( () ) )
            // InternalMAL.g:4170:1: ( () )
            {
            // InternalMAL.g:4170:1: ( () )
            // InternalMAL.g:4171:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorAction_1_0()); 
            // InternalMAL.g:4172:2: ()
            // InternalMAL.g:4172:3: 
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
    // InternalMAL.g:4180:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4184:1: ( rule__Factor__Group_1__1__Impl )
            // InternalMAL.g:4185:2: rule__Factor__Group_1__1__Impl
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
    // InternalMAL.g:4191:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__Alternatives_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4195:1: ( ( ( rule__Factor__Alternatives_1_1 ) ) )
            // InternalMAL.g:4196:1: ( ( rule__Factor__Alternatives_1_1 ) )
            {
            // InternalMAL.g:4196:1: ( ( rule__Factor__Alternatives_1_1 ) )
            // InternalMAL.g:4197:2: ( rule__Factor__Alternatives_1_1 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_1()); 
            // InternalMAL.g:4198:2: ( rule__Factor__Alternatives_1_1 )
            // InternalMAL.g:4198:3: rule__Factor__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives_1_1()); 

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
    // InternalMAL.g:4207:1: rule__Fcncall__Group__0 : rule__Fcncall__Group__0__Impl rule__Fcncall__Group__1 ;
    public final void rule__Fcncall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4211:1: ( rule__Fcncall__Group__0__Impl rule__Fcncall__Group__1 )
            // InternalMAL.g:4212:2: rule__Fcncall__Group__0__Impl rule__Fcncall__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMAL.g:4219:1: rule__Fcncall__Group__0__Impl : ( ( rule__Fcncall__ModuleAssignment_0 ) ) ;
    public final void rule__Fcncall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4223:1: ( ( ( rule__Fcncall__ModuleAssignment_0 ) ) )
            // InternalMAL.g:4224:1: ( ( rule__Fcncall__ModuleAssignment_0 ) )
            {
            // InternalMAL.g:4224:1: ( ( rule__Fcncall__ModuleAssignment_0 ) )
            // InternalMAL.g:4225:2: ( rule__Fcncall__ModuleAssignment_0 )
            {
             before(grammarAccess.getFcncallAccess().getModuleAssignment_0()); 
            // InternalMAL.g:4226:2: ( rule__Fcncall__ModuleAssignment_0 )
            // InternalMAL.g:4226:3: rule__Fcncall__ModuleAssignment_0
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
    // InternalMAL.g:4234:1: rule__Fcncall__Group__1 : rule__Fcncall__Group__1__Impl rule__Fcncall__Group__2 ;
    public final void rule__Fcncall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4238:1: ( rule__Fcncall__Group__1__Impl rule__Fcncall__Group__2 )
            // InternalMAL.g:4239:2: rule__Fcncall__Group__1__Impl rule__Fcncall__Group__2
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
    // InternalMAL.g:4246:1: rule__Fcncall__Group__1__Impl : ( '.' ) ;
    public final void rule__Fcncall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4250:1: ( ( '.' ) )
            // InternalMAL.g:4251:1: ( '.' )
            {
            // InternalMAL.g:4251:1: ( '.' )
            // InternalMAL.g:4252:2: '.'
            {
             before(grammarAccess.getFcncallAccess().getFullStopKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMAL.g:4261:1: rule__Fcncall__Group__2 : rule__Fcncall__Group__2__Impl rule__Fcncall__Group__3 ;
    public final void rule__Fcncall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4265:1: ( rule__Fcncall__Group__2__Impl rule__Fcncall__Group__3 )
            // InternalMAL.g:4266:2: rule__Fcncall__Group__2__Impl rule__Fcncall__Group__3
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
    // InternalMAL.g:4273:1: rule__Fcncall__Group__2__Impl : ( ( rule__Fcncall__Function_nameAssignment_2 ) ) ;
    public final void rule__Fcncall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4277:1: ( ( ( rule__Fcncall__Function_nameAssignment_2 ) ) )
            // InternalMAL.g:4278:1: ( ( rule__Fcncall__Function_nameAssignment_2 ) )
            {
            // InternalMAL.g:4278:1: ( ( rule__Fcncall__Function_nameAssignment_2 ) )
            // InternalMAL.g:4279:2: ( rule__Fcncall__Function_nameAssignment_2 )
            {
             before(grammarAccess.getFcncallAccess().getFunction_nameAssignment_2()); 
            // InternalMAL.g:4280:2: ( rule__Fcncall__Function_nameAssignment_2 )
            // InternalMAL.g:4280:3: rule__Fcncall__Function_nameAssignment_2
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
    // InternalMAL.g:4288:1: rule__Fcncall__Group__3 : rule__Fcncall__Group__3__Impl rule__Fcncall__Group__4 ;
    public final void rule__Fcncall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4292:1: ( rule__Fcncall__Group__3__Impl rule__Fcncall__Group__4 )
            // InternalMAL.g:4293:2: rule__Fcncall__Group__3__Impl rule__Fcncall__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalMAL.g:4300:1: rule__Fcncall__Group__3__Impl : ( '(' ) ;
    public final void rule__Fcncall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4304:1: ( ( '(' ) )
            // InternalMAL.g:4305:1: ( '(' )
            {
            // InternalMAL.g:4305:1: ( '(' )
            // InternalMAL.g:4306:2: '('
            {
             before(grammarAccess.getFcncallAccess().getLeftParenthesisKeyword_3()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMAL.g:4315:1: rule__Fcncall__Group__4 : rule__Fcncall__Group__4__Impl rule__Fcncall__Group__5 ;
    public final void rule__Fcncall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4319:1: ( rule__Fcncall__Group__4__Impl rule__Fcncall__Group__5 )
            // InternalMAL.g:4320:2: rule__Fcncall__Group__4__Impl rule__Fcncall__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalMAL.g:4327:1: rule__Fcncall__Group__4__Impl : ( ( rule__Fcncall__ArgsAssignment_4 )? ) ;
    public final void rule__Fcncall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4331:1: ( ( ( rule__Fcncall__ArgsAssignment_4 )? ) )
            // InternalMAL.g:4332:1: ( ( rule__Fcncall__ArgsAssignment_4 )? )
            {
            // InternalMAL.g:4332:1: ( ( rule__Fcncall__ArgsAssignment_4 )? )
            // InternalMAL.g:4333:2: ( rule__Fcncall__ArgsAssignment_4 )?
            {
             before(grammarAccess.getFcncallAccess().getArgsAssignment_4()); 
            // InternalMAL.g:4334:2: ( rule__Fcncall__ArgsAssignment_4 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_OID)||(LA56_0>=66 && LA56_0<=67)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMAL.g:4334:3: rule__Fcncall__ArgsAssignment_4
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
    // InternalMAL.g:4342:1: rule__Fcncall__Group__5 : rule__Fcncall__Group__5__Impl ;
    public final void rule__Fcncall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4346:1: ( rule__Fcncall__Group__5__Impl )
            // InternalMAL.g:4347:2: rule__Fcncall__Group__5__Impl
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
    // InternalMAL.g:4353:1: rule__Fcncall__Group__5__Impl : ( ')' ) ;
    public final void rule__Fcncall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4357:1: ( ( ')' ) )
            // InternalMAL.g:4358:1: ( ')' )
            {
            // InternalMAL.g:4358:1: ( ')' )
            // InternalMAL.g:4359:2: ')'
            {
             before(grammarAccess.getFcncallAccess().getRightParenthesisKeyword_5()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMAL.g:4369:1: rule__Args__Group__0 : rule__Args__Group__0__Impl rule__Args__Group__1 ;
    public final void rule__Args__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4373:1: ( rule__Args__Group__0__Impl rule__Args__Group__1 )
            // InternalMAL.g:4374:2: rule__Args__Group__0__Impl rule__Args__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMAL.g:4381:1: rule__Args__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Args__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4385:1: ( ( ruleFactor ) )
            // InternalMAL.g:4386:1: ( ruleFactor )
            {
            // InternalMAL.g:4386:1: ( ruleFactor )
            // InternalMAL.g:4387:2: ruleFactor
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
    // InternalMAL.g:4396:1: rule__Args__Group__1 : rule__Args__Group__1__Impl ;
    public final void rule__Args__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4400:1: ( rule__Args__Group__1__Impl )
            // InternalMAL.g:4401:2: rule__Args__Group__1__Impl
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
    // InternalMAL.g:4407:1: rule__Args__Group__1__Impl : ( ( rule__Args__Group_1__0 )* ) ;
    public final void rule__Args__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4411:1: ( ( ( rule__Args__Group_1__0 )* ) )
            // InternalMAL.g:4412:1: ( ( rule__Args__Group_1__0 )* )
            {
            // InternalMAL.g:4412:1: ( ( rule__Args__Group_1__0 )* )
            // InternalMAL.g:4413:2: ( rule__Args__Group_1__0 )*
            {
             before(grammarAccess.getArgsAccess().getGroup_1()); 
            // InternalMAL.g:4414:2: ( rule__Args__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==73) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMAL.g:4414:3: rule__Args__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Args__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalMAL.g:4423:1: rule__Args__Group_1__0 : rule__Args__Group_1__0__Impl rule__Args__Group_1__1 ;
    public final void rule__Args__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4427:1: ( rule__Args__Group_1__0__Impl rule__Args__Group_1__1 )
            // InternalMAL.g:4428:2: rule__Args__Group_1__0__Impl rule__Args__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMAL.g:4435:1: rule__Args__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Args__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4439:1: ( ( ',' ) )
            // InternalMAL.g:4440:1: ( ',' )
            {
            // InternalMAL.g:4440:1: ( ',' )
            // InternalMAL.g:4441:2: ','
            {
             before(grammarAccess.getArgsAccess().getCommaKeyword_1_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMAL.g:4450:1: rule__Args__Group_1__1 : rule__Args__Group_1__1__Impl ;
    public final void rule__Args__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4454:1: ( rule__Args__Group_1__1__Impl )
            // InternalMAL.g:4455:2: rule__Args__Group_1__1__Impl
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
    // InternalMAL.g:4461:1: rule__Args__Group_1__1__Impl : ( ( rule__Args__Factor1Assignment_1_1 ) ) ;
    public final void rule__Args__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4465:1: ( ( ( rule__Args__Factor1Assignment_1_1 ) ) )
            // InternalMAL.g:4466:1: ( ( rule__Args__Factor1Assignment_1_1 ) )
            {
            // InternalMAL.g:4466:1: ( ( rule__Args__Factor1Assignment_1_1 ) )
            // InternalMAL.g:4467:2: ( rule__Args__Factor1Assignment_1_1 )
            {
             before(grammarAccess.getArgsAccess().getFactor1Assignment_1_1()); 
            // InternalMAL.g:4468:2: ( rule__Args__Factor1Assignment_1_1 )
            // InternalMAL.g:4468:3: rule__Args__Factor1Assignment_1_1
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
    // InternalMAL.g:4477:1: rule__Bte__Group__0 : rule__Bte__Group__0__Impl rule__Bte__Group__1 ;
    public final void rule__Bte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4481:1: ( rule__Bte__Group__0__Impl rule__Bte__Group__1 )
            // InternalMAL.g:4482:2: rule__Bte__Group__0__Impl rule__Bte__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMAL.g:4489:1: rule__Bte__Group__0__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4493:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4494:1: ( RULE_BIT )
            {
            // InternalMAL.g:4494:1: ( RULE_BIT )
            // InternalMAL.g:4495:2: RULE_BIT
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
    // InternalMAL.g:4504:1: rule__Bte__Group__1 : rule__Bte__Group__1__Impl rule__Bte__Group__2 ;
    public final void rule__Bte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4508:1: ( rule__Bte__Group__1__Impl rule__Bte__Group__2 )
            // InternalMAL.g:4509:2: rule__Bte__Group__1__Impl rule__Bte__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMAL.g:4516:1: rule__Bte__Group__1__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4520:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4521:1: ( RULE_BIT )
            {
            // InternalMAL.g:4521:1: ( RULE_BIT )
            // InternalMAL.g:4522:2: RULE_BIT
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
    // InternalMAL.g:4531:1: rule__Bte__Group__2 : rule__Bte__Group__2__Impl rule__Bte__Group__3 ;
    public final void rule__Bte__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4535:1: ( rule__Bte__Group__2__Impl rule__Bte__Group__3 )
            // InternalMAL.g:4536:2: rule__Bte__Group__2__Impl rule__Bte__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMAL.g:4543:1: rule__Bte__Group__2__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4547:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4548:1: ( RULE_BIT )
            {
            // InternalMAL.g:4548:1: ( RULE_BIT )
            // InternalMAL.g:4549:2: RULE_BIT
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
    // InternalMAL.g:4558:1: rule__Bte__Group__3 : rule__Bte__Group__3__Impl rule__Bte__Group__4 ;
    public final void rule__Bte__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4562:1: ( rule__Bte__Group__3__Impl rule__Bte__Group__4 )
            // InternalMAL.g:4563:2: rule__Bte__Group__3__Impl rule__Bte__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMAL.g:4570:1: rule__Bte__Group__3__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4574:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4575:1: ( RULE_BIT )
            {
            // InternalMAL.g:4575:1: ( RULE_BIT )
            // InternalMAL.g:4576:2: RULE_BIT
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
    // InternalMAL.g:4585:1: rule__Bte__Group__4 : rule__Bte__Group__4__Impl rule__Bte__Group__5 ;
    public final void rule__Bte__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4589:1: ( rule__Bte__Group__4__Impl rule__Bte__Group__5 )
            // InternalMAL.g:4590:2: rule__Bte__Group__4__Impl rule__Bte__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalMAL.g:4597:1: rule__Bte__Group__4__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4601:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4602:1: ( RULE_BIT )
            {
            // InternalMAL.g:4602:1: ( RULE_BIT )
            // InternalMAL.g:4603:2: RULE_BIT
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
    // InternalMAL.g:4612:1: rule__Bte__Group__5 : rule__Bte__Group__5__Impl rule__Bte__Group__6 ;
    public final void rule__Bte__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4616:1: ( rule__Bte__Group__5__Impl rule__Bte__Group__6 )
            // InternalMAL.g:4617:2: rule__Bte__Group__5__Impl rule__Bte__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalMAL.g:4624:1: rule__Bte__Group__5__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4628:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4629:1: ( RULE_BIT )
            {
            // InternalMAL.g:4629:1: ( RULE_BIT )
            // InternalMAL.g:4630:2: RULE_BIT
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
    // InternalMAL.g:4639:1: rule__Bte__Group__6 : rule__Bte__Group__6__Impl rule__Bte__Group__7 ;
    public final void rule__Bte__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4643:1: ( rule__Bte__Group__6__Impl rule__Bte__Group__7 )
            // InternalMAL.g:4644:2: rule__Bte__Group__6__Impl rule__Bte__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalMAL.g:4651:1: rule__Bte__Group__6__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4655:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4656:1: ( RULE_BIT )
            {
            // InternalMAL.g:4656:1: ( RULE_BIT )
            // InternalMAL.g:4657:2: RULE_BIT
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
    // InternalMAL.g:4666:1: rule__Bte__Group__7 : rule__Bte__Group__7__Impl ;
    public final void rule__Bte__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4670:1: ( rule__Bte__Group__7__Impl )
            // InternalMAL.g:4671:2: rule__Bte__Group__7__Impl
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
    // InternalMAL.g:4677:1: rule__Bte__Group__7__Impl : ( RULE_BIT ) ;
    public final void rule__Bte__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4681:1: ( ( RULE_BIT ) )
            // InternalMAL.g:4682:1: ( RULE_BIT )
            {
            // InternalMAL.g:4682:1: ( RULE_BIT )
            // InternalMAL.g:4683:2: RULE_BIT
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
    // InternalMAL.g:4693:1: rule__FLT__Group__0 : rule__FLT__Group__0__Impl rule__FLT__Group__1 ;
    public final void rule__FLT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4697:1: ( rule__FLT__Group__0__Impl rule__FLT__Group__1 )
            // InternalMAL.g:4698:2: rule__FLT__Group__0__Impl rule__FLT__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMAL.g:4705:1: rule__FLT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4709:1: ( ( RULE_INT ) )
            // InternalMAL.g:4710:1: ( RULE_INT )
            {
            // InternalMAL.g:4710:1: ( RULE_INT )
            // InternalMAL.g:4711:2: RULE_INT
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
    // InternalMAL.g:4720:1: rule__FLT__Group__1 : rule__FLT__Group__1__Impl rule__FLT__Group__2 ;
    public final void rule__FLT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4724:1: ( rule__FLT__Group__1__Impl rule__FLT__Group__2 )
            // InternalMAL.g:4725:2: rule__FLT__Group__1__Impl rule__FLT__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMAL.g:4732:1: rule__FLT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4736:1: ( ( '.' ) )
            // InternalMAL.g:4737:1: ( '.' )
            {
            // InternalMAL.g:4737:1: ( '.' )
            // InternalMAL.g:4738:2: '.'
            {
             before(grammarAccess.getFLTAccess().getFullStopKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMAL.g:4747:1: rule__FLT__Group__2 : rule__FLT__Group__2__Impl ;
    public final void rule__FLT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4751:1: ( rule__FLT__Group__2__Impl )
            // InternalMAL.g:4752:2: rule__FLT__Group__2__Impl
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
    // InternalMAL.g:4758:1: rule__FLT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4762:1: ( ( RULE_INT ) )
            // InternalMAL.g:4763:1: ( RULE_INT )
            {
            // InternalMAL.g:4763:1: ( RULE_INT )
            // InternalMAL.g:4764:2: RULE_INT
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
    // InternalMAL.g:4774:1: rule__Program__ElementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__Program__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4778:1: ( ( ruleStatement ) )
            // InternalMAL.g:4779:2: ( ruleStatement )
            {
            // InternalMAL.g:4779:2: ( ruleStatement )
            // InternalMAL.g:4780:3: ruleStatement
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
    // InternalMAL.g:4789:1: rule__Statement__HelpAssignment_0_1 : ( ruleHelpinfo ) ;
    public final void rule__Statement__HelpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4793:1: ( ( ruleHelpinfo ) )
            // InternalMAL.g:4794:2: ( ruleHelpinfo )
            {
            // InternalMAL.g:4794:2: ( ruleHelpinfo )
            // InternalMAL.g:4795:3: ruleHelpinfo
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
    // InternalMAL.g:4804:1: rule__Statement__HelpAssignment_1_1 : ( ruleHelpinfo ) ;
    public final void rule__Statement__HelpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4808:1: ( ( ruleHelpinfo ) )
            // InternalMAL.g:4809:2: ( ruleHelpinfo )
            {
            // InternalMAL.g:4809:2: ( ruleHelpinfo )
            // InternalMAL.g:4810:3: ruleHelpinfo
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
    // InternalMAL.g:4819:1: rule__ModuleStmt__IdentAssignment_0_1 : ( RULE_WRD ) ;
    public final void rule__ModuleStmt__IdentAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4823:1: ( ( RULE_WRD ) )
            // InternalMAL.g:4824:2: ( RULE_WRD )
            {
            // InternalMAL.g:4824:2: ( RULE_WRD )
            // InternalMAL.g:4825:3: RULE_WRD
            {
             before(grammarAccess.getModuleStmtAccess().getIdentWRDTerminalRuleCall_0_1_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getIdentWRDTerminalRuleCall_0_1_0()); 

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
    // InternalMAL.g:4834:1: rule__ModuleStmt__IdentAssignment_1_1 : ( RULE_WRD ) ;
    public final void rule__ModuleStmt__IdentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4838:1: ( ( RULE_WRD ) )
            // InternalMAL.g:4839:2: ( RULE_WRD )
            {
            // InternalMAL.g:4839:2: ( RULE_WRD )
            // InternalMAL.g:4840:3: RULE_WRD
            {
             before(grammarAccess.getModuleStmtAccess().getIdentWRDTerminalRuleCall_1_1_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getIdentWRDTerminalRuleCall_1_1_0()); 

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
    // InternalMAL.g:4849:1: rule__ModuleStmt__Second_identAssignment_1_2_1 : ( RULE_WRD ) ;
    public final void rule__ModuleStmt__Second_identAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4853:1: ( ( RULE_WRD ) )
            // InternalMAL.g:4854:2: ( RULE_WRD )
            {
            // InternalMAL.g:4854:2: ( RULE_WRD )
            // InternalMAL.g:4855:3: RULE_WRD
            {
             before(grammarAccess.getModuleStmtAccess().getSecond_identWRDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getModuleStmtAccess().getSecond_identWRDTerminalRuleCall_1_2_1_0()); 

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
    // InternalMAL.g:4864:1: rule__IncludeStmt__IdentifierAssignment_0_1 : ( RULE_WRD ) ;
    public final void rule__IncludeStmt__IdentifierAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4868:1: ( ( RULE_WRD ) )
            // InternalMAL.g:4869:2: ( RULE_WRD )
            {
            // InternalMAL.g:4869:2: ( RULE_WRD )
            // InternalMAL.g:4870:3: RULE_WRD
            {
             before(grammarAccess.getIncludeStmtAccess().getIdentifierWRDTerminalRuleCall_0_1_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getIncludeStmtAccess().getIdentifierWRDTerminalRuleCall_0_1_0()); 

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
    // InternalMAL.g:4879:1: rule__IncludeStmt__String_literalAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__IncludeStmt__String_literalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4883:1: ( ( RULE_STRING ) )
            // InternalMAL.g:4884:2: ( RULE_STRING )
            {
            // InternalMAL.g:4884:2: ( RULE_STRING )
            // InternalMAL.g:4885:3: RULE_STRING
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
    // InternalMAL.g:4894:1: rule__Definition__HeaderAssignment_0_2 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4898:1: ( ( ruleHeader ) )
            // InternalMAL.g:4899:2: ( ruleHeader )
            {
            // InternalMAL.g:4899:2: ( ruleHeader )
            // InternalMAL.g:4900:3: ruleHeader
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
    // InternalMAL.g:4909:1: rule__Definition__IdentifierAssignment_0_4 : ( RULE_WRD ) ;
    public final void rule__Definition__IdentifierAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4913:1: ( ( RULE_WRD ) )
            // InternalMAL.g:4914:2: ( RULE_WRD )
            {
            // InternalMAL.g:4914:2: ( RULE_WRD )
            // InternalMAL.g:4915:3: RULE_WRD
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierWRDTerminalRuleCall_0_4_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getIdentifierWRDTerminalRuleCall_0_4_0()); 

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
    // InternalMAL.g:4924:1: rule__Definition__HeaderAssignment_1_2 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4928:1: ( ( ruleHeader ) )
            // InternalMAL.g:4929:2: ( ruleHeader )
            {
            // InternalMAL.g:4929:2: ( ruleHeader )
            // InternalMAL.g:4930:3: ruleHeader
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
    // InternalMAL.g:4939:1: rule__Definition__IdentifierAssignment_1_4 : ( RULE_WRD ) ;
    public final void rule__Definition__IdentifierAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4943:1: ( ( RULE_WRD ) )
            // InternalMAL.g:4944:2: ( RULE_WRD )
            {
            // InternalMAL.g:4944:2: ( RULE_WRD )
            // InternalMAL.g:4945:3: RULE_WRD
            {
             before(grammarAccess.getDefinitionAccess().getIdentifierWRDTerminalRuleCall_1_4_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getIdentifierWRDTerminalRuleCall_1_4_0()); 

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
    // InternalMAL.g:4954:1: rule__Definition__HeaderAssignment_2_2 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4958:1: ( ( ruleHeader ) )
            // InternalMAL.g:4959:2: ( ruleHeader )
            {
            // InternalMAL.g:4959:2: ( ruleHeader )
            // InternalMAL.g:4960:3: ruleHeader
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
    // InternalMAL.g:4969:1: rule__Definition__StatementsAssignment_2_3 : ( ruleStatement ) ;
    public final void rule__Definition__StatementsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4973:1: ( ( ruleStatement ) )
            // InternalMAL.g:4974:2: ( ruleStatement )
            {
            // InternalMAL.g:4974:2: ( ruleStatement )
            // InternalMAL.g:4975:3: ruleStatement
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
    // InternalMAL.g:4984:1: rule__Definition__Function_nameAssignment_2_5 : ( ruleName ) ;
    public final void rule__Definition__Function_nameAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:4988:1: ( ( ruleName ) )
            // InternalMAL.g:4989:2: ( ruleName )
            {
            // InternalMAL.g:4989:2: ( ruleName )
            // InternalMAL.g:4990:3: ruleName
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
    // InternalMAL.g:4999:1: rule__Definition__HeaderAssignment_3_1 : ( ruleHeader ) ;
    public final void rule__Definition__HeaderAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5003:1: ( ( ruleHeader ) )
            // InternalMAL.g:5004:2: ( ruleHeader )
            {
            // InternalMAL.g:5004:2: ( ruleHeader )
            // InternalMAL.g:5005:3: ruleHeader
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
    // InternalMAL.g:5014:1: rule__Definition__StatementsAssignment_3_2 : ( ruleStatement ) ;
    public final void rule__Definition__StatementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5018:1: ( ( ruleStatement ) )
            // InternalMAL.g:5019:2: ( ruleStatement )
            {
            // InternalMAL.g:5019:2: ( ruleStatement )
            // InternalMAL.g:5020:3: ruleStatement
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
    // InternalMAL.g:5029:1: rule__Definition__Factory_nameAssignment_3_4 : ( ruleName ) ;
    public final void rule__Definition__Factory_nameAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5033:1: ( ( ruleName ) )
            // InternalMAL.g:5034:2: ( ruleName )
            {
            // InternalMAL.g:5034:2: ( ruleName )
            // InternalMAL.g:5035:3: ruleName
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
    // InternalMAL.g:5044:1: rule__Helpinfo__String_literalAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Helpinfo__String_literalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5048:1: ( ( RULE_STRING ) )
            // InternalMAL.g:5049:2: ( RULE_STRING )
            {
            // InternalMAL.g:5049:2: ( RULE_STRING )
            // InternalMAL.g:5050:3: RULE_STRING
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
    // InternalMAL.g:5059:1: rule__Header__Header_nameAssignment_0 : ( ruleName ) ;
    public final void rule__Header__Header_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5063:1: ( ( ruleName ) )
            // InternalMAL.g:5064:2: ( ruleName )
            {
            // InternalMAL.g:5064:2: ( ruleName )
            // InternalMAL.g:5065:3: ruleName
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
    // InternalMAL.g:5074:1: rule__Header__ParamsAssignment_2 : ( ruleParams ) ;
    public final void rule__Header__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5078:1: ( ( ruleParams ) )
            // InternalMAL.g:5079:2: ( ruleParams )
            {
            // InternalMAL.g:5079:2: ( ruleParams )
            // InternalMAL.g:5080:3: ruleParams
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
    // InternalMAL.g:5089:1: rule__Header__Return_typeAssignment_4 : ( ruleResult ) ;
    public final void rule__Header__Return_typeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5093:1: ( ( ruleResult ) )
            // InternalMAL.g:5094:2: ( ruleResult )
            {
            // InternalMAL.g:5094:2: ( ruleResult )
            // InternalMAL.g:5095:3: ruleResult
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


    // $ANTLR start "rule__Name__IdAssignment_1"
    // InternalMAL.g:5104:1: rule__Name__IdAssignment_1 : ( RULE_WRD ) ;
    public final void rule__Name__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5108:1: ( ( RULE_WRD ) )
            // InternalMAL.g:5109:2: ( RULE_WRD )
            {
            // InternalMAL.g:5109:2: ( RULE_WRD )
            // InternalMAL.g:5110:3: RULE_WRD
            {
             before(grammarAccess.getNameAccess().getIdWRDTerminalRuleCall_1_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIdWRDTerminalRuleCall_1_0()); 

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
    // InternalMAL.g:5119:1: rule__Params__BindAssignment_0 : ( ruleBinding ) ;
    public final void rule__Params__BindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5123:1: ( ( ruleBinding ) )
            // InternalMAL.g:5124:2: ( ruleBinding )
            {
            // InternalMAL.g:5124:2: ( ruleBinding )
            // InternalMAL.g:5125:3: ruleBinding
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
    // InternalMAL.g:5134:1: rule__Params__BindAssignment_1_1 : ( ruleBinding ) ;
    public final void rule__Params__BindAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5138:1: ( ( ruleBinding ) )
            // InternalMAL.g:5139:2: ( ruleBinding )
            {
            // InternalMAL.g:5139:2: ( ruleBinding )
            // InternalMAL.g:5140:3: ruleBinding
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
    // InternalMAL.g:5149:1: rule__Binding__IdentifierAssignment_0 : ( RULE_WRD ) ;
    public final void rule__Binding__IdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5153:1: ( ( RULE_WRD ) )
            // InternalMAL.g:5154:2: ( RULE_WRD )
            {
            // InternalMAL.g:5154:2: ( RULE_WRD )
            // InternalMAL.g:5155:3: RULE_WRD
            {
             before(grammarAccess.getBindingAccess().getIdentifierWRDTerminalRuleCall_0_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getIdentifierWRDTerminalRuleCall_0_0()); 

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
    // InternalMAL.g:5164:1: rule__Binding__TypeAssignment_1 : ( ruleTypeName ) ;
    public final void rule__Binding__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5168:1: ( ( ruleTypeName ) )
            // InternalMAL.g:5169:2: ( ruleTypeName )
            {
            // InternalMAL.g:5169:2: ( ruleTypeName )
            // InternalMAL.g:5170:3: ruleTypeName
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
    // InternalMAL.g:5179:1: rule__ScalarType__IdentifierAssignment_1 : ( RULE_WRD ) ;
    public final void rule__ScalarType__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5183:1: ( ( RULE_WRD ) )
            // InternalMAL.g:5184:2: ( RULE_WRD )
            {
            // InternalMAL.g:5184:2: ( RULE_WRD )
            // InternalMAL.g:5185:3: RULE_WRD
            {
             before(grammarAccess.getScalarTypeAccess().getIdentifierWRDTerminalRuleCall_1_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getScalarTypeAccess().getIdentifierWRDTerminalRuleCall_1_0()); 

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


    // $ANTLR start "rule__AnyType__TypeAssignment_1"
    // InternalMAL.g:5194:1: rule__AnyType__TypeAssignment_1 : ( ( 'any' ) ) ;
    public final void rule__AnyType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5198:1: ( ( ( 'any' ) ) )
            // InternalMAL.g:5199:2: ( ( 'any' ) )
            {
            // InternalMAL.g:5199:2: ( ( 'any' ) )
            // InternalMAL.g:5200:3: ( 'any' )
            {
             before(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_1_0()); 
            // InternalMAL.g:5201:3: ( 'any' )
            // InternalMAL.g:5202:4: 'any'
            {
             before(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_1_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_1_0()); 

            }

             after(grammarAccess.getAnyTypeAccess().getTypeAnyKeyword_1_0()); 

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
    // $ANTLR end "rule__AnyType__TypeAssignment_1"


    // $ANTLR start "rule__AnyType__DigitAssignment_2_1"
    // InternalMAL.g:5213:1: rule__AnyType__DigitAssignment_2_1 : ( RULE_OID ) ;
    public final void rule__AnyType__DigitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5217:1: ( ( RULE_OID ) )
            // InternalMAL.g:5218:2: ( RULE_OID )
            {
            // InternalMAL.g:5218:2: ( RULE_OID )
            // InternalMAL.g:5219:3: RULE_OID
            {
             before(grammarAccess.getAnyTypeAccess().getDigitOIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_OID,FOLLOW_2); 
             after(grammarAccess.getAnyTypeAccess().getDigitOIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AnyType__DigitAssignment_2_1"


    // $ANTLR start "rule__Stmt__FlowAssignment_0"
    // InternalMAL.g:5228:1: rule__Stmt__FlowAssignment_0 : ( ruleFlow ) ;
    public final void rule__Stmt__FlowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5232:1: ( ( ruleFlow ) )
            // InternalMAL.g:5233:2: ( ruleFlow )
            {
            // InternalMAL.g:5233:2: ( ruleFlow )
            // InternalMAL.g:5234:3: ruleFlow
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
    // InternalMAL.g:5243:1: rule__Stmt__List_of_variablesAssignment_1 : ( ruleVarlist ) ;
    public final void rule__Stmt__List_of_variablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5247:1: ( ( ruleVarlist ) )
            // InternalMAL.g:5248:2: ( ruleVarlist )
            {
            // InternalMAL.g:5248:2: ( ruleVarlist )
            // InternalMAL.g:5249:3: ruleVarlist
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
    // InternalMAL.g:5258:1: rule__Stmt__ExpAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Stmt__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5262:1: ( ( ruleExpr ) )
            // InternalMAL.g:5263:2: ( ruleExpr )
            {
            // InternalMAL.g:5263:2: ( ruleExpr )
            // InternalMAL.g:5264:3: ruleExpr
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
    // InternalMAL.g:5273:1: rule__Varlist__VariablesAssignment_0 : ( ruleVariable ) ;
    public final void rule__Varlist__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5277:1: ( ( ruleVariable ) )
            // InternalMAL.g:5278:2: ( ruleVariable )
            {
            // InternalMAL.g:5278:2: ( ruleVariable )
            // InternalMAL.g:5279:3: ruleVariable
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
    // InternalMAL.g:5288:1: rule__Varlist__VariablesAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__Varlist__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5292:1: ( ( ruleVariable ) )
            // InternalMAL.g:5293:2: ( ruleVariable )
            {
            // InternalMAL.g:5293:2: ( ruleVariable )
            // InternalMAL.g:5294:3: ruleVariable
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
    // InternalMAL.g:5303:1: rule__Varlist__VariablesAssignment_1_2_1 : ( ruleVariable ) ;
    public final void rule__Varlist__VariablesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5307:1: ( ( ruleVariable ) )
            // InternalMAL.g:5308:2: ( ruleVariable )
            {
            // InternalMAL.g:5308:2: ( ruleVariable )
            // InternalMAL.g:5309:3: ruleVariable
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
    // InternalMAL.g:5318:1: rule__Variable__IdentifierAssignment : ( RULE_WRD ) ;
    public final void rule__Variable__IdentifierAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5322:1: ( ( RULE_WRD ) )
            // InternalMAL.g:5323:2: ( RULE_WRD )
            {
            // InternalMAL.g:5323:2: ( RULE_WRD )
            // InternalMAL.g:5324:3: RULE_WRD
            {
             before(grammarAccess.getVariableAccess().getIdentifierWRDTerminalRuleCall_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getIdentifierWRDTerminalRuleCall_0()); 

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
    // InternalMAL.g:5333:1: rule__Expr__Left_factorAssignment_1_0_0 : ( ruleFactor ) ;
    public final void rule__Expr__Left_factorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5337:1: ( ( ruleFactor ) )
            // InternalMAL.g:5338:2: ( ruleFactor )
            {
            // InternalMAL.g:5338:2: ( ruleFactor )
            // InternalMAL.g:5339:3: ruleFactor
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
    // InternalMAL.g:5348:1: rule__Expr__OperatorAssignment_1_0_1 : ( ruleOperator ) ;
    public final void rule__Expr__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5352:1: ( ( ruleOperator ) )
            // InternalMAL.g:5353:2: ( ruleOperator )
            {
            // InternalMAL.g:5353:2: ( ruleOperator )
            // InternalMAL.g:5354:3: ruleOperator
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
    // InternalMAL.g:5363:1: rule__Expr__Right_factorAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Expr__Right_factorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5367:1: ( ( ruleFactor ) )
            // InternalMAL.g:5368:2: ( ruleFactor )
            {
            // InternalMAL.g:5368:2: ( ruleFactor )
            // InternalMAL.g:5369:3: ruleFactor
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
    // InternalMAL.g:5378:1: rule__Fcncall__ModuleAssignment_0 : ( ruleModuleName ) ;
    public final void rule__Fcncall__ModuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5382:1: ( ( ruleModuleName ) )
            // InternalMAL.g:5383:2: ( ruleModuleName )
            {
            // InternalMAL.g:5383:2: ( ruleModuleName )
            // InternalMAL.g:5384:3: ruleModuleName
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
    // InternalMAL.g:5393:1: rule__Fcncall__Function_nameAssignment_2 : ( ruleName ) ;
    public final void rule__Fcncall__Function_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5397:1: ( ( ruleName ) )
            // InternalMAL.g:5398:2: ( ruleName )
            {
            // InternalMAL.g:5398:2: ( ruleName )
            // InternalMAL.g:5399:3: ruleName
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
    // InternalMAL.g:5408:1: rule__Fcncall__ArgsAssignment_4 : ( ruleArgs ) ;
    public final void rule__Fcncall__ArgsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5412:1: ( ( ruleArgs ) )
            // InternalMAL.g:5413:2: ( ruleArgs )
            {
            // InternalMAL.g:5413:2: ( ruleArgs )
            // InternalMAL.g:5414:3: ruleArgs
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
    // InternalMAL.g:5423:1: rule__Args__Factor1Assignment_1_1 : ( ruleFactor ) ;
    public final void rule__Args__Factor1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5427:1: ( ( ruleFactor ) )
            // InternalMAL.g:5428:2: ( ruleFactor )
            {
            // InternalMAL.g:5428:2: ( ruleFactor )
            // InternalMAL.g:5429:3: ruleFactor
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
    // InternalMAL.g:5438:1: rule__ModuleName__IdentifierAssignment : ( RULE_WRD ) ;
    public final void rule__ModuleName__IdentifierAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMAL.g:5442:1: ( ( RULE_WRD ) )
            // InternalMAL.g:5443:2: ( RULE_WRD )
            {
            // InternalMAL.g:5443:2: ( RULE_WRD )
            // InternalMAL.g:5444:3: RULE_WRD
            {
             before(grammarAccess.getModuleNameAccess().getIdentifierWRDTerminalRuleCall_0()); 
            match(input,RULE_WRD,FOLLOW_2); 
             after(grammarAccess.getModuleNameAccess().getIdentifierWRDTerminalRuleCall_0()); 

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


    protected DFA40 dfa40 = new DFA40(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\10\2\uffff\1\11\6\uffff";
    static final String dfa_3s = "\1\4\1\5\2\uffff\1\7\6\uffff";
    static final String dfa_4s = "\1\11\1\111\2\uffff\1\111\6\uffff";
    static final String dfa_5s = "\2\uffff\1\3\1\4\1\uffff\1\6\1\10\1\2\1\1\1\5\1\7";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\uffff\1\10\7\uffff\12\10\2\uffff\12\10\4\uffff\31\10\2\uffff\1\10\1\uffff\2\10\1\uffff\1\10",
            "",
            "",
            "\1\11\7\uffff\12\11\2\uffff\12\11\4\uffff\31\11\2\uffff\1\11\1\uffff\2\11\1\12\1\11",
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

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1720:1: rule__Literal_constant__Alternatives : ( ( RULE_BIT ) | ( ruleBte ) | ( RULE_CHR ) | ( RULE_WRD ) | ( RULE_INT ) | ( RULE_OID ) | ( ruleFLT ) | ( ruleSTR ) );";
        }
    }
    static final String dfa_8s = "\24\uffff";
    static final String dfa_9s = "\1\uffff\10\13\5\uffff\1\13\4\uffff\1\13";
    static final String dfa_10s = "\1\4\1\5\7\7\1\5\2\uffff\1\10\1\5\1\7\4\5\1\7";
    static final String dfa_11s = "\1\103\3\106\1\110\4\106\1\5\2\uffff\1\10\1\5\1\106\4\5\1\106";
    static final String dfa_12s = "\12\uffff\1\1\1\2\10\uffff";
    static final String dfa_13s = "\24\uffff}>";
    static final String[] dfa_14s = {
            "\1\6\1\1\1\2\1\3\1\4\1\5\70\uffff\1\7\1\10",
            "\1\11\1\uffff\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13\1\uffff\1\14",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\13\7\uffff\12\13\2\uffff\12\13\4\uffff\14\13\15\12\2\uffff\1\13\1\uffff\1\13"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "4010:2: ( rule__Expr__Group_1_0__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x001FFE19F9FF8082L,0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000018600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001E0600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x001FFE1FF9FF8080L,0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x001FFE19F9FF8080L,0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000003F0L,0x000000000000000CL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000003F0L,0x000000000000008CL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000100L});

}