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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_CAPITALFIRST", "RULE_LOWERFIRST", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'!&&'", "'!||'", "'true'", "'false'", "'void'", "'int'", "'string'", "'boolean'", "'script'", "'targets'", "')'", "'{'", "'}'", "'('", "','", "'metamethodscollection'", "';'", "'='", "'meta'", "'if'", "'else'", "'for'", "'while'", "'return'"
    };
    public static final int RULE_LOWERFIRST=6;
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
    public static final int RULE_CAPITALFIRST=5;
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
    public static final int T__44=44;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:70:1: ruleCLfile : ( ( rule__CLfile__MetsAssignment )* ) ;
    public final void ruleCLfile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:74:2: ( ( ( rule__CLfile__MetsAssignment )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:75:1: ( ( rule__CLfile__MetsAssignment )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:75:1: ( ( rule__CLfile__MetsAssignment )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:76:1: ( rule__CLfile__MetsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getMetsAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:77:1: ( rule__CLfile__MetsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:77:2: rule__CLfile__MetsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__CLfile__MetsAssignment_in_ruleCLfile100);
            	    rule__CLfile__MetsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileAccess().getMetsAssignment()); 
            }

            }


            }

        }
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
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript128);
            ruleScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript135); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__Script__Group__0_in_ruleScript161);
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
            pushFollow(FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods188);
            ruleMetaMethods();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethods195); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__MetaMethods__Group__0_in_ruleMetaMethods221);
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
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock248);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock255); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock281);
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
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression308);
            ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression315); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression341);
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
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression368);
            ruleStructureExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression375); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__StructureExpression__Alternatives_in_ruleStructureExpression401);
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
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression428);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression435); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression461);
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
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment488);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment495); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment521);
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
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall548);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall555); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall581);
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
            pushFollow(FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod610);
            ruleMetaMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethod617); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__MetaMethod__Group__0_in_ruleMetaMethod643);
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
            pushFollow(FOLLOW_ruleUserMethod_in_entryRuleUserMethod670);
            ruleUserMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethod677); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__UserMethod__Group__0_in_ruleUserMethod703);
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
            pushFollow(FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall730);
            ruleUserMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethodCall737); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__UserMethodCall__MethodAssignment_in_ruleUserMethodCall763);
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
            pushFollow(FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall790);
            ruleMetaMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethodCall797); if (state.failed) return ;

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
            pushFollow(FOLLOW_rule__MetaMethodCall__MethodAssignment_in_ruleMetaMethodCall823);
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


    // $ANTLR start "entryRuleBool"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:429:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:430:1: ( ruleBool EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:431:1: ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool852);
            ruleBool();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool859); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:438:1: ruleBool : ( ( rule__Bool__Group__0 ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:442:2: ( ( ( rule__Bool__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:443:1: ( ( rule__Bool__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:443:1: ( ( rule__Bool__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:444:1: ( rule__Bool__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:445:1: ( rule__Bool__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:445:2: rule__Bool__Group__0
            {
            pushFollow(FOLLOW_rule__Bool__Group__0_in_ruleBool885);
            rule__Bool__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleComparisonOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:457:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:458:1: ( ruleComparisonOperator EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:459:1: ruleComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator912);
            ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator919); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:466:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:470:2: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:471:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:471:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:472:1: ( rule__ComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:473:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:473:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator945);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:485:1: entryRuleBooleanOperator : ruleBooleanOperator EOF ;
    public final void entryRuleBooleanOperator() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:486:1: ( ruleBooleanOperator EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:487:1: ruleBooleanOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator972);
            ruleBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator979); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:494:1: ruleBooleanOperator : ( ( rule__BooleanOperator__Alternatives ) ) ;
    public final void ruleBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:498:2: ( ( ( rule__BooleanOperator__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:499:1: ( ( rule__BooleanOperator__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:499:1: ( ( rule__BooleanOperator__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:500:1: ( rule__BooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:501:1: ( rule__BooleanOperator__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:501:2: rule__BooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanOperator__Alternatives_in_ruleBooleanOperator1005);
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


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:513:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:514:1: ( ruleIf EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:515:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1032);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1039); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:522:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:526:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:527:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:527:1: ( ( rule__If__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:528:1: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:529:1: ( rule__If__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:529:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf1065);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:541:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:542:1: ( ruleElse EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:543:1: ruleElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseRule()); 
            }
            pushFollow(FOLLOW_ruleElse_in_entryRuleElse1092);
            ruleElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElseRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElse1099); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:550:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:554:2: ( ( ( rule__Else__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:555:1: ( ( rule__Else__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:555:1: ( ( rule__Else__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:556:1: ( rule__Else__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:557:1: ( rule__Else__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:557:2: rule__Else__Group__0
            {
            pushFollow(FOLLOW_rule__Else__Group__0_in_ruleElse1125);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:569:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:570:1: ( ruleFor EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:571:1: ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1152);
            ruleFor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1159); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:578:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:582:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:583:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:583:1: ( ( rule__For__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:584:1: ( rule__For__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:585:1: ( rule__For__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:585:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor1185);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:597:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:598:1: ( ruleWhile EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:599:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1212);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1219); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:606:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:610:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:611:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:611:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:612:1: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:613:1: ( rule__While__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:613:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile1245);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:625:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:626:1: ( ruleValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:627:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1272);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1279); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:634:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:638:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:639:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:639:1: ( ( rule__Value__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:640:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:641:1: ( rule__Value__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:641:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1305);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:653:1: entryRuleBasicValue : ruleBasicValue EOF ;
    public final void entryRuleBasicValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:654:1: ( ruleBasicValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:655:1: ruleBasicValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueRule()); 
            }
            pushFollow(FOLLOW_ruleBasicValue_in_entryRuleBasicValue1332);
            ruleBasicValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValue1339); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:662:1: ruleBasicValue : ( ( rule__BasicValue__Alternatives ) ) ;
    public final void ruleBasicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:666:2: ( ( ( rule__BasicValue__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:667:1: ( ( rule__BasicValue__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:667:1: ( ( rule__BasicValue__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:668:1: ( rule__BasicValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicValueAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:669:1: ( rule__BasicValue__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:669:2: rule__BasicValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicValue__Alternatives_in_ruleBasicValue1365);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:681:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:682:1: ( ruleBooleanValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:683:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1392);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1399); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:690:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:694:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:695:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:695:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:696:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:697:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:697:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1425);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:709:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:710:1: ( ruleStringValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:711:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1452);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1459); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:718:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:722:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:723:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:723:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:724:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:725:1: ( rule__StringValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:725:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1485);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:737:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:738:1: ( ruleNumberValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:739:1: ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue1512);
            ruleNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue1519); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:746:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:750:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:751:1: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:751:1: ( ( rule__NumberValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:752:1: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:753:1: ( rule__NumberValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:753:2: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue1545);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:765:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:766:1: ( ruleVarReference EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:767:1: ruleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_entryRuleVarReference1572);
            ruleVarReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReference1579); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:774:1: ruleVarReference : ( ( rule__VarReference__VariAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:778:2: ( ( ( rule__VarReference__VariAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:779:1: ( ( rule__VarReference__VariAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:779:1: ( ( rule__VarReference__VariAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:780:1: ( rule__VarReference__VariAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariAssignment()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:781:1: ( rule__VarReference__VariAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:781:2: rule__VarReference__VariAssignment
            {
            pushFollow(FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1605);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:793:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:794:1: ( ruleDeclaration EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:795:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1632);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1639); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:802:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:806:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:807:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:807:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:808:1: ( rule__Declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:809:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:809:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration1665);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:821:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:822:1: ( ruleReturn EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:823:1: ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn1692);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn1699); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:830:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:834:2: ( ( ( rule__Return__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:835:1: ( ( rule__Return__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:835:1: ( ( rule__Return__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:836:1: ( rule__Return__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getGroup()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:837:1: ( rule__Return__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:837:2: rule__Return__Group__0
            {
            pushFollow(FOLLOW_rule__Return__Group__0_in_ruleReturn1725);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:849:1: entryRuleMethodtype : ruleMethodtype EOF ;
    public final void entryRuleMethodtype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:850:1: ( ruleMethodtype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:851:1: ruleMethodtype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodtypeRule()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_entryRuleMethodtype1752);
            ruleMethodtype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodtypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodtype1759); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:858:1: ruleMethodtype : ( ( rule__Methodtype__Alternatives ) ) ;
    public final void ruleMethodtype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:862:2: ( ( ( rule__Methodtype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:863:1: ( ( rule__Methodtype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:863:1: ( ( rule__Methodtype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:864:1: ( rule__Methodtype__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodtypeAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:865:1: ( rule__Methodtype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:865:2: rule__Methodtype__Alternatives
            {
            pushFollow(FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype1785);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:877:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:878:1: ( ruleDatatype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:879:1: ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype1812);
            ruleDatatype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDatatypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype1819); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:886:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:890:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:891:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:891:1: ( ( rule__Datatype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:892:1: ( rule__Datatype__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:893:1: ( rule__Datatype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:893:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype1845);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:905:1: entryRuleINTSTRING : ruleINTSTRING EOF ;
    public final void entryRuleINTSTRING() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:906:1: ( ruleINTSTRING EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:907:1: ruleINTSTRING EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTSTRINGRule()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING1872);
            ruleINTSTRING();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTSTRINGRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTSTRING1879); if (state.failed) return ;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:914:1: ruleINTSTRING : ( RULE_INT ) ;
    public final void ruleINTSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:918:2: ( ( RULE_INT ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:919:1: ( RULE_INT )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:919:1: ( RULE_INT )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:920:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTSTRINGAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTSTRING1905); if (state.failed) return ;
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


    // $ANTLR start "rule__CLfile__MetsAlternatives_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:933:1: rule__CLfile__MetsAlternatives_0 : ( ( ruleScript ) | ( ruleMetaMethods ) );
    public final void rule__CLfile__MetsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:937:1: ( ( ruleScript ) | ( ruleMetaMethods ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:938:1: ( ruleScript )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:938:1: ( ruleScript )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:939:1: ruleScript
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCLfileAccess().getMetsScriptParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleScript_in_rule__CLfile__MetsAlternatives_01940);
                    ruleScript();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCLfileAccess().getMetsScriptParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:944:6: ( ruleMetaMethods )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:944:6: ( ruleMetaMethods )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:945:1: ruleMetaMethods
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCLfileAccess().getMetsMetaMethodsParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleMetaMethods_in_rule__CLfile__MetsAlternatives_01957);
                    ruleMetaMethods();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCLfileAccess().getMetsMetaMethodsParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__CLfile__MetsAlternatives_0"


    // $ANTLR start "rule__Script__Alternatives_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:955:1: rule__Script__Alternatives_3 : ( ( ( rule__Script__Group_3_0__0 ) ) | ( ( rule__Script__Group_3_1__0 ) ) );
    public final void rule__Script__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:959:1: ( ( ( rule__Script__Group_3_0__0 ) ) | ( ( rule__Script__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_LOWERFIRST) ) {
                    alt3=1;
                }
                else if ( (LA3_1==31||LA3_1==34) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:960:1: ( ( rule__Script__Group_3_0__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:960:1: ( ( rule__Script__Group_3_0__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:961:1: ( rule__Script__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getGroup_3_0()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:962:1: ( rule__Script__Group_3_0__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:962:2: rule__Script__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Script__Group_3_0__0_in_rule__Script__Alternatives_31989);
                    rule__Script__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:966:6: ( ( rule__Script__Group_3_1__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:966:6: ( ( rule__Script__Group_3_1__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:967:1: ( rule__Script__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScriptAccess().getGroup_3_1()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:968:1: ( rule__Script__Group_3_1__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:968:2: rule__Script__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Script__Group_3_1__0_in_rule__Script__Alternatives_32007);
                    rule__Script__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScriptAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__Script__Alternatives_3"


    // $ANTLR start "rule__Block__Alternatives_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:977:1: rule__Block__Alternatives_2 : ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) );
    public final void rule__Block__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:981:1: ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_CAPITALFIRST && LA4_0<=RULE_LOWERFIRST)||(LA4_0>=26 && LA4_0<=28)||LA4_0==38||LA4_0==44) ) {
                alt4=1;
            }
            else if ( (LA4_0==32||(LA4_0>=40 && LA4_0<=43)) ) {
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:982:1: ( ( rule__Block__Group_2_0__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:982:1: ( ( rule__Block__Group_2_0__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:983:1: ( rule__Block__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getGroup_2_0()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:984:1: ( rule__Block__Group_2_0__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:984:2: rule__Block__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_22040);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:988:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:988:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:989:1: ( rule__Block__ExsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getExsAssignment_2_1()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:990:1: ( rule__Block__ExsAssignment_2_1 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:990:2: rule__Block__ExsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_22058);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:999:1: rule__SimpleExpression__Alternatives : ( ( ruleCall ) | ( ruleAssignment ) | ( ruleReturn ) );
    public final void rule__SimpleExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1003:1: ( ( ruleCall ) | ( ruleAssignment ) | ( ruleReturn ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_CAPITALFIRST:
            case RULE_LOWERFIRST:
                {
                alt5=1;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 38:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1004:1: ( ruleCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1004:1: ( ruleCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1005:1: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives2091);
                    ruleCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1010:6: ( ruleAssignment )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1010:6: ( ruleAssignment )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1011:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives2108);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1016:6: ( ruleReturn )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1016:6: ( ruleReturn )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1017:1: ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleReturn_in_rule__SimpleExpression__Alternatives2125);
                    ruleReturn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_2()); 
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1027:1: rule__StructureExpression__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleElse ) | ( ruleFor ) | ( ruleWhile ) );
    public final void rule__StructureExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1031:1: ( ( ruleBlock ) | ( ruleIf ) | ( ruleElse ) | ( ruleFor ) | ( ruleWhile ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case 41:
                {
                alt6=3;
                }
                break;
            case 42:
                {
                alt6=4;
                }
                break;
            case 43:
                {
                alt6=5;
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1032:1: ( ruleBlock )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1032:1: ( ruleBlock )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1033:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives2157);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1038:6: ( ruleIf )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1038:6: ( ruleIf )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1039:1: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives2174);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1044:6: ( ruleElse )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1044:6: ( ruleElse )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1045:1: ruleElse
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getElseParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleElse_in_rule__StructureExpression__Alternatives2191);
                    ruleElse();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructureExpressionAccess().getElseParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1050:6: ( ruleFor )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1050:6: ( ruleFor )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1051:1: ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2208);
                    ruleFor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1056:6: ( ruleWhile )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1056:6: ( ruleWhile )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1057:1: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2225);
                    ruleWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_4()); 
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1067:1: rule__Expression__Alternatives : ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1071:1: ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_CAPITALFIRST && LA7_0<=RULE_LOWERFIRST)||(LA7_0>=26 && LA7_0<=28)||LA7_0==38||LA7_0==44) ) {
                alt7=1;
            }
            else if ( (LA7_0==32||(LA7_0>=40 && LA7_0<=43)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1072:1: ( ruleSimpleExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1072:1: ( ruleSimpleExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1073:1: ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2257);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1078:6: ( ruleStructureExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1078:6: ( ruleStructureExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1079:1: ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2274);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1089:1: rule__Assignment__VariAlternatives_0_0 : ( ( () ) | ( ruleDeclaration ) );
    public final void rule__Assignment__VariAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1093:1: ( ( () ) | ( ruleDeclaration ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=26 && LA8_0<=28)) ) {
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1094:1: ( () )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1094:1: ( () )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1095:1: ()
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getVariDeclarationCrossReference_0_0_0()); 
                    }
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1096:1: ()
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1098:1: 
                    {
                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getVariDeclarationCrossReference_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1102:6: ( ruleDeclaration )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1102:6: ( ruleDeclaration )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1103:1: ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02325);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1113:1: rule__Call__Alternatives_0 : ( ( ruleUserMethodCall ) | ( ruleMetaMethodCall ) );
    public final void rule__Call__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1117:1: ( ( ruleUserMethodCall ) | ( ruleMetaMethodCall ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LOWERFIRST) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_CAPITALFIRST) ) {
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1118:1: ( ruleUserMethodCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1118:1: ( ruleUserMethodCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1119:1: ruleUserMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallAccess().getUserMethodCallParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleUserMethodCall_in_rule__Call__Alternatives_02357);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1124:6: ( ruleMetaMethodCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1124:6: ( ruleMetaMethodCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1125:1: ruleMetaMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallAccess().getMetaMethodCallParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleMetaMethodCall_in_rule__Call__Alternatives_02374);
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


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1137:1: rule__ComparisonOperator__Alternatives : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1141:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 15:
                {
                alt10=3;
                }
                break;
            case 16:
                {
                alt10=4;
                }
                break;
            case 17:
                {
                alt10=5;
                }
                break;
            case 18:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1142:1: ( '==' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1142:1: ( '==' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1143:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives2409); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1150:6: ( '!=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1150:6: ( '!=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1151:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives2429); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1158:6: ( '<' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1158:6: ( '<' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1159:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives2449); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1166:6: ( '>' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1166:6: ( '>' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1167:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives2469); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1174:6: ( '<=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1174:6: ( '<=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1175:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives2489); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1182:6: ( '>=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1182:6: ( '>=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1183:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ComparisonOperator__Alternatives2509); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1195:1: rule__BooleanOperator__Alternatives : ( ( '&&' ) | ( '||' ) | ( '!&&' ) | ( '!||' ) );
    public final void rule__BooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1199:1: ( ( '&&' ) | ( '||' ) | ( '!&&' ) | ( '!||' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1200:1: ( '&&' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1200:1: ( '&&' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1201:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__BooleanOperator__Alternatives2544); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1208:6: ( '||' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1208:6: ( '||' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1209:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__BooleanOperator__Alternatives2564); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1216:6: ( '!&&' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1216:6: ( '!&&' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1217:1: '!&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__BooleanOperator__Alternatives2584); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1224:6: ( '!||' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1224:6: ( '!||' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1225:1: '!||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getExclamationMarkVerticalLineVerticalLineKeyword_3()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__BooleanOperator__Alternatives2604); if (state.failed) return ;
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


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1237:1: rule__Value__Alternatives : ( ( ruleCall ) | ( ruleVarReference ) | ( ruleBasicValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1241:1: ( ( ruleCall ) | ( ruleVarReference ) | ( ruleBasicValue ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==34) ) {
                    alt12=1;
                }
                else if ( (LA12_1==EOF||(LA12_1>=RULE_CAPITALFIRST && LA12_1<=RULE_LOWERFIRST)||(LA12_1>=13 && LA12_1<=22)||(LA12_1>=26 && LA12_1<=28)||(LA12_1>=31 && LA12_1<=33)||LA12_1==35||(LA12_1>=37 && LA12_1<=38)||(LA12_1>=40 && LA12_1<=44)) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 23:
            case 24:
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1242:1: ( ruleCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1242:1: ( ruleCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1243:1: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCall_in_rule__Value__Alternatives2638);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1248:6: ( ruleVarReference )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1248:6: ( ruleVarReference )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1249:1: ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_rule__Value__Alternatives2655);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1254:6: ( ruleBasicValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1254:6: ( ruleBasicValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1255:1: ruleBasicValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBasicValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBasicValue_in_rule__Value__Alternatives2672);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1265:1: rule__BasicValue__Alternatives : ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) );
    public final void rule__BasicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1269:1: ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1270:1: ( ruleBooleanValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1270:1: ( ruleBooleanValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1271:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives2704);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1276:6: ( ruleNumberValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1276:6: ( ruleNumberValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1277:1: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives2721);
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1282:6: ( ruleStringValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1282:6: ( ruleStringValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1283:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives2738);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1293:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1297:1: ( ( 'true' ) | ( 'false' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1298:1: ( 'true' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1298:1: ( 'true' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1299:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__BooleanValue__ValueAlternatives_02771); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1306:6: ( 'false' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1306:6: ( 'false' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1307:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__BooleanValue__ValueAlternatives_02791); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1319:1: rule__Methodtype__Alternatives : ( ( 'void' ) | ( ruleDatatype ) );
    public final void rule__Methodtype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1323:1: ( ( 'void' ) | ( ruleDatatype ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=26 && LA15_0<=28)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1324:1: ( 'void' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1324:1: ( 'void' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1325:1: 'void'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__Methodtype__Alternatives2826); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1332:6: ( ruleDatatype )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1332:6: ( ruleDatatype )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1333:1: ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives2845);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1343:1: rule__Datatype__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1347:1: ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt16=1;
                }
                break;
            case 27:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
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
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1348:1: ( 'int' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1348:1: ( 'int' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1349:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__Datatype__Alternatives2878); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1356:6: ( 'string' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1356:6: ( 'string' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1357:1: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__Datatype__Alternatives2898); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1364:6: ( 'boolean' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1364:6: ( 'boolean' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1365:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__Datatype__Alternatives2918); if (state.failed) return ;
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


    // $ANTLR start "rule__Script__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1379:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1383:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1384:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__02950);
            rule__Script__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__02953);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1391:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1395:1: ( ( 'script' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1396:1: ( 'script' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1396:1: ( 'script' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1397:1: 'script'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Script__Group__0__Impl2981); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1410:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1414:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1415:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__13012);
            rule__Script__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__13015);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1422:1: rule__Script__Group__1__Impl : ( ( rule__Script__NameAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1426:1: ( ( ( rule__Script__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1427:1: ( ( rule__Script__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1427:1: ( ( rule__Script__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1428:1: ( rule__Script__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1429:1: ( rule__Script__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1429:2: rule__Script__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl3042);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1439:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1443:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1444:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__23072);
            rule__Script__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__3_in_rule__Script__Group__23075);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1451:1: rule__Script__Group__2__Impl : ( 'targets' ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1455:1: ( ( 'targets' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1456:1: ( 'targets' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1456:1: ( 'targets' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1457:1: 'targets'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getTargetsKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Script__Group__2__Impl3103); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1470:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1474:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1475:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__33134);
            rule__Script__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__4_in_rule__Script__Group__33137);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1482:1: rule__Script__Group__3__Impl : ( ( rule__Script__Alternatives_3 ) ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1486:1: ( ( ( rule__Script__Alternatives_3 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1487:1: ( ( rule__Script__Alternatives_3 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1487:1: ( ( rule__Script__Alternatives_3 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1488:1: ( rule__Script__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getAlternatives_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1489:1: ( rule__Script__Alternatives_3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1489:2: rule__Script__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Script__Alternatives_3_in_rule__Script__Group__3__Impl3164);
            rule__Script__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getAlternatives_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1499:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1503:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1504:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__43194);
            rule__Script__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__5_in_rule__Script__Group__43197);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1511:1: rule__Script__Group__4__Impl : ( ')' ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1515:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1516:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1516:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1517:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__Script__Group__4__Impl3225); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1530:1: rule__Script__Group__5 : rule__Script__Group__5__Impl rule__Script__Group__6 ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1534:1: ( rule__Script__Group__5__Impl rule__Script__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1535:2: rule__Script__Group__5__Impl rule__Script__Group__6
            {
            pushFollow(FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__53256);
            rule__Script__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__6_in_rule__Script__Group__53259);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1542:1: rule__Script__Group__5__Impl : ( '{' ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1546:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1547:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1547:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1548:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,32,FOLLOW_32_in_rule__Script__Group__5__Impl3287); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1561:1: rule__Script__Group__6 : rule__Script__Group__6__Impl rule__Script__Group__7 ;
    public final void rule__Script__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1565:1: ( rule__Script__Group__6__Impl rule__Script__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1566:2: rule__Script__Group__6__Impl rule__Script__Group__7
            {
            pushFollow(FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__63318);
            rule__Script__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group__7_in_rule__Script__Group__63321);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1573:1: rule__Script__Group__6__Impl : ( ( rule__Script__MethodsAssignment_6 )* ) ;
    public final void rule__Script__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1577:1: ( ( ( rule__Script__MethodsAssignment_6 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1578:1: ( ( rule__Script__MethodsAssignment_6 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1578:1: ( ( rule__Script__MethodsAssignment_6 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1579:1: ( rule__Script__MethodsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getMethodsAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1580:1: ( rule__Script__MethodsAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=25 && LA17_0<=28)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1580:2: rule__Script__MethodsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Script__MethodsAssignment_6_in_rule__Script__Group__6__Impl3348);
            	    rule__Script__MethodsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getMethodsAssignment_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1590:1: rule__Script__Group__7 : rule__Script__Group__7__Impl ;
    public final void rule__Script__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1594:1: ( rule__Script__Group__7__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1595:2: rule__Script__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__73379);
            rule__Script__Group__7__Impl();

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1601:1: rule__Script__Group__7__Impl : ( '}' ) ;
    public final void rule__Script__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1605:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1606:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1606:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1607:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,33,FOLLOW_33_in_rule__Script__Group__7__Impl3407); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Script__Group_3_0__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1636:1: rule__Script__Group_3_0__0 : rule__Script__Group_3_0__0__Impl rule__Script__Group_3_0__1 ;
    public final void rule__Script__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1640:1: ( rule__Script__Group_3_0__0__Impl rule__Script__Group_3_0__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1641:2: rule__Script__Group_3_0__0__Impl rule__Script__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__0__Impl_in_rule__Script__Group_3_0__03454);
            rule__Script__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_0__1_in_rule__Script__Group_3_0__03457);
            rule__Script__Group_3_0__1();

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
    // $ANTLR end "rule__Script__Group_3_0__0"


    // $ANTLR start "rule__Script__Group_3_0__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1648:1: rule__Script__Group_3_0__0__Impl : ( '(' ) ;
    public final void rule__Script__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1652:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1653:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1653:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1654:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Script__Group_3_0__0__Impl3485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_0__0__Impl"


    // $ANTLR start "rule__Script__Group_3_0__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1667:1: rule__Script__Group_3_0__1 : rule__Script__Group_3_0__1__Impl rule__Script__Group_3_0__2 ;
    public final void rule__Script__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1671:1: ( rule__Script__Group_3_0__1__Impl rule__Script__Group_3_0__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1672:2: rule__Script__Group_3_0__1__Impl rule__Script__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__1__Impl_in_rule__Script__Group_3_0__13516);
            rule__Script__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_0__2_in_rule__Script__Group_3_0__13519);
            rule__Script__Group_3_0__2();

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
    // $ANTLR end "rule__Script__Group_3_0__1"


    // $ANTLR start "rule__Script__Group_3_0__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1679:1: rule__Script__Group_3_0__1__Impl : ( ( rule__Script__RobottypesAssignment_3_0_1 ) ) ;
    public final void rule__Script__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1683:1: ( ( ( rule__Script__RobottypesAssignment_3_0_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1684:1: ( ( rule__Script__RobottypesAssignment_3_0_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1684:1: ( ( rule__Script__RobottypesAssignment_3_0_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1685:1: ( rule__Script__RobottypesAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAssignment_3_0_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1686:1: ( rule__Script__RobottypesAssignment_3_0_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1686:2: rule__Script__RobottypesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_3_0_1_in_rule__Script__Group_3_0__1__Impl3546);
            rule__Script__RobottypesAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_0__1__Impl"


    // $ANTLR start "rule__Script__Group_3_0__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1696:1: rule__Script__Group_3_0__2 : rule__Script__Group_3_0__2__Impl rule__Script__Group_3_0__3 ;
    public final void rule__Script__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1700:1: ( rule__Script__Group_3_0__2__Impl rule__Script__Group_3_0__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1701:2: rule__Script__Group_3_0__2__Impl rule__Script__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__2__Impl_in_rule__Script__Group_3_0__23576);
            rule__Script__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_0__3_in_rule__Script__Group_3_0__23579);
            rule__Script__Group_3_0__3();

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
    // $ANTLR end "rule__Script__Group_3_0__2"


    // $ANTLR start "rule__Script__Group_3_0__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1708:1: rule__Script__Group_3_0__2__Impl : ( ',' ) ;
    public final void rule__Script__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1712:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1713:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1713:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1714:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_3_0_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Script__Group_3_0__2__Impl3607); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getCommaKeyword_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_0__2__Impl"


    // $ANTLR start "rule__Script__Group_3_0__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1727:1: rule__Script__Group_3_0__3 : rule__Script__Group_3_0__3__Impl ;
    public final void rule__Script__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1731:1: ( rule__Script__Group_3_0__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1732:2: rule__Script__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__3__Impl_in_rule__Script__Group_3_0__33638);
            rule__Script__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__Script__Group_3_0__3"


    // $ANTLR start "rule__Script__Group_3_0__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1738:1: rule__Script__Group_3_0__3__Impl : ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) ) ;
    public final void rule__Script__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1742:1: ( ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1743:1: ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1743:1: ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1744:1: ( rule__Script__RobotconfigsAssignment_3_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_0_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1745:1: ( rule__Script__RobotconfigsAssignment_3_0_3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1745:2: rule__Script__RobotconfigsAssignment_3_0_3
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_3_0_3_in_rule__Script__Group_3_0__3__Impl3665);
            rule__Script__RobotconfigsAssignment_3_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_0__3__Impl"


    // $ANTLR start "rule__Script__Group_3_1__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1763:1: rule__Script__Group_3_1__0 : rule__Script__Group_3_1__0__Impl rule__Script__Group_3_1__1 ;
    public final void rule__Script__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1767:1: ( rule__Script__Group_3_1__0__Impl rule__Script__Group_3_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1768:2: rule__Script__Group_3_1__0__Impl rule__Script__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1__0__Impl_in_rule__Script__Group_3_1__03703);
            rule__Script__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_1__1_in_rule__Script__Group_3_1__03706);
            rule__Script__Group_3_1__1();

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
    // $ANTLR end "rule__Script__Group_3_1__0"


    // $ANTLR start "rule__Script__Group_3_1__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1775:1: rule__Script__Group_3_1__0__Impl : ( '(' ) ;
    public final void rule__Script__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1779:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1780:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1780:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1781:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Script__Group_3_1__0__Impl3734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_1__0__Impl"


    // $ANTLR start "rule__Script__Group_3_1__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1794:1: rule__Script__Group_3_1__1 : rule__Script__Group_3_1__1__Impl ;
    public final void rule__Script__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1798:1: ( rule__Script__Group_3_1__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1799:2: rule__Script__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1__1__Impl_in_rule__Script__Group_3_1__13765);
            rule__Script__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Script__Group_3_1__1"


    // $ANTLR start "rule__Script__Group_3_1__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1805:1: rule__Script__Group_3_1__1__Impl : ( ( rule__Script__Group_3_1_1__0 )* ) ;
    public final void rule__Script__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1809:1: ( ( ( rule__Script__Group_3_1_1__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1810:1: ( ( rule__Script__Group_3_1_1__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1810:1: ( ( rule__Script__Group_3_1_1__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1811:1: ( rule__Script__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup_3_1_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1812:1: ( rule__Script__Group_3_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1812:2: rule__Script__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Script__Group_3_1_1__0_in_rule__Script__Group_3_1__1__Impl3792);
            	    rule__Script__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_1__1__Impl"


    // $ANTLR start "rule__Script__Group_3_1_1__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1826:1: rule__Script__Group_3_1_1__0 : rule__Script__Group_3_1_1__0__Impl rule__Script__Group_3_1_1__1 ;
    public final void rule__Script__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1830:1: ( rule__Script__Group_3_1_1__0__Impl rule__Script__Group_3_1_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1831:2: rule__Script__Group_3_1_1__0__Impl rule__Script__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__0__Impl_in_rule__Script__Group_3_1_1__03827);
            rule__Script__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__1_in_rule__Script__Group_3_1_1__03830);
            rule__Script__Group_3_1_1__1();

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
    // $ANTLR end "rule__Script__Group_3_1_1__0"


    // $ANTLR start "rule__Script__Group_3_1_1__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1838:1: rule__Script__Group_3_1_1__0__Impl : ( '(' ) ;
    public final void rule__Script__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1842:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1843:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1843:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1844:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Script__Group_3_1_1__0__Impl3858); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Script__Group_3_1_1__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1857:1: rule__Script__Group_3_1_1__1 : rule__Script__Group_3_1_1__1__Impl rule__Script__Group_3_1_1__2 ;
    public final void rule__Script__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1861:1: ( rule__Script__Group_3_1_1__1__Impl rule__Script__Group_3_1_1__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1862:2: rule__Script__Group_3_1_1__1__Impl rule__Script__Group_3_1_1__2
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__1__Impl_in_rule__Script__Group_3_1_1__13889);
            rule__Script__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__2_in_rule__Script__Group_3_1_1__13892);
            rule__Script__Group_3_1_1__2();

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
    // $ANTLR end "rule__Script__Group_3_1_1__1"


    // $ANTLR start "rule__Script__Group_3_1_1__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1869:1: rule__Script__Group_3_1_1__1__Impl : ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) ) ;
    public final void rule__Script__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1873:1: ( ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1874:1: ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1874:1: ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1875:1: ( rule__Script__RobottypesAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesAssignment_3_1_1_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1876:1: ( rule__Script__RobottypesAssignment_3_1_1_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1876:2: rule__Script__RobottypesAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_3_1_1_1_in_rule__Script__Group_3_1_1__1__Impl3919);
            rule__Script__RobottypesAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Script__Group_3_1_1__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1886:1: rule__Script__Group_3_1_1__2 : rule__Script__Group_3_1_1__2__Impl rule__Script__Group_3_1_1__3 ;
    public final void rule__Script__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1890:1: ( rule__Script__Group_3_1_1__2__Impl rule__Script__Group_3_1_1__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1891:2: rule__Script__Group_3_1_1__2__Impl rule__Script__Group_3_1_1__3
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__2__Impl_in_rule__Script__Group_3_1_1__23949);
            rule__Script__Group_3_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__3_in_rule__Script__Group_3_1_1__23952);
            rule__Script__Group_3_1_1__3();

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
    // $ANTLR end "rule__Script__Group_3_1_1__2"


    // $ANTLR start "rule__Script__Group_3_1_1__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1898:1: rule__Script__Group_3_1_1__2__Impl : ( ',' ) ;
    public final void rule__Script__Group_3_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1902:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1903:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1903:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1904:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getCommaKeyword_3_1_1_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Script__Group_3_1_1__2__Impl3980); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getCommaKeyword_3_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_1_1__2__Impl"


    // $ANTLR start "rule__Script__Group_3_1_1__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1917:1: rule__Script__Group_3_1_1__3 : rule__Script__Group_3_1_1__3__Impl rule__Script__Group_3_1_1__4 ;
    public final void rule__Script__Group_3_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1921:1: ( rule__Script__Group_3_1_1__3__Impl rule__Script__Group_3_1_1__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1922:2: rule__Script__Group_3_1_1__3__Impl rule__Script__Group_3_1_1__4
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__3__Impl_in_rule__Script__Group_3_1_1__34011);
            rule__Script__Group_3_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__4_in_rule__Script__Group_3_1_1__34014);
            rule__Script__Group_3_1_1__4();

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
    // $ANTLR end "rule__Script__Group_3_1_1__3"


    // $ANTLR start "rule__Script__Group_3_1_1__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1929:1: rule__Script__Group_3_1_1__3__Impl : ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) ) ;
    public final void rule__Script__Group_3_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1933:1: ( ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1934:1: ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1934:1: ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1935:1: ( rule__Script__RobotconfigsAssignment_3_1_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_1_1_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1936:1: ( rule__Script__RobotconfigsAssignment_3_1_1_3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1936:2: rule__Script__RobotconfigsAssignment_3_1_1_3
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_3_1_1_3_in_rule__Script__Group_3_1_1__3__Impl4041);
            rule__Script__RobotconfigsAssignment_3_1_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_1_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_1_1__3__Impl"


    // $ANTLR start "rule__Script__Group_3_1_1__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1946:1: rule__Script__Group_3_1_1__4 : rule__Script__Group_3_1_1__4__Impl ;
    public final void rule__Script__Group_3_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1950:1: ( rule__Script__Group_3_1_1__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1951:2: rule__Script__Group_3_1_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__4__Impl_in_rule__Script__Group_3_1_1__44071);
            rule__Script__Group_3_1_1__4__Impl();

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
    // $ANTLR end "rule__Script__Group_3_1_1__4"


    // $ANTLR start "rule__Script__Group_3_1_1__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1957:1: rule__Script__Group_3_1_1__4__Impl : ( ')' ) ;
    public final void rule__Script__Group_3_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1961:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1962:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1962:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1963:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_3_1_1_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__Script__Group_3_1_1__4__Impl4099); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRightParenthesisKeyword_3_1_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group_3_1_1__4__Impl"


    // $ANTLR start "rule__MetaMethods__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1986:1: rule__MetaMethods__Group__0 : rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 ;
    public final void rule__MetaMethods__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1990:1: ( rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1991:2: rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__04140);
            rule__MetaMethods__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__04143);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1998:1: rule__MetaMethods__Group__0__Impl : ( 'metamethodscollection' ) ;
    public final void rule__MetaMethods__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2002:1: ( ( 'metamethodscollection' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2003:1: ( 'metamethodscollection' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2003:1: ( 'metamethodscollection' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2004:1: 'metamethodscollection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__MetaMethods__Group__0__Impl4171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__Group__0__Impl"


    // $ANTLR start "rule__MetaMethods__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2017:1: rule__MetaMethods__Group__1 : rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 ;
    public final void rule__MetaMethods__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2021:1: ( rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2022:2: rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__14202);
            rule__MetaMethods__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__14205);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2029:1: rule__MetaMethods__Group__1__Impl : ( ( rule__MetaMethods__NameAssignment_1 ) ) ;
    public final void rule__MetaMethods__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2033:1: ( ( ( rule__MetaMethods__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2034:1: ( ( rule__MetaMethods__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2034:1: ( ( rule__MetaMethods__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2035:1: ( rule__MetaMethods__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2036:1: ( rule__MetaMethods__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2036:2: rule__MetaMethods__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaMethods__NameAssignment_1_in_rule__MetaMethods__Group__1__Impl4232);
            rule__MetaMethods__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2046:1: rule__MetaMethods__Group__2 : rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 ;
    public final void rule__MetaMethods__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2050:1: ( rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2051:2: rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__24262);
            rule__MetaMethods__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__24265);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2058:1: rule__MetaMethods__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaMethods__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2062:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2063:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2063:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2064:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__MetaMethods__Group__2__Impl4293); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2077:1: rule__MetaMethods__Group__3 : rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 ;
    public final void rule__MetaMethods__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2081:1: ( rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2082:2: rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__34324);
            rule__MetaMethods__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__34327);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2089:1: rule__MetaMethods__Group__3__Impl : ( ( rule__MetaMethods__MethodsAssignment_3 )* ) ;
    public final void rule__MetaMethods__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2093:1: ( ( ( rule__MetaMethods__MethodsAssignment_3 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2094:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2094:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2095:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2096:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2096:2: rule__MetaMethods__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl4354);
            	    rule__MetaMethods__MethodsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2106:1: rule__MetaMethods__Group__4 : rule__MetaMethods__Group__4__Impl ;
    public final void rule__MetaMethods__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2110:1: ( rule__MetaMethods__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2111:2: rule__MetaMethods__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__44385);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2117:1: rule__MetaMethods__Group__4__Impl : ( '}' ) ;
    public final void rule__MetaMethods__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2121:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2122:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2122:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2123:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__MetaMethods__Group__4__Impl4413); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2146:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2150:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2151:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04454);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04457);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2158:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2162:1: ( ( () ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2163:1: ( () )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2163:1: ( () )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2164:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2165:1: ()
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2167:1: 
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2177:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2181:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2182:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14515);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__14518);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2189:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2193:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2194:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2194:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2195:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Block__Group__1__Impl4546); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2208:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2212:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2213:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__24577);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__24580);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2220:1: rule__Block__Group__2__Impl : ( ( rule__Block__Alternatives_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2224:1: ( ( ( rule__Block__Alternatives_2 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2225:1: ( ( rule__Block__Alternatives_2 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2225:1: ( ( rule__Block__Alternatives_2 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2226:1: ( rule__Block__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2227:1: ( rule__Block__Alternatives_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_CAPITALFIRST && LA20_0<=RULE_LOWERFIRST)||(LA20_0>=26 && LA20_0<=28)||LA20_0==32||LA20_0==38||(LA20_0>=40 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2227:2: rule__Block__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl4607);
            	    rule__Block__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2237:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2241:1: ( rule__Block__Group__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2242:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__34638);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2248:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2252:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2253:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2253:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2254:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__Block__Group__3__Impl4666); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2275:1: rule__Block__Group_2_0__0 : rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 ;
    public final void rule__Block__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2279:1: ( rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2280:2: rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__04705);
            rule__Block__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__04708);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2287:1: rule__Block__Group_2_0__0__Impl : ( ( rule__Block__ExsAssignment_2_0_0 ) ) ;
    public final void rule__Block__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2291:1: ( ( ( rule__Block__ExsAssignment_2_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2292:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2292:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2293:1: ( rule__Block__ExsAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsAssignment_2_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2294:1: ( rule__Block__ExsAssignment_2_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2294:2: rule__Block__ExsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl4735);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2304:1: rule__Block__Group_2_0__1 : rule__Block__Group_2_0__1__Impl ;
    public final void rule__Block__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2308:1: ( rule__Block__Group_2_0__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2309:2: rule__Block__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__14765);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2315:1: rule__Block__Group_2_0__1__Impl : ( ';' ) ;
    public final void rule__Block__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2319:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2320:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2320:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2321:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Block__Group_2_0__1__Impl4793); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2338:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2342:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2343:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04828);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04831);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2350:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2354:1: ( ( ( rule__Assignment__VariAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2355:1: ( ( rule__Assignment__VariAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2355:1: ( ( rule__Assignment__VariAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2356:1: ( rule__Assignment__VariAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2357:1: ( rule__Assignment__VariAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2357:2: rule__Assignment__VariAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl4858);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2367:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2371:1: ( rule__Assignment__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2372:2: rule__Assignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14888);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2378:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2382:1: ( ( ( rule__Assignment__Group_1__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2383:1: ( ( rule__Assignment__Group_1__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2383:1: ( ( rule__Assignment__Group_1__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2384:1: ( rule__Assignment__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2385:1: ( rule__Assignment__Group_1__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2385:2: rule__Assignment__Group_1__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Group__1__Impl4915);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2399:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2403:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2404:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__04949);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__04952);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2411:1: rule__Assignment__Group_1__0__Impl : ( ( '=' ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2415:1: ( ( ( '=' ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2416:1: ( ( '=' ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2416:1: ( ( '=' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2417:1: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2418:1: ( '=' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2419:2: '='
            {
            match(input,38,FOLLOW_38_in_rule__Assignment__Group_1__0__Impl4981); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2430:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2434:1: ( rule__Assignment__Group_1__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2435:2: rule__Assignment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__15013);
            rule__Assignment__Group_1__1__Impl();

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2441:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__ValueAssignment_1_1 ) ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2445:1: ( ( ( rule__Assignment__ValueAssignment_1_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2446:1: ( ( rule__Assignment__ValueAssignment_1_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2446:1: ( ( rule__Assignment__ValueAssignment_1_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2447:1: ( rule__Assignment__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_1_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2448:1: ( rule__Assignment__ValueAssignment_1_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2448:2: rule__Assignment__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_1_1_in_rule__Assignment__Group_1__1__Impl5040);
            rule__Assignment__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Call__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2462:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2466:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2467:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05074);
            rule__Call__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05077);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2474:1: rule__Call__Group__0__Impl : ( ( rule__Call__Alternatives_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2478:1: ( ( ( rule__Call__Alternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2479:1: ( ( rule__Call__Alternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2479:1: ( ( rule__Call__Alternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2480:1: ( rule__Call__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getAlternatives_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2481:1: ( rule__Call__Alternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2481:2: rule__Call__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Call__Alternatives_0_in_rule__Call__Group__0__Impl5104);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2491:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2495:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2496:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15134);
            rule__Call__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15137);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2503:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2507:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2508:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2508:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2509:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Call__Group__1__Impl5165); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2522:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2526:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2527:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25196);
            rule__Call__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__25199);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2534:1: rule__Call__Group__2__Impl : ( ( rule__Call__ParametersAssignment_2 )? ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2538:1: ( ( ( rule__Call__ParametersAssignment_2 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2539:1: ( ( rule__Call__ParametersAssignment_2 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2539:1: ( ( rule__Call__ParametersAssignment_2 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2540:1: ( rule__Call__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2541:1: ( rule__Call__ParametersAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)||(LA21_0>=23 && LA21_0<=24)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2541:2: rule__Call__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl5226);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2551:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2555:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2556:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__35257);
            rule__Call__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__35260);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2563:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )* ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2567:1: ( ( ( rule__Call__Group_3__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2568:1: ( ( rule__Call__Group_3__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2568:1: ( ( rule__Call__Group_3__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2569:1: ( rule__Call__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2570:1: ( rule__Call__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2570:2: rule__Call__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl5287);
            	    rule__Call__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2580:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2584:1: ( rule__Call__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2585:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__45318);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2591:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2595:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2596:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2596:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2597:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__Call__Group__4__Impl5346); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2620:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2624:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2625:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__05387);
            rule__Call__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__05390);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2632:1: rule__Call__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2636:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2637:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2637:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2638:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2638:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2639:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2640:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2641:2: ','
            {
            match(input,35,FOLLOW_35_in_rule__Call__Group_3__0__Impl5421); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2645:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2646:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2647:1: ( ',' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2648:2: ','
            	    {
            	    match(input,35,FOLLOW_35_in_rule__Call__Group_3__0__Impl5437); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2660:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2664:1: ( rule__Call__Group_3__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2665:2: rule__Call__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__15472);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2671:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__ParametersAssignment_3_1 ) ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2675:1: ( ( ( rule__Call__ParametersAssignment_3_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2676:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2676:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2677:1: ( rule__Call__ParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersAssignment_3_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2678:1: ( rule__Call__ParametersAssignment_3_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2678:2: rule__Call__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl5499);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2692:1: rule__MetaMethod__Group__0 : rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 ;
    public final void rule__MetaMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2696:1: ( rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2697:2: rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__05533);
            rule__MetaMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__05536);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2704:1: rule__MetaMethod__Group__0__Impl : ( 'meta' ) ;
    public final void rule__MetaMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2708:1: ( ( 'meta' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2709:1: ( 'meta' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2709:1: ( 'meta' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2710:1: 'meta'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getMetaKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__MetaMethod__Group__0__Impl5564); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2723:1: rule__MetaMethod__Group__1 : rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2 ;
    public final void rule__MetaMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2727:1: ( rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2728:2: rule__MetaMethod__Group__1__Impl rule__MetaMethod__Group__2
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__15595);
            rule__MetaMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__2_in_rule__MetaMethod__Group__15598);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2735:1: rule__MetaMethod__Group__1__Impl : ( ( rule__MetaMethod__TypeAssignment_1 ) ) ;
    public final void rule__MetaMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2739:1: ( ( ( rule__MetaMethod__TypeAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2740:1: ( ( rule__MetaMethod__TypeAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2740:1: ( ( rule__MetaMethod__TypeAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2741:1: ( rule__MetaMethod__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getTypeAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2742:1: ( rule__MetaMethod__TypeAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2742:2: rule__MetaMethod__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaMethod__TypeAssignment_1_in_rule__MetaMethod__Group__1__Impl5625);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2752:1: rule__MetaMethod__Group__2 : rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3 ;
    public final void rule__MetaMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2756:1: ( rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2757:2: rule__MetaMethod__Group__2__Impl rule__MetaMethod__Group__3
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__2__Impl_in_rule__MetaMethod__Group__25655);
            rule__MetaMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__3_in_rule__MetaMethod__Group__25658);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2764:1: rule__MetaMethod__Group__2__Impl : ( ( rule__MetaMethod__NameAssignment_2 ) ) ;
    public final void rule__MetaMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2768:1: ( ( ( rule__MetaMethod__NameAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2769:1: ( ( rule__MetaMethod__NameAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2769:1: ( ( rule__MetaMethod__NameAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2770:1: ( rule__MetaMethod__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getNameAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2771:1: ( rule__MetaMethod__NameAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2771:2: rule__MetaMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MetaMethod__NameAssignment_2_in_rule__MetaMethod__Group__2__Impl5685);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2781:1: rule__MetaMethod__Group__3 : rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4 ;
    public final void rule__MetaMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2785:1: ( rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2786:2: rule__MetaMethod__Group__3__Impl rule__MetaMethod__Group__4
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__3__Impl_in_rule__MetaMethod__Group__35715);
            rule__MetaMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__4_in_rule__MetaMethod__Group__35718);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2793:1: rule__MetaMethod__Group__3__Impl : ( '(' ) ;
    public final void rule__MetaMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2797:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2798:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2798:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2799:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__MetaMethod__Group__3__Impl5746); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2812:1: rule__MetaMethod__Group__4 : rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5 ;
    public final void rule__MetaMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2816:1: ( rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2817:2: rule__MetaMethod__Group__4__Impl rule__MetaMethod__Group__5
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__4__Impl_in_rule__MetaMethod__Group__45777);
            rule__MetaMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__5_in_rule__MetaMethod__Group__45780);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2824:1: rule__MetaMethod__Group__4__Impl : ( ( rule__MetaMethod__ParametersAssignment_4 )? ) ;
    public final void rule__MetaMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2828:1: ( ( ( rule__MetaMethod__ParametersAssignment_4 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2829:1: ( ( rule__MetaMethod__ParametersAssignment_4 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2829:1: ( ( rule__MetaMethod__ParametersAssignment_4 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2830:1: ( rule__MetaMethod__ParametersAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2831:1: ( rule__MetaMethod__ParametersAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=26 && LA24_0<=28)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2831:2: rule__MetaMethod__ParametersAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MetaMethod__ParametersAssignment_4_in_rule__MetaMethod__Group__4__Impl5807);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2841:1: rule__MetaMethod__Group__5 : rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6 ;
    public final void rule__MetaMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2845:1: ( rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2846:2: rule__MetaMethod__Group__5__Impl rule__MetaMethod__Group__6
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__5__Impl_in_rule__MetaMethod__Group__55838);
            rule__MetaMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__6_in_rule__MetaMethod__Group__55841);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2853:1: rule__MetaMethod__Group__5__Impl : ( ( rule__MetaMethod__Group_5__0 )* ) ;
    public final void rule__MetaMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2857:1: ( ( ( rule__MetaMethod__Group_5__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2858:1: ( ( rule__MetaMethod__Group_5__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2858:1: ( ( rule__MetaMethod__Group_5__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2859:1: ( rule__MetaMethod__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getGroup_5()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2860:1: ( rule__MetaMethod__Group_5__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2860:2: rule__MetaMethod__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__MetaMethod__Group_5__0_in_rule__MetaMethod__Group__5__Impl5868);
            	    rule__MetaMethod__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2870:1: rule__MetaMethod__Group__6 : rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7 ;
    public final void rule__MetaMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2874:1: ( rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2875:2: rule__MetaMethod__Group__6__Impl rule__MetaMethod__Group__7
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__6__Impl_in_rule__MetaMethod__Group__65899);
            rule__MetaMethod__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group__7_in_rule__MetaMethod__Group__65902);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2882:1: rule__MetaMethod__Group__6__Impl : ( ')' ) ;
    public final void rule__MetaMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2886:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2887:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2887:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2888:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,31,FOLLOW_31_in_rule__MetaMethod__Group__6__Impl5930); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2901:1: rule__MetaMethod__Group__7 : rule__MetaMethod__Group__7__Impl ;
    public final void rule__MetaMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2905:1: ( rule__MetaMethod__Group__7__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2906:2: rule__MetaMethod__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__7__Impl_in_rule__MetaMethod__Group__75961);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2912:1: rule__MetaMethod__Group__7__Impl : ( ';' ) ;
    public final void rule__MetaMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2916:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2917:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2917:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2918:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getSemicolonKeyword_7()); 
            }
            match(input,37,FOLLOW_37_in_rule__MetaMethod__Group__7__Impl5989); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2947:1: rule__MetaMethod__Group_5__0 : rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1 ;
    public final void rule__MetaMethod__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2951:1: ( rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2952:2: rule__MetaMethod__Group_5__0__Impl rule__MetaMethod__Group_5__1
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__0__Impl_in_rule__MetaMethod__Group_5__06036);
            rule__MetaMethod__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__1_in_rule__MetaMethod__Group_5__06039);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2959:1: rule__MetaMethod__Group_5__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__MetaMethod__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2963:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2964:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2964:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2965:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2965:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2966:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2967:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2968:2: ','
            {
            match(input,35,FOLLOW_35_in_rule__MetaMethod__Group_5__0__Impl6070); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2972:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2973:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2974:1: ( ',' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2975:2: ','
            	    {
            	    match(input,35,FOLLOW_35_in_rule__MetaMethod__Group_5__0__Impl6086); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2987:1: rule__MetaMethod__Group_5__1 : rule__MetaMethod__Group_5__1__Impl ;
    public final void rule__MetaMethod__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2991:1: ( rule__MetaMethod__Group_5__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2992:2: rule__MetaMethod__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group_5__1__Impl_in_rule__MetaMethod__Group_5__16121);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2998:1: rule__MetaMethod__Group_5__1__Impl : ( ( rule__MetaMethod__ParametersAssignment_5_1 ) ) ;
    public final void rule__MetaMethod__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3002:1: ( ( ( rule__MetaMethod__ParametersAssignment_5_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3003:1: ( ( rule__MetaMethod__ParametersAssignment_5_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3003:1: ( ( rule__MetaMethod__ParametersAssignment_5_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3004:1: ( rule__MetaMethod__ParametersAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersAssignment_5_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3005:1: ( rule__MetaMethod__ParametersAssignment_5_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3005:2: rule__MetaMethod__ParametersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MetaMethod__ParametersAssignment_5_1_in_rule__MetaMethod__Group_5__1__Impl6148);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3019:1: rule__UserMethod__Group__0 : rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 ;
    public final void rule__UserMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3023:1: ( rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3024:2: rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__06182);
            rule__UserMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__06185);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3031:1: rule__UserMethod__Group__0__Impl : ( ( rule__UserMethod__TypeAssignment_0 ) ) ;
    public final void rule__UserMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3035:1: ( ( ( rule__UserMethod__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3036:1: ( ( rule__UserMethod__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3036:1: ( ( rule__UserMethod__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3037:1: ( rule__UserMethod__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3038:1: ( rule__UserMethod__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3038:2: rule__UserMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__UserMethod__TypeAssignment_0_in_rule__UserMethod__Group__0__Impl6212);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3048:1: rule__UserMethod__Group__1 : rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2 ;
    public final void rule__UserMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3052:1: ( rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3053:2: rule__UserMethod__Group__1__Impl rule__UserMethod__Group__2
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__16242);
            rule__UserMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__2_in_rule__UserMethod__Group__16245);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3060:1: rule__UserMethod__Group__1__Impl : ( ( rule__UserMethod__NameAssignment_1 ) ) ;
    public final void rule__UserMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3064:1: ( ( ( rule__UserMethod__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3065:1: ( ( rule__UserMethod__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3065:1: ( ( rule__UserMethod__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3066:1: ( rule__UserMethod__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3067:1: ( rule__UserMethod__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3067:2: rule__UserMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UserMethod__NameAssignment_1_in_rule__UserMethod__Group__1__Impl6272);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3077:1: rule__UserMethod__Group__2 : rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3 ;
    public final void rule__UserMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3081:1: ( rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3082:2: rule__UserMethod__Group__2__Impl rule__UserMethod__Group__3
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__2__Impl_in_rule__UserMethod__Group__26302);
            rule__UserMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__3_in_rule__UserMethod__Group__26305);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3089:1: rule__UserMethod__Group__2__Impl : ( '(' ) ;
    public final void rule__UserMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3093:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3094:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3094:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3095:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__UserMethod__Group__2__Impl6333); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3108:1: rule__UserMethod__Group__3 : rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4 ;
    public final void rule__UserMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3112:1: ( rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3113:2: rule__UserMethod__Group__3__Impl rule__UserMethod__Group__4
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__3__Impl_in_rule__UserMethod__Group__36364);
            rule__UserMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__4_in_rule__UserMethod__Group__36367);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3120:1: rule__UserMethod__Group__3__Impl : ( ( rule__UserMethod__ParametersAssignment_3 )? ) ;
    public final void rule__UserMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3124:1: ( ( ( rule__UserMethod__ParametersAssignment_3 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3125:1: ( ( rule__UserMethod__ParametersAssignment_3 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3125:1: ( ( rule__UserMethod__ParametersAssignment_3 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3126:1: ( rule__UserMethod__ParametersAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersAssignment_3()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3127:1: ( rule__UserMethod__ParametersAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=26 && LA27_0<=28)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3127:2: rule__UserMethod__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__UserMethod__ParametersAssignment_3_in_rule__UserMethod__Group__3__Impl6394);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3137:1: rule__UserMethod__Group__4 : rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5 ;
    public final void rule__UserMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3141:1: ( rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3142:2: rule__UserMethod__Group__4__Impl rule__UserMethod__Group__5
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__4__Impl_in_rule__UserMethod__Group__46425);
            rule__UserMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__5_in_rule__UserMethod__Group__46428);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3149:1: rule__UserMethod__Group__4__Impl : ( ( rule__UserMethod__Group_4__0 )* ) ;
    public final void rule__UserMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3153:1: ( ( ( rule__UserMethod__Group_4__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3154:1: ( ( rule__UserMethod__Group_4__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3154:1: ( ( rule__UserMethod__Group_4__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3155:1: ( rule__UserMethod__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getGroup_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3156:1: ( rule__UserMethod__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3156:2: rule__UserMethod__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UserMethod__Group_4__0_in_rule__UserMethod__Group__4__Impl6455);
            	    rule__UserMethod__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3166:1: rule__UserMethod__Group__5 : rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6 ;
    public final void rule__UserMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3170:1: ( rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3171:2: rule__UserMethod__Group__5__Impl rule__UserMethod__Group__6
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__5__Impl_in_rule__UserMethod__Group__56486);
            rule__UserMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group__6_in_rule__UserMethod__Group__56489);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3178:1: rule__UserMethod__Group__5__Impl : ( ')' ) ;
    public final void rule__UserMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3182:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3183:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3183:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3184:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,31,FOLLOW_31_in_rule__UserMethod__Group__5__Impl6517); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3197:1: rule__UserMethod__Group__6 : rule__UserMethod__Group__6__Impl ;
    public final void rule__UserMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3201:1: ( rule__UserMethod__Group__6__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3202:2: rule__UserMethod__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__6__Impl_in_rule__UserMethod__Group__66548);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3208:1: rule__UserMethod__Group__6__Impl : ( ( rule__UserMethod__BlAssignment_6 ) ) ;
    public final void rule__UserMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3212:1: ( ( ( rule__UserMethod__BlAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3213:1: ( ( rule__UserMethod__BlAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3213:1: ( ( rule__UserMethod__BlAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3214:1: ( rule__UserMethod__BlAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getBlAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3215:1: ( rule__UserMethod__BlAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3215:2: rule__UserMethod__BlAssignment_6
            {
            pushFollow(FOLLOW_rule__UserMethod__BlAssignment_6_in_rule__UserMethod__Group__6__Impl6575);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3239:1: rule__UserMethod__Group_4__0 : rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1 ;
    public final void rule__UserMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3243:1: ( rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3244:2: rule__UserMethod__Group_4__0__Impl rule__UserMethod__Group_4__1
            {
            pushFollow(FOLLOW_rule__UserMethod__Group_4__0__Impl_in_rule__UserMethod__Group_4__06619);
            rule__UserMethod__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UserMethod__Group_4__1_in_rule__UserMethod__Group_4__06622);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3251:1: rule__UserMethod__Group_4__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__UserMethod__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3255:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3256:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3256:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3257:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3257:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3258:1: ( ',' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3259:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3260:2: ','
            {
            match(input,35,FOLLOW_35_in_rule__UserMethod__Group_4__0__Impl6653); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3264:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3265:1: ( ',' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getCommaKeyword_4_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3266:1: ( ',' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3267:2: ','
            	    {
            	    match(input,35,FOLLOW_35_in_rule__UserMethod__Group_4__0__Impl6669); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3279:1: rule__UserMethod__Group_4__1 : rule__UserMethod__Group_4__1__Impl ;
    public final void rule__UserMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3283:1: ( rule__UserMethod__Group_4__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3284:2: rule__UserMethod__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UserMethod__Group_4__1__Impl_in_rule__UserMethod__Group_4__16704);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3290:1: rule__UserMethod__Group_4__1__Impl : ( ( rule__UserMethod__ParametersAssignment_4_1 ) ) ;
    public final void rule__UserMethod__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3294:1: ( ( ( rule__UserMethod__ParametersAssignment_4_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3295:1: ( ( rule__UserMethod__ParametersAssignment_4_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3295:1: ( ( rule__UserMethod__ParametersAssignment_4_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3296:1: ( rule__UserMethod__ParametersAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersAssignment_4_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3297:1: ( rule__UserMethod__ParametersAssignment_4_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3297:2: rule__UserMethod__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UserMethod__ParametersAssignment_4_1_in_rule__UserMethod__Group_4__1__Impl6731);
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


    // $ANTLR start "rule__Bool__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3311:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3315:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3316:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_rule__Bool__Group__0__Impl_in_rule__Bool__Group__06765);
            rule__Bool__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Bool__Group__1_in_rule__Bool__Group__06768);
            rule__Bool__Group__1();

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
    // $ANTLR end "rule__Bool__Group__0"


    // $ANTLR start "rule__Bool__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3323:1: rule__Bool__Group__0__Impl : ( ( rule__Bool__VarleftAssignment_0 ) ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3327:1: ( ( ( rule__Bool__VarleftAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3328:1: ( ( rule__Bool__VarleftAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3328:1: ( ( rule__Bool__VarleftAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3329:1: ( rule__Bool__VarleftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getVarleftAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3330:1: ( rule__Bool__VarleftAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3330:2: rule__Bool__VarleftAssignment_0
            {
            pushFollow(FOLLOW_rule__Bool__VarleftAssignment_0_in_rule__Bool__Group__0__Impl6795);
            rule__Bool__VarleftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getVarleftAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0__Impl"


    // $ANTLR start "rule__Bool__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3340:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl rule__Bool__Group__2 ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3344:1: ( rule__Bool__Group__1__Impl rule__Bool__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3345:2: rule__Bool__Group__1__Impl rule__Bool__Group__2
            {
            pushFollow(FOLLOW_rule__Bool__Group__1__Impl_in_rule__Bool__Group__16825);
            rule__Bool__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Bool__Group__2_in_rule__Bool__Group__16828);
            rule__Bool__Group__2();

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
    // $ANTLR end "rule__Bool__Group__1"


    // $ANTLR start "rule__Bool__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3352:1: rule__Bool__Group__1__Impl : ( ( rule__Bool__Group_1__0 )? ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3356:1: ( ( ( rule__Bool__Group_1__0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3357:1: ( ( rule__Bool__Group_1__0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3357:1: ( ( rule__Bool__Group_1__0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3358:1: ( rule__Bool__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getGroup_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3359:1: ( rule__Bool__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=13 && LA30_0<=18)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3359:2: rule__Bool__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Bool__Group_1__0_in_rule__Bool__Group__1__Impl6855);
                    rule__Bool__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1__Impl"


    // $ANTLR start "rule__Bool__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3369:1: rule__Bool__Group__2 : rule__Bool__Group__2__Impl ;
    public final void rule__Bool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3373:1: ( rule__Bool__Group__2__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3374:2: rule__Bool__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Bool__Group__2__Impl_in_rule__Bool__Group__26886);
            rule__Bool__Group__2__Impl();

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
    // $ANTLR end "rule__Bool__Group__2"


    // $ANTLR start "rule__Bool__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3380:1: rule__Bool__Group__2__Impl : ( ( rule__Bool__Group_2__0 )? ) ;
    public final void rule__Bool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3384:1: ( ( ( rule__Bool__Group_2__0 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3385:1: ( ( rule__Bool__Group_2__0 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3385:1: ( ( rule__Bool__Group_2__0 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3386:1: ( rule__Bool__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getGroup_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3387:1: ( rule__Bool__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=19 && LA31_0<=22)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3387:2: rule__Bool__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Bool__Group_2__0_in_rule__Bool__Group__2__Impl6913);
                    rule__Bool__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__2__Impl"


    // $ANTLR start "rule__Bool__Group_1__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3403:1: rule__Bool__Group_1__0 : rule__Bool__Group_1__0__Impl rule__Bool__Group_1__1 ;
    public final void rule__Bool__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3407:1: ( rule__Bool__Group_1__0__Impl rule__Bool__Group_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3408:2: rule__Bool__Group_1__0__Impl rule__Bool__Group_1__1
            {
            pushFollow(FOLLOW_rule__Bool__Group_1__0__Impl_in_rule__Bool__Group_1__06950);
            rule__Bool__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Bool__Group_1__1_in_rule__Bool__Group_1__06953);
            rule__Bool__Group_1__1();

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
    // $ANTLR end "rule__Bool__Group_1__0"


    // $ANTLR start "rule__Bool__Group_1__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3415:1: rule__Bool__Group_1__0__Impl : ( ( rule__Bool__OpAssignment_1_0 ) ) ;
    public final void rule__Bool__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3419:1: ( ( ( rule__Bool__OpAssignment_1_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3420:1: ( ( rule__Bool__OpAssignment_1_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3420:1: ( ( rule__Bool__OpAssignment_1_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3421:1: ( rule__Bool__OpAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getOpAssignment_1_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3422:1: ( rule__Bool__OpAssignment_1_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3422:2: rule__Bool__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Bool__OpAssignment_1_0_in_rule__Bool__Group_1__0__Impl6980);
            rule__Bool__OpAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getOpAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_1__0__Impl"


    // $ANTLR start "rule__Bool__Group_1__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3432:1: rule__Bool__Group_1__1 : rule__Bool__Group_1__1__Impl ;
    public final void rule__Bool__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3436:1: ( rule__Bool__Group_1__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3437:2: rule__Bool__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Bool__Group_1__1__Impl_in_rule__Bool__Group_1__17010);
            rule__Bool__Group_1__1__Impl();

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
    // $ANTLR end "rule__Bool__Group_1__1"


    // $ANTLR start "rule__Bool__Group_1__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3443:1: rule__Bool__Group_1__1__Impl : ( ( rule__Bool__VarrightAssignment_1_1 ) ) ;
    public final void rule__Bool__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3447:1: ( ( ( rule__Bool__VarrightAssignment_1_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3448:1: ( ( rule__Bool__VarrightAssignment_1_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3448:1: ( ( rule__Bool__VarrightAssignment_1_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3449:1: ( rule__Bool__VarrightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getVarrightAssignment_1_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3450:1: ( rule__Bool__VarrightAssignment_1_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3450:2: rule__Bool__VarrightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Bool__VarrightAssignment_1_1_in_rule__Bool__Group_1__1__Impl7037);
            rule__Bool__VarrightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getVarrightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_1__1__Impl"


    // $ANTLR start "rule__Bool__Group_2__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3464:1: rule__Bool__Group_2__0 : rule__Bool__Group_2__0__Impl rule__Bool__Group_2__1 ;
    public final void rule__Bool__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3468:1: ( rule__Bool__Group_2__0__Impl rule__Bool__Group_2__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3469:2: rule__Bool__Group_2__0__Impl rule__Bool__Group_2__1
            {
            pushFollow(FOLLOW_rule__Bool__Group_2__0__Impl_in_rule__Bool__Group_2__07071);
            rule__Bool__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Bool__Group_2__1_in_rule__Bool__Group_2__07074);
            rule__Bool__Group_2__1();

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
    // $ANTLR end "rule__Bool__Group_2__0"


    // $ANTLR start "rule__Bool__Group_2__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3476:1: rule__Bool__Group_2__0__Impl : ( ( rule__Bool__BopAssignment_2_0 ) ) ;
    public final void rule__Bool__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3480:1: ( ( ( rule__Bool__BopAssignment_2_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3481:1: ( ( rule__Bool__BopAssignment_2_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3481:1: ( ( rule__Bool__BopAssignment_2_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3482:1: ( rule__Bool__BopAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getBopAssignment_2_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3483:1: ( rule__Bool__BopAssignment_2_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3483:2: rule__Bool__BopAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Bool__BopAssignment_2_0_in_rule__Bool__Group_2__0__Impl7101);
            rule__Bool__BopAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getBopAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_2__0__Impl"


    // $ANTLR start "rule__Bool__Group_2__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3493:1: rule__Bool__Group_2__1 : rule__Bool__Group_2__1__Impl ;
    public final void rule__Bool__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3497:1: ( rule__Bool__Group_2__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3498:2: rule__Bool__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Bool__Group_2__1__Impl_in_rule__Bool__Group_2__17131);
            rule__Bool__Group_2__1__Impl();

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
    // $ANTLR end "rule__Bool__Group_2__1"


    // $ANTLR start "rule__Bool__Group_2__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3504:1: rule__Bool__Group_2__1__Impl : ( ( rule__Bool__BnextAssignment_2_1 ) ) ;
    public final void rule__Bool__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3508:1: ( ( ( rule__Bool__BnextAssignment_2_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3509:1: ( ( rule__Bool__BnextAssignment_2_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3509:1: ( ( rule__Bool__BnextAssignment_2_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3510:1: ( rule__Bool__BnextAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getBnextAssignment_2_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3511:1: ( rule__Bool__BnextAssignment_2_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3511:2: rule__Bool__BnextAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Bool__BnextAssignment_2_1_in_rule__Bool__Group_2__1__Impl7158);
            rule__Bool__BnextAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getBnextAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group_2__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3525:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3529:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3530:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__07192);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__07195);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3537:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3541:1: ( ( 'if' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3542:1: ( 'if' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3542:1: ( 'if' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3543:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__If__Group__0__Impl7223); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3556:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3560:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3561:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__17254);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__17257);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3568:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3572:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3573:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3573:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3574:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__If__Group__1__Impl7285); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3587:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3591:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3592:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__27316);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__27319);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3599:1: rule__If__Group__2__Impl : ( ( rule__If__ExAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3603:1: ( ( ( rule__If__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3604:1: ( ( rule__If__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3604:1: ( ( rule__If__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3605:1: ( rule__If__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3606:1: ( rule__If__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3606:2: rule__If__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl7346);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3616:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3620:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3621:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__37376);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__37379);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3628:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3632:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3633:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3633:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3634:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__If__Group__3__Impl7407); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3647:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3651:1: ( rule__If__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3652:2: rule__If__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__47438);
            rule__If__Group__4__Impl();

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3658:1: rule__If__Group__4__Impl : ( ( rule__If__BlAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3662:1: ( ( ( rule__If__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3663:1: ( ( rule__If__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3663:1: ( ( rule__If__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3664:1: ( rule__If__BlAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getBlAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3665:1: ( rule__If__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3665:2: rule__If__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl7465);
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


    // $ANTLR start "rule__Else__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3685:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3689:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3690:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__07505);
            rule__Else__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Else__Group__1_in_rule__Else__Group__07508);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3697:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3701:1: ( ( 'else' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3702:1: ( 'else' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3702:1: ( 'else' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3703:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Else__Group__0__Impl7536); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3716:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3720:1: ( rule__Else__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3721:2: rule__Else__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__17567);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3727:1: rule__Else__Group__1__Impl : ( ( rule__Else__ExAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3731:1: ( ( ( rule__Else__ExAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3732:1: ( ( rule__Else__ExAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3732:1: ( ( rule__Else__ExAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3733:1: ( rule__Else__ExAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getExAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3734:1: ( rule__Else__ExAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3734:2: rule__Else__ExAssignment_1
            {
            pushFollow(FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl7594);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3748:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3752:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3753:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__07628);
            rule__For__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__07631);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3760:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3764:1: ( ( 'for' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3765:1: ( 'for' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3765:1: ( 'for' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3766:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getForKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__For__Group__0__Impl7659); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3779:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3783:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3784:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__17690);
            rule__For__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__17693);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3791:1: rule__For__Group__1__Impl : ( '(' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3795:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3796:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3796:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3797:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__For__Group__1__Impl7721); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3810:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3814:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3815:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__27752);
            rule__For__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__27755);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3822:1: rule__For__Group__2__Impl : ( ( rule__For__InitAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3826:1: ( ( ( rule__For__InitAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3827:1: ( ( rule__For__InitAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3827:1: ( ( rule__For__InitAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3828:1: ( rule__For__InitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getInitAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3829:1: ( rule__For__InitAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3829:2: rule__For__InitAssignment_2
            {
            pushFollow(FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl7782);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3839:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3843:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3844:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__37812);
            rule__For__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__37815);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3851:1: rule__For__Group__3__Impl : ( ';' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3855:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3856:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3856:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3857:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSemicolonKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__For__Group__3__Impl7843); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3870:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3874:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3875:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__47874);
            rule__For__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__47877);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3882:1: rule__For__Group__4__Impl : ( ( rule__For__CheckAssignment_4 ) ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3886:1: ( ( ( rule__For__CheckAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3887:1: ( ( rule__For__CheckAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3887:1: ( ( rule__For__CheckAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3888:1: ( rule__For__CheckAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCheckAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3889:1: ( rule__For__CheckAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3889:2: rule__For__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl7904);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3899:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3903:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3904:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__57934);
            rule__For__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__57937);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3911:1: rule__For__Group__5__Impl : ( ';' ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3915:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3916:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3916:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3917:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getSemicolonKeyword_5()); 
            }
            match(input,37,FOLLOW_37_in_rule__For__Group__5__Impl7965); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3930:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3934:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3935:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__67996);
            rule__For__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__67999);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3942:1: rule__For__Group__6__Impl : ( ( rule__For__ActionAssignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3946:1: ( ( ( rule__For__ActionAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3947:1: ( ( rule__For__ActionAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3947:1: ( ( rule__For__ActionAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3948:1: ( rule__For__ActionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getActionAssignment_6()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3949:1: ( rule__For__ActionAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3949:2: rule__For__ActionAssignment_6
            {
            pushFollow(FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl8026);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3959:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3963:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3964:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__78056);
            rule__For__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__78059);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3971:1: rule__For__Group__7__Impl : ( ')' ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3975:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3976:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3976:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3977:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,31,FOLLOW_31_in_rule__For__Group__7__Impl8087); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3990:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3994:1: ( rule__For__Group__8__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3995:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__88118);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4001:1: rule__For__Group__8__Impl : ( ( rule__For__BlAssignment_8 ) ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4005:1: ( ( ( rule__For__BlAssignment_8 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4006:1: ( ( rule__For__BlAssignment_8 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4006:1: ( ( rule__For__BlAssignment_8 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4007:1: ( rule__For__BlAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getBlAssignment_8()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4008:1: ( rule__For__BlAssignment_8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4008:2: rule__For__BlAssignment_8
            {
            pushFollow(FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl8145);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4036:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4040:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4041:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__08193);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__08196);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4048:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4052:1: ( ( 'while' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4053:1: ( 'while' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4053:1: ( 'while' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4054:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__While__Group__0__Impl8224); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4067:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4071:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4072:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__18255);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__18258);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4079:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4083:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4084:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4084:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4085:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__While__Group__1__Impl8286); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4098:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4102:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4103:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__28317);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__28320);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4110:1: rule__While__Group__2__Impl : ( ( rule__While__ExAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4114:1: ( ( ( rule__While__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4115:1: ( ( rule__While__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4115:1: ( ( rule__While__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4116:1: ( rule__While__ExAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExAssignment_2()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4117:1: ( rule__While__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4117:2: rule__While__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl8347);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4127:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4131:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4132:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__38377);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__38380);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4139:1: rule__While__Group__3__Impl : ( ')' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4143:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4144:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4144:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4145:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__While__Group__3__Impl8408); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4158:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4162:1: ( rule__While__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4163:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__48439);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4169:1: rule__While__Group__4__Impl : ( ( rule__While__BlAssignment_4 ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4173:1: ( ( ( rule__While__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4174:1: ( ( rule__While__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4174:1: ( ( rule__While__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4175:1: ( rule__While__BlAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlAssignment_4()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4176:1: ( rule__While__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4176:2: rule__While__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl8466);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4196:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4200:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4201:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__08506);
            rule__Declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__08509);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4208:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4212:1: ( ( ( rule__Declaration__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4213:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4213:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4214:1: ( rule__Declaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4215:1: ( rule__Declaration__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4215:2: rule__Declaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl8536);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4225:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4229:1: ( rule__Declaration__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4230:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__18566);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4236:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4240:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4241:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4241:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4242:1: ( rule__Declaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4243:1: ( rule__Declaration__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4243:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl8593);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4257:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4261:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4262:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__08627);
            rule__Return__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Return__Group__1_in_rule__Return__Group__08630);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4269:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4273:1: ( ( 'return' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4274:1: ( 'return' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4274:1: ( 'return' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4275:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Return__Group__0__Impl8658); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4288:1: rule__Return__Group__1 : rule__Return__Group__1__Impl ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4292:1: ( rule__Return__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4293:2: rule__Return__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__18689);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4299:1: rule__Return__Group__1__Impl : ( ( rule__Return__ValAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4303:1: ( ( ( rule__Return__ValAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4304:1: ( ( rule__Return__ValAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4304:1: ( ( rule__Return__ValAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4305:1: ( rule__Return__ValAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValAssignment_1()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4306:1: ( rule__Return__ValAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4306:2: rule__Return__ValAssignment_1
            {
            pushFollow(FOLLOW_rule__Return__ValAssignment_1_in_rule__Return__Group__1__Impl8716);
            rule__Return__ValAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getValAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__CLfile__MetsAssignment"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4321:1: rule__CLfile__MetsAssignment : ( ( rule__CLfile__MetsAlternatives_0 ) ) ;
    public final void rule__CLfile__MetsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4325:1: ( ( ( rule__CLfile__MetsAlternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4326:1: ( ( rule__CLfile__MetsAlternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4326:1: ( ( rule__CLfile__MetsAlternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4327:1: ( rule__CLfile__MetsAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCLfileAccess().getMetsAlternatives_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4328:1: ( rule__CLfile__MetsAlternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4328:2: rule__CLfile__MetsAlternatives_0
            {
            pushFollow(FOLLOW_rule__CLfile__MetsAlternatives_0_in_rule__CLfile__MetsAssignment8755);
            rule__CLfile__MetsAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCLfileAccess().getMetsAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLfile__MetsAssignment"


    // $ANTLR start "rule__Script__NameAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4337:1: rule__Script__NameAssignment_1 : ( RULE_CAPITALFIRST ) ;
    public final void rule__Script__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4341:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4342:1: ( RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4342:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4343:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getNameCAPITALFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__Script__NameAssignment_18788); if (state.failed) return ;
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


    // $ANTLR start "rule__Script__RobottypesAssignment_3_0_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4352:1: rule__Script__RobottypesAssignment_3_0_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__Script__RobottypesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4356:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4357:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4357:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4358:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_3_0_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAssignment_3_0_18819); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobottypesAssignment_3_0_1"


    // $ANTLR start "rule__Script__RobotconfigsAssignment_3_0_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4367:1: rule__Script__RobotconfigsAssignment_3_0_3 : ( RULE_LOWERFIRST ) ;
    public final void rule__Script__RobotconfigsAssignment_3_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4371:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4372:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4372:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4373:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_3_0_3_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAssignment_3_0_38850); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_3_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobotconfigsAssignment_3_0_3"


    // $ANTLR start "rule__Script__RobottypesAssignment_3_1_1_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4382:1: rule__Script__RobottypesAssignment_3_1_1_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__Script__RobottypesAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4386:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4387:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4387:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4388:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_3_1_1_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAssignment_3_1_1_18881); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobottypesAssignment_3_1_1_1"


    // $ANTLR start "rule__Script__RobotconfigsAssignment_3_1_1_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4397:1: rule__Script__RobotconfigsAssignment_3_1_1_3 : ( RULE_LOWERFIRST ) ;
    public final void rule__Script__RobotconfigsAssignment_3_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4401:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4402:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4402:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4403:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_3_1_1_3_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAssignment_3_1_1_38912); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_3_1_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__RobotconfigsAssignment_3_1_1_3"


    // $ANTLR start "rule__Script__MethodsAssignment_6"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4412:1: rule__Script__MethodsAssignment_6 : ( ruleUserMethod ) ;
    public final void rule__Script__MethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4416:1: ( ( ruleUserMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4417:1: ( ruleUserMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4417:1: ( ruleUserMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4418:1: ruleUserMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_68943);
            ruleUserMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__MethodsAssignment_6"


    // $ANTLR start "rule__MetaMethods__NameAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4427:1: rule__MetaMethods__NameAssignment_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__MetaMethods__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4431:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4432:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4432:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4433:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__MetaMethods__NameAssignment_18974); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaMethodsAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethods__NameAssignment_1"


    // $ANTLR start "rule__MetaMethods__MethodsAssignment_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4442:1: rule__MetaMethods__MethodsAssignment_3 : ( ruleMetaMethod ) ;
    public final void rule__MetaMethods__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4446:1: ( ( ruleMetaMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4447:1: ( ruleMetaMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4447:1: ( ruleMetaMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4448:1: ruleMetaMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_39005);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4457:1: rule__Block__ExsAssignment_2_0_0 : ( ruleSimpleExpression ) ;
    public final void rule__Block__ExsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4461:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4462:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4462:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4463:1: ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_09036);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4472:1: rule__Block__ExsAssignment_2_1 : ( ruleStructureExpression ) ;
    public final void rule__Block__ExsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4476:1: ( ( ruleStructureExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4477:1: ( ruleStructureExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4477:1: ( ruleStructureExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4478:1: ruleStructureExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_19067);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4487:1: rule__Assignment__VariAssignment_0 : ( ( rule__Assignment__VariAlternatives_0_0 ) ) ;
    public final void rule__Assignment__VariAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4491:1: ( ( ( rule__Assignment__VariAlternatives_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4492:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4492:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4493:1: ( rule__Assignment__VariAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4494:1: ( rule__Assignment__VariAlternatives_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4494:2: rule__Assignment__VariAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_09098);
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


    // $ANTLR start "rule__Assignment__ValueAssignment_1_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4503:1: rule__Assignment__ValueAssignment_1_1 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4507:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4508:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4508:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4509:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_1_19131);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_1_1"


    // $ANTLR start "rule__Call__ParametersAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4518:1: rule__Call__ParametersAssignment_2 : ( ruleValue ) ;
    public final void rule__Call__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4522:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4523:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4523:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4524:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_29162);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getParametersValueParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4533:1: rule__Call__ParametersAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Call__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4537:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4538:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4538:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4539:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getParametersValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_3_19193);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getParametersValueParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4548:1: rule__MetaMethod__TypeAssignment_1 : ( ruleMethodtype ) ;
    public final void rule__MetaMethod__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4552:1: ( ( ruleMethodtype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4553:1: ( ruleMethodtype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4553:1: ( ruleMethodtype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4554:1: ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getTypeMethodtypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_rule__MetaMethod__TypeAssignment_19224);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4563:1: rule__MetaMethod__NameAssignment_2 : ( RULE_CAPITALFIRST ) ;
    public final void rule__MetaMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4567:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4568:1: ( RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4568:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4569:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getNameCAPITALFIRSTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethod__NameAssignment_29255); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4578:1: rule__MetaMethod__ParametersAssignment_4 : ( ruleDeclaration ) ;
    public final void rule__MetaMethod__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4582:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4583:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4583:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4584:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_49286);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4593:1: rule__MetaMethod__ParametersAssignment_5_1 : ( ruleDeclaration ) ;
    public final void rule__MetaMethod__ParametersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4597:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4598:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4598:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4599:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_5_19317);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4608:1: rule__UserMethod__TypeAssignment_0 : ( ruleMethodtype ) ;
    public final void rule__UserMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4612:1: ( ( ruleMethodtype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4613:1: ( ruleMethodtype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4613:1: ( ruleMethodtype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4614:1: ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_rule__UserMethod__TypeAssignment_09348);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4623:1: rule__UserMethod__NameAssignment_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__UserMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4627:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4628:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4628:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4629:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__UserMethod__NameAssignment_19379); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4638:1: rule__UserMethod__ParametersAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__UserMethod__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4642:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4643:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4643:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4644:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_39410);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4653:1: rule__UserMethod__ParametersAssignment_4_1 : ( ruleDeclaration ) ;
    public final void rule__UserMethod__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4657:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4658:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4658:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4659:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_4_19441);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4668:1: rule__UserMethod__BlAssignment_6 : ( ruleBlock ) ;
    public final void rule__UserMethod__BlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4672:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4673:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4673:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4674:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_69472);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4683:1: rule__UserMethodCall__MethodAssignment : ( ( RULE_LOWERFIRST ) ) ;
    public final void rule__UserMethodCall__MethodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4687:1: ( ( ( RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4688:1: ( ( RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4688:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4689:1: ( RULE_LOWERFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallAccess().getMethodMethodCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4690:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4691:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserMethodCallAccess().getMethodMethodLOWERFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__UserMethodCall__MethodAssignment9507); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4702:1: rule__MetaMethodCall__MethodAssignment : ( ( RULE_CAPITALFIRST ) ) ;
    public final void rule__MetaMethodCall__MethodAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4706:1: ( ( ( RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4707:1: ( ( RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4707:1: ( ( RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4708:1: ( RULE_CAPITALFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallAccess().getMethodMethodCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4709:1: ( RULE_CAPITALFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4710:1: RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaMethodCallAccess().getMethodMethodCAPITALFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethodCall__MethodAssignment9546); if (state.failed) return ;
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


    // $ANTLR start "rule__Bool__VarleftAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4735:1: rule__Bool__VarleftAssignment_0 : ( ruleValue ) ;
    public final void rule__Bool__VarleftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4739:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4740:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4740:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4741:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getVarleftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Bool__VarleftAssignment_09595);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getVarleftValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__VarleftAssignment_0"


    // $ANTLR start "rule__Bool__OpAssignment_1_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4750:1: rule__Bool__OpAssignment_1_0 : ( ruleComparisonOperator ) ;
    public final void rule__Bool__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4754:1: ( ( ruleComparisonOperator ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4755:1: ( ruleComparisonOperator )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4755:1: ( ruleComparisonOperator )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4756:1: ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getOpComparisonOperatorParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__Bool__OpAssignment_1_09626);
            ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getOpComparisonOperatorParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__OpAssignment_1_0"


    // $ANTLR start "rule__Bool__VarrightAssignment_1_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4765:1: rule__Bool__VarrightAssignment_1_1 : ( ruleValue ) ;
    public final void rule__Bool__VarrightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4769:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4770:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4770:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4771:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getVarrightValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Bool__VarrightAssignment_1_19657);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getVarrightValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__VarrightAssignment_1_1"


    // $ANTLR start "rule__Bool__BopAssignment_2_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4780:1: rule__Bool__BopAssignment_2_0 : ( ruleBooleanOperator ) ;
    public final void rule__Bool__BopAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4784:1: ( ( ruleBooleanOperator ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4785:1: ( ruleBooleanOperator )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4785:1: ( ruleBooleanOperator )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4786:1: ruleBooleanOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getBopBooleanOperatorParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanOperator_in_rule__Bool__BopAssignment_2_09688);
            ruleBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getBopBooleanOperatorParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__BopAssignment_2_0"


    // $ANTLR start "rule__Bool__BnextAssignment_2_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4795:1: rule__Bool__BnextAssignment_2_1 : ( ruleBool ) ;
    public final void rule__Bool__BnextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4799:1: ( ( ruleBool ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4800:1: ( ruleBool )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4800:1: ( ruleBool )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4801:1: ruleBool
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolAccess().getBnextBoolParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBool_in_rule__Bool__BnextAssignment_2_19719);
            ruleBool();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolAccess().getBnextBoolParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__BnextAssignment_2_1"


    // $ANTLR start "rule__If__ExAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4810:1: rule__If__ExAssignment_2 : ( ruleBool ) ;
    public final void rule__If__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4814:1: ( ( ruleBool ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4815:1: ( ruleBool )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4815:1: ( ruleBool )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4816:1: ruleBool
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExBoolParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBool_in_rule__If__ExAssignment_29750);
            ruleBool();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExBoolParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4825:1: rule__If__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__If__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4829:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4830:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4830:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4831:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__If__BlAssignment_49781);
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


    // $ANTLR start "rule__Else__ExAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4840:1: rule__Else__ExAssignment_1 : ( ruleExpression ) ;
    public final void rule__Else__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4844:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4845:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4845:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4846:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Else__ExAssignment_19812);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4855:1: rule__For__InitAssignment_2 : ( ruleExpression ) ;
    public final void rule__For__InitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4859:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4860:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4860:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4861:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getInitExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__For__InitAssignment_29843);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getInitExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4870:1: rule__For__CheckAssignment_4 : ( ruleBool ) ;
    public final void rule__For__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4874:1: ( ( ruleBool ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4875:1: ( ruleBool )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4875:1: ( ruleBool )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4876:1: ruleBool
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getCheckBoolParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBool_in_rule__For__CheckAssignment_49874);
            ruleBool();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getCheckBoolParserRuleCall_4_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4885:1: rule__For__ActionAssignment_6 : ( ruleExpression ) ;
    public final void rule__For__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4889:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4890:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4890:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4891:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getActionExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__For__ActionAssignment_69905);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForAccess().getActionExpressionParserRuleCall_6_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4900:1: rule__For__BlAssignment_8 : ( ruleBlock ) ;
    public final void rule__For__BlAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4904:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4905:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4905:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4906:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__For__BlAssignment_89936);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4915:1: rule__While__ExAssignment_2 : ( ruleBool ) ;
    public final void rule__While__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4919:1: ( ( ruleBool ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4920:1: ( ruleBool )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4920:1: ( ruleBool )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4921:1: ruleBool
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExBoolParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBool_in_rule__While__ExAssignment_29967);
            ruleBool();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExBoolParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4930:1: rule__While__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__While__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4934:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4935:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4935:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4936:1: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_rule__While__BlAssignment_49998);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4945:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4949:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4950:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4950:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4951:1: ( rule__BooleanValue__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4952:1: ( rule__BooleanValue__ValueAlternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4952:2: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment10029);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4961:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4965:1: ( ( RULE_STRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4966:1: ( RULE_STRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4966:1: ( RULE_STRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4967:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment10062); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4976:1: rule__NumberValue__ValueAssignment : ( ruleINTSTRING ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4980:1: ( ( ruleINTSTRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4981:1: ( ruleINTSTRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4981:1: ( ruleINTSTRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4982:1: ruleINTSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment10093);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4991:1: rule__VarReference__VariAssignment : ( ( RULE_LOWERFIRST ) ) ;
    public final void rule__VarReference__VariAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4995:1: ( ( ( RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4996:1: ( ( RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4996:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4997:1: ( RULE_LOWERFIRST )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariDeclarationCrossReference_0()); 
            }
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4998:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4999:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReferenceAccess().getVariDeclarationLOWERFIRSTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__VarReference__VariAssignment10128); if (state.failed) return ;
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5010:1: rule__Declaration__TypeAssignment_0 : ( ruleDatatype ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5014:1: ( ( ruleDatatype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5015:1: ( ruleDatatype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5015:1: ( ruleDatatype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5016:1: ruleDatatype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_010163);
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5025:1: rule__Declaration__NameAssignment_1 : ( RULE_LOWERFIRST ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5029:1: ( ( RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5030:1: ( RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5030:1: ( RULE_LOWERFIRST )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5031:1: RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_rule__Declaration__NameAssignment_110194); if (state.failed) return ;
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


    // $ANTLR start "rule__Return__ValAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5040:1: rule__Return__ValAssignment_1 : ( ruleValue ) ;
    public final void rule__Return__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5044:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5045:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5045:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:5046:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getValValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Return__ValAssignment_110225);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getValValueParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__ValAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCLfile_in_entryRuleCLfile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLfile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__MetsAssignment_in_ruleCLfile100 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0_in_ruleScript161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethods195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__0_in_ruleMetaMethods221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Alternatives_in_ruleStructureExpression401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethod617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__0_in_ruleMetaMethod643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_entryRuleUserMethod670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethod677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__0_in_ruleUserMethod703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethodCall737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethodCall__MethodAssignment_in_ruleUserMethodCall763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethodCall797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethodCall__MethodAssignment_in_ruleMetaMethodCall823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group__0_in_ruleBool885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanOperator__Alternatives_in_ruleBooleanOperator1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_entryRuleElse1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElse1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__0_in_ruleElse1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_entryRuleBasicValue1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValue1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValue__Alternatives_in_ruleBasicValue1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_entryRuleVarReference1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReference1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0_in_ruleReturn1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_entryRuleMethodtype1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodtype1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING1872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTSTRING1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTSTRING1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__CLfile__MetsAlternatives_01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_rule__CLfile__MetsAlternatives_01957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__0_in_rule__Script__Alternatives_31989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__0_in_rule__Script__Alternatives_32007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_22040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_22058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_rule__SimpleExpression__Alternatives2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_rule__StructureExpression__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_rule__Call__Alternatives_02357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_rule__Call__Alternatives_02374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComparisonOperator__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanOperator__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BooleanOperator__Alternatives2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BooleanOperator__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BooleanOperator__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__Value__Alternatives2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Value__Alternatives2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_rule__Value__Alternatives2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BooleanValue__ValueAlternatives_02771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BooleanValue__ValueAlternatives_02791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Methodtype__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Datatype__Alternatives2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Datatype__Alternatives2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Datatype__Alternatives2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__02950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Script__Group__0__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__13012 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__23072 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Script__Group__3_in_rule__Script__Group__23075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Script__Group__2__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__33134 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Script__Group__4_in_rule__Script__Group__33137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Alternatives_3_in_rule__Script__Group__3__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__43194 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Script__Group__5_in_rule__Script__Group__43197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Script__Group__4__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__53256 = new BitSet(new long[]{0x000000021E000000L});
    public static final BitSet FOLLOW_rule__Script__Group__6_in_rule__Script__Group__53259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Script__Group__5__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__63318 = new BitSet(new long[]{0x000000021E000000L});
    public static final BitSet FOLLOW_rule__Script__Group__7_in_rule__Script__Group__63321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__MethodsAssignment_6_in_rule__Script__Group__6__Impl3348 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__73379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Script__Group__7__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__0__Impl_in_rule__Script__Group_3_0__03454 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__1_in_rule__Script__Group_3_0__03457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Script__Group_3_0__0__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__1__Impl_in_rule__Script__Group_3_0__13516 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__2_in_rule__Script__Group_3_0__13519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_3_0_1_in_rule__Script__Group_3_0__1__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__2__Impl_in_rule__Script__Group_3_0__23576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__3_in_rule__Script__Group_3_0__23579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Script__Group_3_0__2__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__3__Impl_in_rule__Script__Group_3_0__33638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_3_0_3_in_rule__Script__Group_3_0__3__Impl3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__0__Impl_in_rule__Script__Group_3_1__03703 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__1_in_rule__Script__Group_3_1__03706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Script__Group_3_1__0__Impl3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__1__Impl_in_rule__Script__Group_3_1__13765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__0_in_rule__Script__Group_3_1__1__Impl3792 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__0__Impl_in_rule__Script__Group_3_1_1__03827 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__1_in_rule__Script__Group_3_1_1__03830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Script__Group_3_1_1__0__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__1__Impl_in_rule__Script__Group_3_1_1__13889 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__2_in_rule__Script__Group_3_1_1__13892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_3_1_1_1_in_rule__Script__Group_3_1_1__1__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__2__Impl_in_rule__Script__Group_3_1_1__23949 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__3_in_rule__Script__Group_3_1_1__23952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Script__Group_3_1_1__2__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__3__Impl_in_rule__Script__Group_3_1_1__34011 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__4_in_rule__Script__Group_3_1_1__34014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_3_1_1_3_in_rule__Script__Group_3_1_1__3__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__4__Impl_in_rule__Script__Group_3_1_1__44071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Script__Group_3_1_1__4__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__04140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__04143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__MetaMethods__Group__0__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__14202 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__14205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__NameAssignment_1_in_rule__MetaMethods__Group__1__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__24262 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__24265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MetaMethods__Group__2__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__34324 = new BitSet(new long[]{0x0000008200000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__34327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl4354 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__44385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__MetaMethods__Group__4__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04454 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14515 = new BitSet(new long[]{0x00001F031E000060L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__14518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Block__Group__1__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__24577 = new BitSet(new long[]{0x00001F031E000060L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__24580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl4607 = new BitSet(new long[]{0x00001F011E000062L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__34638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Block__Group__3__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__04705 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__04708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__14765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Block__Group_2_0__1__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04828 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0_in_rule__Assignment__Group__1__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__0__Impl_in_rule__Assignment__Group_1__04949 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1_in_rule__Assignment__Group_1__04952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Assignment__Group_1__0__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_1__1__Impl_in_rule__Assignment__Group_1__15013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_1_1_in_rule__Assignment__Group_1__1__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05074 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Alternatives_0_in_rule__Call__Group__0__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15134 = new BitSet(new long[]{0x00000008818000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Call__Group__1__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25196 = new BitSet(new long[]{0x00000008818000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__25199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__35257 = new BitSet(new long[]{0x00000008818000F0L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__35260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl5287 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__45318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Call__Group__4__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__05387 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__05390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Call__Group_3__0__Impl5421 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_rule__Call__Group_3__0__Impl5437 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__15472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__05533 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__05536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MetaMethod__Group__0__Impl5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__15595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__2_in_rule__MetaMethod__Group__15598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__TypeAssignment_1_in_rule__MetaMethod__Group__1__Impl5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__2__Impl_in_rule__MetaMethod__Group__25655 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__3_in_rule__MetaMethod__Group__25658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__NameAssignment_2_in_rule__MetaMethod__Group__2__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__3__Impl_in_rule__MetaMethod__Group__35715 = new BitSet(new long[]{0x000000089E000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__4_in_rule__MetaMethod__Group__35718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MetaMethod__Group__3__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__4__Impl_in_rule__MetaMethod__Group__45777 = new BitSet(new long[]{0x000000089E000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__5_in_rule__MetaMethod__Group__45780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__ParametersAssignment_4_in_rule__MetaMethod__Group__4__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__5__Impl_in_rule__MetaMethod__Group__55838 = new BitSet(new long[]{0x000000089E000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__6_in_rule__MetaMethod__Group__55841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__0_in_rule__MetaMethod__Group__5__Impl5868 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__6__Impl_in_rule__MetaMethod__Group__65899 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__7_in_rule__MetaMethod__Group__65902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MetaMethod__Group__6__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__7__Impl_in_rule__MetaMethod__Group__75961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__MetaMethod__Group__7__Impl5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__0__Impl_in_rule__MetaMethod__Group_5__06036 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__1_in_rule__MetaMethod__Group_5__06039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MetaMethod__Group_5__0__Impl6070 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_rule__MetaMethod__Group_5__0__Impl6086 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group_5__1__Impl_in_rule__MetaMethod__Group_5__16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__ParametersAssignment_5_1_in_rule__MetaMethod__Group_5__1__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__06182 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__06185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__TypeAssignment_0_in_rule__UserMethod__Group__0__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__16242 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__2_in_rule__UserMethod__Group__16245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__NameAssignment_1_in_rule__UserMethod__Group__1__Impl6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__2__Impl_in_rule__UserMethod__Group__26302 = new BitSet(new long[]{0x000000089E000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__3_in_rule__UserMethod__Group__26305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__UserMethod__Group__2__Impl6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__3__Impl_in_rule__UserMethod__Group__36364 = new BitSet(new long[]{0x000000089E000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__4_in_rule__UserMethod__Group__36367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__ParametersAssignment_3_in_rule__UserMethod__Group__3__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__4__Impl_in_rule__UserMethod__Group__46425 = new BitSet(new long[]{0x000000089E000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__5_in_rule__UserMethod__Group__46428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__0_in_rule__UserMethod__Group__4__Impl6455 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__5__Impl_in_rule__UserMethod__Group__56486 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__6_in_rule__UserMethod__Group__56489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__UserMethod__Group__5__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__6__Impl_in_rule__UserMethod__Group__66548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__BlAssignment_6_in_rule__UserMethod__Group__6__Impl6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__0__Impl_in_rule__UserMethod__Group_4__06619 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__1_in_rule__UserMethod__Group_4__06622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__UserMethod__Group_4__0__Impl6653 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_rule__UserMethod__Group_4__0__Impl6669 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group_4__1__Impl_in_rule__UserMethod__Group_4__16704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__ParametersAssignment_4_1_in_rule__UserMethod__Group_4__1__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group__0__Impl_in_rule__Bool__Group__06765 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__Bool__Group__1_in_rule__Bool__Group__06768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__VarleftAssignment_0_in_rule__Bool__Group__0__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group__1__Impl_in_rule__Bool__Group__16825 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__Bool__Group__2_in_rule__Bool__Group__16828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group_1__0_in_rule__Bool__Group__1__Impl6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group__2__Impl_in_rule__Bool__Group__26886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group_2__0_in_rule__Bool__Group__2__Impl6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group_1__0__Impl_in_rule__Bool__Group_1__06950 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__Bool__Group_1__1_in_rule__Bool__Group_1__06953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__OpAssignment_1_0_in_rule__Bool__Group_1__0__Impl6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group_1__1__Impl_in_rule__Bool__Group_1__17010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__VarrightAssignment_1_1_in_rule__Bool__Group_1__1__Impl7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group_2__0__Impl_in_rule__Bool__Group_2__07071 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__Bool__Group_2__1_in_rule__Bool__Group_2__07074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__BopAssignment_2_0_in_rule__Bool__Group_2__0__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Group_2__1__Impl_in_rule__Bool__Group_2__17131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__BnextAssignment_2_1_in_rule__Bool__Group_2__1__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__07192 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__07195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__If__Group__0__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__17254 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__If__Group__1__Impl7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__27316 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__27319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__37376 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__37379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__If__Group__3__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__47438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__07505 = new BitSet(new long[]{0x00001F011E000060L});
    public static final BitSet FOLLOW_rule__Else__Group__1_in_rule__Else__Group__07508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Else__Group__0__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__17567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__07628 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__07631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__For__Group__0__Impl7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__17690 = new BitSet(new long[]{0x00001F011E000060L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__17693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__For__Group__1__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__27752 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__27755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__37812 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__37815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__For__Group__3__Impl7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__47874 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__47877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__57934 = new BitSet(new long[]{0x00001F011E000060L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__57937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__For__Group__5__Impl7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__67996 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__67999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__78056 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__78059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__7__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__88118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__08193 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__08196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__While__Group__0__Impl8224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__18255 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__18258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__While__Group__1__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__28317 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__28320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__38377 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__38380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__While__Group__3__Impl8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__48439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__08506 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__08509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__18566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__08627 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_rule__Return__Group__1_in_rule__Return__Group__08630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Return__Group__0__Impl8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__18689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__ValAssignment_1_in_rule__Return__Group__1__Impl8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__MetsAlternatives_0_in_rule__CLfile__MetsAssignment8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__Script__NameAssignment_18788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAssignment_3_0_18819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAssignment_3_0_38850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobottypesAssignment_3_1_1_18881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Script__RobotconfigsAssignment_3_1_1_38912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_68943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__MetaMethods__NameAssignment_18974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_39005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_09036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_19067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_09098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_1_19131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_29162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_3_19193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_rule__MetaMethod__TypeAssignment_19224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethod__NameAssignment_29255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_49286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MetaMethod__ParametersAssignment_5_19317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_rule__UserMethod__TypeAssignment_09348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__UserMethod__NameAssignment_19379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_39410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__UserMethod__ParametersAssignment_4_19441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_69472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__UserMethodCall__MethodAssignment9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_rule__MetaMethodCall__MethodAssignment9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Bool__VarleftAssignment_09595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__Bool__OpAssignment_1_09626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Bool__VarrightAssignment_1_19657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_rule__Bool__BopAssignment_2_09688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rule__Bool__BnextAssignment_2_19719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rule__If__ExAssignment_29750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__If__BlAssignment_49781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Else__ExAssignment_19812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__For__InitAssignment_29843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rule__For__CheckAssignment_49874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__For__ActionAssignment_69905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__For__BlAssignment_89936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rule__While__ExAssignment_29967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__While__BlAssignment_49998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment10093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__VarReference__VariAssignment10128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_010163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_rule__Declaration__NameAssignment_110194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Return__ValAssignment_110225 = new BitSet(new long[]{0x0000000000000002L});

}