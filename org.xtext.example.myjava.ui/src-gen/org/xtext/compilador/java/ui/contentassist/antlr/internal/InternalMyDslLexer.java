package org.xtext.compilador.java.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_STATIC=5;
    public static final int EOF=-1;
    public static final int RULE_MOD=4;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:11:7: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:12:7: ( 'boolean' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:12:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:13:7: ( 'byte' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:13:9: 'byte'
            {
            match("byte"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:14:7: ( 'char' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:14:9: 'char'
            {
            match("char"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:15:7: ( 'short' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:15:9: 'short'
            {
            match("short"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:16:7: ( 'int' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:16:9: 'int'
            {
            match("int"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:17:7: ( 'float' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:17:9: 'float'
            {
            match("float"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:18:7: ( 'long' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:18:9: 'long'
            {
            match("long"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:19:7: ( 'double' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:19:9: 'double'
            {
            match("double"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:20:7: ( 'default:' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:20:9: 'default:'
            {
            match("default:"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:21:7: ( 'interface' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:21:9: 'interface'
            {
            match("interface"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:22:7: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:22:9: '{'
            {
            match('{'); 

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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:23:7: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:23:9: '}'
            {
            match('}'); 

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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:24:7: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:24:9: 'extends'
            {
            match("extends"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:25:7: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:25:9: ','
            {
            match(','); 

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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:26:7: ( 'class' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:26:9: 'class'
            {
            match("class"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:27:7: ( 'implements' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:27:9: 'implements'
            {
            match("implements"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:28:7: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:28:9: '('
            {
            match('('); 

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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:29:7: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:29:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:30:7: ( '[]' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:30:9: '[]'
            {
            match("[]"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:31:7: ( 'synchronized(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:31:9: 'synchronized('
            {
            match("synchronized("); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:32:7: ( 'return' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:32:9: 'return'
            {
            match("return"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:33:7: ( 'throw' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:33:9: 'throw'
            {
            match("throw"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:34:7: ( ':' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:34:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:35:7: ( 'break' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:35:9: 'break'
            {
            match("break"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:36:7: ( 'continue' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:36:9: 'continue'
            {
            match("continue"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:37:7: ( 'switch(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:37:9: 'switch('
            {
            match("switch("); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:38:7: ( '){' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:38:9: '){'
            {
            match("){"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:39:7: ( 'case' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:39:9: 'case'
            {
            match("case"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:40:7: ( 'while(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:40:9: 'while('
            {
            match("while("); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:41:7: ( 'do' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:41:9: 'do'
            {
            match("do"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:42:7: ( ');' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:42:9: ');'
            {
            match(");"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:43:7: ( 'if(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:43:9: 'if('
            {
            match("if("); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:44:7: ( 'else' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:44:9: 'else'
            {
            match("else"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:45:7: ( 'try' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:45:9: 'try'
            {
            match("try"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:46:7: ( 'catch' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:46:9: 'catch'
            {
            match("catch"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:47:7: ( 'finally' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:47:9: 'finally'
            {
            match("finally"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:48:7: ( 'import' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:48:9: 'import'
            {
            match("import"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:49:7: ( '.*;' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:49:9: '.*;'
            {
            match(".*;"); 


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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:50:7: ( 'package' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:50:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:51:7: ( '.' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:51:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6605:13: ( 'static' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6605:15: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC"

    // $ANTLR start "RULE_MOD"
    public final void mRULE_MOD() throws RecognitionException {
        try {
            int _type = RULE_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:10: ( ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            int alt1=9;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:13: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:22: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:32: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:44: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:52: 'native'
                    {
                    match("native"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:61: 'synchronized'
                    {
                    match("synchronized"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:76: 'abstract'
                    {
                    match("abstract"); 


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:87: 'threadsafe'
                    {
                    match("threadsafe"); 


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6607:100: 'transient'
                    {
                    match("transient"); 


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
    // $ANTLR end "RULE_MOD"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6609:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6609:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6609:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6611:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6611:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6611:24: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6611:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6613:41: '\\r'
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
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6615:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6615:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_DOC_COMMENT"
    public final void mRULE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6617:18: ( '/**' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6617:20: '/**'
            {
            match("/**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_COMMENT"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_STATIC | RULE_MOD | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOC_COMMENT )
        int alt7=48;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:256: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:268: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:277: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:285: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:301: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:317: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1:325: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\141\1\162\4\uffff\1\150\1\uffff\1\151\4\uffff";
    static final String DFA1_maxS =
        "\1\164\1\165\4\uffff\1\162\1\uffff\1\157\4\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\1\1\uffff\1\10\1\11\1\2\1\3";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\4\uffff\1\2\7\uffff\1\3\1\uffff\1\1\2\uffff\1\4\1\6",
            "\1\10\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\11\11\uffff\1\12",
            "",
            "\1\13\5\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "6607:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )";
        }
    }
    static final String DFA7_eotS =
        "\2\uffff\7\30\2\uffff\1\30\2\uffff\1\62\1\uffff\2\30\1\uffff\1"+
        "\30\1\70\3\30\3\uffff\21\30\1\123\3\30\3\uffff\4\30\2\uffff\5\30"+
        "\2\uffff\14\30\1\161\1\30\1\uffff\4\30\1\uffff\5\30\1\176\10\30"+
        "\1\u0087\1\uffff\1\30\1\u0089\1\30\1\u008b\2\30\1\u008e\6\30\1\uffff"+
        "\4\30\1\u0099\3\30\1\u009d\3\30\1\uffff\10\30\1\uffff\1\30\1\uffff"+
        "\1\u00aa\1\uffff\1\u00ab\1\30\1\uffff\1\u00ad\1\u00ae\6\30\1\u00b5"+
        "\1\u00b7\1\uffff\3\30\1\uffff\1\30\1\u00bc\12\30\2\uffff\1\30\2"+
        "\uffff\2\30\1\u00ca\2\30\1\u00cd\1\uffff\1\30\1\uffff\1\u00cf\2"+
        "\30\1\u00d2\1\uffff\2\30\1\uffff\1\30\1\u00b7\2\30\1\u00b7\1\30"+
        "\1\u00d9\2\30\2\uffff\2\30\1\uffff\1\u00de\1\uffff\1\30\1\u00e0"+
        "\1\uffff\2\30\1\u00e3\1\u00b7\2\30\1\uffff\1\u00e6\3\30\3\uffff"+
        "\2\30\1\uffff\1\30\1\u00b7\1\uffff\1\30\1\u00ee\2\30\2\u00b7\1\30"+
        "\1\uffff\1\u00f2\1\u00b7\1\30\1\uffff\1\u00b7\1\uffff";
    static final String DFA7_eofS =
        "\u00f5\uffff";
    static final String DFA7_minS =
        "\1\11\1\uffff\1\157\1\141\1\150\1\146\1\151\1\157\1\145\2\uffff"+
        "\1\154\2\uffff\1\73\1\uffff\1\145\1\150\1\uffff\1\150\1\52\2\141"+
        "\1\142\1\uffff\1\52\1\uffff\1\157\1\164\1\145\2\141\1\156\1\163"+
        "\1\157\1\156\1\151\1\141\1\164\1\160\1\50\1\157\2\156\1\44\1\146"+
        "\1\164\1\163\3\uffff\1\164\1\162\1\141\1\151\2\uffff\1\143\1\142"+
        "\1\151\1\164\1\163\1\0\1\uffff\1\154\1\145\1\141\1\162\1\163\1\164"+
        "\1\145\1\143\1\162\1\143\2\164\1\44\1\154\1\uffff\2\141\1\147\1"+
        "\142\1\uffff\1\141\2\145\1\165\1\145\1\44\1\156\1\154\1\153\1\154"+
        "\1\166\1\164\1\151\1\164\1\0\1\uffff\1\145\1\44\1\153\1\44\1\163"+
        "\1\151\1\44\1\150\1\164\1\150\1\143\1\151\1\162\1\uffff\1\145\1"+
        "\162\1\164\1\154\1\44\1\154\1\165\1\156\1\44\1\162\1\167\1\141\1"+
        "\uffff\1\163\1\145\1\141\1\151\1\141\1\145\1\166\1\162\1\uffff\1"+
        "\141\1\uffff\1\44\1\uffff\1\44\1\156\1\uffff\2\44\1\162\1\150\1"+
        "\143\1\146\1\155\1\164\2\44\1\uffff\1\145\1\154\1\144\1\uffff\1"+
        "\156\1\44\1\144\1\151\1\50\1\147\1\143\1\164\1\143\1\145\1\141\1"+
        "\156\2\uffff\1\165\2\uffff\1\157\1\50\1\44\1\141\1\145\1\44\1\uffff"+
        "\1\171\1\uffff\1\44\1\164\1\163\1\44\1\uffff\1\163\1\145\1\uffff"+
        "\1\145\1\44\1\145\1\164\1\44\1\143\1\44\1\145\1\156\2\uffff\1\143"+
        "\1\156\1\uffff\1\44\1\uffff\1\72\1\44\1\uffff\1\141\1\156\2\44\1"+
        "\145\1\164\1\uffff\1\44\1\151\1\145\1\164\3\uffff\1\146\1\164\1"+
        "\uffff\1\144\1\44\1\uffff\1\172\1\44\1\163\1\145\2\44\1\145\1\uffff"+
        "\2\44\1\144\1\uffff\1\44\1\uffff";
    static final String DFA7_maxS =
        "\1\175\1\uffff\1\171\1\157\1\171\1\156\1\154\2\157\2\uffff\1\170"+
        "\2\uffff\1\173\1\uffff\1\145\1\162\1\uffff\1\150\1\52\1\165\1\141"+
        "\1\142\1\uffff\1\57\1\uffff\1\157\1\164\1\145\2\141\1\156\1\164"+
        "\1\157\1\156\1\151\1\141\1\164\1\160\1\50\1\157\2\156\1\uffff\1"+
        "\146\1\164\1\163\3\uffff\1\164\1\162\1\171\1\151\2\uffff\1\143\1"+
        "\142\1\157\1\164\1\163\1\uffff\1\uffff\1\154\1\145\1\141\1\162\1"+
        "\163\1\164\1\145\1\143\1\162\1\143\2\164\1\uffff\1\157\1\uffff\2"+
        "\141\1\147\1\142\1\uffff\1\141\2\145\1\165\1\157\1\uffff\1\156\1"+
        "\154\1\153\1\154\1\166\1\164\1\151\1\164\1\uffff\1\uffff\1\145\1"+
        "\uffff\1\153\1\uffff\1\163\1\151\1\uffff\1\150\1\164\1\150\1\143"+
        "\1\151\1\162\1\uffff\1\145\1\162\1\164\1\154\1\uffff\1\154\1\165"+
        "\1\156\1\uffff\1\162\1\167\1\141\1\uffff\1\163\1\145\1\141\1\151"+
        "\1\141\1\145\1\166\1\162\1\uffff\1\141\1\uffff\1\uffff\1\uffff\1"+
        "\uffff\1\156\1\uffff\2\uffff\1\162\1\150\1\143\1\146\1\155\1\164"+
        "\2\uffff\1\uffff\1\145\1\154\1\144\1\uffff\1\156\1\uffff\1\144\1"+
        "\151\1\50\1\147\1\143\1\164\1\143\1\145\1\141\1\156\2\uffff\1\165"+
        "\2\uffff\1\157\1\50\1\uffff\1\141\1\145\1\uffff\1\uffff\1\171\1"+
        "\uffff\1\uffff\1\164\1\163\1\uffff\1\uffff\1\163\1\145\1\uffff\1"+
        "\145\1\uffff\1\145\1\164\1\uffff\1\143\1\uffff\1\145\1\156\2\uffff"+
        "\1\143\1\156\1\uffff\1\uffff\1\uffff\1\72\1\uffff\1\uffff\1\141"+
        "\1\156\2\uffff\1\145\1\164\1\uffff\1\uffff\1\151\1\145\1\164\3\uffff"+
        "\1\146\1\164\1\uffff\1\144\1\uffff\1\uffff\1\172\1\uffff\1\163\1"+
        "\145\2\uffff\1\145\1\uffff\2\uffff\1\144\1\uffff\1\uffff\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\7\uffff\1\14\1\15\1\uffff\1\17\1\22\1\uffff\1\24\2"+
        "\uffff\1\30\5\uffff\1\54\1\uffff\1\57\25\uffff\1\34\1\40\1\23\4"+
        "\uffff\1\47\1\51\6\uffff\1\56\16\uffff\1\41\4\uffff\1\37\17\uffff"+
        "\1\55\15\uffff\1\6\14\uffff\1\43\10\uffff\1\60\1\uffff\1\3\1\uffff"+
        "\1\4\2\uffff\1\35\12\uffff\1\10\3\uffff\1\42\14\uffff\1\31\1\20"+
        "\1\uffff\1\44\1\5\6\uffff\1\7\1\uffff\1\53\4\uffff\1\27\2\uffff"+
        "\1\36\11\uffff\1\33\1\52\2\uffff\1\46\1\uffff\1\11\2\uffff\1\26"+
        "\6\uffff\1\2\4\uffff\1\45\1\12\1\16\2\uffff\1\50\2\uffff\1\32\7"+
        "\uffff\1\13\3\uffff\1\21\1\uffff\1\25";
    static final String DFA7_specialS =
        "\76\uffff\1\0\43\uffff\1\1\u0092\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\3\uffff\1\30\3\uffff\1\15"+
            "\1\16\2\uffff\1\14\1\uffff\1\24\1\31\12\uffff\1\22\1\1\5\uffff"+
            "\32\30\1\17\3\uffff\1\30\1\uffff\1\27\1\2\1\3\1\10\1\13\1\6"+
            "\2\30\1\5\2\30\1\7\1\30\1\26\1\30\1\25\1\30\1\20\1\4\1\21\2"+
            "\30\1\23\3\30\1\11\1\uffff\1\12",
            "",
            "\1\33\2\uffff\1\35\6\uffff\1\34",
            "\1\41\6\uffff\1\36\3\uffff\1\37\2\uffff\1\40",
            "\1\42\13\uffff\1\45\2\uffff\1\44\1\uffff\1\43",
            "\1\50\6\uffff\1\47\1\46",
            "\1\52\2\uffff\1\51",
            "\1\53",
            "\1\55\11\uffff\1\54",
            "",
            "",
            "\1\57\13\uffff\1\56",
            "",
            "",
            "\1\61\77\uffff\1\60",
            "",
            "\1\63",
            "\1\64\11\uffff\1\65",
            "",
            "\1\66",
            "\1\67",
            "\1\71\20\uffff\1\73\2\uffff\1\72",
            "\1\74",
            "\1\75",
            "",
            "\1\76\4\uffff\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\24"+
            "\30\1\122\5\30\105\uffff\uff40\30",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\132\27\uffff\1\131",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136\5\uffff\1\137",
            "\1\140",
            "\1\141",
            "\52\143\1\142\uffd5\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4"+
            "\30\1\160\25\30\105\uffff\uff40\30",
            "\1\162\2\uffff\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\175\11\uffff\1\174",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\0\143",
            "",
            "\1\u0088",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u008a",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u008c",
            "\1\u008d",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00ac",
            "",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\13"+
            "\30\1\u00b6\16\30\105\uffff\uff40\30",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "\1\u00c7",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00cb",
            "\1\u00cc",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "",
            "\1\u00ce",
            "",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00d0",
            "\1\u00d1",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00d6",
            "\1\u00d7",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00d8",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00da",
            "\1\u00db",
            "",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "",
            "\1\u00df",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "",
            "\1\u00ed",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00ef",
            "\1\u00f0",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00f1",
            "",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\30\13\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32"+
            "\30\105\uffff\uff40\30",
            "\1\u00f3",
            "",
            "\1\30\3\uffff\1\u00f4\7\uffff\12\30\7\uffff\32\30\4\uffff"+
            "\1\30\1\uffff\32\30\105\uffff\uff40\30",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_STATIC | RULE_MOD | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOC_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_62 = input.LA(1);

                        s = -1;
                        if ( (LA7_62=='*') ) {s = 98;}

                        else if ( ((LA7_62>='\u0000' && LA7_62<=')')||(LA7_62>='+' && LA7_62<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_98 = input.LA(1);

                        s = -1;
                        if ( ((LA7_98>='\u0000' && LA7_98<='\uFFFF')) ) {s = 99;}

                        else s = 135;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}