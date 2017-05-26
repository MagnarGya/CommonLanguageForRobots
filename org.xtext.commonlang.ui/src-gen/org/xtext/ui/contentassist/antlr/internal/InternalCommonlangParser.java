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


    // $ANTLR start "entryRuleVarReference"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:903:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:904:1: ( ruleVarReference EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:905:1: ruleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_entryRuleVarReference1869);
            ruleVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReference1876); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:912:1: ruleVarReference : ( ( rule__VarReference__VariAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:916:2: ( ( ( rule__VarReference__VariAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:917:1: ( ( rule__VarReference__VariAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:917:1: ( ( rule__VarReference__VariAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:918:1: ( rule__VarReference__VariAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:919:1: ( rule__VarReference__VariAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:919:2: rule__VarReference__VariAssignment
            {
            pushFollow(FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1902);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:931:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:932:1: ( ruleDeclaration EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:933:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1929);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1936); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:940:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:944:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:945:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:945:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:946:1: ( rule__Declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:947:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:947:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration1962);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:959:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:960:1: ( ruleReturn EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:961:1: ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn1989);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn1996); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:968:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:972:2: ( ( ( rule__Return__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:973:1: ( ( rule__Return__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:973:1: ( ( rule__Return__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:974:1: ( rule__Return__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:975:1: ( rule__Return__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:975:2: rule__Return__Group__0
            {
            pushFollow(FOLLOW_rule__Return__Group__0_in_ruleReturn2022);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:987:1: entryRuleMethodtype : ruleMethodtype EOF ;
    public final void entryRuleMethodtype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:988:1: ( ruleMethodtype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:989:1: ruleMethodtype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodtypeRule()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_entryRuleMethodtype2049);
            ruleMethodtype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodtypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodtype2056); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:996:1: ruleMethodtype : ( ( rule__Methodtype__Alternatives ) ) ;
    public final void ruleMethodtype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1000:2: ( ( ( rule__Methodtype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1001:1: ( ( rule__Methodtype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1001:1: ( ( rule__Methodtype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1002:1: ( rule__Methodtype__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodtypeAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1003:1: ( rule__Methodtype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1003:2: rule__Methodtype__Alternatives
            {
            pushFollow(FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype2082);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1015:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1016:1: ( ruleDatatype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1017:1: ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype2109);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype2116); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1024:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1028:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1029:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1029:1: ( ( rule__Datatype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1030:1: ( rule__Datatype__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1031:1: ( rule__Datatype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1031:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype2142);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1043:1: entryRuleINTSTRING : ruleINTSTRING EOF ;
    public final void entryRuleINTSTRING() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1044:1: ( ruleINTSTRING EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1045:1: ruleINTSTRING EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTSTRINGRule()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING2169);
            ruleINTSTRING();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTSTRINGRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTSTRING2176); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1052:1: ruleINTSTRING : ( RULE_INT ) ;
    public final void ruleINTSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1056:2: ( ( RULE_INT ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1057:1: ( RULE_INT )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1057:1: ( RULE_INT )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1058:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTSTRINGAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTSTRING2202); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1071:1: rule__Script__RobottypesAlternatives_4_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobottypesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1075:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1076:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1076:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1077:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_4_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_4_02237); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1082:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1082:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1083:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_4_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_4_02254); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1093:1: rule__Script__RobotconfigsAlternatives_6_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobotconfigsAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1097:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1098:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1098:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1099:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_6_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_6_02286); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_6_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1104:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1104:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1105:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_6_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_6_02303); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1115:1: rule__Script__RobottypesAlternatives_8_2_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobottypesAlternatives_8_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1119:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1120:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1120:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1121:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_8_2_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_8_2_02335); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_8_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1126:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1126:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1127:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_8_2_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_8_2_02352); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1137:1: rule__Script__RobotconfigsAlternatives_8_4_0 : ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) );
    public final void rule__Script__RobotconfigsAlternatives_8_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1141:1: ( ( RULE_LOWERFIRST ) | ( RULE_CAPITALFIRST ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1142:1: ( RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1142:1: ( RULE_LOWERFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1143:1: RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_8_4_0_0()); 
                    }
                    match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02384); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_8_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1148:6: ( RULE_CAPITALFIRST )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1148:6: ( RULE_CAPITALFIRST )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1149:1: RULE_CAPITALFIRST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_8_4_0_1()); 
                    }
                    match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02401); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1159:1: rule__Block__Alternatives_2 : ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) );
    public final void rule__Block__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1163:1: ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1164:1: ( ( rule__Block__Group_2_0__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1164:1: ( ( rule__Block__Group_2_0__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1165:1: ( rule__Block__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getGroup_2_0()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1166:1: ( rule__Block__Group_2_0__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1166:2: rule__Block__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_22433);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1170:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1170:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1171:1: ( rule__Block__ExsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getExsAssignment_2_1()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1172:1: ( rule__Block__ExsAssignment_2_1 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1172:2: rule__Block__ExsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_22451);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1181:1: rule__SimpleExpression__Alternatives : ( ( ruleCrement ) | ( ruleCall ) | ( ruleAssignment ) | ( ruleReturn ) );
    public final void rule__SimpleExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1185:1: ( ( ruleCrement ) | ( ruleCall ) | ( ruleAssignment ) | ( ruleReturn ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1186:1: ( ruleCrement )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1186:1: ( ruleCrement )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1187:1: ruleCrement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getCrementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCrement_in_rule__SimpleExpression__Alternatives2484);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1192:6: ( ruleCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1192:6: ( ruleCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1193:1: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives2501);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1198:6: ( ruleAssignment )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1198:6: ( ruleAssignment )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1199:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives2518);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1204:6: ( ruleReturn )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1204:6: ( ruleReturn )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1205:1: ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleReturn_in_rule__SimpleExpression__Alternatives2535);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1215:1: rule__StructureExpression__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleFor ) | ( ruleWhile ) );
    public final void rule__StructureExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1219:1: ( ( ruleBlock ) | ( ruleIf ) | ( ruleFor ) | ( ruleWhile ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1220:1: ( ruleBlock )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1220:1: ( ruleBlock )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1221:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives2567);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1226:6: ( ruleIf )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1226:6: ( ruleIf )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1227:1: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives2584);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1232:6: ( ruleFor )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1232:6: ( ruleFor )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1233:1: ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2601);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1238:6: ( ruleWhile )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1238:6: ( ruleWhile )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1239:1: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2618);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1249:1: rule__Expression__Alternatives : ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1253:1: ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1254:1: ( ruleSimpleExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1254:1: ( ruleSimpleExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1255:1: ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2650);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1260:6: ( ruleStructureExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1260:6: ( ruleStructureExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1261:1: ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2667);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1271:1: rule__Assignment__VariAlternatives_0_0 : ( ( ruleVarReference ) | ( ruleDeclaration ) );
    public final void rule__Assignment__VariAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1275:1: ( ( ruleVarReference ) | ( ruleDeclaration ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1276:1: ( ruleVarReference )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1276:1: ( ruleVarReference )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1277:1: ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getVariVarReferenceParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_rule__Assignment__VariAlternatives_0_02699);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1282:6: ( ruleDeclaration )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1282:6: ( ruleDeclaration )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1283:1: ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02716);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1293:1: rule__Call__Alternatives_0 : ( ( ruleUserMethodCall ) | ( ruleMetaMethodCall ) );
    public final void rule__Call__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1297:1: ( ( ruleUserMethodCall ) | ( ruleMetaMethodCall ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1298:1: ( ruleUserMethodCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1298:1: ( ruleUserMethodCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1299:1: ruleUserMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallAccess().getUserMethodCallParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleUserMethodCall_in_rule__Call__Alternatives_02748);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1304:6: ( ruleMetaMethodCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1304:6: ( ruleMetaMethodCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1305:1: ruleMetaMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallAccess().getMetaMethodCallParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleMetaMethodCall_in_rule__Call__Alternatives_02765);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1316:1: rule__ValueExpression__Alternatives : ( ( ruleParanValueExpression ) | ( ruleBasicValueExpression ) );
    public final void rule__ValueExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1320:1: ( ( ruleParanValueExpression ) | ( ruleBasicValueExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||(LA11_0>=29 && LA11_0<=30)) ) {
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1321:1: ( ruleParanValueExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1321:1: ( ruleParanValueExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1322:1: ruleParanValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getParanValueExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParanValueExpression_in_rule__ValueExpression__Alternatives2798);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1327:6: ( ruleBasicValueExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1327:6: ( ruleBasicValueExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1328:1: ruleBasicValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getBasicValueExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBasicValueExpression_in_rule__ValueExpression__Alternatives2815);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1338:1: rule__ParanValueExpression__OpAlternatives_3_0_0 : ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) );
    public final void rule__ParanValueExpression__OpAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1342:1: ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1343:1: ( ruleMathOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1343:1: ( ruleMathOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1344:1: ruleMathOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParanValueExpressionAccess().getOpMathOperatorParserRuleCall_3_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleMathOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02847);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1349:6: ( ruleBooleanOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1349:6: ( ruleBooleanOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1350:1: ruleBooleanOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParanValueExpressionAccess().getOpBooleanOperatorParserRuleCall_3_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02864);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1355:6: ( ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1355:6: ( ruleComparisonOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1356:1: ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParanValueExpressionAccess().getOpComparisonOperatorParserRuleCall_3_0_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleComparisonOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02881);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1366:1: rule__BasicValueExpression__OpAlternatives_1_0_0 : ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) );
    public final void rule__BasicValueExpression__OpAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1370:1: ( ( ruleMathOperator ) | ( ruleBooleanOperator ) | ( ruleComparisonOperator ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1371:1: ( ruleMathOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1371:1: ( ruleMathOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1372:1: ruleMathOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueExpressionAccess().getOpMathOperatorParserRuleCall_1_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleMathOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02913);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1377:6: ( ruleBooleanOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1377:6: ( ruleBooleanOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1378:1: ruleBooleanOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueExpressionAccess().getOpBooleanOperatorParserRuleCall_1_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02930);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1383:6: ( ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1383:6: ( ruleComparisonOperator )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1384:1: ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueExpressionAccess().getOpComparisonOperatorParserRuleCall_1_0_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleComparisonOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02947);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1394:1: rule__ComparisonOperator__Alternatives : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1398:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1399:1: ( '==' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1399:1: ( '==' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1400:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives2980); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1407:6: ( '!=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1407:6: ( '!=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1408:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives3000); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1415:6: ( '<' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1415:6: ( '<' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1416:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives3020); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1423:6: ( '>' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1423:6: ( '>' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1424:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives3040); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1431:6: ( '<=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1431:6: ( '<=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1432:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives3060); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1439:6: ( '>=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1439:6: ( '>=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1440:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ComparisonOperator__Alternatives3080); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1452:1: rule__BooleanOperator__Alternatives : ( ( '&&' ) | ( '||' ) | ( '!&&' ) | ( '!||' ) );
    public final void rule__BooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1456:1: ( ( '&&' ) | ( '||' ) | ( '!&&' ) | ( '!||' ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1457:1: ( '&&' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1457:1: ( '&&' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1458:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__BooleanOperator__Alternatives3115); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1465:6: ( '||' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1465:6: ( '||' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1466:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__BooleanOperator__Alternatives3135); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1473:6: ( '!&&' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1473:6: ( '!&&' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1474:1: '!&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__BooleanOperator__Alternatives3155); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1481:6: ( '!||' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1481:6: ( '!||' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1482:1: '!||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getExclamationMarkVerticalLineVerticalLineKeyword_3()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__BooleanOperator__Alternatives3175); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1494:1: rule__MathOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1498:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1499:1: ( '+' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1499:1: ( '+' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1500:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__MathOperator__Alternatives3210); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1507:6: ( '-' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1507:6: ( '-' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1508:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__MathOperator__Alternatives3230); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1515:6: ( '*' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1515:6: ( '*' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1516:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getAsteriskKeyword_2()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__MathOperator__Alternatives3250); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMathOperatorAccess().getAsteriskKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1523:6: ( '/' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1523:6: ( '/' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1524:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMathOperatorAccess().getSolidusKeyword_3()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__MathOperator__Alternatives3270); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1536:1: rule__CrementOperator__Alternatives : ( ( '++' ) | ( '--' ) );
    public final void rule__CrementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1540:1: ( ( '++' ) | ( '--' ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1541:1: ( '++' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1541:1: ( '++' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1542:1: '++'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCrementOperatorAccess().getPlusSignPlusSignKeyword_0()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__CrementOperator__Alternatives3305); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCrementOperatorAccess().getPlusSignPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1549:6: ( '--' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1549:6: ( '--' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1550:1: '--'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCrementOperatorAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__CrementOperator__Alternatives3325); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1562:1: rule__Value__Alternatives : ( ( ruleCall ) | ( ruleVarReference ) | ( ruleBasicValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1566:1: ( ( ruleCall ) | ( ruleVarReference ) | ( ruleBasicValue ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1567:1: ( ruleCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1567:1: ( ruleCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1568:1: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCall_in_rule__Value__Alternatives3359);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1573:6: ( ruleVarReference )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1573:6: ( ruleVarReference )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1574:1: ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_rule__Value__Alternatives3376);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1579:6: ( ruleBasicValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1579:6: ( ruleBasicValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1580:1: ruleBasicValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBasicValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBasicValue_in_rule__Value__Alternatives3393);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1590:1: rule__BasicValue__Alternatives : ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) );
    public final void rule__BasicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1594:1: ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) )
            int alt19=3;
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
            case RULE_STRING:
                {
                alt19=3;
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1595:1: ( ruleBooleanValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1595:1: ( ruleBooleanValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1596:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives3425);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1601:6: ( ruleNumberValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1601:6: ( ruleNumberValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1602:1: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives3442);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1607:6: ( ruleStringValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1607:6: ( ruleStringValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1608:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives3459);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1618:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1622:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1623:1: ( 'true' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1623:1: ( 'true' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1624:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__BooleanValue__ValueAlternatives_03492); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1631:6: ( 'false' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1631:6: ( 'false' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1632:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__BooleanValue__ValueAlternatives_03512); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1644:1: rule__Methodtype__Alternatives : ( ( 'void' ) | ( ruleDatatype ) );
    public final void rule__Methodtype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1648:1: ( ( 'void' ) | ( ruleDatatype ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1649:1: ( 'void' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1649:1: ( 'void' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1650:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Methodtype__Alternatives3547); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1657:6: ( ruleDatatype )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1657:6: ( ruleDatatype )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1658:1: ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives3566);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1668:1: rule__Datatype__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1672:1: ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) )
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1673:1: ( 'int' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1673:1: ( 'int' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1674:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__Datatype__Alternatives3599); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1681:6: ( 'string' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1681:6: ( 'string' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1682:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__Datatype__Alternatives3619); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1689:6: ( 'boolean' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1689:6: ( 'boolean' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1690:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__Datatype__Alternatives3639); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1704:1: rule__CLfile__Group__0 : rule__CLfile__Group__0__Impl rule__CLfile__Group__1 ;
    public final void rule__CLfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1708:1: ( rule__CLfile__Group__0__Impl rule__CLfile__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1709:2: rule__CLfile__Group__0__Impl rule__CLfile__Group__1
            {
            pushFollow(FOLLOW_rule__CLfile__Group__0__Impl_in_rule__CLfile__Group__03671);
            rule__CLfile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CLfile__Group__1_in_rule__CLfile__Group__03674);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1716:1: rule__CLfile__Group__0__Impl : ( ( rule__CLfile__ScriptsAssignment_0 )* ) ;
    public final void rule__CLfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1720:1: ( ( ( rule__CLfile__ScriptsAssignment_0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1721:1: ( ( rule__CLfile__ScriptsAssignment_0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1721:1: ( ( rule__CLfile__ScriptsAssignment_0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1722:1: ( rule__CLfile__ScriptsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getScriptsAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1723:1: ( rule__CLfile__ScriptsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1723:2: rule__CLfile__ScriptsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CLfile__ScriptsAssignment_0_in_rule__CLfile__Group__0__Impl3701);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1733:1: rule__CLfile__Group__1 : rule__CLfile__Group__1__Impl ;
    public final void rule__CLfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1737:1: ( rule__CLfile__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1738:2: rule__CLfile__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CLfile__Group__1__Impl_in_rule__CLfile__Group__13732);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1744:1: rule__CLfile__Group__1__Impl : ( ( rule__CLfile__MetsAssignment_1 ) ) ;
    public final void rule__CLfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1748:1: ( ( ( rule__CLfile__MetsAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1749:1: ( ( rule__CLfile__MetsAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1749:1: ( ( rule__CLfile__MetsAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1750:1: ( rule__CLfile__MetsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getMetsAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1751:1: ( rule__CLfile__MetsAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1751:2: rule__CLfile__MetsAssignment_1
            {
            pushFollow(FOLLOW_rule__CLfile__MetsAssignment_1_in_rule__CLfile__Group__1__Impl3759);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1765:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1769:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1770:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__03793);
            rule__Script__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__03796);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1777:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1781:1: ( ( 'script' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1782:1: ( 'script' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1782:1: ( 'script' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1783:1: 'script'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Script__Group__0__Impl3824); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1796:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1800:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1801:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__13855);
            rule__Script__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__13858);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1808:1: rule__Script__Group__1__Impl : ( ( rule__Script__NameAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1812:1: ( ( ( rule__Script__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1813:1: ( ( rule__Script__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1813:1: ( ( rule__Script__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1814:1: ( rule__Script__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1815:1: ( rule__Script__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1815:2: rule__Script__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl3885);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1825:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1829:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1830:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__23915);
            rule__Script__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__3_in_rule__Script__Group__23918);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1837:1: rule__Script__Group__2__Impl : ( 'targets' ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1841:1: ( ( 'targets' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1842:1: ( 'targets' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1842:1: ( 'targets' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1843:1: 'targets'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTargetsKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__Script__Group__2__Impl3946); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1856:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1860:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1861:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__33977);
            rule__Script__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__4_in_rule__Script__Group__33980);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1868:1: rule__Script__Group__3__Impl : ( '(' ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1872:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1873:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1873:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1874:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__Script__Group__3__Impl4008); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1887:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1891:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1892:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__44039);
            rule__Script__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__5_in_rule__Script__Group__44042);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1899:1: rule__Script__Group__4__Impl : ( ( rule__Script__RobottypesAssignment_4 ) ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1903:1: ( ( ( rule__Script__RobottypesAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1904:1: ( ( rule__Script__RobottypesAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1904:1: ( ( rule__Script__RobottypesAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1905:1: ( rule__Script__RobottypesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1906:1: ( rule__Script__RobottypesAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1906:2: rule__Script__RobottypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_4_in_rule__Script__Group__4__Impl4069);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1916:1: rule__Script__Group__5 : rule__Script__Group__5__Impl rule__Script__Group__6 ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1920:1: ( rule__Script__Group__5__Impl rule__Script__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1921:2: rule__Script__Group__5__Impl rule__Script__Group__6
            {
            pushFollow(FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__54099);
            rule__Script__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__6_in_rule__Script__Group__54102);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1928:1: rule__Script__Group__5__Impl : ( ',' ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1932:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1933:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1933:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1934:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_5()); 
            }
            match(input,38,FOLLOW_38_in_rule__Script__Group__5__Impl4130); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1947:1: rule__Script__Group__6 : rule__Script__Group__6__Impl rule__Script__Group__7 ;
    public final void rule__Script__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1951:1: ( rule__Script__Group__6__Impl rule__Script__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1952:2: rule__Script__Group__6__Impl rule__Script__Group__7
            {
            pushFollow(FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__64161);
            rule__Script__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__7_in_rule__Script__Group__64164);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1959:1: rule__Script__Group__6__Impl : ( ( rule__Script__RobotconfigsAssignment_6 ) ) ;
    public final void rule__Script__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1963:1: ( ( ( rule__Script__RobotconfigsAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1964:1: ( ( rule__Script__RobotconfigsAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1964:1: ( ( rule__Script__RobotconfigsAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1965:1: ( rule__Script__RobotconfigsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1966:1: ( rule__Script__RobotconfigsAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1966:2: rule__Script__RobotconfigsAssignment_6
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_6_in_rule__Script__Group__6__Impl4191);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1976:1: rule__Script__Group__7 : rule__Script__Group__7__Impl rule__Script__Group__8 ;
    public final void rule__Script__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1980:1: ( rule__Script__Group__7__Impl rule__Script__Group__8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1981:2: rule__Script__Group__7__Impl rule__Script__Group__8
            {
            pushFollow(FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__74221);
            rule__Script__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__8_in_rule__Script__Group__74224);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1988:1: rule__Script__Group__7__Impl : ( ')' ) ;
    public final void rule__Script__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1992:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1993:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1993:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1994:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,39,FOLLOW_39_in_rule__Script__Group__7__Impl4252); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2007:1: rule__Script__Group__8 : rule__Script__Group__8__Impl rule__Script__Group__9 ;
    public final void rule__Script__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2011:1: ( rule__Script__Group__8__Impl rule__Script__Group__9 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2012:2: rule__Script__Group__8__Impl rule__Script__Group__9
            {
            pushFollow(FOLLOW_rule__Script__Group__8__Impl_in_rule__Script__Group__84283);
            rule__Script__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__9_in_rule__Script__Group__84286);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2019:1: rule__Script__Group__8__Impl : ( ( rule__Script__Group_8__0 )* ) ;
    public final void rule__Script__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2023:1: ( ( ( rule__Script__Group_8__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2024:1: ( ( rule__Script__Group_8__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2024:1: ( ( rule__Script__Group_8__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2025:1: ( rule__Script__Group_8__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup_8()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2026:1: ( rule__Script__Group_8__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2026:2: rule__Script__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Script__Group_8__0_in_rule__Script__Group__8__Impl4313);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2036:1: rule__Script__Group__9 : rule__Script__Group__9__Impl rule__Script__Group__10 ;
    public final void rule__Script__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2040:1: ( rule__Script__Group__9__Impl rule__Script__Group__10 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2041:2: rule__Script__Group__9__Impl rule__Script__Group__10
            {
            pushFollow(FOLLOW_rule__Script__Group__9__Impl_in_rule__Script__Group__94344);
            rule__Script__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__10_in_rule__Script__Group__94347);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2048:1: rule__Script__Group__9__Impl : ( '{' ) ;
    public final void rule__Script__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2052:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2053:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2053:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2054:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_9()); 
            }
            match(input,40,FOLLOW_40_in_rule__Script__Group__9__Impl4375); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2067:1: rule__Script__Group__10 : rule__Script__Group__10__Impl rule__Script__Group__11 ;
    public final void rule__Script__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2071:1: ( rule__Script__Group__10__Impl rule__Script__Group__11 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2072:2: rule__Script__Group__10__Impl rule__Script__Group__11
            {
            pushFollow(FOLLOW_rule__Script__Group__10__Impl_in_rule__Script__Group__104406);
            rule__Script__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__11_in_rule__Script__Group__104409);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2079:1: rule__Script__Group__10__Impl : ( ( rule__Script__MethodsAssignment_10 )* ) ;
    public final void rule__Script__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2083:1: ( ( ( rule__Script__MethodsAssignment_10 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2084:1: ( ( rule__Script__MethodsAssignment_10 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2084:1: ( ( rule__Script__MethodsAssignment_10 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2085:1: ( rule__Script__MethodsAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getMethodsAssignment_10()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2086:1: ( rule__Script__MethodsAssignment_10 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=31 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2086:2: rule__Script__MethodsAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Script__MethodsAssignment_10_in_rule__Script__Group__10__Impl4436);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2096:1: rule__Script__Group__11 : rule__Script__Group__11__Impl ;
    public final void rule__Script__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2100:1: ( rule__Script__Group__11__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2101:2: rule__Script__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__11__Impl_in_rule__Script__Group__114467);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2107:1: rule__Script__Group__11__Impl : ( '}' ) ;
    public final void rule__Script__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2111:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2112:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2112:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2113:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,41,FOLLOW_41_in_rule__Script__Group__11__Impl4495); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2150:1: rule__Script__Group_8__0 : rule__Script__Group_8__0__Impl rule__Script__Group_8__1 ;
    public final void rule__Script__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2154:1: ( rule__Script__Group_8__0__Impl rule__Script__Group_8__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2155:2: rule__Script__Group_8__0__Impl rule__Script__Group_8__1
            {
            pushFollow(FOLLOW_rule__Script__Group_8__0__Impl_in_rule__Script__Group_8__04550);
            rule__Script__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__1_in_rule__Script__Group_8__04553);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2162:1: rule__Script__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Script__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2166:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2167:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2167:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2168:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_8_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Script__Group_8__0__Impl4581); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2181:1: rule__Script__Group_8__1 : rule__Script__Group_8__1__Impl rule__Script__Group_8__2 ;
    public final void rule__Script__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2185:1: ( rule__Script__Group_8__1__Impl rule__Script__Group_8__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2186:2: rule__Script__Group_8__1__Impl rule__Script__Group_8__2
            {
            pushFollow(FOLLOW_rule__Script__Group_8__1__Impl_in_rule__Script__Group_8__14612);
            rule__Script__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__2_in_rule__Script__Group_8__14615);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2193:1: rule__Script__Group_8__1__Impl : ( '(' ) ;
    public final void rule__Script__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2197:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2198:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2198:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2199:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_8_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Script__Group_8__1__Impl4643); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2212:1: rule__Script__Group_8__2 : rule__Script__Group_8__2__Impl rule__Script__Group_8__3 ;
    public final void rule__Script__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2216:1: ( rule__Script__Group_8__2__Impl rule__Script__Group_8__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2217:2: rule__Script__Group_8__2__Impl rule__Script__Group_8__3
            {
            pushFollow(FOLLOW_rule__Script__Group_8__2__Impl_in_rule__Script__Group_8__24674);
            rule__Script__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__3_in_rule__Script__Group_8__24677);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2224:1: rule__Script__Group_8__2__Impl : ( ( rule__Script__RobottypesAssignment_8_2 ) ) ;
    public final void rule__Script__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2228:1: ( ( ( rule__Script__RobottypesAssignment_8_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2229:1: ( ( rule__Script__RobottypesAssignment_8_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2229:1: ( ( rule__Script__RobottypesAssignment_8_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2230:1: ( rule__Script__RobottypesAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAssignment_8_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2231:1: ( rule__Script__RobottypesAssignment_8_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2231:2: rule__Script__RobottypesAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_8_2_in_rule__Script__Group_8__2__Impl4704);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2241:1: rule__Script__Group_8__3 : rule__Script__Group_8__3__Impl rule__Script__Group_8__4 ;
    public final void rule__Script__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2245:1: ( rule__Script__Group_8__3__Impl rule__Script__Group_8__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2246:2: rule__Script__Group_8__3__Impl rule__Script__Group_8__4
            {
            pushFollow(FOLLOW_rule__Script__Group_8__3__Impl_in_rule__Script__Group_8__34734);
            rule__Script__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__4_in_rule__Script__Group_8__34737);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2253:1: rule__Script__Group_8__3__Impl : ( ',' ) ;
    public final void rule__Script__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2257:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2258:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2258:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2259:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_8_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__Script__Group_8__3__Impl4765); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2272:1: rule__Script__Group_8__4 : rule__Script__Group_8__4__Impl rule__Script__Group_8__5 ;
    public final void rule__Script__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2276:1: ( rule__Script__Group_8__4__Impl rule__Script__Group_8__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2277:2: rule__Script__Group_8__4__Impl rule__Script__Group_8__5
            {
            pushFollow(FOLLOW_rule__Script__Group_8__4__Impl_in_rule__Script__Group_8__44796);
            rule__Script__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_8__5_in_rule__Script__Group_8__44799);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2284:1: rule__Script__Group_8__4__Impl : ( ( rule__Script__RobotconfigsAssignment_8_4 ) ) ;
    public final void rule__Script__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2288:1: ( ( ( rule__Script__RobotconfigsAssignment_8_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2289:1: ( ( rule__Script__RobotconfigsAssignment_8_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2289:1: ( ( rule__Script__RobotconfigsAssignment_8_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2290:1: ( rule__Script__RobotconfigsAssignment_8_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_8_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2291:1: ( rule__Script__RobotconfigsAssignment_8_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2291:2: rule__Script__RobotconfigsAssignment_8_4
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_8_4_in_rule__Script__Group_8__4__Impl4826);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2301:1: rule__Script__Group_8__5 : rule__Script__Group_8__5__Impl ;
    public final void rule__Script__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2305:1: ( rule__Script__Group_8__5__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2306:2: rule__Script__Group_8__5__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_8__5__Impl_in_rule__Script__Group_8__54856);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2312:1: rule__Script__Group_8__5__Impl : ( ')' ) ;
    public final void rule__Script__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2316:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2317:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2317:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2318:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_8_5()); 
            }
            match(input,39,FOLLOW_39_in_rule__Script__Group_8__5__Impl4884); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2343:1: rule__MetaMethods__Group__0 : rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 ;
    public final void rule__MetaMethods__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2347:1: ( rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2348:2: rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__04927);
            rule__MetaMethods__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__04930);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2355:1: rule__MetaMethods__Group__0__Impl : ( () ) ;
    public final void rule__MetaMethods__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2359:1: ( ( () ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2360:1: ( () )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2360:1: ( () )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2361:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMetaMethodsAction_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2362:1: ()
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2364:1: 
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2374:1: rule__MetaMethods__Group__1 : rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 ;
    public final void rule__MetaMethods__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2378:1: ( rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2379:2: rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__14988);
            rule__MetaMethods__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__14991);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2386:1: rule__MetaMethods__Group__1__Impl : ( 'metamethodscollection' ) ;
    public final void rule__MetaMethods__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2390:1: ( ( 'metamethodscollection' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2391:1: ( 'metamethodscollection' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2391:1: ( 'metamethodscollection' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2392:1: 'metamethodscollection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__MetaMethods__Group__1__Impl5019); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2405:1: rule__MetaMethods__Group__2 : rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 ;
    public final void rule__MetaMethods__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2409:1: ( rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2410:2: rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__25050);
            rule__MetaMethods__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__25053);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2417:1: rule__MetaMethods__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaMethods__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2421:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2422:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2422:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2423:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__MetaMethods__Group__2__Impl5081); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2436:1: rule__MetaMethods__Group__3 : rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 ;
    public final void rule__MetaMethods__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2440:1: ( rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2441:2: rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__35112);
            rule__MetaMethods__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__35115);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2448:1: rule__MetaMethods__Group__3__Impl : ( ( rule__MetaMethods__MethodsAssignment_3 )* ) ;
    public final void rule__MetaMethods__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2452:1: ( ( ( rule__MetaMethods__MethodsAssignment_3 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2453:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2453:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2454:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2455:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2455:2: rule__MetaMethods__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl5142);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2465:1: rule__MetaMethods__Group__4 : rule__MetaMethods__Group__4__Impl ;
    public final void rule__MetaMethods__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2469:1: ( rule__MetaMethods__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2470:2: rule__MetaMethods__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__45173);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2476:1: rule__MetaMethods__Group__4__Impl : ( '}' ) ;
    public final void rule__MetaMethods__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2480:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2481:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2481:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2482:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,41,FOLLOW_41_in_rule__MetaMethods__Group__4__Impl5201); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2505:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2509:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2510:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05242);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05245);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2517:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2521:1: ( ( () ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2522:1: ( () )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2522:1: ( () )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2523:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2524:1: ()
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2526:1: 
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2536:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2540:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2541:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15303);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15306);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2548:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2552:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2553:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2553:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2554:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Block__Group__1__Impl5334); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2567:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2571:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2572:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25365);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25368);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2579:1: rule__Block__Group__2__Impl : ( ( rule__Block__Alternatives_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2583:1: ( ( ( rule__Block__Alternatives_2 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2584:1: ( ( rule__Block__Alternatives_2 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2584:1: ( ( rule__Block__Alternatives_2 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2585:1: ( rule__Block__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2586:1: ( rule__Block__Alternatives_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_LOWERFIRST && LA27_0<=RULE_CAPITALFIRST)||(LA27_0>=32 && LA27_0<=34)||LA27_0==40||LA27_0==46||(LA27_0>=48 && LA27_0<=50)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2586:2: rule__Block__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl5395);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2596:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2600:1: ( rule__Block__Group__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2601:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35426);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2607:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2611:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2612:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2612:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2613:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__Block__Group__3__Impl5454); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2634:1: rule__Block__Group_2_0__0 : rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 ;
    public final void rule__Block__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2638:1: ( rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2639:2: rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__05493);
            rule__Block__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__05496);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2646:1: rule__Block__Group_2_0__0__Impl : ( ( rule__Block__ExsAssignment_2_0_0 ) ) ;
    public final void rule__Block__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2650:1: ( ( ( rule__Block__ExsAssignment_2_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2651:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2651:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2652:1: ( rule__Block__ExsAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsAssignment_2_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2653:1: ( rule__Block__ExsAssignment_2_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2653:2: rule__Block__ExsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl5523);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2663:1: rule__Block__Group_2_0__1 : rule__Block__Group_2_0__1__Impl ;
    public final void rule__Block__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2667:1: ( rule__Block__Group_2_0__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2668:2: rule__Block__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__15553);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2674:1: rule__Block__Group_2_0__1__Impl : ( ';' ) ;
    public final void rule__Block__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2678:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2679:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2679:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2680:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__Block__Group_2_0__1__Impl5581); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2697:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2701:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2702:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05616);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05619);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2709:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2713:1: ( ( ( rule__Assignment__VariAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2714:1: ( ( rule__Assignment__VariAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2714:1: ( ( rule__Assignment__VariAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2715:1: ( rule__Assignment__VariAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2716:1: ( rule__Assignment__VariAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2716:2: rule__Assignment__VariAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl5646);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2726:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2730:1: ( rule__Assignment__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2731:2: rule__Assignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15676);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2737:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2741:1: ( ( ( rule__Assignment__Group_1__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2742:1: ( ( rule__Assignment__Group_1__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2742:1: ( ( rule__Assignment__Group_1__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2743:1: ( rule__Assignment__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2744:1: ( rule__Assignment__Group_1__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2744:2: rule__Assignment__Group_1__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Group__1__Impl5703);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2758:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2762:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2763:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__05737);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__05740);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2770:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__OpAssignment_1_0 )? ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2774:1: ( ( ( rule__Assignment__OpAssignment_1_0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2775:1: ( ( rule__Assignment__OpAssignment_1_0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2775:1: ( ( rule__Assignment__OpAssignment_1_0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2776:1: ( rule__Assignment__OpAssignment_1_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2777:1: ( rule__Assignment__OpAssignment_1_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=23 && LA28_0<=26)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2777:2: rule__Assignment__OpAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Assignment__OpAssignment_1_0_in_rule__Assignment__Group_1__0__Impl5767);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2787:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2791:1: ( rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2792:2: rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__15798);
            rule__Assignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__15801);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2799:1: rule__Assignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2803:1: ( ( '=' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2804:1: ( '=' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2804:1: ( '=' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2805:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__Assignment__Group_1__1__Impl5829); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2818:1: rule__Assignment__Group_1__2 : rule__Assignment__Group_1__2__Impl ;
    public final void rule__Assignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2822:1: ( rule__Assignment__Group_1__2__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2823:2: rule__Assignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__25860);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2829:1: rule__Assignment__Group_1__2__Impl : ( ( rule__Assignment__ValueAssignment_1_2 ) ) ;
    public final void rule__Assignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2833:1: ( ( ( rule__Assignment__ValueAssignment_1_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2834:1: ( ( rule__Assignment__ValueAssignment_1_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2834:1: ( ( rule__Assignment__ValueAssignment_1_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2835:1: ( rule__Assignment__ValueAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_1_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2836:1: ( rule__Assignment__ValueAssignment_1_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2836:2: rule__Assignment__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_1_2_in_rule__Assignment__Group_1__2__Impl5887);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2852:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2856:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2857:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05923);
            rule__Call__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05926);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2864:1: rule__Call__Group__0__Impl : ( ( rule__Call__Alternatives_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2868:1: ( ( ( rule__Call__Alternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2869:1: ( ( rule__Call__Alternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2869:1: ( ( rule__Call__Alternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2870:1: ( rule__Call__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getAlternatives_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2871:1: ( rule__Call__Alternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2871:2: rule__Call__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Call__Alternatives_0_in_rule__Call__Group__0__Impl5953);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2881:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2885:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2886:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15983);
            rule__Call__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15986);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2893:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2897:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2898:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2898:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2899:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Call__Group__1__Impl6014); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2912:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2916:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2917:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__26045);
            rule__Call__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__26048);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2924:1: rule__Call__Group__2__Impl : ( ( rule__Call__ParametersAssignment_2 )? ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2928:1: ( ( ( rule__Call__ParametersAssignment_2 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2929:1: ( ( rule__Call__ParametersAssignment_2 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2929:1: ( ( rule__Call__ParametersAssignment_2 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2930:1: ( rule__Call__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2931:1: ( rule__Call__ParametersAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_STRING)||(LA29_0>=29 && LA29_0<=30)||LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2931:2: rule__Call__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl6075);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2941:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2945:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2946:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__36106);
            rule__Call__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__36109);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2953:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )* ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2957:1: ( ( ( rule__Call__Group_3__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2958:1: ( ( rule__Call__Group_3__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2958:1: ( ( rule__Call__Group_3__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2959:1: ( rule__Call__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2960:1: ( rule__Call__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==38) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2960:2: rule__Call__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl6136);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2970:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2974:1: ( rule__Call__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2975:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__46167);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2981:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2985:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2986:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2986:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2987:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__Call__Group__4__Impl6195); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3010:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3014:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3015:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__06236);
            rule__Call__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__06239);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3022:1: rule__Call__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3026:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3027:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3027:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3028:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3028:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3029:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3030:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3031:2: ','
            {
            match(input,38,FOLLOW_38_in_rule__Call__Group_3__0__Impl6270); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3035:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3036:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3037:1: ( ',' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3038:2: ','
            	    {
            	    match(input,38,FOLLOW_38_in_rule__Call__Group_3__0__Impl6286); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3050:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3054:1: ( rule__Call__Group_3__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3055:2: rule__Call__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__16321);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3061:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__ParametersAssignment_3_1 ) ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3065:1: ( ( ( rule__Call__ParametersAssignment_3_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3066:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3066:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3067:1: ( rule__Call__ParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersAssignment_3_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3068:1: ( rule__Call__ParametersAssignment_3_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3068:2: rule__Call__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl6348);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3082:1: rule__MetaMethod__Group__0 : rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 ;
    public final void rule__MetaMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3086:1: ( rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3087:2: rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__06382);
            rule__MetaMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__06385);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3094:1: rule__MetaMethod__Group__0__Impl : ( 'meta' ) ;
    public final void rule__MetaMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3098:1: ( ( 'meta' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3099:1: ( 'meta' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3099:1: ( 'meta' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3100:1: 'meta'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getMetaKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__MetaMethod__Group__0__Impl6413); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3113:1: rule__MetaMethod__Group__1 : rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2 ;
    public final void rule__MetaMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3117:1: ( rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3118:2: rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__16444);
            rule__MetaMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__2_in_rule__MetaMethod__Group__16447);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3125:1: rule__MetaMethod__Group__1__Impl : ( ( rule__MetaMethod__TypeAssignment_1 ) ) ;
    public final void rule__MetaMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3129:1: ( ( ( rule__MetaMethod__TypeAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3130:1: ( ( rule__MetaMethod__TypeAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3130:1: ( ( rule__MetaMethod__TypeAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3131:1: ( rule__MetaMethod__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getTypeAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3132:1: ( rule__MetaMethod__TypeAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3132:2: rule__MetaMethod__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaMethod__TypeAssignment_1_in_rule__MetaMethod__Group__1__Impl6474);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3142:1: rule__MetaMethod__Group__2 : rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3 ;
    public final void rule__MetaMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3146:1: ( rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3147:2: rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__2__Impl_in_rule__MetaMethod__Group__26504);
            rule__MetaMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__3_in_rule__MetaMethod__Group__26507);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3154:1: rule__MetaMethod__Group__2__Impl : ( ( rule__MetaMethod__NameAssignment_2 ) ) ;
    public final void rule__MetaMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3158:1: ( ( ( rule__MetaMethod__NameAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3159:1: ( ( rule__MetaMethod__NameAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3159:1: ( ( rule__MetaMethod__NameAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3160:1: ( rule__MetaMethod__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getNameAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3161:1: ( rule__MetaMethod__NameAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3161:2: rule__MetaMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MetaMethod__NameAssignment_2_in_rule__MetaMethod__Group__2__Impl6534);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3171:1: rule__MetaMethod__Group__3 : rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4 ;
    public final void rule__MetaMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3175:1: ( rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3176:2: rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__3__Impl_in_rule__MetaMethod__Group__36564);
            rule__MetaMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__4_in_rule__MetaMethod__Group__36567);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3183:1: rule__MetaMethod__Group__3__Impl : ( '(' ) ;
    public final void rule__MetaMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3187:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3188:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3188:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3189:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__MetaMethod__Group__3__Impl6595); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3202:1: rule__MetaMethod__Group__4 : rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5 ;
    public final void rule__MetaMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3206:1: ( rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3207:2: rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__4__Impl_in_rule__MetaMethod__Group__46626);
            rule__MetaMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__5_in_rule__MetaMethod__Group__46629);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3214:1: rule__MetaMethod__Group__4__Impl : ( ( rule__MetaMethod__ParametersAssignment_4 )? ) ;
    public final void rule__MetaMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3218:1: ( ( ( rule__MetaMethod__ParametersAssignment_4 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3219:1: ( ( rule__MetaMethod__ParametersAssignment_4 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3219:1: ( ( rule__MetaMethod__ParametersAssignment_4 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3220:1: ( rule__MetaMethod__ParametersAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3221:1: ( rule__MetaMethod__ParametersAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=32 && LA32_0<=34)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3221:2: rule__MetaMethod__ParametersAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MetaMethod__ParametersAssignment_4_in_rule__MetaMethod__Group__4__Impl6656);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3231:1: rule__MetaMethod__Group__5 : rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6 ;
    public final void rule__MetaMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3235:1: ( rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3236:2: rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__5__Impl_in_rule__MetaMethod__Group__56687);
            rule__MetaMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__6_in_rule__MetaMethod__Group__56690);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3243:1: rule__MetaMethod__Group__5__Impl : ( ( rule__MetaMethod__Group_5__0 )* ) ;
    public final void rule__MetaMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3247:1: ( ( ( rule__MetaMethod__Group_5__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3248:1: ( ( rule__MetaMethod__Group_5__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3248:1: ( ( rule__MetaMethod__Group_5__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3249:1: ( rule__MetaMethod__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getGroup_5()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3250:1: ( rule__MetaMethod__Group_5__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3250:2: rule__MetaMethod__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__MetaMethod__Group_5__0_in_rule__MetaMethod__Group__5__Impl6717);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3260:1: rule__MetaMethod__Group__6 : rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7 ;
    public final void rule__MetaMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3264:1: ( rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3265:2: rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__6__Impl_in_rule__MetaMethod__Group__66748);
            rule__MetaMethod__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__7_in_rule__MetaMethod__Group__66751);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3272:1: rule__MetaMethod__Group__6__Impl : ( ')' ) ;
    public final void rule__MetaMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3276:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3277:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3277:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3278:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__MetaMethod__Group__6__Impl6779); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3291:1: rule__MetaMethod__Group__7 : rule__MetaMethod__Group__7__Impl ;
    public final void rule__MetaMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3295:1: ( rule__MetaMethod__Group__7__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3296:2: rule__MetaMethod__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__7__Impl_in_rule__MetaMethod__Group__76810);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3302:1: rule__MetaMethod__Group__7__Impl : ( ';' ) ;
    public final void rule__MetaMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3306:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3307:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3307:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3308:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getSemicolonKeyword_7()); 
            }
            match(input,43,FOLLOW_43_in_rule__MetaMethod__Group__7__Impl6838); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3337:1: rule__MetaMethod__Group_5__0 : rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1 ;
    public final void rule__MetaMethod__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3341:1: ( rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3342:2: rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__0__Impl_in_rule__MetaMethod__Group_5__06885);
            rule__MetaMethod__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__1_in_rule__MetaMethod__Group_5__06888);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3349:1: rule__MetaMethod__Group_5__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__MetaMethod__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3353:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3354:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3354:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3355:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3355:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3356:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3357:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3358:2: ','
            {
            match(input,38,FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl6919); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3362:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3363:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3364:1: ( ',' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3365:2: ','
            	    {
            	    match(input,38,FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl6935); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3377:1: rule__MetaMethod__Group_5__1 : rule__MetaMethod__Group_5__1__Impl ;
    public final void rule__MetaMethod__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3381:1: ( rule__MetaMethod__Group_5__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3382:2: rule__MetaMethod__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__1__Impl_in_rule__MetaMethod__Group_5__16970);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3388:1: rule__MetaMethod__Group_5__1__Impl : ( ( rule__MetaMethod__ParametersAssignment_5_1 ) ) ;
    public final void rule__MetaMethod__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3392:1: ( ( ( rule__MetaMethod__ParametersAssignment_5_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3393:1: ( ( rule__MetaMethod__ParametersAssignment_5_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3393:1: ( ( rule__MetaMethod__ParametersAssignment_5_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3394:1: ( rule__MetaMethod__ParametersAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersAssignment_5_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3395:1: ( rule__MetaMethod__ParametersAssignment_5_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3395:2: rule__MetaMethod__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MetaMethod__ParametersAssignment_5_1_in_rule__MetaMethod__Group_5__1__Impl6997);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3409:1: rule__UserMethod__Group__0 : rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 ;
    public final void rule__UserMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3413:1: ( rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3414:2: rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__07031);
            rule__UserMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__07034);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3421:1: rule__UserMethod__Group__0__Impl : ( ( rule__UserMethod__TypeAssignment_0 ) ) ;
    public final void rule__UserMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3425:1: ( ( ( rule__UserMethod__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3426:1: ( ( rule__UserMethod__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3426:1: ( ( rule__UserMethod__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3427:1: ( rule__UserMethod__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3428:1: ( rule__UserMethod__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3428:2: rule__UserMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__UserMethod__TypeAssignment_0_in_rule__UserMethod__Group__0__Impl7061);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3438:1: rule__UserMethod__Group__1 : rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2 ;
    public final void rule__UserMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3442:1: ( rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3443:2: rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__17091);
            rule__UserMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__2_in_rule__UserMethod__Group__17094);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3450:1: rule__UserMethod__Group__1__Impl : ( ( rule__UserMethod__NameAssignment_1 ) ) ;
    public final void rule__UserMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3454:1: ( ( ( rule__UserMethod__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3455:1: ( ( rule__UserMethod__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3455:1: ( ( rule__UserMethod__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3456:1: ( rule__UserMethod__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3457:1: ( rule__UserMethod__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3457:2: rule__UserMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UserMethod__NameAssignment_1_in_rule__UserMethod__Group__1__Impl7121);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3467:1: rule__UserMethod__Group__2 : rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3 ;
    public final void rule__UserMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3471:1: ( rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3472:2: rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__2__Impl_in_rule__UserMethod__Group__27151);
            rule__UserMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__3_in_rule__UserMethod__Group__27154);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3479:1: rule__UserMethod__Group__2__Impl : ( '(' ) ;
    public final void rule__UserMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3483:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3484:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3484:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3485:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__UserMethod__Group__2__Impl7182); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3498:1: rule__UserMethod__Group__3 : rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4 ;
    public final void rule__UserMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3502:1: ( rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3503:2: rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__3__Impl_in_rule__UserMethod__Group__37213);
            rule__UserMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__4_in_rule__UserMethod__Group__37216);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3510:1: rule__UserMethod__Group__3__Impl : ( ( rule__UserMethod__ParametersAssignment_3 )? ) ;
    public final void rule__UserMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3514:1: ( ( ( rule__UserMethod__ParametersAssignment_3 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3515:1: ( ( rule__UserMethod__ParametersAssignment_3 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3515:1: ( ( rule__UserMethod__ParametersAssignment_3 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3516:1: ( rule__UserMethod__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersAssignment_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3517:1: ( rule__UserMethod__ParametersAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=32 && LA35_0<=34)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3517:2: rule__UserMethod__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__UserMethod__ParametersAssignment_3_in_rule__UserMethod__Group__3__Impl7243);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3527:1: rule__UserMethod__Group__4 : rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5 ;
    public final void rule__UserMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3531:1: ( rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3532:2: rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__4__Impl_in_rule__UserMethod__Group__47274);
            rule__UserMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__5_in_rule__UserMethod__Group__47277);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3539:1: rule__UserMethod__Group__4__Impl : ( ( rule__UserMethod__Group_4__0 )* ) ;
    public final void rule__UserMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3543:1: ( ( ( rule__UserMethod__Group_4__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3544:1: ( ( rule__UserMethod__Group_4__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3544:1: ( ( rule__UserMethod__Group_4__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3545:1: ( rule__UserMethod__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getGroup_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3546:1: ( rule__UserMethod__Group_4__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3546:2: rule__UserMethod__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UserMethod__Group_4__0_in_rule__UserMethod__Group__4__Impl7304);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3556:1: rule__UserMethod__Group__5 : rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6 ;
    public final void rule__UserMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3560:1: ( rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3561:2: rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__5__Impl_in_rule__UserMethod__Group__57335);
            rule__UserMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__6_in_rule__UserMethod__Group__57338);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3568:1: rule__UserMethod__Group__5__Impl : ( ')' ) ;
    public final void rule__UserMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3572:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3573:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3573:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3574:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FOLLOW_39_in_rule__UserMethod__Group__5__Impl7366); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3587:1: rule__UserMethod__Group__6 : rule__UserMethod__Group__6__Impl ;
    public final void rule__UserMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3591:1: ( rule__UserMethod__Group__6__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3592:2: rule__UserMethod__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__6__Impl_in_rule__UserMethod__Group__67397);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3598:1: rule__UserMethod__Group__6__Impl : ( ( rule__UserMethod__BlAssignment_6 ) ) ;
    public final void rule__UserMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3602:1: ( ( ( rule__UserMethod__BlAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3603:1: ( ( rule__UserMethod__BlAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3603:1: ( ( rule__UserMethod__BlAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3604:1: ( rule__UserMethod__BlAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getBlAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3605:1: ( rule__UserMethod__BlAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3605:2: rule__UserMethod__BlAssignment_6
            {
            pushFollow(FOLLOW_rule__UserMethod__BlAssignment_6_in_rule__UserMethod__Group__6__Impl7424);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3629:1: rule__UserMethod__Group_4__0 : rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1 ;
    public final void rule__UserMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3633:1: ( rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3634:2: rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1
            {
            pushFollow(FOLLOW_rule__UserMethod__Group_4__0__Impl_in_rule__UserMethod__Group_4__07468);
            rule__UserMethod__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group_4__1_in_rule__UserMethod__Group_4__07471);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3641:1: rule__UserMethod__Group_4__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__UserMethod__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3645:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3646:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3646:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3647:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3647:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3648:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3649:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3650:2: ','
            {
            match(input,38,FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7502); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3654:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3655:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3656:1: ( ',' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==38) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3657:2: ','
            	    {
            	    match(input,38,FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7518); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3669:1: rule__UserMethod__Group_4__1 : rule__UserMethod__Group_4__1__Impl ;
    public final void rule__UserMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3673:1: ( rule__UserMethod__Group_4__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3674:2: rule__UserMethod__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UserMethod__Group_4__1__Impl_in_rule__UserMethod__Group_4__17553);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3680:1: rule__UserMethod__Group_4__1__Impl : ( ( rule__UserMethod__ParametersAssignment_4_1 ) ) ;
    public final void rule__UserMethod__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3684:1: ( ( ( rule__UserMethod__ParametersAssignment_4_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3685:1: ( ( rule__UserMethod__ParametersAssignment_4_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3685:1: ( ( rule__UserMethod__ParametersAssignment_4_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3686:1: ( rule__UserMethod__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersAssignment_4_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3687:1: ( rule__UserMethod__ParametersAssignment_4_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3687:2: rule__UserMethod__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UserMethod__ParametersAssignment_4_1_in_rule__UserMethod__Group_4__1__Impl7580);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3701:1: rule__ParanValueExpression__Group__0 : rule__ParanValueExpression__Group__0__Impl rule__ParanValueExpression__Group__1 ;
    public final void rule__ParanValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3705:1: ( rule__ParanValueExpression__Group__0__Impl rule__ParanValueExpression__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3706:2: rule__ParanValueExpression__Group__0__Impl rule__ParanValueExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__0__Impl_in_rule__ParanValueExpression__Group__07614);
            rule__ParanValueExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__1_in_rule__ParanValueExpression__Group__07617);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3713:1: rule__ParanValueExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParanValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3717:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3718:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3718:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3719:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParanValueExpression__Group__0__Impl7645); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3732:1: rule__ParanValueExpression__Group__1 : rule__ParanValueExpression__Group__1__Impl rule__ParanValueExpression__Group__2 ;
    public final void rule__ParanValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3736:1: ( rule__ParanValueExpression__Group__1__Impl rule__ParanValueExpression__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3737:2: rule__ParanValueExpression__Group__1__Impl rule__ParanValueExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__1__Impl_in_rule__ParanValueExpression__Group__17676);
            rule__ParanValueExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__2_in_rule__ParanValueExpression__Group__17679);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3744:1: rule__ParanValueExpression__Group__1__Impl : ( ( rule__ParanValueExpression__ExAssignment_1 ) ) ;
    public final void rule__ParanValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3748:1: ( ( ( rule__ParanValueExpression__ExAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3749:1: ( ( rule__ParanValueExpression__ExAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3749:1: ( ( rule__ParanValueExpression__ExAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3750:1: ( rule__ParanValueExpression__ExAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getExAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3751:1: ( rule__ParanValueExpression__ExAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3751:2: rule__ParanValueExpression__ExAssignment_1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__ExAssignment_1_in_rule__ParanValueExpression__Group__1__Impl7706);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3761:1: rule__ParanValueExpression__Group__2 : rule__ParanValueExpression__Group__2__Impl rule__ParanValueExpression__Group__3 ;
    public final void rule__ParanValueExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3765:1: ( rule__ParanValueExpression__Group__2__Impl rule__ParanValueExpression__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3766:2: rule__ParanValueExpression__Group__2__Impl rule__ParanValueExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__2__Impl_in_rule__ParanValueExpression__Group__27736);
            rule__ParanValueExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__3_in_rule__ParanValueExpression__Group__27739);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3773:1: rule__ParanValueExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParanValueExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3777:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3778:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3778:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3779:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__ParanValueExpression__Group__2__Impl7767); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3792:1: rule__ParanValueExpression__Group__3 : rule__ParanValueExpression__Group__3__Impl ;
    public final void rule__ParanValueExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3796:1: ( rule__ParanValueExpression__Group__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3797:2: rule__ParanValueExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group__3__Impl_in_rule__ParanValueExpression__Group__37798);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3803:1: rule__ParanValueExpression__Group__3__Impl : ( ( rule__ParanValueExpression__Group_3__0 )? ) ;
    public final void rule__ParanValueExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3807:1: ( ( ( rule__ParanValueExpression__Group_3__0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3808:1: ( ( rule__ParanValueExpression__Group_3__0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3808:1: ( ( rule__ParanValueExpression__Group_3__0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3809:1: ( rule__ParanValueExpression__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getGroup_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3810:1: ( rule__ParanValueExpression__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=13 && LA38_0<=26)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3810:2: rule__ParanValueExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__0_in_rule__ParanValueExpression__Group__3__Impl7825);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3828:1: rule__ParanValueExpression__Group_3__0 : rule__ParanValueExpression__Group_3__0__Impl rule__ParanValueExpression__Group_3__1 ;
    public final void rule__ParanValueExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3832:1: ( rule__ParanValueExpression__Group_3__0__Impl rule__ParanValueExpression__Group_3__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3833:2: rule__ParanValueExpression__Group_3__0__Impl rule__ParanValueExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__0__Impl_in_rule__ParanValueExpression__Group_3__07864);
            rule__ParanValueExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__1_in_rule__ParanValueExpression__Group_3__07867);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3840:1: rule__ParanValueExpression__Group_3__0__Impl : ( ( rule__ParanValueExpression__OpAssignment_3_0 ) ) ;
    public final void rule__ParanValueExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3844:1: ( ( ( rule__ParanValueExpression__OpAssignment_3_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3845:1: ( ( rule__ParanValueExpression__OpAssignment_3_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3845:1: ( ( rule__ParanValueExpression__OpAssignment_3_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3846:1: ( rule__ParanValueExpression__OpAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getOpAssignment_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3847:1: ( rule__ParanValueExpression__OpAssignment_3_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3847:2: rule__ParanValueExpression__OpAssignment_3_0
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__OpAssignment_3_0_in_rule__ParanValueExpression__Group_3__0__Impl7894);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3857:1: rule__ParanValueExpression__Group_3__1 : rule__ParanValueExpression__Group_3__1__Impl ;
    public final void rule__ParanValueExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3861:1: ( rule__ParanValueExpression__Group_3__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3862:2: rule__ParanValueExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__Group_3__1__Impl_in_rule__ParanValueExpression__Group_3__17924);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3868:1: rule__ParanValueExpression__Group_3__1__Impl : ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) ) ;
    public final void rule__ParanValueExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3872:1: ( ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3873:1: ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3873:1: ( ( rule__ParanValueExpression__VarrightAssignment_3_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3874:1: ( rule__ParanValueExpression__VarrightAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getVarrightAssignment_3_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3875:1: ( rule__ParanValueExpression__VarrightAssignment_3_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3875:2: rule__ParanValueExpression__VarrightAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__VarrightAssignment_3_1_in_rule__ParanValueExpression__Group_3__1__Impl7951);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3889:1: rule__BasicValueExpression__Group__0 : rule__BasicValueExpression__Group__0__Impl rule__BasicValueExpression__Group__1 ;
    public final void rule__BasicValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3893:1: ( rule__BasicValueExpression__Group__0__Impl rule__BasicValueExpression__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3894:2: rule__BasicValueExpression__Group__0__Impl rule__BasicValueExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group__0__Impl_in_rule__BasicValueExpression__Group__07985);
            rule__BasicValueExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicValueExpression__Group__1_in_rule__BasicValueExpression__Group__07988);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3901:1: rule__BasicValueExpression__Group__0__Impl : ( ( rule__BasicValueExpression__VarleftAssignment_0 ) ) ;
    public final void rule__BasicValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3905:1: ( ( ( rule__BasicValueExpression__VarleftAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3906:1: ( ( rule__BasicValueExpression__VarleftAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3906:1: ( ( rule__BasicValueExpression__VarleftAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3907:1: ( rule__BasicValueExpression__VarleftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarleftAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3908:1: ( rule__BasicValueExpression__VarleftAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3908:2: rule__BasicValueExpression__VarleftAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__VarleftAssignment_0_in_rule__BasicValueExpression__Group__0__Impl8015);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3918:1: rule__BasicValueExpression__Group__1 : rule__BasicValueExpression__Group__1__Impl ;
    public final void rule__BasicValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3922:1: ( rule__BasicValueExpression__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3923:2: rule__BasicValueExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group__1__Impl_in_rule__BasicValueExpression__Group__18045);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3929:1: rule__BasicValueExpression__Group__1__Impl : ( ( rule__BasicValueExpression__Group_1__0 )? ) ;
    public final void rule__BasicValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3933:1: ( ( ( rule__BasicValueExpression__Group_1__0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3934:1: ( ( rule__BasicValueExpression__Group_1__0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3934:1: ( ( rule__BasicValueExpression__Group_1__0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3935:1: ( rule__BasicValueExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getGroup_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3936:1: ( rule__BasicValueExpression__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=13 && LA39_0<=26)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3936:2: rule__BasicValueExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__0_in_rule__BasicValueExpression__Group__1__Impl8072);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3950:1: rule__BasicValueExpression__Group_1__0 : rule__BasicValueExpression__Group_1__0__Impl rule__BasicValueExpression__Group_1__1 ;
    public final void rule__BasicValueExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3954:1: ( rule__BasicValueExpression__Group_1__0__Impl rule__BasicValueExpression__Group_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3955:2: rule__BasicValueExpression__Group_1__0__Impl rule__BasicValueExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__0__Impl_in_rule__BasicValueExpression__Group_1__08107);
            rule__BasicValueExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__1_in_rule__BasicValueExpression__Group_1__08110);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3962:1: rule__BasicValueExpression__Group_1__0__Impl : ( ( rule__BasicValueExpression__OpAssignment_1_0 ) ) ;
    public final void rule__BasicValueExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3966:1: ( ( ( rule__BasicValueExpression__OpAssignment_1_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3967:1: ( ( rule__BasicValueExpression__OpAssignment_1_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3967:1: ( ( rule__BasicValueExpression__OpAssignment_1_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3968:1: ( rule__BasicValueExpression__OpAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getOpAssignment_1_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3969:1: ( rule__BasicValueExpression__OpAssignment_1_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3969:2: rule__BasicValueExpression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__OpAssignment_1_0_in_rule__BasicValueExpression__Group_1__0__Impl8137);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3979:1: rule__BasicValueExpression__Group_1__1 : rule__BasicValueExpression__Group_1__1__Impl ;
    public final void rule__BasicValueExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3983:1: ( rule__BasicValueExpression__Group_1__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3984:2: rule__BasicValueExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__Group_1__1__Impl_in_rule__BasicValueExpression__Group_1__18167);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3990:1: rule__BasicValueExpression__Group_1__1__Impl : ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) ) ;
    public final void rule__BasicValueExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3994:1: ( ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3995:1: ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3995:1: ( ( rule__BasicValueExpression__VarrightAssignment_1_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3996:1: ( rule__BasicValueExpression__VarrightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarrightAssignment_1_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3997:1: ( rule__BasicValueExpression__VarrightAssignment_1_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3997:2: rule__BasicValueExpression__VarrightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__VarrightAssignment_1_1_in_rule__BasicValueExpression__Group_1__1__Impl8194);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4011:1: rule__Crement__Group__0 : rule__Crement__Group__0__Impl rule__Crement__Group__1 ;
    public final void rule__Crement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4015:1: ( rule__Crement__Group__0__Impl rule__Crement__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4016:2: rule__Crement__Group__0__Impl rule__Crement__Group__1
            {
            pushFollow(FOLLOW_rule__Crement__Group__0__Impl_in_rule__Crement__Group__08228);
            rule__Crement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Crement__Group__1_in_rule__Crement__Group__08231);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4023:1: rule__Crement__Group__0__Impl : ( ( rule__Crement__ValueAssignment_0 ) ) ;
    public final void rule__Crement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4027:1: ( ( ( rule__Crement__ValueAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4028:1: ( ( rule__Crement__ValueAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4028:1: ( ( rule__Crement__ValueAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4029:1: ( rule__Crement__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getValueAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4030:1: ( rule__Crement__ValueAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4030:2: rule__Crement__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__Crement__ValueAssignment_0_in_rule__Crement__Group__0__Impl8258);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4040:1: rule__Crement__Group__1 : rule__Crement__Group__1__Impl ;
    public final void rule__Crement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4044:1: ( rule__Crement__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4045:2: rule__Crement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Crement__Group__1__Impl_in_rule__Crement__Group__18288);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4051:1: rule__Crement__Group__1__Impl : ( ( rule__Crement__OpAssignment_1 ) ) ;
    public final void rule__Crement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4055:1: ( ( ( rule__Crement__OpAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4056:1: ( ( rule__Crement__OpAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4056:1: ( ( rule__Crement__OpAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4057:1: ( rule__Crement__OpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getOpAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4058:1: ( rule__Crement__OpAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4058:2: rule__Crement__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__Crement__OpAssignment_1_in_rule__Crement__Group__1__Impl8315);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4072:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4076:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4077:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__08349);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__08352);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4084:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4088:1: ( ( 'if' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4089:1: ( 'if' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4089:1: ( 'if' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4090:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__If__Group__0__Impl8380); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4103:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4107:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4108:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__18411);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__18414);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4115:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4119:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4120:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4120:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4121:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__If__Group__1__Impl8442); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4134:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4138:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4139:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__28473);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__28476);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4146:1: rule__If__Group__2__Impl : ( ( rule__If__ExAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4150:1: ( ( ( rule__If__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4151:1: ( ( rule__If__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4151:1: ( ( rule__If__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4152:1: ( rule__If__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4153:1: ( rule__If__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4153:2: rule__If__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl8503);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4163:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4167:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4168:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__38533);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__38536);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4175:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4179:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4180:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4180:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4181:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__If__Group__3__Impl8564); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4194:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4198:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4199:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__48595);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__5_in_rule__If__Group__48598);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4206:1: rule__If__Group__4__Impl : ( ( rule__If__BlAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4210:1: ( ( ( rule__If__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4211:1: ( ( rule__If__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4211:1: ( ( rule__If__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4212:1: ( rule__If__BlAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getBlAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4213:1: ( rule__If__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4213:2: rule__If__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl8625);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4223:1: rule__If__Group__5 : rule__If__Group__5__Impl ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4227:1: ( rule__If__Group__5__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4228:2: rule__If__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__58655);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4234:1: rule__If__Group__5__Impl : ( ( rule__If__ElAssignment_5 )? ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4238:1: ( ( ( rule__If__ElAssignment_5 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4239:1: ( ( rule__If__ElAssignment_5 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4239:1: ( ( rule__If__ElAssignment_5 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4240:1: ( rule__If__ElAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElAssignment_5()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4241:1: ( rule__If__ElAssignment_5 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4241:2: rule__If__ElAssignment_5
                    {
                    pushFollow(FOLLOW_rule__If__ElAssignment_5_in_rule__If__Group__5__Impl8682);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4263:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4267:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4268:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__08725);
            rule__Else__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Else__Group__1_in_rule__Else__Group__08728);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4275:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4279:1: ( ( 'else' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4280:1: ( 'else' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4280:1: ( 'else' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4281:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__Else__Group__0__Impl8756); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4294:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4298:1: ( rule__Else__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4299:2: rule__Else__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__18787);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4305:1: rule__Else__Group__1__Impl : ( ( rule__Else__ExAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4309:1: ( ( ( rule__Else__ExAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4310:1: ( ( rule__Else__ExAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4310:1: ( ( rule__Else__ExAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4311:1: ( rule__Else__ExAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getExAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4312:1: ( rule__Else__ExAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4312:2: rule__Else__ExAssignment_1
            {
            pushFollow(FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl8814);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4326:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4330:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4331:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__08848);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__08851);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4338:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4342:1: ( ( 'for' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4343:1: ( 'for' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4343:1: ( 'for' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4344:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__For__Group__0__Impl8879); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4357:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4361:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4362:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__18910);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__18913);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4369:1: rule__For__Group__1__Impl : ( '(' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4373:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4374:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4374:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4375:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__For__Group__1__Impl8941); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4388:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4392:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4393:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__28972);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__28975);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4400:1: rule__For__Group__2__Impl : ( ( rule__For__InitAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4404:1: ( ( ( rule__For__InitAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4405:1: ( ( rule__For__InitAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4405:1: ( ( rule__For__InitAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4406:1: ( rule__For__InitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getInitAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4407:1: ( rule__For__InitAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4407:2: rule__For__InitAssignment_2
            {
            pushFollow(FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl9002);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4417:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4421:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4422:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__39032);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__39035);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4429:1: rule__For__Group__3__Impl : ( ';' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4433:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4434:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4434:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4435:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSemicolonKeyword_3()); 
            }
            match(input,43,FOLLOW_43_in_rule__For__Group__3__Impl9063); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4448:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4452:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4453:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__49094);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__49097);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4460:1: rule__For__Group__4__Impl : ( ( rule__For__CheckAssignment_4 ) ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4464:1: ( ( ( rule__For__CheckAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4465:1: ( ( rule__For__CheckAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4465:1: ( ( rule__For__CheckAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4466:1: ( rule__For__CheckAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCheckAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4467:1: ( rule__For__CheckAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4467:2: rule__For__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl9124);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4477:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4481:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4482:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__59154);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__59157);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4489:1: rule__For__Group__5__Impl : ( ';' ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4493:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4494:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4494:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4495:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSemicolonKeyword_5()); 
            }
            match(input,43,FOLLOW_43_in_rule__For__Group__5__Impl9185); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4508:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4512:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4513:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__69216);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__69219);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4520:1: rule__For__Group__6__Impl : ( ( rule__For__ActionAssignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4524:1: ( ( ( rule__For__ActionAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4525:1: ( ( rule__For__ActionAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4525:1: ( ( rule__For__ActionAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4526:1: ( rule__For__ActionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getActionAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4527:1: ( rule__For__ActionAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4527:2: rule__For__ActionAssignment_6
            {
            pushFollow(FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl9246);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4537:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4541:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4542:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__79276);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__79279);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4549:1: rule__For__Group__7__Impl : ( ')' ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4553:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4554:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4554:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4555:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,39,FOLLOW_39_in_rule__For__Group__7__Impl9307); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4568:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4572:1: ( rule__For__Group__8__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4573:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__89338);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4579:1: rule__For__Group__8__Impl : ( ( rule__For__BlAssignment_8 ) ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4583:1: ( ( ( rule__For__BlAssignment_8 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4584:1: ( ( rule__For__BlAssignment_8 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4584:1: ( ( rule__For__BlAssignment_8 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4585:1: ( rule__For__BlAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getBlAssignment_8()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4586:1: ( rule__For__BlAssignment_8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4586:2: rule__For__BlAssignment_8
            {
            pushFollow(FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl9365);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4614:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4618:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4619:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__09413);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__09416);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4626:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4630:1: ( ( 'while' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4631:1: ( 'while' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4631:1: ( 'while' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4632:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__While__Group__0__Impl9444); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4645:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4649:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4650:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__19475);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__19478);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4657:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4661:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4662:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4662:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4663:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__While__Group__1__Impl9506); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4676:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4680:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4681:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__29537);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__29540);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4688:1: rule__While__Group__2__Impl : ( ( rule__While__ExAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4692:1: ( ( ( rule__While__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4693:1: ( ( rule__While__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4693:1: ( ( rule__While__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4694:1: ( rule__While__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4695:1: ( rule__While__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4695:2: rule__While__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl9567);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4705:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4709:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4710:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__39597);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__39600);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4717:1: rule__While__Group__3__Impl : ( ')' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4721:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4722:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4722:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4723:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__While__Group__3__Impl9628); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4736:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4740:1: ( rule__While__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4741:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__49659);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4747:1: rule__While__Group__4__Impl : ( ( rule__While__BlAssignment_4 ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4751:1: ( ( ( rule__While__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4752:1: ( ( rule__While__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4752:1: ( ( rule__While__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4753:1: ( rule__While__BlAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4754:1: ( rule__While__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4754:2: rule__While__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl9686);
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


    // $ANTLR start "rule__Declaration__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4774:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4778:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4779:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__09726);
            rule__Declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__09729);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4786:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4790:1: ( ( ( rule__Declaration__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4791:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4791:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4792:1: ( rule__Declaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4793:1: ( rule__Declaration__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4793:2: rule__Declaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl9756);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4803:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4807:1: ( rule__Declaration__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4808:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__19786);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4814:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4818:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4819:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4819:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4820:1: ( rule__Declaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4821:1: ( rule__Declaration__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4821:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl9813);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4835:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4839:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4840:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__09847);
            rule__Return__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Return__Group__1_in_rule__Return__Group__09850);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4847:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4851:1: ( ( 'return' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4852:1: ( 'return' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4852:1: ( 'return' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4853:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Return__Group__0__Impl9878); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4866:1: rule__Return__Group__1 : rule__Return__Group__1__Impl ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4870:1: ( rule__Return__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4871:2: rule__Return__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__19909);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4877:1: rule__Return__Group__1__Impl : ( ( rule__Return__ValueAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4881:1: ( ( ( rule__Return__ValueAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4882:1: ( ( rule__Return__ValueAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4882:1: ( ( rule__Return__ValueAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4883:1: ( rule__Return__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValueAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4884:1: ( rule__Return__ValueAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4884:2: rule__Return__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Return__ValueAssignment_1_in_rule__Return__Group__1__Impl9936);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4899:1: rule__CLfile__ScriptsAssignment_0 : ( ruleScript ) ;
    public final void rule__CLfile__ScriptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4903:1: ( ( ruleScript ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4904:1: ( ruleScript )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4904:1: ( ruleScript )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4905:1: ruleScript
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getScriptsScriptParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleScript_in_rule__CLfile__ScriptsAssignment_09975);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4914:1: rule__CLfile__MetsAssignment_1 : ( ruleMetaMethods ) ;
    public final void rule__CLfile__MetsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4918:1: ( ( ruleMetaMethods ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4919:1: ( ruleMetaMethods )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4919:1: ( ruleMetaMethods )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4920:1: ruleMetaMethods
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getMetsMetaMethodsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetaMethods_in_rule__CLfile__MetsAssignment_110006);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4929:1: rule__Script__NameAssignment_1 : ( RULE_CAPITALFIRST ) ;
    public final void rule__Script__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4933:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4934:1: ( RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4934:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4935:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getNameCAPITALFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__NameAssignment_110037); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4944:1: rule__Script__RobottypesAssignment_4 : ( ( rule__Script__RobottypesAlternatives_4_0 ) ) ;
    public final void rule__Script__RobottypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4948:1: ( ( ( rule__Script__RobottypesAlternatives_4_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4949:1: ( ( rule__Script__RobottypesAlternatives_4_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4949:1: ( ( rule__Script__RobottypesAlternatives_4_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4950:1: ( rule__Script__RobottypesAlternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAlternatives_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4951:1: ( rule__Script__RobottypesAlternatives_4_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4951:2: rule__Script__RobottypesAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAlternatives_4_0_in_rule__Script__RobottypesAssignment_410068);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4960:1: rule__Script__RobotconfigsAssignment_6 : ( ( rule__Script__RobotconfigsAlternatives_6_0 ) ) ;
    public final void rule__Script__RobotconfigsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4964:1: ( ( ( rule__Script__RobotconfigsAlternatives_6_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4965:1: ( ( rule__Script__RobotconfigsAlternatives_6_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4965:1: ( ( rule__Script__RobotconfigsAlternatives_6_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4966:1: ( rule__Script__RobotconfigsAlternatives_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_6_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4967:1: ( rule__Script__RobotconfigsAlternatives_6_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4967:2: rule__Script__RobotconfigsAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAlternatives_6_0_in_rule__Script__RobotconfigsAssignment_610101);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4976:1: rule__Script__RobottypesAssignment_8_2 : ( ( rule__Script__RobottypesAlternatives_8_2_0 ) ) ;
    public final void rule__Script__RobottypesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4980:1: ( ( ( rule__Script__RobottypesAlternatives_8_2_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4981:1: ( ( rule__Script__RobottypesAlternatives_8_2_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4981:1: ( ( rule__Script__RobottypesAlternatives_8_2_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4982:1: ( rule__Script__RobottypesAlternatives_8_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAlternatives_8_2_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4983:1: ( rule__Script__RobottypesAlternatives_8_2_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4983:2: rule__Script__RobottypesAlternatives_8_2_0
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAlternatives_8_2_0_in_rule__Script__RobottypesAssignment_8_210134);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4992:1: rule__Script__RobotconfigsAssignment_8_4 : ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) ) ;
    public final void rule__Script__RobotconfigsAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4996:1: ( ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4997:1: ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4997:1: ( ( rule__Script__RobotconfigsAlternatives_8_4_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4998:1: ( rule__Script__RobotconfigsAlternatives_8_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAlternatives_8_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4999:1: ( rule__Script__RobotconfigsAlternatives_8_4_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4999:2: rule__Script__RobotconfigsAlternatives_8_4_0
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAlternatives_8_4_0_in_rule__Script__RobotconfigsAssignment_8_410167);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5008:1: rule__Script__MethodsAssignment_10 : ( ruleUserMethod ) ;
    public final void rule__Script__MethodsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5012:1: ( ( ruleUserMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5013:1: ( ruleUserMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5013:1: ( ruleUserMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5014:1: ruleUserMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_1010200);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5023:1: rule__MetaMethods__MethodsAssignment_3 : ( ruleMetaMethod ) ;
    public final void rule__MetaMethods__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5027:1: ( ( ruleMetaMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5028:1: ( ruleMetaMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5028:1: ( ruleMetaMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5029:1: ruleMetaMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_310231);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5038:1: rule__Block__ExsAssignment_2_0_0 : ( ruleSimpleExpression ) ;
    public final void rule__Block__ExsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5042:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5043:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5043:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5044:1: ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_010262);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5053:1: rule__Block__ExsAssignment_2_1 : ( ruleStructureExpression ) ;
    public final void rule__Block__ExsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5057:1: ( ( ruleStructureExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5058:1: ( ruleStructureExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5058:1: ( ruleStructureExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5059:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_110293);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5068:1: rule__Assignment__VariAssignment_0 : ( ( rule__Assignment__VariAlternatives_0_0 ) ) ;
    public final void rule__Assignment__VariAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5072:1: ( ( ( rule__Assignment__VariAlternatives_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5073:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5073:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5074:1: ( rule__Assignment__VariAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5075:1: ( rule__Assignment__VariAlternatives_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5075:2: rule__Assignment__VariAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_010324);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5084:1: rule__Assignment__OpAssignment_1_0 : ( ruleMathOperator ) ;
    public final void rule__Assignment__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5088:1: ( ( ruleMathOperator ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5089:1: ( ruleMathOperator )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5089:1: ( ruleMathOperator )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5090:1: ruleMathOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpMathOperatorParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleMathOperator_in_rule__Assignment__OpAssignment_1_010357);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5099:1: rule__Assignment__ValueAssignment_1_2 : ( ruleValueExpression ) ;
    public final void rule__Assignment__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5103:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5104:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5104:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5105:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Assignment__ValueAssignment_1_210388);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5114:1: rule__Call__ParametersAssignment_2 : ( ruleValueExpression ) ;
    public final void rule__Call__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5118:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5119:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5119:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5120:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_210419);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5129:1: rule__Call__ParametersAssignment_3_1 : ( ruleValueExpression ) ;
    public final void rule__Call__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5133:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5134:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5134:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5135:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_3_110450);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5144:1: rule__MetaMethod__TypeAssignment_1 : ( ruleMethodtype ) ;
    public final void rule__MetaMethod__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5148:1: ( ( ruleMethodtype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5149:1: ( ruleMethodtype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5149:1: ( ruleMethodtype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5150:1: ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getTypeMethodtypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_rule__MetaMethod__TypeAssignment_110481);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5159:1: rule__MetaMethod__NameAssignment_2 : ( RULE_CAPITALFIRST ) ;
    public final void rule__MetaMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5163:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5164:1: ( RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5164:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5165:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getNameCAPITALFIRSTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethod__NameAssignment_210512); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5174:1: rule__MetaMethod__ParametersAssignment_4 : ( ruleDeclaration ) ;
    public final void rule__MetaMethod__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5178:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5179:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5179:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5180:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_410543);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5189:1: rule__MetaMethod__ParametersAssignment_5_1 : ( ruleDeclaration ) ;
    public final void rule__MetaMethod__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5193:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5194:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5194:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5195:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_5_110574);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5204:1: rule__UserMethod__TypeAssignment_0 : ( ruleMethodtype ) ;
    public final void rule__UserMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5208:1: ( ( ruleMethodtype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5209:1: ( ruleMethodtype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5209:1: ( ruleMethodtype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5210:1: ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_rule__UserMethod__TypeAssignment_010605);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5219:1: rule__UserMethod__NameAssignment_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__UserMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5223:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5224:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5224:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5225:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__UserMethod__NameAssignment_110636); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5234:1: rule__UserMethod__ParametersAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__UserMethod__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5238:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5239:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5239:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5240:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_310667);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5249:1: rule__UserMethod__ParametersAssignment_4_1 : ( ruleDeclaration ) ;
    public final void rule__UserMethod__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5253:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5254:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5254:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5255:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_4_110698);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5264:1: rule__UserMethod__BlAssignment_6 : ( ruleBlock ) ;
    public final void rule__UserMethod__BlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5268:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5269:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5269:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5270:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_610729);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5279:1: rule__UserMethodCall__MethodAssignment : ( ( RULE_LOWERFIRST ) ) ;
    public final void rule__UserMethodCall__MethodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5283:1: ( ( ( RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5284:1: ( ( RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5284:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5285:1: ( RULE_LOWERFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallAccess().getMethodMethodCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5286:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5287:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallAccess().getMethodMethodLOWERFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__UserMethodCall__MethodAssignment10764); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5298:1: rule__MetaMethodCall__MethodAssignment : ( ( RULE_CAPITALFIRST ) ) ;
    public final void rule__MetaMethodCall__MethodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5302:1: ( ( ( RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5303:1: ( ( RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5303:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5304:1: ( RULE_CAPITALFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallAccess().getMethodMethodCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5305:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5306:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallAccess().getMethodMethodCAPITALFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethodCall__MethodAssignment10803); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5317:1: rule__ParanValueExpression__ExAssignment_1 : ( ruleValueExpression ) ;
    public final void rule__ParanValueExpression__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5321:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5322:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5322:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5323:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getExValueExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__ExAssignment_110838);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5332:1: rule__ParanValueExpression__OpAssignment_3_0 : ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) ) ;
    public final void rule__ParanValueExpression__OpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5336:1: ( ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5337:1: ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5337:1: ( ( rule__ParanValueExpression__OpAlternatives_3_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5338:1: ( rule__ParanValueExpression__OpAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getOpAlternatives_3_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5339:1: ( rule__ParanValueExpression__OpAlternatives_3_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5339:2: rule__ParanValueExpression__OpAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__ParanValueExpression__OpAlternatives_3_0_0_in_rule__ParanValueExpression__OpAssignment_3_010869);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5348:1: rule__ParanValueExpression__VarrightAssignment_3_1 : ( ruleValueExpression ) ;
    public final void rule__ParanValueExpression__VarrightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5352:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5353:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5353:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5354:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParanValueExpressionAccess().getVarrightValueExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__VarrightAssignment_3_110902);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5363:1: rule__BasicValueExpression__VarleftAssignment_0 : ( ruleValue ) ;
    public final void rule__BasicValueExpression__VarleftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5367:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5368:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5368:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5369:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarleftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__BasicValueExpression__VarleftAssignment_010933);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5378:1: rule__BasicValueExpression__OpAssignment_1_0 : ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) ) ;
    public final void rule__BasicValueExpression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5382:1: ( ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5383:1: ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5383:1: ( ( rule__BasicValueExpression__OpAlternatives_1_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5384:1: ( rule__BasicValueExpression__OpAlternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getOpAlternatives_1_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5385:1: ( rule__BasicValueExpression__OpAlternatives_1_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5385:2: rule__BasicValueExpression__OpAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__BasicValueExpression__OpAlternatives_1_0_0_in_rule__BasicValueExpression__OpAssignment_1_010964);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5394:1: rule__BasicValueExpression__VarrightAssignment_1_1 : ( ruleValueExpression ) ;
    public final void rule__BasicValueExpression__VarrightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5398:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5399:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5399:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5400:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueExpressionAccess().getVarrightValueExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__BasicValueExpression__VarrightAssignment_1_110997);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5409:1: rule__Crement__ValueAssignment_0 : ( ruleVarReference ) ;
    public final void rule__Crement__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5413:1: ( ( ruleVarReference ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5414:1: ( ruleVarReference )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5414:1: ( ruleVarReference )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5415:1: ruleVarReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getValueVarReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_rule__Crement__ValueAssignment_011028);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5424:1: rule__Crement__OpAssignment_1 : ( ruleCrementOperator ) ;
    public final void rule__Crement__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5428:1: ( ( ruleCrementOperator ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5429:1: ( ruleCrementOperator )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5429:1: ( ruleCrementOperator )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5430:1: ruleCrementOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrementAccess().getOpCrementOperatorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCrementOperator_in_rule__Crement__OpAssignment_111059);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5439:1: rule__If__ExAssignment_2 : ( ruleValueExpression ) ;
    public final void rule__If__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5443:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5444:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5444:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5445:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__If__ExAssignment_211090);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5454:1: rule__If__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__If__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5458:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5459:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5459:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5460:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__If__BlAssignment_411121);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5469:1: rule__If__ElAssignment_5 : ( ruleElse ) ;
    public final void rule__If__ElAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5473:1: ( ( ruleElse ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5474:1: ( ruleElse )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5474:1: ( ruleElse )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5475:1: ruleElse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElElseParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleElse_in_rule__If__ElAssignment_511152);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5484:1: rule__Else__ExAssignment_1 : ( ruleExpression ) ;
    public final void rule__Else__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5488:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5489:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5489:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5490:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Else__ExAssignment_111183);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5499:1: rule__For__InitAssignment_2 : ( ruleSimpleExpression ) ;
    public final void rule__For__InitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5503:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5504:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5504:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5505:1: ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getInitSimpleExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__For__InitAssignment_211214);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5514:1: rule__For__CheckAssignment_4 : ( ruleValueExpression ) ;
    public final void rule__For__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5518:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5519:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5519:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5520:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCheckValueExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__For__CheckAssignment_411245);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5529:1: rule__For__ActionAssignment_6 : ( ruleSimpleExpression ) ;
    public final void rule__For__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5533:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5534:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5534:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5535:1: ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getActionSimpleExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__For__ActionAssignment_611276);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5544:1: rule__For__BlAssignment_8 : ( ruleBlock ) ;
    public final void rule__For__BlAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5548:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5549:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5549:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5550:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__For__BlAssignment_811307);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5559:1: rule__While__ExAssignment_2 : ( ruleValueExpression ) ;
    public final void rule__While__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5563:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5564:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5564:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5565:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__While__ExAssignment_211338);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5574:1: rule__While__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__While__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5578:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5579:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5579:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5580:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__While__BlAssignment_411369);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5589:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5593:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5594:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5594:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5595:1: ( rule__BooleanValue__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5596:1: ( rule__BooleanValue__ValueAlternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5596:2: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment11400);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5605:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5609:1: ( ( RULE_STRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5610:1: ( RULE_STRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5610:1: ( RULE_STRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5611:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11433); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5620:1: rule__NumberValue__ValueAssignment : ( ruleINTSTRING ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5624:1: ( ( ruleINTSTRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5625:1: ( ruleINTSTRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5625:1: ( ruleINTSTRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5626:1: ruleINTSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment11464);
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


    // $ANTLR start "rule__VarReference__VariAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5635:1: rule__VarReference__VariAssignment : ( ( RULE_LOWERFIRST ) ) ;
    public final void rule__VarReference__VariAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5639:1: ( ( ( RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5640:1: ( ( RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5640:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5641:1: ( RULE_LOWERFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariDeclarationCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5642:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5643:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariDeclarationLOWERFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__VarReference__VariAssignment11499); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5654:1: rule__Declaration__TypeAssignment_0 : ( ruleDatatype ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5658:1: ( ( ruleDatatype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5659:1: ( ruleDatatype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5659:1: ( ruleDatatype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5660:1: ruleDatatype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_011534);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5669:1: rule__Declaration__NameAssignment_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5673:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5674:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5674:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5675:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Declaration__NameAssignment_111565); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5684:1: rule__Return__ValueAssignment_1 : ( ruleValueExpression ) ;
    public final void rule__Return__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5688:1: ( ( ruleValueExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5689:1: ( ruleValueExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5689:1: ( ruleValueExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5690:1: ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValueValueExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Return__ValueAssignment_111596);
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
    public static final BitSet FOLLOW_ruleVarReference_in_entryRuleVarReference1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReference1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0_in_ruleReturn2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_entryRuleMethodtype2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodtype2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTSTRING2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTSTRING2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_4_02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_4_02254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_6_02286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_6_02303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAlternatives_8_2_02335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobottypesAlternatives_8_2_02352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__RobotconfigsAlternatives_8_4_02401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_22433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_22451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrement_in_rule__SimpleExpression__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_rule__SimpleExpression__Alternatives2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Assignment__VariAlternatives_0_02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_rule__Call__Alternatives_02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_rule__Call__Alternatives_02765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanValueExpression_in_rule__ValueExpression__Alternatives2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValueExpression_in_rule__ValueExpression__Alternatives2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__ParanValueExpression__OpAlternatives_3_0_02881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__BasicValueExpression__OpAlternatives_1_0_02947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComparisonOperator__Alternatives3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanOperator__Alternatives3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BooleanOperator__Alternatives3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BooleanOperator__Alternatives3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BooleanOperator__Alternatives3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MathOperator__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MathOperator__Alternatives3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MathOperator__Alternatives3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MathOperator__Alternatives3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CrementOperator__Alternatives3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CrementOperator__Alternatives3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__Value__Alternatives3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Value__Alternatives3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_rule__Value__Alternatives3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BooleanValue__ValueAlternatives_03492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BooleanValue__ValueAlternatives_03512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Methodtype__Alternatives3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Datatype__Alternatives3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Datatype__Alternatives3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Datatype__Alternatives3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__Group__0__Impl_in_rule__CLfile__Group__03671 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__CLfile__Group__1_in_rule__CLfile__Group__03674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__ScriptsAssignment_0_in_rule__CLfile__Group__0__Impl3701 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__CLfile__Group__1__Impl_in_rule__CLfile__Group__13732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__MetsAssignment_1_in_rule__CLfile__Group__1__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__03793 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__03796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Script__Group__0__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__13855 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__23915 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__3_in_rule__Script__Group__23918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Script__Group__2__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__33977 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group__4_in_rule__Script__Group__33980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Script__Group__3__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__44039 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__5_in_rule__Script__Group__44042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_4_in_rule__Script__Group__4__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__54099 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group__6_in_rule__Script__Group__54102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Script__Group__5__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__64161 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__7_in_rule__Script__Group__64164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_6_in_rule__Script__Group__6__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__74221 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__8_in_rule__Script__Group__74224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Script__Group__7__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__8__Impl_in_rule__Script__Group__84283 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_rule__Script__Group__9_in_rule__Script__Group__84286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__0_in_rule__Script__Group__8__Impl4313 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__9__Impl_in_rule__Script__Group__94344 = new BitSet(new long[]{0x0000020780000000L});
    public static final BitSet FOLLOW_rule__Script__Group__10_in_rule__Script__Group__94347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Script__Group__9__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__10__Impl_in_rule__Script__Group__104406 = new BitSet(new long[]{0x0000020780000000L});
    public static final BitSet FOLLOW_rule__Script__Group__11_in_rule__Script__Group__104409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__MethodsAssignment_10_in_rule__Script__Group__10__Impl4436 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_rule__Script__Group__11__Impl_in_rule__Script__Group__114467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Script__Group__11__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__0__Impl_in_rule__Script__Group_8__04550 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Script__Group_8__1_in_rule__Script__Group_8__04553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Script__Group_8__0__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__1__Impl_in_rule__Script__Group_8__14612 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group_8__2_in_rule__Script__Group_8__14615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Script__Group_8__1__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__2__Impl_in_rule__Script__Group_8__24674 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Script__Group_8__3_in_rule__Script__Group_8__24677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_8_2_in_rule__Script__Group_8__2__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__3__Impl_in_rule__Script__Group_8__34734 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Script__Group_8__4_in_rule__Script__Group_8__34737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Script__Group_8__3__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__4__Impl_in_rule__Script__Group_8__44796 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Script__Group_8__5_in_rule__Script__Group_8__44799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_8_4_in_rule__Script__Group_8__4__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_8__5__Impl_in_rule__Script__Group_8__54856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Script__Group_8__5__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__04927 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__04930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__14988 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__14991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MetaMethods__Group__1__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__25050 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__25053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MetaMethods__Group__2__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__35112 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__35115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl5142 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__45173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MetaMethods__Group__4__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05242 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15303 = new BitSet(new long[]{0x0007430780000060L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Block__Group__1__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25365 = new BitSet(new long[]{0x0007430780000060L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl5395 = new BitSet(new long[]{0x0007410780000062L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Block__Group__3__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__05493 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__05496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__15553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Block__Group_2_0__1__Impl5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05616 = new BitSet(new long[]{0x0000100007800000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Group__1__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__05737 = new BitSet(new long[]{0x0000100007800000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__05740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__OpAssignment_1_0_in_rule__Assignment__Group_1__0__Impl5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__15798 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2_in_rule__Assignment__Group_1__15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Assignment__Group_1__1__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__2__Impl_in_rule__Assignment__Group_1__25860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_1_2_in_rule__Assignment__Group_1__2__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05923 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Alternatives_0_in_rule__Call__Group__0__Impl5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15983 = new BitSet(new long[]{0x000000E0600000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Call__Group__1__Impl6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__26045 = new BitSet(new long[]{0x000000E0600000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__26048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__36106 = new BitSet(new long[]{0x000000E0600000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__36109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl6136 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__46167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Call__Group__4__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__06236 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__06239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Call__Group_3__0__Impl6270 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rule__Call__Group_3__0__Impl6286 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__16321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__06382 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__06385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MetaMethod__Group__0__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__16444 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__2_in_rule__MetaMethod__Group__16447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__TypeAssignment_1_in_rule__MetaMethod__Group__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__2__Impl_in_rule__MetaMethod__Group__26504 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__3_in_rule__MetaMethod__Group__26507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__NameAssignment_2_in_rule__MetaMethod__Group__2__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__3__Impl_in_rule__MetaMethod__Group__36564 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__4_in_rule__MetaMethod__Group__36567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MetaMethod__Group__3__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__4__Impl_in_rule__MetaMethod__Group__46626 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__5_in_rule__MetaMethod__Group__46629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__ParametersAssignment_4_in_rule__MetaMethod__Group__4__Impl6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__5__Impl_in_rule__MetaMethod__Group__56687 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__6_in_rule__MetaMethod__Group__56690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__0_in_rule__MetaMethod__Group__5__Impl6717 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__6__Impl_in_rule__MetaMethod__Group__66748 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__7_in_rule__MetaMethod__Group__66751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MetaMethod__Group__6__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__7__Impl_in_rule__MetaMethod__Group__76810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaMethod__Group__7__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__0__Impl_in_rule__MetaMethod__Group_5__06885 = new BitSet(new long[]{0x0000000780000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__1_in_rule__MetaMethod__Group_5__06888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl6919 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rule__MetaMethod__Group_5__0__Impl6935 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__1__Impl_in_rule__MetaMethod__Group_5__16970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__ParametersAssignment_5_1_in_rule__MetaMethod__Group_5__1__Impl6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__07031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__07034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__TypeAssignment_0_in_rule__UserMethod__Group__0__Impl7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__17091 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__2_in_rule__UserMethod__Group__17094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__NameAssignment_1_in_rule__UserMethod__Group__1__Impl7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__2__Impl_in_rule__UserMethod__Group__27151 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__3_in_rule__UserMethod__Group__27154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__UserMethod__Group__2__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__3__Impl_in_rule__UserMethod__Group__37213 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__4_in_rule__UserMethod__Group__37216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__ParametersAssignment_3_in_rule__UserMethod__Group__3__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__4__Impl_in_rule__UserMethod__Group__47274 = new BitSet(new long[]{0x000000C780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__5_in_rule__UserMethod__Group__47277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__0_in_rule__UserMethod__Group__4__Impl7304 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__5__Impl_in_rule__UserMethod__Group__57335 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__6_in_rule__UserMethod__Group__57338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__UserMethod__Group__5__Impl7366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__6__Impl_in_rule__UserMethod__Group__67397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__BlAssignment_6_in_rule__UserMethod__Group__6__Impl7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__0__Impl_in_rule__UserMethod__Group_4__07468 = new BitSet(new long[]{0x0000000780000020L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__1_in_rule__UserMethod__Group_4__07471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7502 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_rule__UserMethod__Group_4__0__Impl7518 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__1__Impl_in_rule__UserMethod__Group_4__17553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__ParametersAssignment_4_1_in_rule__UserMethod__Group_4__1__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__0__Impl_in_rule__ParanValueExpression__Group__07614 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__1_in_rule__ParanValueExpression__Group__07617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParanValueExpression__Group__0__Impl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__1__Impl_in_rule__ParanValueExpression__Group__17676 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__2_in_rule__ParanValueExpression__Group__17679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__ExAssignment_1_in_rule__ParanValueExpression__Group__1__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__2__Impl_in_rule__ParanValueExpression__Group__27736 = new BitSet(new long[]{0x0000000007FFE000L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__3_in_rule__ParanValueExpression__Group__27739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ParanValueExpression__Group__2__Impl7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group__3__Impl_in_rule__ParanValueExpression__Group__37798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__0_in_rule__ParanValueExpression__Group__3__Impl7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__0__Impl_in_rule__ParanValueExpression__Group_3__07864 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__1_in_rule__ParanValueExpression__Group_3__07867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__OpAssignment_3_0_in_rule__ParanValueExpression__Group_3__0__Impl7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__Group_3__1__Impl_in_rule__ParanValueExpression__Group_3__17924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__VarrightAssignment_3_1_in_rule__ParanValueExpression__Group_3__1__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group__0__Impl_in_rule__BasicValueExpression__Group__07985 = new BitSet(new long[]{0x0000000007FFE000L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group__1_in_rule__BasicValueExpression__Group__07988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__VarleftAssignment_0_in_rule__BasicValueExpression__Group__0__Impl8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group__1__Impl_in_rule__BasicValueExpression__Group__18045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__0_in_rule__BasicValueExpression__Group__1__Impl8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__0__Impl_in_rule__BasicValueExpression__Group_1__08107 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__1_in_rule__BasicValueExpression__Group_1__08110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__OpAssignment_1_0_in_rule__BasicValueExpression__Group_1__0__Impl8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__Group_1__1__Impl_in_rule__BasicValueExpression__Group_1__18167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__VarrightAssignment_1_1_in_rule__BasicValueExpression__Group_1__1__Impl8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__Group__0__Impl_in_rule__Crement__Group__08228 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Crement__Group__1_in_rule__Crement__Group__08231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__ValueAssignment_0_in_rule__Crement__Group__0__Impl8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__Group__1__Impl_in_rule__Crement__Group__18288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Crement__OpAssignment_1_in_rule__Crement__Group__1__Impl8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__08349 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__08352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__If__Group__0__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__18411 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__18414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__If__Group__1__Impl8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__28473 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__28476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__38533 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__38536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__If__Group__3__Impl8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__48595 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__If__Group__5_in_rule__If__Group__48598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__5__Impl_in_rule__If__Group__58655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ElAssignment_5_in_rule__If__Group__5__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__08725 = new BitSet(new long[]{0x0007410780000060L});
    public static final BitSet FOLLOW_rule__Else__Group__1_in_rule__Else__Group__08728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Else__Group__0__Impl8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__18787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__08848 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__08851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__For__Group__0__Impl8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__18910 = new BitSet(new long[]{0x0004000780000060L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__18913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__For__Group__1__Impl8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__28972 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__28975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__39032 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__39035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__For__Group__3__Impl9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__49094 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__49097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl9124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__59154 = new BitSet(new long[]{0x0004000780000060L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__59157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__For__Group__5__Impl9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__69216 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__69219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__79276 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__79279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__For__Group__7__Impl9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__89338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__09413 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__09416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__While__Group__0__Impl9444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__19475 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__19478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__While__Group__1__Impl9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__29537 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__29540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__39597 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__39600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__While__Group__3__Impl9628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__49659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__09726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__09729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__19786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__09847 = new BitSet(new long[]{0x00000020600000F0L});
    public static final BitSet FOLLOW_rule__Return__Group__1_in_rule__Return__Group__09850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Return__Group__0__Impl9878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__19909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__ValueAssignment_1_in_rule__Return__Group__1__Impl9936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__CLfile__ScriptsAssignment_09975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_rule__CLfile__MetsAssignment_110006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__NameAssignment_110037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAlternatives_4_0_in_rule__Script__RobottypesAssignment_410068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAlternatives_6_0_in_rule__Script__RobotconfigsAssignment_610101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAlternatives_8_2_0_in_rule__Script__RobottypesAssignment_8_210134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAlternatives_8_4_0_in_rule__Script__RobotconfigsAssignment_8_410167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_1010200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_310231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_010262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_110293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_010324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__Assignment__OpAssignment_1_010357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Assignment__ValueAssignment_1_210388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_210419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Call__ParametersAssignment_3_110450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_rule__MetaMethod__TypeAssignment_110481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethod__NameAssignment_210512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_410543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_5_110574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_rule__UserMethod__TypeAssignment_010605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__UserMethod__NameAssignment_110636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_310667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_4_110698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_610729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__UserMethodCall__MethodAssignment10764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethodCall__MethodAssignment10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__ExAssignment_110838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanValueExpression__OpAlternatives_3_0_0_in_rule__ParanValueExpression__OpAssignment_3_010869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__ParanValueExpression__VarrightAssignment_3_110902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__BasicValueExpression__VarleftAssignment_010933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValueExpression__OpAlternatives_1_0_0_in_rule__BasicValueExpression__OpAssignment_1_010964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__BasicValueExpression__VarrightAssignment_1_110997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Crement__ValueAssignment_011028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrementOperator_in_rule__Crement__OpAssignment_111059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__If__ExAssignment_211090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__If__BlAssignment_411121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_rule__If__ElAssignment_511152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Else__ExAssignment_111183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__For__InitAssignment_211214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__For__CheckAssignment_411245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__For__ActionAssignment_611276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__For__BlAssignment_811307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__While__ExAssignment_211338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__While__BlAssignment_411369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment11400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment11464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__VarReference__VariAssignment11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_011534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Declaration__NameAssignment_111565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Return__ValueAssignment_111596 = new BitSet(new long[]{0x0000000000000002L});

}