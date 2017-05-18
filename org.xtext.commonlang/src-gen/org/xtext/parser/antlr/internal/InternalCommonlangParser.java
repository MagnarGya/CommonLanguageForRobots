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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CAPITALFIRST", "RULE_LOWERFIRST", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'script'", "'targets'", "'('", "','", "')'", "'{'", "'}'", "'metamethodscollection'", "';'", "'='", "'meta'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'!&&'", "'!||'", "'if'", "'else'", "'for'", "'while'", "'true'", "'false'", "'return'", "'void'", "'int'", "'string'", "'boolean'"
    };
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:133:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' otherlv_4= '(' ( ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) ) ) otherlv_6= ',' ( ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) ) otherlv_12= ',' ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) ) otherlv_14= ')' )* otherlv_15= ')' otherlv_16= '{' ( (lv_methods_17_0= ruleUserMethod ) )* otherlv_18= '}' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_robottypes_5_1=null;
        Token lv_robottypes_5_2=null;
        Token otherlv_6=null;
        Token lv_robotconfigs_7_1=null;
        Token lv_robotconfigs_7_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_robottypes_11_1=null;
        Token lv_robottypes_11_2=null;
        Token otherlv_12=null;
        Token lv_robotconfigs_13_1=null;
        Token lv_robotconfigs_13_2=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_methods_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:136:28: ( (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' otherlv_4= '(' ( ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) ) ) otherlv_6= ',' ( ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) ) otherlv_12= ',' ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) ) otherlv_14= ')' )* otherlv_15= ')' otherlv_16= '{' ( (lv_methods_17_0= ruleUserMethod ) )* otherlv_18= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' otherlv_4= '(' ( ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) ) ) otherlv_6= ',' ( ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) ) otherlv_12= ',' ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) ) otherlv_14= ')' )* otherlv_15= ')' otherlv_16= '{' ( (lv_methods_17_0= ruleUserMethod ) )* otherlv_18= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' otherlv_4= '(' ( ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) ) ) otherlv_6= ',' ( ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) ) otherlv_12= ',' ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) ) otherlv_14= ')' )* otherlv_15= ')' otherlv_16= '{' ( (lv_methods_17_0= ruleUserMethod ) )* otherlv_18= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:3: otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' otherlv_3= '(' otherlv_4= '(' ( ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) ) ) otherlv_6= ',' ( ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) ) ) otherlv_8= ')' (otherlv_9= ',' otherlv_10= '(' ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) ) otherlv_12= ',' ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) ) otherlv_14= ')' )* otherlv_15= ')' otherlv_16= '{' ( (lv_methods_17_0= ruleUserMethod ) )* otherlv_18= '}'
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
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleScript294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getScriptAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:171:1: ( ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:172:1: ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:172:1: ( (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:173:1: (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:173:1: (lv_robottypes_5_1= RULE_LOWERFIRST | lv_robottypes_5_2= RULE_CAPITALFIRST )
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:174:3: lv_robottypes_5_1= RULE_LOWERFIRST
                    {
                    lv_robottypes_5_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robottypes_5_1, grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_5_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robottypes",
                              		lv_robottypes_5_1, 
                              		"LOWERFIRST");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:189:8: lv_robottypes_5_2= RULE_CAPITALFIRST
                    {
                    lv_robottypes_5_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robottypes_5_2, grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_5_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robottypes",
                              		lv_robottypes_5_2, 
                              		"CAPITALFIRST");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleScript353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getScriptAccess().getCommaKeyword_6());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:211:1: ( ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:212:1: ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:212:1: ( (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:213:1: (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:213:1: (lv_robotconfigs_7_1= RULE_LOWERFIRST | lv_robotconfigs_7_2= RULE_CAPITALFIRST )
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:214:3: lv_robotconfigs_7_1= RULE_LOWERFIRST
                    {
                    lv_robotconfigs_7_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robotconfigs_7_1, grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_7_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robotconfigs",
                              		lv_robotconfigs_7_1, 
                              		"LOWERFIRST");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:229:8: lv_robotconfigs_7_2= RULE_CAPITALFIRST
                    {
                    lv_robotconfigs_7_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robotconfigs_7_2, grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_7_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robotconfigs",
                              		lv_robotconfigs_7_2, 
                              		"CAPITALFIRST");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleScript412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getScriptAccess().getRightParenthesisKeyword_8());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:251:1: (otherlv_9= ',' otherlv_10= '(' ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) ) otherlv_12= ',' ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) ) otherlv_14= ')' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:251:3: otherlv_9= ',' otherlv_10= '(' ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) ) otherlv_12= ',' ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) ) otherlv_14= ')'
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleScript425); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getScriptAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleScript437); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getScriptAccess().getLeftParenthesisKeyword_9_1());
            	          
            	    }
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:259:1: ( ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:260:1: ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:260:1: ( (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:261:1: (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:261:1: (lv_robottypes_11_1= RULE_LOWERFIRST | lv_robottypes_11_2= RULE_CAPITALFIRST )
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
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:262:3: lv_robottypes_11_1= RULE_LOWERFIRST
            	            {
            	            lv_robottypes_11_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript456); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robottypes_11_1, grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_9_2_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robottypes",
            	                      		lv_robottypes_11_1, 
            	                      		"LOWERFIRST");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:277:8: lv_robottypes_11_2= RULE_CAPITALFIRST
            	            {
            	            lv_robottypes_11_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript476); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robottypes_11_2, grammarAccess.getScriptAccess().getRobottypesCAPITALFIRSTTerminalRuleCall_9_2_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robottypes",
            	                      		lv_robottypes_11_2, 
            	                      		"CAPITALFIRST");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleScript496); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getScriptAccess().getCommaKeyword_9_3());
            	          
            	    }
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:299:1: ( ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:300:1: ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:300:1: ( (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:301:1: (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:301:1: (lv_robotconfigs_13_1= RULE_LOWERFIRST | lv_robotconfigs_13_2= RULE_CAPITALFIRST )
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
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:302:3: lv_robotconfigs_13_1= RULE_LOWERFIRST
            	            {
            	            lv_robotconfigs_13_1=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript515); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robotconfigs_13_1, grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_9_4_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robotconfigs",
            	                      		lv_robotconfigs_13_1, 
            	                      		"LOWERFIRST");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:317:8: lv_robotconfigs_13_2= RULE_CAPITALFIRST
            	            {
            	            lv_robotconfigs_13_2=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript535); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_robotconfigs_13_2, grammarAccess.getScriptAccess().getRobotconfigsCAPITALFIRSTTerminalRuleCall_9_4_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getScriptRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"robotconfigs",
            	                      		lv_robotconfigs_13_2, 
            	                      		"CAPITALFIRST");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleScript555); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getScriptAccess().getRightParenthesisKeyword_9_5());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleScript569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getScriptAccess().getRightParenthesisKeyword_10());
                  
            }
            otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleScript581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_11());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:347:1: ( (lv_methods_17_0= ruleUserMethod ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=41 && LA7_0<=44)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:348:1: (lv_methods_17_0= ruleUserMethod )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:348:1: (lv_methods_17_0= ruleUserMethod )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:349:3: lv_methods_17_0= ruleUserMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_12_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUserMethod_in_ruleScript602);
            	    lv_methods_17_0=ruleUserMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methods",
            	              		lv_methods_17_0, 
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

            otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleScript615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_13());
                  
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:377:1: entryRuleMetaMethods returns [EObject current=null] : iv_ruleMetaMethods= ruleMetaMethods EOF ;
    public final EObject entryRuleMetaMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethods = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:378:2: (iv_ruleMetaMethods= ruleMetaMethods EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:379:2: iv_ruleMetaMethods= ruleMetaMethods EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaMethodsRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods651);
            iv_ruleMetaMethods=ruleMetaMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaMethods; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethods661); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:386:1: ruleMetaMethods returns [EObject current=null] : ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetaMethods() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:389:28: ( ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:1: ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:1: ( () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:2: () otherlv_1= 'metamethodscollection' otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:2: ()
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:391:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMetaMethodsAccess().getMetaMethodsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMetaMethods707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMetaMethods719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:404:1: ( (lv_methods_3_0= ruleMetaMethod ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:405:1: (lv_methods_3_0= ruleMetaMethod )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:405:1: (lv_methods_3_0= ruleMetaMethod )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:406:3: lv_methods_3_0= ruleMetaMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetaMethod_in_ruleMetaMethods740);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMetaMethods753); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:434:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:435:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:436:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock789);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock799); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:443:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exs_2_0 = null;

        EObject lv_exs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:446:28: ( ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:447:1: ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:447:1: ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:447:2: () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:447:2: ()
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:448:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBlock845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:457:1: ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_CAPITALFIRST && LA9_0<=RULE_LOWERFIRST)||LA9_0==40||(LA9_0>=42 && LA9_0<=44)) ) {
                    alt9=1;
                }
                else if ( (LA9_0==18||(LA9_0>=34 && LA9_0<=37)) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:457:2: ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:457:2: ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:457:3: ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';'
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:457:3: ( (lv_exs_2_0= ruleSimpleExpression ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:458:1: (lv_exs_2_0= ruleSimpleExpression )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:458:1: (lv_exs_2_0= ruleSimpleExpression )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:459:3: lv_exs_2_0= ruleSimpleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleBlock868);
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

            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBlock880); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:480:6: ( (lv_exs_4_0= ruleStructureExpression ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:480:6: ( (lv_exs_4_0= ruleStructureExpression ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:481:1: (lv_exs_4_0= ruleStructureExpression )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:481:1: (lv_exs_4_0= ruleStructureExpression )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:482:3: lv_exs_4_0= ruleStructureExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructureExpression_in_ruleBlock908);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBlock922); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:510:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:511:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:512:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression958);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression968); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:519:1: ruleSimpleExpression returns [EObject current=null] : (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Return_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:522:28: ( (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:523:1: (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:523:1: (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==15) ) {
                    alt10=1;
                }
                else if ( (LA10_1==22) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt10=1;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:524:5: this_Call_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleSimpleExpression1015);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:534:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleSimpleExpression1042);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:544:5: this_Return_2= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleSimpleExpression1069);
                    this_Return_2=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Return_2; 
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:560:1: entryRuleStructureExpression returns [EObject current=null] : iv_ruleStructureExpression= ruleStructureExpression EOF ;
    public final EObject entryRuleStructureExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:561:2: (iv_ruleStructureExpression= ruleStructureExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:562:2: iv_ruleStructureExpression= ruleStructureExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructureExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1104);
            iv_ruleStructureExpression=ruleStructureExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructureExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression1114); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:569:1: ruleStructureExpression returns [EObject current=null] : (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile ) ;
    public final EObject ruleStructureExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_If_1 = null;

        EObject this_Else_2 = null;

        EObject this_For_3 = null;

        EObject this_While_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:572:28: ( (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:573:1: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:573:1: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            case 37:
                {
                alt11=5;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:574:5: this_Block_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleStructureExpression1161);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:584:5: this_If_1= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleStructureExpression1188);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:594:5: this_Else_2= ruleElse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getElseParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElse_in_ruleStructureExpression1215);
                    this_Else_2=ruleElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Else_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:604:5: this_For_3= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleStructureExpression1242);
                    this_For_3=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_For_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:614:5: this_While_4= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleStructureExpression1269);
                    this_While_4=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_While_4; 
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:630:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:631:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:632:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1304);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1314); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:639:1: ruleExpression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpression_0 = null;

        EObject this_StructureExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:642:28: ( (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:643:1: (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:643:1: (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_CAPITALFIRST && LA12_0<=RULE_LOWERFIRST)||LA12_0==40||(LA12_0>=42 && LA12_0<=44)) ) {
                alt12=1;
            }
            else if ( (LA12_0==18||(LA12_0>=34 && LA12_0<=37)) ) {
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:644:5: this_SimpleExpression_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression1361);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:654:5: this_StructureExpression_1= ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_ruleExpression1388);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:670:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:671:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:672:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1423);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1433); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:679:1: ruleAssignment returns [EObject current=null] : ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vari_0_4 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:682:28: ( ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:683:1: ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:683:1: ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:683:2: ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:683:2: ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:684:1: ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:684:1: ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:685:1: (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:685:1: (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LOWERFIRST) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=42 && LA13_0<=44)) ) {
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:686:3: otherlv_0= RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignmentRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleAssignment1480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getVariDeclarationCrossReference_0_0_0()); 
                      	
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:696:8: lv_vari_0_4= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleAssignment1499);
                    lv_vari_0_4=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"vari",
                              		lv_vari_0_4, 
                              		"Declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:714:2: ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:714:3: ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:714:3: ( ( '=' )=>otherlv_1= '=' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:714:4: ( '=' )=>otherlv_1= '='
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_0());
                  
            }

            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:719:2: ( (lv_value_2_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:720:1: (lv_value_2_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:720:1: (lv_value_2_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:721:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1545);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Value");
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:745:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:746:2: (iv_ruleCall= ruleCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:747:2: iv_ruleCall= ruleCall EOF
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:754:1: ruleCall returns [EObject current=null] : ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:757:28: ( ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:758:1: ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:758:1: ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:758:2: (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:758:2: (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LOWERFIRST) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_CAPITALFIRST) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:759:5: this_UserMethodCall_0= ruleUserMethodCall
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:769:5: this_MetaMethodCall_1= ruleMetaMethodCall
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:781:1: ( (lv_parameters_3_0= ruleValue ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_CAPITALFIRST && LA15_0<=RULE_INT)||(LA15_0>=38 && LA15_0<=39)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:782:1: (lv_parameters_3_0= ruleValue )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:782:1: (lv_parameters_3_0= ruleValue )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:783:3: lv_parameters_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getParametersValueParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleCall1700);
                    lv_parameters_3_0=ruleValue();

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
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:799:3: ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:799:4: (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:799:4: (otherlv_4= ',' )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==16) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:799:6: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCall1715); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getCallAccess().getCommaKeyword_3_0());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:803:3: ( (lv_parameters_5_0= ruleValue ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:804:1: (lv_parameters_5_0= ruleValue )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:804:1: (lv_parameters_5_0= ruleValue )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:805:3: lv_parameters_5_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCallAccess().getParametersValueParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleCall1738);
            	    lv_parameters_5_0=ruleValue();

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
            	              		"Value");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:835:1: entryRuleMetaMethod returns [EObject current=null] : iv_ruleMetaMethod= ruleMetaMethod EOF ;
    public final EObject entryRuleMetaMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethod = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:836:2: (iv_ruleMetaMethod= ruleMetaMethod EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:837:2: iv_ruleMetaMethod= ruleMetaMethod EOF
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:844:1: ruleMetaMethod returns [EObject current=null] : (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:847:28: ( (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:848:1: (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:848:1: (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:848:3: otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMetaMethod1837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMetaMethodAccess().getMetaKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:852:1: ( (lv_type_1_0= ruleMethodtype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:853:1: (lv_type_1_0= ruleMethodtype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:853:1: (lv_type_1_0= ruleMethodtype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:854:3: lv_type_1_0= ruleMethodtype
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:870:2: ( (lv_name_2_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:871:1: (lv_name_2_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:871:1: (lv_name_2_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:872:3: lv_name_2_0= RULE_CAPITALFIRST
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:892:1: ( (lv_parameters_4_0= ruleDeclaration ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=42 && LA18_0<=44)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:893:1: (lv_parameters_4_0= ruleDeclaration )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:893:1: (lv_parameters_4_0= ruleDeclaration )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:894:3: lv_parameters_4_0= ruleDeclaration
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:910:3: ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:910:4: (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:910:4: (otherlv_5= ',' )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==16) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:910:6: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMetaMethod1928); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_5, grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:914:3: ( (lv_parameters_6_0= ruleDeclaration ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:915:1: (lv_parameters_6_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:915:1: (lv_parameters_6_0= ruleDeclaration )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:916:3: lv_parameters_6_0= ruleDeclaration
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
            	    break loop20;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:948:1: entryRuleUserMethod returns [EObject current=null] : iv_ruleUserMethod= ruleUserMethod EOF ;
    public final EObject entryRuleUserMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserMethod = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:949:2: (iv_ruleUserMethod= ruleUserMethod EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:950:2: iv_ruleUserMethod= ruleUserMethod EOF
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:957:1: ruleUserMethod returns [EObject current=null] : ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:960:28: ( ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:961:1: ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:961:1: ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:961:2: ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:961:2: ( (lv_type_0_0= ruleMethodtype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:962:1: (lv_type_0_0= ruleMethodtype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:962:1: (lv_type_0_0= ruleMethodtype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:963:3: lv_type_0_0= ruleMethodtype
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:979:2: ( (lv_name_1_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:980:1: (lv_name_1_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:980:1: (lv_name_1_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:981:3: lv_name_1_0= RULE_LOWERFIRST
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1001:1: ( (lv_parameters_3_0= ruleDeclaration ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=42 && LA21_0<=44)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1002:1: (lv_parameters_3_0= ruleDeclaration )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1002:1: (lv_parameters_3_0= ruleDeclaration )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1003:3: lv_parameters_3_0= ruleDeclaration
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1019:3: ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1019:4: (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1019:4: (otherlv_4= ',' )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==16) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1019:6: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleUserMethod2139); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getUserMethodAccess().getCommaKeyword_4_0());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt22 >= 1 ) break loop22;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1023:3: ( (lv_parameters_5_0= ruleDeclaration ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1024:1: (lv_parameters_5_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1024:1: (lv_parameters_5_0= ruleDeclaration )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1025:3: lv_parameters_5_0= ruleDeclaration
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
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleUserMethod2176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getUserMethodAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1045:1: ( (lv_bl_7_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1046:1: (lv_bl_7_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1046:1: (lv_bl_7_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1047:3: lv_bl_7_0= ruleBlock
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1071:1: entryRuleUserMethodCall returns [EObject current=null] : iv_ruleUserMethodCall= ruleUserMethodCall EOF ;
    public final EObject entryRuleUserMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserMethodCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1072:2: (iv_ruleUserMethodCall= ruleUserMethodCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1073:2: iv_ruleUserMethodCall= ruleUserMethodCall EOF
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1080:1: ruleUserMethodCall returns [EObject current=null] : ( (otherlv_0= RULE_LOWERFIRST ) ) ;
    public final EObject ruleUserMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1083:28: ( ( (otherlv_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1084:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1084:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1085:1: (otherlv_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1085:1: (otherlv_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1086:3: otherlv_0= RULE_LOWERFIRST
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1105:1: entryRuleMetaMethodCall returns [EObject current=null] : iv_ruleMetaMethodCall= ruleMetaMethodCall EOF ;
    public final EObject entryRuleMetaMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethodCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1106:2: (iv_ruleMetaMethodCall= ruleMetaMethodCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1107:2: iv_ruleMetaMethodCall= ruleMetaMethodCall EOF
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1114:1: ruleMetaMethodCall returns [EObject current=null] : ( (otherlv_0= RULE_CAPITALFIRST ) ) ;
    public final EObject ruleMetaMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1117:28: ( ( (otherlv_0= RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1118:1: ( (otherlv_0= RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1118:1: ( (otherlv_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1119:1: (otherlv_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1119:1: (otherlv_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1120:3: otherlv_0= RULE_CAPITALFIRST
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


    // $ANTLR start "entryRuleBool"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1139:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1140:2: (iv_ruleBool= ruleBool EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1141:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool2411);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool2421); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1148:1: ruleBool returns [EObject current=null] : ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        EObject lv_varleft_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_varright_2_0 = null;

        AntlrDatatypeRuleToken lv_bop_3_0 = null;

        EObject lv_bnext_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1151:28: ( ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1152:1: ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1152:1: ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1152:2: ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )?
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1152:2: ( (lv_varleft_0_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1153:1: (lv_varleft_0_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1153:1: (lv_varleft_0_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1154:3: lv_varleft_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBoolAccess().getVarleftValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBool2467);
            lv_varleft_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBoolRule());
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1170:2: ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) && (synpred2_InternalCommonlang())) {
                alt24=1;
            }
            else if ( (LA24_0==25) && (synpred2_InternalCommonlang())) {
                alt24=1;
            }
            else if ( (LA24_0==26) && (synpred2_InternalCommonlang())) {
                alt24=1;
            }
            else if ( (LA24_0==27) && (synpred2_InternalCommonlang())) {
                alt24=1;
            }
            else if ( (LA24_0==28) && (synpred2_InternalCommonlang())) {
                alt24=1;
            }
            else if ( (LA24_0==29) && (synpred2_InternalCommonlang())) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1170:3: ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1170:3: ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1170:4: ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1175:1: (lv_op_1_0= ruleComparisonOperator )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1176:3: lv_op_1_0= ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getOpComparisonOperatorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleBool2499);
                    lv_op_1_0=ruleComparisonOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBoolRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"ComparisonOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1192:2: ( (lv_varright_2_0= ruleValue ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1193:1: (lv_varright_2_0= ruleValue )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1193:1: (lv_varright_2_0= ruleValue )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1194:3: lv_varright_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getVarrightValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleBool2520);
                    lv_varright_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBoolRule());
                      	        }
                             		set(
                             			current, 
                             			"varright",
                              		lv_varright_2_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1210:4: ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=30 && LA25_0<=33)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1210:5: ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1210:5: ( (lv_bop_3_0= ruleBooleanOperator ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1211:1: (lv_bop_3_0= ruleBooleanOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1211:1: (lv_bop_3_0= ruleBooleanOperator )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1212:3: lv_bop_3_0= ruleBooleanOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getBopBooleanOperatorParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanOperator_in_ruleBool2544);
                    lv_bop_3_0=ruleBooleanOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBoolRule());
                      	        }
                             		set(
                             			current, 
                             			"bop",
                              		lv_bop_3_0, 
                              		"BooleanOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1228:2: ( (lv_bnext_4_0= ruleBool ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1229:1: (lv_bnext_4_0= ruleBool )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1229:1: (lv_bnext_4_0= ruleBool )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1230:3: lv_bnext_4_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getBnextBoolParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleBool2565);
                    lv_bnext_4_0=ruleBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBoolRule());
                      	        }
                             		set(
                             			current, 
                             			"bnext",
                              		lv_bnext_4_0, 
                              		"Bool");
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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleComparisonOperator"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1254:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1255:2: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1256:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator2604);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator2615); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1263:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1266:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1267:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1267:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt26=1;
                }
                break;
            case 25:
                {
                alt26=2;
                }
                break;
            case 26:
                {
                alt26=3;
                }
                break;
            case 27:
                {
                alt26=4;
                }
                break;
            case 28:
                {
                alt26=5;
                }
                break;
            case 29:
                {
                alt26=6;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1268:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleComparisonOperator2653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1275:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleComparisonOperator2672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1282:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleComparisonOperator2691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1289:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleComparisonOperator2710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1296:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleComparisonOperator2729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1303:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleComparisonOperator2748); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1316:1: entryRuleBooleanOperator returns [String current=null] : iv_ruleBooleanOperator= ruleBooleanOperator EOF ;
    public final String entryRuleBooleanOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1317:2: (iv_ruleBooleanOperator= ruleBooleanOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1318:2: iv_ruleBooleanOperator= ruleBooleanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator2789);
            iv_ruleBooleanOperator=ruleBooleanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator2800); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1325:1: ruleBooleanOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1328:28: ( (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1329:1: (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1329:1: (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt27=1;
                }
                break;
            case 31:
                {
                alt27=2;
                }
                break;
            case 32:
                {
                alt27=3;
                }
                break;
            case 33:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1330:2: kw= '&&'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleBooleanOperator2838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1337:2: kw= '||'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleBooleanOperator2857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1344:2: kw= '!&&'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBooleanOperator2876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1351:2: kw= '!||'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBooleanOperator2895); if (state.failed) return current;
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


    // $ANTLR start "entryRuleIf"
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1364:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1365:2: (iv_ruleIf= ruleIf EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1366:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf2935);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf2945); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1373:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ex_2_0 = null;

        EObject lv_bl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1376:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1377:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1377:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1377:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleIf2982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleIf2994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1385:1: ( (lv_ex_2_0= ruleBool ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1386:1: (lv_ex_2_0= ruleBool )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1386:1: (lv_ex_2_0= ruleBool )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1387:3: lv_ex_2_0= ruleBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getExBoolParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBool_in_ruleIf3015);
            lv_ex_2_0=ruleBool();

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
                      		"Bool");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleIf3027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1407:1: ( (lv_bl_4_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1408:1: (lv_bl_4_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1408:1: (lv_bl_4_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1409:3: lv_bl_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleIf3048);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1433:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1434:2: (iv_ruleElse= ruleElse EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1435:2: iv_ruleElse= ruleElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseRule()); 
            }
            pushFollow(FOLLOW_ruleElse_in_entryRuleElse3084);
            iv_ruleElse=ruleElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElse; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElse3094); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1442:1: ruleElse returns [EObject current=null] : (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1445:28: ( (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1446:1: (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1446:1: (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1446:3: otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleElse3131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseAccess().getElseKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1450:1: ( (lv_ex_1_0= ruleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1451:1: (lv_ex_1_0= ruleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1451:1: (lv_ex_1_0= ruleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1452:3: lv_ex_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleElse3152);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1476:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1477:2: (iv_ruleFor= ruleFor EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1478:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor3188);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor3198); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1485:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1488:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1489:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1489:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1489:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFor3235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFor3247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1497:1: ( (lv_init_2_0= ruleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1498:1: (lv_init_2_0= ruleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1498:1: (lv_init_2_0= ruleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1499:3: lv_init_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getInitExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor3268);
            lv_init_2_0=ruleExpression();

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
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFor3280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1519:1: ( (lv_check_4_0= ruleBool ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1520:1: (lv_check_4_0= ruleBool )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1520:1: (lv_check_4_0= ruleBool )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1521:3: lv_check_4_0= ruleBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getCheckBoolParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBool_in_ruleFor3301);
            lv_check_4_0=ruleBool();

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
                      		"Bool");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFor3313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1541:1: ( (lv_action_6_0= ruleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1542:1: (lv_action_6_0= ruleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1542:1: (lv_action_6_0= ruleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1543:3: lv_action_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getActionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor3334);
            lv_action_6_0=ruleExpression();

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
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleFor3346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1563:1: ( (lv_bl_8_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1564:1: (lv_bl_8_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1564:1: (lv_bl_8_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1565:3: lv_bl_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFor3367);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1589:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1590:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1591:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile3403);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile3413); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1598:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ex_2_0 = null;

        EObject lv_bl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1601:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1602:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1602:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1602:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleWhile3450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleWhile3462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1610:1: ( (lv_ex_2_0= ruleBool ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1611:1: (lv_ex_2_0= ruleBool )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1611:1: (lv_ex_2_0= ruleBool )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1612:3: lv_ex_2_0= ruleBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getExBoolParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBool_in_ruleWhile3483);
            lv_ex_2_0=ruleBool();

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
                      		"Bool");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleWhile3495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1632:1: ( (lv_bl_4_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1633:1: (lv_bl_4_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1633:1: (lv_bl_4_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1634:3: lv_bl_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleWhile3516);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1658:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1659:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1660:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3552);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3562); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1667:1: ruleValue returns [EObject current=null] : (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;

        EObject this_VarReference_1 = null;

        EObject this_BasicValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1670:28: ( (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1671:1: (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1671:1: (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==15) ) {
                    alt28=1;
                }
                else if ( (LA28_1==EOF||(LA28_1>=RULE_CAPITALFIRST && LA28_1<=RULE_LOWERFIRST)||(LA28_1>=16 && LA28_1<=19)||LA28_1==21||(LA28_1>=24 && LA28_1<=37)||LA28_1==40||(LA28_1>=42 && LA28_1<=44)) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt28=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 38:
            case 39:
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1672:5: this_Call_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleValue3609);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1682:5: this_VarReference_1= ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_ruleValue3636);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1692:5: this_BasicValue_2= ruleBasicValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBasicValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicValue_in_ruleValue3663);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1708:1: entryRuleBasicValue returns [EObject current=null] : iv_ruleBasicValue= ruleBasicValue EOF ;
    public final EObject entryRuleBasicValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1709:2: (iv_ruleBasicValue= ruleBasicValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1710:2: iv_ruleBasicValue= ruleBasicValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicValueRule()); 
            }
            pushFollow(FOLLOW_ruleBasicValue_in_entryRuleBasicValue3698);
            iv_ruleBasicValue=ruleBasicValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValue3708); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1717:1: ruleBasicValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleBasicValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_StringValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1720:28: ( (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1721:1: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1721:1: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
                {
                alt29=1;
                }
                break;
            case RULE_INT:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1722:5: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleBasicValue3755);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1732:5: this_NumberValue_1= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_ruleBasicValue3782);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1742:5: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleBasicValue3809);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1758:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1759:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1760:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3844);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue3854); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1767:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1770:28: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1771:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1771:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1772:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1772:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1773:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1773:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            else if ( (LA30_0==39) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1774:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,38,FOLLOW_38_in_ruleBooleanValue3898); if (state.failed) return current;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1786:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,39,FOLLOW_39_in_ruleBooleanValue3927); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1809:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1810:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1811:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue3978);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue3988); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1818:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1821:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1822:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1822:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1823:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1823:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1824:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue4029); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1848:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1849:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1850:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue4069);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue4079); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1857:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleINTSTRING ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1860:28: ( ( (lv_value_0_0= ruleINTSTRING ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1861:1: ( (lv_value_0_0= ruleINTSTRING ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1861:1: ( (lv_value_0_0= ruleINTSTRING ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1862:1: (lv_value_0_0= ruleINTSTRING )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1862:1: (lv_value_0_0= ruleINTSTRING )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1863:3: lv_value_0_0= ruleINTSTRING
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_ruleNumberValue4124);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1887:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1888:2: (iv_ruleVarReference= ruleVarReference EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1889:2: iv_ruleVarReference= ruleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_entryRuleVarReference4159);
            iv_ruleVarReference=ruleVarReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReference4169); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1896:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_LOWERFIRST ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1899:28: ( ( (otherlv_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1900:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1900:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1901:1: (otherlv_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1901:1: (otherlv_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1902:3: otherlv_0= RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleVarReference4213); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1921:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1922:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1923:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration4248);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration4258); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1930:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1933:28: ( ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1934:1: ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1934:1: ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1934:2: ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1934:2: ( (lv_type_0_0= ruleDatatype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1935:1: (lv_type_0_0= ruleDatatype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1935:1: (lv_type_0_0= ruleDatatype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1936:3: lv_type_0_0= ruleDatatype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDatatype_in_ruleDeclaration4304);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1952:2: ( (lv_name_1_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1953:1: (lv_name_1_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1953:1: (lv_name_1_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1954:3: lv_name_1_0= RULE_LOWERFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleDeclaration4321); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1978:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1979:2: (iv_ruleReturn= ruleReturn EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1980:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn4362);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn4372); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1987:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1990:28: ( (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1991:1: (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1991:1: (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1991:3: otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleReturn4409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1995:1: ( (lv_val_1_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1996:1: (lv_val_1_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1996:1: (lv_val_1_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1997:3: lv_val_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getValValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleReturn4430);
            lv_val_1_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnRule());
              	        }
                     		set(
                     			current, 
                     			"val",
                      		lv_val_1_0, 
                      		"Value");
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2021:1: entryRuleMethodtype returns [String current=null] : iv_ruleMethodtype= ruleMethodtype EOF ;
    public final String entryRuleMethodtype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodtype = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2022:2: (iv_ruleMethodtype= ruleMethodtype EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2023:2: iv_ruleMethodtype= ruleMethodtype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodtypeRule()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_entryRuleMethodtype4467);
            iv_ruleMethodtype=ruleMethodtype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodtype.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodtype4478); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2030:1: ruleMethodtype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | this_Datatype_1= ruleDatatype ) ;
    public final AntlrDatatypeRuleToken ruleMethodtype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Datatype_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2033:28: ( (kw= 'void' | this_Datatype_1= ruleDatatype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2034:1: (kw= 'void' | this_Datatype_1= ruleDatatype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2034:1: (kw= 'void' | this_Datatype_1= ruleDatatype )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=42 && LA31_0<=44)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2035:2: kw= 'void'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleMethodtype4516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2042:5: this_Datatype_1= ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_ruleMethodtype4544);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2060:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2061:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2062:2: iv_ruleDatatype= ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype4590);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatype.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype4601); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2069:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2072:28: ( (kw= 'int' | kw= 'string' | kw= 'boolean' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2073:1: (kw= 'int' | kw= 'string' | kw= 'boolean' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2073:1: (kw= 'int' | kw= 'string' | kw= 'boolean' )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt32=1;
                }
                break;
            case 43:
                {
                alt32=2;
                }
                break;
            case 44:
                {
                alt32=3;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2074:2: kw= 'int'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleDatatype4639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2081:2: kw= 'string'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleDatatype4658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2088:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleDatatype4677); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2101:1: entryRuleINTSTRING returns [String current=null] : iv_ruleINTSTRING= ruleINTSTRING EOF ;
    public final String entryRuleINTSTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTSTRING = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2102:2: (iv_ruleINTSTRING= ruleINTSTRING EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2103:2: iv_ruleINTSTRING= ruleINTSTRING EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTSTRINGRule()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING4718);
            iv_ruleINTSTRING=ruleINTSTRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTSTRING.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTSTRING4729); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2110:1: ruleINTSTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleINTSTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2113:28: (this_INT_0= RULE_INT )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2114:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTSTRING4768); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalCommonlang
    public final void synpred2_InternalCommonlang_fragment() throws RecognitionException {   
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1170:4: ( ( ruleComparisonOperator ) )
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1171:1: ( ruleComparisonOperator )
        {
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1171:1: ( ruleComparisonOperator )
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1172:1: ruleComparisonOperator
        {
        pushFollow(FOLLOW_ruleComparisonOperator_in_synpred2_InternalCommonlang2482);
        ruleComparisonOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCommonlang

    // Delegated rules

    public final boolean synpred2_InternalCommonlang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCommonlang_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_15_in_ruleScript282 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleScript294 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript313 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript333 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScript353 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript372 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript392 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleScript412 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleScript425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleScript437 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript456 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript476 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScript496 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript515 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript535 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleScript555 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleScript569 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleScript581 = new BitSet(new long[]{0x00001E0000080000L});
    public static final BitSet FOLLOW_ruleUserMethod_in_ruleScript602 = new BitSet(new long[]{0x00001E0000080000L});
    public static final BitSet FOLLOW_19_in_ruleScript615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethods661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMetaMethods707 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetaMethods719 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_ruleMetaMethods740 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_19_in_ruleMetaMethods753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBlock845 = new BitSet(new long[]{0x00001F3C000C0030L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleBlock868 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBlock880 = new BitSet(new long[]{0x00001F3C000C0030L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleBlock908 = new BitSet(new long[]{0x00001F3C000C0030L});
    public static final BitSet FOLLOW_19_in_ruleBlock922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleSimpleExpression1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleSimpleExpression1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleSimpleExpression1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStructureExpression1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleStructureExpression1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_ruleStructureExpression1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleStructureExpression1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleStructureExpression1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleExpression1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleAssignment1480 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleAssignment1499 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1523 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_ruleCall1640 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_ruleCall1667 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCall1679 = new BitSet(new long[]{0x000000C0000300F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCall1700 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCall1715 = new BitSet(new long[]{0x000000C0000100F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCall1738 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleCall1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethod1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMetaMethod1837 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_ruleMethodtype_in_ruleMetaMethod1858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethod1875 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaMethod1892 = new BitSet(new long[]{0x00001E0000030020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMetaMethod1913 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMetaMethod1928 = new BitSet(new long[]{0x00001E0000010020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMetaMethod1951 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMetaMethod1965 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMetaMethod1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_entryRuleUserMethod2013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethod2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_ruleUserMethod2069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleUserMethod2086 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUserMethod2103 = new BitSet(new long[]{0x00001E0000030020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleUserMethod2124 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleUserMethod2139 = new BitSet(new long[]{0x00001E0000010020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleUserMethod2162 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleUserMethod2176 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleUserMethod2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall2233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethodCall2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleUserMethodCall2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethodCall2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethodCall2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool2411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBool2467 = new BitSet(new long[]{0x00000003FF000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleBool2499 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBool2520 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleBool2544 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleBool2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator2604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComparisonOperator2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComparisonOperator2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComparisonOperator2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComparisonOperator2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComparisonOperator2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleComparisonOperator2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator2789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBooleanOperator2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBooleanOperator2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBooleanOperator2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBooleanOperator2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf2935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleIf2982 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIf2994 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleIf3015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIf3027 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIf3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_entryRuleElse3084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElse3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleElse3131 = new BitSet(new long[]{0x00001F3C00040030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElse3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor3188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFor3235 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFor3247 = new BitSet(new long[]{0x00001F3C00040030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor3268 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFor3280 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleFor3301 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFor3313 = new BitSet(new long[]{0x00001F3C00040030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor3334 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFor3346 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFor3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile3403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleWhile3450 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWhile3462 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleWhile3483 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhile3495 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleWhile3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleValue3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_ruleValue3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_ruleValue3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_entryRuleBasicValue3698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValue3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleBasicValue3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleBasicValue3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleBasicValue3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBooleanValue3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBooleanValue3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue3978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue4069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_ruleNumberValue4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_entryRuleVarReference4159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReference4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleVarReference4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration4248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleDeclaration4304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleDeclaration4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn4362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleReturn4409 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleReturn4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_entryRuleMethodtype4467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodtype4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleMethodtype4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleMethodtype4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype4590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDatatype4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDatatype4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDatatype4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING4718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTSTRING4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTSTRING4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_synpred2_InternalCommonlang2482 = new BitSet(new long[]{0x0000000000000002L});

}