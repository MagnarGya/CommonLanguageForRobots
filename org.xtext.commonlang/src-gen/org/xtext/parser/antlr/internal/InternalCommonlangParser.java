package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.CommonlangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCommonlangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CAPITALFIRST", "RULE_LOWERFIRST", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'script'", "'targets'", "'('", "','", "')'", "'{'", "'}'", "'metamethodscollection'", "';'", "'='", "'meta'", "'-'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'!&&'", "'!||'", "'+'", "'*'", "'/'", "'++'", "'--'", "'if'", "'else'", "'for'", "'while'", "'true'", "'false'", "'return'", "'void'", "'int'", "'string'", "'boolean'"
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
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_CAPITALFIRST=4;
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g"; }



     	private CommonlangGrammarAccess grammarAccess;
     	
        public InternalCommonlangParser(TokenStream input, CommonlangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CLfile";	
       	}
       	
       	@Override
       	protected CommonlangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCLfile"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:67:1: entryRuleCLfile returns [EObject current=null] : iv_ruleCLfile= ruleCLfile EOF ;
    public final EObject entryRuleCLfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLfile = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:68:2: (iv_ruleCLfile= ruleCLfile EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:69:2: iv_ruleCLfile= ruleCLfile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCLfileRule()); 
            }
            pushFollow(FOLLOW_ruleCLfile_in_entryRuleCLfile75);
            iv_ruleCLfile=ruleCLfile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCLfile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLfile85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCLfile"


    // $ANTLR start "ruleCLfile"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:76:1: ruleCLfile returns [EObject current=null] : ( ( (lv_scripts_0_0= ruleScript ) )* ( (lv_mets_1_0= ruleMetaMethods ) ) ) ;
    public final EObject ruleCLfile() throws RecognitionException {
        EObject current = null;

        EObject lv_scripts_0_0 = null;

        EObject lv_mets_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:79:28: ( ( ( (lv_scripts_0_0= ruleScript ) )* ( (lv_mets_1_0= ruleMetaMethods ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:80:1: ( ( (lv_scripts_0_0= ruleScript ) )* ( (lv_mets_1_0= ruleMetaMethods ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:80:1: ( ( (lv_scripts_0_0= ruleScript ) )* ( (lv_mets_1_0= ruleMetaMethods ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:80:2: ( (lv_scripts_0_0= ruleScript ) )* ( (lv_mets_1_0= ruleMetaMethods ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:80:2: ( (lv_scripts_0_0= ruleScript ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:81:1: (lv_scripts_0_0= ruleScript )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:81:1: (lv_scripts_0_0= ruleScript )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:82:3: lv_scripts_0_0= ruleScript
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCLfileAccess().getScriptsScriptParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleScript_in_ruleCLfile131);
            	    lv_scripts_0_0=ruleScript();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCLfileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scripts",
            	              		lv_scripts_0_0, 
            	              		"Script");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:98:3: ( (lv_mets_1_0= ruleMetaMethods ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:99:1: (lv_mets_1_0= ruleMetaMethods )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:99:1: (lv_mets_1_0= ruleMetaMethods )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:100:3: lv_mets_1_0= ruleMetaMethods
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCLfileAccess().getMetsMetaMethodsParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMetaMethods_in_ruleCLfile153);
            lv_mets_1_0=ruleMetaMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCLfileRule());
              	        }
                     		set(
                     			current, 
                     			"mets",
                      		lv_mets_1_0, 
                      		"MetaMethods");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCLfile"


    // $ANTLR start "entryRuleScript"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:124:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:125:2: (iv_ruleScript= ruleScript EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:126:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript189);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:133:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' ( ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) ) ) otherlv_5= ',' ( ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) ) otherlv_11= ',' ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) ) otherlv_13= ')' )* otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_robottypes_4_1=null;
        Token lv_robottypes_4_2=null;
        Token otherlv_5=null;
        Token lv_robotconfigs_6_1=null;
        Token lv_robotconfigs_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_robottypes_10_1=null;
        Token lv_robottypes_10_2=null;
        Token otherlv_11=null;
        Token lv_robotconfigs_12_1=null;
        Token lv_robotconfigs_12_2=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_methods_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:136:28: ( (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' ( ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) ) ) otherlv_5= ',' ( ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) ) otherlv_11= ',' ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) ) otherlv_13= ')' )* otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' ( ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) ) ) otherlv_5= ',' ( ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) ) otherlv_11= ',' ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) ) otherlv_13= ')' )* otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' ( ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) ) ) otherlv_5= ',' ( ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) ) otherlv_11= ',' ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) ) otherlv_13= ')' )* otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:3: otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' ( ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) ) ) otherlv_5= ',' ( ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) ) otherlv_11= ',' ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) ) otherlv_13= ')' )* otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScript236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:141:1: ( (lv_name_1_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:142:1: (lv_name_1_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:142:1: (lv_name_1_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:143:3: lv_name_1_0= RULE_CAPITALFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getScriptAccess().getNameCAPITALFIRSTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScriptRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"CAPITALFIRST");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleScript270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getTargetsKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleScript282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:167:1: ( ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:168:1: ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:168:1: ( (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:169:1: (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:169:1: (lv_robottypes_4_1= RULE_LOWERFIRST | lv_robottypes_4_2= RULE_CAPITALFIRST )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LOWERFIRST) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_CAPITALFIRST) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:170:3: lv_robottypes_4_1= RULE_LOWERFIRST
                    {
                    lv_robottypes_4_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robottypes_4_1, grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_4_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robottypes",
                              		lv_robottypes_4_1, 
                              		"LOWERFIRST");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:185:8: lv_robottypes_4_2= RULE_CAPITALFIRST
                    {
                    lv_robottypes_4_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robottypes_4_2, grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_4_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robottypes",
                              		lv_robottypes_4_2, 
                              		"CAPITALFIRST");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleScript341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:207:1: ( ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:208:1: ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:208:1: ( (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:209:1: (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:209:1: (lv_robotconfigs_6_1= RULE_LOWERFIRST | lv_robotconfigs_6_2= RULE_CAPITALFIRST )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LOWERFIRST) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_CAPITALFIRST) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:210:3: lv_robotconfigs_6_1= RULE_LOWERFIRST
                    {
                    lv_robotconfigs_6_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robotconfigs_6_1, grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_6_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robotconfigs",
                              		lv_robotconfigs_6_1, 
                              		"LOWERFIRST");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:225:8: lv_robotconfigs_6_2= RULE_CAPITALFIRST
                    {
                    lv_robotconfigs_6_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robotconfigs_6_2, grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_6_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robotconfigs",
                              		lv_robotconfigs_6_2, 
                              		"CAPITALFIRST");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleScript400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getScriptAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:247:1: (otherlv_8= ',' otherlv_9= '(' ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) ) otherlv_11= ',' ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) ) otherlv_13= ')' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:247:3: otherlv_8= ',' otherlv_9= '(' ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) ) otherlv_11= ',' ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) ) otherlv_13= ')'
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleScript413); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getScriptAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleScript425); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getScriptAccess().getLeftParenthesisKeyword_8_1());
            	          
            	    }
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:255:1: ( ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:256:1: ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:256:1: ( (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:257:1: (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:257:1: (lv_robottypes_10_1= RULE_LOWERFIRST | lv_robottypes_10_2= RULE_CAPITALFIRST )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_LOWERFIRST) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==RULE_CAPITALFIRST) ) {
            	        alt4=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:258:3: lv_robottypes_10_1= RULE_LOWERFIRST
            	            {
            	            lv_robottypes_10_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript444); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robottypes_10_1, grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_8_2_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robottypes",
            	                      		lv_robottypes_10_1, 
            	                      		"LOWERFIRST");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:273:8: lv_robottypes_10_2= RULE_CAPITALFIRST
            	            {
            	            lv_robottypes_10_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript464); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robottypes_10_2, grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_8_2_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robottypes",
            	                      		lv_robottypes_10_2, 
            	                      		"CAPITALFIRST");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleScript484); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getScriptAccess().getCommaKeyword_8_3());
            	          
            	    }
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:295:1: ( ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:296:1: ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:296:1: ( (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:297:1: (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:297:1: (lv_robotconfigs_12_1= RULE_LOWERFIRST | lv_robotconfigs_12_2= RULE_CAPITALFIRST )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_LOWERFIRST) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==RULE_CAPITALFIRST) ) {
            	        alt5=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:298:3: lv_robotconfigs_12_1= RULE_LOWERFIRST
            	            {
            	            lv_robotconfigs_12_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript503); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robotconfigs_12_1, grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_8_4_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robotconfigs",
            	                      		lv_robotconfigs_12_1, 
            	                      		"LOWERFIRST");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:313:8: lv_robotconfigs_12_2= RULE_CAPITALFIRST
            	            {
            	            lv_robotconfigs_12_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript523); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robotconfigs_12_2, grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_8_4_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robotconfigs",
            	                      		lv_robotconfigs_12_2, 
            	                      		"CAPITALFIRST");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleScript543); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getScriptAccess().getRightParenthesisKeyword_8_5());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleScript557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_9());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:339:1: ( (lv_methods_15_0= ruleUserMethod ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=47 && LA7_0<=50)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:340:1: (lv_methods_15_0= ruleUserMethod )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:340:1: (lv_methods_15_0= ruleUserMethod )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:341:3: lv_methods_15_0= ruleUserMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUserMethod_in_ruleScript578);
            	    lv_methods_15_0=ruleUserMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methods",
            	              		lv_methods_15_0, 
            	              		"UserMethod");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleScript591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleMetaMethods"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:369:1: entryRuleMetaMethods returns [EObject current=null] : iv_ruleMetaMethods= ruleMetaMethods EOF ;
    public final EObject entryRuleMetaMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethods = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:370:2: (iv_ruleMetaMethods= ruleMetaMethods EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:371:2: iv_ruleMetaMethods= ruleMetaMethods EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaMethodsRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods627);
            iv_ruleMetaMethods=ruleMetaMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaMethods; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethods637); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaMethods"


    // $ANTLR start "ruleMetaMethods"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:378:1: ruleMetaMethods returns [EObject current=null] : ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetaMethods() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:381:28: ( ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:382:1: ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:382:1: ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:382:2: () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:382:2: ()
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:383:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMetaMethodsAccess().getMetaMethodsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMetaMethods683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMetaMethods695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:396:1: ( (lv_methods_3_0= ruleMetaMethod ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:397:1: (lv_methods_3_0= ruleMetaMethod )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:397:1: (lv_methods_3_0= ruleMetaMethod )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:398:3: lv_methods_3_0= ruleMetaMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetaMethod_in_ruleMetaMethods716);
            	    lv_methods_3_0=ruleMetaMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMetaMethodsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methods",
            	              		lv_methods_3_0, 
            	              		"MetaMethod");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMetaMethods729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMetaMethodsAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMetaMethods"


    // $ANTLR start "entryRuleBlock"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:426:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:427:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:428:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock765);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock775); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:435:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exs_2_0 = null;

        EObject lv_exs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:438:28: ( ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:439:1: ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:439:1: ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:439:2: () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:439:2: ()
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:440:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBlock821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:449:1: ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_CAPITALFIRST && LA9_0<=RULE_LOWERFIRST)||LA9_0==46||(LA9_0>=48 && LA9_0<=50)) ) {
                    alt9=1;
                }
                else if ( (LA9_0==18||LA9_0==40||(LA9_0>=42 && LA9_0<=43)) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:449:2: ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:449:2: ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:449:3: ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';'
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:449:3: ( (lv_exs_2_0= ruleSimpleExpression ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:450:1: (lv_exs_2_0= ruleSimpleExpression )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:450:1: (lv_exs_2_0= ruleSimpleExpression )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:451:3: lv_exs_2_0= ruleSimpleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleBlock844);
            	    lv_exs_2_0=ruleSimpleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exs",
            	              		lv_exs_2_0, 
            	              		"SimpleExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBlock856); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:472:6: ( (lv_exs_4_0= ruleStructureExpression ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:472:6: ( (lv_exs_4_0= ruleStructureExpression ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:473:1: (lv_exs_4_0= ruleStructureExpression )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:473:1: (lv_exs_4_0= ruleStructureExpression )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:474:3: lv_exs_4_0= ruleStructureExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructureExpression_in_ruleBlock884);
            	    lv_exs_4_0=ruleStructureExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exs",
            	              		lv_exs_4_0, 
            	              		"StructureExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBlock898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleSimpleExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:502:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:503:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:504:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression934);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression944); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:511:1: ruleSimpleExpression returns [EObject current=null] : (this_Crement_0= ruleCrement | this_Call_1= ruleCall | this_Assignment_2= ruleAssignment | this_Return_3= ruleReturn ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Crement_0 = null;

        EObject this_Call_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_Return_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:514:28: ( (this_Crement_0= ruleCrement | this_Call_1= ruleCall | this_Assignment_2= ruleAssignment | this_Return_3= ruleReturn ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:515:1: (this_Crement_0= ruleCrement | this_Call_1= ruleCall | this_Assignment_2= ruleAssignment | this_Return_3= ruleReturn )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:515:1: (this_Crement_0= ruleCrement | this_Call_1= ruleCall | this_Assignment_2= ruleAssignment | this_Return_3= ruleReturn )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt10=2;
                    }
                    break;
                case 22:
                case 24:
                case 35:
                case 36:
                case 37:
                    {
                    alt10=3;
                    }
                    break;
                case 38:
                case 39:
                    {
                    alt10=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt10=2;
                }
                break;
            case 48:
            case 49:
            case 50:
                {
                alt10=3;
                }
                break;
            case 46:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:516:5: this_Crement_0= ruleCrement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getCrementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCrement_in_ruleSimpleExpression991);
                    this_Crement_0=ruleCrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Crement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:526:5: this_Call_1= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleSimpleExpression1018);
                    this_Call_1=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Call_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:536:5: this_Assignment_2= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleSimpleExpression1045);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:546:5: this_Return_3= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleSimpleExpression1072);
                    this_Return_3=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Return_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleStructureExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:562:1: entryRuleStructureExpression returns [EObject current=null] : iv_ruleStructureExpression= ruleStructureExpression EOF ;
    public final EObject entryRuleStructureExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:563:2: (iv_ruleStructureExpression= ruleStructureExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:564:2: iv_ruleStructureExpression= ruleStructureExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructureExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1107);
            iv_ruleStructureExpression=ruleStructureExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructureExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression1117); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructureExpression"


    // $ANTLR start "ruleStructureExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:571:1: ruleStructureExpression returns [EObject current=null] : (this_Block_0= ruleBlock | this_If_1= ruleIf | this_For_2= ruleFor | this_While_3= ruleWhile ) ;
    public final EObject ruleStructureExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_If_1 = null;

        EObject this_For_2 = null;

        EObject this_While_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:574:28: ( (this_Block_0= ruleBlock | this_If_1= ruleIf | this_For_2= ruleFor | this_While_3= ruleWhile ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:575:1: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_For_2= ruleFor | this_While_3= ruleWhile )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:575:1: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_For_2= ruleFor | this_While_3= ruleWhile )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 40:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:576:5: this_Block_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleStructureExpression1164);
                    this_Block_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:586:5: this_If_1= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleStructureExpression1191);
                    this_If_1=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_If_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:596:5: this_For_2= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleStructureExpression1218);
                    this_For_2=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_For_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:606:5: this_While_3= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleStructureExpression1245);
                    this_While_3=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_While_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStructureExpression"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:622:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:623:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:624:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1280);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1290); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:631:1: ruleExpression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpression_0 = null;

        EObject this_StructureExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:634:28: ( (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:635:1: (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:635:1: (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_CAPITALFIRST && LA12_0<=RULE_LOWERFIRST)||LA12_0==46||(LA12_0>=48 && LA12_0<=50)) ) {
                alt12=1;
            }
            else if ( (LA12_0==18||LA12_0==40||(LA12_0>=42 && LA12_0<=43)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:636:5: this_SimpleExpression_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression1337);
                    this_SimpleExpression_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:646:5: this_StructureExpression_1= ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_ruleExpression1364);
                    this_StructureExpression_1=ruleStructureExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructureExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:662:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:663:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:664:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1399);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1409); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:671:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) ) ) ( ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )? otherlv_2= '=' ( (lv_value_3_0= ruleValueExpression ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_vari_0_1 = null;

        EObject lv_vari_0_2 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:674:28: ( ( ( ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) ) ) ( ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )? otherlv_2= '=' ( (lv_value_3_0= ruleValueExpression ) ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:675:1: ( ( ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) ) ) ( ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )? otherlv_2= '=' ( (lv_value_3_0= ruleValueExpression ) ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:675:1: ( ( ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) ) ) ( ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )? otherlv_2= '=' ( (lv_value_3_0= ruleValueExpression ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:675:2: ( ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) ) ) ( ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )? otherlv_2= '=' ( (lv_value_3_0= ruleValueExpression ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:675:2: ( ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:676:1: ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:676:1: ( (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:677:1: (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:677:1: (lv_vari_0_1= ruleVarReference | lv_vari_0_2= ruleDeclaration )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LOWERFIRST) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=48 && LA13_0<=50)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:678:3: lv_vari_0_1= ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariVarReferenceParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_ruleAssignment1457);
                    lv_vari_0_1=ruleVarReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"vari",
                              		lv_vari_0_1, 
                              		"VarReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:693:8: lv_vari_0_2= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleAssignment1476);
                    lv_vari_0_2=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"vari",
                              		lv_vari_0_2, 
                              		"Declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:711:2: ( ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )? otherlv_2= '=' ( (lv_value_3_0= ruleValueExpression ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:711:3: ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )? otherlv_2= '=' ( (lv_value_3_0= ruleValueExpression ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:711:3: ( ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) && (synpred1_InternalCommonlang())) {
                alt14=1;
            }
            else if ( (LA14_0==24) && (synpred1_InternalCommonlang())) {
                alt14=1;
            }
            else if ( (LA14_0==36) && (synpred1_InternalCommonlang())) {
                alt14=1;
            }
            else if ( (LA14_0==37) && (synpred1_InternalCommonlang())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:711:4: ( ( ruleMathOperator ) )=> (lv_op_1_0= ruleMathOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:716:1: (lv_op_1_0= ruleMathOperator )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:717:3: lv_op_1_0= ruleMathOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getOpMathOperatorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMathOperator_in_ruleAssignment1511);
                    lv_op_1_0=ruleMathOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"MathOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:737:1: ( (lv_value_3_0= ruleValueExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:738:1: (lv_value_3_0= ruleValueExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:738:1: (lv_value_3_0= ruleValueExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:739:3: lv_value_3_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueExpressionParserRuleCall_1_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleAssignment1545);
            lv_value_3_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"ValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleCall"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:763:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:764:2: (iv_ruleCall= ruleCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:765:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1582);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1592); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:772:1: ruleCall returns [EObject current=null] : ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValueExpression ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValueExpression ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UserMethodCall_0 = null;

        EObject this_MetaMethodCall_1 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:775:28: ( ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValueExpression ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValueExpression ) ) )* otherlv_6= ')' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:776:1: ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValueExpression ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValueExpression ) ) )* otherlv_6= ')' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:776:1: ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValueExpression ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValueExpression ) ) )* otherlv_6= ')' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:776:2: (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValueExpression ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValueExpression ) ) )* otherlv_6= ')'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:776:2: (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LOWERFIRST) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_CAPITALFIRST) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:777:5: this_UserMethodCall_0= ruleUserMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallAccess().getUserMethodCallParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUserMethodCall_in_ruleCall1640);
                    this_UserMethodCall_0=ruleUserMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UserMethodCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:787:5: this_MetaMethodCall_1= ruleMetaMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallAccess().getMetaMethodCallParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMetaMethodCall_in_ruleCall1667);
                    this_MetaMethodCall_1=ruleMetaMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MetaMethodCall_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCall1679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:799:1: ( (lv_parameters_3_0= ruleValueExpression ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_CAPITALFIRST && LA16_0<=RULE_INT)||LA16_0==15||LA16_0==24||(LA16_0>=44 && LA16_0<=45)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:800:1: (lv_parameters_3_0= ruleValueExpression )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:800:1: (lv_parameters_3_0= ruleValueExpression )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:801:3: lv_parameters_3_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleCall1700);
                    lv_parameters_3_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"ValueExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:817:3: ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValueExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:817:4: (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValueExpression ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:817:4: (otherlv_4= ',' )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==16) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:817:6: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCall1715); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getCallAccess().getCommaKeyword_3_0());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:821:3: ( (lv_parameters_5_0= ruleValueExpression ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:822:1: (lv_parameters_5_0= ruleValueExpression )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:822:1: (lv_parameters_5_0= ruleValueExpression )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:823:3: lv_parameters_5_0= ruleValueExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCallAccess().getParametersValueExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueExpression_in_ruleCall1738);
            	    lv_parameters_5_0=ruleValueExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCallRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_5_0, 
            	              		"ValueExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleCall1752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCallAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleMetaMethod"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:853:1: entryRuleMetaMethod returns [EObject current=null] : iv_ruleMetaMethod= ruleMetaMethod EOF ;
    public final EObject entryRuleMetaMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethod = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:854:2: (iv_ruleMetaMethod= ruleMetaMethod EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:855:2: iv_ruleMetaMethod= ruleMetaMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod1790);
            iv_ruleMetaMethod=ruleMetaMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethod1800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaMethod"


    // $ANTLR start "ruleMetaMethod"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:862:1: ruleMetaMethod returns [EObject current=null] : (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleMetaMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:865:28: ( (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:866:1: (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:866:1: (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:866:3: otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMetaMethod1837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMetaMethodAccess().getMetaKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:870:1: ( (lv_type_1_0= ruleMethodtype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:871:1: (lv_type_1_0= ruleMethodtype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:871:1: (lv_type_1_0= ruleMethodtype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:872:3: lv_type_1_0= ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaMethodAccess().getTypeMethodtypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodtype_in_ruleMetaMethod1858);
            lv_type_1_0=ruleMethodtype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetaMethodRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"Methodtype");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:888:2: ( (lv_name_2_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:889:1: (lv_name_2_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:889:1: (lv_name_2_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:890:3: lv_name_2_0= RULE_CAPITALFIRST
            {
            lv_name_2_0=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethod1875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMetaMethodAccess().getNameCAPITALFIRSTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMetaMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"CAPITALFIRST");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetaMethod1892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMetaMethodAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:910:1: ( (lv_parameters_4_0= ruleDeclaration ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=48 && LA19_0<=50)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:911:1: (lv_parameters_4_0= ruleDeclaration )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:911:1: (lv_parameters_4_0= ruleDeclaration )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:912:3: lv_parameters_4_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleMetaMethod1913);
                    lv_parameters_4_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"Declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:928:3: ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:928:4: (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:928:4: (otherlv_5= ',' )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==16) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:928:6: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMetaMethod1928); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_5, grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt20 >= 1 ) break loop20;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(20, input);
            	                throw eee;
            	        }
            	        cnt20++;
            	    } while (true);

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:932:3: ( (lv_parameters_6_0= ruleDeclaration ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:933:1: (lv_parameters_6_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:933:1: (lv_parameters_6_0= ruleDeclaration )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:934:3: lv_parameters_6_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleMetaMethod1951);
            	    lv_parameters_6_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMetaMethodRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_6_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMetaMethod1965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMetaMethodAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleMetaMethod1977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMetaMethodAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMetaMethod"


    // $ANTLR start "entryRuleUserMethod"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:966:1: entryRuleUserMethod returns [EObject current=null] : iv_ruleUserMethod= ruleUserMethod EOF ;
    public final EObject entryRuleUserMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserMethod = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:967:2: (iv_ruleUserMethod= ruleUserMethod EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:968:2: iv_ruleUserMethod= ruleUserMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserMethodRule()); 
            }
            pushFollow(FOLLOW_ruleUserMethod_in_entryRuleUserMethod2013);
            iv_ruleUserMethod=ruleUserMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUserMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethod2023); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUserMethod"


    // $ANTLR start "ruleUserMethod"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:975:1: ruleUserMethod returns [EObject current=null] : ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) ) ;
    public final EObject ruleUserMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_bl_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:978:28: ( ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:979:1: ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:979:1: ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:979:2: ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:979:2: ( (lv_type_0_0= ruleMethodtype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:980:1: (lv_type_0_0= ruleMethodtype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:980:1: (lv_type_0_0= ruleMethodtype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:981:3: lv_type_0_0= ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodtype_in_ruleUserMethod2069);
            lv_type_0_0=ruleMethodtype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUserMethodRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Methodtype");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:997:2: ( (lv_name_1_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:998:1: (lv_name_1_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:998:1: (lv_name_1_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:999:3: lv_name_1_0= RULE_LOWERFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleUserMethod2086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getUserMethodAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUserMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LOWERFIRST");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUserMethod2103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUserMethodAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1019:1: ( (lv_parameters_3_0= ruleDeclaration ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=48 && LA22_0<=50)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1020:1: (lv_parameters_3_0= ruleDeclaration )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1020:1: (lv_parameters_3_0= ruleDeclaration )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1021:3: lv_parameters_3_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleUserMethod2124);
                    lv_parameters_3_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUserMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1037:3: ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1037:4: (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1037:4: (otherlv_4= ',' )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==16) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1037:6: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleUserMethod2139); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getUserMethodAccess().getCommaKeyword_4_0());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt23 >= 1 ) break loop23;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1041:3: ( (lv_parameters_5_0= ruleDeclaration ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1042:1: (lv_parameters_5_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1042:1: (lv_parameters_5_0= ruleDeclaration )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1043:3: lv_parameters_5_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleUserMethod2162);
            	    lv_parameters_5_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUserMethodRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_5_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleUserMethod2176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getUserMethodAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1063:1: ( (lv_bl_7_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1064:1: (lv_bl_7_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1064:1: (lv_bl_7_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1065:3: lv_bl_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleUserMethod2197);
            lv_bl_7_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUserMethodRule());
              	        }
                     		set(
                     			current, 
                     			"bl",
                      		lv_bl_7_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUserMethod"


    // $ANTLR start "entryRuleUserMethodCall"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1089:1: entryRuleUserMethodCall returns [EObject current=null] : iv_ruleUserMethodCall= ruleUserMethodCall EOF ;
    public final EObject entryRuleUserMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserMethodCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1090:2: (iv_ruleUserMethodCall= ruleUserMethodCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1091:2: iv_ruleUserMethodCall= ruleUserMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall2233);
            iv_ruleUserMethodCall=ruleUserMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUserMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethodCall2243); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUserMethodCall"


    // $ANTLR start "ruleUserMethodCall"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1098:1: ruleUserMethodCall returns [EObject current=null] : ( (otherlv_0= RULE_LOWERFIRST ) ) ;
    public final EObject ruleUserMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1101:28: ( ( (otherlv_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1102:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1102:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1103:1: (otherlv_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1103:1: (otherlv_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1104:3: otherlv_0= RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUserMethodCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleUserMethodCall2287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUserMethodCallAccess().getMethodMethodCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUserMethodCall"


    // $ANTLR start "entryRuleMetaMethodCall"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1123:1: entryRuleMetaMethodCall returns [EObject current=null] : iv_ruleMetaMethodCall= ruleMetaMethodCall EOF ;
    public final EObject entryRuleMetaMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethodCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1124:2: (iv_ruleMetaMethodCall= ruleMetaMethodCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1125:2: iv_ruleMetaMethodCall= ruleMetaMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall2322);
            iv_ruleMetaMethodCall=ruleMetaMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethodCall2332); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaMethodCall"


    // $ANTLR start "ruleMetaMethodCall"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1132:1: ruleMetaMethodCall returns [EObject current=null] : ( (otherlv_0= RULE_CAPITALFIRST ) ) ;
    public final EObject ruleMetaMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1135:28: ( ( (otherlv_0= RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1136:1: ( (otherlv_0= RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1136:1: ( (otherlv_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1137:1: (otherlv_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1137:1: (otherlv_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1138:3: otherlv_0= RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMetaMethodCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethodCall2376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getMetaMethodCallAccess().getMethodMethodCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMetaMethodCall"


    // $ANTLR start "entryRuleValueExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1157:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1158:2: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1159:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression2411);
            iv_ruleValueExpression=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression2421); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueExpression"


    // $ANTLR start "ruleValueExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1166:1: ruleValueExpression returns [EObject current=null] : (this_ParanValueExpression_0= ruleParanValueExpression | this_BasicValueExpression_1= ruleBasicValueExpression | this_NegNumberValue_2= ruleNegNumberValue ) ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParanValueExpression_0 = null;

        EObject this_BasicValueExpression_1 = null;

        EObject this_NegNumberValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1169:28: ( (this_ParanValueExpression_0= ruleParanValueExpression | this_BasicValueExpression_1= ruleBasicValueExpression | this_NegNumberValue_2= ruleNegNumberValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1170:1: (this_ParanValueExpression_0= ruleParanValueExpression | this_BasicValueExpression_1= ruleBasicValueExpression | this_NegNumberValue_2= ruleNegNumberValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1170:1: (this_ParanValueExpression_0= ruleParanValueExpression | this_BasicValueExpression_1= ruleBasicValueExpression | this_NegNumberValue_2= ruleNegNumberValue )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt25=1;
                }
                break;
            case RULE_CAPITALFIRST:
            case RULE_LOWERFIRST:
            case RULE_STRING:
            case RULE_INT:
            case 44:
            case 45:
                {
                alt25=2;
                }
                break;
            case 24:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1171:5: this_ParanValueExpression_0= ruleParanValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionAccess().getParanValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanValueExpression_in_ruleValueExpression2468);
                    this_ParanValueExpression_0=ruleParanValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParanValueExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1181:5: this_BasicValueExpression_1= ruleBasicValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionAccess().getBasicValueExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicValueExpression_in_ruleValueExpression2495);
                    this_BasicValueExpression_1=ruleBasicValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicValueExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1191:5: this_NegNumberValue_2= ruleNegNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionAccess().getNegNumberValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegNumberValue_in_ruleValueExpression2522);
                    this_NegNumberValue_2=ruleNegNumberValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NegNumberValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValueExpression"


    // $ANTLR start "entryRuleNegNumberValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1207:1: entryRuleNegNumberValue returns [EObject current=null] : iv_ruleNegNumberValue= ruleNegNumberValue EOF ;
    public final EObject entryRuleNegNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegNumberValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1208:2: (iv_ruleNegNumberValue= ruleNegNumberValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1209:2: iv_ruleNegNumberValue= ruleNegNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNegNumberValue_in_entryRuleNegNumberValue2557);
            iv_ruleNegNumberValue=ruleNegNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegNumberValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegNumberValue2567); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegNumberValue"


    // $ANTLR start "ruleNegNumberValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1216:1: ruleNegNumberValue returns [EObject current=null] : (otherlv_0= '-' ( (lv_varleft_1_0= ruleValue ) ) ( ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) ) ( (lv_varright_3_0= ruleValueExpression ) ) )? ) ;
    public final EObject ruleNegNumberValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_varleft_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_1 = null;

        AntlrDatatypeRuleToken lv_op_2_2 = null;

        AntlrDatatypeRuleToken lv_op_2_3 = null;

        EObject lv_varright_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1219:28: ( (otherlv_0= '-' ( (lv_varleft_1_0= ruleValue ) ) ( ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) ) ( (lv_varright_3_0= ruleValueExpression ) ) )? ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1220:1: (otherlv_0= '-' ( (lv_varleft_1_0= ruleValue ) ) ( ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) ) ( (lv_varright_3_0= ruleValueExpression ) ) )? )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1220:1: (otherlv_0= '-' ( (lv_varleft_1_0= ruleValue ) ) ( ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) ) ( (lv_varright_3_0= ruleValueExpression ) ) )? )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1220:3: otherlv_0= '-' ( (lv_varleft_1_0= ruleValue ) ) ( ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) ) ( (lv_varright_3_0= ruleValueExpression ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleNegNumberValue2604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNegNumberValueAccess().getHyphenMinusKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1224:1: ( (lv_varleft_1_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1225:1: (lv_varleft_1_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1225:1: (lv_varleft_1_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1226:3: lv_varleft_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegNumberValueAccess().getVarleftValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleNegNumberValue2625);
            lv_varleft_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegNumberValueRule());
              	        }
                     		set(
                     			current, 
                     			"varleft",
                      		lv_varleft_1_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1242:2: ( ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) ) ( (lv_varright_3_0= ruleValueExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=24 && LA27_0<=37)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1242:3: ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) ) ( (lv_varright_3_0= ruleValueExpression ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1242:3: ( ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1243:1: ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1243:1: ( (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1244:1: (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1244:1: (lv_op_2_1= ruleMathOperator | lv_op_2_2= ruleBooleanOperator | lv_op_2_3= ruleComparisonOperator )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case 24:
                    case 35:
                    case 36:
                    case 37:
                        {
                        alt26=1;
                        }
                        break;
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        {
                        alt26=2;
                        }
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1245:3: lv_op_2_1= ruleMathOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNegNumberValueAccess().getOpMathOperatorParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMathOperator_in_ruleNegNumberValue2649);
                            lv_op_2_1=ruleMathOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNegNumberValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_2_1, 
                                      		"MathOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1260:8: lv_op_2_2= ruleBooleanOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNegNumberValueAccess().getOpBooleanOperatorParserRuleCall_2_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanOperator_in_ruleNegNumberValue2668);
                            lv_op_2_2=ruleBooleanOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNegNumberValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_2_2, 
                                      		"BooleanOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1275:8: lv_op_2_3= ruleComparisonOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNegNumberValueAccess().getOpComparisonOperatorParserRuleCall_2_0_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleNegNumberValue2687);
                            lv_op_2_3=ruleComparisonOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNegNumberValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_2_3, 
                                      		"ComparisonOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1293:2: ( (lv_varright_3_0= ruleValueExpression ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1294:1: (lv_varright_3_0= ruleValueExpression )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1294:1: (lv_varright_3_0= ruleValueExpression )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1295:3: lv_varright_3_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegNumberValueAccess().getVarrightValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleNegNumberValue2711);
                    lv_varright_3_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegNumberValueRule());
                      	        }
                             		set(
                             			current, 
                             			"varright",
                              		lv_varright_3_0, 
                              		"ValueExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNegNumberValue"


    // $ANTLR start "entryRuleParanValueExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1319:1: entryRuleParanValueExpression returns [EObject current=null] : iv_ruleParanValueExpression= ruleParanValueExpression EOF ;
    public final EObject entryRuleParanValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanValueExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1320:2: (iv_ruleParanValueExpression= ruleParanValueExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1321:2: iv_ruleParanValueExpression= ruleParanValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParanValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanValueExpression_in_entryRuleParanValueExpression2749);
            iv_ruleParanValueExpression=ruleParanValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParanValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanValueExpression2759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParanValueExpression"


    // $ANTLR start "ruleParanValueExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1328:1: ruleParanValueExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_ex_1_0= ruleValueExpression ) ) otherlv_2= ')' ( ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) ) ( (lv_varright_4_0= ruleValueExpression ) ) )? ) ;
    public final EObject ruleParanValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ex_1_0 = null;

        AntlrDatatypeRuleToken lv_op_3_1 = null;

        AntlrDatatypeRuleToken lv_op_3_2 = null;

        AntlrDatatypeRuleToken lv_op_3_3 = null;

        EObject lv_varright_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1331:28: ( (otherlv_0= '(' ( (lv_ex_1_0= ruleValueExpression ) ) otherlv_2= ')' ( ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) ) ( (lv_varright_4_0= ruleValueExpression ) ) )? ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1332:1: (otherlv_0= '(' ( (lv_ex_1_0= ruleValueExpression ) ) otherlv_2= ')' ( ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) ) ( (lv_varright_4_0= ruleValueExpression ) ) )? )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1332:1: (otherlv_0= '(' ( (lv_ex_1_0= ruleValueExpression ) ) otherlv_2= ')' ( ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) ) ( (lv_varright_4_0= ruleValueExpression ) ) )? )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1332:3: otherlv_0= '(' ( (lv_ex_1_0= ruleValueExpression ) ) otherlv_2= ')' ( ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) ) ( (lv_varright_4_0= ruleValueExpression ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleParanValueExpression2796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParanValueExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1336:1: ( (lv_ex_1_0= ruleValueExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1337:1: (lv_ex_1_0= ruleValueExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1337:1: (lv_ex_1_0= ruleValueExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1338:3: lv_ex_1_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParanValueExpressionAccess().getExValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleParanValueExpression2817);
            lv_ex_1_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParanValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_1_0, 
                      		"ValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleParanValueExpression2829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParanValueExpressionAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1358:1: ( ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) ) ( (lv_varright_4_0= ruleValueExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=24 && LA29_0<=37)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1358:2: ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) ) ( (lv_varright_4_0= ruleValueExpression ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1358:2: ( ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1359:1: ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1359:1: ( (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1360:1: (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1360:1: (lv_op_3_1= ruleMathOperator | lv_op_3_2= ruleBooleanOperator | lv_op_3_3= ruleComparisonOperator )
                    int alt28=3;
                    switch ( input.LA(1) ) {
                    case 24:
                    case 35:
                    case 36:
                    case 37:
                        {
                        alt28=1;
                        }
                        break;
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        {
                        alt28=2;
                        }
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        {
                        alt28=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1361:3: lv_op_3_1= ruleMathOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParanValueExpressionAccess().getOpMathOperatorParserRuleCall_3_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMathOperator_in_ruleParanValueExpression2853);
                            lv_op_3_1=ruleMathOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getParanValueExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_1, 
                                      		"MathOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1376:8: lv_op_3_2= ruleBooleanOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParanValueExpressionAccess().getOpBooleanOperatorParserRuleCall_3_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanOperator_in_ruleParanValueExpression2872);
                            lv_op_3_2=ruleBooleanOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getParanValueExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_2, 
                                      		"BooleanOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1391:8: lv_op_3_3= ruleComparisonOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getParanValueExpressionAccess().getOpComparisonOperatorParserRuleCall_3_0_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleParanValueExpression2891);
                            lv_op_3_3=ruleComparisonOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getParanValueExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_3_3, 
                                      		"ComparisonOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1409:2: ( (lv_varright_4_0= ruleValueExpression ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1410:1: (lv_varright_4_0= ruleValueExpression )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1410:1: (lv_varright_4_0= ruleValueExpression )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1411:3: lv_varright_4_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParanValueExpressionAccess().getVarrightValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleParanValueExpression2915);
                    lv_varright_4_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParanValueExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"varright",
                              		lv_varright_4_0, 
                              		"ValueExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParanValueExpression"


    // $ANTLR start "entryRuleBasicValueExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1435:1: entryRuleBasicValueExpression returns [EObject current=null] : iv_ruleBasicValueExpression= ruleBasicValueExpression EOF ;
    public final EObject entryRuleBasicValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicValueExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1436:2: (iv_ruleBasicValueExpression= ruleBasicValueExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1437:2: iv_ruleBasicValueExpression= ruleBasicValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBasicValueExpression_in_entryRuleBasicValueExpression2953);
            iv_ruleBasicValueExpression=ruleBasicValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValueExpression2963); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicValueExpression"


    // $ANTLR start "ruleBasicValueExpression"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1444:1: ruleBasicValueExpression returns [EObject current=null] : ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) ) ( (lv_varright_2_0= ruleValueExpression ) ) )? ) ;
    public final EObject ruleBasicValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_varleft_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_1 = null;

        AntlrDatatypeRuleToken lv_op_1_2 = null;

        AntlrDatatypeRuleToken lv_op_1_3 = null;

        EObject lv_varright_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1447:28: ( ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) ) ( (lv_varright_2_0= ruleValueExpression ) ) )? ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1448:1: ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) ) ( (lv_varright_2_0= ruleValueExpression ) ) )? )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1448:1: ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) ) ( (lv_varright_2_0= ruleValueExpression ) ) )? )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1448:2: ( (lv_varleft_0_0= ruleValue ) ) ( ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) ) ( (lv_varright_2_0= ruleValueExpression ) ) )?
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1448:2: ( (lv_varleft_0_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1449:1: (lv_varleft_0_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1449:1: (lv_varleft_0_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1450:3: lv_varleft_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicValueExpressionAccess().getVarleftValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBasicValueExpression3009);
            lv_varleft_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"varleft",
                      		lv_varleft_0_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1466:2: ( ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) ) ( (lv_varright_2_0= ruleValueExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=24 && LA31_0<=37)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1466:3: ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) ) ( (lv_varright_2_0= ruleValueExpression ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1466:3: ( ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1467:1: ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1467:1: ( (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1468:1: (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1468:1: (lv_op_1_1= ruleMathOperator | lv_op_1_2= ruleBooleanOperator | lv_op_1_3= ruleComparisonOperator )
                    int alt30=3;
                    switch ( input.LA(1) ) {
                    case 24:
                    case 35:
                    case 36:
                    case 37:
                        {
                        alt30=1;
                        }
                        break;
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        {
                        alt30=2;
                        }
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        {
                        alt30=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1469:3: lv_op_1_1= ruleMathOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBasicValueExpressionAccess().getOpMathOperatorParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMathOperator_in_ruleBasicValueExpression3033);
                            lv_op_1_1=ruleMathOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBasicValueExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_1_1, 
                                      		"MathOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1484:8: lv_op_1_2= ruleBooleanOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBasicValueExpressionAccess().getOpBooleanOperatorParserRuleCall_1_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanOperator_in_ruleBasicValueExpression3052);
                            lv_op_1_2=ruleBooleanOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBasicValueExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_1_2, 
                                      		"BooleanOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1499:8: lv_op_1_3= ruleComparisonOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBasicValueExpressionAccess().getOpComparisonOperatorParserRuleCall_1_0_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleBasicValueExpression3071);
                            lv_op_1_3=ruleComparisonOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBasicValueExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_1_3, 
                                      		"ComparisonOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1517:2: ( (lv_varright_2_0= ruleValueExpression ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1518:1: (lv_varright_2_0= ruleValueExpression )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1518:1: (lv_varright_2_0= ruleValueExpression )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1519:3: lv_varright_2_0= ruleValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasicValueExpressionAccess().getVarrightValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleBasicValueExpression3095);
                    lv_varright_2_0=ruleValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasicValueExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"varright",
                              		lv_varright_2_0, 
                              		"ValueExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicValueExpression"


    // $ANTLR start "entryRuleCrement"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1543:1: entryRuleCrement returns [EObject current=null] : iv_ruleCrement= ruleCrement EOF ;
    public final EObject entryRuleCrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrement = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1544:2: (iv_ruleCrement= ruleCrement EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1545:2: iv_ruleCrement= ruleCrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCrementRule()); 
            }
            pushFollow(FOLLOW_ruleCrement_in_entryRuleCrement3133);
            iv_ruleCrement=ruleCrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCrement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrement3143); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCrement"


    // $ANTLR start "ruleCrement"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1552:1: ruleCrement returns [EObject current=null] : ( ( (lv_value_0_0= ruleVarReference ) ) ( (lv_op_1_0= ruleCrementOperator ) ) ) ;
    public final EObject ruleCrement() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1555:28: ( ( ( (lv_value_0_0= ruleVarReference ) ) ( (lv_op_1_0= ruleCrementOperator ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1556:1: ( ( (lv_value_0_0= ruleVarReference ) ) ( (lv_op_1_0= ruleCrementOperator ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1556:1: ( ( (lv_value_0_0= ruleVarReference ) ) ( (lv_op_1_0= ruleCrementOperator ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1556:2: ( (lv_value_0_0= ruleVarReference ) ) ( (lv_op_1_0= ruleCrementOperator ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1556:2: ( (lv_value_0_0= ruleVarReference ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1557:1: (lv_value_0_0= ruleVarReference )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1557:1: (lv_value_0_0= ruleVarReference )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1558:3: lv_value_0_0= ruleVarReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCrementAccess().getValueVarReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarReference_in_ruleCrement3189);
            lv_value_0_0=ruleVarReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCrementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"VarReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1574:2: ( (lv_op_1_0= ruleCrementOperator ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1575:1: (lv_op_1_0= ruleCrementOperator )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1575:1: (lv_op_1_0= ruleCrementOperator )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1576:3: lv_op_1_0= ruleCrementOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCrementAccess().getOpCrementOperatorParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCrementOperator_in_ruleCrement3210);
            lv_op_1_0=ruleCrementOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCrementRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_1_0, 
                      		"CrementOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCrement"


    // $ANTLR start "entryRuleComparisonOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1600:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1601:2: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1602:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator3247);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator3258); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1609:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1612:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1613:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1613:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt32=1;
                }
                break;
            case 26:
                {
                alt32=2;
                }
                break;
            case 27:
                {
                alt32=3;
                }
                break;
            case 28:
                {
                alt32=4;
                }
                break;
            case 29:
                {
                alt32=5;
                }
                break;
            case 30:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1614:2: kw= '=='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleComparisonOperator3296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1621:2: kw= '!='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleComparisonOperator3315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1628:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleComparisonOperator3334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1635:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleComparisonOperator3353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1642:2: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleComparisonOperator3372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1649:2: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleComparisonOperator3391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleBooleanOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1662:1: entryRuleBooleanOperator returns [String current=null] : iv_ruleBooleanOperator= ruleBooleanOperator EOF ;
    public final String entryRuleBooleanOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1663:2: (iv_ruleBooleanOperator= ruleBooleanOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1664:2: iv_ruleBooleanOperator= ruleBooleanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator3432);
            iv_ruleBooleanOperator=ruleBooleanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator3443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanOperator"


    // $ANTLR start "ruleBooleanOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1671:1: ruleBooleanOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1674:28: ( (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1675:1: (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1675:1: (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt33=1;
                }
                break;
            case 32:
                {
                alt33=2;
                }
                break;
            case 33:
                {
                alt33=3;
                }
                break;
            case 34:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1676:2: kw= '&&'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleBooleanOperator3481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1683:2: kw= '||'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBooleanOperator3500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1690:2: kw= '!&&'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBooleanOperator3519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1697:2: kw= '!||'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleBooleanOperator3538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getExclamationMarkVerticalLineVerticalLineKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "entryRuleMathOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1710:1: entryRuleMathOperator returns [String current=null] : iv_ruleMathOperator= ruleMathOperator EOF ;
    public final String entryRuleMathOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1711:2: (iv_ruleMathOperator= ruleMathOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1712:2: iv_ruleMathOperator= ruleMathOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMathOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMathOperator_in_entryRuleMathOperator3579);
            iv_ruleMathOperator=ruleMathOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMathOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperator3590); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMathOperator"


    // $ANTLR start "ruleMathOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1719:1: ruleMathOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleMathOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1722:28: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1723:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1723:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt34=1;
                }
                break;
            case 24:
                {
                alt34=2;
                }
                break;
            case 36:
                {
                alt34=3;
                }
                break;
            case 37:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1724:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleMathOperator3628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1731:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleMathOperator3647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1738:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleMathOperator3666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMathOperatorAccess().getAsteriskKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1745:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleMathOperator3685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMathOperatorAccess().getSolidusKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "entryRuleCrementOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1758:1: entryRuleCrementOperator returns [String current=null] : iv_ruleCrementOperator= ruleCrementOperator EOF ;
    public final String entryRuleCrementOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCrementOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1759:2: (iv_ruleCrementOperator= ruleCrementOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1760:2: iv_ruleCrementOperator= ruleCrementOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCrementOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCrementOperator_in_entryRuleCrementOperator3726);
            iv_ruleCrementOperator=ruleCrementOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCrementOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrementOperator3737); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCrementOperator"


    // $ANTLR start "ruleCrementOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1767:1: ruleCrementOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleCrementOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1770:28: ( (kw= '++' | kw= '--' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1771:1: (kw= '++' | kw= '--' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1771:1: (kw= '++' | kw= '--' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            else if ( (LA35_0==39) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1772:2: kw= '++'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCrementOperator3775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCrementOperatorAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1779:2: kw= '--'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleCrementOperator3794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCrementOperatorAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCrementOperator"


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1792:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1793:2: (iv_ruleIf= ruleIf EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1794:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf3834);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf3844); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1801:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ( (lv_el_5_0= ruleElse ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ex_2_0 = null;

        EObject lv_bl_4_0 = null;

        EObject lv_el_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1804:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ( (lv_el_5_0= ruleElse ) )? ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1805:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ( (lv_el_5_0= ruleElse ) )? )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1805:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ( (lv_el_5_0= ruleElse ) )? )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1805:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ( (lv_el_5_0= ruleElse ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleIf3881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleIf3893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1813:1: ( (lv_ex_2_0= ruleValueExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1814:1: (lv_ex_2_0= ruleValueExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1814:1: (lv_ex_2_0= ruleValueExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1815:3: lv_ex_2_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getExValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleIf3914);
            lv_ex_2_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_2_0, 
                      		"ValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleIf3926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1835:1: ( (lv_bl_4_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1836:1: (lv_bl_4_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1836:1: (lv_bl_4_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1837:3: lv_bl_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleIf3947);
            lv_bl_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"bl",
                      		lv_bl_4_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1853:2: ( (lv_el_5_0= ruleElse ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1854:1: (lv_el_5_0= ruleElse )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1854:1: (lv_el_5_0= ruleElse )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1855:3: lv_el_5_0= ruleElse
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfAccess().getElElseParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElse_in_ruleIf3968);
                    lv_el_5_0=ruleElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfRule());
                      	        }
                             		set(
                             			current, 
                             			"el",
                              		lv_el_5_0, 
                              		"Else");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleElse"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1879:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1880:2: (iv_ruleElse= ruleElse EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1881:2: iv_ruleElse= ruleElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseRule()); 
            }
            pushFollow(FOLLOW_ruleElse_in_entryRuleElse4005);
            iv_ruleElse=ruleElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElse; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElse4015); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1888:1: ruleElse returns [EObject current=null] : (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1891:28: ( (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1892:1: (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1892:1: (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1892:3: otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleElse4052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseAccess().getElseKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1896:1: ( (lv_ex_1_0= ruleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1897:1: (lv_ex_1_0= ruleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1897:1: (lv_ex_1_0= ruleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1898:3: lv_ex_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleElse4073);
            lv_ex_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleFor"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1922:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1923:2: (iv_ruleFor= ruleFor EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1924:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor4109);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor4119); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1931:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleValueExpression ) ) otherlv_5= ';' ( (lv_action_6_0= ruleSimpleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_init_2_0 = null;

        EObject lv_check_4_0 = null;

        EObject lv_action_6_0 = null;

        EObject lv_bl_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1934:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleValueExpression ) ) otherlv_5= ';' ( (lv_action_6_0= ruleSimpleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1935:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleValueExpression ) ) otherlv_5= ';' ( (lv_action_6_0= ruleSimpleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1935:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleValueExpression ) ) otherlv_5= ';' ( (lv_action_6_0= ruleSimpleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1935:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleValueExpression ) ) otherlv_5= ';' ( (lv_action_6_0= ruleSimpleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFor4156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFor4168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1943:1: ( (lv_init_2_0= ruleSimpleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1944:1: (lv_init_2_0= ruleSimpleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1944:1: (lv_init_2_0= ruleSimpleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1945:3: lv_init_2_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getInitSimpleExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_ruleFor4189);
            lv_init_2_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"init",
                      		lv_init_2_0, 
                      		"SimpleExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFor4201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1965:1: ( (lv_check_4_0= ruleValueExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1966:1: (lv_check_4_0= ruleValueExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1966:1: (lv_check_4_0= ruleValueExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1967:3: lv_check_4_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getCheckValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleFor4222);
            lv_check_4_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"check",
                      		lv_check_4_0, 
                      		"ValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFor4234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1987:1: ( (lv_action_6_0= ruleSimpleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1988:1: (lv_action_6_0= ruleSimpleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1988:1: (lv_action_6_0= ruleSimpleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1989:3: lv_action_6_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getActionSimpleExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_ruleFor4255);
            lv_action_6_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"action",
                      		lv_action_6_0, 
                      		"SimpleExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleFor4267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2009:1: ( (lv_bl_8_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2010:1: (lv_bl_8_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2010:1: (lv_bl_8_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2011:3: lv_bl_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFor4288);
            lv_bl_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"bl",
                      		lv_bl_8_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2035:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2036:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2037:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile4324);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile4334); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2044:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ex_2_0 = null;

        EObject lv_bl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2047:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2048:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2048:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2048:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleValueExpression ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleWhile4371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleWhile4383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2056:1: ( (lv_ex_2_0= ruleValueExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2057:1: (lv_ex_2_0= ruleValueExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2057:1: (lv_ex_2_0= ruleValueExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2058:3: lv_ex_2_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getExValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleWhile4404);
            lv_ex_2_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_2_0, 
                      		"ValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleWhile4416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2078:1: ( (lv_bl_4_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2079:1: (lv_bl_4_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2079:1: (lv_bl_4_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2080:3: lv_bl_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleWhile4437);
            lv_bl_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"bl",
                      		lv_bl_4_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2104:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2105:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2106:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4473);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4483); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2113:1: ruleValue returns [EObject current=null] : (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;

        EObject this_VarReference_1 = null;

        EObject this_BasicValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2116:28: ( (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2117:1: (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2117:1: (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==EOF||(LA37_1>=RULE_CAPITALFIRST && LA37_1<=RULE_LOWERFIRST)||(LA37_1>=16 && LA37_1<=19)||LA37_1==21||(LA37_1>=24 && LA37_1<=37)||LA37_1==40||(LA37_1>=42 && LA37_1<=43)||LA37_1==46||(LA37_1>=48 && LA37_1<=50)) ) {
                    alt37=2;
                }
                else if ( (LA37_1==15) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt37=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 44:
            case 45:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2118:5: this_Call_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleValue4530);
                    this_Call_0=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Call_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2128:5: this_VarReference_1= ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_ruleValue4557);
                    this_VarReference_1=ruleVarReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2138:5: this_BasicValue_2= ruleBasicValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBasicValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicValue_in_ruleValue4584);
                    this_BasicValue_2=ruleBasicValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleBasicValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2154:1: entryRuleBasicValue returns [EObject current=null] : iv_ruleBasicValue= ruleBasicValue EOF ;
    public final EObject entryRuleBasicValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2155:2: (iv_ruleBasicValue= ruleBasicValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2156:2: iv_ruleBasicValue= ruleBasicValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicValueRule()); 
            }
            pushFollow(FOLLOW_ruleBasicValue_in_entryRuleBasicValue4619);
            iv_ruleBasicValue=ruleBasicValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValue4629); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicValue"


    // $ANTLR start "ruleBasicValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2163:1: ruleBasicValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleBasicValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_StringValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2166:28: ( (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2167:1: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2167:1: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 44:
            case 45:
                {
                alt38=1;
                }
                break;
            case RULE_INT:
                {
                alt38=2;
                }
                break;
            case RULE_STRING:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2168:5: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleBasicValue4676);
                    this_BooleanValue_0=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2178:5: this_NumberValue_1= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_ruleBasicValue4703);
                    this_NumberValue_1=ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2188:5: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleBasicValue4730);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2204:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2205:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2206:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4765);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue4775); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2213:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2216:28: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2217:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2217:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2218:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2218:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2219:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2219:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            else if ( (LA39_0==45) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2220:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,44,FOLLOW_44_in_ruleBooleanValue4819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_1, grammarAccess.getBooleanValueAccess().getValueTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanValueRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2232:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,45,FOLLOW_45_in_ruleBooleanValue4848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getBooleanValueAccess().getValueFalseKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanValueRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2255:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2256:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2257:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue4899);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue4909); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2264:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2267:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2268:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2268:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2269:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2269:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2270:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue4950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumberValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2294:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2295:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2296:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue4990);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue5000); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2303:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleINTSTRING ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2306:28: ( ( (lv_value_0_0= ruleINTSTRING ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2307:1: ( (lv_value_0_0= ruleINTSTRING ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2307:1: ( (lv_value_0_0= ruleINTSTRING ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2308:1: (lv_value_0_0= ruleINTSTRING )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2308:1: (lv_value_0_0= ruleINTSTRING )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2309:3: lv_value_0_0= ruleINTSTRING
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_ruleNumberValue5045);
            lv_value_0_0=ruleINTSTRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INTSTRING");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleVarReference"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2333:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2334:2: (iv_ruleVarReference= ruleVarReference EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2335:2: iv_ruleVarReference= ruleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_entryRuleVarReference5080);
            iv_ruleVarReference=ruleVarReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReference5090); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarReference"


    // $ANTLR start "ruleVarReference"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2342:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_LOWERFIRST ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2345:28: ( ( (otherlv_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2346:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2346:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2347:1: (otherlv_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2347:1: (otherlv_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2348:3: otherlv_0= RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleVarReference5134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVarReferenceAccess().getVariDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarReference"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2367:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2368:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2369:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration5169);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration5179); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2376:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2379:28: ( ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2380:1: ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2380:1: ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2380:2: ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2380:2: ( (lv_type_0_0= ruleDatatype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2381:1: (lv_type_0_0= ruleDatatype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2381:1: (lv_type_0_0= ruleDatatype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2382:3: lv_type_0_0= ruleDatatype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDatatype_in_ruleDeclaration5225);
            lv_type_0_0=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Datatype");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2398:2: ( (lv_name_1_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2399:1: (lv_name_1_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2399:1: (lv_name_1_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2400:3: lv_name_1_0= RULE_LOWERFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleDeclaration5242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDeclarationAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LOWERFIRST");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleReturn"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2424:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2425:2: (iv_ruleReturn= ruleReturn EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2426:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn5283);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn5293); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2433:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_value_1_0= ruleValueExpression ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2436:28: ( (otherlv_0= 'return' ( (lv_value_1_0= ruleValueExpression ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2437:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleValueExpression ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2437:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleValueExpression ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2437:3: otherlv_0= 'return' ( (lv_value_1_0= ruleValueExpression ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleReturn5330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2441:1: ( (lv_value_1_0= ruleValueExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2442:1: (lv_value_1_0= ruleValueExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2442:1: (lv_value_1_0= ruleValueExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2443:3: lv_value_1_0= ruleValueExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getValueValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleReturn5351);
            lv_value_1_0=ruleValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"ValueExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleMethodtype"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2467:1: entryRuleMethodtype returns [String current=null] : iv_ruleMethodtype= ruleMethodtype EOF ;
    public final String entryRuleMethodtype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodtype = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2468:2: (iv_ruleMethodtype= ruleMethodtype EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2469:2: iv_ruleMethodtype= ruleMethodtype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodtypeRule()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_entryRuleMethodtype5388);
            iv_ruleMethodtype=ruleMethodtype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodtype.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodtype5399); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodtype"


    // $ANTLR start "ruleMethodtype"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2476:1: ruleMethodtype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | this_Datatype_1= ruleDatatype ) ;
    public final AntlrDatatypeRuleToken ruleMethodtype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Datatype_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2479:28: ( (kw= 'void' | this_Datatype_1= ruleDatatype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2480:1: (kw= 'void' | this_Datatype_1= ruleDatatype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2480:1: (kw= 'void' | this_Datatype_1= ruleDatatype )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=48 && LA40_0<=50)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2481:2: kw= 'void'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleMethodtype5437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2488:5: this_Datatype_1= ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_ruleMethodtype5465);
                    this_Datatype_1=ruleDatatype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Datatype_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethodtype"


    // $ANTLR start "entryRuleDatatype"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2506:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2507:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2508:2: iv_ruleDatatype= ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype5511);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatype.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype5522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2515:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2518:28: ( (kw= 'int' | kw= 'string' | kw= 'boolean' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2519:1: (kw= 'int' | kw= 'string' | kw= 'boolean' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2519:1: (kw= 'int' | kw= 'string' | kw= 'boolean' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt41=1;
                }
                break;
            case 49:
                {
                alt41=2;
                }
                break;
            case 50:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2520:2: kw= 'int'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleDatatype5560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2527:2: kw= 'string'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDatatype5579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2534:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDatatype5598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDatatypeAccess().getBooleanKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleINTSTRING"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2547:1: entryRuleINTSTRING returns [String current=null] : iv_ruleINTSTRING= ruleINTSTRING EOF ;
    public final String entryRuleINTSTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTSTRING = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2548:2: (iv_ruleINTSTRING= ruleINTSTRING EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2549:2: iv_ruleINTSTRING= ruleINTSTRING EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTSTRINGRule()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING5639);
            iv_ruleINTSTRING=ruleINTSTRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTSTRING.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTSTRING5650); if (state.failed) return current;

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
    // $ANTLR end "entryRuleINTSTRING"


    // $ANTLR start "ruleINTSTRING"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2556:1: ruleINTSTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleINTSTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2559:28: (this_INT_0= RULE_INT )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2560:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTSTRING5689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getINTSTRINGAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleINTSTRING"

    // $ANTLR start synpred1_InternalCommonlang
    public final void synpred1_InternalCommonlang_fragment() throws RecognitionException {   
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:711:4: ( ( ruleMathOperator ) )
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:712:1: ( ruleMathOperator )
        {
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:712:1: ( ruleMathOperator )
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:713:1: ruleMathOperator
        {
        pushFollow(FOLLOW_ruleMathOperator_in_synpred1_InternalCommonlang1494);
        ruleMathOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCommonlang

    // Delegated rules

    public final boolean synpred1_InternalCommonlang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCommonlang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleCLfile_in_entryRuleCLfile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLfile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_ruleCLfile131 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_ruleCLfile153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScript236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript253 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScript270 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleScript282 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript301 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript321 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScript341 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript360 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript380 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleScript400 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleScript413 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleScript425 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript444 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript464 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScript484 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript503 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript523 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleScript543 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleScript557 = new BitSet(new long[]{0x0007800000080000L});
    public static final BitSet FOLLOW_ruleUserMethod_in_ruleScript578 = new BitSet(new long[]{0x0007800000080000L});
    public static final BitSet FOLLOW_19_in_ruleScript591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethods637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMetaMethods683 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetaMethods695 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_ruleMetaMethods716 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_19_in_ruleMetaMethods729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBlock821 = new BitSet(new long[]{0x0007CD00000C0030L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleBlock844 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBlock856 = new BitSet(new long[]{0x0007CD00000C0030L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleBlock884 = new BitSet(new long[]{0x0007CD00000C0030L});
    public static final BitSet FOLLOW_19_in_ruleBlock898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrement_in_ruleSimpleExpression991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleSimpleExpression1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleSimpleExpression1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleSimpleExpression1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStructureExpression1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleStructureExpression1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleStructureExpression1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleStructureExpression1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleExpression1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_ruleAssignment1457 = new BitSet(new long[]{0x0000003801400000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleAssignment1476 = new BitSet(new long[]{0x0000003801400000L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleAssignment1511 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1524 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleAssignment1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_ruleCall1640 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_ruleCall1667 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCall1679 = new BitSet(new long[]{0x00003000010380F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCall1700 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCall1715 = new BitSet(new long[]{0x00003000010180F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCall1738 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleCall1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethod1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMetaMethod1837 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleMethodtype_in_ruleMetaMethod1858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethod1875 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaMethod1892 = new BitSet(new long[]{0x0007800000030020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMetaMethod1913 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMetaMethod1928 = new BitSet(new long[]{0x0007800000010020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMetaMethod1951 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMetaMethod1965 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMetaMethod1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_entryRuleUserMethod2013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethod2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_ruleUserMethod2069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleUserMethod2086 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUserMethod2103 = new BitSet(new long[]{0x0007800000030020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleUserMethod2124 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleUserMethod2139 = new BitSet(new long[]{0x0007800000010020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleUserMethod2162 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleUserMethod2176 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleUserMethod2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall2233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethodCall2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleUserMethodCall2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethodCall2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethodCall2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression2411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanValueExpression_in_ruleValueExpression2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValueExpression_in_ruleValueExpression2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegNumberValue_in_ruleValueExpression2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegNumberValue_in_entryRuleNegNumberValue2557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegNumberValue2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNegNumberValue2604 = new BitSet(new long[]{0x00003000000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNegNumberValue2625 = new BitSet(new long[]{0x0000003FFF000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleNegNumberValue2649 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleNegNumberValue2668 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleNegNumberValue2687 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleNegNumberValue2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanValueExpression_in_entryRuleParanValueExpression2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanValueExpression2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleParanValueExpression2796 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleParanValueExpression2817 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParanValueExpression2829 = new BitSet(new long[]{0x0000003FFF000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleParanValueExpression2853 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleParanValueExpression2872 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleParanValueExpression2891 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleParanValueExpression2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValueExpression_in_entryRuleBasicValueExpression2953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValueExpression2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBasicValueExpression3009 = new BitSet(new long[]{0x0000003FFF000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleBasicValueExpression3033 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleBasicValueExpression3052 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleBasicValueExpression3071 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleBasicValueExpression3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrement_in_entryRuleCrement3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrement3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_ruleCrement3189 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleCrementOperator_in_ruleCrement3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator3247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComparisonOperator3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComparisonOperator3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComparisonOperator3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComparisonOperator3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleComparisonOperator3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleComparisonOperator3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator3432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBooleanOperator3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBooleanOperator3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBooleanOperator3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBooleanOperator3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_entryRuleMathOperator3579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperator3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMathOperator3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMathOperator3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMathOperator3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMathOperator3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrementOperator_in_entryRuleCrementOperator3726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrementOperator3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCrementOperator3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCrementOperator3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleIf3881 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIf3893 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleIf3914 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIf3926 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIf3947 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleElse_in_ruleIf3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_entryRuleElse4005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElse4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleElse4052 = new BitSet(new long[]{0x0007CD0000040030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElse4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor4109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFor4156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFor4168 = new BitSet(new long[]{0x0007C00000000030L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleFor4189 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFor4201 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleFor4222 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFor4234 = new BitSet(new long[]{0x0007C00000000030L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleFor4255 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFor4267 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFor4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile4324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWhile4371 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWhile4383 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleWhile4404 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhile4416 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleWhile4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleValue4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_ruleValue4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_ruleValue4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_entryRuleBasicValue4619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValue4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleBasicValue4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleBasicValue4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleBasicValue4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBooleanValue4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBooleanValue4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue4899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue4990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_ruleNumberValue5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_entryRuleVarReference5080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReference5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleVarReference5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration5169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleDeclaration5225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleDeclaration5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn5283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReturn5330 = new BitSet(new long[]{0x00003000010080F0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleReturn5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_entryRuleMethodtype5388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodtype5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMethodtype5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleMethodtype5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype5511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDatatype5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDatatype5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDatatype5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING5639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTSTRING5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTSTRING5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_synpred1_InternalCommonlang1494 = new BitSet(new long[]{0x0000000000000002L});

}