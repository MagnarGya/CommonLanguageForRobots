package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommonlangLexer extends Lexer {
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

    public InternalCommonlangLexer() {;} 
    public InternalCommonlangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCommonlangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:11:7: ( 'script' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:11:9: 'script'
            {
            match("script"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:12:7: ( 'targets' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:12:9: 'targets'
            {
            match("targets"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:13:7: ( '(' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:14:7: ( ',' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:15:7: ( ')' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:16:7: ( '{' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:17:7: ( '}' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:18:7: ( 'metamethodscollection' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:18:9: 'metamethodscollection'
            {
            match("metamethodscollection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:19:7: ( ';' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:20:7: ( '=' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:21:7: ( 'meta' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:21:9: 'meta'
            {
            match("meta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:22:7: ( '-' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:23:7: ( '==' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:23:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:24:7: ( '!=' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:24:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:25:7: ( '<' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:26:7: ( '>' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:27:7: ( '<=' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:27:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:28:7: ( '>=' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:28:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:29:7: ( '&&' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:29:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:30:7: ( '||' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:30:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:31:7: ( '!&&' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:31:9: '!&&'
            {
            match("!&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:32:7: ( '!||' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:32:9: '!||'
            {
            match("!||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:33:7: ( '+' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:33:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:34:7: ( '*' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:34:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:35:7: ( '/' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:35:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:36:7: ( '++' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:36:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:37:7: ( '--' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:37:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:38:7: ( 'if' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:38:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:39:7: ( 'else' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:39:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:40:7: ( 'for' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:40:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:41:7: ( 'while' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:41:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:42:7: ( 'true' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:42:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:43:7: ( 'false' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:43:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:44:7: ( 'return' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:44:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:45:7: ( 'void' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:45:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:46:7: ( 'int' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:46:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:47:7: ( 'string' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:47:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:48:7: ( 'boolean' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:48:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_LOWERFIRST"
    public final void mRULE_LOWERFIRST() throws RecognitionException {
        try {
            int _type = RULE_LOWERFIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2574:17: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2574:19: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2574:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWERFIRST"

    // $ANTLR start "RULE_CAPITALFIRST"
    public final void mRULE_CAPITALFIRST() throws RecognitionException {
        try {
            int _type = RULE_CAPITALFIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2576:19: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2576:21: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2576:30: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CAPITALFIRST"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2578:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2578:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2578:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2578:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2578:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2580:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2580:12: ( '0' .. '9' )+
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2580:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2580:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2582:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2584:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2584:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2584:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2584:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2586:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2588:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2588:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2588:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2590:16: ( . )
            // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:2590:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_LOWERFIRST | RULE_CAPITALFIRST | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=47;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:238: RULE_LOWERFIRST
                {
                mRULE_LOWERFIRST(); 

                }
                break;
            case 40 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:254: RULE_CAPITALFIRST
                {
                mRULE_CAPITALFIRST(); 

                }
                break;
            case 41 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:272: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:280: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 43 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:289: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:301: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:317: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:333: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // ../org.xtext.commonlang/src-gen/org/xtext/parser/antlr/internal/InternalCommonlang.g:1:341: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\47\5\uffff\1\47\1\uffff\1\62\1\64\1\43\1\71\1\73\2\43"+
        "\1\77\1\uffff\1\103\10\47\1\115\1\43\2\uffff\2\43\2\uffff\3\47\1"+
        "\uffff\2\47\5\uffff\1\47\24\uffff\1\130\10\47\1\uffff\1\115\4\uffff"+
        "\5\47\1\uffff\1\146\1\47\1\150\10\47\1\161\1\163\1\uffff\1\164\1"+
        "\uffff\3\47\1\170\4\47\1\uffff\1\47\2\uffff\1\176\1\177\1\47\1\uffff"+
        "\1\47\1\u0082\1\u0083\2\47\2\uffff\1\u0086\1\47\2\uffff\1\u0088"+
        "\1\47\1\uffff\1\u008a\1\uffff\1\47\1\uffff\14\47\1\u0098\1\uffff";
    static final String DFA14_eofS =
        "\u0099\uffff";
    static final String DFA14_minS =
        "\1\0\2\60\5\uffff\1\60\1\uffff\1\75\1\55\1\46\2\75\1\46\1\174\1"+
        "\53\1\uffff\1\52\11\60\1\101\2\uffff\2\0\2\uffff\3\60\1\uffff\2"+
        "\60\5\uffff\1\60\24\uffff\11\60\1\uffff\1\60\4\uffff\5\60\1\uffff"+
        "\15\60\1\uffff\1\60\1\uffff\10\60\1\uffff\1\60\2\uffff\3\60\1\uffff"+
        "\5\60\2\uffff\2\60\2\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\15\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\172\5\uffff\1\172\1\uffff\1\75\1\55\1\174\2\75\1\46"+
        "\1\174\1\53\1\uffff\1\57\12\172\2\uffff\2\uffff\2\uffff\3\172\1"+
        "\uffff\2\172\5\uffff\1\172\24\uffff\11\172\1\uffff\1\172\4\uffff"+
        "\5\172\1\uffff\15\172\1\uffff\1\172\1\uffff\10\172\1\uffff\1\172"+
        "\2\uffff\3\172\1\uffff\5\172\2\uffff\2\172\2\uffff\2\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\15\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\10\uffff\1\30\13\uffff"+
        "\1\51\1\52\2\uffff\1\56\1\57\3\uffff\1\47\2\uffff\1\3\1\4\1\5\1"+
        "\6\1\7\1\uffff\1\11\1\15\1\12\1\33\1\14\1\16\1\25\1\26\1\21\1\17"+
        "\1\22\1\20\1\23\1\24\1\32\1\27\1\30\1\54\1\55\1\31\11\uffff\1\50"+
        "\1\uffff\1\51\1\52\1\53\1\56\5\uffff\1\34\15\uffff\1\44\1\uffff"+
        "\1\36\10\uffff\1\40\1\uffff\1\13\1\35\3\uffff\1\43\5\uffff\1\41"+
        "\1\37\2\uffff\1\1\1\45\2\uffff\1\42\1\uffff\1\2\1\uffff\1\46\15"+
        "\uffff\1\10";
    static final String DFA14_specialS =
        "\1\2\37\uffff\1\1\1\0\167\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\14\1\40\3\43\1\17\1\41\1"+
            "\3\1\5\1\22\1\21\1\4\1\13\1\43\1\23\12\37\1\43\1\11\1\15\1\12"+
            "\1\16\2\43\32\34\3\43\1\35\1\36\1\43\1\33\1\32\2\33\1\25\1\26"+
            "\2\33\1\24\3\33\1\10\4\33\1\30\1\1\1\2\1\33\1\31\1\27\3\33\1"+
            "\6\1\20\1\7\uff82\43",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\44\20\46"+
            "\1\45\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\50\20\46\1\51"+
            "\10\46",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\57\25\46",
            "",
            "\1\61",
            "\1\63",
            "\1\66\26\uffff\1\65\76\uffff\1\67",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\101\4\uffff\1\102",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\5\46\1\104\7\46"+
            "\1\105\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\106\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\110\15\46\1\107"+
            "\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46\1\111\22\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\112\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\113\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\114\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\32\116",
            "\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "\0\121",
            "\0\121",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\123\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\124\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\125\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46\1\126\5\46",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\127\6\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\131\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\132\7\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\133\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\134\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\135\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\136\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\137\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\140\13\46",
            "",
            "\12\116\7\uffff\32\116\4\uffff\1\116\1\uffff\32\116",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\141\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\142\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46\1\143\23\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\144\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\145\31\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\147\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\151\7\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\152\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46\1\153\5\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\154\26\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\155\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\156\12\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\157\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\160\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\14\46\1\162\15\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\165\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\166\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\167\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\171\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\172\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46\1\173\23\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\174\6\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\175\25\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u0080\14"+
            "\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\u0081\31\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u0084\7"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\u0085\6"+
            "\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u0087\14"+
            "\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46\1\u0089\22"+
            "\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\u008b\13"+
            "\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\u008c\26"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\u008d\7"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\u008e\27"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\u008f\13"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\u0090\16"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\u0091\16"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u0092\25"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\u0093\27"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\u0094\6"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\u0095\21"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\u0096\13"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u0097\14"+
            "\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_LOWERFIRST | RULE_CAPITALFIRST | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( ((LA14_33>='\u0000' && LA14_33<='\uFFFF')) ) {s = 81;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 81;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='s') ) {s = 1;}

                        else if ( (LA14_0=='t') ) {s = 2;}

                        else if ( (LA14_0=='(') ) {s = 3;}

                        else if ( (LA14_0==',') ) {s = 4;}

                        else if ( (LA14_0==')') ) {s = 5;}

                        else if ( (LA14_0=='{') ) {s = 6;}

                        else if ( (LA14_0=='}') ) {s = 7;}

                        else if ( (LA14_0=='m') ) {s = 8;}

                        else if ( (LA14_0==';') ) {s = 9;}

                        else if ( (LA14_0=='=') ) {s = 10;}

                        else if ( (LA14_0=='-') ) {s = 11;}

                        else if ( (LA14_0=='!') ) {s = 12;}

                        else if ( (LA14_0=='<') ) {s = 13;}

                        else if ( (LA14_0=='>') ) {s = 14;}

                        else if ( (LA14_0=='&') ) {s = 15;}

                        else if ( (LA14_0=='|') ) {s = 16;}

                        else if ( (LA14_0=='+') ) {s = 17;}

                        else if ( (LA14_0=='*') ) {s = 18;}

                        else if ( (LA14_0=='/') ) {s = 19;}

                        else if ( (LA14_0=='i') ) {s = 20;}

                        else if ( (LA14_0=='e') ) {s = 21;}

                        else if ( (LA14_0=='f') ) {s = 22;}

                        else if ( (LA14_0=='w') ) {s = 23;}

                        else if ( (LA14_0=='r') ) {s = 24;}

                        else if ( (LA14_0=='v') ) {s = 25;}

                        else if ( (LA14_0=='b') ) {s = 26;}

                        else if ( (LA14_0=='a'||(LA14_0>='c' && LA14_0<='d')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='q')||LA14_0=='u'||(LA14_0>='x' && LA14_0<='z')) ) {s = 27;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 28;}

                        else if ( (LA14_0=='^') ) {s = 29;}

                        else if ( (LA14_0=='_') ) {s = 30;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 31;}

                        else if ( (LA14_0=='\"') ) {s = 32;}

                        else if ( (LA14_0=='\'') ) {s = 33;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 34;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||LA14_0=='.'||LA14_0==':'||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}