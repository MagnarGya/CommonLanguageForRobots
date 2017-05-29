package org.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.CommonlangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCommonlangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_LOWERFIRST", "RULE_CAPITALFIRST", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'!&&'", "'!||'", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'true'", "'false'", "'void'", "'int'", "'string'", "'boolean'", "'script'", "'targets'", "'('", "','", "')'", "'{'", "'}'", "'metamethodscollection'", "';'", "'='", "'meta'", "'if'", "'else'", "'for'", "'while'", "'return'"
    };
    public static final int T__50=50;
    public static final int RULE_LOWERFIRST=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_CAPITALFIRST=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalCommonlangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCommonlangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCommonlangParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g"; }


     
     	private CommonlangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CommonlangGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCLfile"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:61:1: entryRuleCLfile : ruleCLfile EOF ;
    public final void entryRuleCLfile() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:62:1: ( ruleCLfile EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:63:1: ruleCLfile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileRule()); 
            }
            pushFollow(FOLLOW_ruleCLfile_in_entryRuleCLfile67);
            ruleCLfile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLfile74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCLfile"


    // $ANTLR start "ruleCLfile"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:70:1: ruleCLfile : ( ( rule__CLfile__Group__0 ) ) ;
    public final void ruleCLfile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:74:2: ( ( ( rule__CLfile__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:75:1: ( ( rule__CLfile__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:75:1: ( ( rule__CLfile__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:76:1: ( rule__CLfile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:77:1: ( rule__CLfile__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:77:2: rule__CLfile__Group__0
            {
            pushFollow(FOLLOW_rule__CLfile__Group__0_in_ruleCLfile100);
            rule__CLfile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCLfile"


    // $ANTLR start "entryRuleScript"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:89:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:90:1: ( ruleScript EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:91:1: ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript127);
            ruleScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:98:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:102:2: ( ( ( rule__Script__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:103:1: ( ( rule__Script__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:103:1: ( ( rule__Script__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:104:1: ( rule__Script__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:105:1: ( rule__Script__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:105:2: rule__Script__Group__0
            {
            pushFollow(FOLLOW_rule__Script__Group__0_in_ruleScript160);
            rule__Script__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleMetaMethods"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:117:1: entryRuleMetaMethods : ruleMetaMethods EOF ;
    public final void entryRuleMetaMethods() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:118:1: ( ruleMetaMethods EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:119:1: ruleMetaMethods EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods187);
            ruleMetaMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethods194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMetaMethods"


    // $ANTLR start "ruleMetaMethods"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:126:1: ruleMetaMethods : ( ( rule__MetaMethods__Group__0 ) ) ;
    public final void ruleMetaMethods() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:130:2: ( ( ( rule__MetaMethods__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:131:1: ( ( rule__MetaMethods__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:131:1: ( ( rule__MetaMethods__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:132:1: ( rule__MetaMethods__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:133:1: ( rule__MetaMethods__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:133:2: rule__MetaMethods__Group__0
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__0_in_ruleMetaMethods220);
            rule__MetaMethods__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaMethods"


    // $ANTLR start "entryRuleBlock"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:145:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:146:1: ( ruleBlock EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:147:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock247);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:154:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:158:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:159:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:159:1: ( ( rule__Block__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:160:1: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:161:1: ( rule__Block__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:161:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock280);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleSimpleExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:173:1: entryRuleSimpleExpression : ruleSimpleExpression EOF ;
    public final void entryRuleSimpleExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:174:1: ( ruleSimpleExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:175:1: ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression307);
            ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:182:1: ruleSimpleExpression : ( ( rule__SimpleExpression__Alternatives ) ) ;
    public final void ruleSimpleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:186:2: ( ( ( rule__SimpleExpression__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:187:1: ( ( rule__SimpleExpression__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:187:1: ( ( rule__SimpleExpression__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:188:1: ( rule__SimpleExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:189:1: ( rule__SimpleExpression__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:189:2: rule__SimpleExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression340);
            rule__SimpleExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleStructureExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:201:1: entryRuleStructureExpression : ruleStructureExpression EOF ;
    public final void entryRuleStructureExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:202:1: ( ruleStructureExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:203:1: ruleStructureExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression367);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStructureExpression"


    // $ANTLR start "ruleStructureExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:210:1: ruleStructureExpression : ( ( rule__StructureExpression__Alternatives ) ) ;
    public final void ruleStructureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:214:2: ( ( ( rule__StructureExpression__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:215:1: ( ( rule__StructureExpression__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:215:1: ( ( rule__StructureExpression__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:216:1: ( rule__StructureExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureExpressionAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:217:1: ( rule__StructureExpression__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:217:2: rule__StructureExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__StructureExpression__Alternatives_in_ruleStructureExpression400);
            rule__StructureExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructureExpression"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:229:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:230:1: ( ruleExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:231:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression427);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:238:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:242:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:243:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:243:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:244:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:245:1: ( rule__Expression__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:245:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression460);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:257:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:258:1: ( ruleAssignment EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:259:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment487);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:266:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:270:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:271:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:271:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:272:1: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:273:1: ( rule__Assignment__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:273:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment520);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleCall"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:285:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:286:1: ( ruleCall EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:287:1: ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall547);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:294:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:298:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:299:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:299:1: ( ( rule__Call__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:300:1: ( rule__Call__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:301:1: ( rule__Call__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:301:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall580);
            rule__Call__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleMetaMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:315:1: entryRuleMetaMethod : ruleMetaMethod EOF ;
    public final void entryRuleMetaMethod() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:316:1: ( ruleMetaMethod EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:317:1: ruleMetaMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod609);
            ruleMetaMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethod616); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMetaMethod"


    // $ANTLR start "ruleMetaMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:324:1: ruleMetaMethod : ( ( rule__MetaMethod__Group__0 ) ) ;
    public final void ruleMetaMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:328:2: ( ( ( rule__MetaMethod__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:329:1: ( ( rule__MetaMethod__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:329:1: ( ( rule__MetaMethod__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:330:1: ( rule__MetaMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:331:1: ( rule__MetaMethod__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:331:2: rule__MetaMethod__Group__0
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__0_in_ruleMetaMethod642);
            rule__MetaMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaMethod"


    // $ANTLR start "entryRuleUserMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:343:1: entryRuleUserMethod : ruleUserMethod EOF ;
    public final void entryRuleUserMethod() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:344:1: ( ruleUserMethod EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:345:1: ruleUserMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodRule()); 
            }
            pushFollow(FOLLOW_ruleUserMethod_in_entryRuleUserMethod669);
            ruleUserMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethod676); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUserMethod"


    // $ANTLR start "ruleUserMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:352:1: ruleUserMethod : ( ( rule__UserMethod__Group__0 ) ) ;
    public final void ruleUserMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:356:2: ( ( ( rule__UserMethod__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:357:1: ( ( rule__UserMethod__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:357:1: ( ( rule__UserMethod__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:358:1: ( rule__UserMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:359:1: ( rule__UserMethod__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:359:2: rule__UserMethod__Group__0
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__0_in_ruleUserMethod702);
            rule__UserMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserMethod"


    // $ANTLR start "entryRuleUserMethodCall"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:371:1: entryRuleUserMethodCall : ruleUserMethodCall EOF ;
    public final void entryRuleUserMethodCall() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:372:1: ( ruleUserMethodCall EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:373:1: ruleUserMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall729);
            ruleUserMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethodCall736); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUserMethodCall"


    // $ANTLR start "ruleUserMethodCall"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:380:1: ruleUserMethodCall : ( ( rule__UserMethodCall__MethodAssignment ) ) ;
    public final void ruleUserMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:384:2: ( ( ( rule__UserMethodCall__MethodAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:385:1: ( ( rule__UserMethodCall__MethodAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:385:1: ( ( rule__UserMethodCall__MethodAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:386:1: ( rule__UserMethodCall__MethodAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallAccess().getMethodAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:387:1: ( rule__UserMethodCall__MethodAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:387:2: rule__UserMethodCall__MethodAssignment
            {
            pushFollow(FOLLOW_rule__UserMethodCall__MethodAssignment_in_ruleUserMethodCall762);
            rule__UserMethodCall__MethodAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodCallAccess().getMethodAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserMethodCall"


    // $ANTLR start "entryRuleMetaMethodCall"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:399:1: entryRuleMetaMethodCall : ruleMetaMethodCall EOF ;
    public final void entryRuleMetaMethodCall() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:400:1: ( ruleMetaMethodCall EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:401:1: ruleMetaMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall789);
            ruleMetaMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethodCall796); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMetaMethodCall"


    // $ANTLR start "ruleMetaMethodCall"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:408:1: ruleMetaMethodCall : ( ( rule__MetaMethodCall__MethodAssignment ) ) ;
    public final void ruleMetaMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:412:2: ( ( ( rule__MetaMethodCall__MethodAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:413:1: ( ( rule__MetaMethodCall__MethodAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:413:1: ( ( rule__MetaMethodCall__MethodAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:414:1: ( rule__MetaMethodCall__MethodAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallAccess().getMethodAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:415:1: ( rule__MetaMethodCall__MethodAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:415:2: rule__MetaMethodCall__MethodAssignment
            {
            pushFollow(FOLLOW_rule__MetaMethodCall__MethodAssignment_in_ruleMetaMethodCall822);
            rule__MetaMethodCall__MethodAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodCallAccess().getMethodAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaMethodCall"


    // $ANTLR start "entryRuleValueExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:427:1: entryRuleValueExpression : ruleValueExpression EOF ;
    public final void entryRuleValueExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:428:1: ( ruleValueExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:429:1: ruleValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression849);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression856); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValueExpression"


    // $ANTLR start "ruleValueExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:436:1: ruleValueExpression : ( ( rule__ValueExpression__Alternatives ) ) ;
    public final void ruleValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:440:2: ( ( ( rule__ValueExpression__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:441:1: ( ( rule__ValueExpression__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:441:1: ( ( rule__ValueExpression__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:442:1: ( rule__ValueExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueExpressionAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:443:1: ( rule__ValueExpression__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:443:2: rule__ValueExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueExpression__Alternatives_in_ruleValueExpression882);
            rule__ValueExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueExpression"


    // $ANTLR start "entryRuleParanValueExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:455:1: entryRuleParanValueExpression : ruleParanValueExpression EOF ;
    public final void entryRuleParanValueExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:456:1: ( ruleParanValueExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:457:1: ruleParanValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanValueExpression_in_entryRuleParanValueExpression909);
            ruleParanValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanValueExpression916); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParanValueExpression"


    // $ANTLR start "ruleParanValueExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:464:1: ruleParanValueExpression : ( ( rule__ParanValueExpression__Group__0 ) ) ;
    public final void ruleParanValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:468:2: ( ( ( rule__ParanValueExpression__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:469:1: ( ( rule__ParanValueExpression__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:469:1: ( ( rule__ParanValueExpression__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:470:1: ( rule__ParanValueExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:471:1: ( rule__ParanValueExpression__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:471:2: rule__ParanValueExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__0_in_ruleParanValueExpression942);
            rule__ParanValueExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParanValueExpression"


    // $ANTLR start "entryRuleBasicValueExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:483:1: entryRuleBasicValueExpression : ruleBasicValueExpression EOF ;
    public final void entryRuleBasicValueExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:484:1: ( ruleBasicValueExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:485:1: ruleBasicValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBasicValueExpression_in_entryRuleBasicValueExpression969);
            ruleBasicValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValueExpression976); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicValueExpression"


    // $ANTLR start "ruleBasicValueExpression"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:492:1: ruleBasicValueExpression : ( ( rule__BasicValueExpression__Group__0 ) ) ;
    public final void ruleBasicValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:496:2: ( ( ( rule__BasicValueExpression__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:497:1: ( ( rule__BasicValueExpression__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:497:1: ( ( rule__BasicValueExpression__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:498:1: ( rule__BasicValueExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:499:1: ( rule__BasicValueExpression__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:499:2: rule__BasicValueExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group__0_in_ruleBasicValueExpression1002);
            rule__BasicValueExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicValueExpression"


    // $ANTLR start "entryRuleCrement"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:511:1: entryRuleCrement : ruleCrement EOF ;
    public final void entryRuleCrement() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:512:1: ( ruleCrement EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:513:1: ruleCrement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementRule()); 
            }
            pushFollow(FOLLOW_ruleCrement_in_entryRuleCrement1029);
            ruleCrement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrement1036); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCrement"


    // $ANTLR start "ruleCrement"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:520:1: ruleCrement : ( ( rule__Crement__Group__0 ) ) ;
    public final void ruleCrement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:524:2: ( ( ( rule__Crement__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:525:1: ( ( rule__Crement__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:525:1: ( ( rule__Crement__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:526:1: ( rule__Crement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:527:1: ( rule__Crement__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:527:2: rule__Crement__Group__0
            {
            pushFollow(FOLLOW_rule__Crement__Group__0_in_ruleCrement1062);
            rule__Crement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrement"


    // $ANTLR start "entryRuleComparisonOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:539:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:540:1: ( ruleComparisonOperator EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:541:1: ruleComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator1089);
            ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator1096); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:548:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:552:2: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:553:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:553:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:554:1: ( rule__ComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:555:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:555:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1122);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleBooleanOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:567:1: entryRuleBooleanOperator : ruleBooleanOperator EOF ;
    public final void entryRuleBooleanOperator() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:568:1: ( ruleBooleanOperator EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:569:1: ruleBooleanOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator1149);
            ruleBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator1156); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanOperator"


    // $ANTLR start "ruleBooleanOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:576:1: ruleBooleanOperator : ( ( rule__BooleanOperator__Alternatives ) ) ;
    public final void ruleBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:580:2: ( ( ( rule__BooleanOperator__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:581:1: ( ( rule__BooleanOperator__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:581:1: ( ( rule__BooleanOperator__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:582:1: ( rule__BooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:583:1: ( rule__BooleanOperator__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:583:2: rule__BooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanOperator__Alternatives_in_ruleBooleanOperator1182);
            rule__BooleanOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "entryRuleMathOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:595:1: entryRuleMathOperator : ruleMathOperator EOF ;
    public final void entryRuleMathOperator() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:596:1: ( ruleMathOperator EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:597:1: ruleMathOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMathOperator_in_entryRuleMathOperator1209);
            ruleMathOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperator1216); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMathOperator"


    // $ANTLR start "ruleMathOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:604:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:608:2: ( ( ( rule__MathOperator__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:609:1: ( ( rule__MathOperator__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:609:1: ( ( rule__MathOperator__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:610:1: ( rule__MathOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:611:1: ( rule__MathOperator__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:611:2: rule__MathOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MathOperator__Alternatives_in_ruleMathOperator1242);
            rule__MathOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "entryRuleCrementOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:623:1: entryRuleCrementOperator : ruleCrementOperator EOF ;
    public final void entryRuleCrementOperator() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:624:1: ( ruleCrementOperator EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:625:1: ruleCrementOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCrementOperator_in_entryRuleCrementOperator1269);
            ruleCrementOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrementOperator1276); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCrementOperator"


    // $ANTLR start "ruleCrementOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:632:1: ruleCrementOperator : ( ( rule__CrementOperator__Alternatives ) ) ;
    public final void ruleCrementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:636:2: ( ( ( rule__CrementOperator__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:637:1: ( ( rule__CrementOperator__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:637:1: ( ( rule__CrementOperator__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:638:1: ( rule__CrementOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementOperatorAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:639:1: ( rule__CrementOperator__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:639:2: rule__CrementOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CrementOperator__Alternatives_in_ruleCrementOperator1302);
            rule__CrementOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrementOperator"


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:651:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:652:1: ( ruleIf EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:653:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1329);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1336); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:660:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:664:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:665:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:665:1: ( ( rule__If__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:666:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:667:1: ( rule__If__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:667:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf1362);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleElse"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:679:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:680:1: ( ruleElse EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:681:1: ruleElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseRule()); 
            }
            pushFollow(FOLLOW_ruleElse_in_entryRuleElse1389);
            ruleElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElse1396); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:688:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:692:2: ( ( ( rule__Else__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:693:1: ( ( rule__Else__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:693:1: ( ( rule__Else__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:694:1: ( rule__Else__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:695:1: ( rule__Else__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:695:2: rule__Else__Group__0
            {
            pushFollow(FOLLOW_rule__Else__Group__0_in_ruleElse1422);
            rule__Else__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleFor"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:707:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:708:1: ( ruleFor EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:709:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1449);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1456); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:716:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:720:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:721:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:721:1: ( ( rule__For__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:722:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:723:1: ( rule__For__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:723:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor1482);
            rule__For__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:735:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:736:1: ( ruleWhile EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:737:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1509);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1516); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:744:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:748:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:749:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:749:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:750:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:751:1: ( rule__While__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:751:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile1542);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:763:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:764:1: ( ruleValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:765:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1569);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1576); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:772:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:776:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:777:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:777:1: ( ( rule__Value__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:778:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:779:1: ( rule__Value__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:779:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1602);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBasicValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:791:1: entryRuleBasicValue : ruleBasicValue EOF ;
    public final void entryRuleBasicValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:792:1: ( ruleBasicValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:793:1: ruleBasicValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueRule()); 
            }
            pushFollow(FOLLOW_ruleBasicValue_in_entryRuleBasicValue1629);
            ruleBasicValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValue1636); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicValue"


    // $ANTLR start "ruleBasicValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:800:1: ruleBasicValue : ( ( rule__BasicValue__Alternatives ) ) ;
    public final void ruleBasicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:804:2: ( ( ( rule__BasicValue__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:805:1: ( ( rule__BasicValue__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:805:1: ( ( rule__BasicValue__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:806:1: ( rule__BasicValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:807:1: ( rule__BasicValue__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:807:2: rule__BasicValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicValue__Alternatives_in_ruleBasicValue1662);
            rule__BasicValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:819:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:820:1: ( ruleBooleanValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:821:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1689);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1696); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:828:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:832:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:833:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:833:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:834:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:835:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:835:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1722);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:847:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:848:1: ( ruleStringValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:849:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1749);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1756); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:856:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:860:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:861:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:861:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:862:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:863:1: ( rule__StringValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:863:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1782);
            rule__StringValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumberValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:875:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:876:1: ( ruleNumberValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:877:1: ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue1809);
            ruleNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue1816); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:884:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:888:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:889:1: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:889:1: ( ( rule__NumberValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:890:1: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:891:1: ( rule__NumberValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:891:2: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue1842);
            rule__NumberValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNegNumberValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:903:1: entryRuleNegNumberValue : ruleNegNumberValue EOF ;
    public final void entryRuleNegNumberValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:904:1: ( ruleNegNumberValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:905:1: ruleNegNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNegNumberValue_in_entryRuleNegNumberValue1869);
            ruleNegNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegNumberValue1876); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegNumberValue"


    // $ANTLR start "ruleNegNumberValue"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:912:1: ruleNegNumberValue : ( ( rule__NegNumberValue__Group__0 ) ) ;
    public final void ruleNegNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:916:2: ( ( ( rule__NegNumberValue__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:917:1: ( ( rule__NegNumberValue__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:917:1: ( ( rule__NegNumberValue__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:918:1: ( rule__NegNumberValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegNumberValueAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:919:1: ( rule__NegNumberValue__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:919:2: rule__NegNumberValue__Group__0
            {
            pushFollow(FOLLOW_rule__NegNumberValue__Group__0_in_ruleNegNumberValue1902);
            rule__NegNumberValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegNumberValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegNumberValue"


    // $ANTLR start "entryRuleVarReference"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:931:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:932:1: ( ruleVarReference EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:933:1: ruleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_entryRuleVarReference1929);
            ruleVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReference1936); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarReference"


    // $ANTLR start "ruleVarReference"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:940:1: ruleVarReference : ( ( rule__VarReference__VariAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:944:2: ( ( ( rule__VarReference__VariAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:945:1: ( ( rule__VarReference__VariAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:945:1: ( ( rule__VarReference__VariAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:946:1: ( rule__VarReference__VariAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:947:1: ( rule__VarReference__VariAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:947:2: rule__VarReference__VariAssignment
            {
            pushFollow(FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1962);
            rule__VarReference__VariAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReferenceAccess().getVariAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarReference"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:959:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:960:1: ( ruleDeclaration EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:961:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1989);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1996); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:968:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:972:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:973:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:973:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:974:1: ( rule__Declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:975:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:975:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration2022);
            rule__Declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleReturn"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:987:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:988:1: ( ruleReturn EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:989:1: ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn2049);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn2056); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:996:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1000:2: ( ( ( rule__Return__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1001:1: ( ( rule__Return__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1001:1: ( ( rule__Return__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1002:1: ( rule__Return__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1003:1: ( rule__Return__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1003:2: rule__Return__Group__0
            {
            pushFollow(FOLLOW_rule__Return__Group__0_in_ruleReturn2082);
            rule__Return__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleMethodtype"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1015:1: entryRuleMethodtype : ruleMethodtype EOF ;
    public final void entryRuleMethodtype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1016:1: ( ruleMethodtype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1017:1: ruleMethodtype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodtypeRule()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_entryRuleMethodtype2109);
            ruleMethodtype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodtypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodtype2116); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethodtype"


    // $ANTLR start "ruleMethodtype"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1024:1: ruleMethodtype : ( ( rule__Methodtype__Alternatives ) ) ;
    public final void ruleMethodtype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1028:2: ( ( ( rule__Methodtype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1029:1: ( ( rule__Methodtype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1029:1: ( ( rule__Methodtype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1030:1: ( rule__Methodtype__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodtypeAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1031:1: ( rule__Methodtype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1031:2: rule__Methodtype__Alternatives
            {
            pushFollow(FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype2142);
            rule__Methodtype__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodtypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodtype"


    // $ANTLR start "entryRuleDatatype"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1043:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1044:1: ( ruleDatatype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1045:1: ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype2169);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype2176); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1052:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1056:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1057:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1057:1: ( ( rule__Datatype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1058:1: ( rule__Datatype__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1059:1: ( rule__Datatype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1059:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype2202);
            rule__Datatype__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleINTSTRING"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1071:1: entryRuleINTSTRING : ruleINTSTRING EOF ;
    public final void entryRuleINTSTRING() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1072:1: ( ruleINTSTRING EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1073:1: ruleINTSTRING EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTSTRINGRule()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING2229);
            ruleINTSTRING();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTSTRINGRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTSTRING2236); if (state.failed) return ;

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
    // $ANTLR end "entryRuleINTSTRING"


    // $ANTLR start "ruleINTSTRING"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1080:1: ruleINTSTRING : ( RULE_INT ) ;
    public final void ruleINTSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1084:2: ( ( RULE_INT ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1085:1: ( RULE_INT )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1085:1: ( RULE_INT )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1086:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTSTRINGAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTSTRING2262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTSTRINGAccess().getINTTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTSTRING"


    // $ANTLR start "rule__Script__RobottypesAlternatives_4_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1099:1: rule__Script__RobottypesAlternatives_4_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobottypesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1103:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LOWERFIRST) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_CAPITALFIRST) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1104:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1104:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1105:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_4_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_4_02297); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1110:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1110:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1111:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_4_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_4_02314); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_4_0_1()); 
                    }

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
    // $ANTLR end "rule__Script__RobottypesAlternatives_4_0"


    // $ANTLR start "rule__Script__RobotconfigsAlternatives_6_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1121:1: rule__Script__RobotconfigsAlternatives_6_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobotconfigsAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1125:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LOWERFIRST) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_CAPITALFIRST) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1126:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1126:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1127:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_6_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_6_02346); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_6_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1132:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1132:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1133:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_6_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_6_02363); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_6_0_1()); 
                    }

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
    // $ANTLR end "rule__Script__RobotconfigsAlternatives_6_0"


    // $ANTLR start "rule__Script__RobottypesAlternatives_8_2_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1143:1: rule__Script__RobottypesAlternatives_8_2_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobottypesAlternatives_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1147:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LOWERFIRST) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_CAPITALFIRST) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1148:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1148:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1149:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_8_2_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_8_2_02395); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_8_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1154:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1154:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1155:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_8_2_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_8_2_02412); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_8_2_0_1()); 
                    }

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
    // $ANTLR end "rule__Script__RobottypesAlternatives_8_2_0"


    // $ANTLR start "rule__Script__RobotconfigsAlternatives_8_4_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1165:1: rule__Script__RobotconfigsAlternatives_8_4_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobotconfigsAlternatives_8_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1169:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LOWERFIRST) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_CAPITALFIRST) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1170:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1170:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1171:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_8_4_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02444); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_8_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1176:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1176:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1177:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_8_4_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02461); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_8_4_0_1()); 
                    }

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
    // $ANTLR end "rule__Script__RobotconfigsAlternatives_8_4_0"


    // $ANTLR start "rule__Block__Alternatives_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1187:1: rule__Block__Alternatives_2 : ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) );
    public final void rule__Block__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1191:1: ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_LOWERFIRST && LA5_0<=RULE_CAPITALFIRST)||(LA5_0>=32 && LA5_0<=34)||LA5_0==50) ) {
                alt5=1;
            }
            else if ( (LA5_0==40||LA5_0==46||(LA5_0>=48 && LA5_0<=49)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1192:1: ( ( rule__Block__Group_2_0__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1192:1: ( ( rule__Block__Group_2_0__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1193:1: ( rule__Block__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getGroup_2_0()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1194:1: ( rule__Block__Group_2_0__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1194:2: rule__Block__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_22493);
                    rule__Block__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1198:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1198:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1199:1: ( rule__Block__ExsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getExsAssignment_2_1()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1200:1: ( rule__Block__ExsAssignment_2_1 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1200:2: rule__Block__ExsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_22511);
                    rule__Block__ExsAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getExsAssignment_2_1()); 
                    }

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
    // $ANTLR end "rule__Block__Alternatives_2"


    // $ANTLR start "rule__SimpleExpression__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1209:1: rule__SimpleExpression__Alternatives : ( ( ruleCrement ) | ( ruleCall ) | ( ruleAssignment ) | ( ruleReturn ) );
    public final void rule__SimpleExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1213:1: ( ( ruleCrement ) | ( ruleCall ) | ( ruleAssignment ) | ( ruleReturn ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                switch ( input.LA(2) ) {
                case 23:
                case 24:
                case 25:
                case 26:
                case 44:
                    {
                    alt6=3;
                    }
                    break;
                case 27:
                case 28:
                    {
                    alt6=1;
                    }
                    break;
                case 37:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt6=2;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt6=3;
                }
                break;
            case 50:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1214:1: ( ruleCrement )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1214:1: ( ruleCrement )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1215:1: ruleCrement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getCrementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCrement_in_rule__SimpleExpression__Alternatives2544);
                    ruleCrement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExpressionAccess().getCrementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1220:6: ( ruleCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1220:6: ( ruleCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1221:1: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives2561);
                    ruleCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1226:6: ( ruleAssignment )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1226:6: ( ruleAssignment )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1227:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives2578);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1232:6: ( ruleReturn )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1232:6: ( ruleReturn )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1233:1: ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleReturn_in_rule__SimpleExpression__Alternatives2595);
                    ruleReturn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__SimpleExpression__Alternatives"


    // $ANTLR start "rule__StructureExpression__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1243:1: rule__StructureExpression__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleFor ) | ( ruleWhile ) );
    public final void rule__StructureExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1247:1: ( ( ruleBlock ) | ( ruleIf ) | ( ruleFor ) | ( ruleWhile ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case 48:
                {
                alt7=3;
                }
                break;
            case 49:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1248:1: ( ruleBlock )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1248:1: ( ruleBlock )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1249:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives2627);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1254:6: ( ruleIf )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1254:6: ( ruleIf )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1255:1: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives2644);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1260:6: ( ruleFor )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1260:6: ( ruleFor )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1261:1: ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2661);
                    ruleFor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1266:6: ( ruleWhile )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1266:6: ( ruleWhile )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1267:1: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2678);
                    ruleWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__StructureExpression__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1277:1: rule__Expression__Alternatives : ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1281:1: ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_LOWERFIRST && LA8_0<=RULE_CAPITALFIRST)||(LA8_0>=32 && LA8_0<=34)||LA8_0==50) ) {
                alt8=1;
            }
            else if ( (LA8_0==40||LA8_0==46||(LA8_0>=48 && LA8_0<=49)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1282:1: ( ruleSimpleExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1282:1: ( ruleSimpleExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1283:1: ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2710);
                    ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1288:6: ( ruleStructureExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1288:6: ( ruleStructureExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1289:1: ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2727);
                    ruleStructureExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Assignment__VariAlternatives_0_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1299:1: rule__Assignment__VariAlternatives_0_0 : ( ( ruleVarReference ) | ( ruleDeclaration ) );
    public final void rule__Assignment__VariAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1303:1: ( ( ruleVarReference ) | ( ruleDeclaration ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LOWERFIRST) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=32 && LA9_0<=34)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1304:1: ( ruleVarReference )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1304:1: ( ruleVarReference )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1305:1: ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getVariVarReferenceParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_rule__Assignment__VariAlternatives_0_02759);
                    ruleVarReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getVariVarReferenceParserRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1310:6: ( ruleDeclaration )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1310:6: ( ruleDeclaration )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1311:1: ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02776);
                    ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                    }

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
    // $ANTLR end "rule__Assignment__VariAlternatives_0_0"


    // $ANTLR start "rule__Call__Alternatives_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1321:1: rule__Call__Alternatives_0 : ( ( ruleUserMethodCall ) | ( ruleMetaMethodCall ) );
    public final void rule__Call__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1325:1: ( ( ruleUserMethodCall ) | ( ruleMetaMethodCall ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_LOWERFIRST) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_CAPITALFIRST) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1326:1: ( ruleUserMethodCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1326:1: ( ruleUserMethodCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1327:1: ruleUserMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallAccess().getUserMethodCallParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleUserMethodCall_in_rule__Call__Alternatives_02808);
                    ruleUserMethodCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallAccess().getUserMethodCallParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1332:6: ( ruleMetaMethodCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1332:6: ( ruleMetaMethodCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1333:1: ruleMetaMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallAccess().getMetaMethodCallParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleMetaMethodCall_in_rule__Call__Alternatives_02825);
                    ruleMetaMethodCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallAccess().getMetaMethodCallParserRuleCall_0_1()); 
                    }

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
    // $ANTLR end "rule__Call__Alternatives_0"


    // $ANTLR start "rule__ValueExpression__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1344:1: rule__ValueExpression__Alternatives : ( ( ruleParanValueExpression ) | ( ruleBasicValueExpression ) );
    public final void rule__ValueExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1348:1: ( ( ruleParanValueExpression ) | ( ruleBasicValueExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||LA11_0==24||(LA11_0>=29 && LA11_0<=30)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1349:1: ( ruleParanValueExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1349:1: ( ruleParanValueExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1350:1: ruleParanValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getParanValueExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParanValueExpression_in_rule__ValueExpression__Alternatives2858);
                    ruleParanValueExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueExpressionAccess().getParanValueExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1355:6: ( ruleBasicValueExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1355:6: ( ruleBasicValueExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1356:1: ruleBasicValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getBasicValueExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBasicValueExpression_in_rule__ValueExpression__Alternatives2875);
                    ruleBasicValueExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueExpressionAccess().getBasicValueExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__ValueExpression__Alternatives"


    // $ANTLR start "rule__ParanValueExpression__OpAlternatives_3_0_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1366:1: rule__ParanValueExpression__OpAlternatives_3_0_0 : ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) );
    public final void rule__ParanValueExpression__OpAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1370:1: ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt12=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt12=2;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1371:1: ( ruleMathOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1371:1: ( ruleMathOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1372:1: ruleMathOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParanValueExpressionAccess().getOpMathOperatorParserRuleCall_3_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleMathOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02907);
                    ruleMathOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParanValueExpressionAccess().getOpMathOperatorParserRuleCall_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1377:6: ( ruleBooleanOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1377:6: ( ruleBooleanOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1378:1: ruleBooleanOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParanValueExpressionAccess().getOpBooleanOperatorParserRuleCall_3_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02924);
                    ruleBooleanOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParanValueExpressionAccess().getOpBooleanOperatorParserRuleCall_3_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1383:6: ( ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1383:6: ( ruleComparisonOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1384:1: ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParanValueExpressionAccess().getOpComparisonOperatorParserRuleCall_3_0_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleComparisonOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02941);
                    ruleComparisonOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParanValueExpressionAccess().getOpComparisonOperatorParserRuleCall_3_0_0_2()); 
                    }

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
    // $ANTLR end "rule__ParanValueExpression__OpAlternatives_3_0_0"


    // $ANTLR start "rule__BasicValueExpression__OpAlternatives_1_0_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1394:1: rule__BasicValueExpression__OpAlternatives_1_0_0 : ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) );
    public final void rule__BasicValueExpression__OpAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1398:1: ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt13=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt13=2;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1399:1: ( ruleMathOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1399:1: ( ruleMathOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1400:1: ruleMathOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueExpressionAccess().getOpMathOperatorParserRuleCall_1_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleMathOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02973);
                    ruleMathOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueExpressionAccess().getOpMathOperatorParserRuleCall_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1405:6: ( ruleBooleanOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1405:6: ( ruleBooleanOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1406:1: ruleBooleanOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueExpressionAccess().getOpBooleanOperatorParserRuleCall_1_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02990);
                    ruleBooleanOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueExpressionAccess().getOpBooleanOperatorParserRuleCall_1_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1411:6: ( ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1411:6: ( ruleComparisonOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1412:1: ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueExpressionAccess().getOpComparisonOperatorParserRuleCall_1_0_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleComparisonOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_03007);
                    ruleComparisonOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueExpressionAccess().getOpComparisonOperatorParserRuleCall_1_0_0_2()); 
                    }

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
    // $ANTLR end "rule__BasicValueExpression__OpAlternatives_1_0_0"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1422:1: rule__ComparisonOperator__Alternatives : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1426:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt14=1;
                }
                break;
            case 14:
                {
                alt14=2;
                }
                break;
            case 15:
                {
                alt14=3;
                }
                break;
            case 16:
                {
                alt14=4;
                }
                break;
            case 17:
                {
                alt14=5;
                }
                break;
            case 18:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1427:1: ( '==' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1427:1: ( '==' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1428:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives3040); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1435:6: ( '!=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1435:6: ( '!=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1436:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives3060); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1443:6: ( '<' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1443:6: ( '<' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1444:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives3080); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1451:6: ( '>' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1451:6: ( '>' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1452:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives3100); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1459:6: ( '<=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1459:6: ( '<=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1460:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives3120); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1467:6: ( '>=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1467:6: ( '>=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1468:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ComparisonOperator__Alternatives3140); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__BooleanOperator__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1480:1: rule__BooleanOperator__Alternatives : ( ( '&&' ) | ( '||' ) | ( '!&&' ) | ( '!||' ) );
    public final void rule__BooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1484:1: ( ( '&&' ) | ( '||' ) | ( '!&&' ) | ( '!||' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            case 22:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1485:1: ( '&&' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1485:1: ( '&&' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1486:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__BooleanOperator__Alternatives3175); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1493:6: ( '||' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1493:6: ( '||' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1494:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__BooleanOperator__Alternatives3195); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1501:6: ( '!&&' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1501:6: ( '!&&' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1502:1: '!&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__BooleanOperator__Alternatives3215); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1509:6: ( '!||' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1509:6: ( '!||' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1510:1: '!||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getExclamationMarkVerticalLineVerticalLineKeyword_3()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__BooleanOperator__Alternatives3235); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getExclamationMarkVerticalLineVerticalLineKeyword_3()); 
                    }

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
    // $ANTLR end "rule__BooleanOperator__Alternatives"


    // $ANTLR start "rule__MathOperator__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1522:1: rule__MathOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1526:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt16=1;
                }
                break;
            case 24:
                {
                alt16=2;
                }
                break;
            case 25:
                {
                alt16=3;
                }
                break;
            case 26:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1527:1: ( '+' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1527:1: ( '+' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1528:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__MathOperator__Alternatives3270); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1535:6: ( '-' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1535:6: ( '-' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1536:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__MathOperator__Alternatives3290); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1543:6: ( '*' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1543:6: ( '*' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1544:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getAsteriskKeyword_2()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__MathOperator__Alternatives3310); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathOperatorAccess().getAsteriskKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1551:6: ( '/' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1551:6: ( '/' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1552:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getSolidusKeyword_3()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__MathOperator__Alternatives3330); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathOperatorAccess().getSolidusKeyword_3()); 
                    }

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
    // $ANTLR end "rule__MathOperator__Alternatives"


    // $ANTLR start "rule__CrementOperator__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1564:1: rule__CrementOperator__Alternatives : ( ( '++' ) | ( '--' ) );
    public final void rule__CrementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1568:1: ( ( '++' ) | ( '--' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==28) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1569:1: ( '++' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1569:1: ( '++' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1570:1: '++'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCrementOperatorAccess().getPlusSignPlusSignKeyword_0()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__CrementOperator__Alternatives3365); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCrementOperatorAccess().getPlusSignPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1577:6: ( '--' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1577:6: ( '--' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1578:1: '--'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCrementOperatorAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__CrementOperator__Alternatives3385); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCrementOperatorAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                    }

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
    // $ANTLR end "rule__CrementOperator__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1590:1: rule__Value__Alternatives : ( ( ruleCall ) | ( ruleVarReference ) | ( ruleBasicValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1594:1: ( ( ruleCall ) | ( ruleVarReference ) | ( ruleBasicValue ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==37) ) {
                    alt18=1;
                }
                else if ( (LA18_1==EOF||(LA18_1>=RULE_LOWERFIRST && LA18_1<=RULE_CAPITALFIRST)||(LA18_1>=13 && LA18_1<=26)||(LA18_1>=32 && LA18_1<=34)||(LA18_1>=38 && LA18_1<=41)||LA18_1==43||LA18_1==46||(LA18_1>=48 && LA18_1<=50)) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 24:
            case 29:
            case 30:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1595:1: ( ruleCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1595:1: ( ruleCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1596:1: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCall_in_rule__Value__Alternatives3419);
                    ruleCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getCallParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1601:6: ( ruleVarReference )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1601:6: ( ruleVarReference )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1602:1: ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_rule__Value__Alternatives3436);
                    ruleVarReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1607:6: ( ruleBasicValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1607:6: ( ruleBasicValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1608:1: ruleBasicValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBasicValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBasicValue_in_rule__Value__Alternatives3453);
                    ruleBasicValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBasicValueParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__BasicValue__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1618:1: rule__BasicValue__Alternatives : ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleNegNumberValue ) | ( ruleStringValue ) );
    public final void rule__BasicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1622:1: ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleNegNumberValue ) | ( ruleStringValue ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=2;
                }
                break;
            case 24:
                {
                alt19=3;
                }
                break;
            case RULE_STRING:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1623:1: ( ruleBooleanValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1623:1: ( ruleBooleanValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1624:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives3485);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1629:6: ( ruleNumberValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1629:6: ( ruleNumberValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1630:1: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives3502);
                    ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1635:6: ( ruleNegNumberValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1635:6: ( ruleNegNumberValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1636:1: ruleNegNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getNegNumberValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNegNumberValue_in_rule__BasicValue__Alternatives3519);
                    ruleNegNumberValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueAccess().getNegNumberValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1641:6: ( ruleStringValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1641:6: ( ruleStringValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1642:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives3536);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__BasicValue__Alternatives"


    // $ANTLR start "rule__BooleanValue__ValueAlternatives_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1652:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1656:1: ( ( 'true' ) | ( 'false' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            else if ( (LA20_0==30) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1657:1: ( 'true' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1657:1: ( 'true' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1658:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__BooleanValue__ValueAlternatives_03569); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1665:6: ( 'false' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1665:6: ( 'false' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1666:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__BooleanValue__ValueAlternatives_03589); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    }

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
    // $ANTLR end "rule__BooleanValue__ValueAlternatives_0"


    // $ANTLR start "rule__Methodtype__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1678:1: rule__Methodtype__Alternatives : ( ( 'void' ) | ( ruleDatatype ) );
    public final void rule__Methodtype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1682:1: ( ( 'void' ) | ( ruleDatatype ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=32 && LA21_0<=34)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1683:1: ( 'void' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1683:1: ( 'void' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1684:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Methodtype__Alternatives3624); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1691:6: ( ruleDatatype )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1691:6: ( ruleDatatype )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1692:1: ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives3643);
                    ruleDatatype();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Methodtype__Alternatives"


    // $ANTLR start "rule__Datatype__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1702:1: rule__Datatype__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1706:1: ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case 33:
                {
                alt22=2;
                }
                break;
            case 34:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1707:1: ( 'int' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1707:1: ( 'int' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1708:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__Datatype__Alternatives3676); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1715:6: ( 'string' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1715:6: ( 'string' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1716:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__Datatype__Alternatives3696); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1723:6: ( 'boolean' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1723:6: ( 'boolean' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1724:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__Datatype__Alternatives3716); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 
                    }

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
    // $ANTLR end "rule__Datatype__Alternatives"


    // $ANTLR start "rule__CLfile__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1738:1: rule__CLfile__Group__0 : rule__CLfile__Group__0__Impl rule__CLfile__Group__1 ;
    public final void rule__CLfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1742:1: ( rule__CLfile__Group__0__Impl rule__CLfile__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1743:2: rule__CLfile__Group__0__Impl rule__CLfile__Group__1
            {
            pushFollow(FOLLOW_rule__CLfile__Group__0__Impl_in_rule__CLfile__Group__03748);
            rule__CLfile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CLfile__Group__1_in_rule__CLfile__Group__03751);
            rule__CLfile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLfile__Group__0"


    // $ANTLR start "rule__CLfile__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1750:1: rule__CLfile__Group__0__Impl : ( ( rule__CLfile__ScriptsAssignment_0 )* ) ;
    public final void rule__CLfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1754:1: ( ( ( rule__CLfile__ScriptsAssignment_0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1755:1: ( ( rule__CLfile__ScriptsAssignment_0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1755:1: ( ( rule__CLfile__ScriptsAssignment_0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1756:1: ( rule__CLfile__ScriptsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getScriptsAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1757:1: ( rule__CLfile__ScriptsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1757:2: rule__CLfile__ScriptsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CLfile__ScriptsAssignment_0_in_rule__CLfile__Group__0__Impl3778);
            	    rule__CLfile__ScriptsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileAccess().getScriptsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLfile__Group__0__Impl"


    // $ANTLR start "rule__CLfile__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1767:1: rule__CLfile__Group__1 : rule__CLfile__Group__1__Impl ;
    public final void rule__CLfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1771:1: ( rule__CLfile__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1772:2: rule__CLfile__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CLfile__Group__1__Impl_in_rule__CLfile__Group__13809);
            rule__CLfile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLfile__Group__1"


    // $ANTLR start "rule__CLfile__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1778:1: rule__CLfile__Group__1__Impl : ( ( rule__CLfile__MetsAssignment_1 ) ) ;
    public final void rule__CLfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1782:1: ( ( ( rule__CLfile__MetsAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1783:1: ( ( rule__CLfile__MetsAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1783:1: ( ( rule__CLfile__MetsAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1784:1: ( rule__CLfile__MetsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getMetsAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1785:1: ( rule__CLfile__MetsAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1785:2: rule__CLfile__MetsAssignment_1
            {
            pushFollow(FOLLOW_rule__CLfile__MetsAssignment_1_in_rule__CLfile__Group__1__Impl3836);
            rule__CLfile__MetsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileAccess().getMetsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLfile__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1799:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1803:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1804:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__03870);
            rule__Script__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__03873);
            rule__Script__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1811:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1815:1: ( ( 'script' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1816:1: ( 'script' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1816:1: ( 'script' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1817:1: 'script'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Script__Group__0__Impl3901); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1830:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1834:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1835:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__13932);
            rule__Script__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__13935);
            rule__Script__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1842:1: rule__Script__Group__1__Impl : ( ( rule__Script__NameAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1846:1: ( ( ( rule__Script__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1847:1: ( ( rule__Script__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1847:1: ( ( rule__Script__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1848:1: ( rule__Script__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1849:1: ( rule__Script__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1849:2: rule__Script__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl3962);
            rule__Script__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1859:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1863:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1864:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__23992);
            rule__Script__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__3_in_rule__Script__Group__23995);
            rule__Script__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1871:1: rule__Script__Group__2__Impl : ( 'targets' ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1875:1: ( ( 'targets' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1876:1: ( 'targets' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1876:1: ( 'targets' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1877:1: 'targets'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTargetsKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__Script__Group__2__Impl4023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getTargetsKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Script__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1890:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1894:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1895:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__34054);
            rule__Script__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__4_in_rule__Script__Group__34057);
            rule__Script__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3"


    // $ANTLR start "rule__Script__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1902:1: rule__Script__Group__3__Impl : ( '(' ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1906:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1907:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1907:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1908:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__Script__Group__3__Impl4085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__3__Impl"


    // $ANTLR start "rule__Script__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1921:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1925:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1926:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__44116);
            rule__Script__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__5_in_rule__Script__Group__44119);
            rule__Script__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4"


    // $ANTLR start "rule__Script__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1933:1: rule__Script__Group__4__Impl : ( ( rule__Script__RobottypesAssignment_4 ) ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1937:1: ( ( ( rule__Script__RobottypesAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1938:1: ( ( rule__Script__RobottypesAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1938:1: ( ( rule__Script__RobottypesAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1939:1: ( rule__Script__RobottypesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1940:1: ( rule__Script__RobottypesAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1940:2: rule__Script__RobottypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_4_in_rule__Script__Group__4__Impl4146);
            rule__Script__RobottypesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__4__Impl"


    // $ANTLR start "rule__Script__Group__5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1950:1: rule__Script__Group__5 : rule__Script__Group__5__Impl rule__Script__Group__6 ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1954:1: ( rule__Script__Group__5__Impl rule__Script__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1955:2: rule__Script__Group__5__Impl rule__Script__Group__6
            {
            pushFollow(FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__54176);
            rule__Script__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__6_in_rule__Script__Group__54179);
            rule__Script__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5"


    // $ANTLR start "rule__Script__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1962:1: rule__Script__Group__5__Impl : ( ',' ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1966:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1967:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1967:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1968:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_5()); 
            }
            match(input,38,FOLLOW_38_in_rule__Script__Group__5__Impl4207); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getCommaKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__5__Impl"


    // $ANTLR start "rule__Script__Group__6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1981:1: rule__Script__Group__6 : rule__Script__Group__6__Impl rule__Script__Group__7 ;
    public final void rule__Script__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1985:1: ( rule__Script__Group__6__Impl rule__Script__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1986:2: rule__Script__Group__6__Impl rule__Script__Group__7
            {
            pushFollow(FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__64238);
            rule__Script__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__7_in_rule__Script__Group__64241);
            rule__Script__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__6"


    // $ANTLR start "rule__Script__Group__6__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1993:1: rule__Script__Group__6__Impl : ( ( rule__Script__RobotconfigsAssignment_6 ) ) ;
    public final void rule__Script__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1997:1: ( ( ( rule__Script__RobotconfigsAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1998:1: ( ( rule__Script__RobotconfigsAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1998:1: ( ( rule__Script__RobotconfigsAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1999:1: ( rule__Script__RobotconfigsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2000:1: ( rule__Script__RobotconfigsAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2000:2: rule__Script__RobotconfigsAssignment_6
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_6_in_rule__Script__Group__6__Impl4268);
            rule__Script__RobotconfigsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__6__Impl"


    // $ANTLR start "rule__Script__Group__7"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2010:1: rule__Script__Group__7 : rule__Script__Group__7__Impl rule__Script__Group__8 ;
    public final void rule__Script__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2014:1: ( rule__Script__Group__7__Impl rule__Script__Group__8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2015:2: rule__Script__Group__7__Impl rule__Script__Group__8
            {
            pushFollow(FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__74298);
            rule__Script__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__8_in_rule__Script__Group__74301);
            rule__Script__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__7"


    // $ANTLR start "rule__Script__Group__7__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2022:1: rule__Script__Group__7__Impl : ( ')' ) ;
    public final void rule__Script__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2026:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2027:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2027:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2028:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,39,FOLLOW_39_in_rule__Script__Group__7__Impl4329); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__7__Impl"


    // $ANTLR start "rule__Script__Group__8"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2041:1: rule__Script__Group__8 : rule__Script__Group__8__Impl rule__Script__Group__9 ;
    public final void rule__Script__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2045:1: ( rule__Script__Group__8__Impl rule__Script__Group__9 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2046:2: rule__Script__Group__8__Impl rule__Script__Group__9
            {
            pushFollow(FOLLOW_rule__Script__Group__8__Impl_in_rule__Script__Group__84360);
            rule__Script__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__9_in_rule__Script__Group__84363);
            rule__Script__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__8"


    // $ANTLR start "rule__Script__Group__8__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2053:1: rule__Script__Group__8__Impl : ( ( rule__Script__Group_8__0 )* ) ;
    public final void rule__Script__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2057:1: ( ( ( rule__Script__Group_8__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2058:1: ( ( rule__Script__Group_8__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2058:1: ( ( rule__Script__Group_8__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2059:1: ( rule__Script__Group_8__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup_8()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2060:1: ( rule__Script__Group_8__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2060:2: rule__Script__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Script__Group_8__0_in_rule__Script__Group__8__Impl4390);
            	    rule__Script__Group_8__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__8__Impl"


    // $ANTLR start "rule__Script__Group__9"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2070:1: rule__Script__Group__9 : rule__Script__Group__9__Impl rule__Script__Group__10 ;
    public final void rule__Script__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2074:1: ( rule__Script__Group__9__Impl rule__Script__Group__10 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2075:2: rule__Script__Group__9__Impl rule__Script__Group__10
            {
            pushFollow(FOLLOW_rule__Script__Group__9__Impl_in_rule__Script__Group__94421);
            rule__Script__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__10_in_rule__Script__Group__94424);
            rule__Script__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__9"


    // $ANTLR start "rule__Script__Group__9__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2082:1: rule__Script__Group__9__Impl : ( '{' ) ;
    public final void rule__Script__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2086:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2087:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2087:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2088:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_9()); 
            }
            match(input,40,FOLLOW_40_in_rule__Script__Group__9__Impl4452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__9__Impl"


    // $ANTLR start "rule__Script__Group__10"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2101:1: rule__Script__Group__10 : rule__Script__Group__10__Impl rule__Script__Group__11 ;
    public final void rule__Script__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2105:1: ( rule__Script__Group__10__Impl rule__Script__Group__11 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2106:2: rule__Script__Group__10__Impl rule__Script__Group__11
            {
            pushFollow(FOLLOW_rule__Script__Group__10__Impl_in_rule__Script__Group__104483);
            rule__Script__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__11_in_rule__Script__Group__104486);
            rule__Script__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__10"


    // $ANTLR start "rule__Script__Group__10__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2113:1: rule__Script__Group__10__Impl : ( ( rule__Script__MethodsAssignment_10 )* ) ;
    public final void rule__Script__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2117:1: ( ( ( rule__Script__MethodsAssignment_10 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2118:1: ( ( rule__Script__MethodsAssignment_10 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2118:1: ( ( rule__Script__MethodsAssignment_10 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2119:1: ( rule__Script__MethodsAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getMethodsAssignment_10()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2120:1: ( rule__Script__MethodsAssignment_10 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=31 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2120:2: rule__Script__MethodsAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Script__MethodsAssignment_10_in_rule__Script__Group__10__Impl4513);
            	    rule__Script__MethodsAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getMethodsAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__10__Impl"


    // $ANTLR start "rule__Script__Group__11"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2130:1: rule__Script__Group__11 : rule__Script__Group__11__Impl ;
    public final void rule__Script__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2134:1: ( rule__Script__Group__11__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2135:2: rule__Script__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__11__Impl_in_rule__Script__Group__114544);
            rule__Script__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__11"


    // $ANTLR start "rule__Script__Group__11__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2141:1: rule__Script__Group__11__Impl : ( '}' ) ;
    public final void rule__Script__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2145:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2146:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2146:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2147:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,41,FOLLOW_41_in_rule__Script__Group__11__Impl4572); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__11__Impl"


    // $ANTLR start "rule__Script__Group_8__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2184:1: rule__Script__Group_8__0 : rule__Script__Group_8__0__Impl rule__Script__Group_8__1 ;
    public final void rule__Script__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2188:1: ( rule__Script__Group_8__0__Impl rule__Script__Group_8__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2189:2: rule__Script__Group_8__0__Impl rule__Script__Group_8__1
            {
            pushFollow(FOLLOW_rule__Script__Group_8__0__Impl_in_rule__Script__Group_8__04627);
            rule__Script__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__1_in_rule__Script__Group_8__04630);
            rule__Script__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__0"


    // $ANTLR start "rule__Script__Group_8__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2196:1: rule__Script__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Script__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2200:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2201:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2201:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2202:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_8_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Script__Group_8__0__Impl4658); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getCommaKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__0__Impl"


    // $ANTLR start "rule__Script__Group_8__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2215:1: rule__Script__Group_8__1 : rule__Script__Group_8__1__Impl rule__Script__Group_8__2 ;
    public final void rule__Script__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2219:1: ( rule__Script__Group_8__1__Impl rule__Script__Group_8__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2220:2: rule__Script__Group_8__1__Impl rule__Script__Group_8__2
            {
            pushFollow(FOLLOW_rule__Script__Group_8__1__Impl_in_rule__Script__Group_8__14689);
            rule__Script__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__2_in_rule__Script__Group_8__14692);
            rule__Script__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__1"


    // $ANTLR start "rule__Script__Group_8__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2227:1: rule__Script__Group_8__1__Impl : ( '(' ) ;
    public final void rule__Script__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2231:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2232:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2232:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2233:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_8_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Script__Group_8__1__Impl4720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__1__Impl"


    // $ANTLR start "rule__Script__Group_8__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2246:1: rule__Script__Group_8__2 : rule__Script__Group_8__2__Impl rule__Script__Group_8__3 ;
    public final void rule__Script__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2250:1: ( rule__Script__Group_8__2__Impl rule__Script__Group_8__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2251:2: rule__Script__Group_8__2__Impl rule__Script__Group_8__3
            {
            pushFollow(FOLLOW_rule__Script__Group_8__2__Impl_in_rule__Script__Group_8__24751);
            rule__Script__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__3_in_rule__Script__Group_8__24754);
            rule__Script__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__2"


    // $ANTLR start "rule__Script__Group_8__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2258:1: rule__Script__Group_8__2__Impl : ( ( rule__Script__RobottypesAssignment_8_2 ) ) ;
    public final void rule__Script__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2262:1: ( ( ( rule__Script__RobottypesAssignment_8_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2263:1: ( ( rule__Script__RobottypesAssignment_8_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2263:1: ( ( rule__Script__RobottypesAssignment_8_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2264:1: ( rule__Script__RobottypesAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAssignment_8_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2265:1: ( rule__Script__RobottypesAssignment_8_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2265:2: rule__Script__RobottypesAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_8_2_in_rule__Script__Group_8__2__Impl4781);
            rule__Script__RobottypesAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__2__Impl"


    // $ANTLR start "rule__Script__Group_8__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2275:1: rule__Script__Group_8__3 : rule__Script__Group_8__3__Impl rule__Script__Group_8__4 ;
    public final void rule__Script__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2279:1: ( rule__Script__Group_8__3__Impl rule__Script__Group_8__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2280:2: rule__Script__Group_8__3__Impl rule__Script__Group_8__4
            {
            pushFollow(FOLLOW_rule__Script__Group_8__3__Impl_in_rule__Script__Group_8__34811);
            rule__Script__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__4_in_rule__Script__Group_8__34814);
            rule__Script__Group_8__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__3"


    // $ANTLR start "rule__Script__Group_8__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2287:1: rule__Script__Group_8__3__Impl : ( ',' ) ;
    public final void rule__Script__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2291:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2292:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2292:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2293:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_8_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__Script__Group_8__3__Impl4842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getCommaKeyword_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__3__Impl"


    // $ANTLR start "rule__Script__Group_8__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2306:1: rule__Script__Group_8__4 : rule__Script__Group_8__4__Impl rule__Script__Group_8__5 ;
    public final void rule__Script__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2310:1: ( rule__Script__Group_8__4__Impl rule__Script__Group_8__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2311:2: rule__Script__Group_8__4__Impl rule__Script__Group_8__5
            {
            pushFollow(FOLLOW_rule__Script__Group_8__4__Impl_in_rule__Script__Group_8__44873);
            rule__Script__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__5_in_rule__Script__Group_8__44876);
            rule__Script__Group_8__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__4"


    // $ANTLR start "rule__Script__Group_8__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2318:1: rule__Script__Group_8__4__Impl : ( ( rule__Script__RobotconfigsAssignment_8_4 ) ) ;
    public final void rule__Script__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2322:1: ( ( ( rule__Script__RobotconfigsAssignment_8_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2323:1: ( ( rule__Script__RobotconfigsAssignment_8_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2323:1: ( ( rule__Script__RobotconfigsAssignment_8_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2324:1: ( rule__Script__RobotconfigsAssignment_8_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_8_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2325:1: ( rule__Script__RobotconfigsAssignment_8_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2325:2: rule__Script__RobotconfigsAssignment_8_4
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_8_4_in_rule__Script__Group_8__4__Impl4903);
            rule__Script__RobotconfigsAssignment_8_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsAssignment_8_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__4__Impl"


    // $ANTLR start "rule__Script__Group_8__5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2335:1: rule__Script__Group_8__5 : rule__Script__Group_8__5__Impl ;
    public final void rule__Script__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2339:1: ( rule__Script__Group_8__5__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2340:2: rule__Script__Group_8__5__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_8__5__Impl_in_rule__Script__Group_8__54933);
            rule__Script__Group_8__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__5"


    // $ANTLR start "rule__Script__Group_8__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2346:1: rule__Script__Group_8__5__Impl : ( ')' ) ;
    public final void rule__Script__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2350:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2351:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2351:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2352:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_8_5()); 
            }
            match(input,39,FOLLOW_39_in_rule__Script__Group_8__5__Impl4961); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRightParenthesisKeyword_8_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_8__5__Impl"


    // $ANTLR start "rule__MetaMethods__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2377:1: rule__MetaMethods__Group__0 : rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 ;
    public final void rule__MetaMethods__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2381:1: ( rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2382:2: rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__05004);
            rule__MetaMethods__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__05007);
            rule__MetaMethods__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__0"


    // $ANTLR start "rule__MetaMethods__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2389:1: rule__MetaMethods__Group__0__Impl : ( () ) ;
    public final void rule__MetaMethods__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2393:1: ( ( () ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2394:1: ( () )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2394:1: ( () )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2395:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMetaMethodsAction_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2396:1: ()
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2398:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getMetaMethodsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__0__Impl"


    // $ANTLR start "rule__MetaMethods__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2408:1: rule__MetaMethods__Group__1 : rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 ;
    public final void rule__MetaMethods__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2412:1: ( rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2413:2: rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__15065);
            rule__MetaMethods__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__15068);
            rule__MetaMethods__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__1"


    // $ANTLR start "rule__MetaMethods__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2420:1: rule__MetaMethods__Group__1__Impl : ( 'metamethodscollection' ) ;
    public final void rule__MetaMethods__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2424:1: ( ( 'metamethodscollection' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2425:1: ( 'metamethodscollection' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2425:1: ( 'metamethodscollection' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2426:1: 'metamethodscollection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__MetaMethods__Group__1__Impl5096); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__1__Impl"


    // $ANTLR start "rule__MetaMethods__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2439:1: rule__MetaMethods__Group__2 : rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 ;
    public final void rule__MetaMethods__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2443:1: ( rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2444:2: rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__25127);
            rule__MetaMethods__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__25130);
            rule__MetaMethods__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__2"


    // $ANTLR start "rule__MetaMethods__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2451:1: rule__MetaMethods__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaMethods__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2455:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2456:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2456:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2457:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__MetaMethods__Group__2__Impl5158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__2__Impl"


    // $ANTLR start "rule__MetaMethods__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2470:1: rule__MetaMethods__Group__3 : rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 ;
    public final void rule__MetaMethods__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2474:1: ( rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2475:2: rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__35189);
            rule__MetaMethods__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__35192);
            rule__MetaMethods__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__3"


    // $ANTLR start "rule__MetaMethods__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2482:1: rule__MetaMethods__Group__3__Impl : ( ( rule__MetaMethods__MethodsAssignment_3 )* ) ;
    public final void rule__MetaMethods__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2486:1: ( ( ( rule__MetaMethods__MethodsAssignment_3 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2487:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2487:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2488:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2489:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2489:2: rule__MetaMethods__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl5219);
            	    rule__MetaMethods__MethodsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__3__Impl"


    // $ANTLR start "rule__MetaMethods__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2499:1: rule__MetaMethods__Group__4 : rule__MetaMethods__Group__4__Impl ;
    public final void rule__MetaMethods__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2503:1: ( rule__MetaMethods__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2504:2: rule__MetaMethods__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__45250);
            rule__MetaMethods__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__4"


    // $ANTLR start "rule__MetaMethods__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2510:1: rule__MetaMethods__Group__4__Impl : ( '}' ) ;
    public final void rule__MetaMethods__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2514:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2515:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2515:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2516:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__MetaMethods__Group__4__Impl5278); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__4__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2539:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2543:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2544:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05319);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05322);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2551:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2555:1: ( ( () ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2556:1: ( () )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2556:1: ( () )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2557:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2558:1: ()
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2560:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2570:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2574:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2575:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15380);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15383);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2582:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2586:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2587:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2587:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2588:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Block__Group__1__Impl5411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2601:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2605:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2606:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25442);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25445);
            rule__Block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2613:1: rule__Block__Group__2__Impl : ( ( rule__Block__Alternatives_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2617:1: ( ( ( rule__Block__Alternatives_2 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2618:1: ( ( rule__Block__Alternatives_2 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2618:1: ( ( rule__Block__Alternatives_2 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2619:1: ( rule__Block__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2620:1: ( rule__Block__Alternatives_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_LOWERFIRST && LA27_0<=RULE_CAPITALFIRST)||(LA27_0>=32 && LA27_0<=34)||LA27_0==40||LA27_0==46||(LA27_0>=48 && LA27_0<=50)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2620:2: rule__Block__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl5472);
            	    rule__Block__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2630:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2634:1: ( rule__Block__Group__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2635:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35503);
            rule__Block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2641:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2645:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2646:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2646:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2647:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__Block__Group__3__Impl5531); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group_2_0__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2668:1: rule__Block__Group_2_0__0 : rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 ;
    public final void rule__Block__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2672:1: ( rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2673:2: rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__05570);
            rule__Block__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__05573);
            rule__Block__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_0__0"


    // $ANTLR start "rule__Block__Group_2_0__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2680:1: rule__Block__Group_2_0__0__Impl : ( ( rule__Block__ExsAssignment_2_0_0 ) ) ;
    public final void rule__Block__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2684:1: ( ( ( rule__Block__ExsAssignment_2_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2685:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2685:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2686:1: ( rule__Block__ExsAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsAssignment_2_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2687:1: ( rule__Block__ExsAssignment_2_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2687:2: rule__Block__ExsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl5600);
            rule__Block__ExsAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getExsAssignment_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_0__0__Impl"


    // $ANTLR start "rule__Block__Group_2_0__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2697:1: rule__Block__Group_2_0__1 : rule__Block__Group_2_0__1__Impl ;
    public final void rule__Block__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2701:1: ( rule__Block__Group_2_0__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2702:2: rule__Block__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__15630);
            rule__Block__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_0__1"


    // $ANTLR start "rule__Block__Group_2_0__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2708:1: rule__Block__Group_2_0__1__Impl : ( ';' ) ;
    public final void rule__Block__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2712:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2713:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2713:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2714:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__Block__Group_2_0__1__Impl5658); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2731:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2735:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2736:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05693);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05696);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2743:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2747:1: ( ( ( rule__Assignment__VariAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2748:1: ( ( rule__Assignment__VariAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2748:1: ( ( rule__Assignment__VariAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2749:1: ( rule__Assignment__VariAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2750:1: ( rule__Assignment__VariAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2750:2: rule__Assignment__VariAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl5723);
            rule__Assignment__VariAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2760:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2764:1: ( rule__Assignment__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2765:2: rule__Assignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15753);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2771:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2775:1: ( ( ( rule__Assignment__Group_1__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2776:1: ( ( rule__Assignment__Group_1__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2776:1: ( ( rule__Assignment__Group_1__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2777:1: ( rule__Assignment__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2778:1: ( rule__Assignment__Group_1__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2778:2: rule__Assignment__Group_1__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Group__1__Impl5780);
            rule__Assignment__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2792:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2796:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2797:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__05814);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__05817);
            rule__Assignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__0"


    // $ANTLR start "rule__Assignment__Group_1__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2804:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__OpAssignment_1_0 )? ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2808:1: ( ( ( rule__Assignment__OpAssignment_1_0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2809:1: ( ( rule__Assignment__OpAssignment_1_0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2809:1: ( ( rule__Assignment__OpAssignment_1_0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2810:1: ( rule__Assignment__OpAssignment_1_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2811:1: ( rule__Assignment__OpAssignment_1_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=23 && LA28_0<=26)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2811:2: rule__Assignment__OpAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Assignment__OpAssignment_1_0_in_rule__Assignment__Group_1__0__Impl5844);
                    rule__Assignment__OpAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2821:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2825:1: ( rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2826:2: rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__15875);
            rule__Assignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__15878);
            rule__Assignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__1"


    // $ANTLR start "rule__Assignment__Group_1__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2833:1: rule__Assignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2837:1: ( ( '=' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2838:1: ( '=' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2838:1: ( '=' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2839:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__Assignment__Group_1__1__Impl5906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2852:1: rule__Assignment__Group_1__2 : rule__Assignment__Group_1__2__Impl ;
    public final void rule__Assignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2856:1: ( rule__Assignment__Group_1__2__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2857:2: rule__Assignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__25937);
            rule__Assignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__2"


    // $ANTLR start "rule__Assignment__Group_1__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2863:1: rule__Assignment__Group_1__2__Impl : ( ( rule__Assignment__ValueAssignment_1_2 ) ) ;
    public final void rule__Assignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2867:1: ( ( ( rule__Assignment__ValueAssignment_1_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2868:1: ( ( rule__Assignment__ValueAssignment_1_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2868:1: ( ( rule__Assignment__ValueAssignment_1_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2869:1: ( rule__Assignment__ValueAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_1_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2870:1: ( rule__Assignment__ValueAssignment_1_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2870:2: rule__Assignment__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_1_2_in_rule__Assignment__Group_1__2__Impl5964);
            rule__Assignment__ValueAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__2__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2886:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2890:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2891:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__06000);
            rule__Call__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__06003);
            rule__Call__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2898:1: rule__Call__Group__0__Impl : ( ( rule__Call__Alternatives_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2902:1: ( ( ( rule__Call__Alternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2903:1: ( ( rule__Call__Alternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2903:1: ( ( rule__Call__Alternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2904:1: ( rule__Call__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getAlternatives_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2905:1: ( rule__Call__Alternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2905:2: rule__Call__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Call__Alternatives_0_in_rule__Call__Group__0__Impl6030);
            rule__Call__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2915:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2919:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2920:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__16060);
            rule__Call__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__16063);
            rule__Call__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2927:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2931:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2932:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2932:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2933:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Call__Group__1__Impl6091); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2946:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2950:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2951:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__26122);
            rule__Call__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__26125);
            rule__Call__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2958:1: rule__Call__Group__2__Impl : ( ( rule__Call__ParametersAssignment_2 )? ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2962:1: ( ( ( rule__Call__ParametersAssignment_2 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2963:1: ( ( rule__Call__ParametersAssignment_2 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2963:1: ( ( rule__Call__ParametersAssignment_2 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2964:1: ( rule__Call__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2965:1: ( rule__Call__ParametersAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_STRING)||LA29_0==24||(LA29_0>=29 && LA29_0<=30)||LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2965:2: rule__Call__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl6152);
                    rule__Call__ParametersAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getParametersAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2__Impl"


    // $ANTLR start "rule__Call__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2975:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2979:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2980:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__36183);
            rule__Call__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__36186);
            rule__Call__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__3"


    // $ANTLR start "rule__Call__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2987:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )* ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2991:1: ( ( ( rule__Call__Group_3__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2992:1: ( ( rule__Call__Group_3__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2992:1: ( ( rule__Call__Group_3__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2993:1: ( rule__Call__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2994:1: ( rule__Call__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==38) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2994:2: rule__Call__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl6213);
            	    rule__Call__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__3__Impl"


    // $ANTLR start "rule__Call__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3004:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3008:1: ( rule__Call__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3009:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__46244);
            rule__Call__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__4"


    // $ANTLR start "rule__Call__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3015:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3019:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3020:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3020:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3021:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__Call__Group__4__Impl6272); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__4__Impl"


    // $ANTLR start "rule__Call__Group_3__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3044:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3048:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3049:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__06313);
            rule__Call__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__06316);
            rule__Call__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__0"


    // $ANTLR start "rule__Call__Group_3__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3056:1: rule__Call__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3060:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3061:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3061:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3062:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3062:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3063:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3064:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3065:2: ','
            {
            match(input,38,FOLLOW_38_in_rule__Call__Group_3__0__Impl6347); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3069:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3070:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3071:1: ( ',' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3072:2: ','
            	    {
            	    match(input,38,FOLLOW_38_in_rule__Call__Group_3__0__Impl6363); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__0__Impl"


    // $ANTLR start "rule__Call__Group_3__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3084:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3088:1: ( rule__Call__Group_3__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3089:2: rule__Call__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__16398);
            rule__Call__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__1"


    // $ANTLR start "rule__Call__Group_3__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3095:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__ParametersAssignment_3_1 ) ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3099:1: ( ( ( rule__Call__ParametersAssignment_3_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3100:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3100:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3101:1: ( rule__Call__ParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersAssignment_3_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3102:1: ( rule__Call__ParametersAssignment_3_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3102:2: rule__Call__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl6425);
            rule__Call__ParametersAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getParametersAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__1__Impl"


    // $ANTLR start "rule__MetaMethod__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3116:1: rule__MetaMethod__Group__0 : rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 ;
    public final void rule__MetaMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3120:1: ( rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3121:2: rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__06459);
            rule__MetaMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__06462);
            rule__MetaMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__0"


    // $ANTLR start "rule__MetaMethod__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3128:1: rule__MetaMethod__Group__0__Impl : ( 'meta' ) ;
    public final void rule__MetaMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3132:1: ( ( 'meta' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3133:1: ( 'meta' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3133:1: ( 'meta' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3134:1: 'meta'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getMetaKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__MetaMethod__Group__0__Impl6490); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getMetaKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__0__Impl"


    // $ANTLR start "rule__MetaMethod__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3147:1: rule__MetaMethod__Group__1 : rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2 ;
    public final void rule__MetaMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3151:1: ( rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3152:2: rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__16521);
            rule__MetaMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__2_in_rule__MetaMethod__Group__16524);
            rule__MetaMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__1"


    // $ANTLR start "rule__MetaMethod__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3159:1: rule__MetaMethod__Group__1__Impl : ( ( rule__MetaMethod__TypeAssignment_1 ) ) ;
    public final void rule__MetaMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3163:1: ( ( ( rule__MetaMethod__TypeAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3164:1: ( ( rule__MetaMethod__TypeAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3164:1: ( ( rule__MetaMethod__TypeAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3165:1: ( rule__MetaMethod__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getTypeAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3166:1: ( rule__MetaMethod__TypeAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3166:2: rule__MetaMethod__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaMethod__TypeAssignment_1_in_rule__MetaMethod__Group__1__Impl6551);
            rule__MetaMethod__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__1__Impl"


    // $ANTLR start "rule__MetaMethod__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3176:1: rule__MetaMethod__Group__2 : rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3 ;
    public final void rule__MetaMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3180:1: ( rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3181:2: rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__2__Impl_in_rule__MetaMethod__Group__26581);
            rule__MetaMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__3_in_rule__MetaMethod__Group__26584);
            rule__MetaMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__2"


    // $ANTLR start "rule__MetaMethod__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3188:1: rule__MetaMethod__Group__2__Impl : ( ( rule__MetaMethod__NameAssignment_2 ) ) ;
    public final void rule__MetaMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3192:1: ( ( ( rule__MetaMethod__NameAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3193:1: ( ( rule__MetaMethod__NameAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3193:1: ( ( rule__MetaMethod__NameAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3194:1: ( rule__MetaMethod__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getNameAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3195:1: ( rule__MetaMethod__NameAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3195:2: rule__MetaMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MetaMethod__NameAssignment_2_in_rule__MetaMethod__Group__2__Impl6611);
            rule__MetaMethod__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__2__Impl"


    // $ANTLR start "rule__MetaMethod__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3205:1: rule__MetaMethod__Group__3 : rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4 ;
    public final void rule__MetaMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3209:1: ( rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3210:2: rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__3__Impl_in_rule__MetaMethod__Group__36641);
            rule__MetaMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__4_in_rule__MetaMethod__Group__36644);
            rule__MetaMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__3"


    // $ANTLR start "rule__MetaMethod__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3217:1: rule__MetaMethod__Group__3__Impl : ( '(' ) ;
    public final void rule__MetaMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3221:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3222:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3222:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3223:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__MetaMethod__Group__3__Impl6672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__3__Impl"


    // $ANTLR start "rule__MetaMethod__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3236:1: rule__MetaMethod__Group__4 : rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5 ;
    public final void rule__MetaMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3240:1: ( rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3241:2: rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__4__Impl_in_rule__MetaMethod__Group__46703);
            rule__MetaMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__5_in_rule__MetaMethod__Group__46706);
            rule__MetaMethod__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__4"


    // $ANTLR start "rule__MetaMethod__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3248:1: rule__MetaMethod__Group__4__Impl : ( ( rule__MetaMethod__ParametersAssignment_4 )? ) ;
    public final void rule__MetaMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3252:1: ( ( ( rule__MetaMethod__ParametersAssignment_4 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3253:1: ( ( rule__MetaMethod__ParametersAssignment_4 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3253:1: ( ( rule__MetaMethod__ParametersAssignment_4 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3254:1: ( rule__MetaMethod__ParametersAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3255:1: ( rule__MetaMethod__ParametersAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=32 && LA32_0<=34)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3255:2: rule__MetaMethod__ParametersAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MetaMethod__ParametersAssignment_4_in_rule__MetaMethod__Group__4__Impl6733);
                    rule__MetaMethod__ParametersAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getParametersAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__4__Impl"


    // $ANTLR start "rule__MetaMethod__Group__5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3265:1: rule__MetaMethod__Group__5 : rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6 ;
    public final void rule__MetaMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3269:1: ( rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3270:2: rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__5__Impl_in_rule__MetaMethod__Group__56764);
            rule__MetaMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__6_in_rule__MetaMethod__Group__56767);
            rule__MetaMethod__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__5"


    // $ANTLR start "rule__MetaMethod__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3277:1: rule__MetaMethod__Group__5__Impl : ( ( rule__MetaMethod__Group_5__0 )* ) ;
    public final void rule__MetaMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3281:1: ( ( ( rule__MetaMethod__Group_5__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3282:1: ( ( rule__MetaMethod__Group_5__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3282:1: ( ( rule__MetaMethod__Group_5__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3283:1: ( rule__MetaMethod__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getGroup_5()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3284:1: ( rule__MetaMethod__Group_5__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3284:2: rule__MetaMethod__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__MetaMethod__Group_5__0_in_rule__MetaMethod__Group__5__Impl6794);
            	    rule__MetaMethod__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__5__Impl"


    // $ANTLR start "rule__MetaMethod__Group__6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3294:1: rule__MetaMethod__Group__6 : rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7 ;
    public final void rule__MetaMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3298:1: ( rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3299:2: rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__6__Impl_in_rule__MetaMethod__Group__66825);
            rule__MetaMethod__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__7_in_rule__MetaMethod__Group__66828);
            rule__MetaMethod__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__6"


    // $ANTLR start "rule__MetaMethod__Group__6__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3306:1: rule__MetaMethod__Group__6__Impl : ( ')' ) ;
    public final void rule__MetaMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3310:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3311:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3311:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3312:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__MetaMethod__Group__6__Impl6856); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__6__Impl"


    // $ANTLR start "rule__MetaMethod__Group__7"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3325:1: rule__MetaMethod__Group__7 : rule__MetaMethod__Group__7__Impl ;
    public final void rule__MetaMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3329:1: ( rule__MetaMethod__Group__7__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3330:2: rule__MetaMethod__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__7__Impl_in_rule__MetaMethod__Group__76887);
            rule__MetaMethod__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__7"


    // $ANTLR start "rule__MetaMethod__Group__7__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3336:1: rule__MetaMethod__Group__7__Impl : ( ';' ) ;
    public final void rule__MetaMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3340:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3341:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3341:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3342:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getSemicolonKeyword_7()); 
            }
            match(input,43,FOLLOW_43_in_rule__MetaMethod__Group__7__Impl6915); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group__7__Impl"


    // $ANTLR start "rule__MetaMethod__Group_5__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3371:1: rule__MetaMethod__Group_5__0 : rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1 ;
    public final void rule__MetaMethod__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3375:1: ( rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3376:2: rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__0__Impl_in_rule__MetaMethod__Group_5__06962);
            rule__MetaMethod__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__1_in_rule__MetaMethod__Group_5__06965);
            rule__MetaMethod__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group_5__0"


    // $ANTLR start "rule__MetaMethod__Group_5__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3383:1: rule__MetaMethod__Group_5__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__MetaMethod__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3387:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3388:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3388:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3389:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3389:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3390:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3391:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3392:2: ','
            {
            match(input,38,FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl6996); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3396:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3397:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3398:1: ( ',' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3399:2: ','
            	    {
            	    match(input,38,FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl7012); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group_5__0__Impl"


    // $ANTLR start "rule__MetaMethod__Group_5__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3411:1: rule__MetaMethod__Group_5__1 : rule__MetaMethod__Group_5__1__Impl ;
    public final void rule__MetaMethod__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3415:1: ( rule__MetaMethod__Group_5__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3416:2: rule__MetaMethod__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__1__Impl_in_rule__MetaMethod__Group_5__17047);
            rule__MetaMethod__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group_5__1"


    // $ANTLR start "rule__MetaMethod__Group_5__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3422:1: rule__MetaMethod__Group_5__1__Impl : ( ( rule__MetaMethod__ParametersAssignment_5_1 ) ) ;
    public final void rule__MetaMethod__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3426:1: ( ( ( rule__MetaMethod__ParametersAssignment_5_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3427:1: ( ( rule__MetaMethod__ParametersAssignment_5_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3427:1: ( ( rule__MetaMethod__ParametersAssignment_5_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3428:1: ( rule__MetaMethod__ParametersAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersAssignment_5_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3429:1: ( rule__MetaMethod__ParametersAssignment_5_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3429:2: rule__MetaMethod__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MetaMethod__ParametersAssignment_5_1_in_rule__MetaMethod__Group_5__1__Impl7074);
            rule__MetaMethod__ParametersAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getParametersAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__Group_5__1__Impl"


    // $ANTLR start "rule__UserMethod__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3443:1: rule__UserMethod__Group__0 : rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 ;
    public final void rule__UserMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3447:1: ( rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3448:2: rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__07108);
            rule__UserMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__07111);
            rule__UserMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__0"


    // $ANTLR start "rule__UserMethod__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3455:1: rule__UserMethod__Group__0__Impl : ( ( rule__UserMethod__TypeAssignment_0 ) ) ;
    public final void rule__UserMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3459:1: ( ( ( rule__UserMethod__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3460:1: ( ( rule__UserMethod__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3460:1: ( ( rule__UserMethod__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3461:1: ( rule__UserMethod__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3462:1: ( rule__UserMethod__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3462:2: rule__UserMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__UserMethod__TypeAssignment_0_in_rule__UserMethod__Group__0__Impl7138);
            rule__UserMethod__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__0__Impl"


    // $ANTLR start "rule__UserMethod__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3472:1: rule__UserMethod__Group__1 : rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2 ;
    public final void rule__UserMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3476:1: ( rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3477:2: rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__17168);
            rule__UserMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__2_in_rule__UserMethod__Group__17171);
            rule__UserMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__1"


    // $ANTLR start "rule__UserMethod__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3484:1: rule__UserMethod__Group__1__Impl : ( ( rule__UserMethod__NameAssignment_1 ) ) ;
    public final void rule__UserMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3488:1: ( ( ( rule__UserMethod__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3489:1: ( ( rule__UserMethod__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3489:1: ( ( rule__UserMethod__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3490:1: ( rule__UserMethod__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3491:1: ( rule__UserMethod__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3491:2: rule__UserMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UserMethod__NameAssignment_1_in_rule__UserMethod__Group__1__Impl7198);
            rule__UserMethod__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__1__Impl"


    // $ANTLR start "rule__UserMethod__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3501:1: rule__UserMethod__Group__2 : rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3 ;
    public final void rule__UserMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3505:1: ( rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3506:2: rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__2__Impl_in_rule__UserMethod__Group__27228);
            rule__UserMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__3_in_rule__UserMethod__Group__27231);
            rule__UserMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__2"


    // $ANTLR start "rule__UserMethod__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3513:1: rule__UserMethod__Group__2__Impl : ( '(' ) ;
    public final void rule__UserMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3517:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3518:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3518:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3519:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__UserMethod__Group__2__Impl7259); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__2__Impl"


    // $ANTLR start "rule__UserMethod__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3532:1: rule__UserMethod__Group__3 : rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4 ;
    public final void rule__UserMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3536:1: ( rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3537:2: rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__3__Impl_in_rule__UserMethod__Group__37290);
            rule__UserMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__4_in_rule__UserMethod__Group__37293);
            rule__UserMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__3"


    // $ANTLR start "rule__UserMethod__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3544:1: rule__UserMethod__Group__3__Impl : ( ( rule__UserMethod__ParametersAssignment_3 )? ) ;
    public final void rule__UserMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3548:1: ( ( ( rule__UserMethod__ParametersAssignment_3 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3549:1: ( ( rule__UserMethod__ParametersAssignment_3 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3549:1: ( ( rule__UserMethod__ParametersAssignment_3 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3550:1: ( rule__UserMethod__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersAssignment_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3551:1: ( rule__UserMethod__ParametersAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=32 && LA35_0<=34)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3551:2: rule__UserMethod__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__UserMethod__ParametersAssignment_3_in_rule__UserMethod__Group__3__Impl7320);
                    rule__UserMethod__ParametersAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getParametersAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__3__Impl"


    // $ANTLR start "rule__UserMethod__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3561:1: rule__UserMethod__Group__4 : rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5 ;
    public final void rule__UserMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3565:1: ( rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3566:2: rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__4__Impl_in_rule__UserMethod__Group__47351);
            rule__UserMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__5_in_rule__UserMethod__Group__47354);
            rule__UserMethod__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__4"


    // $ANTLR start "rule__UserMethod__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3573:1: rule__UserMethod__Group__4__Impl : ( ( rule__UserMethod__Group_4__0 )* ) ;
    public final void rule__UserMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3577:1: ( ( ( rule__UserMethod__Group_4__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3578:1: ( ( rule__UserMethod__Group_4__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3578:1: ( ( rule__UserMethod__Group_4__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3579:1: ( rule__UserMethod__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getGroup_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3580:1: ( rule__UserMethod__Group_4__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3580:2: rule__UserMethod__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UserMethod__Group_4__0_in_rule__UserMethod__Group__4__Impl7381);
            	    rule__UserMethod__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__4__Impl"


    // $ANTLR start "rule__UserMethod__Group__5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3590:1: rule__UserMethod__Group__5 : rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6 ;
    public final void rule__UserMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3594:1: ( rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3595:2: rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__5__Impl_in_rule__UserMethod__Group__57412);
            rule__UserMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__6_in_rule__UserMethod__Group__57415);
            rule__UserMethod__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__5"


    // $ANTLR start "rule__UserMethod__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3602:1: rule__UserMethod__Group__5__Impl : ( ')' ) ;
    public final void rule__UserMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3606:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3607:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3607:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3608:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FOLLOW_39_in_rule__UserMethod__Group__5__Impl7443); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__5__Impl"


    // $ANTLR start "rule__UserMethod__Group__6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3621:1: rule__UserMethod__Group__6 : rule__UserMethod__Group__6__Impl ;
    public final void rule__UserMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3625:1: ( rule__UserMethod__Group__6__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3626:2: rule__UserMethod__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__6__Impl_in_rule__UserMethod__Group__67474);
            rule__UserMethod__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__6"


    // $ANTLR start "rule__UserMethod__Group__6__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3632:1: rule__UserMethod__Group__6__Impl : ( ( rule__UserMethod__BlAssignment_6 ) ) ;
    public final void rule__UserMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3636:1: ( ( ( rule__UserMethod__BlAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3637:1: ( ( rule__UserMethod__BlAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3637:1: ( ( rule__UserMethod__BlAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3638:1: ( rule__UserMethod__BlAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getBlAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3639:1: ( rule__UserMethod__BlAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3639:2: rule__UserMethod__BlAssignment_6
            {
            pushFollow(FOLLOW_rule__UserMethod__BlAssignment_6_in_rule__UserMethod__Group__6__Impl7501);
            rule__UserMethod__BlAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getBlAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group__6__Impl"


    // $ANTLR start "rule__UserMethod__Group_4__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3663:1: rule__UserMethod__Group_4__0 : rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1 ;
    public final void rule__UserMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3667:1: ( rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3668:2: rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1
            {
            pushFollow(FOLLOW_rule__UserMethod__Group_4__0__Impl_in_rule__UserMethod__Group_4__07545);
            rule__UserMethod__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group_4__1_in_rule__UserMethod__Group_4__07548);
            rule__UserMethod__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group_4__0"


    // $ANTLR start "rule__UserMethod__Group_4__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3675:1: rule__UserMethod__Group_4__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__UserMethod__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3679:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3680:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3680:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3681:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3681:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3682:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3683:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3684:2: ','
            {
            match(input,38,FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7579); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3688:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3689:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3690:1: ( ',' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==38) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3691:2: ','
            	    {
            	    match(input,38,FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7595); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group_4__0__Impl"


    // $ANTLR start "rule__UserMethod__Group_4__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3703:1: rule__UserMethod__Group_4__1 : rule__UserMethod__Group_4__1__Impl ;
    public final void rule__UserMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3707:1: ( rule__UserMethod__Group_4__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3708:2: rule__UserMethod__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UserMethod__Group_4__1__Impl_in_rule__UserMethod__Group_4__17630);
            rule__UserMethod__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group_4__1"


    // $ANTLR start "rule__UserMethod__Group_4__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3714:1: rule__UserMethod__Group_4__1__Impl : ( ( rule__UserMethod__ParametersAssignment_4_1 ) ) ;
    public final void rule__UserMethod__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3718:1: ( ( ( rule__UserMethod__ParametersAssignment_4_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3719:1: ( ( rule__UserMethod__ParametersAssignment_4_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3719:1: ( ( rule__UserMethod__ParametersAssignment_4_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3720:1: ( rule__UserMethod__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersAssignment_4_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3721:1: ( rule__UserMethod__ParametersAssignment_4_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3721:2: rule__UserMethod__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UserMethod__ParametersAssignment_4_1_in_rule__UserMethod__Group_4__1__Impl7657);
            rule__UserMethod__ParametersAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getParametersAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__Group_4__1__Impl"


    // $ANTLR start "rule__ParanValueExpression__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3735:1: rule__ParanValueExpression__Group__0 : rule__ParanValueExpression__Group__0__Impl rule__ParanValueExpression__Group__1 ;
    public final void rule__ParanValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3739:1: ( rule__ParanValueExpression__Group__0__Impl rule__ParanValueExpression__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3740:2: rule__ParanValueExpression__Group__0__Impl rule__ParanValueExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__0__Impl_in_rule__ParanValueExpression__Group__07691);
            rule__ParanValueExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__1_in_rule__ParanValueExpression__Group__07694);
            rule__ParanValueExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__0"


    // $ANTLR start "rule__ParanValueExpression__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3747:1: rule__ParanValueExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParanValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3751:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3752:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3752:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3753:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParanValueExpression__Group__0__Impl7722); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__0__Impl"


    // $ANTLR start "rule__ParanValueExpression__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3766:1: rule__ParanValueExpression__Group__1 : rule__ParanValueExpression__Group__1__Impl rule__ParanValueExpression__Group__2 ;
    public final void rule__ParanValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3770:1: ( rule__ParanValueExpression__Group__1__Impl rule__ParanValueExpression__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3771:2: rule__ParanValueExpression__Group__1__Impl rule__ParanValueExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__1__Impl_in_rule__ParanValueExpression__Group__17753);
            rule__ParanValueExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__2_in_rule__ParanValueExpression__Group__17756);
            rule__ParanValueExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__1"


    // $ANTLR start "rule__ParanValueExpression__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3778:1: rule__ParanValueExpression__Group__1__Impl : ( ( rule__ParanValueExpression__ExAssignment_1 ) ) ;
    public final void rule__ParanValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3782:1: ( ( ( rule__ParanValueExpression__ExAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3783:1: ( ( rule__ParanValueExpression__ExAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3783:1: ( ( rule__ParanValueExpression__ExAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3784:1: ( rule__ParanValueExpression__ExAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getExAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3785:1: ( rule__ParanValueExpression__ExAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3785:2: rule__ParanValueExpression__ExAssignment_1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__ExAssignment_1_in_rule__ParanValueExpression__Group__1__Impl7783);
            rule__ParanValueExpression__ExAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getExAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__1__Impl"


    // $ANTLR start "rule__ParanValueExpression__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3795:1: rule__ParanValueExpression__Group__2 : rule__ParanValueExpression__Group__2__Impl rule__ParanValueExpression__Group__3 ;
    public final void rule__ParanValueExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3799:1: ( rule__ParanValueExpression__Group__2__Impl rule__ParanValueExpression__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3800:2: rule__ParanValueExpression__Group__2__Impl rule__ParanValueExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__2__Impl_in_rule__ParanValueExpression__Group__27813);
            rule__ParanValueExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__3_in_rule__ParanValueExpression__Group__27816);
            rule__ParanValueExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__2"


    // $ANTLR start "rule__ParanValueExpression__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3807:1: rule__ParanValueExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParanValueExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3811:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3812:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3812:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3813:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__ParanValueExpression__Group__2__Impl7844); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__2__Impl"


    // $ANTLR start "rule__ParanValueExpression__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3826:1: rule__ParanValueExpression__Group__3 : rule__ParanValueExpression__Group__3__Impl ;
    public final void rule__ParanValueExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3830:1: ( rule__ParanValueExpression__Group__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3831:2: rule__ParanValueExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__3__Impl_in_rule__ParanValueExpression__Group__37875);
            rule__ParanValueExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__3"


    // $ANTLR start "rule__ParanValueExpression__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3837:1: rule__ParanValueExpression__Group__3__Impl : ( ( rule__ParanValueExpression__Group_3__0 )? ) ;
    public final void rule__ParanValueExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3841:1: ( ( ( rule__ParanValueExpression__Group_3__0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3842:1: ( ( rule__ParanValueExpression__Group_3__0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3842:1: ( ( rule__ParanValueExpression__Group_3__0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3843:1: ( rule__ParanValueExpression__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getGroup_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3844:1: ( rule__ParanValueExpression__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=13 && LA38_0<=26)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3844:2: rule__ParanValueExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__0_in_rule__ParanValueExpression__Group__3__Impl7902);
                    rule__ParanValueExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group__3__Impl"


    // $ANTLR start "rule__ParanValueExpression__Group_3__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3862:1: rule__ParanValueExpression__Group_3__0 : rule__ParanValueExpression__Group_3__0__Impl rule__ParanValueExpression__Group_3__1 ;
    public final void rule__ParanValueExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3866:1: ( rule__ParanValueExpression__Group_3__0__Impl rule__ParanValueExpression__Group_3__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3867:2: rule__ParanValueExpression__Group_3__0__Impl rule__ParanValueExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__0__Impl_in_rule__ParanValueExpression__Group_3__07941);
            rule__ParanValueExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__1_in_rule__ParanValueExpression__Group_3__07944);
            rule__ParanValueExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group_3__0"


    // $ANTLR start "rule__ParanValueExpression__Group_3__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3874:1: rule__ParanValueExpression__Group_3__0__Impl : ( ( rule__ParanValueExpression__OpAssignment_3_0 ) ) ;
    public final void rule__ParanValueExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3878:1: ( ( ( rule__ParanValueExpression__OpAssignment_3_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3879:1: ( ( rule__ParanValueExpression__OpAssignment_3_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3879:1: ( ( rule__ParanValueExpression__OpAssignment_3_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3880:1: ( rule__ParanValueExpression__OpAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getOpAssignment_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3881:1: ( rule__ParanValueExpression__OpAssignment_3_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3881:2: rule__ParanValueExpression__OpAssignment_3_0
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__OpAssignment_3_0_in_rule__ParanValueExpression__Group_3__0__Impl7971);
            rule__ParanValueExpression__OpAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getOpAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group_3__0__Impl"


    // $ANTLR start "rule__ParanValueExpression__Group_3__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3891:1: rule__ParanValueExpression__Group_3__1 : rule__ParanValueExpression__Group_3__1__Impl ;
    public final void rule__ParanValueExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3895:1: ( rule__ParanValueExpression__Group_3__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3896:2: rule__ParanValueExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__1__Impl_in_rule__ParanValueExpression__Group_3__18001);
            rule__ParanValueExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group_3__1"


    // $ANTLR start "rule__ParanValueExpression__Group_3__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3902:1: rule__ParanValueExpression__Group_3__1__Impl : ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) ) ;
    public final void rule__ParanValueExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3906:1: ( ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3907:1: ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3907:1: ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3908:1: ( rule__ParanValueExpression__VarrightAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getVarrightAssignment_3_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3909:1: ( rule__ParanValueExpression__VarrightAssignment_3_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3909:2: rule__ParanValueExpression__VarrightAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__VarrightAssignment_3_1_in_rule__ParanValueExpression__Group_3__1__Impl8028);
            rule__ParanValueExpression__VarrightAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getVarrightAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__Group_3__1__Impl"


    // $ANTLR start "rule__BasicValueExpression__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3923:1: rule__BasicValueExpression__Group__0 : rule__BasicValueExpression__Group__0__Impl rule__BasicValueExpression__Group__1 ;
    public final void rule__BasicValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3927:1: ( rule__BasicValueExpression__Group__0__Impl rule__BasicValueExpression__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3928:2: rule__BasicValueExpression__Group__0__Impl rule__BasicValueExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group__0__Impl_in_rule__BasicValueExpression__Group__08062);
            rule__BasicValueExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicValueExpression__Group__1_in_rule__BasicValueExpression__Group__08065);
            rule__BasicValueExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group__0"


    // $ANTLR start "rule__BasicValueExpression__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3935:1: rule__BasicValueExpression__Group__0__Impl : ( ( rule__BasicValueExpression__VarleftAssignment_0 ) ) ;
    public final void rule__BasicValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3939:1: ( ( ( rule__BasicValueExpression__VarleftAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3940:1: ( ( rule__BasicValueExpression__VarleftAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3940:1: ( ( rule__BasicValueExpression__VarleftAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3941:1: ( rule__BasicValueExpression__VarleftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarleftAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3942:1: ( rule__BasicValueExpression__VarleftAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3942:2: rule__BasicValueExpression__VarleftAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__VarleftAssignment_0_in_rule__BasicValueExpression__Group__0__Impl8092);
            rule__BasicValueExpression__VarleftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getVarleftAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group__0__Impl"


    // $ANTLR start "rule__BasicValueExpression__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3952:1: rule__BasicValueExpression__Group__1 : rule__BasicValueExpression__Group__1__Impl ;
    public final void rule__BasicValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3956:1: ( rule__BasicValueExpression__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3957:2: rule__BasicValueExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group__1__Impl_in_rule__BasicValueExpression__Group__18122);
            rule__BasicValueExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group__1"


    // $ANTLR start "rule__BasicValueExpression__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3963:1: rule__BasicValueExpression__Group__1__Impl : ( ( rule__BasicValueExpression__Group_1__0 )? ) ;
    public final void rule__BasicValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3967:1: ( ( ( rule__BasicValueExpression__Group_1__0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3968:1: ( ( rule__BasicValueExpression__Group_1__0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3968:1: ( ( rule__BasicValueExpression__Group_1__0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3969:1: ( rule__BasicValueExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getGroup_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3970:1: ( rule__BasicValueExpression__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=13 && LA39_0<=26)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3970:2: rule__BasicValueExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__0_in_rule__BasicValueExpression__Group__1__Impl8149);
                    rule__BasicValueExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group__1__Impl"


    // $ANTLR start "rule__BasicValueExpression__Group_1__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3984:1: rule__BasicValueExpression__Group_1__0 : rule__BasicValueExpression__Group_1__0__Impl rule__BasicValueExpression__Group_1__1 ;
    public final void rule__BasicValueExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3988:1: ( rule__BasicValueExpression__Group_1__0__Impl rule__BasicValueExpression__Group_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3989:2: rule__BasicValueExpression__Group_1__0__Impl rule__BasicValueExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__0__Impl_in_rule__BasicValueExpression__Group_1__08184);
            rule__BasicValueExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__1_in_rule__BasicValueExpression__Group_1__08187);
            rule__BasicValueExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group_1__0"


    // $ANTLR start "rule__BasicValueExpression__Group_1__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3996:1: rule__BasicValueExpression__Group_1__0__Impl : ( ( rule__BasicValueExpression__OpAssignment_1_0 ) ) ;
    public final void rule__BasicValueExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4000:1: ( ( ( rule__BasicValueExpression__OpAssignment_1_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4001:1: ( ( rule__BasicValueExpression__OpAssignment_1_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4001:1: ( ( rule__BasicValueExpression__OpAssignment_1_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4002:1: ( rule__BasicValueExpression__OpAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getOpAssignment_1_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4003:1: ( rule__BasicValueExpression__OpAssignment_1_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4003:2: rule__BasicValueExpression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__OpAssignment_1_0_in_rule__BasicValueExpression__Group_1__0__Impl8214);
            rule__BasicValueExpression__OpAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getOpAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BasicValueExpression__Group_1__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4013:1: rule__BasicValueExpression__Group_1__1 : rule__BasicValueExpression__Group_1__1__Impl ;
    public final void rule__BasicValueExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4017:1: ( rule__BasicValueExpression__Group_1__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4018:2: rule__BasicValueExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__1__Impl_in_rule__BasicValueExpression__Group_1__18244);
            rule__BasicValueExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group_1__1"


    // $ANTLR start "rule__BasicValueExpression__Group_1__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4024:1: rule__BasicValueExpression__Group_1__1__Impl : ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) ) ;
    public final void rule__BasicValueExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4028:1: ( ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4029:1: ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4029:1: ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4030:1: ( rule__BasicValueExpression__VarrightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarrightAssignment_1_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4031:1: ( rule__BasicValueExpression__VarrightAssignment_1_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4031:2: rule__BasicValueExpression__VarrightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__VarrightAssignment_1_1_in_rule__BasicValueExpression__Group_1__1__Impl8271);
            rule__BasicValueExpression__VarrightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getVarrightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__Group_1__1__Impl"


    // $ANTLR start "rule__Crement__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4045:1: rule__Crement__Group__0 : rule__Crement__Group__0__Impl rule__Crement__Group__1 ;
    public final void rule__Crement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4049:1: ( rule__Crement__Group__0__Impl rule__Crement__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4050:2: rule__Crement__Group__0__Impl rule__Crement__Group__1
            {
            pushFollow(FOLLOW_rule__Crement__Group__0__Impl_in_rule__Crement__Group__08305);
            rule__Crement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Crement__Group__1_in_rule__Crement__Group__08308);
            rule__Crement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crement__Group__0"


    // $ANTLR start "rule__Crement__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4057:1: rule__Crement__Group__0__Impl : ( ( rule__Crement__ValueAssignment_0 ) ) ;
    public final void rule__Crement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4061:1: ( ( ( rule__Crement__ValueAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4062:1: ( ( rule__Crement__ValueAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4062:1: ( ( rule__Crement__ValueAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4063:1: ( rule__Crement__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getValueAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4064:1: ( rule__Crement__ValueAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4064:2: rule__Crement__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Crement__ValueAssignment_0_in_rule__Crement__Group__0__Impl8335);
            rule__Crement__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementAccess().getValueAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crement__Group__0__Impl"


    // $ANTLR start "rule__Crement__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4074:1: rule__Crement__Group__1 : rule__Crement__Group__1__Impl ;
    public final void rule__Crement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4078:1: ( rule__Crement__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4079:2: rule__Crement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Crement__Group__1__Impl_in_rule__Crement__Group__18365);
            rule__Crement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crement__Group__1"


    // $ANTLR start "rule__Crement__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4085:1: rule__Crement__Group__1__Impl : ( ( rule__Crement__OpAssignment_1 ) ) ;
    public final void rule__Crement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4089:1: ( ( ( rule__Crement__OpAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4090:1: ( ( rule__Crement__OpAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4090:1: ( ( rule__Crement__OpAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4091:1: ( rule__Crement__OpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getOpAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4092:1: ( rule__Crement__OpAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4092:2: rule__Crement__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__Crement__OpAssignment_1_in_rule__Crement__Group__1__Impl8392);
            rule__Crement__OpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementAccess().getOpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crement__Group__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4106:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4110:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4111:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__08426);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__08429);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4118:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4122:1: ( ( 'if' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4123:1: ( 'if' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4123:1: ( 'if' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4124:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__If__Group__0__Impl8457); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4137:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4141:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4142:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__18488);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__18491);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4149:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4153:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4154:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4154:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4155:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__If__Group__1__Impl8519); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4168:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4172:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4173:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__28550);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__28553);
            rule__If__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4180:1: rule__If__Group__2__Impl : ( ( rule__If__ExAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4184:1: ( ( ( rule__If__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4185:1: ( ( rule__If__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4185:1: ( ( rule__If__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4186:1: ( rule__If__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4187:1: ( rule__If__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4187:2: rule__If__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl8580);
            rule__If__ExAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4197:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4201:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4202:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__38610);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__38613);
            rule__If__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4209:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4213:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4214:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4214:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4215:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__If__Group__3__Impl8641); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4228:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4232:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4233:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__48672);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__48675);
            rule__If__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4240:1: rule__If__Group__4__Impl : ( ( rule__If__BlAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4244:1: ( ( ( rule__If__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4245:1: ( ( rule__If__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4245:1: ( ( rule__If__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4246:1: ( rule__If__BlAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getBlAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4247:1: ( rule__If__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4247:2: rule__If__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl8702);
            rule__If__BlAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getBlAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4257:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4261:1: ( rule__If__Group__5__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4262:2: rule__If__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__58732);
            rule__If__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4268:1: rule__If__Group__5__Impl : ( ( rule__If__ElAssignment_5 )? ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4272:1: ( ( ( rule__If__ElAssignment_5 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4273:1: ( ( rule__If__ElAssignment_5 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4273:1: ( ( rule__If__ElAssignment_5 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4274:1: ( rule__If__ElAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElAssignment_5()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4275:1: ( rule__If__ElAssignment_5 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4275:2: rule__If__ElAssignment_5
                    {
                    pushFollow(FOLLOW_rule__If__ElAssignment_5_in_rule__If__Group__5__Impl8759);
                    rule__If__ElAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__Else__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4297:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4301:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4302:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__08802);
            rule__Else__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Else__Group__1_in_rule__Else__Group__08805);
            rule__Else__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0"


    // $ANTLR start "rule__Else__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4309:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4313:1: ( ( 'else' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4314:1: ( 'else' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4314:1: ( 'else' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4315:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__Else__Group__0__Impl8833); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseAccess().getElseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0__Impl"


    // $ANTLR start "rule__Else__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4328:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4332:1: ( rule__Else__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4333:2: rule__Else__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__18864);
            rule__Else__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__1"


    // $ANTLR start "rule__Else__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4339:1: rule__Else__Group__1__Impl : ( ( rule__Else__ExAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4343:1: ( ( ( rule__Else__ExAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4344:1: ( ( rule__Else__ExAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4344:1: ( ( rule__Else__ExAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4345:1: ( rule__Else__ExAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getExAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4346:1: ( rule__Else__ExAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4346:2: rule__Else__ExAssignment_1
            {
            pushFollow(FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl8891);
            rule__Else__ExAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseAccess().getExAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__1__Impl"


    // $ANTLR start "rule__For__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4360:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4364:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4365:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__08925);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__08928);
            rule__For__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0"


    // $ANTLR start "rule__For__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4372:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4376:1: ( ( 'for' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4377:1: ( 'for' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4377:1: ( 'for' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4378:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__For__Group__0__Impl8956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0__Impl"


    // $ANTLR start "rule__For__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4391:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4395:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4396:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__18987);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__18990);
            rule__For__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1"


    // $ANTLR start "rule__For__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4403:1: rule__For__Group__1__Impl : ( '(' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4407:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4408:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4408:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4409:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__For__Group__1__Impl9018); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1__Impl"


    // $ANTLR start "rule__For__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4422:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4426:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4427:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__29049);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__29052);
            rule__For__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2"


    // $ANTLR start "rule__For__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4434:1: rule__For__Group__2__Impl : ( ( rule__For__InitAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4438:1: ( ( ( rule__For__InitAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4439:1: ( ( rule__For__InitAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4439:1: ( ( rule__For__InitAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4440:1: ( rule__For__InitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getInitAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4441:1: ( rule__For__InitAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4441:2: rule__For__InitAssignment_2
            {
            pushFollow(FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl9079);
            rule__For__InitAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getInitAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2__Impl"


    // $ANTLR start "rule__For__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4451:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4455:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4456:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__39109);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__39112);
            rule__For__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3"


    // $ANTLR start "rule__For__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4463:1: rule__For__Group__3__Impl : ( ';' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4467:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4468:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4468:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4469:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSemicolonKeyword_3()); 
            }
            match(input,43,FOLLOW_43_in_rule__For__Group__3__Impl9140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3__Impl"


    // $ANTLR start "rule__For__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4482:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4486:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4487:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__49171);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__49174);
            rule__For__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4"


    // $ANTLR start "rule__For__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4494:1: rule__For__Group__4__Impl : ( ( rule__For__CheckAssignment_4 ) ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4498:1: ( ( ( rule__For__CheckAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4499:1: ( ( rule__For__CheckAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4499:1: ( ( rule__For__CheckAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4500:1: ( rule__For__CheckAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCheckAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4501:1: ( rule__For__CheckAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4501:2: rule__For__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl9201);
            rule__For__CheckAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCheckAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4__Impl"


    // $ANTLR start "rule__For__Group__5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4511:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4515:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4516:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__59231);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__59234);
            rule__For__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5"


    // $ANTLR start "rule__For__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4523:1: rule__For__Group__5__Impl : ( ';' ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4527:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4528:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4528:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4529:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSemicolonKeyword_5()); 
            }
            match(input,43,FOLLOW_43_in_rule__For__Group__5__Impl9262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5__Impl"


    // $ANTLR start "rule__For__Group__6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4542:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4546:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4547:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__69293);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__69296);
            rule__For__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6"


    // $ANTLR start "rule__For__Group__6__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4554:1: rule__For__Group__6__Impl : ( ( rule__For__ActionAssignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4558:1: ( ( ( rule__For__ActionAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4559:1: ( ( rule__For__ActionAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4559:1: ( ( rule__For__ActionAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4560:1: ( rule__For__ActionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getActionAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4561:1: ( rule__For__ActionAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4561:2: rule__For__ActionAssignment_6
            {
            pushFollow(FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl9323);
            rule__For__ActionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getActionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6__Impl"


    // $ANTLR start "rule__For__Group__7"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4571:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4575:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4576:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__79353);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__79356);
            rule__For__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7"


    // $ANTLR start "rule__For__Group__7__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4583:1: rule__For__Group__7__Impl : ( ')' ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4587:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4588:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4588:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4589:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,39,FOLLOW_39_in_rule__For__Group__7__Impl9384); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7__Impl"


    // $ANTLR start "rule__For__Group__8"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4602:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4606:1: ( rule__For__Group__8__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4607:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__89415);
            rule__For__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8"


    // $ANTLR start "rule__For__Group__8__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4613:1: rule__For__Group__8__Impl : ( ( rule__For__BlAssignment_8 ) ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4617:1: ( ( ( rule__For__BlAssignment_8 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4618:1: ( ( rule__For__BlAssignment_8 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4618:1: ( ( rule__For__BlAssignment_8 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4619:1: ( rule__For__BlAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getBlAssignment_8()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4620:1: ( rule__For__BlAssignment_8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4620:2: rule__For__BlAssignment_8
            {
            pushFollow(FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl9442);
            rule__For__BlAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getBlAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8__Impl"


    // $ANTLR start "rule__While__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4648:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4652:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4653:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__09490);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__09493);
            rule__While__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4660:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4664:1: ( ( 'while' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4665:1: ( 'while' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4665:1: ( 'while' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4666:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__While__Group__0__Impl9521); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4679:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4683:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4684:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__19552);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__19555);
            rule__While__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4691:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4695:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4696:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4696:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4697:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__While__Group__1__Impl9583); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4710:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4714:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4715:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__29614);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__29617);
            rule__While__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4722:1: rule__While__Group__2__Impl : ( ( rule__While__ExAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4726:1: ( ( ( rule__While__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4727:1: ( ( rule__While__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4727:1: ( ( rule__While__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4728:1: ( rule__While__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4729:1: ( rule__While__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4729:2: rule__While__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl9644);
            rule__While__ExAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4739:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4743:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4744:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__39674);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__39677);
            rule__While__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4751:1: rule__While__Group__3__Impl : ( ')' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4755:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4756:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4756:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4757:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__While__Group__3__Impl9705); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4770:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4774:1: ( rule__While__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4775:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__49736);
            rule__While__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4781:1: rule__While__Group__4__Impl : ( ( rule__While__BlAssignment_4 ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4785:1: ( ( ( rule__While__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4786:1: ( ( rule__While__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4786:1: ( ( rule__While__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4787:1: ( rule__While__BlAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4788:1: ( rule__While__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4788:2: rule__While__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl9763);
            rule__While__BlAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getBlAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__NegNumberValue__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4808:1: rule__NegNumberValue__Group__0 : rule__NegNumberValue__Group__0__Impl rule__NegNumberValue__Group__1 ;
    public final void rule__NegNumberValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4812:1: ( rule__NegNumberValue__Group__0__Impl rule__NegNumberValue__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4813:2: rule__NegNumberValue__Group__0__Impl rule__NegNumberValue__Group__1
            {
            pushFollow(FOLLOW_rule__NegNumberValue__Group__0__Impl_in_rule__NegNumberValue__Group__09803);
            rule__NegNumberValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NegNumberValue__Group__1_in_rule__NegNumberValue__Group__09806);
            rule__NegNumberValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegNumberValue__Group__0"


    // $ANTLR start "rule__NegNumberValue__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4820:1: rule__NegNumberValue__Group__0__Impl : ( '-' ) ;
    public final void rule__NegNumberValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4824:1: ( ( '-' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4825:1: ( '-' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4825:1: ( '-' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4826:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegNumberValueAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__NegNumberValue__Group__0__Impl9834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegNumberValueAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegNumberValue__Group__0__Impl"


    // $ANTLR start "rule__NegNumberValue__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4839:1: rule__NegNumberValue__Group__1 : rule__NegNumberValue__Group__1__Impl ;
    public final void rule__NegNumberValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4843:1: ( rule__NegNumberValue__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4844:2: rule__NegNumberValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NegNumberValue__Group__1__Impl_in_rule__NegNumberValue__Group__19865);
            rule__NegNumberValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegNumberValue__Group__1"


    // $ANTLR start "rule__NegNumberValue__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4850:1: rule__NegNumberValue__Group__1__Impl : ( ( rule__NegNumberValue__ValueAssignment_1 ) ) ;
    public final void rule__NegNumberValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4854:1: ( ( ( rule__NegNumberValue__ValueAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4855:1: ( ( rule__NegNumberValue__ValueAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4855:1: ( ( rule__NegNumberValue__ValueAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4856:1: ( rule__NegNumberValue__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegNumberValueAccess().getValueAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4857:1: ( rule__NegNumberValue__ValueAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4857:2: rule__NegNumberValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NegNumberValue__ValueAssignment_1_in_rule__NegNumberValue__Group__1__Impl9892);
            rule__NegNumberValue__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegNumberValueAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegNumberValue__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4871:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4875:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4876:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__09926);
            rule__Declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__09929);
            rule__Declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4883:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4887:1: ( ( ( rule__Declaration__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4888:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4888:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4889:1: ( rule__Declaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4890:1: ( rule__Declaration__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4890:2: rule__Declaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl9956);
            rule__Declaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4900:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4904:1: ( rule__Declaration__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4905:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__19986);
            rule__Declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4911:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4915:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4916:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4916:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4917:1: ( rule__Declaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4918:1: ( rule__Declaration__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4918:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl10013);
            rule__Declaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Return__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4932:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4936:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4937:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__010047);
            rule__Return__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Return__Group__1_in_rule__Return__Group__010050);
            rule__Return__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0"


    // $ANTLR start "rule__Return__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4944:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4948:1: ( ( 'return' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4949:1: ( 'return' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4949:1: ( 'return' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4950:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Return__Group__0__Impl10078); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0__Impl"


    // $ANTLR start "rule__Return__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4963:1: rule__Return__Group__1 : rule__Return__Group__1__Impl ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4967:1: ( rule__Return__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4968:2: rule__Return__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__110109);
            rule__Return__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1"


    // $ANTLR start "rule__Return__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4974:1: rule__Return__Group__1__Impl : ( ( rule__Return__ValueAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4978:1: ( ( ( rule__Return__ValueAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4979:1: ( ( rule__Return__ValueAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4979:1: ( ( rule__Return__ValueAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4980:1: ( rule__Return__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValueAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4981:1: ( rule__Return__ValueAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4981:2: rule__Return__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Return__ValueAssignment_1_in_rule__Return__Group__1__Impl10136);
            rule__Return__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1__Impl"


    // $ANTLR start "rule__CLfile__ScriptsAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4996:1: rule__CLfile__ScriptsAssignment_0 : ( ruleScript ) ;
    public final void rule__CLfile__ScriptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5000:1: ( ( ruleScript ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5001:1: ( ruleScript )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5001:1: ( ruleScript )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5002:1: ruleScript
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getScriptsScriptParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleScript_in_rule__CLfile__ScriptsAssignment_010175);
            ruleScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileAccess().getScriptsScriptParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLfile__ScriptsAssignment_0"


    // $ANTLR start "rule__CLfile__MetsAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5011:1: rule__CLfile__MetsAssignment_1 : ( ruleMetaMethods ) ;
    public final void rule__CLfile__MetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5015:1: ( ( ruleMetaMethods ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5016:1: ( ruleMetaMethods )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5016:1: ( ruleMetaMethods )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5017:1: ruleMetaMethods
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getMetsMetaMethodsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetaMethods_in_rule__CLfile__MetsAssignment_110206);
            ruleMetaMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileAccess().getMetsMetaMethodsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLfile__MetsAssignment_1"


    // $ANTLR start "rule__Script__NameAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5026:1: rule__Script__NameAssignment_1 : ( RULE_CAPITALFIRST ) ;
    public final void rule__Script__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5030:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5031:1: ( RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5031:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5032:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getNameCAPITALFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__NameAssignment_110237); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getNameCAPITALFIRSTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__NameAssignment_1"


    // $ANTLR start "rule__Script__RobottypesAssignment_4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5041:1: rule__Script__RobottypesAssignment_4 : ( ( rule__Script__RobottypesAlternatives_4_0 ) ) ;
    public final void rule__Script__RobottypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5045:1: ( ( ( rule__Script__RobottypesAlternatives_4_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5046:1: ( ( rule__Script__RobottypesAlternatives_4_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5046:1: ( ( rule__Script__RobottypesAlternatives_4_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5047:1: ( rule__Script__RobottypesAlternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAlternatives_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5048:1: ( rule__Script__RobottypesAlternatives_4_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5048:2: rule__Script__RobottypesAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAlternatives_4_0_in_rule__Script__RobottypesAssignment_410268);
            rule__Script__RobottypesAlternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobottypesAssignment_4"


    // $ANTLR start "rule__Script__RobotconfigsAssignment_6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5057:1: rule__Script__RobotconfigsAssignment_6 : ( ( rule__Script__RobotconfigsAlternatives_6_0 ) ) ;
    public final void rule__Script__RobotconfigsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5061:1: ( ( ( rule__Script__RobotconfigsAlternatives_6_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5062:1: ( ( rule__Script__RobotconfigsAlternatives_6_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5062:1: ( ( rule__Script__RobotconfigsAlternatives_6_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5063:1: ( rule__Script__RobotconfigsAlternatives_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_6_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5064:1: ( rule__Script__RobotconfigsAlternatives_6_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5064:2: rule__Script__RobotconfigsAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAlternatives_6_0_in_rule__Script__RobotconfigsAssignment_610301);
            rule__Script__RobotconfigsAlternatives_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobotconfigsAssignment_6"


    // $ANTLR start "rule__Script__RobottypesAssignment_8_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5073:1: rule__Script__RobottypesAssignment_8_2 : ( ( rule__Script__RobottypesAlternatives_8_2_0 ) ) ;
    public final void rule__Script__RobottypesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5077:1: ( ( ( rule__Script__RobottypesAlternatives_8_2_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5078:1: ( ( rule__Script__RobottypesAlternatives_8_2_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5078:1: ( ( rule__Script__RobottypesAlternatives_8_2_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5079:1: ( rule__Script__RobottypesAlternatives_8_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAlternatives_8_2_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5080:1: ( rule__Script__RobottypesAlternatives_8_2_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5080:2: rule__Script__RobottypesAlternatives_8_2_0
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAlternatives_8_2_0_in_rule__Script__RobottypesAssignment_8_210334);
            rule__Script__RobottypesAlternatives_8_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesAlternatives_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobottypesAssignment_8_2"


    // $ANTLR start "rule__Script__RobotconfigsAssignment_8_4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5089:1: rule__Script__RobotconfigsAssignment_8_4 : ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) ) ;
    public final void rule__Script__RobotconfigsAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5093:1: ( ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5094:1: ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5094:1: ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5095:1: ( rule__Script__RobotconfigsAlternatives_8_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_8_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5096:1: ( rule__Script__RobotconfigsAlternatives_8_4_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5096:2: rule__Script__RobotconfigsAlternatives_8_4_0
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAlternatives_8_4_0_in_rule__Script__RobotconfigsAssignment_8_410367);
            rule__Script__RobotconfigsAlternatives_8_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_8_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobotconfigsAssignment_8_4"


    // $ANTLR start "rule__Script__MethodsAssignment_10"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5105:1: rule__Script__MethodsAssignment_10 : ( ruleUserMethod ) ;
    public final void rule__Script__MethodsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5109:1: ( ( ruleUserMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5110:1: ( ruleUserMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5110:1: ( ruleUserMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5111:1: ruleUserMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_1010400);
            ruleUserMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__MethodsAssignment_10"


    // $ANTLR start "rule__MetaMethods__MethodsAssignment_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5120:1: rule__MetaMethods__MethodsAssignment_3 : ( ruleMetaMethod ) ;
    public final void rule__MetaMethods__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5124:1: ( ( ruleMetaMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5125:1: ( ruleMetaMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5125:1: ( ruleMetaMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5126:1: ruleMetaMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_310431);
            ruleMetaMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__MethodsAssignment_3"


    // $ANTLR start "rule__Block__ExsAssignment_2_0_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5135:1: rule__Block__ExsAssignment_2_0_0 : ( ruleSimpleExpression ) ;
    public final void rule__Block__ExsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5139:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5140:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5140:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5141:1: ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_010462);
            ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ExsAssignment_2_0_0"


    // $ANTLR start "rule__Block__ExsAssignment_2_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5150:1: rule__Block__ExsAssignment_2_1 : ( ruleStructureExpression ) ;
    public final void rule__Block__ExsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5154:1: ( ( ruleStructureExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5155:1: ( ruleStructureExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5155:1: ( ruleStructureExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5156:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_110493);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ExsAssignment_2_1"


    // $ANTLR start "rule__Assignment__VariAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5165:1: rule__Assignment__VariAssignment_0 : ( ( rule__Assignment__VariAlternatives_0_0 ) ) ;
    public final void rule__Assignment__VariAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5169:1: ( ( ( rule__Assignment__VariAlternatives_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5170:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5170:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5171:1: ( rule__Assignment__VariAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5172:1: ( rule__Assignment__VariAlternatives_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5172:2: rule__Assignment__VariAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_010524);
            rule__Assignment__VariAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VariAssignment_0"


    // $ANTLR start "rule__Assignment__OpAssignment_1_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5181:1: rule__Assignment__OpAssignment_1_0 : ( ruleMathOperator ) ;
    public final void rule__Assignment__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5185:1: ( ( ruleMathOperator ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5186:1: ( ruleMathOperator )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5186:1: ( ruleMathOperator )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5187:1: ruleMathOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpMathOperatorParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleMathOperator_in_rule__Assignment__OpAssignment_1_010557);
            ruleMathOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpMathOperatorParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OpAssignment_1_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_1_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5196:1: rule__Assignment__ValueAssignment_1_2 : ( ruleValueExpression ) ;
    public final void rule__Assignment__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5200:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5201:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5201:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5202:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Assignment__ValueAssignment_1_210588);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueValueExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_1_2"


    // $ANTLR start "rule__Call__ParametersAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5211:1: rule__Call__ParametersAssignment_2 : ( ruleValueExpression ) ;
    public final void rule__Call__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5215:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5216:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5216:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5217:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_210619);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ParametersAssignment_2"


    // $ANTLR start "rule__Call__ParametersAssignment_3_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5226:1: rule__Call__ParametersAssignment_3_1 : ( ruleValueExpression ) ;
    public final void rule__Call__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5230:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5231:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5231:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5232:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_3_110650);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ParametersAssignment_3_1"


    // $ANTLR start "rule__MetaMethod__TypeAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5241:1: rule__MetaMethod__TypeAssignment_1 : ( ruleMethodtype ) ;
    public final void rule__MetaMethod__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5245:1: ( ( ruleMethodtype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5246:1: ( ruleMethodtype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5246:1: ( ruleMethodtype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5247:1: ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getTypeMethodtypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_rule__MetaMethod__TypeAssignment_110681);
            ruleMethodtype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getTypeMethodtypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__TypeAssignment_1"


    // $ANTLR start "rule__MetaMethod__NameAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5256:1: rule__MetaMethod__NameAssignment_2 : ( RULE_CAPITALFIRST ) ;
    public final void rule__MetaMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5260:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5261:1: ( RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5261:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5262:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getNameCAPITALFIRSTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethod__NameAssignment_210712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getNameCAPITALFIRSTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__NameAssignment_2"


    // $ANTLR start "rule__MetaMethod__ParametersAssignment_4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5271:1: rule__MetaMethod__ParametersAssignment_4 : ( ruleDeclaration ) ;
    public final void rule__MetaMethod__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5275:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5276:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5276:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5277:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_410743);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__ParametersAssignment_4"


    // $ANTLR start "rule__MetaMethod__ParametersAssignment_5_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5286:1: rule__MetaMethod__ParametersAssignment_5_1 : ( ruleDeclaration ) ;
    public final void rule__MetaMethod__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5290:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5291:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5291:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5292:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_5_110774);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__ParametersAssignment_5_1"


    // $ANTLR start "rule__UserMethod__TypeAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5301:1: rule__UserMethod__TypeAssignment_0 : ( ruleMethodtype ) ;
    public final void rule__UserMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5305:1: ( ( ruleMethodtype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5306:1: ( ruleMethodtype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5306:1: ( ruleMethodtype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5307:1: ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_rule__UserMethod__TypeAssignment_010805);
            ruleMethodtype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__TypeAssignment_0"


    // $ANTLR start "rule__UserMethod__NameAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5316:1: rule__UserMethod__NameAssignment_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__UserMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5320:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5321:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5321:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5322:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__UserMethod__NameAssignment_110836); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__NameAssignment_1"


    // $ANTLR start "rule__UserMethod__ParametersAssignment_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5331:1: rule__UserMethod__ParametersAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__UserMethod__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5335:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5336:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5336:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5337:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_310867);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__ParametersAssignment_3"


    // $ANTLR start "rule__UserMethod__ParametersAssignment_4_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5346:1: rule__UserMethod__ParametersAssignment_4_1 : ( ruleDeclaration ) ;
    public final void rule__UserMethod__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5350:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5351:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5351:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5352:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_4_110898);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__ParametersAssignment_4_1"


    // $ANTLR start "rule__UserMethod__BlAssignment_6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5361:1: rule__UserMethod__BlAssignment_6 : ( ruleBlock ) ;
    public final void rule__UserMethod__BlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5365:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5366:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5366:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5367:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_610929);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__BlAssignment_6"


    // $ANTLR start "rule__UserMethodCall__MethodAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5376:1: rule__UserMethodCall__MethodAssignment : ( ( RULE_LOWERFIRST ) ) ;
    public final void rule__UserMethodCall__MethodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5380:1: ( ( ( RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5381:1: ( ( RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5381:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5382:1: ( RULE_LOWERFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallAccess().getMethodMethodCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5383:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5384:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallAccess().getMethodMethodLOWERFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__UserMethodCall__MethodAssignment10964); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodCallAccess().getMethodMethodLOWERFIRSTTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodCallAccess().getMethodMethodCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethodCall__MethodAssignment"


    // $ANTLR start "rule__MetaMethodCall__MethodAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5395:1: rule__MetaMethodCall__MethodAssignment : ( ( RULE_CAPITALFIRST ) ) ;
    public final void rule__MetaMethodCall__MethodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5399:1: ( ( ( RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5400:1: ( ( RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5400:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5401:1: ( RULE_CAPITALFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallAccess().getMethodMethodCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5402:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5403:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallAccess().getMethodMethodCAPITALFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethodCall__MethodAssignment11003); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodCallAccess().getMethodMethodCAPITALFIRSTTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodCallAccess().getMethodMethodCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethodCall__MethodAssignment"


    // $ANTLR start "rule__ParanValueExpression__ExAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5414:1: rule__ParanValueExpression__ExAssignment_1 : ( ruleValueExpression ) ;
    public final void rule__ParanValueExpression__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5418:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5419:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5419:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5420:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getExValueExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__ExAssignment_111038);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getExValueExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__ExAssignment_1"


    // $ANTLR start "rule__ParanValueExpression__OpAssignment_3_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5429:1: rule__ParanValueExpression__OpAssignment_3_0 : ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) ) ;
    public final void rule__ParanValueExpression__OpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5433:1: ( ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5434:1: ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5434:1: ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5435:1: ( rule__ParanValueExpression__OpAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getOpAlternatives_3_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5436:1: ( rule__ParanValueExpression__OpAlternatives_3_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5436:2: rule__ParanValueExpression__OpAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__OpAlternatives_3_0_0_in_rule__ParanValueExpression__OpAssignment_3_011069);
            rule__ParanValueExpression__OpAlternatives_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getOpAlternatives_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__OpAssignment_3_0"


    // $ANTLR start "rule__ParanValueExpression__VarrightAssignment_3_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5445:1: rule__ParanValueExpression__VarrightAssignment_3_1 : ( ruleValueExpression ) ;
    public final void rule__ParanValueExpression__VarrightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5449:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5450:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5450:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5451:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getVarrightValueExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__VarrightAssignment_3_111102);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParanValueExpressionAccess().getVarrightValueExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParanValueExpression__VarrightAssignment_3_1"


    // $ANTLR start "rule__BasicValueExpression__VarleftAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5460:1: rule__BasicValueExpression__VarleftAssignment_0 : ( ruleValue ) ;
    public final void rule__BasicValueExpression__VarleftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5464:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5465:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5465:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5466:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarleftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__BasicValueExpression__VarleftAssignment_011133);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getVarleftValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__VarleftAssignment_0"


    // $ANTLR start "rule__BasicValueExpression__OpAssignment_1_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5475:1: rule__BasicValueExpression__OpAssignment_1_0 : ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) ) ;
    public final void rule__BasicValueExpression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5479:1: ( ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5480:1: ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5480:1: ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5481:1: ( rule__BasicValueExpression__OpAlternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getOpAlternatives_1_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5482:1: ( rule__BasicValueExpression__OpAlternatives_1_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5482:2: rule__BasicValueExpression__OpAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__OpAlternatives_1_0_0_in_rule__BasicValueExpression__OpAssignment_1_011164);
            rule__BasicValueExpression__OpAlternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getOpAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__OpAssignment_1_0"


    // $ANTLR start "rule__BasicValueExpression__VarrightAssignment_1_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5491:1: rule__BasicValueExpression__VarrightAssignment_1_1 : ( ruleValueExpression ) ;
    public final void rule__BasicValueExpression__VarrightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5495:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5496:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5496:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5497:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarrightValueExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__BasicValueExpression__VarrightAssignment_1_111197);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueExpressionAccess().getVarrightValueExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicValueExpression__VarrightAssignment_1_1"


    // $ANTLR start "rule__Crement__ValueAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5506:1: rule__Crement__ValueAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Crement__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5510:1: ( ( ruleVarReference ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5511:1: ( ruleVarReference )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5511:1: ( ruleVarReference )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5512:1: ruleVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getValueVarReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_rule__Crement__ValueAssignment_011228);
            ruleVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementAccess().getValueVarReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crement__ValueAssignment_0"


    // $ANTLR start "rule__Crement__OpAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5521:1: rule__Crement__OpAssignment_1 : ( ruleCrementOperator ) ;
    public final void rule__Crement__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5525:1: ( ( ruleCrementOperator ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5526:1: ( ruleCrementOperator )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5526:1: ( ruleCrementOperator )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5527:1: ruleCrementOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getOpCrementOperatorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCrementOperator_in_rule__Crement__OpAssignment_111259);
            ruleCrementOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrementAccess().getOpCrementOperatorParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Crement__OpAssignment_1"


    // $ANTLR start "rule__If__ExAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5536:1: rule__If__ExAssignment_2 : ( ruleValueExpression ) ;
    public final void rule__If__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5540:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5541:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5541:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5542:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__If__ExAssignment_211290);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ExAssignment_2"


    // $ANTLR start "rule__If__BlAssignment_4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5551:1: rule__If__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__If__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5555:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5556:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5556:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5557:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__If__BlAssignment_411321);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__BlAssignment_4"


    // $ANTLR start "rule__If__ElAssignment_5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5566:1: rule__If__ElAssignment_5 : ( ruleElse ) ;
    public final void rule__If__ElAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5570:1: ( ( ruleElse ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5571:1: ( ruleElse )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5571:1: ( ruleElse )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5572:1: ruleElse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElElseParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleElse_in_rule__If__ElAssignment_511352);
            ruleElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElElseParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ElAssignment_5"


    // $ANTLR start "rule__Else__ExAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5581:1: rule__Else__ExAssignment_1 : ( ruleExpression ) ;
    public final void rule__Else__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5585:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5586:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5586:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5587:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Else__ExAssignment_111383);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__ExAssignment_1"


    // $ANTLR start "rule__For__InitAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5596:1: rule__For__InitAssignment_2 : ( ruleSimpleExpression ) ;
    public final void rule__For__InitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5600:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5601:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5601:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5602:1: ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getInitSimpleExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__For__InitAssignment_211414);
            ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getInitSimpleExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__InitAssignment_2"


    // $ANTLR start "rule__For__CheckAssignment_4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5611:1: rule__For__CheckAssignment_4 : ( ruleValueExpression ) ;
    public final void rule__For__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5615:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5616:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5616:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5617:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCheckValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__For__CheckAssignment_411445);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCheckValueExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__CheckAssignment_4"


    // $ANTLR start "rule__For__ActionAssignment_6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5626:1: rule__For__ActionAssignment_6 : ( ruleSimpleExpression ) ;
    public final void rule__For__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5630:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5631:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5631:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5632:1: ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getActionSimpleExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__For__ActionAssignment_611476);
            ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getActionSimpleExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__ActionAssignment_6"


    // $ANTLR start "rule__For__BlAssignment_8"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5641:1: rule__For__BlAssignment_8 : ( ruleBlock ) ;
    public final void rule__For__BlAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5645:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5646:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5646:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5647:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__For__BlAssignment_811507);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__BlAssignment_8"


    // $ANTLR start "rule__While__ExAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5656:1: rule__While__ExAssignment_2 : ( ruleValueExpression ) ;
    public final void rule__While__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5660:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5661:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5661:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5662:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__While__ExAssignment_211538);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExValueExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ExAssignment_2"


    // $ANTLR start "rule__While__BlAssignment_4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5671:1: rule__While__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__While__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5675:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5676:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5676:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5677:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__While__BlAssignment_411569);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__BlAssignment_4"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5686:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5690:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5691:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5691:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5692:1: ( rule__BooleanValue__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5693:1: ( rule__BooleanValue__ValueAlternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5693:2: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment11600);
            rule__BooleanValue__ValueAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5702:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5706:1: ( ( RULE_STRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5707:1: ( RULE_STRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5707:1: ( RULE_STRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5708:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11633); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5717:1: rule__NumberValue__ValueAssignment : ( ruleINTSTRING ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5721:1: ( ( ruleINTSTRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5722:1: ( ruleINTSTRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5722:1: ( ruleINTSTRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5723:1: ruleINTSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment11664);
            ruleINTSTRING();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"


    // $ANTLR start "rule__NegNumberValue__ValueAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5732:1: rule__NegNumberValue__ValueAssignment_1 : ( ruleINTSTRING ) ;
    public final void rule__NegNumberValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5736:1: ( ( ruleINTSTRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5737:1: ( ruleINTSTRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5737:1: ( ruleINTSTRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5738:1: ruleINTSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegNumberValueAccess().getValueINTSTRINGParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_rule__NegNumberValue__ValueAssignment_111695);
            ruleINTSTRING();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegNumberValueAccess().getValueINTSTRINGParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegNumberValue__ValueAssignment_1"


    // $ANTLR start "rule__VarReference__VariAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5747:1: rule__VarReference__VariAssignment : ( ( RULE_LOWERFIRST ) ) ;
    public final void rule__VarReference__VariAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5751:1: ( ( ( RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5752:1: ( ( RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5752:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5753:1: ( RULE_LOWERFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariDeclarationCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5754:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5755:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariDeclarationLOWERFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__VarReference__VariAssignment11730); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReferenceAccess().getVariDeclarationLOWERFIRSTTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReferenceAccess().getVariDeclarationCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarReference__VariAssignment"


    // $ANTLR start "rule__Declaration__TypeAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5766:1: rule__Declaration__TypeAssignment_0 : ( ruleDatatype ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5770:1: ( ( ruleDatatype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5771:1: ( ruleDatatype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5771:1: ( ruleDatatype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5772:1: ruleDatatype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_011765);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TypeAssignment_0"


    // $ANTLR start "rule__Declaration__NameAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5781:1: rule__Declaration__NameAssignment_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5785:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5786:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5786:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5787:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Declaration__NameAssignment_111796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__NameAssignment_1"


    // $ANTLR start "rule__Return__ValueAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5796:1: rule__Return__ValueAssignment_1 : ( ruleValueExpression ) ;
    public final void rule__Return__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5800:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5801:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5801:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5802:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValueValueExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Return__ValueAssignment_111827);
            ruleValueExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getValueValueExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCLfile_in_entryRuleCLfile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLfile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__Group__0_in_ruleCLfile100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0_in_ruleScript160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethods194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__0_in_ruleMetaMethods220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Alternatives_in_ruleStructureExpression400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethod616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__0_in_ruleMetaMethod642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_entryRuleUserMethod669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethod676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__0_in_ruleUserMethod702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethodCall736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethodCall__MethodAssignment_in_ruleUserMethodCall762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethodCall796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethodCall__MethodAssignment_in_ruleMetaMethodCall822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueExpression__Alternatives_in_ruleValueExpression882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanValueExpression_in_entryRuleParanValueExpression909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanValueExpression916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__0_in_ruleParanValueExpression942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValueExpression_in_entryRuleBasicValueExpression969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValueExpression976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group__0_in_ruleBasicValueExpression1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrement_in_entryRuleCrement1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrement1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__Group__0_in_ruleCrement1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanOperator__Alternatives_in_ruleBooleanOperator1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_entryRuleMathOperator1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperator1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__Alternatives_in_ruleMathOperator1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrementOperator_in_entryRuleCrementOperator1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrementOperator1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrementOperator__Alternatives_in_ruleCrementOperator1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_entryRuleElse1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElse1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__0_in_ruleElse1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_entryRuleBasicValue1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValue1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValue__Alternatives_in_ruleBasicValue1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue1809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegNumberValue_in_entryRuleNegNumberValue1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegNumberValue1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegNumberValue__Group__0_in_ruleNegNumberValue1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_entryRuleVarReference1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReference1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0_in_ruleReturn2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_entryRuleMethodtype2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodtype2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTSTRING2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTSTRING2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_4_02297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_4_02314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_6_02346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_6_02363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_8_2_02395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_8_2_02412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_22493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_22511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrement_in_rule__SimpleExpression__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_rule__SimpleExpression__Alternatives2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Assignment__VariAlternatives_0_02759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_rule__Call__Alternatives_02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_rule__Call__Alternatives_02825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanValueExpression_in_rule__ValueExpression__Alternatives2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValueExpression_in_rule__ValueExpression__Alternatives2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_03007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComparisonOperator__Alternatives3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanOperator__Alternatives3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BooleanOperator__Alternatives3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BooleanOperator__Alternatives3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BooleanOperator__Alternatives3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MathOperator__Alternatives3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MathOperator__Alternatives3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MathOperator__Alternatives3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MathOperator__Alternatives3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CrementOperator__Alternatives3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CrementOperator__Alternatives3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__Value__Alternatives3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Value__Alternatives3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_rule__Value__Alternatives3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegNumberValue_in_rule__BasicValue__Alternatives3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BooleanValue__ValueAlternatives_03569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BooleanValue__ValueAlternatives_03589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Methodtype__Alternatives3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Datatype__Alternatives3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Datatype__Alternatives3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Datatype__Alternatives3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__Group__0__Impl_in_rule__CLfile__Group__03748 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__CLfile__Group__1_in_rule__CLfile__Group__03751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__ScriptsAssignment_0_in_rule__CLfile__Group__0__Impl3778 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__CLfile__Group__1__Impl_in_rule__CLfile__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__MetsAssignment_1_in_rule__CLfile__Group__1__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__03870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__03873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Script__Group__0__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__13932 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__13935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__23992 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__3_in_rule__Script__Group__23995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Script__Group__2__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__34054 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group__4_in_rule__Script__Group__34057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Script__Group__3__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__44116 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__5_in_rule__Script__Group__44119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_4_in_rule__Script__Group__4__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__54176 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group__6_in_rule__Script__Group__54179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Script__Group__5__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__64238 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__7_in_rule__Script__Group__64241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_6_in_rule__Script__Group__6__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__74298 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__8_in_rule__Script__Group__74301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Script__Group__7__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__8__Impl_in_rule__Script__Group__84360 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__9_in_rule__Script__Group__84363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__0_in_rule__Script__Group__8__Impl4390 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__9__Impl_in_rule__Script__Group__94421 = new BitSet(new long[]{0x0000020780000000L});
    public static final BitSet FOLLOW_rule__Script__Group__10_in_rule__Script__Group__94424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Script__Group__9__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__10__Impl_in_rule__Script__Group__104483 = new BitSet(new long[]{0x0000020780000000L});
    public static final BitSet FOLLOW_rule__Script__Group__11_in_rule__Script__Group__104486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__MethodsAssignment_10_in_rule__Script__Group__10__Impl4513 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_rule__Script__Group__11__Impl_in_rule__Script__Group__114544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Script__Group__11__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__0__Impl_in_rule__Script__Group_8__04627 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Script__Group_8__1_in_rule__Script__Group_8__04630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Script__Group_8__0__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__1__Impl_in_rule__Script__Group_8__14689 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group_8__2_in_rule__Script__Group_8__14692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Script__Group_8__1__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__2__Impl_in_rule__Script__Group_8__24751 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Script__Group_8__3_in_rule__Script__Group_8__24754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_8_2_in_rule__Script__Group_8__2__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__3__Impl_in_rule__Script__Group_8__34811 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group_8__4_in_rule__Script__Group_8__34814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Script__Group_8__3__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__4__Impl_in_rule__Script__Group_8__44873 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Script__Group_8__5_in_rule__Script__Group_8__44876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_8_4_in_rule__Script__Group_8__4__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__5__Impl_in_rule__Script__Group_8__54933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Script__Group_8__5__Impl4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__05004 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__05007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__15065 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__15068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MetaMethods__Group__1__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__25127 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__25130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MetaMethods__Group__2__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__35189 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__35192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl5219 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__45250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MetaMethods__Group__4__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05319 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15380 = new BitSet(new long[]{0x0007430780000060L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Block__Group__1__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25442 = new BitSet(new long[]{0x0007430780000060L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl5472 = new BitSet(new long[]{0x0007410780000062L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Block__Group__3__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__05570 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Block__Group_2_0__1__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05693 = new BitSet(new long[]{0x0000100007800000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Group__1__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__05814 = new BitSet(new long[]{0x0000100007800000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__05817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__OpAssignment_1_0_in_rule__Assignment__Group_1__0__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__15875 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__15878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Assignment__Group_1__1__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__25937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_1_2_in_rule__Assignment__Group_1__2__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__06000 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__06003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Alternatives_0_in_rule__Call__Group__0__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__16060 = new BitSet(new long[]{0x000000E0610000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__16063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Call__Group__1__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__26122 = new BitSet(new long[]{0x000000E0610000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__26125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__36183 = new BitSet(new long[]{0x000000E0610000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__36186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl6213 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__46244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Call__Group__4__Impl6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__06313 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__06316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Call__Group_3__0__Impl6347 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rule__Call__Group_3__0__Impl6363 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__16398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__06459 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__06462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MetaMethod__Group__0__Impl6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__16521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__2_in_rule__MetaMethod__Group__16524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__TypeAssignment_1_in_rule__MetaMethod__Group__1__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__2__Impl_in_rule__MetaMethod__Group__26581 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__3_in_rule__MetaMethod__Group__26584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__NameAssignment_2_in_rule__MetaMethod__Group__2__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__3__Impl_in_rule__MetaMethod__Group__36641 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__4_in_rule__MetaMethod__Group__36644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MetaMethod__Group__3__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__4__Impl_in_rule__MetaMethod__Group__46703 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__5_in_rule__MetaMethod__Group__46706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__ParametersAssignment_4_in_rule__MetaMethod__Group__4__Impl6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__5__Impl_in_rule__MetaMethod__Group__56764 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__6_in_rule__MetaMethod__Group__56767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__0_in_rule__MetaMethod__Group__5__Impl6794 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__6__Impl_in_rule__MetaMethod__Group__66825 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__7_in_rule__MetaMethod__Group__66828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MetaMethod__Group__6__Impl6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__7__Impl_in_rule__MetaMethod__Group__76887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaMethod__Group__7__Impl6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__0__Impl_in_rule__MetaMethod__Group_5__06962 = new BitSet(new long[]{0x0000000780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__1_in_rule__MetaMethod__Group_5__06965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl6996 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl7012 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__1__Impl_in_rule__MetaMethod__Group_5__17047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__ParametersAssignment_5_1_in_rule__MetaMethod__Group_5__1__Impl7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__07108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__07111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__TypeAssignment_0_in_rule__UserMethod__Group__0__Impl7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__17168 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__2_in_rule__UserMethod__Group__17171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__NameAssignment_1_in_rule__UserMethod__Group__1__Impl7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__2__Impl_in_rule__UserMethod__Group__27228 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__3_in_rule__UserMethod__Group__27231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__UserMethod__Group__2__Impl7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__3__Impl_in_rule__UserMethod__Group__37290 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__4_in_rule__UserMethod__Group__37293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__ParametersAssignment_3_in_rule__UserMethod__Group__3__Impl7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__4__Impl_in_rule__UserMethod__Group__47351 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__5_in_rule__UserMethod__Group__47354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__0_in_rule__UserMethod__Group__4__Impl7381 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__5__Impl_in_rule__UserMethod__Group__57412 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__6_in_rule__UserMethod__Group__57415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__UserMethod__Group__5__Impl7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__6__Impl_in_rule__UserMethod__Group__67474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__BlAssignment_6_in_rule__UserMethod__Group__6__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__0__Impl_in_rule__UserMethod__Group_4__07545 = new BitSet(new long[]{0x0000000780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__1_in_rule__UserMethod__Group_4__07548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7579 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7595 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__1__Impl_in_rule__UserMethod__Group_4__17630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__ParametersAssignment_4_1_in_rule__UserMethod__Group_4__1__Impl7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__0__Impl_in_rule__ParanValueExpression__Group__07691 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__1_in_rule__ParanValueExpression__Group__07694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParanValueExpression__Group__0__Impl7722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__1__Impl_in_rule__ParanValueExpression__Group__17753 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__2_in_rule__ParanValueExpression__Group__17756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__ExAssignment_1_in_rule__ParanValueExpression__Group__1__Impl7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__2__Impl_in_rule__ParanValueExpression__Group__27813 = new BitSet(new long[]{0x0000000007FFE000L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__3_in_rule__ParanValueExpression__Group__27816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ParanValueExpression__Group__2__Impl7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__3__Impl_in_rule__ParanValueExpression__Group__37875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__0_in_rule__ParanValueExpression__Group__3__Impl7902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__0__Impl_in_rule__ParanValueExpression__Group_3__07941 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__1_in_rule__ParanValueExpression__Group_3__07944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__OpAssignment_3_0_in_rule__ParanValueExpression__Group_3__0__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__1__Impl_in_rule__ParanValueExpression__Group_3__18001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__VarrightAssignment_3_1_in_rule__ParanValueExpression__Group_3__1__Impl8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group__0__Impl_in_rule__BasicValueExpression__Group__08062 = new BitSet(new long[]{0x0000000007FFE000L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group__1_in_rule__BasicValueExpression__Group__08065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__VarleftAssignment_0_in_rule__BasicValueExpression__Group__0__Impl8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group__1__Impl_in_rule__BasicValueExpression__Group__18122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__0_in_rule__BasicValueExpression__Group__1__Impl8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__0__Impl_in_rule__BasicValueExpression__Group_1__08184 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__1_in_rule__BasicValueExpression__Group_1__08187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__OpAssignment_1_0_in_rule__BasicValueExpression__Group_1__0__Impl8214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__1__Impl_in_rule__BasicValueExpression__Group_1__18244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__VarrightAssignment_1_1_in_rule__BasicValueExpression__Group_1__1__Impl8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__Group__0__Impl_in_rule__Crement__Group__08305 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Crement__Group__1_in_rule__Crement__Group__08308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__ValueAssignment_0_in_rule__Crement__Group__0__Impl8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__Group__1__Impl_in_rule__Crement__Group__18365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__OpAssignment_1_in_rule__Crement__Group__1__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__08426 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__08429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__If__Group__0__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__18488 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__18491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__If__Group__1__Impl8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__28550 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__28553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__38610 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__38613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__If__Group__3__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__48672 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__48675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__58732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ElAssignment_5_in_rule__If__Group__5__Impl8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__08802 = new BitSet(new long[]{0x0007410780000060L});
    public static final BitSet FOLLOW_rule__Else__Group__1_in_rule__Else__Group__08805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Else__Group__0__Impl8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__18864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__08925 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__08928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__For__Group__0__Impl8956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__18987 = new BitSet(new long[]{0x0004000780000060L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__18990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__For__Group__1__Impl9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__29049 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__29052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__39109 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__39112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__For__Group__3__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__49171 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__49174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__59231 = new BitSet(new long[]{0x0004000780000060L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__59234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__For__Group__5__Impl9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__69293 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__69296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__79353 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__79356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__For__Group__7__Impl9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__89415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__09490 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__09493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__While__Group__0__Impl9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__19552 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__While__Group__1__Impl9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__29614 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__29617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__39674 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__39677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__While__Group__3__Impl9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__49736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl9763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegNumberValue__Group__0__Impl_in_rule__NegNumberValue__Group__09803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NegNumberValue__Group__1_in_rule__NegNumberValue__Group__09806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NegNumberValue__Group__0__Impl9834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegNumberValue__Group__1__Impl_in_rule__NegNumberValue__Group__19865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegNumberValue__ValueAssignment_1_in_rule__NegNumberValue__Group__1__Impl9892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__09926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__09929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl9956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__19986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl10013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__010047 = new BitSet(new long[]{0x00000020610000F0L});
    public static final BitSet FOLLOW_rule__Return__Group__1_in_rule__Return__Group__010050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Return__Group__0__Impl10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__110109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__ValueAssignment_1_in_rule__Return__Group__1__Impl10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__CLfile__ScriptsAssignment_010175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_rule__CLfile__MetsAssignment_110206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__NameAssignment_110237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAlternatives_4_0_in_rule__Script__RobottypesAssignment_410268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAlternatives_6_0_in_rule__Script__RobotconfigsAssignment_610301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAlternatives_8_2_0_in_rule__Script__RobottypesAssignment_8_210334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAlternatives_8_4_0_in_rule__Script__RobotconfigsAssignment_8_410367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_1010400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_310431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_010462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_110493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_010524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__Assignment__OpAssignment_1_010557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Assignment__ValueAssignment_1_210588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_210619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_3_110650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_rule__MetaMethod__TypeAssignment_110681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethod__NameAssignment_210712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_410743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_5_110774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_rule__UserMethod__TypeAssignment_010805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__UserMethod__NameAssignment_110836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_310867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_4_110898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_610929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__UserMethodCall__MethodAssignment10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethodCall__MethodAssignment11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__ExAssignment_111038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__OpAlternatives_3_0_0_in_rule__ParanValueExpression__OpAssignment_3_011069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__VarrightAssignment_3_111102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__BasicValueExpression__VarleftAssignment_011133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__OpAlternatives_1_0_0_in_rule__BasicValueExpression__OpAssignment_1_011164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__BasicValueExpression__VarrightAssignment_1_111197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Crement__ValueAssignment_011228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrementOperator_in_rule__Crement__OpAssignment_111259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__If__ExAssignment_211290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__If__BlAssignment_411321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_rule__If__ElAssignment_511352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Else__ExAssignment_111383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__For__InitAssignment_211414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__For__CheckAssignment_411445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__For__ActionAssignment_611476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__For__BlAssignment_811507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__While__ExAssignment_211538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__While__BlAssignment_411569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_rule__NegNumberValue__ValueAssignment_111695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__VarReference__VariAssignment11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_011765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Declaration__NameAssignment_111796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Return__ValueAssignment_111827 = new BitSet(new long[]{0x0000000000000002L});

}