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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:76:1: ruleCLfile returns [EObject current=null] : ( ( (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods ) ) )* ;
    public final EObject ruleCLfile() throws RecognitionException {
        EObject current = null;

        EObject lv_mets_0_1 = null;

        EObject lv_mets_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:79:28: ( ( ( (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods ) ) )* )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:80:1: ( ( (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods ) ) )*
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:80:1: ( ( (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:81:1: ( (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:81:1: ( (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:82:1: (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:82:1: (lv_mets_0_1= ruleScript | lv_mets_0_2= ruleMetaMethods )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==20) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:83:3: lv_mets_0_1= ruleScript
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCLfileAccess().getMetsScriptParserRuleCall_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleScript_in_ruleCLfile132);
            	            lv_mets_0_1=ruleScript();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCLfileRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"mets",
            	                      		lv_mets_0_1, 
            	                      		"Script");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:98:8: lv_mets_0_2= ruleMetaMethods
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCLfileAccess().getMetsMetaMethodsParserRuleCall_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMetaMethods_in_ruleCLfile151);
            	            lv_mets_0_2=ruleMetaMethods();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCLfileRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"mets",
            	                      		lv_mets_0_2, 
            	                      		"MetaMethods");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript190);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript200); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:133:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' ( (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) ) | (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_robottypes_4_0=null;
        Token otherlv_5=null;
        Token lv_robotconfigs_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_robottypes_9_0=null;
        Token otherlv_10=null;
        Token lv_robotconfigs_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_methods_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:136:28: ( (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' ( (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) ) | (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' ( (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) ) | (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:1: (otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' ( (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) ) | (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:137:3: otherlv_0= 'script' ( (lv_name_1_0= RULE_CAPITALFIRST ) ) otherlv_2= 'targets' ( (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) ) | (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_methods_15_0= ruleUserMethod ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScript237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:141:1: ( (lv_name_1_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:142:1: (lv_name_1_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:142:1: (lv_name_1_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:143:3: lv_name_1_0= RULE_CAPITALFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleScript254); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleScript271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getTargetsKeyword_2());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:163:1: ( (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) ) | (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15||LA4_1==17) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_LOWERFIRST) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:163:2: (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:163:2: (otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:163:4: otherlv_3= '(' ( (lv_robottypes_4_0= RULE_LOWERFIRST ) ) otherlv_5= ',' ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleScript285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:167:1: ( (lv_robottypes_4_0= RULE_LOWERFIRST ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:168:1: (lv_robottypes_4_0= RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:168:1: (lv_robottypes_4_0= RULE_LOWERFIRST )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:169:3: lv_robottypes_4_0= RULE_LOWERFIRST
                    {
                    lv_robottypes_4_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robottypes_4_0, grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_3_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robottypes",
                              		lv_robottypes_4_0, 
                              		"LOWERFIRST");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleScript319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getCommaKeyword_3_0_2());
                          
                    }
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:189:1: ( (lv_robotconfigs_6_0= RULE_LOWERFIRST ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:190:1: (lv_robotconfigs_6_0= RULE_LOWERFIRST )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:190:1: (lv_robotconfigs_6_0= RULE_LOWERFIRST )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:191:3: lv_robotconfigs_6_0= RULE_LOWERFIRST
                    {
                    lv_robotconfigs_6_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_robotconfigs_6_0, grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_3_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScriptRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"robotconfigs",
                              		lv_robotconfigs_6_0, 
                              		"LOWERFIRST");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:208:6: (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:208:6: (otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )* )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:208:8: otherlv_7= '(' (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )*
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleScript361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:212:1: (otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:212:3: otherlv_8= '(' ( (lv_robottypes_9_0= RULE_LOWERFIRST ) ) otherlv_10= ',' ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) ) otherlv_12= ')'
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleScript374); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getScriptAccess().getLeftParenthesisKeyword_3_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:216:1: ( (lv_robottypes_9_0= RULE_LOWERFIRST ) )
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:217:1: (lv_robottypes_9_0= RULE_LOWERFIRST )
                    	    {
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:217:1: (lv_robottypes_9_0= RULE_LOWERFIRST )
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:218:3: lv_robottypes_9_0= RULE_LOWERFIRST
                    	    {
                    	    lv_robottypes_9_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript391); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_robottypes_9_0, grammarAccess.getScriptAccess().getRobottypesLOWERFIRSTTerminalRuleCall_3_1_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getScriptRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"robottypes",
                    	              		lv_robottypes_9_0, 
                    	              		"LOWERFIRST");
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleScript408); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getScriptAccess().getCommaKeyword_3_1_1_2());
                    	          
                    	    }
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:238:1: ( (lv_robotconfigs_11_0= RULE_LOWERFIRST ) )
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:239:1: (lv_robotconfigs_11_0= RULE_LOWERFIRST )
                    	    {
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:239:1: (lv_robotconfigs_11_0= RULE_LOWERFIRST )
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:240:3: lv_robotconfigs_11_0= RULE_LOWERFIRST
                    	    {
                    	    lv_robotconfigs_11_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleScript425); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_robotconfigs_11_0, grammarAccess.getScriptAccess().getRobotconfigsLOWERFIRSTTerminalRuleCall_3_1_1_3_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getScriptRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"robotconfigs",
                    	              		lv_robotconfigs_11_0, 
                    	              		"LOWERFIRST");
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleScript442); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getScriptAccess().getRightParenthesisKeyword_3_1_1_4());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleScript458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getScriptAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleScript470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getScriptAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:268:1: ( (lv_methods_15_0= ruleUserMethod ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=41 && LA5_0<=44)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:269:1: (lv_methods_15_0= ruleUserMethod )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:269:1: (lv_methods_15_0= ruleUserMethod )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:270:3: lv_methods_15_0= ruleUserMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getMethodsUserMethodParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUserMethod_in_ruleScript491);
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
            	    break loop5;
                }
            } while (true);

            otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleScript504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getScriptAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:298:1: entryRuleMetaMethods returns [EObject current=null] : iv_ruleMetaMethods= ruleMetaMethods EOF ;
    public final EObject entryRuleMetaMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethods = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:299:2: (iv_ruleMetaMethods= ruleMetaMethods EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:300:2: iv_ruleMetaMethods= ruleMetaMethods EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaMethodsRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods540);
            iv_ruleMetaMethods=ruleMetaMethods();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaMethods; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethods550); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:307:1: ruleMetaMethods returns [EObject current=null] : (otherlv_0= 'metamethodscollection' ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetaMethods() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:310:28: ( (otherlv_0= 'metamethodscollection' ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:311:1: (otherlv_0= 'metamethodscollection' ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:311:1: (otherlv_0= 'metamethodscollection' ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:311:3: otherlv_0= 'metamethodscollection' ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleMetaMethod ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleMetaMethods587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMetaMethodsAccess().getMetamethodscollectionKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:315:1: ( (lv_name_1_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:316:1: (lv_name_1_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:316:1: (lv_name_1_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:317:3: lv_name_1_0= RULE_LOWERFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleMetaMethods604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMetaMethodsAccess().getNameLOWERFIRSTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMetaMethodsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LOWERFIRST");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMetaMethods621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMetaMethodsAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:337:1: ( (lv_methods_3_0= ruleMetaMethod ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:338:1: (lv_methods_3_0= ruleMetaMethod )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:338:1: (lv_methods_3_0= ruleMetaMethod )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:339:3: lv_methods_3_0= ruleMetaMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMetaMethodsAccess().getMethodsMetaMethodParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetaMethod_in_ruleMetaMethods642);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMetaMethods655); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:367:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:368:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:369:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock691);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock701); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:376:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exs_2_0 = null;

        EObject lv_exs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:379:28: ( ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:380:1: ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:380:1: ( () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:380:2: () otherlv_1= '{' ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )* otherlv_5= '}'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:380:2: ()
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:381:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBlock747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:1: ( ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' ) | ( (lv_exs_4_0= ruleStructureExpression ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_CAPITALFIRST && LA7_0<=RULE_LOWERFIRST)||LA7_0==40||(LA7_0>=42 && LA7_0<=44)) ) {
                    alt7=1;
                }
                else if ( (LA7_0==18||(LA7_0>=34 && LA7_0<=37)) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:2: ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:2: ( ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';' )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:3: ( (lv_exs_2_0= ruleSimpleExpression ) ) otherlv_3= ';'
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:390:3: ( (lv_exs_2_0= ruleSimpleExpression ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:391:1: (lv_exs_2_0= ruleSimpleExpression )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:391:1: (lv_exs_2_0= ruleSimpleExpression )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:392:3: lv_exs_2_0= ruleSimpleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getExsSimpleExpressionParserRuleCall_2_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleBlock770);
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

            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBlock782); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSemicolonKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:413:6: ( (lv_exs_4_0= ruleStructureExpression ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:413:6: ( (lv_exs_4_0= ruleStructureExpression ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:414:1: (lv_exs_4_0= ruleStructureExpression )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:414:1: (lv_exs_4_0= ruleStructureExpression )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:415:3: lv_exs_4_0= ruleStructureExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getExsStructureExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStructureExpression_in_ruleBlock810);
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
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBlock824); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:443:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:444:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:445:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression860);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression870); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:452:1: ruleSimpleExpression returns [EObject current=null] : (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Return_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:455:28: ( (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:456:1: (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:456:1: (this_Call_0= ruleCall | this_Assignment_1= ruleAssignment | this_Return_2= ruleReturn )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==22) ) {
                    alt8=2;
                }
                else if ( (LA8_1==15) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt8=1;
                }
                break;
            case 42:
            case 43:
            case 44:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:457:5: this_Call_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleSimpleExpression917);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:467:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleSimpleExpression944);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:477:5: this_Return_2= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleExpressionAccess().getReturnParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleSimpleExpression971);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:493:1: entryRuleStructureExpression returns [EObject current=null] : iv_ruleStructureExpression= ruleStructureExpression EOF ;
    public final EObject entryRuleStructureExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:494:2: (iv_ruleStructureExpression= ruleStructureExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:495:2: iv_ruleStructureExpression= ruleStructureExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructureExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1006);
            iv_ruleStructureExpression=ruleStructureExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructureExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureExpression1016); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:502:1: ruleStructureExpression returns [EObject current=null] : (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile ) ;
    public final EObject ruleStructureExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_If_1 = null;

        EObject this_Else_2 = null;

        EObject this_For_3 = null;

        EObject this_While_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:505:28: ( (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:506:1: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:506:1: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_Else_2= ruleElse | this_For_3= ruleFor | this_While_4= ruleWhile )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 36:
                {
                alt9=4;
                }
                break;
            case 37:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:507:5: this_Block_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getBlockParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleStructureExpression1063);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:517:5: this_If_1= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getIfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleStructureExpression1090);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:527:5: this_Else_2= ruleElse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getElseParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElse_in_ruleStructureExpression1117);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:537:5: this_For_3= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getForParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleStructureExpression1144);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:547:5: this_While_4= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructureExpressionAccess().getWhileParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleStructureExpression1171);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:563:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:564:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:565:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1206);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1216); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:572:1: ruleExpression returns [EObject current=null] : (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpression_0 = null;

        EObject this_StructureExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:575:28: ( (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:576:1: (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:576:1: (this_SimpleExpression_0= ruleSimpleExpression | this_StructureExpression_1= ruleStructureExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_CAPITALFIRST && LA10_0<=RULE_LOWERFIRST)||LA10_0==40||(LA10_0>=42 && LA10_0<=44)) ) {
                alt10=1;
            }
            else if ( (LA10_0==18||(LA10_0>=34 && LA10_0<=37)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:577:5: this_SimpleExpression_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression1263);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:587:5: this_StructureExpression_1= ruleStructureExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getStructureExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStructureExpression_in_ruleExpression1290);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:603:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:604:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:605:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1325);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1335); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:612:1: ruleAssignment returns [EObject current=null] : ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vari_0_4 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:615:28: ( ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:616:1: ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:616:1: ( ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:616:2: ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:616:2: ( ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:617:1: ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:617:1: ( (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:618:1: (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:618:1: (otherlv_0= RULE_LOWERFIRST | lv_vari_0_4= ruleDeclaration )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_LOWERFIRST) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=42 && LA11_0<=44)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:619:3: otherlv_0= RULE_LOWERFIRST
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignmentRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleAssignment1382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getVariDeclarationCrossReference_0_0_0()); 
                      	
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:629:8: lv_vari_0_4= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariDeclarationParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleAssignment1401);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:647:2: ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:647:3: ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:647:3: ( ( '=' )=>otherlv_1= '=' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:647:4: ( '=' )=>otherlv_1= '='
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_0());
                  
            }

            }

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:652:2: ( (lv_value_2_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:653:1: (lv_value_2_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:653:1: (lv_value_2_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:654:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_1_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleAssignment1447);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:678:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:679:2: (iv_ruleCall= ruleCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:680:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1484);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1494); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:687:1: ruleCall returns [EObject current=null] : ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:690:28: ( ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:691:1: ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:691:1: ( (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:691:2: (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall ) otherlv_2= '(' ( (lv_parameters_3_0= ruleValue ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )* otherlv_6= ')'
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:691:2: (this_UserMethodCall_0= ruleUserMethodCall | this_MetaMethodCall_1= ruleMetaMethodCall )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LOWERFIRST) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_CAPITALFIRST) ) {
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:692:5: this_UserMethodCall_0= ruleUserMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallAccess().getUserMethodCallParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUserMethodCall_in_ruleCall1542);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:702:5: this_MetaMethodCall_1= ruleMetaMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallAccess().getMetaMethodCallParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMetaMethodCall_in_ruleCall1569);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCall1581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:714:1: ( (lv_parameters_3_0= ruleValue ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_CAPITALFIRST && LA13_0<=RULE_INT)||(LA13_0>=38 && LA13_0<=39)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:715:1: (lv_parameters_3_0= ruleValue )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:715:1: (lv_parameters_3_0= ruleValue )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:716:3: lv_parameters_3_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getParametersValueParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleCall1602);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:732:3: ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:732:4: (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleValue ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:732:4: (otherlv_4= ',' )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==16) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:732:6: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCall1617); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getCallAccess().getCommaKeyword_3_0());
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:736:3: ( (lv_parameters_5_0= ruleValue ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:737:1: (lv_parameters_5_0= ruleValue )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:737:1: (lv_parameters_5_0= ruleValue )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:738:3: lv_parameters_5_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCallAccess().getParametersValueParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleCall1640);
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
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleCall1654); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:768:1: entryRuleMetaMethod returns [EObject current=null] : iv_ruleMetaMethod= ruleMetaMethod EOF ;
    public final EObject entryRuleMetaMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethod = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:769:2: (iv_ruleMetaMethod= ruleMetaMethod EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:770:2: iv_ruleMetaMethod= ruleMetaMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod1692);
            iv_ruleMetaMethod=ruleMetaMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethod1702); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:777:1: ruleMetaMethod returns [EObject current=null] : (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:780:28: ( (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:781:1: (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:781:1: (otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:781:3: otherlv_0= 'meta' ( (lv_type_1_0= ruleMethodtype ) ) ( (lv_name_2_0= RULE_CAPITALFIRST ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleDeclaration ) )? ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )* otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMetaMethod1739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMetaMethodAccess().getMetaKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:785:1: ( (lv_type_1_0= ruleMethodtype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:786:1: (lv_type_1_0= ruleMethodtype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:786:1: (lv_type_1_0= ruleMethodtype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:787:3: lv_type_1_0= ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaMethodAccess().getTypeMethodtypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodtype_in_ruleMetaMethod1760);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:803:2: ( (lv_name_2_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:804:1: (lv_name_2_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:804:1: (lv_name_2_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:805:3: lv_name_2_0= RULE_CAPITALFIRST
            {
            lv_name_2_0=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethod1777); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMetaMethod1794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMetaMethodAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:825:1: ( (lv_parameters_4_0= ruleDeclaration ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=42 && LA16_0<=44)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:826:1: (lv_parameters_4_0= ruleDeclaration )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:826:1: (lv_parameters_4_0= ruleDeclaration )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:827:3: lv_parameters_4_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleMetaMethod1815);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:843:3: ( (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:843:4: (otherlv_5= ',' )+ ( (lv_parameters_6_0= ruleDeclaration ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:843:4: (otherlv_5= ',' )+
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
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:843:6: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMetaMethod1830); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_5, grammarAccess.getMetaMethodAccess().getCommaKeyword_5_0());
            	    	          
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

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:847:3: ( (lv_parameters_6_0= ruleDeclaration ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:848:1: (lv_parameters_6_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:848:1: (lv_parameters_6_0= ruleDeclaration )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:849:3: lv_parameters_6_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMetaMethodAccess().getParametersDeclarationParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleMetaMethod1853);
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
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMetaMethod1867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMetaMethodAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleMetaMethod1879); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:881:1: entryRuleUserMethod returns [EObject current=null] : iv_ruleUserMethod= ruleUserMethod EOF ;
    public final EObject entryRuleUserMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserMethod = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:882:2: (iv_ruleUserMethod= ruleUserMethod EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:883:2: iv_ruleUserMethod= ruleUserMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserMethodRule()); 
            }
            pushFollow(FOLLOW_ruleUserMethod_in_entryRuleUserMethod1915);
            iv_ruleUserMethod=ruleUserMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUserMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethod1925); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:890:1: ruleUserMethod returns [EObject current=null] : ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:893:28: ( ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:894:1: ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:894:1: ( ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:894:2: ( (lv_type_0_0= ruleMethodtype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleDeclaration ) )? ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )* otherlv_6= ')' ( (lv_bl_7_0= ruleBlock ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:894:2: ( (lv_type_0_0= ruleMethodtype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:895:1: (lv_type_0_0= ruleMethodtype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:895:1: (lv_type_0_0= ruleMethodtype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:896:3: lv_type_0_0= ruleMethodtype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserMethodAccess().getTypeMethodtypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodtype_in_ruleUserMethod1971);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:912:2: ( (lv_name_1_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:913:1: (lv_name_1_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:913:1: (lv_name_1_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:914:3: lv_name_1_0= RULE_LOWERFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleUserMethod1988); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleUserMethod2005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUserMethodAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:934:1: ( (lv_parameters_3_0= ruleDeclaration ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=42 && LA19_0<=44)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:935:1: (lv_parameters_3_0= ruleDeclaration )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:935:1: (lv_parameters_3_0= ruleDeclaration )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:936:3: lv_parameters_3_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleUserMethod2026);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:952:3: ( (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:952:4: (otherlv_4= ',' )+ ( (lv_parameters_5_0= ruleDeclaration ) )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:952:4: (otherlv_4= ',' )+
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
            	    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:952:6: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleUserMethod2041); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getUserMethodAccess().getCommaKeyword_4_0());
            	    	          
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

            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:956:3: ( (lv_parameters_5_0= ruleDeclaration ) )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:957:1: (lv_parameters_5_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:957:1: (lv_parameters_5_0= ruleDeclaration )
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:958:3: lv_parameters_5_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUserMethodAccess().getParametersDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleUserMethod2064);
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
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleUserMethod2078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getUserMethodAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:978:1: ( (lv_bl_7_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:979:1: (lv_bl_7_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:979:1: (lv_bl_7_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:980:3: lv_bl_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserMethodAccess().getBlBlockParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleUserMethod2099);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1004:1: entryRuleUserMethodCall returns [EObject current=null] : iv_ruleUserMethodCall= ruleUserMethodCall EOF ;
    public final EObject entryRuleUserMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserMethodCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1005:2: (iv_ruleUserMethodCall= ruleUserMethodCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1006:2: iv_ruleUserMethodCall= ruleUserMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall2135);
            iv_ruleUserMethodCall=ruleUserMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUserMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserMethodCall2145); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1013:1: ruleUserMethodCall returns [EObject current=null] : ( (otherlv_0= RULE_LOWERFIRST ) ) ;
    public final EObject ruleUserMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1016:28: ( ( (otherlv_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1017:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1017:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1018:1: (otherlv_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1018:1: (otherlv_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1019:3: otherlv_0= RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUserMethodCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleUserMethodCall2189); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1038:1: entryRuleMetaMethodCall returns [EObject current=null] : iv_ruleMetaMethodCall= ruleMetaMethodCall EOF ;
    public final EObject entryRuleMetaMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaMethodCall = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1039:2: (iv_ruleMetaMethodCall= ruleMetaMethodCall EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1040:2: iv_ruleMetaMethodCall= ruleMetaMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaMethodCallRule()); 
            }
            pushFollow(FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall2224);
            iv_ruleMetaMethodCall=ruleMetaMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaMethodCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaMethodCall2234); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1047:1: ruleMetaMethodCall returns [EObject current=null] : ( (otherlv_0= RULE_CAPITALFIRST ) ) ;
    public final EObject ruleMetaMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1050:28: ( ( (otherlv_0= RULE_CAPITALFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1051:1: ( (otherlv_0= RULE_CAPITALFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1051:1: ( (otherlv_0= RULE_CAPITALFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1052:1: (otherlv_0= RULE_CAPITALFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1052:1: (otherlv_0= RULE_CAPITALFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1053:3: otherlv_0= RULE_CAPITALFIRST
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMetaMethodCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_CAPITALFIRST,FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethodCall2278); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1074:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1075:2: (iv_ruleBool= ruleBool EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1076:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool2315);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool2325); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1083:1: ruleBool returns [EObject current=null] : ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        EObject lv_varleft_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_varright_2_0 = null;

        AntlrDatatypeRuleToken lv_bop_3_0 = null;

        EObject lv_bnext_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1086:28: ( ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1087:1: ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1087:1: ( ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )? )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1087:2: ( (lv_varleft_0_0= ruleValue ) ) ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )? ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )?
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1087:2: ( (lv_varleft_0_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1088:1: (lv_varleft_0_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1088:1: (lv_varleft_0_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1089:3: lv_varleft_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBoolAccess().getVarleftValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBool2371);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1105:2: ( ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) && (synpred2_InternalCommonlang())) {
                alt22=1;
            }
            else if ( (LA22_0==25) && (synpred2_InternalCommonlang())) {
                alt22=1;
            }
            else if ( (LA22_0==26) && (synpred2_InternalCommonlang())) {
                alt22=1;
            }
            else if ( (LA22_0==27) && (synpred2_InternalCommonlang())) {
                alt22=1;
            }
            else if ( (LA22_0==28) && (synpred2_InternalCommonlang())) {
                alt22=1;
            }
            else if ( (LA22_0==29) && (synpred2_InternalCommonlang())) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1105:3: ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) ) ( (lv_varright_2_0= ruleValue ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1105:3: ( ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1105:4: ( ( ruleComparisonOperator ) )=> (lv_op_1_0= ruleComparisonOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1110:1: (lv_op_1_0= ruleComparisonOperator )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1111:3: lv_op_1_0= ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getOpComparisonOperatorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleBool2403);
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

                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1127:2: ( (lv_varright_2_0= ruleValue ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1128:1: (lv_varright_2_0= ruleValue )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1128:1: (lv_varright_2_0= ruleValue )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1129:3: lv_varright_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getVarrightValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleBool2424);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1145:4: ( ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=30 && LA23_0<=33)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1145:5: ( (lv_bop_3_0= ruleBooleanOperator ) ) ( (lv_bnext_4_0= ruleBool ) )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1145:5: ( (lv_bop_3_0= ruleBooleanOperator ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1146:1: (lv_bop_3_0= ruleBooleanOperator )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1146:1: (lv_bop_3_0= ruleBooleanOperator )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1147:3: lv_bop_3_0= ruleBooleanOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getBopBooleanOperatorParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanOperator_in_ruleBool2448);
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

                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1163:2: ( (lv_bnext_4_0= ruleBool ) )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1164:1: (lv_bnext_4_0= ruleBool )
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1164:1: (lv_bnext_4_0= ruleBool )
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1165:3: lv_bnext_4_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBoolAccess().getBnextBoolParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleBool2469);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1189:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1190:2: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1191:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator2508);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperator2519); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1198:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1201:28: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1202:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1202:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt24=1;
                }
                break;
            case 25:
                {
                alt24=2;
                }
                break;
            case 26:
                {
                alt24=3;
                }
                break;
            case 27:
                {
                alt24=4;
                }
                break;
            case 28:
                {
                alt24=5;
                }
                break;
            case 29:
                {
                alt24=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1203:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleComparisonOperator2557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1210:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleComparisonOperator2576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1217:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleComparisonOperator2595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1224:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleComparisonOperator2614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1231:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleComparisonOperator2633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1238:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleComparisonOperator2652); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1251:1: entryRuleBooleanOperator returns [String current=null] : iv_ruleBooleanOperator= ruleBooleanOperator EOF ;
    public final String entryRuleBooleanOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanOperator = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1252:2: (iv_ruleBooleanOperator= ruleBooleanOperator EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1253:2: iv_ruleBooleanOperator= ruleBooleanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator2693);
            iv_ruleBooleanOperator=ruleBooleanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOperator2704); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1260:1: ruleBooleanOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1263:28: ( (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1264:1: (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1264:1: (kw= '&&' | kw= '||' | kw= '!&&' | kw= '!||' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case 32:
                {
                alt25=3;
                }
                break;
            case 33:
                {
                alt25=4;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1265:2: kw= '&&'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleBooleanOperator2742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getAmpersandAmpersandKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1272:2: kw= '||'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleBooleanOperator2761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getVerticalLineVerticalLineKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1279:2: kw= '!&&'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBooleanOperator2780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanOperatorAccess().getExclamationMarkAmpersandAmpersandKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1286:2: kw= '!||'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBooleanOperator2799); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1299:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1300:2: (iv_ruleIf= ruleIf EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1301:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf2839);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf2849); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1308:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ex_2_0 = null;

        EObject lv_bl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1311:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1312:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1312:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1312:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleIf2886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleIf2898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1320:1: ( (lv_ex_2_0= ruleBool ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1321:1: (lv_ex_2_0= ruleBool )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1321:1: (lv_ex_2_0= ruleBool )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1322:3: lv_ex_2_0= ruleBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getExBoolParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBool_in_ruleIf2919);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleIf2931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1342:1: ( (lv_bl_4_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1343:1: (lv_bl_4_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1343:1: (lv_bl_4_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1344:3: lv_bl_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getBlBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleIf2952);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1368:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1369:2: (iv_ruleElse= ruleElse EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1370:2: iv_ruleElse= ruleElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseRule()); 
            }
            pushFollow(FOLLOW_ruleElse_in_entryRuleElse2988);
            iv_ruleElse=ruleElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElse; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElse2998); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1377:1: ruleElse returns [EObject current=null] : (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1380:28: ( (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1381:1: (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1381:1: (otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1381:3: otherlv_0= 'else' ( (lv_ex_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleElse3035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseAccess().getElseKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1385:1: ( (lv_ex_1_0= ruleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1386:1: (lv_ex_1_0= ruleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1386:1: (lv_ex_1_0= ruleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1387:3: lv_ex_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseAccess().getExExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleElse3056);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1411:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1412:2: (iv_ruleFor= ruleFor EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1413:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor3092);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor3102); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1420:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) ) ;
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
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1423:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1424:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1424:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1424:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleExpression ) ) otherlv_3= ';' ( (lv_check_4_0= ruleBool ) ) otherlv_5= ';' ( (lv_action_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_bl_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFor3139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFor3151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1432:1: ( (lv_init_2_0= ruleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1433:1: (lv_init_2_0= ruleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1433:1: (lv_init_2_0= ruleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1434:3: lv_init_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getInitExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor3172);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFor3184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1454:1: ( (lv_check_4_0= ruleBool ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1455:1: (lv_check_4_0= ruleBool )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1455:1: (lv_check_4_0= ruleBool )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1456:3: lv_check_4_0= ruleBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getCheckBoolParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBool_in_ruleFor3205);
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFor3217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1476:1: ( (lv_action_6_0= ruleExpression ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1477:1: (lv_action_6_0= ruleExpression )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1477:1: (lv_action_6_0= ruleExpression )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1478:3: lv_action_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getActionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor3238);
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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleFor3250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1498:1: ( (lv_bl_8_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1499:1: (lv_bl_8_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1499:1: (lv_bl_8_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1500:3: lv_bl_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getBlBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFor3271);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1524:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1525:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1526:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile3307);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile3317); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1533:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ex_2_0 = null;

        EObject lv_bl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1536:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1537:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1537:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1537:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_ex_2_0= ruleBool ) ) otherlv_3= ')' ( (lv_bl_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleWhile3354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleWhile3366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1545:1: ( (lv_ex_2_0= ruleBool ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1546:1: (lv_ex_2_0= ruleBool )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1546:1: (lv_ex_2_0= ruleBool )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1547:3: lv_ex_2_0= ruleBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getExBoolParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBool_in_ruleWhile3387);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleWhile3399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1567:1: ( (lv_bl_4_0= ruleBlock ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1568:1: (lv_bl_4_0= ruleBlock )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1568:1: (lv_bl_4_0= ruleBlock )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1569:3: lv_bl_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getBlBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleWhile3420);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1593:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1594:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1595:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3456);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3466); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1602:1: ruleValue returns [EObject current=null] : (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;

        EObject this_VarReference_1 = null;

        EObject this_BasicValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1605:28: ( (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1606:1: (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1606:1: (this_Call_0= ruleCall | this_VarReference_1= ruleVarReference | this_BasicValue_2= ruleBasicValue )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_LOWERFIRST:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==EOF||(LA26_1>=RULE_CAPITALFIRST && LA26_1<=RULE_LOWERFIRST)||(LA26_1>=16 && LA26_1<=19)||LA26_1==21||(LA26_1>=24 && LA26_1<=37)||LA26_1==40||(LA26_1>=42 && LA26_1<=44)) ) {
                    alt26=2;
                }
                else if ( (LA26_1==15) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAPITALFIRST:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 38:
            case 39:
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1607:5: this_Call_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleValue3513);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1617:5: this_VarReference_1= ruleVarReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getVarReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarReference_in_ruleValue3540);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1627:5: this_BasicValue_2= ruleBasicValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBasicValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicValue_in_ruleValue3567);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1643:1: entryRuleBasicValue returns [EObject current=null] : iv_ruleBasicValue= ruleBasicValue EOF ;
    public final EObject entryRuleBasicValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1644:2: (iv_ruleBasicValue= ruleBasicValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1645:2: iv_ruleBasicValue= ruleBasicValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicValueRule()); 
            }
            pushFollow(FOLLOW_ruleBasicValue_in_entryRuleBasicValue3602);
            iv_ruleBasicValue=ruleBasicValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicValue3612); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1652:1: ruleBasicValue returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleBasicValue() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_NumberValue_1 = null;

        EObject this_StringValue_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1655:28: ( (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1656:1: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1656:1: (this_BooleanValue_0= ruleBooleanValue | this_NumberValue_1= ruleNumberValue | this_StringValue_2= ruleStringValue )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
                {
                alt27=3;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1657:5: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getBooleanValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleBasicValue3659);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1667:5: this_NumberValue_1= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getNumberValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_ruleBasicValue3686);
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1677:5: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicValueAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleBasicValue3713);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1693:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1694:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1695:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3748);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue3758); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1702:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1705:28: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1706:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1706:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1707:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1707:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1708:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1708:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1709:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,38,FOLLOW_38_in_ruleBooleanValue3802); if (state.failed) return current;
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1721:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,39,FOLLOW_39_in_ruleBooleanValue3831); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1744:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1745:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1746:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue3882);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue3892); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1753:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1756:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1757:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1757:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1758:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1758:1: (lv_value_0_0= RULE_STRING )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1759:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue3933); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1783:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1784:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1785:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue3973);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue3983); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1792:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleINTSTRING ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1795:28: ( ( (lv_value_0_0= ruleINTSTRING ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1796:1: ( (lv_value_0_0= ruleINTSTRING ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1796:1: ( (lv_value_0_0= ruleINTSTRING ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1797:1: (lv_value_0_0= ruleINTSTRING )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1797:1: (lv_value_0_0= ruleINTSTRING )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1798:3: lv_value_0_0= ruleINTSTRING
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValueAccess().getValueINTSTRINGParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_ruleNumberValue4028);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1822:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1823:2: (iv_ruleVarReference= ruleVarReference EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1824:2: iv_ruleVarReference= ruleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVarReference_in_entryRuleVarReference4063);
            iv_ruleVarReference=ruleVarReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarReference4073); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1831:1: ruleVarReference returns [EObject current=null] : ( (otherlv_0= RULE_LOWERFIRST ) ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1834:28: ( ( (otherlv_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1835:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1835:1: ( (otherlv_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1836:1: (otherlv_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1836:1: (otherlv_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1837:3: otherlv_0= RULE_LOWERFIRST
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleVarReference4117); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1856:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1857:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1858:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration4152);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration4162); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1865:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1868:28: ( ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1869:1: ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1869:1: ( ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1869:2: ( (lv_type_0_0= ruleDatatype ) ) ( (lv_name_1_0= RULE_LOWERFIRST ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1869:2: ( (lv_type_0_0= ruleDatatype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1870:1: (lv_type_0_0= ruleDatatype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1870:1: (lv_type_0_0= ruleDatatype )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1871:3: lv_type_0_0= ruleDatatype
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDatatypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDatatype_in_ruleDeclaration4208);
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

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1887:2: ( (lv_name_1_0= RULE_LOWERFIRST ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1888:1: (lv_name_1_0= RULE_LOWERFIRST )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1888:1: (lv_name_1_0= RULE_LOWERFIRST )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1889:3: lv_name_1_0= RULE_LOWERFIRST
            {
            lv_name_1_0=(Token)match(input,RULE_LOWERFIRST,FOLLOW_RULE_LOWERFIRST_in_ruleDeclaration4225); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1913:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1914:2: (iv_ruleReturn= ruleReturn EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1915:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn4266);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn4276); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1922:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1925:28: ( (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1926:1: (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1926:1: (otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1926:3: otherlv_0= 'return' ( (lv_val_1_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleReturn4313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
                  
            }
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1930:1: ( (lv_val_1_0= ruleValue ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1931:1: (lv_val_1_0= ruleValue )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1931:1: (lv_val_1_0= ruleValue )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1932:3: lv_val_1_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getValValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleReturn4334);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1956:1: entryRuleMethodtype returns [String current=null] : iv_ruleMethodtype= ruleMethodtype EOF ;
    public final String entryRuleMethodtype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodtype = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1957:2: (iv_ruleMethodtype= ruleMethodtype EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1958:2: iv_ruleMethodtype= ruleMethodtype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodtypeRule()); 
            }
            pushFollow(FOLLOW_ruleMethodtype_in_entryRuleMethodtype4371);
            iv_ruleMethodtype=ruleMethodtype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodtype.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodtype4382); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1965:1: ruleMethodtype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | this_Datatype_1= ruleDatatype ) ;
    public final AntlrDatatypeRuleToken ruleMethodtype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Datatype_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1968:28: ( (kw= 'void' | this_Datatype_1= ruleDatatype ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1969:1: (kw= 'void' | this_Datatype_1= ruleDatatype )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1969:1: (kw= 'void' | this_Datatype_1= ruleDatatype )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=42 && LA29_0<=44)) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1970:2: kw= 'void'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleMethodtype4420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodtypeAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1977:5: this_Datatype_1= ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodtypeAccess().getDatatypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_ruleMethodtype4448);
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1995:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1996:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1997:2: iv_ruleDatatype= ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype4494);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatype.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype4505); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2004:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2007:28: ( (kw= 'int' | kw= 'string' | kw= 'boolean' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2008:1: (kw= 'int' | kw= 'string' | kw= 'boolean' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2008:1: (kw= 'int' | kw= 'string' | kw= 'boolean' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt30=1;
                }
                break;
            case 43:
                {
                alt30=2;
                }
                break;
            case 44:
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
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2009:2: kw= 'int'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleDatatype4543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2016:2: kw= 'string'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleDatatype4562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2023:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleDatatype4581); if (state.failed) return current;
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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2036:1: entryRuleINTSTRING returns [String current=null] : iv_ruleINTSTRING= ruleINTSTRING EOF ;
    public final String entryRuleINTSTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTSTRING = null;


        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2037:2: (iv_ruleINTSTRING= ruleINTSTRING EOF )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2038:2: iv_ruleINTSTRING= ruleINTSTRING EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTSTRINGRule()); 
            }
            pushFollow(FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING4622);
            iv_ruleINTSTRING=ruleINTSTRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTSTRING.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTSTRING4633); if (state.failed) return current;

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
    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2045:1: ruleINTSTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleINTSTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2048:28: (this_INT_0= RULE_INT )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2049:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTSTRING4672); if (state.failed) return current;
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
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1105:4: ( ( ruleComparisonOperator ) )
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1106:1: ( ruleComparisonOperator )
        {
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1106:1: ( ruleComparisonOperator )
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1107:1: ruleComparisonOperator
        {
        pushFollow(FOLLOW_ruleComparisonOperator_in_synpred2_InternalCommonlang2386);
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
    public static final BitSet FOLLOW_ruleScript_in_ruleCLfile132 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_ruleCLfile151 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScript237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleScript254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScript271 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleScript285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript302 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScript319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript336 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15_in_ruleScript361 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleScript374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript391 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleScript408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleScript425 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleScript442 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleScript458 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleScript470 = new BitSet(new long[]{0x00001E0000080000L});
    public static final BitSet FOLLOW_ruleUserMethod_in_ruleScript491 = new BitSet(new long[]{0x00001E0000080000L});
    public static final BitSet FOLLOW_19_in_ruleScript504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethods_in_entryRuleMetaMethods540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethods550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMetaMethods587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleMetaMethods604 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetaMethods621 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_ruleMetaMethods642 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_19_in_ruleMetaMethods655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBlock747 = new BitSet(new long[]{0x00001F3C000C0030L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleBlock770 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBlock782 = new BitSet(new long[]{0x00001F3C000C0030L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleBlock810 = new BitSet(new long[]{0x00001F3C000C0030L});
    public static final BitSet FOLLOW_19_in_ruleBlock824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleSimpleExpression917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleSimpleExpression944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleSimpleExpression971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_entryRuleStructureExpression1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureExpression1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStructureExpression1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleStructureExpression1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_ruleStructureExpression1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleStructureExpression1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleStructureExpression1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureExpression_in_ruleExpression1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleAssignment1382 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleAssignment1401 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1425 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignment1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_ruleCall1542 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_ruleCall1569 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCall1581 = new BitSet(new long[]{0x000000C0000300F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCall1602 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCall1617 = new BitSet(new long[]{0x000000C0000100F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCall1640 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleCall1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethod_in_entryRuleMetaMethod1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethod1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMetaMethod1739 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_ruleMethodtype_in_ruleMetaMethod1760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethod1777 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaMethod1794 = new BitSet(new long[]{0x00001E0000030020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMetaMethod1815 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMetaMethod1830 = new BitSet(new long[]{0x00001E0000010020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMetaMethod1853 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMetaMethod1867 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMetaMethod1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethod_in_entryRuleUserMethod1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethod1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_ruleUserMethod1971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleUserMethod1988 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUserMethod2005 = new BitSet(new long[]{0x00001E0000030020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleUserMethod2026 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleUserMethod2041 = new BitSet(new long[]{0x00001E0000010020L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleUserMethod2064 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleUserMethod2078 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleUserMethod2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserMethodCall_in_entryRuleUserMethodCall2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserMethodCall2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleUserMethodCall2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaMethodCall_in_entryRuleMetaMethodCall2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaMethodCall2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALFIRST_in_ruleMetaMethodCall2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBool2371 = new BitSet(new long[]{0x00000003FF000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleBool2403 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBool2424 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_ruleBool2448 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleBool2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_entryRuleComparisonOperator2508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperator2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComparisonOperator2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComparisonOperator2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComparisonOperator2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComparisonOperator2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComparisonOperator2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleComparisonOperator2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOperator_in_entryRuleBooleanOperator2693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOperator2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBooleanOperator2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBooleanOperator2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBooleanOperator2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBooleanOperator2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleIf2886 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIf2898 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleIf2919 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIf2931 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIf2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElse_in_entryRuleElse2988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElse2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleElse3035 = new BitSet(new long[]{0x00001F3C00040030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElse3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor3092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFor3139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFor3151 = new BitSet(new long[]{0x00001F3C00040030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor3172 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFor3184 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleFor3205 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFor3217 = new BitSet(new long[]{0x00001F3C00040030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor3238 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFor3250 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFor3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile3307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleWhile3354 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWhile3366 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleBool_in_ruleWhile3387 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhile3399 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleWhile3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleValue3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_ruleValue3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_ruleValue3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicValue_in_entryRuleBasicValue3602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicValue3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleBasicValue3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleBasicValue3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleBasicValue3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBooleanValue3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBooleanValue3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue3882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue3973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_ruleNumberValue4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarReference_in_entryRuleVarReference4063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarReference4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleVarReference4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration4152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleDeclaration4208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LOWERFIRST_in_ruleDeclaration4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn4266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleReturn4313 = new BitSet(new long[]{0x000000C0000000F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleReturn4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodtype_in_entryRuleMethodtype4371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodtype4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleMethodtype4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleMethodtype4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDatatype4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDatatype4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDatatype4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTSTRING_in_entryRuleINTSTRING4622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTSTRING4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTSTRING4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_synpred2_InternalCommonlang2386 = new BitSet(new long[]{0x0000000000000002L});

}