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

@SuppressWarnings("all")
public class InternalCommonlangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'true'", "'false'", "'void'", "'int'", "'string'", "'boolean'", "'script'", "'targets'", "')'", "'{'", "'}'", "'('", "','", "'metamethodscollection'", "';'", "'='", "'if'", "'else'", "'for'", "'while'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:60:1: entryRuleCLfile : ruleCLfile EOF ;
    public final void entryRuleCLfile() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:61:1: ( ruleCLfile EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:62:1: ruleCLfile EOF
            {
             before(grammarAccess.getCLfileRule()); 
            pushFollow(FOLLOW_ruleCLfile_in_entryRuleCLfile61);
            ruleCLfile();

            state._fsp--;

             after(grammarAccess.getCLfileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLfile68); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:69:1: ruleCLfile : ( ( rule__CLfile__Alternatives ) ) ;
    public final void ruleCLfile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:73:2: ( ( ( rule__CLfile__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:74:1: ( ( rule__CLfile__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:74:1: ( ( rule__CLfile__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:75:1: ( rule__CLfile__Alternatives )
            {
             before(grammarAccess.getCLfileAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:76:1: ( rule__CLfile__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:76:2: rule__CLfile__Alternatives
            {
            pushFollow(FOLLOW_rule__CLfile__Alternatives_in_ruleCLfile94);
            rule__CLfile__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCLfileAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:88:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:89:1: ( ruleScript EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:90:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript121);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript128); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:97:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:101:2: ( ( ( rule__Script__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:102:1: ( ( rule__Script__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:102:1: ( ( rule__Script__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:103:1: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:104:1: ( rule__Script__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:104:2: rule__Script__Group__0
            {
            pushFollow(FOLLOW_rule__Script__Group__0_in_ruleScript154);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:116:1: entryRuleMetaMethods : ruleMetaMethods EOF ;
    public final void entryRuleMetaMethods() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:117:1: ( ruleMetaMethods EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:118:1: ruleMetaMethods EOF
            {
             before(grammarAccess.getMetaMethodsRule()); 
            pushFollow(FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods181);
            ruleMetaMethods();

            state._fsp--;

             after(grammarAccess.getMetaMethodsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethods188); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:125:1: ruleMetaMethods : ( ( rule__MetaMethods__Group__0 ) ) ;
    public final void ruleMetaMethods() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:129:2: ( ( ( rule__MetaMethods__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:130:1: ( ( rule__MetaMethods__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:130:1: ( ( rule__MetaMethods__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:131:1: ( rule__MetaMethods__Group__0 )
            {
             before(grammarAccess.getMetaMethodsAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:132:1: ( rule__MetaMethods__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:132:2: rule__MetaMethods__Group__0
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__0_in_ruleMetaMethods214);
            rule__MetaMethods__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaMethodsAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:144:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:145:1: ( ruleBlock EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:146:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock241);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock248); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:153:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:157:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:158:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:158:1: ( ( rule__Block__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:159:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:160:1: ( rule__Block__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:160:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock274);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:172:1: entryRuleSimpleExpression : ruleSimpleExpression EOF ;
    public final void entryRuleSimpleExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:173:1: ( ruleSimpleExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:174:1: ruleSimpleExpression EOF
            {
             before(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression301);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression308); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:181:1: ruleSimpleExpression : ( ( rule__SimpleExpression__Alternatives ) ) ;
    public final void ruleSimpleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:185:2: ( ( ( rule__SimpleExpression__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:186:1: ( ( rule__SimpleExpression__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:186:1: ( ( rule__SimpleExpression__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:187:1: ( rule__SimpleExpression__Alternatives )
            {
             before(grammarAccess.getSimpleExpressionAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:188:1: ( rule__SimpleExpression__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:188:2: rule__SimpleExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression334);
            rule__SimpleExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:200:1: entryRuleStructureExpression : ruleStructureExpression EOF ;
    public final void entryRuleStructureExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:201:1: ( ruleStructureExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:202:1: ruleStructureExpression EOF
            {
             before(grammarAccess.getStructureExpressionRule()); 
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression361);
            ruleStructureExpression();

            state._fsp--;

             after(grammarAccess.getStructureExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression368); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:209:1: ruleStructureExpression : ( ( rule__StructureExpression__Alternatives ) ) ;
    public final void ruleStructureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:213:2: ( ( ( rule__StructureExpression__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:214:1: ( ( rule__StructureExpression__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:214:1: ( ( rule__StructureExpression__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:215:1: ( rule__StructureExpression__Alternatives )
            {
             before(grammarAccess.getStructureExpressionAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:216:1: ( rule__StructureExpression__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:216:2: rule__StructureExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__StructureExpression__Alternatives_in_ruleStructureExpression394);
            rule__StructureExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructureExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:229:1: ( ruleExpression EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression421);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression428); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:237:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:241:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:242:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:242:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:243:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:244:1: ( rule__Expression__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:244:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression454);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:256:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:257:1: ( ruleAssignment EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:258:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment481);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment488); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:265:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:269:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:270:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:270:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:271:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:272:1: ( rule__Assignment__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:272:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment514);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:284:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:285:1: ( ruleMethod EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:286:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod541);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod548); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:293:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:297:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:298:1: ( ( rule__Method__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:298:1: ( ( rule__Method__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:299:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:300:1: ( rule__Method__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:300:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod574);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleCall"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:312:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:313:1: ( ruleCall EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:314:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall601);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall608); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:321:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:325:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:326:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:326:1: ( ( rule__Call__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:327:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:328:1: ( rule__Call__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:328:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall634);
            rule__Call__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleUserMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:340:1: entryRuleUserMethod : ruleUserMethod EOF ;
    public final void entryRuleUserMethod() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:341:1: ( ruleUserMethod EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:342:1: ruleUserMethod EOF
            {
             before(grammarAccess.getUserMethodRule()); 
            pushFollow(FOLLOW_ruleUserMethod_in_entryRuleUserMethod661);
            ruleUserMethod();

            state._fsp--;

             after(grammarAccess.getUserMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethod668); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:349:1: ruleUserMethod : ( ( rule__UserMethod__Group__0 ) ) ;
    public final void ruleUserMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:353:2: ( ( ( rule__UserMethod__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:354:1: ( ( rule__UserMethod__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:354:1: ( ( rule__UserMethod__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:355:1: ( rule__UserMethod__Group__0 )
            {
             before(grammarAccess.getUserMethodAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:356:1: ( rule__UserMethod__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:356:2: rule__UserMethod__Group__0
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__0_in_ruleUserMethod694);
            rule__UserMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserMethodAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMetaMethod"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:368:1: entryRuleMetaMethod : ruleMetaMethod EOF ;
    public final void entryRuleMetaMethod() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:369:1: ( ruleMetaMethod EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:370:1: ruleMetaMethod EOF
            {
             before(grammarAccess.getMetaMethodRule()); 
            pushFollow(FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod721);
            ruleMetaMethod();

            state._fsp--;

             after(grammarAccess.getMetaMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethod728); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:377:1: ruleMetaMethod : ( ( rule__MetaMethod__Group__0 ) ) ;
    public final void ruleMetaMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:381:2: ( ( ( rule__MetaMethod__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:382:1: ( ( rule__MetaMethod__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:382:1: ( ( rule__MetaMethod__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:383:1: ( rule__MetaMethod__Group__0 )
            {
             before(grammarAccess.getMetaMethodAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:384:1: ( rule__MetaMethod__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:384:2: rule__MetaMethod__Group__0
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__0_in_ruleMetaMethod754);
            rule__MetaMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaMethodAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleComparison"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:398:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:399:1: ( ruleComparison EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:400:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison783);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison790); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:407:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:411:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:412:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:412:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:413:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:414:1: ( rule__Comparison__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:414:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison816);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleComparisonOperator"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:426:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:427:1: ( ruleComparisonOperator EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:428:1: ruleComparisonOperator EOF
            {
             before(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator843);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator850); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:435:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:439:2: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:440:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:440:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:441:1: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:442:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:442:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator876);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:454:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:455:1: ( ruleIf EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:456:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf903);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf910); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:463:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:467:2: ( ( ( rule__If__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:468:1: ( ( rule__If__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:468:1: ( ( rule__If__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:469:1: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:470:1: ( rule__If__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:470:2: rule__If__Group__0
            {
            pushFollow(FOLLOW_rule__If__Group__0_in_ruleIf936);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:482:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:483:1: ( ruleElse EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:484:1: ruleElse EOF
            {
             before(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_ruleElse_in_entryRuleElse963);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getElseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElse970); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:491:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:495:2: ( ( ( rule__Else__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:496:1: ( ( rule__Else__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:496:1: ( ( rule__Else__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:497:1: ( rule__Else__Group__0 )
            {
             before(grammarAccess.getElseAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:498:1: ( rule__Else__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:498:2: rule__Else__Group__0
            {
            pushFollow(FOLLOW_rule__Else__Group__0_in_ruleElse996);
            rule__Else__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:510:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:511:1: ( ruleFor EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:512:1: ruleFor EOF
            {
             before(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor1023);
            ruleFor();

            state._fsp--;

             after(grammarAccess.getForRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor1030); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:519:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:523:2: ( ( ( rule__For__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:524:1: ( ( rule__For__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:524:1: ( ( rule__For__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:525:1: ( rule__For__Group__0 )
            {
             before(grammarAccess.getForAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:526:1: ( rule__For__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:526:2: rule__For__Group__0
            {
            pushFollow(FOLLOW_rule__For__Group__0_in_ruleFor1056);
            rule__For__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:538:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:539:1: ( ruleWhile EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:540:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1083);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1090); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:547:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:551:2: ( ( ( rule__While__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:552:1: ( ( rule__While__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:552:1: ( ( rule__While__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:553:1: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:554:1: ( rule__While__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:554:2: rule__While__Group__0
            {
            pushFollow(FOLLOW_rule__While__Group__0_in_ruleWhile1116);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:566:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:567:1: ( ruleValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:568:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1143);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1150); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:575:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:579:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:580:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:580:1: ( ( rule__Value__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:581:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:582:1: ( rule__Value__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:582:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1176);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:594:1: entryRuleBasicValue : ruleBasicValue EOF ;
    public final void entryRuleBasicValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:595:1: ( ruleBasicValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:596:1: ruleBasicValue EOF
            {
             before(grammarAccess.getBasicValueRule()); 
            pushFollow(FOLLOW_ruleBasicValue_in_entryRuleBasicValue1203);
            ruleBasicValue();

            state._fsp--;

             after(grammarAccess.getBasicValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValue1210); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:603:1: ruleBasicValue : ( ( rule__BasicValue__Alternatives ) ) ;
    public final void ruleBasicValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:607:2: ( ( ( rule__BasicValue__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:608:1: ( ( rule__BasicValue__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:608:1: ( ( rule__BasicValue__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:609:1: ( rule__BasicValue__Alternatives )
            {
             before(grammarAccess.getBasicValueAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:610:1: ( rule__BasicValue__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:610:2: rule__BasicValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicValue__Alternatives_in_ruleBasicValue1236);
            rule__BasicValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicValueAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:622:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:623:1: ( ruleBooleanValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:624:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1263);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1270); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:631:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:635:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:636:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:636:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:637:1: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:638:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:638:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1296);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:650:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:651:1: ( ruleStringValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:652:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1323);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1330); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:659:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:663:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:664:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:664:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:665:1: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:666:1: ( rule__StringValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:666:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1356);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:678:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:679:1: ( ruleNumberValue EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:680:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue1383);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue1390); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:687:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:691:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:692:1: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:692:1: ( ( rule__NumberValue__ValueAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:693:1: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:694:1: ( rule__NumberValue__ValueAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:694:2: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue1416);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:706:1: entryRuleVarReference : ruleVarReference EOF ;
    public final void entryRuleVarReference() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:707:1: ( ruleVarReference EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:708:1: ruleVarReference EOF
            {
             before(grammarAccess.getVarReferenceRule()); 
            pushFollow(FOLLOW_ruleVarReference_in_entryRuleVarReference1443);
            ruleVarReference();

            state._fsp--;

             after(grammarAccess.getVarReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReference1450); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:715:1: ruleVarReference : ( ( rule__VarReference__VariAssignment ) ) ;
    public final void ruleVarReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:719:2: ( ( ( rule__VarReference__VariAssignment ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:720:1: ( ( rule__VarReference__VariAssignment ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:720:1: ( ( rule__VarReference__VariAssignment ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:721:1: ( rule__VarReference__VariAssignment )
            {
             before(grammarAccess.getVarReferenceAccess().getVariAssignment()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:722:1: ( rule__VarReference__VariAssignment )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:722:2: rule__VarReference__VariAssignment
            {
            pushFollow(FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1476);
            rule__VarReference__VariAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarReferenceAccess().getVariAssignment()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:734:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:735:1: ( ruleDeclaration EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:736:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1503);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1510); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:743:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:747:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:748:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:748:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:749:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:750:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:750:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration1536);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMethodtype"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:762:1: entryRuleMethodtype : ruleMethodtype EOF ;
    public final void entryRuleMethodtype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:763:1: ( ruleMethodtype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:764:1: ruleMethodtype EOF
            {
             before(grammarAccess.getMethodtypeRule()); 
            pushFollow(FOLLOW_ruleMethodtype_in_entryRuleMethodtype1563);
            ruleMethodtype();

            state._fsp--;

             after(grammarAccess.getMethodtypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodtype1570); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:771:1: ruleMethodtype : ( ( rule__Methodtype__Alternatives ) ) ;
    public final void ruleMethodtype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:775:2: ( ( ( rule__Methodtype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:776:1: ( ( rule__Methodtype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:776:1: ( ( rule__Methodtype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:777:1: ( rule__Methodtype__Alternatives )
            {
             before(grammarAccess.getMethodtypeAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:778:1: ( rule__Methodtype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:778:2: rule__Methodtype__Alternatives
            {
            pushFollow(FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype1596);
            rule__Methodtype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMethodtypeAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:790:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:791:1: ( ruleDatatype EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:792:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype1623);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype1630); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:799:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:803:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:804:1: ( ( rule__Datatype__Alternatives ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:804:1: ( ( rule__Datatype__Alternatives ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:805:1: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:806:1: ( rule__Datatype__Alternatives )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:806:2: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype1656);
            rule__Datatype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:818:1: entryRuleINTSTRING : ruleINTSTRING EOF ;
    public final void entryRuleINTSTRING() throws RecognitionException {
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:819:1: ( ruleINTSTRING EOF )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:820:1: ruleINTSTRING EOF
            {
             before(grammarAccess.getINTSTRINGRule()); 
            pushFollow(FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING1683);
            ruleINTSTRING();

            state._fsp--;

             after(grammarAccess.getINTSTRINGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTSTRING1690); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:827:1: ruleINTSTRING : ( RULE_INT ) ;
    public final void ruleINTSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:831:2: ( ( RULE_INT ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:832:1: ( RULE_INT )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:832:1: ( RULE_INT )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:833:1: RULE_INT
            {
             before(grammarAccess.getINTSTRINGAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTSTRING1716); 
             after(grammarAccess.getINTSTRINGAccess().getINTTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "rule__CLfile__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:846:1: rule__CLfile__Alternatives : ( ( ruleScript ) | ( ruleMetaMethods ) );
    public final void rule__CLfile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:850:1: ( ( ruleScript ) | ( ruleMetaMethods ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:851:1: ( ruleScript )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:851:1: ( ruleScript )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:852:1: ruleScript
                    {
                     before(grammarAccess.getCLfileAccess().getScriptParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleScript_in_rule__CLfile__Alternatives1751);
                    ruleScript();

                    state._fsp--;

                     after(grammarAccess.getCLfileAccess().getScriptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:857:6: ( ruleMetaMethods )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:857:6: ( ruleMetaMethods )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:858:1: ruleMetaMethods
                    {
                     before(grammarAccess.getCLfileAccess().getMetaMethodsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMetaMethods_in_rule__CLfile__Alternatives1768);
                    ruleMetaMethods();

                    state._fsp--;

                     after(grammarAccess.getCLfileAccess().getMetaMethodsParserRuleCall_1()); 

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
    // $ANTLR end "rule__CLfile__Alternatives"


    // $ANTLR start "rule__Script__Alternatives_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:868:1: rule__Script__Alternatives_3 : ( ( ( rule__Script__Group_3_0__0 ) ) | ( ( rule__Script__Group_3_1__0 ) ) );
    public final void rule__Script__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:872:1: ( ( ( rule__Script__Group_3_0__0 ) ) | ( ( rule__Script__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_1==25||LA2_1==28) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:873:1: ( ( rule__Script__Group_3_0__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:873:1: ( ( rule__Script__Group_3_0__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:874:1: ( rule__Script__Group_3_0__0 )
                    {
                     before(grammarAccess.getScriptAccess().getGroup_3_0()); 
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:875:1: ( rule__Script__Group_3_0__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:875:2: rule__Script__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Script__Group_3_0__0_in_rule__Script__Alternatives_31800);
                    rule__Script__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScriptAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:879:6: ( ( rule__Script__Group_3_1__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:879:6: ( ( rule__Script__Group_3_1__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:880:1: ( rule__Script__Group_3_1__0 )
                    {
                     before(grammarAccess.getScriptAccess().getGroup_3_1()); 
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:881:1: ( rule__Script__Group_3_1__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:881:2: rule__Script__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Script__Group_3_1__0_in_rule__Script__Alternatives_31818);
                    rule__Script__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScriptAccess().getGroup_3_1()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:890:1: rule__Block__Alternatives_2 : ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) );
    public final void rule__Block__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:894:1: ( ( ( rule__Block__Group_2_0__0 ) ) | ( ( rule__Block__ExsAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)||(LA3_0>=17 && LA3_0<=18)||(LA3_0>=20 && LA3_0<=22)||LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==26||(LA3_0>=33 && LA3_0<=36)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:895:1: ( ( rule__Block__Group_2_0__0 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:895:1: ( ( rule__Block__Group_2_0__0 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:896:1: ( rule__Block__Group_2_0__0 )
                    {
                     before(grammarAccess.getBlockAccess().getGroup_2_0()); 
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:897:1: ( rule__Block__Group_2_0__0 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:897:2: rule__Block__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_21851);
                    rule__Block__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:901:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:901:6: ( ( rule__Block__ExsAssignment_2_1 ) )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:902:1: ( rule__Block__ExsAssignment_2_1 )
                    {
                     before(grammarAccess.getBlockAccess().getExsAssignment_2_1()); 
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:903:1: ( rule__Block__ExsAssignment_2_1 )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:903:2: rule__Block__ExsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_21869);
                    rule__Block__ExsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getExsAssignment_2_1()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:912:1: rule__SimpleExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCall ) | ( ruleComparison ) );
    public final void rule__SimpleExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:916:1: ( ( ruleAssignment ) | ( ruleCall ) | ( ruleComparison ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
            case 22:
            case 32:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==28) ) {
                    alt4=2;
                }
                else if ( ((LA4_2>=11 && LA4_2<=16)) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 17:
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:917:1: ( ruleAssignment )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:917:1: ( ruleAssignment )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:918:1: ruleAssignment
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives1902);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:923:6: ( ruleCall )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:923:6: ( ruleCall )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:924:1: ruleCall
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives1919);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:929:6: ( ruleComparison )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:929:6: ( ruleComparison )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:930:1: ruleComparison
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getComparisonParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleComparison_in_rule__SimpleExpression__Alternatives1936);
                    ruleComparison();

                    state._fsp--;

                     after(grammarAccess.getSimpleExpressionAccess().getComparisonParserRuleCall_2()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:940:1: rule__StructureExpression__Alternatives : ( ( ruleBlock ) | ( ruleIf ) | ( ruleElse ) | ( ruleFor ) | ( ruleWhile ) );
    public final void rule__StructureExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:944:1: ( ( ruleBlock ) | ( ruleIf ) | ( ruleElse ) | ( ruleFor ) | ( ruleWhile ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:945:1: ( ruleBlock )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:945:1: ( ruleBlock )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:946:1: ruleBlock
                    {
                     before(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives1968);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:951:6: ( ruleIf )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:951:6: ( ruleIf )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:952:1: ruleIf
                    {
                     before(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives1985);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:957:6: ( ruleElse )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:957:6: ( ruleElse )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:958:1: ruleElse
                    {
                     before(grammarAccess.getStructureExpressionAccess().getElseParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleElse_in_rule__StructureExpression__Alternatives2002);
                    ruleElse();

                    state._fsp--;

                     after(grammarAccess.getStructureExpressionAccess().getElseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:963:6: ( ruleFor )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:963:6: ( ruleFor )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:964:1: ruleFor
                    {
                     before(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2019);
                    ruleFor();

                    state._fsp--;

                     after(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:969:6: ( ruleWhile )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:969:6: ( ruleWhile )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:970:1: ruleWhile
                    {
                     before(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2036);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_4()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:980:1: rule__Expression__Alternatives : ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:984:1: ( ( ruleSimpleExpression ) | ( ruleStructureExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||(LA6_0>=17 && LA6_0<=18)||(LA6_0>=20 && LA6_0<=22)||LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==26||(LA6_0>=33 && LA6_0<=36)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:985:1: ( ruleSimpleExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:985:1: ( ruleSimpleExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:986:1: ruleSimpleExpression
                    {
                     before(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2068);
                    ruleSimpleExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:991:6: ( ruleStructureExpression )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:991:6: ( ruleStructureExpression )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:992:1: ruleStructureExpression
                    {
                     before(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2085);
                    ruleStructureExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1002:1: rule__Assignment__VariAlternatives_0_0 : ( ( () ) | ( ruleDeclaration ) );
    public final void rule__Assignment__VariAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1006:1: ( ( () ) | ( ruleDeclaration ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=20 && LA7_0<=22)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1007:1: ( () )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1007:1: ( () )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1008:1: ()
                    {
                     before(grammarAccess.getAssignmentAccess().getVariDeclarationCrossReference_0_0_0()); 
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1009:1: ()
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1011:1: 
                    {
                    }

                     after(grammarAccess.getAssignmentAccess().getVariDeclarationCrossReference_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1015:6: ( ruleDeclaration )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1015:6: ( ruleDeclaration )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1016:1: ruleDeclaration
                    {
                     before(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02136);
                    ruleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 

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


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1027:1: rule__ComparisonOperator__Alternatives : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1031:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            case 16:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1032:1: ( '==' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1032:1: ( '==' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1033:1: '=='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ComparisonOperator__Alternatives2170); 
                     after(grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1040:6: ( '!=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1040:6: ( '!=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1041:1: '!='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ComparisonOperator__Alternatives2190); 
                     after(grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1048:6: ( '<' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1048:6: ( '<' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1049:1: '<'
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives2210); 
                     after(grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1056:6: ( '>' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1056:6: ( '>' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1057:1: '>'
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives2230); 
                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1064:6: ( '<=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1064:6: ( '<=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1065:1: '<='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives2250); 
                     after(grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1072:6: ( '>=' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1072:6: ( '>=' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1073:1: '>='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives2270); 
                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 

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


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1085:1: rule__Value__Alternatives : ( ( ruleVarReference ) | ( ruleBasicValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1089:1: ( ( ruleVarReference ) | ( ruleBasicValue ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT||LA9_0==RULE_STRING||(LA9_0>=17 && LA9_0<=18)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1090:1: ( ruleVarReference )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1090:1: ( ruleVarReference )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1091:1: ruleVarReference
                    {
                     before(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVarReference_in_rule__Value__Alternatives2304);
                    ruleVarReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1096:6: ( ruleBasicValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1096:6: ( ruleBasicValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1097:1: ruleBasicValue
                    {
                     before(grammarAccess.getValueAccess().getBasicValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBasicValue_in_rule__Value__Alternatives2321);
                    ruleBasicValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBasicValueParserRuleCall_1()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1107:1: rule__BasicValue__Alternatives : ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) );
    public final void rule__BasicValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1111:1: ( ( ruleBooleanValue ) | ( ruleNumberValue ) | ( ruleStringValue ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1112:1: ( ruleBooleanValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1112:1: ( ruleBooleanValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1113:1: ruleBooleanValue
                    {
                     before(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives2353);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1118:6: ( ruleNumberValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1118:6: ( ruleNumberValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1119:1: ruleNumberValue
                    {
                     before(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives2370);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1124:6: ( ruleStringValue )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1124:6: ( ruleStringValue )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1125:1: ruleStringValue
                    {
                     before(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives2387);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1135:1: rule__BooleanValue__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanValue__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1139:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==18) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1140:1: ( 'true' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1140:1: ( 'true' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1141:1: 'true'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__BooleanValue__ValueAlternatives_02420); 
                     after(grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1148:6: ( 'false' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1148:6: ( 'false' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1149:1: 'false'
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__BooleanValue__ValueAlternatives_02440); 
                     after(grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1161:1: rule__Methodtype__Alternatives : ( ( 'void' ) | ( ruleDatatype ) );
    public final void rule__Methodtype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1165:1: ( ( 'void' ) | ( ruleDatatype ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=20 && LA12_0<=22)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1166:1: ( 'void' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1166:1: ( 'void' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1167:1: 'void'
                    {
                     before(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__Methodtype__Alternatives2475); 
                     after(grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1174:6: ( ruleDatatype )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1174:6: ( ruleDatatype )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1175:1: ruleDatatype
                    {
                     before(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives2494);
                    ruleDatatype();

                    state._fsp--;

                     after(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1185:1: rule__Datatype__Alternatives : ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1189:1: ( ( 'int' ) | ( 'string' ) | ( 'boolean' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1190:1: ( 'int' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1190:1: ( 'int' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1191:1: 'int'
                    {
                     before(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                    match(input,20,FOLLOW_20_in_rule__Datatype__Alternatives2527); 
                     after(grammarAccess.getDatatypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1198:6: ( 'string' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1198:6: ( 'string' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1199:1: 'string'
                    {
                     before(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                    match(input,21,FOLLOW_21_in_rule__Datatype__Alternatives2547); 
                     after(grammarAccess.getDatatypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1206:6: ( 'boolean' )
                    {
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1206:6: ( 'boolean' )
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1207:1: 'boolean'
                    {
                     before(grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 
                    match(input,22,FOLLOW_22_in_rule__Datatype__Alternatives2567); 
                     after(grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1221:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1225:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1226:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__02599);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__02602);
            rule__Script__Group__1();

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
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1233:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1237:1: ( ( 'script' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1238:1: ( 'script' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1238:1: ( 'script' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1239:1: 'script'
            {
             before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Script__Group__0__Impl2630); 
             after(grammarAccess.getScriptAccess().getScriptKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1252:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1256:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1257:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__12661);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__12664);
            rule__Script__Group__2();

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
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1264:1: rule__Script__Group__1__Impl : ( ( rule__Script__NameAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1268:1: ( ( ( rule__Script__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1269:1: ( ( rule__Script__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1269:1: ( ( rule__Script__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1270:1: ( rule__Script__NameAssignment_1 )
            {
             before(grammarAccess.getScriptAccess().getNameAssignment_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1271:1: ( rule__Script__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1271:2: rule__Script__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl2691);
            rule__Script__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1281:1: rule__Script__Group__2 : rule__Script__Group__2__Impl rule__Script__Group__3 ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1285:1: ( rule__Script__Group__2__Impl rule__Script__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1286:2: rule__Script__Group__2__Impl rule__Script__Group__3
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__22721);
            rule__Script__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__3_in_rule__Script__Group__22724);
            rule__Script__Group__3();

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
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1293:1: rule__Script__Group__2__Impl : ( 'targets' ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1297:1: ( ( 'targets' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1298:1: ( 'targets' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1298:1: ( 'targets' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1299:1: 'targets'
            {
             before(grammarAccess.getScriptAccess().getTargetsKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Script__Group__2__Impl2752); 
             after(grammarAccess.getScriptAccess().getTargetsKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1312:1: rule__Script__Group__3 : rule__Script__Group__3__Impl rule__Script__Group__4 ;
    public final void rule__Script__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1316:1: ( rule__Script__Group__3__Impl rule__Script__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1317:2: rule__Script__Group__3__Impl rule__Script__Group__4
            {
            pushFollow(FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__32783);
            rule__Script__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__4_in_rule__Script__Group__32786);
            rule__Script__Group__4();

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
    // $ANTLR end "rule__Script__Group__3"


    // $ANTLR start "rule__Script__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1324:1: rule__Script__Group__3__Impl : ( ( rule__Script__Alternatives_3 ) ) ;
    public final void rule__Script__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1328:1: ( ( ( rule__Script__Alternatives_3 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1329:1: ( ( rule__Script__Alternatives_3 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1329:1: ( ( rule__Script__Alternatives_3 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1330:1: ( rule__Script__Alternatives_3 )
            {
             before(grammarAccess.getScriptAccess().getAlternatives_3()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1331:1: ( rule__Script__Alternatives_3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1331:2: rule__Script__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Script__Alternatives_3_in_rule__Script__Group__3__Impl2813);
            rule__Script__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getAlternatives_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1341:1: rule__Script__Group__4 : rule__Script__Group__4__Impl rule__Script__Group__5 ;
    public final void rule__Script__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1345:1: ( rule__Script__Group__4__Impl rule__Script__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1346:2: rule__Script__Group__4__Impl rule__Script__Group__5
            {
            pushFollow(FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__42843);
            rule__Script__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__5_in_rule__Script__Group__42846);
            rule__Script__Group__5();

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
    // $ANTLR end "rule__Script__Group__4"


    // $ANTLR start "rule__Script__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1353:1: rule__Script__Group__4__Impl : ( ')' ) ;
    public final void rule__Script__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1357:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1358:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1358:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1359:1: ')'
            {
             before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Script__Group__4__Impl2874); 
             after(grammarAccess.getScriptAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1372:1: rule__Script__Group__5 : rule__Script__Group__5__Impl rule__Script__Group__6 ;
    public final void rule__Script__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1376:1: ( rule__Script__Group__5__Impl rule__Script__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1377:2: rule__Script__Group__5__Impl rule__Script__Group__6
            {
            pushFollow(FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__52905);
            rule__Script__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__6_in_rule__Script__Group__52908);
            rule__Script__Group__6();

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
    // $ANTLR end "rule__Script__Group__5"


    // $ANTLR start "rule__Script__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1384:1: rule__Script__Group__5__Impl : ( '{' ) ;
    public final void rule__Script__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1388:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1389:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1389:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1390:1: '{'
            {
             before(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Script__Group__5__Impl2936); 
             after(grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1403:1: rule__Script__Group__6 : rule__Script__Group__6__Impl rule__Script__Group__7 ;
    public final void rule__Script__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1407:1: ( rule__Script__Group__6__Impl rule__Script__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1408:2: rule__Script__Group__6__Impl rule__Script__Group__7
            {
            pushFollow(FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__62967);
            rule__Script__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__7_in_rule__Script__Group__62970);
            rule__Script__Group__7();

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
    // $ANTLR end "rule__Script__Group__6"


    // $ANTLR start "rule__Script__Group__6__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1415:1: rule__Script__Group__6__Impl : ( ( rule__Script__MethodsAssignment_6 )* ) ;
    public final void rule__Script__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1419:1: ( ( ( rule__Script__MethodsAssignment_6 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1420:1: ( ( rule__Script__MethodsAssignment_6 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1420:1: ( ( rule__Script__MethodsAssignment_6 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1421:1: ( rule__Script__MethodsAssignment_6 )*
            {
             before(grammarAccess.getScriptAccess().getMethodsAssignment_6()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1422:1: ( rule__Script__MethodsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=22)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1422:2: rule__Script__MethodsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Script__MethodsAssignment_6_in_rule__Script__Group__6__Impl2997);
            	    rule__Script__MethodsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getMethodsAssignment_6()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1432:1: rule__Script__Group__7 : rule__Script__Group__7__Impl ;
    public final void rule__Script__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1436:1: ( rule__Script__Group__7__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1437:2: rule__Script__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__73028);
            rule__Script__Group__7__Impl();

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
    // $ANTLR end "rule__Script__Group__7"


    // $ANTLR start "rule__Script__Group__7__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1443:1: rule__Script__Group__7__Impl : ( '}' ) ;
    public final void rule__Script__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1447:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1448:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1448:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1449:1: '}'
            {
             before(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__Script__Group__7__Impl3056); 
             after(grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1478:1: rule__Script__Group_3_0__0 : rule__Script__Group_3_0__0__Impl rule__Script__Group_3_0__1 ;
    public final void rule__Script__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1482:1: ( rule__Script__Group_3_0__0__Impl rule__Script__Group_3_0__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1483:2: rule__Script__Group_3_0__0__Impl rule__Script__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__0__Impl_in_rule__Script__Group_3_0__03103);
            rule__Script__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_0__1_in_rule__Script__Group_3_0__03106);
            rule__Script__Group_3_0__1();

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
    // $ANTLR end "rule__Script__Group_3_0__0"


    // $ANTLR start "rule__Script__Group_3_0__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1490:1: rule__Script__Group_3_0__0__Impl : ( '(' ) ;
    public final void rule__Script__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1494:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1495:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1495:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1496:1: '('
            {
             before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Script__Group_3_0__0__Impl3134); 
             after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_0_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1509:1: rule__Script__Group_3_0__1 : rule__Script__Group_3_0__1__Impl rule__Script__Group_3_0__2 ;
    public final void rule__Script__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1513:1: ( rule__Script__Group_3_0__1__Impl rule__Script__Group_3_0__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1514:2: rule__Script__Group_3_0__1__Impl rule__Script__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__1__Impl_in_rule__Script__Group_3_0__13165);
            rule__Script__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_0__2_in_rule__Script__Group_3_0__13168);
            rule__Script__Group_3_0__2();

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
    // $ANTLR end "rule__Script__Group_3_0__1"


    // $ANTLR start "rule__Script__Group_3_0__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1521:1: rule__Script__Group_3_0__1__Impl : ( ( rule__Script__RobottypesAssignment_3_0_1 ) ) ;
    public final void rule__Script__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1525:1: ( ( ( rule__Script__RobottypesAssignment_3_0_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1526:1: ( ( rule__Script__RobottypesAssignment_3_0_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1526:1: ( ( rule__Script__RobottypesAssignment_3_0_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1527:1: ( rule__Script__RobottypesAssignment_3_0_1 )
            {
             before(grammarAccess.getScriptAccess().getRobottypesAssignment_3_0_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1528:1: ( rule__Script__RobottypesAssignment_3_0_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1528:2: rule__Script__RobottypesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_3_0_1_in_rule__Script__Group_3_0__1__Impl3195);
            rule__Script__RobottypesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getRobottypesAssignment_3_0_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1538:1: rule__Script__Group_3_0__2 : rule__Script__Group_3_0__2__Impl rule__Script__Group_3_0__3 ;
    public final void rule__Script__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1542:1: ( rule__Script__Group_3_0__2__Impl rule__Script__Group_3_0__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1543:2: rule__Script__Group_3_0__2__Impl rule__Script__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__2__Impl_in_rule__Script__Group_3_0__23225);
            rule__Script__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_0__3_in_rule__Script__Group_3_0__23228);
            rule__Script__Group_3_0__3();

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
    // $ANTLR end "rule__Script__Group_3_0__2"


    // $ANTLR start "rule__Script__Group_3_0__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1550:1: rule__Script__Group_3_0__2__Impl : ( ',' ) ;
    public final void rule__Script__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1554:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1555:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1555:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1556:1: ','
            {
             before(grammarAccess.getScriptAccess().getCommaKeyword_3_0_2()); 
            match(input,29,FOLLOW_29_in_rule__Script__Group_3_0__2__Impl3256); 
             after(grammarAccess.getScriptAccess().getCommaKeyword_3_0_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1569:1: rule__Script__Group_3_0__3 : rule__Script__Group_3_0__3__Impl ;
    public final void rule__Script__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1573:1: ( rule__Script__Group_3_0__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1574:2: rule__Script__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3_0__3__Impl_in_rule__Script__Group_3_0__33287);
            rule__Script__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__Script__Group_3_0__3"


    // $ANTLR start "rule__Script__Group_3_0__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1580:1: rule__Script__Group_3_0__3__Impl : ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) ) ;
    public final void rule__Script__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1584:1: ( ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1585:1: ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1585:1: ( ( rule__Script__RobotconfigsAssignment_3_0_3 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1586:1: ( rule__Script__RobotconfigsAssignment_3_0_3 )
            {
             before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_0_3()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1587:1: ( rule__Script__RobotconfigsAssignment_3_0_3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1587:2: rule__Script__RobotconfigsAssignment_3_0_3
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_3_0_3_in_rule__Script__Group_3_0__3__Impl3314);
            rule__Script__RobotconfigsAssignment_3_0_3();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_0_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1605:1: rule__Script__Group_3_1__0 : rule__Script__Group_3_1__0__Impl rule__Script__Group_3_1__1 ;
    public final void rule__Script__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1609:1: ( rule__Script__Group_3_1__0__Impl rule__Script__Group_3_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1610:2: rule__Script__Group_3_1__0__Impl rule__Script__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1__0__Impl_in_rule__Script__Group_3_1__03352);
            rule__Script__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_1__1_in_rule__Script__Group_3_1__03355);
            rule__Script__Group_3_1__1();

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
    // $ANTLR end "rule__Script__Group_3_1__0"


    // $ANTLR start "rule__Script__Group_3_1__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1617:1: rule__Script__Group_3_1__0__Impl : ( '(' ) ;
    public final void rule__Script__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1621:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1622:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1622:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1623:1: '('
            {
             before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Script__Group_3_1__0__Impl3383); 
             after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1636:1: rule__Script__Group_3_1__1 : rule__Script__Group_3_1__1__Impl ;
    public final void rule__Script__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1640:1: ( rule__Script__Group_3_1__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1641:2: rule__Script__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1__1__Impl_in_rule__Script__Group_3_1__13414);
            rule__Script__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Script__Group_3_1__1"


    // $ANTLR start "rule__Script__Group_3_1__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1647:1: rule__Script__Group_3_1__1__Impl : ( ( rule__Script__Group_3_1_1__0 )* ) ;
    public final void rule__Script__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1651:1: ( ( ( rule__Script__Group_3_1_1__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1652:1: ( ( rule__Script__Group_3_1_1__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1652:1: ( ( rule__Script__Group_3_1_1__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1653:1: ( rule__Script__Group_3_1_1__0 )*
            {
             before(grammarAccess.getScriptAccess().getGroup_3_1_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1654:1: ( rule__Script__Group_3_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1654:2: rule__Script__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Script__Group_3_1_1__0_in_rule__Script__Group_3_1__1__Impl3441);
            	    rule__Script__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getGroup_3_1_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1668:1: rule__Script__Group_3_1_1__0 : rule__Script__Group_3_1_1__0__Impl rule__Script__Group_3_1_1__1 ;
    public final void rule__Script__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1672:1: ( rule__Script__Group_3_1_1__0__Impl rule__Script__Group_3_1_1__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1673:2: rule__Script__Group_3_1_1__0__Impl rule__Script__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__0__Impl_in_rule__Script__Group_3_1_1__03476);
            rule__Script__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_1_1__1_in_rule__Script__Group_3_1_1__03479);
            rule__Script__Group_3_1_1__1();

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
    // $ANTLR end "rule__Script__Group_3_1_1__0"


    // $ANTLR start "rule__Script__Group_3_1_1__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1680:1: rule__Script__Group_3_1_1__0__Impl : ( '(' ) ;
    public final void rule__Script__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1684:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1685:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1685:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1686:1: '('
            {
             before(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Script__Group_3_1_1__0__Impl3507); 
             after(grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1699:1: rule__Script__Group_3_1_1__1 : rule__Script__Group_3_1_1__1__Impl rule__Script__Group_3_1_1__2 ;
    public final void rule__Script__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1703:1: ( rule__Script__Group_3_1_1__1__Impl rule__Script__Group_3_1_1__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1704:2: rule__Script__Group_3_1_1__1__Impl rule__Script__Group_3_1_1__2
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__1__Impl_in_rule__Script__Group_3_1_1__13538);
            rule__Script__Group_3_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_1_1__2_in_rule__Script__Group_3_1_1__13541);
            rule__Script__Group_3_1_1__2();

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
    // $ANTLR end "rule__Script__Group_3_1_1__1"


    // $ANTLR start "rule__Script__Group_3_1_1__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1711:1: rule__Script__Group_3_1_1__1__Impl : ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) ) ;
    public final void rule__Script__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1715:1: ( ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1716:1: ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1716:1: ( ( rule__Script__RobottypesAssignment_3_1_1_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1717:1: ( rule__Script__RobottypesAssignment_3_1_1_1 )
            {
             before(grammarAccess.getScriptAccess().getRobottypesAssignment_3_1_1_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1718:1: ( rule__Script__RobottypesAssignment_3_1_1_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1718:2: rule__Script__RobottypesAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Script__RobottypesAssignment_3_1_1_1_in_rule__Script__Group_3_1_1__1__Impl3568);
            rule__Script__RobottypesAssignment_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getRobottypesAssignment_3_1_1_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1728:1: rule__Script__Group_3_1_1__2 : rule__Script__Group_3_1_1__2__Impl rule__Script__Group_3_1_1__3 ;
    public final void rule__Script__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1732:1: ( rule__Script__Group_3_1_1__2__Impl rule__Script__Group_3_1_1__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1733:2: rule__Script__Group_3_1_1__2__Impl rule__Script__Group_3_1_1__3
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__2__Impl_in_rule__Script__Group_3_1_1__23598);
            rule__Script__Group_3_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_1_1__3_in_rule__Script__Group_3_1_1__23601);
            rule__Script__Group_3_1_1__3();

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
    // $ANTLR end "rule__Script__Group_3_1_1__2"


    // $ANTLR start "rule__Script__Group_3_1_1__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1740:1: rule__Script__Group_3_1_1__2__Impl : ( ',' ) ;
    public final void rule__Script__Group_3_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1744:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1745:1: ( ',' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1745:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1746:1: ','
            {
             before(grammarAccess.getScriptAccess().getCommaKeyword_3_1_1_2()); 
            match(input,29,FOLLOW_29_in_rule__Script__Group_3_1_1__2__Impl3629); 
             after(grammarAccess.getScriptAccess().getCommaKeyword_3_1_1_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1759:1: rule__Script__Group_3_1_1__3 : rule__Script__Group_3_1_1__3__Impl rule__Script__Group_3_1_1__4 ;
    public final void rule__Script__Group_3_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1763:1: ( rule__Script__Group_3_1_1__3__Impl rule__Script__Group_3_1_1__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1764:2: rule__Script__Group_3_1_1__3__Impl rule__Script__Group_3_1_1__4
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__3__Impl_in_rule__Script__Group_3_1_1__33660);
            rule__Script__Group_3_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group_3_1_1__4_in_rule__Script__Group_3_1_1__33663);
            rule__Script__Group_3_1_1__4();

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
    // $ANTLR end "rule__Script__Group_3_1_1__3"


    // $ANTLR start "rule__Script__Group_3_1_1__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1771:1: rule__Script__Group_3_1_1__3__Impl : ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) ) ;
    public final void rule__Script__Group_3_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1775:1: ( ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1776:1: ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1776:1: ( ( rule__Script__RobotconfigsAssignment_3_1_1_3 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1777:1: ( rule__Script__RobotconfigsAssignment_3_1_1_3 )
            {
             before(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_1_1_3()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1778:1: ( rule__Script__RobotconfigsAssignment_3_1_1_3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1778:2: rule__Script__RobotconfigsAssignment_3_1_1_3
            {
            pushFollow(FOLLOW_rule__Script__RobotconfigsAssignment_3_1_1_3_in_rule__Script__Group_3_1_1__3__Impl3690);
            rule__Script__RobotconfigsAssignment_3_1_1_3();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getRobotconfigsAssignment_3_1_1_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1788:1: rule__Script__Group_3_1_1__4 : rule__Script__Group_3_1_1__4__Impl ;
    public final void rule__Script__Group_3_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1792:1: ( rule__Script__Group_3_1_1__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1793:2: rule__Script__Group_3_1_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group_3_1_1__4__Impl_in_rule__Script__Group_3_1_1__43720);
            rule__Script__Group_3_1_1__4__Impl();

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
    // $ANTLR end "rule__Script__Group_3_1_1__4"


    // $ANTLR start "rule__Script__Group_3_1_1__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1799:1: rule__Script__Group_3_1_1__4__Impl : ( ')' ) ;
    public final void rule__Script__Group_3_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1803:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1804:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1804:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1805:1: ')'
            {
             before(grammarAccess.getScriptAccess().getRightParenthesisKeyword_3_1_1_4()); 
            match(input,25,FOLLOW_25_in_rule__Script__Group_3_1_1__4__Impl3748); 
             after(grammarAccess.getScriptAccess().getRightParenthesisKeyword_3_1_1_4()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1828:1: rule__MetaMethods__Group__0 : rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 ;
    public final void rule__MetaMethods__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1832:1: ( rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1833:2: rule__MetaMethods__Group__0__Impl rule__MetaMethods__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__03789);
            rule__MetaMethods__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__03792);
            rule__MetaMethods__Group__1();

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
    // $ANTLR end "rule__MetaMethods__Group__0"


    // $ANTLR start "rule__MetaMethods__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1840:1: rule__MetaMethods__Group__0__Impl : ( 'metamethodscollection' ) ;
    public final void rule__MetaMethods__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1844:1: ( ( 'metamethodscollection' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1845:1: ( 'metamethodscollection' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1845:1: ( 'metamethodscollection' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1846:1: 'metamethodscollection'
            {
             before(grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__MetaMethods__Group__0__Impl3820); 
             after(grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1859:1: rule__MetaMethods__Group__1 : rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 ;
    public final void rule__MetaMethods__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1863:1: ( rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1864:2: rule__MetaMethods__Group__1__Impl rule__MetaMethods__Group__2
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__13851);
            rule__MetaMethods__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__13854);
            rule__MetaMethods__Group__2();

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
    // $ANTLR end "rule__MetaMethods__Group__1"


    // $ANTLR start "rule__MetaMethods__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1871:1: rule__MetaMethods__Group__1__Impl : ( ( rule__MetaMethods__NameAssignment_1 ) ) ;
    public final void rule__MetaMethods__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1875:1: ( ( ( rule__MetaMethods__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1876:1: ( ( rule__MetaMethods__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1876:1: ( ( rule__MetaMethods__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1877:1: ( rule__MetaMethods__NameAssignment_1 )
            {
             before(grammarAccess.getMetaMethodsAccess().getNameAssignment_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1878:1: ( rule__MetaMethods__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1878:2: rule__MetaMethods__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaMethods__NameAssignment_1_in_rule__MetaMethods__Group__1__Impl3881);
            rule__MetaMethods__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaMethodsAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1888:1: rule__MetaMethods__Group__2 : rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 ;
    public final void rule__MetaMethods__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1892:1: ( rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1893:2: rule__MetaMethods__Group__2__Impl rule__MetaMethods__Group__3
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__23911);
            rule__MetaMethods__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__23914);
            rule__MetaMethods__Group__3();

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
    // $ANTLR end "rule__MetaMethods__Group__2"


    // $ANTLR start "rule__MetaMethods__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1900:1: rule__MetaMethods__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaMethods__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1904:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1905:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1905:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1906:1: '{'
            {
             before(grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__MetaMethods__Group__2__Impl3942); 
             after(grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1919:1: rule__MetaMethods__Group__3 : rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 ;
    public final void rule__MetaMethods__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1923:1: ( rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1924:2: rule__MetaMethods__Group__3__Impl rule__MetaMethods__Group__4
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__33973);
            rule__MetaMethods__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__33976);
            rule__MetaMethods__Group__4();

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
    // $ANTLR end "rule__MetaMethods__Group__3"


    // $ANTLR start "rule__MetaMethods__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1931:1: rule__MetaMethods__Group__3__Impl : ( ( rule__MetaMethods__MethodsAssignment_3 )* ) ;
    public final void rule__MetaMethods__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1935:1: ( ( ( rule__MetaMethods__MethodsAssignment_3 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1936:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1936:1: ( ( rule__MetaMethods__MethodsAssignment_3 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1937:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            {
             before(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1938:1: ( rule__MetaMethods__MethodsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=19 && LA16_0<=22)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1938:2: rule__MetaMethods__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl4003);
            	    rule__MetaMethods__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMetaMethodsAccess().getMethodsAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1948:1: rule__MetaMethods__Group__4 : rule__MetaMethods__Group__4__Impl ;
    public final void rule__MetaMethods__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1952:1: ( rule__MetaMethods__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1953:2: rule__MetaMethods__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__44034);
            rule__MetaMethods__Group__4__Impl();

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
    // $ANTLR end "rule__MetaMethods__Group__4"


    // $ANTLR start "rule__MetaMethods__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1959:1: rule__MetaMethods__Group__4__Impl : ( '}' ) ;
    public final void rule__MetaMethods__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1963:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1964:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1964:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1965:1: '}'
            {
             before(grammarAccess.getMetaMethodsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__MetaMethods__Group__4__Impl4062); 
             after(grammarAccess.getMetaMethodsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1988:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1992:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:1993:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04103);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04106);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2000:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2004:1: ( ( () ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2005:1: ( () )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2005:1: ( () )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2006:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2007:1: ()
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2009:1: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2019:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2023:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2024:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14164);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__14167);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2031:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2035:1: ( ( '{' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2036:1: ( '{' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2036:1: ( '{' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2037:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Block__Group__1__Impl4195); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2050:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2054:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2055:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__24226);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__24229);
            rule__Block__Group__3();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2062:1: rule__Block__Group__2__Impl : ( ( rule__Block__Alternatives_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2066:1: ( ( ( rule__Block__Alternatives_2 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2067:1: ( ( rule__Block__Alternatives_2 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2067:1: ( ( rule__Block__Alternatives_2 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2068:1: ( rule__Block__Alternatives_2 )*
            {
             before(grammarAccess.getBlockAccess().getAlternatives_2()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2069:1: ( rule__Block__Alternatives_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_STRING)||(LA17_0>=17 && LA17_0<=18)||(LA17_0>=20 && LA17_0<=22)||LA17_0==26||(LA17_0>=32 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2069:2: rule__Block__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl4256);
            	    rule__Block__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2079:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2083:1: ( rule__Block__Group__3__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2084:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__34287);
            rule__Block__Group__3__Impl();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2090:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2094:1: ( ( '}' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2095:1: ( '}' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2095:1: ( '}' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2096:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Block__Group__3__Impl4315); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2117:1: rule__Block__Group_2_0__0 : rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 ;
    public final void rule__Block__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2121:1: ( rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2122:2: rule__Block__Group_2_0__0__Impl rule__Block__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__04354);
            rule__Block__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__04357);
            rule__Block__Group_2_0__1();

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
    // $ANTLR end "rule__Block__Group_2_0__0"


    // $ANTLR start "rule__Block__Group_2_0__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2129:1: rule__Block__Group_2_0__0__Impl : ( ( rule__Block__ExsAssignment_2_0_0 ) ) ;
    public final void rule__Block__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2133:1: ( ( ( rule__Block__ExsAssignment_2_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2134:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2134:1: ( ( rule__Block__ExsAssignment_2_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2135:1: ( rule__Block__ExsAssignment_2_0_0 )
            {
             before(grammarAccess.getBlockAccess().getExsAssignment_2_0_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2136:1: ( rule__Block__ExsAssignment_2_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2136:2: rule__Block__ExsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl4384);
            rule__Block__ExsAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getExsAssignment_2_0_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2146:1: rule__Block__Group_2_0__1 : rule__Block__Group_2_0__1__Impl ;
    public final void rule__Block__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2150:1: ( rule__Block__Group_2_0__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2151:2: rule__Block__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__14414);
            rule__Block__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Block__Group_2_0__1"


    // $ANTLR start "rule__Block__Group_2_0__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2157:1: rule__Block__Group_2_0__1__Impl : ( ';' ) ;
    public final void rule__Block__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2161:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2162:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2162:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2163:1: ';'
            {
             before(grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1()); 
            match(input,31,FOLLOW_31_in_rule__Block__Group_2_0__1__Impl4442); 
             after(grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2180:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2184:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2185:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04477);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04480);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2192:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2196:1: ( ( ( rule__Assignment__VariAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2197:1: ( ( rule__Assignment__VariAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2197:1: ( ( rule__Assignment__VariAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2198:1: ( rule__Assignment__VariAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVariAssignment_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2199:1: ( rule__Assignment__VariAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2199:2: rule__Assignment__VariAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl4507);
            rule__Assignment__VariAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2209:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2213:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2214:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14537);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14540);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2221:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2225:1: ( ( '=' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2226:1: ( '=' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2226:1: ( '=' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2227:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Assignment__Group__1__Impl4568); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Assignment__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2240:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2244:1: ( rule__Assignment__Group__2__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2245:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24599);
            rule__Assignment__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2251:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2255:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2256:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2256:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2257:1: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2258:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2258:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl4626);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2274:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2278:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2279:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__04662);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__04665);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2286:1: rule__Method__Group__0__Impl : ( ( rule__Method__TypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2290:1: ( ( ( rule__Method__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2291:1: ( ( rule__Method__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2291:1: ( ( rule__Method__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2292:1: ( rule__Method__TypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2293:1: ( rule__Method__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2293:2: rule__Method__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Method__TypeAssignment_0_in_rule__Method__Group__0__Impl4692);
            rule__Method__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2303:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2307:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2308:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__14722);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__14725);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2315:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2319:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2320:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2320:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2321:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2322:1: ( rule__Method__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2322:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4752);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2332:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2336:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2337:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__24782);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__24785);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2344:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2348:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2349:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2349:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2350:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Method__Group__2__Impl4813); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2363:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2367:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2368:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34844);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34847);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2375:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParametersAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2379:1: ( ( ( rule__Method__ParametersAssignment_3 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2380:1: ( ( rule__Method__ParametersAssignment_3 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2380:1: ( ( rule__Method__ParametersAssignment_3 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2381:1: ( rule__Method__ParametersAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_3()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2382:1: ( rule__Method__ParametersAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=20 && LA18_0<=22)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2382:2: rule__Method__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl4874);
                    rule__Method__ParametersAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2392:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2396:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2397:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44905);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44908);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2404:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2408:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2409:1: ( ( rule__Method__Group_4__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2409:1: ( ( rule__Method__Group_4__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2410:1: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2411:1: ( rule__Method__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2411:2: rule__Method__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl4935);
            	    rule__Method__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2421:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2425:1: ( rule__Method__Group__5__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2426:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54966);
            rule__Method__Group__5__Impl();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2432:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2436:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2437:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2437:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2438:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Method__Group__5__Impl4994); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2463:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2467:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2468:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__05037);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__05040);
            rule__Method__Group_4__1();

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
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2475:1: rule__Method__Group_4__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2479:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2480:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2480:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2481:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2481:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2482:1: ( ',' )
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2483:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2484:2: ','
            {
            match(input,29,FOLLOW_29_in_rule__Method__Group_4__0__Impl5071); 

            }

             after(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2488:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2489:1: ( ',' )*
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2490:1: ( ',' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2491:2: ','
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Method__Group_4__0__Impl5087); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2503:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2507:1: ( rule__Method__Group_4__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2508:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__15122);
            rule__Method__Group_4__1__Impl();

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
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2514:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ParametersAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2518:1: ( ( ( rule__Method__ParametersAssignment_4_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2519:1: ( ( rule__Method__ParametersAssignment_4_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2519:1: ( ( rule__Method__ParametersAssignment_4_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2520:1: ( rule__Method__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_4_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2521:1: ( rule__Method__ParametersAssignment_4_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2521:2: rule__Method__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Method__ParametersAssignment_4_1_in_rule__Method__Group_4__1__Impl5149);
            rule__Method__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2535:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2539:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2540:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05183);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05186);
            rule__Call__Group__1();

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
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2547:1: rule__Call__Group__0__Impl : ( ( rule__Call__NameAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2551:1: ( ( ( rule__Call__NameAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2552:1: ( ( rule__Call__NameAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2552:1: ( ( rule__Call__NameAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2553:1: ( rule__Call__NameAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getNameAssignment_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2554:1: ( rule__Call__NameAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2554:2: rule__Call__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5213);
            rule__Call__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2564:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2568:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2569:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15243);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15246);
            rule__Call__Group__2();

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
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2576:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2580:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2581:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2581:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2582:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Call__Group__1__Impl5274); 
             after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2595:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2599:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2600:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25305);
            rule__Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__25308);
            rule__Call__Group__3();

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
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2607:1: rule__Call__Group__2__Impl : ( ( rule__Call__ParametersAssignment_2 )? ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2611:1: ( ( ( rule__Call__ParametersAssignment_2 )? ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2612:1: ( ( rule__Call__ParametersAssignment_2 )? )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2612:1: ( ( rule__Call__ParametersAssignment_2 )? )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2613:1: ( rule__Call__ParametersAssignment_2 )?
            {
             before(grammarAccess.getCallAccess().getParametersAssignment_2()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2614:1: ( rule__Call__ParametersAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)||(LA21_0>=17 && LA21_0<=18)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2614:2: rule__Call__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl5335);
                    rule__Call__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallAccess().getParametersAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2624:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2628:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2629:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__35366);
            rule__Call__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__35369);
            rule__Call__Group__4();

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
    // $ANTLR end "rule__Call__Group__3"


    // $ANTLR start "rule__Call__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2636:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )* ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2640:1: ( ( ( rule__Call__Group_3__0 )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2641:1: ( ( rule__Call__Group_3__0 )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2641:1: ( ( rule__Call__Group_3__0 )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2642:1: ( rule__Call__Group_3__0 )*
            {
             before(grammarAccess.getCallAccess().getGroup_3()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2643:1: ( rule__Call__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2643:2: rule__Call__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl5396);
            	    rule__Call__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCallAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2653:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2657:1: ( rule__Call__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2658:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__45427);
            rule__Call__Group__4__Impl();

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
    // $ANTLR end "rule__Call__Group__4"


    // $ANTLR start "rule__Call__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2664:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2668:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2669:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2669:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2670:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Call__Group__4__Impl5455); 
             after(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2693:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2697:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2698:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__05496);
            rule__Call__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__05499);
            rule__Call__Group_3__1();

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
    // $ANTLR end "rule__Call__Group_3__0"


    // $ANTLR start "rule__Call__Group_3__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2705:1: rule__Call__Group_3__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2709:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2710:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2710:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2711:1: ( ( ',' ) ) ( ( ',' )* )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2711:1: ( ( ',' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2712:1: ( ',' )
            {
             before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2713:1: ( ',' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2714:2: ','
            {
            match(input,29,FOLLOW_29_in_rule__Call__Group_3__0__Impl5530); 

            }

             after(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 

            }

            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2718:1: ( ( ',' )* )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2719:1: ( ',' )*
            {
             before(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2720:1: ( ',' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2721:2: ','
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Call__Group_3__0__Impl5546); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCallAccess().getCommaKeyword_3_0()); 

            }


            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2733:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2737:1: ( rule__Call__Group_3__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2738:2: rule__Call__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__15581);
            rule__Call__Group_3__1__Impl();

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
    // $ANTLR end "rule__Call__Group_3__1"


    // $ANTLR start "rule__Call__Group_3__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2744:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__ParametersAssignment_3_1 ) ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2748:1: ( ( ( rule__Call__ParametersAssignment_3_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2749:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2749:1: ( ( rule__Call__ParametersAssignment_3_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2750:1: ( rule__Call__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getCallAccess().getParametersAssignment_3_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2751:1: ( rule__Call__ParametersAssignment_3_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2751:2: rule__Call__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl5608);
            rule__Call__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getParametersAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__UserMethod__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2765:1: rule__UserMethod__Group__0 : rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 ;
    public final void rule__UserMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2769:1: ( rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2770:2: rule__UserMethod__Group__0__Impl rule__UserMethod__Group__1
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__05642);
            rule__UserMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__05645);
            rule__UserMethod__Group__1();

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
    // $ANTLR end "rule__UserMethod__Group__0"


    // $ANTLR start "rule__UserMethod__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2777:1: rule__UserMethod__Group__0__Impl : ( ( rule__UserMethod__MethodAssignment_0 ) ) ;
    public final void rule__UserMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2781:1: ( ( ( rule__UserMethod__MethodAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2782:1: ( ( rule__UserMethod__MethodAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2782:1: ( ( rule__UserMethod__MethodAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2783:1: ( rule__UserMethod__MethodAssignment_0 )
            {
             before(grammarAccess.getUserMethodAccess().getMethodAssignment_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2784:1: ( rule__UserMethod__MethodAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2784:2: rule__UserMethod__MethodAssignment_0
            {
            pushFollow(FOLLOW_rule__UserMethod__MethodAssignment_0_in_rule__UserMethod__Group__0__Impl5672);
            rule__UserMethod__MethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUserMethodAccess().getMethodAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2794:1: rule__UserMethod__Group__1 : rule__UserMethod__Group__1__Impl ;
    public final void rule__UserMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2798:1: ( rule__UserMethod__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2799:2: rule__UserMethod__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__15702);
            rule__UserMethod__Group__1__Impl();

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
    // $ANTLR end "rule__UserMethod__Group__1"


    // $ANTLR start "rule__UserMethod__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2805:1: rule__UserMethod__Group__1__Impl : ( ( rule__UserMethod__BlAssignment_1 ) ) ;
    public final void rule__UserMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2809:1: ( ( ( rule__UserMethod__BlAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2810:1: ( ( rule__UserMethod__BlAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2810:1: ( ( rule__UserMethod__BlAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2811:1: ( rule__UserMethod__BlAssignment_1 )
            {
             before(grammarAccess.getUserMethodAccess().getBlAssignment_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2812:1: ( rule__UserMethod__BlAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2812:2: rule__UserMethod__BlAssignment_1
            {
            pushFollow(FOLLOW_rule__UserMethod__BlAssignment_1_in_rule__UserMethod__Group__1__Impl5729);
            rule__UserMethod__BlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserMethodAccess().getBlAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MetaMethod__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2826:1: rule__MetaMethod__Group__0 : rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 ;
    public final void rule__MetaMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2830:1: ( rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2831:2: rule__MetaMethod__Group__0__Impl rule__MetaMethod__Group__1
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__05763);
            rule__MetaMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__05766);
            rule__MetaMethod__Group__1();

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
    // $ANTLR end "rule__MetaMethod__Group__0"


    // $ANTLR start "rule__MetaMethod__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2838:1: rule__MetaMethod__Group__0__Impl : ( ( rule__MetaMethod__MethodAssignment_0 ) ) ;
    public final void rule__MetaMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2842:1: ( ( ( rule__MetaMethod__MethodAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2843:1: ( ( rule__MetaMethod__MethodAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2843:1: ( ( rule__MetaMethod__MethodAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2844:1: ( rule__MetaMethod__MethodAssignment_0 )
            {
             before(grammarAccess.getMetaMethodAccess().getMethodAssignment_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2845:1: ( rule__MetaMethod__MethodAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2845:2: rule__MetaMethod__MethodAssignment_0
            {
            pushFollow(FOLLOW_rule__MetaMethod__MethodAssignment_0_in_rule__MetaMethod__Group__0__Impl5793);
            rule__MetaMethod__MethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetaMethodAccess().getMethodAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2855:1: rule__MetaMethod__Group__1 : rule__MetaMethod__Group__1__Impl ;
    public final void rule__MetaMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2859:1: ( rule__MetaMethod__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2860:2: rule__MetaMethod__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__15823);
            rule__MetaMethod__Group__1__Impl();

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
    // $ANTLR end "rule__MetaMethod__Group__1"


    // $ANTLR start "rule__MetaMethod__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2866:1: rule__MetaMethod__Group__1__Impl : ( ';' ) ;
    public final void rule__MetaMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2870:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2871:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2871:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2872:1: ';'
            {
             before(grammarAccess.getMetaMethodAccess().getSemicolonKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__MetaMethod__Group__1__Impl5851); 
             after(grammarAccess.getMetaMethodAccess().getSemicolonKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2889:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2893:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2894:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05886);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05889);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2901:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__VarleftAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2905:1: ( ( ( rule__Comparison__VarleftAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2906:1: ( ( rule__Comparison__VarleftAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2906:1: ( ( rule__Comparison__VarleftAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2907:1: ( rule__Comparison__VarleftAssignment_0 )
            {
             before(grammarAccess.getComparisonAccess().getVarleftAssignment_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2908:1: ( rule__Comparison__VarleftAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2908:2: rule__Comparison__VarleftAssignment_0
            {
            pushFollow(FOLLOW_rule__Comparison__VarleftAssignment_0_in_rule__Comparison__Group__0__Impl5916);
            rule__Comparison__VarleftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getVarleftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2918:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2922:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2923:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15946);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__15949);
            rule__Comparison__Group__2();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2930:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__OpAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2934:1: ( ( ( rule__Comparison__OpAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2935:1: ( ( rule__Comparison__OpAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2935:1: ( ( rule__Comparison__OpAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2936:1: ( rule__Comparison__OpAssignment_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2937:1: ( rule__Comparison__OpAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2937:2: rule__Comparison__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_in_rule__Comparison__Group__1__Impl5976);
            rule__Comparison__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2947:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2951:1: ( rule__Comparison__Group__2__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2952:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__26006);
            rule__Comparison__Group__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2958:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__VarrightAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2962:1: ( ( ( rule__Comparison__VarrightAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2963:1: ( ( rule__Comparison__VarrightAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2963:1: ( ( rule__Comparison__VarrightAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2964:1: ( rule__Comparison__VarrightAssignment_2 )
            {
             before(grammarAccess.getComparisonAccess().getVarrightAssignment_2()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2965:1: ( rule__Comparison__VarrightAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2965:2: rule__Comparison__VarrightAssignment_2
            {
            pushFollow(FOLLOW_rule__Comparison__VarrightAssignment_2_in_rule__Comparison__Group__2__Impl6033);
            rule__Comparison__VarrightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getVarrightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__If__Group__0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2981:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2985:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2986:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__06069);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__1_in_rule__If__Group__06072);
            rule__If__Group__1();

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
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2993:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2997:1: ( ( 'if' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2998:1: ( 'if' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2998:1: ( 'if' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:2999:1: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__If__Group__0__Impl6100); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3012:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3016:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3017:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__16131);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__2_in_rule__If__Group__16134);
            rule__If__Group__2();

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
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3024:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3028:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3029:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3029:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3030:1: '('
            {
             before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__If__Group__1__Impl6162); 
             after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3043:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3047:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3048:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__26193);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__3_in_rule__If__Group__26196);
            rule__If__Group__3();

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
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3055:1: rule__If__Group__2__Impl : ( ( rule__If__ExAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3059:1: ( ( ( rule__If__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3060:1: ( ( rule__If__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3060:1: ( ( rule__If__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3061:1: ( rule__If__ExAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getExAssignment_2()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3062:1: ( rule__If__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3062:2: rule__If__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl6223);
            rule__If__ExAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getExAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3072:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3076:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3077:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__36253);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If__Group__4_in_rule__If__Group__36256);
            rule__If__Group__4();

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
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3084:1: rule__If__Group__3__Impl : ( ')' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3088:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3089:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3089:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3090:1: ')'
            {
             before(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__If__Group__3__Impl6284); 
             after(grammarAccess.getIfAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3103:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3107:1: ( rule__If__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3108:2: rule__If__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__46315);
            rule__If__Group__4__Impl();

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
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3114:1: rule__If__Group__4__Impl : ( ( rule__If__BlAssignment_4 ) ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3118:1: ( ( ( rule__If__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3119:1: ( ( rule__If__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3119:1: ( ( rule__If__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3120:1: ( rule__If__BlAssignment_4 )
            {
             before(grammarAccess.getIfAccess().getBlAssignment_4()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3121:1: ( rule__If__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3121:2: rule__If__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl6342);
            rule__If__BlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getBlAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3141:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3145:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3146:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__06382);
            rule__Else__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Else__Group__1_in_rule__Else__Group__06385);
            rule__Else__Group__1();

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
    // $ANTLR end "rule__Else__Group__0"


    // $ANTLR start "rule__Else__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3153:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3157:1: ( ( 'else' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3158:1: ( 'else' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3158:1: ( 'else' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3159:1: 'else'
            {
             before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Else__Group__0__Impl6413); 
             after(grammarAccess.getElseAccess().getElseKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3172:1: rule__Else__Group__1 : rule__Else__Group__1__Impl ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3176:1: ( rule__Else__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3177:2: rule__Else__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__16444);
            rule__Else__Group__1__Impl();

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
    // $ANTLR end "rule__Else__Group__1"


    // $ANTLR start "rule__Else__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3183:1: rule__Else__Group__1__Impl : ( ( rule__Else__ExAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3187:1: ( ( ( rule__Else__ExAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3188:1: ( ( rule__Else__ExAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3188:1: ( ( rule__Else__ExAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3189:1: ( rule__Else__ExAssignment_1 )
            {
             before(grammarAccess.getElseAccess().getExAssignment_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3190:1: ( rule__Else__ExAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3190:2: rule__Else__ExAssignment_1
            {
            pushFollow(FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl6471);
            rule__Else__ExAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getExAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3204:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3208:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3209:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__06505);
            rule__For__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__1_in_rule__For__Group__06508);
            rule__For__Group__1();

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
    // $ANTLR end "rule__For__Group__0"


    // $ANTLR start "rule__For__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3216:1: rule__For__Group__0__Impl : ( 'for' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3220:1: ( ( 'for' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3221:1: ( 'for' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3221:1: ( 'for' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3222:1: 'for'
            {
             before(grammarAccess.getForAccess().getForKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__For__Group__0__Impl6536); 
             after(grammarAccess.getForAccess().getForKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3235:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3239:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3240:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__16567);
            rule__For__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__2_in_rule__For__Group__16570);
            rule__For__Group__2();

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
    // $ANTLR end "rule__For__Group__1"


    // $ANTLR start "rule__For__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3247:1: rule__For__Group__1__Impl : ( '(' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3251:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3252:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3252:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3253:1: '('
            {
             before(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__For__Group__1__Impl6598); 
             after(grammarAccess.getForAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3266:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3270:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3271:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__26629);
            rule__For__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__3_in_rule__For__Group__26632);
            rule__For__Group__3();

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
    // $ANTLR end "rule__For__Group__2"


    // $ANTLR start "rule__For__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3278:1: rule__For__Group__2__Impl : ( ( rule__For__InitAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3282:1: ( ( ( rule__For__InitAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3283:1: ( ( rule__For__InitAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3283:1: ( ( rule__For__InitAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3284:1: ( rule__For__InitAssignment_2 )
            {
             before(grammarAccess.getForAccess().getInitAssignment_2()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3285:1: ( rule__For__InitAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3285:2: rule__For__InitAssignment_2
            {
            pushFollow(FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl6659);
            rule__For__InitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getInitAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3295:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3299:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3300:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__36689);
            rule__For__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__4_in_rule__For__Group__36692);
            rule__For__Group__4();

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
    // $ANTLR end "rule__For__Group__3"


    // $ANTLR start "rule__For__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3307:1: rule__For__Group__3__Impl : ( ';' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3311:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3312:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3312:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3313:1: ';'
            {
             before(grammarAccess.getForAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__For__Group__3__Impl6720); 
             after(grammarAccess.getForAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3326:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3330:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3331:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__46751);
            rule__For__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__5_in_rule__For__Group__46754);
            rule__For__Group__5();

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
    // $ANTLR end "rule__For__Group__4"


    // $ANTLR start "rule__For__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3338:1: rule__For__Group__4__Impl : ( ( rule__For__CheckAssignment_4 ) ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3342:1: ( ( ( rule__For__CheckAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3343:1: ( ( rule__For__CheckAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3343:1: ( ( rule__For__CheckAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3344:1: ( rule__For__CheckAssignment_4 )
            {
             before(grammarAccess.getForAccess().getCheckAssignment_4()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3345:1: ( rule__For__CheckAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3345:2: rule__For__CheckAssignment_4
            {
            pushFollow(FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl6781);
            rule__For__CheckAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getCheckAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3355:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3359:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3360:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__56811);
            rule__For__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__6_in_rule__For__Group__56814);
            rule__For__Group__6();

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
    // $ANTLR end "rule__For__Group__5"


    // $ANTLR start "rule__For__Group__5__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3367:1: rule__For__Group__5__Impl : ( ';' ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3371:1: ( ( ';' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3372:1: ( ';' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3372:1: ( ';' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3373:1: ';'
            {
             before(grammarAccess.getForAccess().getSemicolonKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__For__Group__5__Impl6842); 
             after(grammarAccess.getForAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3386:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3390:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3391:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__66873);
            rule__For__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__7_in_rule__For__Group__66876);
            rule__For__Group__7();

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
    // $ANTLR end "rule__For__Group__6"


    // $ANTLR start "rule__For__Group__6__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3398:1: rule__For__Group__6__Impl : ( ( rule__For__ActionAssignment_6 ) ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3402:1: ( ( ( rule__For__ActionAssignment_6 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3403:1: ( ( rule__For__ActionAssignment_6 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3403:1: ( ( rule__For__ActionAssignment_6 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3404:1: ( rule__For__ActionAssignment_6 )
            {
             before(grammarAccess.getForAccess().getActionAssignment_6()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3405:1: ( rule__For__ActionAssignment_6 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3405:2: rule__For__ActionAssignment_6
            {
            pushFollow(FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl6903);
            rule__For__ActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getActionAssignment_6()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3415:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3419:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3420:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__76933);
            rule__For__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__For__Group__8_in_rule__For__Group__76936);
            rule__For__Group__8();

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
    // $ANTLR end "rule__For__Group__7"


    // $ANTLR start "rule__For__Group__7__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3427:1: rule__For__Group__7__Impl : ( ')' ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3431:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3432:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3432:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3433:1: ')'
            {
             before(grammarAccess.getForAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__For__Group__7__Impl6964); 
             after(grammarAccess.getForAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3446:1: rule__For__Group__8 : rule__For__Group__8__Impl ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3450:1: ( rule__For__Group__8__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3451:2: rule__For__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__86995);
            rule__For__Group__8__Impl();

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
    // $ANTLR end "rule__For__Group__8"


    // $ANTLR start "rule__For__Group__8__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3457:1: rule__For__Group__8__Impl : ( ( rule__For__BlAssignment_8 ) ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3461:1: ( ( ( rule__For__BlAssignment_8 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3462:1: ( ( rule__For__BlAssignment_8 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3462:1: ( ( rule__For__BlAssignment_8 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3463:1: ( rule__For__BlAssignment_8 )
            {
             before(grammarAccess.getForAccess().getBlAssignment_8()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3464:1: ( rule__For__BlAssignment_8 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3464:2: rule__For__BlAssignment_8
            {
            pushFollow(FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl7022);
            rule__For__BlAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getBlAssignment_8()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3492:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3496:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3497:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__07070);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__1_in_rule__While__Group__07073);
            rule__While__Group__1();

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
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3504:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3508:1: ( ( 'while' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3509:1: ( 'while' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3509:1: ( 'while' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3510:1: 'while'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__While__Group__0__Impl7101); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3523:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3527:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3528:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__17132);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__2_in_rule__While__Group__17135);
            rule__While__Group__2();

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
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3535:1: rule__While__Group__1__Impl : ( '(' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3539:1: ( ( '(' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3540:1: ( '(' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3540:1: ( '(' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3541:1: '('
            {
             before(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__While__Group__1__Impl7163); 
             after(grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3554:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3558:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3559:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__27194);
            rule__While__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__3_in_rule__While__Group__27197);
            rule__While__Group__3();

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
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3566:1: rule__While__Group__2__Impl : ( ( rule__While__ExAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3570:1: ( ( ( rule__While__ExAssignment_2 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3571:1: ( ( rule__While__ExAssignment_2 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3571:1: ( ( rule__While__ExAssignment_2 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3572:1: ( rule__While__ExAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getExAssignment_2()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3573:1: ( rule__While__ExAssignment_2 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3573:2: rule__While__ExAssignment_2
            {
            pushFollow(FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl7224);
            rule__While__ExAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getExAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3583:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3587:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3588:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__37254);
            rule__While__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__While__Group__4_in_rule__While__Group__37257);
            rule__While__Group__4();

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
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3595:1: rule__While__Group__3__Impl : ( ')' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3599:1: ( ( ')' ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3600:1: ( ')' )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3600:1: ( ')' )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3601:1: ')'
            {
             before(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__While__Group__3__Impl7285); 
             after(grammarAccess.getWhileAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3614:1: rule__While__Group__4 : rule__While__Group__4__Impl ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3618:1: ( rule__While__Group__4__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3619:2: rule__While__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__47316);
            rule__While__Group__4__Impl();

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
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3625:1: rule__While__Group__4__Impl : ( ( rule__While__BlAssignment_4 ) ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3629:1: ( ( ( rule__While__BlAssignment_4 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3630:1: ( ( rule__While__BlAssignment_4 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3630:1: ( ( rule__While__BlAssignment_4 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3631:1: ( rule__While__BlAssignment_4 )
            {
             before(grammarAccess.getWhileAccess().getBlAssignment_4()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3632:1: ( rule__While__BlAssignment_4 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3632:2: rule__While__BlAssignment_4
            {
            pushFollow(FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl7343);
            rule__While__BlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getBlAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3652:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3656:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3657:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__07383);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__07386);
            rule__Declaration__Group__1();

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
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3664:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__TypeAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3668:1: ( ( ( rule__Declaration__TypeAssignment_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3669:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3669:1: ( ( rule__Declaration__TypeAssignment_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3670:1: ( rule__Declaration__TypeAssignment_0 )
            {
             before(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3671:1: ( rule__Declaration__TypeAssignment_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3671:2: rule__Declaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl7413);
            rule__Declaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3681:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3685:1: ( rule__Declaration__Group__1__Impl )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3686:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__17443);
            rule__Declaration__Group__1__Impl();

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
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3692:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3696:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3697:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3697:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3698:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3699:1: ( rule__Declaration__NameAssignment_1 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3699:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl7470);
            rule__Declaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Script__NameAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3714:1: rule__Script__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Script__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3718:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3719:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3719:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3720:1: RULE_ID
            {
             before(grammarAccess.getScriptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Script__NameAssignment_17509); 
             after(grammarAccess.getScriptAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3729:1: rule__Script__RobottypesAssignment_3_0_1 : ( RULE_ID ) ;
    public final void rule__Script__RobottypesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3733:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3734:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3734:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3735:1: RULE_ID
            {
             before(grammarAccess.getScriptAccess().getRobottypesIDTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Script__RobottypesAssignment_3_0_17540); 
             after(grammarAccess.getScriptAccess().getRobottypesIDTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3744:1: rule__Script__RobotconfigsAssignment_3_0_3 : ( RULE_ID ) ;
    public final void rule__Script__RobotconfigsAssignment_3_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3748:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3749:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3749:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3750:1: RULE_ID
            {
             before(grammarAccess.getScriptAccess().getRobotconfigsIDTerminalRuleCall_3_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Script__RobotconfigsAssignment_3_0_37571); 
             after(grammarAccess.getScriptAccess().getRobotconfigsIDTerminalRuleCall_3_0_3_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3759:1: rule__Script__RobottypesAssignment_3_1_1_1 : ( RULE_ID ) ;
    public final void rule__Script__RobottypesAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3763:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3764:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3764:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3765:1: RULE_ID
            {
             before(grammarAccess.getScriptAccess().getRobottypesIDTerminalRuleCall_3_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Script__RobottypesAssignment_3_1_1_17602); 
             after(grammarAccess.getScriptAccess().getRobottypesIDTerminalRuleCall_3_1_1_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3774:1: rule__Script__RobotconfigsAssignment_3_1_1_3 : ( RULE_ID ) ;
    public final void rule__Script__RobotconfigsAssignment_3_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3778:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3779:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3779:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3780:1: RULE_ID
            {
             before(grammarAccess.getScriptAccess().getRobotconfigsIDTerminalRuleCall_3_1_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Script__RobotconfigsAssignment_3_1_1_37633); 
             after(grammarAccess.getScriptAccess().getRobotconfigsIDTerminalRuleCall_3_1_1_3_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3789:1: rule__Script__MethodsAssignment_6 : ( ruleUserMethod ) ;
    public final void rule__Script__MethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3793:1: ( ( ruleUserMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3794:1: ( ruleUserMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3794:1: ( ruleUserMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3795:1: ruleUserMethod
            {
             before(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_67664);
            ruleUserMethod();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_6_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3804:1: rule__MetaMethods__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MetaMethods__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3808:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3809:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3809:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3810:1: RULE_ID
            {
             before(grammarAccess.getMetaMethodsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MetaMethods__NameAssignment_17695); 
             after(grammarAccess.getMetaMethodsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3819:1: rule__MetaMethods__MethodsAssignment_3 : ( ruleMetaMethod ) ;
    public final void rule__MetaMethods__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3823:1: ( ( ruleMetaMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3824:1: ( ruleMetaMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3824:1: ( ruleMetaMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3825:1: ruleMetaMethod
            {
             before(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_37726);
            ruleMetaMethod();

            state._fsp--;

             after(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3834:1: rule__Block__ExsAssignment_2_0_0 : ( ruleSimpleExpression ) ;
    public final void rule__Block__ExsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3838:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3839:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3839:1: ( ruleSimpleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3840:1: ruleSimpleExpression
            {
             before(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_07757);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3849:1: rule__Block__ExsAssignment_2_1 : ( ruleStructureExpression ) ;
    public final void rule__Block__ExsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3853:1: ( ( ruleStructureExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3854:1: ( ruleStructureExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3854:1: ( ruleStructureExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3855:1: ruleStructureExpression
            {
             before(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_17788);
            ruleStructureExpression();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3864:1: rule__Assignment__VariAssignment_0 : ( ( rule__Assignment__VariAlternatives_0_0 ) ) ;
    public final void rule__Assignment__VariAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3868:1: ( ( ( rule__Assignment__VariAlternatives_0_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3869:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3869:1: ( ( rule__Assignment__VariAlternatives_0_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3870:1: ( rule__Assignment__VariAlternatives_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3871:1: ( rule__Assignment__VariAlternatives_0_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3871:2: rule__Assignment__VariAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_07819);
            rule__Assignment__VariAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getVariAlternatives_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3880:1: rule__Assignment__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3884:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3885:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3885:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3886:1: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_27852);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__Method__TypeAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3895:1: rule__Method__TypeAssignment_0 : ( ruleMethodtype ) ;
    public final void rule__Method__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3899:1: ( ( ruleMethodtype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3900:1: ( ruleMethodtype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3900:1: ( ruleMethodtype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3901:1: ruleMethodtype
            {
             before(grammarAccess.getMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMethodtype_in_rule__Method__TypeAssignment_07883);
            ruleMethodtype();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__TypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3910:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3914:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3915:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3915:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3916:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method__NameAssignment_17914); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParametersAssignment_3"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3925:1: rule__Method__ParametersAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Method__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3929:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3930:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3930:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3931:1: ruleDeclaration
            {
             before(grammarAccess.getMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Method__ParametersAssignment_37945);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_3"


    // $ANTLR start "rule__Method__ParametersAssignment_4_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3940:1: rule__Method__ParametersAssignment_4_1 : ( ruleDeclaration ) ;
    public final void rule__Method__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3944:1: ( ( ruleDeclaration ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3945:1: ( ruleDeclaration )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3945:1: ( ruleDeclaration )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3946:1: ruleDeclaration
            {
             before(grammarAccess.getMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Method__ParametersAssignment_4_17976);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_4_1"


    // $ANTLR start "rule__Call__NameAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3955:1: rule__Call__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Call__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3959:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3960:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3960:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3961:1: ( RULE_ID )
            {
             before(grammarAccess.getCallAccess().getNameMethodCrossReference_0_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3962:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3963:1: RULE_ID
            {
             before(grammarAccess.getCallAccess().getNameMethodIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Call__NameAssignment_08011); 
             after(grammarAccess.getCallAccess().getNameMethodIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCallAccess().getNameMethodCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__NameAssignment_0"


    // $ANTLR start "rule__Call__ParametersAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3974:1: rule__Call__ParametersAssignment_2 : ( ruleValue ) ;
    public final void rule__Call__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3978:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3979:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3979:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3980:1: ruleValue
            {
             before(grammarAccess.getCallAccess().getParametersValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_28046);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getCallAccess().getParametersValueParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3989:1: rule__Call__ParametersAssignment_3_1 : ( ruleValue ) ;
    public final void rule__Call__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3993:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3994:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3994:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:3995:1: ruleValue
            {
             before(grammarAccess.getCallAccess().getParametersValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_3_18077);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getCallAccess().getParametersValueParserRuleCall_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__UserMethod__MethodAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4004:1: rule__UserMethod__MethodAssignment_0 : ( ruleMethod ) ;
    public final void rule__UserMethod__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4008:1: ( ( ruleMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4009:1: ( ruleMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4009:1: ( ruleMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4010:1: ruleMethod
            {
             before(grammarAccess.getUserMethodAccess().getMethodMethodParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__UserMethod__MethodAssignment_08108);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getUserMethodAccess().getMethodMethodParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__MethodAssignment_0"


    // $ANTLR start "rule__UserMethod__BlAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4019:1: rule__UserMethod__BlAssignment_1 : ( ruleBlock ) ;
    public final void rule__UserMethod__BlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4023:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4024:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4024:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4025:1: ruleBlock
            {
             before(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_18139);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserMethod__BlAssignment_1"


    // $ANTLR start "rule__MetaMethod__MethodAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4034:1: rule__MetaMethod__MethodAssignment_0 : ( ruleMethod ) ;
    public final void rule__MetaMethod__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4038:1: ( ( ruleMethod ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4039:1: ( ruleMethod )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4039:1: ( ruleMethod )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4040:1: ruleMethod
            {
             before(grammarAccess.getMetaMethodAccess().getMethodMethodParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__MetaMethod__MethodAssignment_08170);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMetaMethodAccess().getMethodMethodParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaMethod__MethodAssignment_0"


    // $ANTLR start "rule__Comparison__VarleftAssignment_0"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4063:1: rule__Comparison__VarleftAssignment_0 : ( ruleValue ) ;
    public final void rule__Comparison__VarleftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4067:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4068:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4068:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4069:1: ruleValue
            {
             before(grammarAccess.getComparisonAccess().getVarleftValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Comparison__VarleftAssignment_08215);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getVarleftValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__VarleftAssignment_0"


    // $ANTLR start "rule__Comparison__OpAssignment_1"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4078:1: rule__Comparison__OpAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Comparison__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4082:1: ( ( ruleComparisonOperator ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4083:1: ( ruleComparisonOperator )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4083:1: ( ruleComparisonOperator )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4084:1: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonAccess().getOpComparisonOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__Comparison__OpAssignment_18246);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getOpComparisonOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1"


    // $ANTLR start "rule__Comparison__VarrightAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4093:1: rule__Comparison__VarrightAssignment_2 : ( ruleValue ) ;
    public final void rule__Comparison__VarrightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4097:1: ( ( ruleValue ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4098:1: ( ruleValue )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4098:1: ( ruleValue )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4099:1: ruleValue
            {
             before(grammarAccess.getComparisonAccess().getVarrightValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Comparison__VarrightAssignment_28277);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getVarrightValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__VarrightAssignment_2"


    // $ANTLR start "rule__If__ExAssignment_2"
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4108:1: rule__If__ExAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4112:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4113:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4113:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4114:1: ruleExpression
            {
             before(grammarAccess.getIfAccess().getExExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__If__ExAssignment_28308);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getExExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4123:1: rule__If__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__If__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4127:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4128:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4128:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4129:1: ruleBlock
            {
             before(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__If__BlAssignment_48339);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4138:1: rule__Else__ExAssignment_1 : ( ruleExpression ) ;
    public final void rule__Else__ExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4142:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4143:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4143:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4144:1: ruleExpression
            {
             before(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Else__ExAssignment_18370);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4153:1: rule__For__InitAssignment_2 : ( ruleExpression ) ;
    public final void rule__For__InitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4157:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4158:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4158:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4159:1: ruleExpression
            {
             before(grammarAccess.getForAccess().getInitExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__For__InitAssignment_28401);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForAccess().getInitExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4168:1: rule__For__CheckAssignment_4 : ( ruleExpression ) ;
    public final void rule__For__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4172:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4173:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4173:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4174:1: ruleExpression
            {
             before(grammarAccess.getForAccess().getCheckExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__For__CheckAssignment_48432);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForAccess().getCheckExpressionParserRuleCall_4_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4183:1: rule__For__ActionAssignment_6 : ( ruleExpression ) ;
    public final void rule__For__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4187:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4188:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4188:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4189:1: ruleExpression
            {
             before(grammarAccess.getForAccess().getActionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__For__ActionAssignment_68463);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForAccess().getActionExpressionParserRuleCall_6_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4198:1: rule__For__BlAssignment_8 : ( ruleBlock ) ;
    public final void rule__For__BlAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4202:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4203:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4203:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4204:1: ruleBlock
            {
             before(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__For__BlAssignment_88494);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4213:1: rule__While__ExAssignment_2 : ( ruleExpression ) ;
    public final void rule__While__ExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4217:1: ( ( ruleExpression ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4218:1: ( ruleExpression )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4218:1: ( ruleExpression )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4219:1: ruleExpression
            {
             before(grammarAccess.getWhileAccess().getExExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__While__ExAssignment_28525);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getExExpressionParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4228:1: rule__While__BlAssignment_4 : ( ruleBlock ) ;
    public final void rule__While__BlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4232:1: ( ( ruleBlock ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4233:1: ( ruleBlock )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4233:1: ( ruleBlock )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4234:1: ruleBlock
            {
             before(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__While__BlAssignment_48556);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4243:1: rule__BooleanValue__ValueAssignment : ( ( rule__BooleanValue__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4247:1: ( ( ( rule__BooleanValue__ValueAlternatives_0 ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4248:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4248:1: ( ( rule__BooleanValue__ValueAlternatives_0 ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4249:1: ( rule__BooleanValue__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4250:1: ( rule__BooleanValue__ValueAlternatives_0 )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4250:2: rule__BooleanValue__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment8587);
            rule__BooleanValue__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAlternatives_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4259:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4263:1: ( ( RULE_STRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4264:1: ( RULE_STRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4264:1: ( RULE_STRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4265:1: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment8620); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4274:1: rule__NumberValue__ValueAssignment : ( ruleINTSTRING ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4278:1: ( ( ruleINTSTRING ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4279:1: ( ruleINTSTRING )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4279:1: ( ruleINTSTRING )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4280:1: ruleINTSTRING
            {
             before(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment8651);
            ruleINTSTRING();

            state._fsp--;

             after(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4289:1: rule__VarReference__VariAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarReference__VariAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4293:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4294:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4294:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4295:1: ( RULE_ID )
            {
             before(grammarAccess.getVarReferenceAccess().getVariDeclarationCrossReference_0()); 
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4296:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4297:1: RULE_ID
            {
             before(grammarAccess.getVarReferenceAccess().getVariDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarReference__VariAssignment8686); 
             after(grammarAccess.getVarReferenceAccess().getVariDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVarReferenceAccess().getVariDeclarationCrossReference_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4308:1: rule__Declaration__TypeAssignment_0 : ( ruleDatatype ) ;
    public final void rule__Declaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4312:1: ( ( ruleDatatype ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4313:1: ( ruleDatatype )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4313:1: ( ruleDatatype )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4314:1: ruleDatatype
            {
             before(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_08721);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4323:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4327:1: ( ( RULE_ID ) )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4328:1: ( RULE_ID )
            {
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4328:1: ( RULE_ID )
            // ../org.xtext.commonlang.ui/src-gen/org/xtext/ui/contentassist/antlr/internal/InternalCommonlang.g:4329:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_18752); 
             after(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCLfile_in_entryRuleCLfile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLfile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLfile__Alternatives_in_ruleCLfile94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0_in_ruleScript154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethods188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__0_in_ruleMetaMethods214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureExpression__Alternatives_in_ruleStructureExpression394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_entryRuleUserMethod661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethod668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__0_in_ruleUserMethod694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethod728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__0_in_ruleMetaMethod754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0_in_ruleIf936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_entryRuleElse963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElse970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__0_in_ruleElse996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0_in_ruleFor1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0_in_ruleWhile1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_entryRuleBasicValue1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValue1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicValue__Alternatives_in_ruleBasicValue1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__ValueAssignment_in_ruleNumberValue1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_entryRuleVarReference1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReference1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarReference__VariAssignment_in_ruleVarReference1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_entryRuleMethodtype1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodtype1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodtype__Alternatives_in_ruleMethodtype1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Alternatives_in_ruleDatatype1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTSTRING1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTSTRING1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_rule__CLfile__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_rule__CLfile__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__0_in_rule__Script__Alternatives_31800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__0_in_rule__Script__Alternatives_31818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0_in_rule__Block__Alternatives_21851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_1_in_rule__Block__Alternatives_21869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__SimpleExpression__Alternatives1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__SimpleExpression__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__SimpleExpression__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__StructureExpression__Alternatives1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_rule__StructureExpression__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_rule__StructureExpression__Alternatives2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_rule__StructureExpression__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_rule__StructureExpression__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Expression__Alternatives2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Expression__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Assignment__VariAlternatives_0_02136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ComparisonOperator__Alternatives2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComparisonOperator__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_rule__Value__Alternatives2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_rule__Value__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__BasicValue__Alternatives2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__BasicValue__Alternatives2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__BasicValue__Alternatives2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanValue__ValueAlternatives_02420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanValue__ValueAlternatives_02440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Methodtype__Alternatives2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Methodtype__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Datatype__Alternatives2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Datatype__Alternatives2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Datatype__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__02599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Script__Group__0__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__12661 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__NameAssignment_1_in_rule__Script__Group__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__22721 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Script__Group__3_in_rule__Script__Group__22724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Script__Group__2__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__3__Impl_in_rule__Script__Group__32783 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Script__Group__4_in_rule__Script__Group__32786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Alternatives_3_in_rule__Script__Group__3__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__4__Impl_in_rule__Script__Group__42843 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Script__Group__5_in_rule__Script__Group__42846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Script__Group__4__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__5__Impl_in_rule__Script__Group__52905 = new BitSet(new long[]{0x0000000008780000L});
    public static final BitSet FOLLOW_rule__Script__Group__6_in_rule__Script__Group__52908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Script__Group__5__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__6__Impl_in_rule__Script__Group__62967 = new BitSet(new long[]{0x0000000008780000L});
    public static final BitSet FOLLOW_rule__Script__Group__7_in_rule__Script__Group__62970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__MethodsAssignment_6_in_rule__Script__Group__6__Impl2997 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_rule__Script__Group__7__Impl_in_rule__Script__Group__73028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Script__Group__7__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__0__Impl_in_rule__Script__Group_3_0__03103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__1_in_rule__Script__Group_3_0__03106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Script__Group_3_0__0__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__1__Impl_in_rule__Script__Group_3_0__13165 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__2_in_rule__Script__Group_3_0__13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_3_0_1_in_rule__Script__Group_3_0__1__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__2__Impl_in_rule__Script__Group_3_0__23225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__3_in_rule__Script__Group_3_0__23228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Script__Group_3_0__2__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_0__3__Impl_in_rule__Script__Group_3_0__33287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_3_0_3_in_rule__Script__Group_3_0__3__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__0__Impl_in_rule__Script__Group_3_1__03352 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__1_in_rule__Script__Group_3_1__03355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Script__Group_3_1__0__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1__1__Impl_in_rule__Script__Group_3_1__13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__0_in_rule__Script__Group_3_1__1__Impl3441 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__0__Impl_in_rule__Script__Group_3_1_1__03476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__1_in_rule__Script__Group_3_1_1__03479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Script__Group_3_1_1__0__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__1__Impl_in_rule__Script__Group_3_1_1__13538 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__2_in_rule__Script__Group_3_1_1__13541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobottypesAssignment_3_1_1_1_in_rule__Script__Group_3_1_1__1__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__2__Impl_in_rule__Script__Group_3_1_1__23598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__3_in_rule__Script__Group_3_1_1__23601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Script__Group_3_1_1__2__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__3__Impl_in_rule__Script__Group_3_1_1__33660 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__4_in_rule__Script__Group_3_1_1__33663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__RobotconfigsAssignment_3_1_1_3_in_rule__Script__Group_3_1_1__3__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group_3_1_1__4__Impl_in_rule__Script__Group_3_1_1__43720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Script__Group_3_1_1__4__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__0__Impl_in_rule__MetaMethods__Group__03789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1_in_rule__MetaMethods__Group__03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MetaMethods__Group__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__1__Impl_in_rule__MetaMethods__Group__13851 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2_in_rule__MetaMethods__Group__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__NameAssignment_1_in_rule__MetaMethods__Group__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__2__Impl_in_rule__MetaMethods__Group__23911 = new BitSet(new long[]{0x0000000008780000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3_in_rule__MetaMethods__Group__23914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MetaMethods__Group__2__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__3__Impl_in_rule__MetaMethods__Group__33973 = new BitSet(new long[]{0x0000000008780000L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4_in_rule__MetaMethods__Group__33976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethods__MethodsAssignment_3_in_rule__MetaMethods__Group__3__Impl4003 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_rule__MetaMethods__Group__4__Impl_in_rule__MetaMethods__Group__44034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MetaMethods__Group__4__Impl4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__04103 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__04106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__14164 = new BitSet(new long[]{0x0000001E0C7E0070L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Block__Group__1__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__24226 = new BitSet(new long[]{0x0000001E0C7E0070L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__24229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_2_in_rule__Block__Group__2__Impl4256 = new BitSet(new long[]{0x0000001E047E0072L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__34287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Block__Group__3__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__0__Impl_in_rule__Block__Group_2_0__04354 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1_in_rule__Block__Group_2_0__04357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ExsAssignment_2_0_0_in_rule__Block__Group_2_0__0__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2_0__1__Impl_in_rule__Block__Group_2_0__14414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Block__Group_2_0__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04477 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAssignment_0_in_rule__Assignment__Group__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14537 = new BitSet(new long[]{0x00000000007E0070L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Assignment__Group__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__04662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__04665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__TypeAssignment_0_in_rule__Method__Group__0__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__14722 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__14725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__24782 = new BitSet(new long[]{0x0000000022780000L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__24785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method__Group__2__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__34844 = new BitSet(new long[]{0x0000000022780000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__34847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_3_in_rule__Method__Group__3__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__44905 = new BitSet(new long[]{0x0000000022780000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__44908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl4935 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__54966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Method__Group__5__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__05037 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method__Group_4__0__Impl5071 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rule__Method__Group_4__0__Impl5087 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__15122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__ParametersAssignment_4_1_in_rule__Method__Group_4__1__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__05183 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__05186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__NameAssignment_0_in_rule__Call__Group__0__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__15243 = new BitSet(new long[]{0x00000000227E0070L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__15246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Call__Group__1__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__25305 = new BitSet(new long[]{0x00000000227E0070L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__25308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_2_in_rule__Call__Group__2__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__35366 = new BitSet(new long[]{0x00000000227E0070L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__35369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl5396 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__45427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Call__Group__4__Impl5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__05496 = new BitSet(new long[]{0x00000000007E0070L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__05499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Call__Group_3__0__Impl5530 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rule__Call__Group_3__0__Impl5546 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParametersAssignment_3_1_in_rule__Call__Group_3__1__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__0__Impl_in_rule__UserMethod__Group__05642 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1_in_rule__UserMethod__Group__05645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__MethodAssignment_0_in_rule__UserMethod__Group__0__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__Group__1__Impl_in_rule__UserMethod__Group__15702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserMethod__BlAssignment_1_in_rule__UserMethod__Group__1__Impl5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__0__Impl_in_rule__MetaMethod__Group__05763 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1_in_rule__MetaMethod__Group__05766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__MethodAssignment_0_in_rule__MetaMethod__Group__0__Impl5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaMethod__Group__1__Impl_in_rule__MetaMethod__Group__15823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MetaMethod__Group__1__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__05886 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__05889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__VarleftAssignment_0_in_rule__Comparison__Group__0__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__15946 = new BitSet(new long[]{0x00000000007E0070L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__15949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_in_rule__Comparison__Group__1__Impl5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__26006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__VarrightAssignment_2_in_rule__Comparison__Group__2__Impl6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__0__Impl_in_rule__If__Group__06069 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__If__Group__1_in_rule__If__Group__06072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__If__Group__0__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__1__Impl_in_rule__If__Group__16131 = new BitSet(new long[]{0x0000001E047E0070L});
    public static final BitSet FOLLOW_rule__If__Group__2_in_rule__If__Group__16134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__If__Group__1__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__2__Impl_in_rule__If__Group__26193 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__If__Group__3_in_rule__If__Group__26196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__ExAssignment_2_in_rule__If__Group__2__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__3__Impl_in_rule__If__Group__36253 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__If__Group__4_in_rule__If__Group__36256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__If__Group__3__Impl6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__Group__4__Impl_in_rule__If__Group__46315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If__BlAssignment_4_in_rule__If__Group__4__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__0__Impl_in_rule__Else__Group__06382 = new BitSet(new long[]{0x0000001E047E0070L});
    public static final BitSet FOLLOW_rule__Else__Group__1_in_rule__Else__Group__06385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Else__Group__0__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__Group__1__Impl_in_rule__Else__Group__16444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else__ExAssignment_1_in_rule__Else__Group__1__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__0__Impl_in_rule__For__Group__06505 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__For__Group__1_in_rule__For__Group__06508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__For__Group__0__Impl6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__1__Impl_in_rule__For__Group__16567 = new BitSet(new long[]{0x0000001E047E0070L});
    public static final BitSet FOLLOW_rule__For__Group__2_in_rule__For__Group__16570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__For__Group__1__Impl6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__2__Impl_in_rule__For__Group__26629 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__For__Group__3_in_rule__For__Group__26632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__InitAssignment_2_in_rule__For__Group__2__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__3__Impl_in_rule__For__Group__36689 = new BitSet(new long[]{0x0000001E047E0070L});
    public static final BitSet FOLLOW_rule__For__Group__4_in_rule__For__Group__36692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__3__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__4__Impl_in_rule__For__Group__46751 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__For__Group__5_in_rule__For__Group__46754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__CheckAssignment_4_in_rule__For__Group__4__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__5__Impl_in_rule__For__Group__56811 = new BitSet(new long[]{0x0000001E047E0070L});
    public static final BitSet FOLLOW_rule__For__Group__6_in_rule__For__Group__56814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__For__Group__5__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__6__Impl_in_rule__For__Group__66873 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__For__Group__7_in_rule__For__Group__66876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__ActionAssignment_6_in_rule__For__Group__6__Impl6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__7__Impl_in_rule__For__Group__76933 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__For__Group__8_in_rule__For__Group__76936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__For__Group__7__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__Group__8__Impl_in_rule__For__Group__86995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__For__BlAssignment_8_in_rule__For__Group__8__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__0__Impl_in_rule__While__Group__07070 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__While__Group__1_in_rule__While__Group__07073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__While__Group__0__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__1__Impl_in_rule__While__Group__17132 = new BitSet(new long[]{0x0000001E047E0070L});
    public static final BitSet FOLLOW_rule__While__Group__2_in_rule__While__Group__17135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__While__Group__1__Impl7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__2__Impl_in_rule__While__Group__27194 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__While__Group__3_in_rule__While__Group__27197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__ExAssignment_2_in_rule__While__Group__2__Impl7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__3__Impl_in_rule__While__Group__37254 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__While__Group__4_in_rule__While__Group__37257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__While__Group__3__Impl7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__Group__4__Impl_in_rule__While__Group__47316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While__BlAssignment_4_in_rule__While__Group__4__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__07383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__07386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TypeAssignment_0_in_rule__Declaration__Group__0__Impl7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__17443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Script__NameAssignment_17509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Script__RobottypesAssignment_3_0_17540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Script__RobotconfigsAssignment_3_0_37571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Script__RobottypesAssignment_3_1_1_17602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Script__RobotconfigsAssignment_3_1_1_37633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_rule__Script__MethodsAssignment_67664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MetaMethods__NameAssignment_17695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_rule__MetaMethods__MethodsAssignment_37726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__Block__ExsAssignment_2_0_07757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_rule__Block__ExsAssignment_2_17788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariAlternatives_0_0_in_rule__Assignment__VariAssignment_07819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Assignment__ValueAssignment_27852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_rule__Method__TypeAssignment_07883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method__NameAssignment_17914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Method__ParametersAssignment_37945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Method__ParametersAssignment_4_17976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Call__NameAssignment_08011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_28046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Call__ParametersAssignment_3_18077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__UserMethod__MethodAssignment_08108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__UserMethod__BlAssignment_18139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__MetaMethod__MethodAssignment_08170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Comparison__VarleftAssignment_08215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__Comparison__OpAssignment_18246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Comparison__VarrightAssignment_28277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__If__ExAssignment_28308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__If__BlAssignment_48339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Else__ExAssignment_18370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__For__InitAssignment_28401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__For__CheckAssignment_48432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__For__ActionAssignment_68463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__For__BlAssignment_88494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__While__ExAssignment_28525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__While__BlAssignment_48556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAlternatives_0_in_rule__BooleanValue__ValueAssignment8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_rule__NumberValue__ValueAssignment8651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarReference__VariAssignment8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Declaration__TypeAssignment_08721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_18752 = new BitSet(new long[]{0x0000000000000002L});

}