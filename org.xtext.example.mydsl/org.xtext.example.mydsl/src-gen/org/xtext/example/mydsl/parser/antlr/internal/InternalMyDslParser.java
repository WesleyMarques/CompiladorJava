package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_INTERFACE", "RULE_ID", "RULE_EXTENDS", "RULE_R_CURLY_BRACE", "RULE_L_CURLY_BRACE", "RULE_LPAREN", "RULE_RPAREN", "RULE_MOD", "RULE_STATIC", "RULE_COLON", "RULE_NULL", "RULE_SUPER", "RULE_THIS", "RULE_INSTANCEOF", "RULE_INCREMENT", "RULE_DECREMENT", "RULE_PLUS_EQUAL", "RULE_MINUS_EQUAL", "RULE_MULTIPLY", "RULE_MULTIPLY_EQUAL", "RULE_DIVIDE", "RULE_DIVIDE_EQUAL", "RULE_MODULE", "RULE_MODULE_EQUAL", "RULE_BT", "RULE_ST", "RULE_BE", "RULE_SE", "RULE_DOUBLE_EQUAL", "RULE_DIFFERENT", "RULE_OR", "RULE_OR_EQUAL", "RULE_EXP", "RULE_EXP_EQUAL", "RULE_DOUBLE_OR_EQUAL", "RULE_WAT", "RULE_R_SHIFT_EQUAL", "RULE_L_SHIFT", "RULE_R_SHIFT", "RULE_SUPER_SHIFT", "RULE_AMPERSAND", "RULE_DECIMAL_DIGITS", "RULE_FLOAT_TYPE_SUFIX", "RULE_HEXA", "RULE_LONG", "RULE_STRING", "RULE_CHAR", "RULE_NEW", "RULE_NOT", "RULE_EXCLAMATION", "RULE_TRUE", "RULE_FALSE", "RULE_EXPONENTIAL", "RULE_INTEGER_TYPE_SUFFIX", "RULE_OCTAL_LITERAL", "RULE_EXPONENT", "RULE_FLOAT_TYPE_SUFFIX", "RULE_FLOATING_POINT_LITERAL", "RULE_ESCAPE_SEQUENCE", "RULE_CHARACTER_LITERAL", "RULE_OCTAL_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "','", "'class'", "'implements'", "'['", "']'", "'[]'", "'='", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'void'", "'synchronized('", "'return'", "'throw'", "'break'", "'continue'", "'for'", "'.'", "'+'", "'-'", "'switch'", "'case'", "'default'", "'while('", "'do'", "'while'", "'if'", "'else'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'"
    };
    public static final int RULE_DIFFERENT=34;
    public static final int RULE_EXP_EQUAL=38;
    public static final int RULE_ID=6;
    public static final int RULE_HEXA=48;
    public static final int RULE_INSTANCEOF=18;
    public static final int RULE_OR=35;
    public static final int RULE_MODULE=27;
    public static final int RULE_OR_EQUAL=36;
    public static final int EOF=-1;
    public static final int RULE_STATIC=13;
    public static final int T__93=93;
    public static final int RULE_MOD=12;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_LPAREN=10;
    public static final int RULE_EXCLAMATION=54;
    public static final int RULE_EXTENDS=7;
    public static final int RULE_MULTIPLY_EQUAL=24;
    public static final int RULE_WAT=40;
    public static final int RULE_CHAR=51;
    public static final int RULE_OCTAL_LITERAL=59;
    public static final int RULE_AMPERSAND=45;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int RULE_INTERFACE=5;
    public static final int RULE_CHARACTER_LITERAL=64;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_DIVIDE_EQUAL=26;
    public static final int RULE_INCREMENT=19;
    public static final int T__80=80;
    public static final int RULE_SUPER=16;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_EXPONENTIAL=57;
    public static final int RULE_BE=31;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=66;
    public static final int RULE_BT=29;
    public static final int RULE_STRING=50;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_DECIMAL_DIGITS=46;
    public static final int RULE_EXPONENT=60;
    public static final int RULE_MULTIPLY=23;
    public static final int RULE_RPAREN=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_THIS=17;
    public static final int RULE_SE=32;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__69=69;
    public static final int RULE_EXP=37;
    public static final int RULE_DOC_COMMENT=4;
    public static final int RULE_ST=30;
    public static final int RULE_OCTAL_ESCAPE=65;
    public static final int RULE_ESCAPE_SEQUENCE=63;
    public static final int RULE_MODULE_EQUAL=28;
    public static final int RULE_DIVIDE=25;
    public static final int RULE_NOT=53;
    public static final int RULE_FALSE=56;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__103=103;
    public static final int RULE_L_SHIFT=42;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_PLUS_EQUAL=21;
    public static final int RULE_DECREMENT=20;
    public static final int RULE_R_SHIFT=43;
    public static final int RULE_FLOAT_TYPE_SUFIX=47;
    public static final int RULE_SUPER_SHIFT=44;
    public static final int RULE_R_CURLY_BRACE=8;
    public static final int RULE_DOUBLE_OR_EQUAL=39;
    public static final int RULE_LONG=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_R_SHIFT_EQUAL=41;
    public static final int RULE_SL_COMMENT=67;
    public static final int RULE_L_CURLY_BRACE=9;
    public static final int RULE_NULL=15;
    public static final int RULE_TRUE=55;
    public static final int RULE_COLON=14;
    public static final int RULE_NEW=52;
    public static final int RULE_FLOAT_TYPE_SUFFIX=61;
    public static final int RULE_INTEGER_TYPE_SUFFIX=58;
    public static final int RULE_DOUBLE_EQUAL=33;
    public static final int RULE_MINUS_EQUAL=22;
    public static final int RULE_FLOATING_POINT_LITERAL=62;
    public static final int RULE_WS=68;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:75:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleCompilation_unit ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:28: ( ( (lv_greetings_0_0= ruleCompilation_unit ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_greetings_0_0= ruleCompilation_unit )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_greetings_0_0= ruleCompilation_unit )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:3: lv_greetings_0_0= ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_ruleModel136);
            lv_greetings_0_0=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		add(
                     			current, 
                     			"greetings",
                      		lv_greetings_0_0, 
                      		"Compilation_unit");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCompilation_unit"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:112:1: entryRuleCompilation_unit returns [EObject current=null] : iv_ruleCompilation_unit= ruleCompilation_unit EOF ;
    public final EObject entryRuleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilation_unit = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:113:2: (iv_ruleCompilation_unit= ruleCompilation_unit EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:2: iv_ruleCompilation_unit= ruleCompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit171);
            iv_ruleCompilation_unit=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit181); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompilation_unit"


    // $ANTLR start "ruleCompilation_unit"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: ruleCompilation_unit returns [EObject current=null] : ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_typeDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:28: ( ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ( () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:2: () ( (lv_name_1_0= rulePackage_statement ) )? ( (lv_imports_2_0= ruleImport_statement ) )* ( (lv_typeDeclarations_3_0= ruleType_declaration ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompilation_unitAccess().getCompilation_unitAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:2: ( (lv_name_1_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==108) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_name_1_0= rulePackage_statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_name_1_0= rulePackage_statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:3: lv_name_1_0= rulePackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_statement_in_ruleCompilation_unit239);
                    lv_name_1_0=rulePackage_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"Package_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:3: ( (lv_imports_2_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==106) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:1: (lv_imports_2_0= ruleImport_statement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:1: (lv_imports_2_0= ruleImport_statement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:154:3: lv_imports_2_0= ruleImport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_statement_in_ruleCompilation_unit261);
            	    lv_imports_2_0=ruleImport_statement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import_statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:170:3: ( (lv_typeDeclarations_3_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_DOC_COMMENT && LA3_0<=RULE_INTERFACE)||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==71) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_typeDeclarations_3_0= ruleType_declaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (lv_typeDeclarations_3_0= ruleType_declaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:3: lv_typeDeclarations_3_0= ruleType_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_declaration_in_ruleCompilation_unit283);
            	    lv_typeDeclarations_3_0=ruleType_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDeclarations",
            	              		lv_typeDeclarations_3_0, 
            	              		"Type_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleCompilation_unit"


    // $ANTLR start "entryRuleType_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:1: entryRuleType_declaration returns [EObject current=null] : iv_ruleType_declaration= ruleType_declaration EOF ;
    public final EObject entryRuleType_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:2: (iv_ruleType_declaration= ruleType_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:2: iv_ruleType_declaration= ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration320);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration330); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType_declaration"


    // $ANTLR start "ruleType_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_3=null;
        EObject lv_classDec_1_0 = null;

        EObject lv_interfaceDec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:209:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:210:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_0_0, grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getType_declarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_0_0, 
                              		"DOC_COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:227:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:227:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:227:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:228:1: (lv_classDec_1_0= ruleClass_declaration )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:228:1: (lv_classDec_1_0= ruleClass_declaration )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:3: lv_classDec_1_0= ruleClass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_declaration_in_ruleType_declaration400);
                    lv_classDec_1_0=ruleClass_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"classDec",
                              		lv_classDec_1_0, 
                              		"Class_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:246:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:246:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:3: lv_interfaceDec_2_0= ruleInterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_declaration_in_ruleType_declaration427);
                    lv_interfaceDec_2_0=ruleInterface_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getType_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"interfaceDec",
                              		lv_interfaceDec_2_0, 
                              		"Interface_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleType_declaration440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getType_declarationAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "ruleType_declaration"


    // $ANTLR start "entryRuleInterface_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:276:1: entryRuleInterface_declaration returns [EObject current=null] : iv_ruleInterface_declaration= ruleInterface_declaration EOF ;
    public final EObject entryRuleInterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:2: (iv_ruleInterface_declaration= ruleInterface_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:2: iv_ruleInterface_declaration= ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration476);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration486); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface_declaration"


    // $ANTLR start "ruleInterface_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleInterface_declaration() throws RecognitionException {
        EObject current = null;

        Token this_INTERFACE_1=null;
        Token lv_interfaceName_2_0=null;
        Token this_EXTENDS_3=null;
        Token otherlv_5=null;
        Token this_R_CURLY_BRACE_7=null;
        Token this_L_CURLY_BRACE_9=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_interfaceHerdada_4_0 = null;

        AntlrDatatypeRuleToken lv_interfacesHerdadas_6_0 = null;

        EObject lv_fieldsDeclaration_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:2: ( (lv_modifiers_0_0= ruleModifier ) )* this_INTERFACE_1= RULE_INTERFACE ( (lv_interfaceName_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_7= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )* this_L_CURLY_BRACE_9= RULE_L_CURLY_BRACE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_MOD && LA6_0<=RULE_STATIC)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:290:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:290:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:291:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterface_declaration532);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_INTERFACE_1=(Token)match(input,RULE_INTERFACE,FOLLOW_RULE_INTERFACE_in_ruleInterface_declaration544); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INTERFACE_1, grammarAccess.getInterface_declarationAccess().getINTERFACETerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_interfaceName_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_interfaceName_2_0, grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterface_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"interfaceName",
                      		lv_interfaceName_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:2: (this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_EXTENDS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:3: this_EXTENDS_3= RULE_EXTENDS ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleInterface_declaration577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getInterface_declarationAccess().getEXTENDSTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: ( (lv_interfaceHerdada_4_0= ruleInterface_name ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:3: lv_interfaceHerdada_4_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration597);
                    lv_interfaceHerdada_4_0=ruleInterface_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"interfaceHerdada",
                              		lv_interfaceHerdada_4_0, 
                              		"Interface_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:2: (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==70) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:4: otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleInterface_declaration610); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:355:1: ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:357:3: lv_interfacesHerdadas_6_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration631);
                    	    lv_interfacesHerdadas_6_0=ruleInterface_name();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"interfacesHerdadas",
                    	              		lv_interfacesHerdadas_6_0, 
                    	              		"Interface_name");
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


                    }
                    break;

            }

            this_R_CURLY_BRACE_7=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleInterface_declaration646); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_7, grammarAccess.getInterface_declarationAccess().getR_CURLY_BRACETerminalRuleCall_4()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:377:1: ( (lv_fieldsDeclaration_8_0= ruleField_declaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOC_COMMENT||LA9_0==RULE_ID||(LA9_0>=RULE_MOD && LA9_0<=RULE_STATIC)||LA9_0==69||(LA9_0>=77 && LA9_0<=85)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_fieldsDeclaration_8_0= ruleField_declaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_fieldsDeclaration_8_0= ruleField_declaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:3: lv_fieldsDeclaration_8_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleInterface_declaration666);
            	    lv_fieldsDeclaration_8_0=ruleField_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fieldsDeclaration",
            	              		lv_fieldsDeclaration_8_0, 
            	              		"Field_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_L_CURLY_BRACE_9=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleInterface_declaration678); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_9, grammarAccess.getInterface_declarationAccess().getL_CURLY_BRACETerminalRuleCall_6()); 
                  
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
    // $ANTLR end "ruleInterface_declaration"


    // $ANTLR start "entryRuleClass_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration713);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration723); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass_declaration"


    // $ANTLR start "ruleClass_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:416:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleClass_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token this_EXTENDS_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_R_CURLY_BRACE_9=null;
        Token this_L_CURLY_BRACE_11=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_classHerdada_4_0 = null;

        AntlrDatatypeRuleToken lv_interfaceImplementada_6_0 = null;

        AntlrDatatypeRuleToken lv_interfacesImplementadas_8_0 = null;

        EObject lv_fieldsDeclaration_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:419:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? this_R_CURLY_BRACE_9= RULE_R_CURLY_BRACE ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* this_L_CURLY_BRACE_11= RULE_L_CURLY_BRACE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_MOD && LA10_0<=RULE_STATIC)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClass_declaration769);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleClass_declaration782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:442:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:1: (lv_className_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_className_2_0, grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClass_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"className",
                      		lv_className_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:2: (this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_EXTENDS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:3: this_EXTENDS_3= RULE_EXTENDS ( (lv_classHerdada_4_0= ruleClass_name ) )
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleClass_declaration816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getClass_declarationAccess().getEXTENDSTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:1: ( (lv_classHerdada_4_0= ruleClass_name ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_classHerdada_4_0= ruleClass_name )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_classHerdada_4_0= ruleClass_name )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:466:3: lv_classHerdada_4_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration836);
                    lv_classHerdada_4_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"classHerdada",
                              		lv_classHerdada_4_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:4: (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==72) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:6: otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleClass_declaration851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:486:1: ( (lv_interfaceImplementada_6_0= ruleInterface_name ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:3: lv_interfaceImplementada_6_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration872);
                    lv_interfaceImplementada_6_0=ruleInterface_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"interfaceImplementada",
                              		lv_interfaceImplementada_6_0, 
                              		"Interface_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:504:2: (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==70) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:504:4: otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_7=(Token)match(input,70,FOLLOW_70_in_ruleClass_declaration885); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:1: ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:510:3: lv_interfacesImplementadas_8_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration906);
                    	    lv_interfacesImplementadas_8_0=ruleInterface_name();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"interfacesImplementadas",
                    	              		lv_interfacesImplementadas_8_0, 
                    	              		"Interface_name");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            this_R_CURLY_BRACE_9=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleClass_declaration921); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_9, grammarAccess.getClass_declarationAccess().getR_CURLY_BRACETerminalRuleCall_5()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:530:1: ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOC_COMMENT||LA14_0==RULE_ID||(LA14_0>=RULE_MOD && LA14_0<=RULE_STATIC)||LA14_0==69||(LA14_0>=77 && LA14_0<=85)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:3: lv_fieldsDeclaration_10_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration941);
            	    lv_fieldsDeclaration_10_0=ruleField_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClass_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fieldsDeclaration",
            	              		lv_fieldsDeclaration_10_0, 
            	              		"Field_declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_L_CURLY_BRACE_11=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleClass_declaration953); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_11, grammarAccess.getClass_declarationAccess().getL_CURLY_BRACETerminalRuleCall_7()); 
                  
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
    // $ANTLR end "ruleClass_declaration"


    // $ANTLR start "entryRuleField_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:560:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration988);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration998); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField_declaration"


    // $ANTLR start "ruleField_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) ) ;
    public final EObject ruleField_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_6=null;
        EObject lv_variableDeclaration_1_0 = null;

        EObject lv_contructorName_2_0 = null;

        EObject lv_methodName_3_0 = null;

        EObject lv_staticinitializer_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:572:28: ( ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_ID:
            case RULE_MOD:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt17=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID||(LA17_2>=RULE_MOD && LA17_2<=RULE_STATIC)||(LA17_2>=77 && LA17_2<=85)) ) {
                    alt17=1;
                }
                else if ( (LA17_2==RULE_R_CURLY_BRACE) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 69:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_DOC_COMMENT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:3: lv_comment_0_0= RULE_DOC_COMMENT
                            {
                            lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1041); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_comment_0_0, grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getField_declarationRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"comment",
                                      		lv_comment_0_0, 
                                      		"DOC_COMMENT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:3: lv_variableDeclaration_1_0= ruleVariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1069);
                            lv_variableDeclaration_1_0=ruleVariable_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"variableDeclaration",
                                      		lv_variableDeclaration_1_0, 
                                      		"Variable_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:3: lv_contructorName_2_0= ruleConstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1096);
                            lv_contructorName_2_0=ruleConstructor_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"contructorName",
                                      		lv_contructorName_2_0, 
                                      		"Constructor_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:1: (lv_methodName_3_0= ruleMethod_declaration )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:630:1: (lv_methodName_3_0= ruleMethod_declaration )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:631:3: lv_methodName_3_0= ruleMethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1123);
                            lv_methodName_3_0=ruleMethod_declaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"methodName",
                                      		lv_methodName_3_0, 
                                      		"Method_declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:3: lv_staticinitializer_4_0= ruleStatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1152);
                    lv_staticinitializer_4_0=ruleStatic_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getField_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"staticinitializer",
                              		lv_staticinitializer_4_0, 
                              		"Static_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:6: ( () otherlv_6= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:6: ( () otherlv_6= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:7: () otherlv_6= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:7: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getField_declarationAccess().getField_declarationAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleField_declaration1183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1());
                          
                    }

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
    // $ANTLR end "ruleField_declaration"


    // $ANTLR start "entryRuleMethod_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1220);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1230); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod_declaration"


    // $ANTLR start "ruleMethod_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) ) ;
    public final EObject ruleMethod_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nameMethod_2_0=null;
        Token lv_lParen_3_0=null;
        Token lv_rparent_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_debug_9_0=null;
        AntlrDatatypeRuleToken lv_modifiersMethod_0_0 = null;

        EObject lv_typeMethod_1_0 = null;

        EObject lv_parameterListMethod_4_0 = null;

        EObject lv_statementMethod_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:700:28: ( ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_MOD && LA18_0<=RULE_STATIC)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:3: lv_modifiersMethod_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethod_declaration1276);
            	    lv_modifiersMethod_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiersMethod",
            	              		lv_modifiersMethod_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:3: ( (lv_typeMethod_1_0= ruleType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:1: (lv_typeMethod_1_0= ruleType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:1: (lv_typeMethod_1_0= ruleType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:3: lv_typeMethod_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1298);
            lv_typeMethod_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"typeMethod",
                      		lv_typeMethod_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:2: ( (lv_nameMethod_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: (lv_nameMethod_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: (lv_nameMethod_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:3: lv_nameMethod_2_0= RULE_ID
            {
            lv_nameMethod_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nameMethod_2_0, grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nameMethod",
                      		lv_nameMethod_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:1: (lv_lParen_3_0= RULE_LPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:1: (lv_lParen_3_0= RULE_LPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:3: lv_lParen_3_0= RULE_LPAREN
            {
            lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMethod_declaration1337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lParen_3_0, grammarAccess.getMethod_declarationAccess().getLParenLPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lParen",
                      		lv_lParen_3_0, 
                      		"LPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:2: ( (lv_parameterListMethod_4_0= ruleParameter_list ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=77 && LA19_0<=85)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:775:3: lv_parameterListMethod_4_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleMethod_declaration1363);
                    lv_parameterListMethod_4_0=ruleParameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterListMethod",
                              		lv_parameterListMethod_4_0, 
                              		"Parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:3: ( (lv_rparent_5_0= RULE_RPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:1: (lv_rparent_5_0= RULE_RPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:1: (lv_rparent_5_0= RULE_RPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:3: lv_rparent_5_0= RULE_RPAREN
            {
            lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMethod_declaration1381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_5_0, grammarAccess.getMethod_declarationAccess().getRparentRPARENTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethod_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_5_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:2: (otherlv_6= '[' otherlv_7= ']' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==73) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:4: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleMethod_declaration1399); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,74,FOLLOW_74_in_ruleMethod_declaration1411); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:3: ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_R_CURLY_BRACE) ) {
                alt21=1;
            }
            else if ( (LA21_0==69) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:4: ( (lv_statementMethod_8_0= ruleStatement_block ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:4: ( (lv_statementMethod_8_0= ruleStatement_block ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:1: (lv_statementMethod_8_0= ruleStatement_block )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:1: (lv_statementMethod_8_0= ruleStatement_block )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:3: lv_statementMethod_8_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1435);
                    lv_statementMethod_8_0=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"statementMethod",
                              		lv_statementMethod_8_0, 
                              		"Statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:6: ( (lv_debug_9_0= ';' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:6: ( (lv_debug_9_0= ';' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: (lv_debug_9_0= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: (lv_debug_9_0= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:3: lv_debug_9_0= ';'
                    {
                    lv_debug_9_0=(Token)match(input,69,FOLLOW_69_in_ruleMethod_declaration1459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_debug_9_0, grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethod_declarationRule());
                      	        }
                             		setWithLastConsumed(current, "debug", lv_debug_9_0, ";");
                      	    
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
    // $ANTLR end "ruleMethod_declaration"


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:861:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1509);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1519); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructor_declaration"


    // $ANTLR start "ruleConstructor_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:868:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) ;
    public final EObject ruleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nameConstructor_1_0=null;
        Token lv_lParen_2_0=null;
        Token lv_rparent_4_0=null;
        AntlrDatatypeRuleToken lv_modifiersConstructor_0_0 = null;

        EObject lv_parameterListConstructor_3_0 = null;

        EObject lv_statementConstructor_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:28: ( ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_MOD && LA22_0<=RULE_STATIC)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:3: lv_modifiersConstructor_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructor_declaration1565);
            	    lv_modifiersConstructor_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiersConstructor",
            	              		lv_modifiersConstructor_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:3: ( (lv_nameConstructor_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:1: (lv_nameConstructor_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:1: (lv_nameConstructor_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:3: lv_nameConstructor_1_0= RULE_ID
            {
            lv_nameConstructor_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nameConstructor_1_0, grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nameConstructor",
                      		lv_nameConstructor_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:908:2: ( (lv_lParen_2_0= RULE_LPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:1: (lv_lParen_2_0= RULE_LPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:1: (lv_lParen_2_0= RULE_LPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:3: lv_lParen_2_0= RULE_LPAREN
            {
            lv_lParen_2_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleConstructor_declaration1605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lParen_2_0, grammarAccess.getConstructor_declarationAccess().getLParenLPARENTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lParen",
                      		lv_lParen_2_0, 
                      		"LPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:926:2: ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=77 && LA23_0<=85)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:927:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:927:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:928:3: lv_parameterListConstructor_3_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1631);
                    lv_parameterListConstructor_3_0=ruleParameter_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterListConstructor",
                              		lv_parameterListConstructor_3_0, 
                              		"Parameter_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:944:3: ( (lv_rparent_4_0= RULE_RPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:1: (lv_rparent_4_0= RULE_RPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:1: (lv_rparent_4_0= RULE_RPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:3: lv_rparent_4_0= RULE_RPAREN
            {
            lv_rparent_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleConstructor_declaration1649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_4_0, grammarAccess.getConstructor_declarationAccess().getRparentRPARENTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructor_declarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_4_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:2: ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:1: (lv_statementConstructor_5_0= ruleStatement_block )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:1: (lv_statementConstructor_5_0= ruleStatement_block )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:3: lv_statementConstructor_5_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1675);
            lv_statementConstructor_5_0=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructor_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"statementConstructor",
                      		lv_statementConstructor_5_0, 
                      		"Statement_block");
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
    // $ANTLR end "ruleConstructor_declaration"


    // $ANTLR start "entryRuleParameter_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:990:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1711);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:2: ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:2: ( (lv_parameter_0_0= ruleParameter ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:1: (lv_parameter_0_0= ruleParameter )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:1: (lv_parameter_0_0= ruleParameter )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:3: lv_parameter_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1767);
            lv_parameter_0_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
              	        }
                     		set(
                     			current, 
                     			"parameter",
                      		lv_parameter_0_0, 
                      		"Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==70) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleParameter_list1780); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:1: (lv_parameters_2_0= ruleParameter )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1025:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1801);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameter_listRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_2_0, 
            	              		"Parameter");
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
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1050:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1839);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1849); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1058:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameterName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:2: ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:2: ( (lv_type_0_0= ruleType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (lv_type_0_0= ruleType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (lv_type_0_0= ruleType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter1895);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:2: ( (lv_parameterName_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_parameterName_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_parameterName_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:3: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_parameterName_1_0, grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"parameterName",
                      		lv_parameterName_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:2: ( (otherlv_2= '[' otherlv_3= ']' ) | otherlv_4= '[]' )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==73) ) {
                    alt25=1;
                }
                else if ( (LA25_0==75) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:3: (otherlv_2= '[' otherlv_3= ']' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:3: (otherlv_2= '[' otherlv_3= ']' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:5: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleParameter1931); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleParameter1943); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1107:7: otherlv_4= '[]'
            	    {
            	    otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleParameter1962); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1119:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration2000);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration2010); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable_declaration"


    // $ANTLR start "ruleVariable_declaration"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleVariable_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_modifiersVariable_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_nameVariable_2_0 = null;

        EObject lv_names_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:28: ( ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_MOD && LA26_0<=RULE_STATIC)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:3: lv_modifiersVariable_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariable_declaration2056);
            	    lv_modifiersVariable_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiersVariable",
            	              		lv_modifiersVariable_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:3: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1152:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration2078);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1168:2: ( (lv_nameVariable_2_0= ruleVariable_declarator ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:3: lv_nameVariable_2_0= ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2099);
            lv_nameVariable_2_0=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"nameVariable",
                      		lv_nameVariable_2_0, 
                      		"Variable_declarator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:2: (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==70) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:4: otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    otherlv_3=(Token)match(input,70,FOLLOW_70_in_ruleVariable_declaration2112); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2133);
            	    lv_names_4_0=ruleVariable_declarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariable_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"names",
            	              		lv_names_4_0, 
            	              		"Variable_declarator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleVariable_declaration2147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleVariable_declaration"


    // $ANTLR start "entryRuleVariable_declarator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1220:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1221:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2183);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2193); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable_declarator"


    // $ANTLR start "ruleVariable_declarator"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1229:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_nameVariable_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_vari_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1232:28: ( ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1233:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1233:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1233:2: ( (lv_nameVariable_0_0= RULE_ID ) ) ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )* (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1233:2: ( (lv_nameVariable_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:1: (lv_nameVariable_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:1: (lv_nameVariable_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1235:3: lv_nameVariable_0_0= RULE_ID
            {
            lv_nameVariable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nameVariable_0_0, grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariable_declaratorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nameVariable",
                      		lv_nameVariable_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:2: ( (otherlv_1= '[' otherlv_2= ']' ) | otherlv_3= '[]' )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==73) ) {
                    alt28=1;
                }
                else if ( (LA28_0==75) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:3: (otherlv_1= '[' otherlv_2= ']' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:3: (otherlv_1= '[' otherlv_2= ']' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:5: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleVariable_declarator2254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleVariable_declarator2266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:7: otherlv_3= '[]'
            	    {
            	    otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleVariable_declarator2285); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:3: (otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==76) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:5: otherlv_4= '=' ( (lv_vari_5_0= ruleVariable_initializer ) )
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleVariable_declarator2300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariable_declaratorAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:1: ( (lv_vari_5_0= ruleVariable_initializer ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:1: (lv_vari_5_0= ruleVariable_initializer )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:1: (lv_vari_5_0= ruleVariable_initializer )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1270:3: lv_vari_5_0= ruleVariable_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_declaratorAccess().getVariVariable_initializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_initializer_in_ruleVariable_declarator2321);
                    lv_vari_5_0=ruleVariable_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_declaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"vari",
                              		lv_vari_5_0, 
                              		"Variable_initializer");
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
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleVariable_initializer"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: entryRuleVariable_initializer returns [EObject current=null] : iv_ruleVariable_initializer= ruleVariable_initializer EOF ;
    public final EObject entryRuleVariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_initializer = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:2: (iv_ruleVariable_initializer= ruleVariable_initializer EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:2: iv_ruleVariable_initializer= ruleVariable_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_initializer_in_entryRuleVariable_initializer2359);
            iv_ruleVariable_initializer=ruleVariable_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_initializer2369); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable_initializer"


    // $ANTLR start "ruleVariable_initializer"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:1: ruleVariable_initializer returns [EObject current=null] : ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable_initializer() throws RecognitionException {
        EObject current = null;

        EObject lv_array_init_0_0 = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1306:28: ( ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:1: ( ( (lv_array_init_0_0= ruleArray_initializer ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_R_CURLY_BRACE) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID||LA30_0==RULE_LPAREN||(LA30_0>=RULE_NULL && LA30_0<=RULE_THIS)||(LA30_0>=RULE_INCREMENT && LA30_0<=RULE_DECREMENT)||LA30_0==RULE_DECIMAL_DIGITS||LA30_0==RULE_HEXA||(LA30_0>=RULE_STRING && LA30_0<=RULE_FALSE)||LA30_0==94) ) {
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:2: ( (lv_array_init_0_0= ruleArray_initializer ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1307:2: ( (lv_array_init_0_0= ruleArray_initializer ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1308:1: (lv_array_init_0_0= ruleArray_initializer )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1308:1: (lv_array_init_0_0= ruleArray_initializer )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:3: lv_array_init_0_0= ruleArray_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getArray_initArray_initializerParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArray_initializer_in_ruleVariable_initializer2415);
                    lv_array_init_0_0=ruleArray_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                      	        }
                             		set(
                             			current, 
                             			"array_init",
                              		lv_array_init_0_0, 
                              		"Array_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1326:6: ( (lv_expression_1_0= ruleExpression ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1326:6: ( (lv_expression_1_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:1: (lv_expression_1_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:1: (lv_expression_1_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:3: lv_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariable_initializerAccess().getExpressionExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariable_initializer2442);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariable_initializerRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleVariable_initializer"


    // $ANTLR start "entryRuleArray_initializer"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1352:1: entryRuleArray_initializer returns [EObject current=null] : iv_ruleArray_initializer= ruleArray_initializer EOF ;
    public final EObject entryRuleArray_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray_initializer = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1353:2: (iv_ruleArray_initializer= ruleArray_initializer EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1354:2: iv_ruleArray_initializer= ruleArray_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleArray_initializer_in_entryRuleArray_initializer2478);
            iv_ruleArray_initializer=ruleArray_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray_initializer2488); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArray_initializer"


    // $ANTLR start "ruleArray_initializer"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1361:1: ruleArray_initializer returns [EObject current=null] : ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleArray_initializer() throws RecognitionException {
        EObject current = null;

        Token this_R_CURLY_BRACE_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_L_CURLY_BRACE_6=null;
        EObject lv_variableinitializer_2_0 = null;

        EObject lv_variableinitializer_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:28: ( ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:1: ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:1: ( () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:2: () this_R_CURLY_BRACE_1= RULE_R_CURLY_BRACE ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )? this_L_CURLY_BRACE_6= RULE_L_CURLY_BRACE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1366:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArray_initializerAccess().getArray_initializerAction_0(),
                          current);
                  
            }

            }

            this_R_CURLY_BRACE_1=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleArray_initializer2536); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_1, grammarAccess.getArray_initializerAccess().getR_CURLY_BRACETerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:1: ( ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==RULE_R_CURLY_BRACE||LA33_0==RULE_LPAREN||(LA33_0>=RULE_NULL && LA33_0<=RULE_THIS)||(LA33_0>=RULE_INCREMENT && LA33_0<=RULE_DECREMENT)||LA33_0==RULE_DECIMAL_DIGITS||LA33_0==RULE_HEXA||(LA33_0>=RULE_STRING && LA33_0<=RULE_FALSE)||LA33_0==94) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:2: ( (lv_variableinitializer_2_0= ruleVariable_initializer ) ) (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )* (otherlv_5= ',' )?
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:2: ( (lv_variableinitializer_2_0= ruleVariable_initializer ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1379:1: (lv_variableinitializer_2_0= ruleVariable_initializer )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1379:1: (lv_variableinitializer_2_0= ruleVariable_initializer )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1380:3: lv_variableinitializer_2_0= ruleVariable_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArray_initializerAccess().getVariableinitializerVariable_initializerParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_initializer_in_ruleArray_initializer2557);
                    lv_variableinitializer_2_0=ruleVariable_initializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArray_initializerRule());
                      	        }
                             		add(
                             			current, 
                             			"variableinitializer",
                              		lv_variableinitializer_2_0, 
                              		"Variable_initializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:2: (otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==70) ) {
                            int LA31_1 = input.LA(2);

                            if ( (LA31_1==RULE_ID||LA31_1==RULE_R_CURLY_BRACE||LA31_1==RULE_LPAREN||(LA31_1>=RULE_NULL && LA31_1<=RULE_THIS)||(LA31_1>=RULE_INCREMENT && LA31_1<=RULE_DECREMENT)||LA31_1==RULE_DECIMAL_DIGITS||LA31_1==RULE_HEXA||(LA31_1>=RULE_STRING && LA31_1<=RULE_FALSE)||LA31_1==94) ) {
                                alt31=1;
                            }


                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:4: otherlv_3= ',' ( (lv_variableinitializer_4_0= ruleVariable_initializer ) )
                    	    {
                    	    otherlv_3=(Token)match(input,70,FOLLOW_70_in_ruleArray_initializer2570); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getArray_initializerAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:1: ( (lv_variableinitializer_4_0= ruleVariable_initializer ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1401:1: (lv_variableinitializer_4_0= ruleVariable_initializer )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1401:1: (lv_variableinitializer_4_0= ruleVariable_initializer )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1402:3: lv_variableinitializer_4_0= ruleVariable_initializer
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArray_initializerAccess().getVariableinitializerVariable_initializerParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_initializer_in_ruleArray_initializer2591);
                    	    lv_variableinitializer_4_0=ruleVariable_initializer();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArray_initializerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"variableinitializer",
                    	              		lv_variableinitializer_4_0, 
                    	              		"Variable_initializer");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1418:4: (otherlv_5= ',' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==70) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1418:6: otherlv_5= ','
                            {
                            otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleArray_initializer2606); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getArray_initializerAccess().getCommaKeyword_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            this_L_CURLY_BRACE_6=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleArray_initializer2621); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_6, grammarAccess.getArray_initializerAccess().getL_CURLY_BRACETerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleArray_initializer"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1434:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1435:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1436:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType2656);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2666); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:1: ruleType returns [EObject current=null] : ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_typeVector_1_0=null;
        AntlrDatatypeRuleToken lv_typeSpecifier_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:28: ( ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) ( (lv_typeVector_1_0= '[]' ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1449:3: lv_typeSpecifier_0_0= ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType2712);
            lv_typeSpecifier_0_0=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"typeSpecifier",
                      		lv_typeSpecifier_0_0, 
                      		"Type_specifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1465:2: ( (lv_typeVector_1_0= '[]' ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==75) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1466:1: (lv_typeVector_1_0= '[]' )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1466:1: (lv_typeVector_1_0= '[]' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1467:3: lv_typeVector_1_0= '[]'
            	    {
            	    lv_typeVector_1_0=(Token)match(input,75,FOLLOW_75_in_ruleType2730); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_typeVector_1_0, grammarAccess.getTypeAccess().getTypeVectorLeftSquareBracketRightSquareBracketKeyword_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTypeRule());
            	      	        }
            	             		addWithLastConsumed(current, "typeVector", lv_typeVector_1_0, "[]");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_specifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:1: entryRuleType_specifier returns [String current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final String entryRuleType_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_specifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1489:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1490:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier2781);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier2792); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType_specifier"


    // $ANTLR start "ruleType_specifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:1: ruleType_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name ) ;
    public final AntlrDatatypeRuleToken ruleType_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Class_name_9 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | kw= 'void' | this_Class_name_9= ruleClass_name )
            int alt35=10;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt35=1;
                }
                break;
            case 78:
                {
                alt35=2;
                }
                break;
            case 79:
                {
                alt35=3;
                }
                break;
            case 80:
                {
                alt35=4;
                }
                break;
            case 81:
                {
                alt35=5;
                }
                break;
            case 82:
                {
                alt35=6;
                }
                break;
            case 83:
                {
                alt35=7;
                }
                break;
            case 84:
                {
                alt35=8;
                }
                break;
            case 85:
                {
                alt35=9;
                }
                break;
            case RULE_ID:
                {
                alt35=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1502:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleType_specifier2830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:2: kw= 'byte'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleType_specifier2849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1516:2: kw= 'char'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleType_specifier2868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:2: kw= 'short'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleType_specifier2887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:2: kw= 'int'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleType_specifier2906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1537:2: kw= 'float'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleType_specifier2925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:2: kw= 'long'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleType_specifier2944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1551:2: kw= 'double'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleType_specifier2963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:2: kw= 'void'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleType_specifier2982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getVoidKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:5: this_Class_name_9= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier3010);
                    this_Class_name_9=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Class_name_9);
                          
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
    // $ANTLR end "ruleType_specifier"


    // $ANTLR start "entryRuleModifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1583:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1584:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1585:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier3056);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier3067); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1592:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MOD_0=null;
        Token this_STATIC_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1595:28: ( (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_MOD) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STATIC) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_ruleModifier3107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MOD_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleModifier3133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STATIC_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STATIC_1, grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleStatic_initializer"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer3178);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer3188); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatic_initializer"


    // $ANTLR start "ruleStatic_initializer"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1628:1: ruleStatic_initializer returns [EObject current=null] : ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:28: ( ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:2: ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:2: ( (lv_static_0_0= RULE_STATIC ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:1: (lv_static_0_0= RULE_STATIC )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:1: (lv_static_0_0= RULE_STATIC )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1634:3: lv_static_0_0= RULE_STATIC
            {
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleStatic_initializer3230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_static_0_0, grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatic_initializerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"static",
                      		lv_static_0_0, 
                      		"STATIC");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:2: ( (lv_name_1_0= ruleStatement_block ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_name_1_0= ruleStatement_block )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:3: lv_name_1_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer3256);
            lv_name_1_0=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatic_initializerRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Statement_block");
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
    // $ANTLR end "ruleStatic_initializer"


    // $ANTLR start "entryRuleStatement_block"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1676:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1677:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block3292);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block3302); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_block"


    // $ANTLR start "ruleStatement_block"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1685:1: ruleStatement_block returns [EObject current=null] : ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token lv_rCurly_1_0=null;
        Token lv_lCurly_3_0=null;
        EObject lv_statments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1688:28: ( ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:1: ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:1: ( () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:2: () ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) ) ( (lv_statments_2_0= ruleStatement ) )* ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1690:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatement_blockAccess().getStatement_blockAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1698:2: ( (lv_rCurly_1_0= RULE_R_CURLY_BRACE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:1: (lv_rCurly_1_0= RULE_R_CURLY_BRACE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:1: (lv_rCurly_1_0= RULE_R_CURLY_BRACE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1700:3: lv_rCurly_1_0= RULE_R_CURLY_BRACE
            {
            lv_rCurly_1_0=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleStatement_block3356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rCurly_1_0, grammarAccess.getStatement_blockAccess().getRCurlyR_CURLY_BRACETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_blockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rCurly",
                      		lv_rCurly_1_0, 
                      		"R_CURLY_BRACE");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1716:2: ( (lv_statments_2_0= ruleStatement ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==RULE_R_CURLY_BRACE||LA37_0==RULE_LPAREN||(LA37_0>=RULE_MOD && LA37_0<=RULE_STATIC)||(LA37_0>=RULE_NULL && LA37_0<=RULE_THIS)||(LA37_0>=RULE_INCREMENT && LA37_0<=RULE_DECREMENT)||LA37_0==RULE_DECIMAL_DIGITS||LA37_0==RULE_HEXA||(LA37_0>=RULE_STRING && LA37_0<=RULE_FALSE)||LA37_0==69||(LA37_0>=77 && LA37_0<=91)||(LA37_0>=94 && LA37_0<=95)||(LA37_0>=98 && LA37_0<=99)||LA37_0==101||LA37_0==103) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1717:1: (lv_statments_2_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1717:1: (lv_statments_2_0= ruleStatement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1718:3: lv_statments_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement_block3382);
            	    lv_statments_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_blockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statments",
            	              		lv_statments_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1734:3: ( (lv_lCurly_3_0= RULE_L_CURLY_BRACE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1735:1: (lv_lCurly_3_0= RULE_L_CURLY_BRACE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1735:1: (lv_lCurly_3_0= RULE_L_CURLY_BRACE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:3: lv_lCurly_3_0= RULE_L_CURLY_BRACE
            {
            lv_lCurly_3_0=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleStatement_block3400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lCurly_3_0, grammarAccess.getStatement_blockAccess().getLCurlyL_CURLY_BRACETerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_blockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lCurly",
                      		lv_lCurly_3_0, 
                      		"L_CURLY_BRACE");
              	    
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
    // $ANTLR end "ruleStatement_block"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1760:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1762:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement3441);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3451); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1769:1: ruleStatement returns [EObject current=null] : ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | this_Statement_block_20= ruleStatement_block | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_g_2_0=null;
        Token otherlv_8=null;
        Token lv_rparent_10_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_nameStatement_22_0=null;
        Token this_COLON_23=null;
        Token otherlv_26=null;
        Token lv_name_27_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token lv_name_31_0=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        EObject lv_variableDeclaration_0_0 = null;

        EObject lv_expressionStatement_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_doStatement_4_0 = null;

        EObject lv_whileStatement_5_0 = null;

        EObject lv_forStatement_6_0 = null;

        EObject lv_switchStatement_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_syncStatement_11_0 = null;

        EObject lv_expression_14_0 = null;

        EObject lv_expression_18_0 = null;

        EObject this_Statement_block_20 = null;

        EObject lv_tryStatement_21_0 = null;

        EObject lv_statement_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:28: ( ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | this_Statement_block_20= ruleStatement_block | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | this_Statement_block_20= ruleStatement_block | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | this_Statement_block_20= ruleStatement_block | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) )
            int alt42=16;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1774:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1774:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1775:3: lv_variableDeclaration_0_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleStatement3497);
                    lv_variableDeclaration_0_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variableDeclaration",
                              		lv_variableDeclaration_0_0, 
                              		"Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:7: ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:7: ( (lv_expressionStatement_1_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1793:1: (lv_expressionStatement_1_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1793:1: (lv_expressionStatement_1_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:3: lv_expressionStatement_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement3525);
                    lv_expressionStatement_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"expressionStatement",
                              		lv_expressionStatement_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:2: ( (lv_g_2_0= ';' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:1: (lv_g_2_0= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:1: (lv_g_2_0= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:3: lv_g_2_0= ';'
                    {
                    lv_g_2_0=(Token)match(input,69,FOLLOW_69_in_ruleStatement3543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_g_2_0, grammarAccess.getStatementAccess().getGSemicolonKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(current, "g", lv_g_2_0, ";");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:6: ( (lv_ifStatement_3_0= ruleIf_statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:6: ( (lv_ifStatement_3_0= ruleIf_statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:1: (lv_ifStatement_3_0= ruleIf_statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:1: (lv_ifStatement_3_0= ruleIf_statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1828:3: lv_ifStatement_3_0= ruleIf_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_statement_in_ruleStatement3584);
                    lv_ifStatement_3_0=ruleIf_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifStatement",
                              		lv_ifStatement_3_0, 
                              		"If_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1845:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1845:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1846:1: (lv_doStatement_4_0= ruleDo_Statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1846:1: (lv_doStatement_4_0= ruleDo_Statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:3: lv_doStatement_4_0= ruleDo_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDo_Statement_in_ruleStatement3611);
                    lv_doStatement_4_0=ruleDo_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"doStatement",
                              		lv_doStatement_4_0, 
                              		"Do_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:3: lv_whileStatement_5_0= ruleWhile_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_Statement_in_ruleStatement3638);
                    lv_whileStatement_5_0=ruleWhile_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whileStatement",
                              		lv_whileStatement_5_0, 
                              		"While_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: (lv_forStatement_6_0= ruleFor_Statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: (lv_forStatement_6_0= ruleFor_Statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:3: lv_forStatement_6_0= ruleFor_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getForStatementFor_StatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_Statement_in_ruleStatement3665);
                    lv_forStatement_6_0=ruleFor_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"forStatement",
                              		lv_forStatement_6_0, 
                              		"For_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1902:6: ( (lv_switchStatement_7_0= ruleSwitch_statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1902:6: ( (lv_switchStatement_7_0= ruleSwitch_statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: (lv_switchStatement_7_0= ruleSwitch_statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: (lv_switchStatement_7_0= ruleSwitch_statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:3: lv_switchStatement_7_0= ruleSwitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementSwitch_statementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitch_statement_in_ruleStatement3692);
                    lv_switchStatement_7_0=ruleSwitch_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"switchStatement",
                              		lv_switchStatement_7_0, 
                              		"Switch_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:6: (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:6: (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:8: otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) )
                    {
                    otherlv_8=(Token)match(input,86,FOLLOW_86_in_ruleStatement3711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSynchronizedKeyword_7_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:1: ( (lv_expression_9_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_expression_9_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_expression_9_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:3: lv_expression_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement3732);
                    lv_expression_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:2: ( (lv_rparent_10_0= RULE_RPAREN ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1944:1: (lv_rparent_10_0= RULE_RPAREN )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1944:1: (lv_rparent_10_0= RULE_RPAREN )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:3: lv_rparent_10_0= RULE_RPAREN
                    {
                    lv_rparent_10_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleStatement3749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rparent_10_0, grammarAccess.getStatementAccess().getRparentRPARENTerminalRuleCall_7_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rparent",
                              		lv_rparent_10_0, 
                              		"RPAREN");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:2: ( (lv_syncStatement_11_0= ruleStatement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_syncStatement_11_0= ruleStatement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_syncStatement_11_0= ruleStatement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1963:3: lv_syncStatement_11_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3775);
                    lv_syncStatement_11_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"syncStatement",
                              		lv_syncStatement_11_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:6: ( () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:6: ( () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:7: () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:7: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,87,FOLLOW_87_in_ruleStatement3807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getReturnKeyword_8_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1993:1: ( (lv_expression_14_0= ruleExpression ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID||LA38_0==RULE_LPAREN||(LA38_0>=RULE_NULL && LA38_0<=RULE_THIS)||(LA38_0>=RULE_INCREMENT && LA38_0<=RULE_DECREMENT)||LA38_0==RULE_DECIMAL_DIGITS||LA38_0==RULE_HEXA||(LA38_0>=RULE_STRING && LA38_0<=RULE_FALSE)||LA38_0==94) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:1: (lv_expression_14_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:1: (lv_expression_14_0= ruleExpression )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1995:3: lv_expression_14_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_8_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleStatement3828);
                            lv_expression_14_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_14_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,69,FOLLOW_69_in_ruleStatement3841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getSemicolonKeyword_8_3());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:6: ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:6: ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:7: () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:7: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2017:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,88,FOLLOW_88_in_ruleStatement3873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getThrowKeyword_9_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:1: ( (lv_expression_18_0= ruleExpression ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID||LA39_0==RULE_LPAREN||(LA39_0>=RULE_NULL && LA39_0<=RULE_THIS)||(LA39_0>=RULE_INCREMENT && LA39_0<=RULE_DECREMENT)||LA39_0==RULE_DECIMAL_DIGITS||LA39_0==RULE_HEXA||(LA39_0>=RULE_STRING && LA39_0<=RULE_FALSE)||LA39_0==94) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2030:1: (lv_expression_18_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2030:1: (lv_expression_18_0= ruleExpression )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2031:3: lv_expression_18_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionExpressionParserRuleCall_9_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleStatement3894);
                            lv_expression_18_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_18_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,69,FOLLOW_69_in_ruleStatement3907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_9_3());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2053:2: this_Statement_block_20= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleStatement3939);
                    this_Statement_block_20=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_block_20; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2065:6: ( (lv_tryStatement_21_0= ruleTry_statement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2065:6: ( (lv_tryStatement_21_0= ruleTry_statement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2066:1: (lv_tryStatement_21_0= ruleTry_statement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2066:1: (lv_tryStatement_21_0= ruleTry_statement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2067:3: lv_tryStatement_21_0= ruleTry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_11_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTry_statement_in_ruleStatement3965);
                    lv_tryStatement_21_0=ruleTry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"tryStatement",
                              		lv_tryStatement_21_0, 
                              		"Try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:6: ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:6: ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:7: ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:7: ( (lv_nameStatement_22_0= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2085:1: (lv_nameStatement_22_0= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2085:1: (lv_nameStatement_22_0= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2086:3: lv_nameStatement_22_0= RULE_ID
                    {
                    lv_nameStatement_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nameStatement_22_0, grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_12_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nameStatement",
                              		lv_nameStatement_22_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    this_COLON_23=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleStatement4005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_23, grammarAccess.getStatementAccess().getCOLONTerminalRuleCall_12_1()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2106:1: ( (lv_statement_24_0= ruleStatement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2107:1: (lv_statement_24_0= ruleStatement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2107:1: (lv_statement_24_0= ruleStatement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2108:3: lv_statement_24_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_12_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement4025);
                    lv_statement_24_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_24_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:6: ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:6: ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:7: () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:7: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_13_0(),
                                  current);
                          
                    }

                    }

                    otherlv_26=(Token)match(input,89,FOLLOW_89_in_ruleStatement4057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getBreakKeyword_13_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2138:1: ( (lv_name_27_0= RULE_ID ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2139:1: (lv_name_27_0= RULE_ID )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2139:1: (lv_name_27_0= RULE_ID )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2140:3: lv_name_27_0= RULE_ID
                            {
                            lv_name_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement4074); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_27_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_13_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_27_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_28=(Token)match(input,69,FOLLOW_69_in_ruleStatement4092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getStatementAccess().getSemicolonKeyword_13_3());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:6: ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:6: ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:7: () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:7: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2162:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_14_0(),
                                  current);
                          
                    }

                    }

                    otherlv_30=(Token)match(input,90,FOLLOW_90_in_ruleStatement4124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getStatementAccess().getContinueKeyword_14_1());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2174:1: ( (lv_name_31_0= RULE_ID ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2175:1: (lv_name_31_0= RULE_ID )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2175:1: (lv_name_31_0= RULE_ID )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2176:3: lv_name_31_0= RULE_ID
                            {
                            lv_name_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement4141); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_31_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_14_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_31_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,69,FOLLOW_69_in_ruleStatement4159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStatementAccess().getSemicolonKeyword_14_3());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2197:6: ( () otherlv_34= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2197:6: ( () otherlv_34= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2197:7: () otherlv_34= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2197:7: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2198:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_15_0(),
                                  current);
                          
                    }

                    }

                    otherlv_34=(Token)match(input,69,FOLLOW_69_in_ruleStatement4191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getStatementAccess().getSemicolonKeyword_15_1());
                          
                    }

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleFor_Statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2218:1: entryRuleFor_Statement returns [EObject current=null] : iv_ruleFor_Statement= ruleFor_Statement EOF ;
    public final EObject entryRuleFor_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_Statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2219:2: (iv_ruleFor_Statement= ruleFor_Statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2220:2: iv_ruleFor_Statement= ruleFor_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement4228);
            iv_ruleFor_Statement=ruleFor_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor_Statement4238); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFor_Statement"


    // $ANTLR start "ruleFor_Statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2227:1: ruleFor_Statement returns [EObject current=null] : (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) ) ;
    public final EObject ruleFor_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LPAREN_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_RPAREN_9=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression2_6_0 = null;

        EObject lv_expression3_8_0 = null;

        EObject lv_statement_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2230:28: ( (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:1: (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:1: (otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:3: otherlv_0= 'for' this_LPAREN_1= RULE_LPAREN ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ( (lv_expression2_6_0= ruleExpression ) )? otherlv_7= ';' ( (lv_expression3_8_0= ruleExpression ) )? this_RPAREN_9= RULE_RPAREN ( (lv_statement_10_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleFor_Statement4275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_StatementAccess().getForKeyword_0());
                  
            }
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleFor_Statement4286); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getFor_StatementAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            int alt43=3;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:1: (lv_variable_2_0= ruleVariable_declaration )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:1: (lv_variable_2_0= ruleVariable_declaration )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2241:3: lv_variable_2_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleFor_Statement4307);
                    lv_variable_2_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_2_0, 
                              		"Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2258:7: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleFor_Statement4325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:6: ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:6: ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:7: ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:7: ( (lv_expression_4_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2264:1: (lv_expression_4_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2264:1: (lv_expression_4_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2265:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpressionExpressionParserRuleCall_2_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement4353);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleFor_Statement4365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_2_2_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:3: ( (lv_expression2_6_0= ruleExpression ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==RULE_LPAREN||(LA44_0>=RULE_NULL && LA44_0<=RULE_THIS)||(LA44_0>=RULE_INCREMENT && LA44_0<=RULE_DECREMENT)||LA44_0==RULE_DECIMAL_DIGITS||LA44_0==RULE_HEXA||(LA44_0>=RULE_STRING && LA44_0<=RULE_FALSE)||LA44_0==94) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2286:1: (lv_expression2_6_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2286:1: (lv_expression2_6_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2287:3: lv_expression2_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression2ExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement4388);
                    lv_expression2_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,69,FOLLOW_69_in_ruleFor_Statement4401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_4());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2307:1: ( (lv_expression3_8_0= ruleExpression ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==RULE_LPAREN||(LA45_0>=RULE_NULL && LA45_0<=RULE_THIS)||(LA45_0>=RULE_INCREMENT && LA45_0<=RULE_DECREMENT)||LA45_0==RULE_DECIMAL_DIGITS||LA45_0==RULE_HEXA||(LA45_0>=RULE_STRING && LA45_0<=RULE_FALSE)||LA45_0==94) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2308:1: (lv_expression3_8_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2308:1: (lv_expression3_8_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2309:3: lv_expression3_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getExpression3ExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFor_Statement4422);
                    lv_expression3_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression3",
                              		lv_expression3_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleFor_Statement4434); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_9, grammarAccess.getFor_StatementAccess().getRPARENTerminalRuleCall_6()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2329:1: ( (lv_statement_10_0= ruleStatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2330:1: (lv_statement_10_0= ruleStatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2330:1: (lv_statement_10_0= ruleStatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2331:3: lv_statement_10_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_StatementAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor_Statement4454);
            lv_statement_10_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_10_0, 
                      		"Statement");
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
    // $ANTLR end "ruleFor_Statement"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2357:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2358:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2359:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4492);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4502); if (state.failed) return current;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2366:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_null_12_0=null;
        Token lv_super_14_0=null;
        Token lv_this_16_0=null;
        Token lv_name_18_0=null;
        EObject lv_numericExpression3_0_0 = null;

        EObject lv_aux_1_0 = null;

        EObject lv_logicalExpression_2_0 = null;

        EObject lv_aux_3_0 = null;

        EObject lv_bitExpression_4_0 = null;

        EObject lv_aux_5_0 = null;

        EObject lv_castExpression_6_0 = null;

        EObject lv_aux_7_0 = null;

        EObject lv_creatingExpression_8_0 = null;

        EObject lv_aux_9_0 = null;

        EObject lv_literalExpression_10_0 = null;

        EObject lv_aux_11_0 = null;

        EObject lv_aux_13_0 = null;

        EObject lv_aux_15_0 = null;

        EObject lv_aux_17_0 = null;

        EObject lv_aux_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2369:28: ( ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )
            int alt46=10;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:2: ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:2: ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:3: ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:3: ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2370:4: ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:5: ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2375:1: (lv_numericExpression3_0_0= ruleNumeric_Expression_NR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2375:1: (lv_numericExpression3_0_0= ruleNumeric_Expression_NR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2376:3: lv_numericExpression3_0_0= ruleNumeric_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpression3Numeric_Expression_NRParserRuleCall_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumeric_Expression_NR_in_ruleExpression4562);
                    lv_numericExpression3_0_0=ruleNumeric_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numericExpression3",
                              		lv_numericExpression3_0_0, 
                              		"Numeric_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2392:3: ( (lv_aux_1_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_aux_1_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_aux_1_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2394:3: lv_aux_1_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4584);
                    lv_aux_1_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_1_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:6: ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2411:7: ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2412:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2412:1: (lv_logicalExpression_2_0= ruleLogical_Expression_NR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:3: lv_logicalExpression_2_0= ruleLogical_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionLogical_Expression_NRParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogical_Expression_NR_in_ruleExpression4613);
                    lv_logicalExpression_2_0=ruleLogical_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"logicalExpression",
                              		lv_logicalExpression_2_0, 
                              		"Logical_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2429:2: ( (lv_aux_3_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2430:1: (lv_aux_3_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2430:1: (lv_aux_3_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2431:3: lv_aux_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4634);
                    lv_aux_3_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_3_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2448:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2448:6: ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2448:7: ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2448:7: ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2449:1: (lv_bitExpression_4_0= ruleBit_Expression_NR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2449:1: (lv_bitExpression_4_0= ruleBit_Expression_NR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2450:3: lv_bitExpression_4_0= ruleBit_Expression_NR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getBitExpressionBit_Expression_NRParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBit_Expression_NR_in_ruleExpression4663);
                    lv_bitExpression_4_0=ruleBit_Expression_NR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"bitExpression",
                              		lv_bitExpression_4_0, 
                              		"Bit_Expression_NR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2466:2: ( (lv_aux_5_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2467:1: (lv_aux_5_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2467:1: (lv_aux_5_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2468:3: lv_aux_5_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4684);
                    lv_aux_5_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_5_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2485:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2485:6: ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2485:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2485:7: ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2485:8: ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2489:5: ( (lv_castExpression_6_0= ruleCast_Expression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2490:1: (lv_castExpression_6_0= ruleCast_Expression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2490:1: (lv_castExpression_6_0= ruleCast_Expression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2491:3: lv_castExpression_6_0= ruleCast_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCastExpressionCast_ExpressionParserRuleCall_3_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCast_Expression_in_ruleExpression4726);
                    lv_castExpression_6_0=ruleCast_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"castExpression",
                              		lv_castExpression_6_0, 
                              		"Cast_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2507:3: ( (lv_aux_7_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2508:1: (lv_aux_7_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2508:1: (lv_aux_7_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2509:3: lv_aux_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4748);
                    lv_aux_7_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_7_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2526:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2526:6: ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2526:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2526:7: ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2526:8: ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2530:5: ( (lv_creatingExpression_8_0= ruleCreating_Expression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2531:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2531:1: (lv_creatingExpression_8_0= ruleCreating_Expression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2532:3: lv_creatingExpression_8_0= ruleCreating_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getCreatingExpressionCreating_ExpressionParserRuleCall_4_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCreating_Expression_in_ruleExpression4790);
                    lv_creatingExpression_8_0=ruleCreating_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"creatingExpression",
                              		lv_creatingExpression_8_0, 
                              		"Creating_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2548:3: ( (lv_aux_9_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2549:1: (lv_aux_9_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2549:1: (lv_aux_9_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2550:3: lv_aux_9_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4812);
                    lv_aux_9_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_9_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:6: ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:6: ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:7: ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2567:7: ( (lv_literalExpression_10_0= ruleLiteral_Expression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2568:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2568:1: (lv_literalExpression_10_0= ruleLiteral_Expression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2569:3: lv_literalExpression_10_0= ruleLiteral_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionLiteral_ExpressionParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_Expression_in_ruleExpression4841);
                    lv_literalExpression_10_0=ruleLiteral_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literalExpression",
                              		lv_literalExpression_10_0, 
                              		"Literal_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2585:2: ( (lv_aux_11_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2586:1: (lv_aux_11_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2586:1: (lv_aux_11_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2587:3: lv_aux_11_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4862);
                    lv_aux_11_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_11_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:6: ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:6: ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:7: ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2604:7: ( (lv_null_12_0= RULE_NULL ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:1: (lv_null_12_0= RULE_NULL )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2605:1: (lv_null_12_0= RULE_NULL )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2606:3: lv_null_12_0= RULE_NULL
                    {
                    lv_null_12_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleExpression4887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_null_12_0, grammarAccess.getExpressionAccess().getNullNULLTerminalRuleCall_6_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"null",
                              		lv_null_12_0, 
                              		"NULL");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2622:2: ( (lv_aux_13_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2623:1: (lv_aux_13_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2623:1: (lv_aux_13_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2624:3: lv_aux_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4913);
                    lv_aux_13_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_13_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:6: ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:6: ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:7: ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2641:7: ( (lv_super_14_0= RULE_SUPER ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:1: (lv_super_14_0= RULE_SUPER )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2642:1: (lv_super_14_0= RULE_SUPER )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2643:3: lv_super_14_0= RULE_SUPER
                    {
                    lv_super_14_0=(Token)match(input,RULE_SUPER,FOLLOW_RULE_SUPER_in_ruleExpression4938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_super_14_0, grammarAccess.getExpressionAccess().getSuperSUPERTerminalRuleCall_7_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"super",
                              		lv_super_14_0, 
                              		"SUPER");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2659:2: ( (lv_aux_15_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2660:1: (lv_aux_15_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2660:1: (lv_aux_15_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2661:3: lv_aux_15_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression4964);
                    lv_aux_15_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_15_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2678:6: ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2678:6: ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2678:7: ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2678:7: ( (lv_this_16_0= RULE_THIS ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2679:1: (lv_this_16_0= RULE_THIS )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2679:1: (lv_this_16_0= RULE_THIS )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2680:3: lv_this_16_0= RULE_THIS
                    {
                    lv_this_16_0=(Token)match(input,RULE_THIS,FOLLOW_RULE_THIS_in_ruleExpression4989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_this_16_0, grammarAccess.getExpressionAccess().getThisTHISTerminalRuleCall_8_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"this",
                              		lv_this_16_0, 
                              		"THIS");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2696:2: ( (lv_aux_17_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2697:1: (lv_aux_17_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2697:1: (lv_aux_17_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2698:3: lv_aux_17_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression5015);
                    lv_aux_17_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_17_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:6: ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:7: ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2715:7: ( (lv_name_18_0= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2716:1: (lv_name_18_0= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2716:1: (lv_name_18_0= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2717:3: lv_name_18_0= RULE_ID
                    {
                    lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression5040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_18_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_9_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_18_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2733:2: ( (lv_aux_19_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2734:1: (lv_aux_19_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2734:1: (lv_aux_19_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2735:3: lv_aux_19_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAuxExpression_auxParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression5066);
                    lv_aux_19_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_19_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


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


    // $ANTLR start "entryRuleExpression_aux"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2759:1: entryRuleExpression_aux returns [EObject current=null] : iv_ruleExpression_aux= ruleExpression_aux EOF ;
    public final EObject entryRuleExpression_aux() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_aux = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2760:2: (iv_ruleExpression_aux= ruleExpression_aux EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2761:2: iv_ruleExpression_aux= ruleExpression_aux EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_auxRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_aux_in_entryRuleExpression_aux5103);
            iv_ruleExpression_aux=ruleExpression_aux();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_aux; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_aux5113); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_aux"


    // $ANTLR start "ruleExpression_aux"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2768:1: ruleExpression_aux returns [EObject current=null] : ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () ) ;
    public final EObject ruleExpression_aux() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token this_INSTANCEOF_14=null;
        Token lv_sgin_17_1=null;
        Token lv_sgin_17_2=null;
        Token lv_numericSign_19_1=null;
        Token lv_numericSign_19_2=null;
        Token lv_numericSign_19_3=null;
        Token lv_numericSign_19_4=null;
        Token lv_numericSign_19_5=null;
        Token lv_numericSign_19_6=null;
        Token lv_numericSign_19_7=null;
        Token lv_numericSign_19_8=null;
        Token lv_numericSign_19_9=null;
        Token lv_numericSign_19_10=null;
        Token lv_testingSign_22_1=null;
        Token lv_testingSign_22_2=null;
        Token lv_testingSign_22_3=null;
        Token lv_testingSign_22_4=null;
        Token lv_testingSign_22_5=null;
        Token lv_testingSign_22_6=null;
        Token lv_logicalSign_25_1=null;
        Token lv_logicalSign_25_2=null;
        Token lv_logicalSign_25_3=null;
        Token lv_logicalSign_25_4=null;
        Token lv_logicalSign_25_5=null;
        Token lv_logicalSign_25_6=null;
        Token lv_logicalSign_25_7=null;
        Token this_WAT_29=null;
        Token this_COLON_31=null;
        Token lv_stringSign_34_1=null;
        Token lv_stringSign_34_2=null;
        Token lv_bitSign_37_1=null;
        Token lv_bitSign_37_2=null;
        Token lv_bitSign_37_3=null;
        Token lv_bitSign_37_4=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux_3_0 = null;

        EObject lv_expression2_5_0 = null;

        EObject lv_aux_7_0 = null;

        EObject lv_expression2_9_0 = null;

        EObject lv_aux_10_0 = null;

        EObject lv_expressionComma_12_0 = null;

        EObject lv_aux_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux_16_0 = null;

        EObject lv_aux_18_0 = null;

        EObject lv_exp2_20_0 = null;

        EObject lv_aux_21_0 = null;

        EObject lv_exp1_23_0 = null;

        EObject lv_aux_24_0 = null;

        EObject lv_ampersand_26_0 = null;

        EObject lv_exp1_27_0 = null;

        EObject lv_aux_28_0 = null;

        EObject lv_exp1_30_0 = null;

        EObject lv_exp2_32_0 = null;

        EObject lv_aux_33_0 = null;

        EObject lv_exp1_35_0 = null;

        EObject lv_aux_36_0 = null;

        EObject lv_expressionBit_38_0 = null;

        EObject lv_aux_39_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2771:28: ( ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:1: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:1: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () )
            int alt55=13;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:4: this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN
                    {
                    this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleExpression_aux5151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_0, grammarAccess.getExpression_auxAccess().getLPARENTerminalRuleCall_0_0_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2776:1: ( (lv_argList_1_0= ruleArg_List ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID||LA47_0==RULE_LPAREN||(LA47_0>=RULE_NULL && LA47_0<=RULE_THIS)||(LA47_0>=RULE_INCREMENT && LA47_0<=RULE_DECREMENT)||LA47_0==RULE_DECIMAL_DIGITS||LA47_0==RULE_HEXA||(LA47_0>=RULE_STRING && LA47_0<=RULE_FALSE)||LA47_0==94) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2777:1: (lv_argList_1_0= ruleArg_List )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2777:1: (lv_argList_1_0= ruleArg_List )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2778:3: lv_argList_1_0= ruleArg_List
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArg_List_in_ruleExpression_aux5171);
                            lv_argList_1_0=ruleArg_List();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"argList",
                                      		lv_argList_1_0, 
                                      		"Arg_List");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleExpression_aux5183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_2, grammarAccess.getExpression_auxAccess().getRPARENTerminalRuleCall_0_0_2()); 
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2798:2: ( (lv_aux_3_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2799:1: (lv_aux_3_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2799:1: (lv_aux_3_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2800:3: lv_aux_3_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5204);
                    lv_aux_3_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_3_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:9: otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleExpression_aux5225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExpression_auxAccess().getLeftSquareBracketKeyword_1_0_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2821:1: ( (lv_expression2_5_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2822:1: (lv_expression2_5_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2822:1: (lv_expression2_5_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2823:3: lv_expression2_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux5246);
                    lv_expression2_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleExpression_aux5258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpression_auxAccess().getRightSquareBracketKeyword_1_0_2());
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2843:2: ( (lv_aux_7_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:1: (lv_aux_7_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:1: (lv_aux_7_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2845:3: lv_aux_7_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5280);
                    lv_aux_7_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_7_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:9: otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,92,FOLLOW_92_in_ruleExpression_aux5301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getExpression_auxAccess().getFullStopKeyword_2_0_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2866:1: ( (lv_expression2_9_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2867:1: (lv_expression2_9_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2867:1: (lv_expression2_9_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:3: lv_expression2_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux5322);
                    lv_expression2_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2884:3: ( (lv_aux_10_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2885:1: (lv_aux_10_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2885:1: (lv_aux_10_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2886:3: lv_aux_10_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5344);
                    lv_aux_10_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_10_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:9: otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) )
                    {
                    otherlv_11=(Token)match(input,70,FOLLOW_70_in_ruleExpression_aux5365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getExpression_auxAccess().getCommaKeyword_3_0_0());
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2907:1: ( (lv_expressionComma_12_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2908:1: (lv_expressionComma_12_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2908:1: (lv_expressionComma_12_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2909:3: lv_expressionComma_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionCommaExpressionParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux5386);
                    lv_expressionComma_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionComma",
                              		lv_expressionComma_12_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2925:3: ( (lv_aux_13_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2926:1: (lv_aux_13_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2926:1: (lv_aux_13_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2927:3: lv_aux_13_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5408);
                    lv_aux_13_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_13_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:8: this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) )
                    {
                    this_INSTANCEOF_14=(Token)match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_ruleExpression_aux5428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INSTANCEOF_14, grammarAccess.getExpression_auxAccess().getINSTANCEOFTerminalRuleCall_4_0_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2948:1: ( (lv_name_15_0= ruleClass_name ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2949:1: (lv_name_15_0= ruleClass_name )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2949:1: (lv_name_15_0= ruleClass_name )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2950:3: lv_name_15_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleExpression_aux5448);
                    lv_name_15_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2966:3: ( (lv_aux_16_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2967:1: (lv_aux_16_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2967:1: (lv_aux_16_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2968:3: lv_aux_16_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5470);
                    lv_aux_16_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_16_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2986:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2986:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2987:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2987:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_INCREMENT) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RULE_DECREMENT) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2988:3: lv_sgin_17_1= RULE_INCREMENT
                            {
                            lv_sgin_17_1=(Token)match(input,RULE_INCREMENT,FOLLOW_RULE_INCREMENT_in_ruleExpression_aux5497); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_sgin_17_1, grammarAccess.getExpression_auxAccess().getSginINCREMENTTerminalRuleCall_5_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"sgin",
                                      		lv_sgin_17_1, 
                                      		"INCREMENT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3003:8: lv_sgin_17_2= RULE_DECREMENT
                            {
                            lv_sgin_17_2=(Token)match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleExpression_aux5517); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_sgin_17_2, grammarAccess.getExpression_auxAccess().getSginDECREMENTTerminalRuleCall_5_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"sgin",
                                      		lv_sgin_17_2, 
                                      		"DECREMENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3021:2: ( (lv_aux_18_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3022:1: (lv_aux_18_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3022:1: (lv_aux_18_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3023:3: lv_aux_18_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5546);
                    lv_aux_18_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_18_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
                    int alt49=10;
                    switch ( input.LA(1) ) {
                    case 93:
                        {
                        alt49=1;
                        }
                        break;
                    case RULE_PLUS_EQUAL:
                        {
                        alt49=2;
                        }
                        break;
                    case 94:
                        {
                        alt49=3;
                        }
                        break;
                    case RULE_MINUS_EQUAL:
                        {
                        alt49=4;
                        }
                        break;
                    case RULE_MULTIPLY:
                        {
                        alt49=5;
                        }
                        break;
                    case RULE_MULTIPLY_EQUAL:
                        {
                        alt49=6;
                        }
                        break;
                    case RULE_DIVIDE:
                        {
                        alt49=7;
                        }
                        break;
                    case RULE_DIVIDE_EQUAL:
                        {
                        alt49=8;
                        }
                        break;
                    case RULE_MODULE:
                        {
                        alt49=9;
                        }
                        break;
                    case RULE_MODULE_EQUAL:
                        {
                        alt49=10;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }

                    switch (alt49) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3043:3: lv_numericSign_19_1= '+'
                            {
                            lv_numericSign_19_1=(Token)match(input,93,FOLLOW_93_in_ruleExpression_aux5574); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_numericSign_19_1, grammarAccess.getExpression_auxAccess().getNumericSignPlusSignKeyword_6_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(current, "numericSign", lv_numericSign_19_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3055:8: lv_numericSign_19_2= RULE_PLUS_EQUAL
                            {
                            lv_numericSign_19_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux5602); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_2, grammarAccess.getExpression_auxAccess().getNumericSignPLUS_EQUALTerminalRuleCall_6_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_2, 
                                      		"PLUS_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3070:8: lv_numericSign_19_3= '-'
                            {
                            lv_numericSign_19_3=(Token)match(input,94,FOLLOW_94_in_ruleExpression_aux5623); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_numericSign_19_3, grammarAccess.getExpression_auxAccess().getNumericSignHyphenMinusKeyword_6_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(current, "numericSign", lv_numericSign_19_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3082:8: lv_numericSign_19_4= RULE_MINUS_EQUAL
                            {
                            lv_numericSign_19_4=(Token)match(input,RULE_MINUS_EQUAL,FOLLOW_RULE_MINUS_EQUAL_in_ruleExpression_aux5651); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_4, grammarAccess.getExpression_auxAccess().getNumericSignMINUS_EQUALTerminalRuleCall_6_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_4, 
                                      		"MINUS_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3097:8: lv_numericSign_19_5= RULE_MULTIPLY
                            {
                            lv_numericSign_19_5=(Token)match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_ruleExpression_aux5671); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_5, grammarAccess.getExpression_auxAccess().getNumericSignMULTIPLYTerminalRuleCall_6_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_5, 
                                      		"MULTIPLY");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3112:8: lv_numericSign_19_6= RULE_MULTIPLY_EQUAL
                            {
                            lv_numericSign_19_6=(Token)match(input,RULE_MULTIPLY_EQUAL,FOLLOW_RULE_MULTIPLY_EQUAL_in_ruleExpression_aux5691); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_6, grammarAccess.getExpression_auxAccess().getNumericSignMULTIPLY_EQUALTerminalRuleCall_6_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_6, 
                                      		"MULTIPLY_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3127:8: lv_numericSign_19_7= RULE_DIVIDE
                            {
                            lv_numericSign_19_7=(Token)match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_ruleExpression_aux5711); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_7, grammarAccess.getExpression_auxAccess().getNumericSignDIVIDETerminalRuleCall_6_0_0_6()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_7, 
                                      		"DIVIDE");
                              	    
                            }

                            }
                            break;
                        case 8 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3142:8: lv_numericSign_19_8= RULE_DIVIDE_EQUAL
                            {
                            lv_numericSign_19_8=(Token)match(input,RULE_DIVIDE_EQUAL,FOLLOW_RULE_DIVIDE_EQUAL_in_ruleExpression_aux5731); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_8, grammarAccess.getExpression_auxAccess().getNumericSignDIVIDE_EQUALTerminalRuleCall_6_0_0_7()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_8, 
                                      		"DIVIDE_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 9 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3157:8: lv_numericSign_19_9= RULE_MODULE
                            {
                            lv_numericSign_19_9=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_ruleExpression_aux5751); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_9, grammarAccess.getExpression_auxAccess().getNumericSignMODULETerminalRuleCall_6_0_0_8()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_9, 
                                      		"MODULE");
                              	    
                            }

                            }
                            break;
                        case 10 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3172:8: lv_numericSign_19_10= RULE_MODULE_EQUAL
                            {
                            lv_numericSign_19_10=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux5771); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numericSign_19_10, grammarAccess.getExpression_auxAccess().getNumericSignMODULE_EQUALTerminalRuleCall_6_0_0_9()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"numericSign",
                                      		lv_numericSign_19_10, 
                                      		"MODULE_EQUAL");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3190:2: ( (lv_exp2_20_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3191:1: (lv_exp2_20_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3191:1: (lv_exp2_20_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3192:3: lv_exp2_20_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux5800);
                    lv_exp2_20_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_20_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3208:2: ( (lv_aux_21_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3209:1: (lv_aux_21_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3209:1: (lv_aux_21_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3210:3: lv_aux_21_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5821);
                    lv_aux_21_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_21_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3228:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3228:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
                    int alt50=6;
                    switch ( input.LA(1) ) {
                    case RULE_BT:
                        {
                        alt50=1;
                        }
                        break;
                    case RULE_ST:
                        {
                        alt50=2;
                        }
                        break;
                    case RULE_BE:
                        {
                        alt50=3;
                        }
                        break;
                    case RULE_SE:
                        {
                        alt50=4;
                        }
                        break;
                    case RULE_DOUBLE_EQUAL:
                        {
                        alt50=5;
                        }
                        break;
                    case RULE_DIFFERENT:
                        {
                        alt50=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3230:3: lv_testingSign_22_1= RULE_BT
                            {
                            lv_testingSign_22_1=(Token)match(input,RULE_BT,FOLLOW_RULE_BT_in_ruleExpression_aux5848); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_1, grammarAccess.getExpression_auxAccess().getTestingSignBTTerminalRuleCall_7_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_1, 
                                      		"BT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3245:8: lv_testingSign_22_2= RULE_ST
                            {
                            lv_testingSign_22_2=(Token)match(input,RULE_ST,FOLLOW_RULE_ST_in_ruleExpression_aux5868); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_2, grammarAccess.getExpression_auxAccess().getTestingSignSTTerminalRuleCall_7_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_2, 
                                      		"ST");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3260:8: lv_testingSign_22_3= RULE_BE
                            {
                            lv_testingSign_22_3=(Token)match(input,RULE_BE,FOLLOW_RULE_BE_in_ruleExpression_aux5888); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_3, grammarAccess.getExpression_auxAccess().getTestingSignBETerminalRuleCall_7_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_3, 
                                      		"BE");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3275:8: lv_testingSign_22_4= RULE_SE
                            {
                            lv_testingSign_22_4=(Token)match(input,RULE_SE,FOLLOW_RULE_SE_in_ruleExpression_aux5908); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_4, grammarAccess.getExpression_auxAccess().getTestingSignSETerminalRuleCall_7_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_4, 
                                      		"SE");
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3290:8: lv_testingSign_22_5= RULE_DOUBLE_EQUAL
                            {
                            lv_testingSign_22_5=(Token)match(input,RULE_DOUBLE_EQUAL,FOLLOW_RULE_DOUBLE_EQUAL_in_ruleExpression_aux5928); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_5, grammarAccess.getExpression_auxAccess().getTestingSignDOUBLE_EQUALTerminalRuleCall_7_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_5, 
                                      		"DOUBLE_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3305:8: lv_testingSign_22_6= RULE_DIFFERENT
                            {
                            lv_testingSign_22_6=(Token)match(input,RULE_DIFFERENT,FOLLOW_RULE_DIFFERENT_in_ruleExpression_aux5948); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_testingSign_22_6, grammarAccess.getExpression_auxAccess().getTestingSignDIFFERENTTerminalRuleCall_7_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"testingSign",
                                      		lv_testingSign_22_6, 
                                      		"DIFFERENT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3323:2: ( (lv_exp1_23_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3324:1: (lv_exp1_23_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3324:1: (lv_exp1_23_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3325:3: lv_exp1_23_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux5977);
                    lv_exp1_23_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_23_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3341:2: ( (lv_aux_24_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3342:1: (lv_aux_24_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3342:1: (lv_aux_24_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3343:3: lv_aux_24_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux5998);
                    lv_aux_24_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_24_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=RULE_MODULE && LA52_0<=RULE_MODULE_EQUAL)||(LA52_0>=RULE_OR && LA52_0<=RULE_DOUBLE_OR_EQUAL)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RULE_AMPERSAND) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3361:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3361:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3362:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3362:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                            int alt51=7;
                            switch ( input.LA(1) ) {
                            case RULE_OR:
                                {
                                alt51=1;
                                }
                                break;
                            case RULE_OR_EQUAL:
                                {
                                alt51=2;
                                }
                                break;
                            case RULE_EXP:
                                {
                                alt51=3;
                                }
                                break;
                            case RULE_EXP_EQUAL:
                                {
                                alt51=4;
                                }
                                break;
                            case RULE_DOUBLE_OR_EQUAL:
                                {
                                alt51=5;
                                }
                                break;
                            case RULE_MODULE:
                                {
                                alt51=6;
                                }
                                break;
                            case RULE_MODULE_EQUAL:
                                {
                                alt51=7;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 0, input);

                                throw nvae;
                            }

                            switch (alt51) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3363:3: lv_logicalSign_25_1= RULE_OR
                                    {
                                    lv_logicalSign_25_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleExpression_aux6026); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_1, grammarAccess.getExpression_auxAccess().getLogicalSignORTerminalRuleCall_8_0_0_0_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_1, 
                                              		"OR");
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3378:8: lv_logicalSign_25_2= RULE_OR_EQUAL
                                    {
                                    lv_logicalSign_25_2=(Token)match(input,RULE_OR_EQUAL,FOLLOW_RULE_OR_EQUAL_in_ruleExpression_aux6046); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_2, grammarAccess.getExpression_auxAccess().getLogicalSignOR_EQUALTerminalRuleCall_8_0_0_0_1()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_2, 
                                              		"OR_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3393:8: lv_logicalSign_25_3= RULE_EXP
                                    {
                                    lv_logicalSign_25_3=(Token)match(input,RULE_EXP,FOLLOW_RULE_EXP_in_ruleExpression_aux6066); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_3, grammarAccess.getExpression_auxAccess().getLogicalSignEXPTerminalRuleCall_8_0_0_0_2()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_3, 
                                              		"EXP");
                                      	    
                                    }

                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:8: lv_logicalSign_25_4= RULE_EXP_EQUAL
                                    {
                                    lv_logicalSign_25_4=(Token)match(input,RULE_EXP_EQUAL,FOLLOW_RULE_EXP_EQUAL_in_ruleExpression_aux6086); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_4, grammarAccess.getExpression_auxAccess().getLogicalSignEXP_EQUALTerminalRuleCall_8_0_0_0_3()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_4, 
                                              		"EXP_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 5 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3423:8: lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL
                                    {
                                    lv_logicalSign_25_5=(Token)match(input,RULE_DOUBLE_OR_EQUAL,FOLLOW_RULE_DOUBLE_OR_EQUAL_in_ruleExpression_aux6106); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_5, grammarAccess.getExpression_auxAccess().getLogicalSignDOUBLE_OR_EQUALTerminalRuleCall_8_0_0_0_4()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_5, 
                                              		"DOUBLE_OR_EQUAL");
                                      	    
                                    }

                                    }
                                    break;
                                case 6 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3438:8: lv_logicalSign_25_6= RULE_MODULE
                                    {
                                    lv_logicalSign_25_6=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_ruleExpression_aux6126); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_6, grammarAccess.getExpression_auxAccess().getLogicalSignMODULETerminalRuleCall_8_0_0_0_5()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_6, 
                                              		"MODULE");
                                      	    
                                    }

                                    }
                                    break;
                                case 7 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3453:8: lv_logicalSign_25_7= RULE_MODULE_EQUAL
                                    {
                                    lv_logicalSign_25_7=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux6146); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_logicalSign_25_7, grammarAccess.getExpression_auxAccess().getLogicalSignMODULE_EQUALTerminalRuleCall_8_0_0_0_6()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getExpression_auxRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"logicalSign",
                                              		lv_logicalSign_25_7, 
                                              		"MODULE_EQUAL");
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3472:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3472:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3473:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3473:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3474:3: lv_ampersand_26_0= ruleAmpersand_Rule
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAmpersandAmpersand_RuleParserRuleCall_8_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAmpersand_Rule_in_ruleExpression_aux6181);
                            lv_ampersand_26_0=ruleAmpersand_Rule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ampersand",
                                      		lv_ampersand_26_0, 
                                      		"Ampersand_Rule");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3490:3: ( (lv_exp1_27_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3491:1: (lv_exp1_27_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3491:1: (lv_exp1_27_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3492:3: lv_exp1_27_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux6203);
                    lv_exp1_27_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_27_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3508:2: ( (lv_aux_28_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3509:1: (lv_aux_28_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3509:1: (lv_aux_28_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3510:3: lv_aux_28_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux6224);
                    lv_aux_28_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_28_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:7: this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) )
                    {
                    this_WAT_29=(Token)match(input,RULE_WAT,FOLLOW_RULE_WAT_in_ruleExpression_aux6243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WAT_29, grammarAccess.getExpression_auxAccess().getWATTerminalRuleCall_9_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3531:1: ( (lv_exp1_30_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3532:1: (lv_exp1_30_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3532:1: (lv_exp1_30_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3533:3: lv_exp1_30_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux6263);
                    lv_exp1_30_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_30_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_COLON_31=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleExpression_aux6274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_31, grammarAccess.getExpression_auxAccess().getCOLONTerminalRuleCall_9_2()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3553:1: ( (lv_exp2_32_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3554:1: (lv_exp2_32_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3554:1: (lv_exp2_32_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3555:3: lv_exp2_32_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux6294);
                    lv_exp2_32_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_32_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3571:2: ( (lv_aux_33_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3572:1: (lv_aux_33_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3572:1: (lv_aux_33_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3573:3: lv_aux_33_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_9_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux6315);
                    lv_aux_33_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_33_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3591:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3591:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3592:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3592:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==93) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==RULE_PLUS_EQUAL) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3593:3: lv_stringSign_34_1= '+'
                            {
                            lv_stringSign_34_1=(Token)match(input,93,FOLLOW_93_in_ruleExpression_aux6343); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_stringSign_34_1, grammarAccess.getExpression_auxAccess().getStringSignPlusSignKeyword_10_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(current, "stringSign", lv_stringSign_34_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3605:8: lv_stringSign_34_2= RULE_PLUS_EQUAL
                            {
                            lv_stringSign_34_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux6371); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_stringSign_34_2, grammarAccess.getExpression_auxAccess().getStringSignPLUS_EQUALTerminalRuleCall_10_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"stringSign",
                                      		lv_stringSign_34_2, 
                                      		"PLUS_EQUAL");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3623:2: ( (lv_exp1_35_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3624:1: (lv_exp1_35_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3624:1: (lv_exp1_35_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3625:3: lv_exp1_35_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux6400);
                    lv_exp1_35_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_35_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3641:2: ( (lv_aux_36_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3642:1: (lv_aux_36_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3642:1: (lv_aux_36_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3643:3: lv_aux_36_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux6421);
                    lv_aux_36_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_36_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3661:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3661:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3662:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3662:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
                    int alt54=4;
                    switch ( input.LA(1) ) {
                    case RULE_R_SHIFT_EQUAL:
                        {
                        alt54=1;
                        }
                        break;
                    case RULE_L_SHIFT:
                        {
                        alt54=2;
                        }
                        break;
                    case RULE_R_SHIFT:
                        {
                        alt54=3;
                        }
                        break;
                    case RULE_SUPER_SHIFT:
                        {
                        alt54=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3663:3: lv_bitSign_37_1= RULE_R_SHIFT_EQUAL
                            {
                            lv_bitSign_37_1=(Token)match(input,RULE_R_SHIFT_EQUAL,FOLLOW_RULE_R_SHIFT_EQUAL_in_ruleExpression_aux6448); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_1, grammarAccess.getExpression_auxAccess().getBitSignR_SHIFT_EQUALTerminalRuleCall_11_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_1, 
                                      		"R_SHIFT_EQUAL");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3678:8: lv_bitSign_37_2= RULE_L_SHIFT
                            {
                            lv_bitSign_37_2=(Token)match(input,RULE_L_SHIFT,FOLLOW_RULE_L_SHIFT_in_ruleExpression_aux6468); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_2, grammarAccess.getExpression_auxAccess().getBitSignL_SHIFTTerminalRuleCall_11_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_2, 
                                      		"L_SHIFT");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3693:8: lv_bitSign_37_3= RULE_R_SHIFT
                            {
                            lv_bitSign_37_3=(Token)match(input,RULE_R_SHIFT,FOLLOW_RULE_R_SHIFT_in_ruleExpression_aux6488); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_3, grammarAccess.getExpression_auxAccess().getBitSignR_SHIFTTerminalRuleCall_11_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_3, 
                                      		"R_SHIFT");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3708:8: lv_bitSign_37_4= RULE_SUPER_SHIFT
                            {
                            lv_bitSign_37_4=(Token)match(input,RULE_SUPER_SHIFT,FOLLOW_RULE_SUPER_SHIFT_in_ruleExpression_aux6508); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_bitSign_37_4, grammarAccess.getExpression_auxAccess().getBitSignSUPER_SHIFTTerminalRuleCall_11_0_0_3()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpression_auxRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"bitSign",
                                      		lv_bitSign_37_4, 
                                      		"SUPER_SHIFT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3726:2: ( (lv_expressionBit_38_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3727:1: (lv_expressionBit_38_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3727:1: (lv_expressionBit_38_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:3: lv_expressionBit_38_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionBitExpressionParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_aux6537);
                    lv_expressionBit_38_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionBit",
                              		lv_expressionBit_38_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3744:2: ( (lv_aux_39_0= ruleExpression_aux ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3745:1: (lv_aux_39_0= ruleExpression_aux )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3745:1: (lv_aux_39_0= ruleExpression_aux )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3746:3: lv_aux_39_0= ruleExpression_aux
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_11_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_aux_in_ruleExpression_aux6558);
                    lv_aux_39_0=ruleExpression_aux();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_auxRule());
                      	        }
                             		set(
                             			current, 
                             			"aux",
                              		lv_aux_39_0, 
                              		"Expression_aux");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3763:6: ()
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3763:6: ()
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3764:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_auxAccess().getExpression_auxAction_12(),
                                  current);
                          
                    }

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
    // $ANTLR end "ruleExpression_aux"


    // $ANTLR start "entryRuleAmpersand_Rule"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3780:1: entryRuleAmpersand_Rule returns [EObject current=null] : iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF ;
    public final EObject entryRuleAmpersand_Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmpersand_Rule = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3781:2: (iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3782:2: iv_ruleAmpersand_Rule= ruleAmpersand_Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAmpersand_RuleRule()); 
            }
            pushFollow(FOLLOW_ruleAmpersand_Rule_in_entryRuleAmpersand_Rule6613);
            iv_ruleAmpersand_Rule=ruleAmpersand_Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAmpersand_Rule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAmpersand_Rule6623); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAmpersand_Rule"


    // $ANTLR start "ruleAmpersand_Rule"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3789:1: ruleAmpersand_Rule returns [EObject current=null] : ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? ) ;
    public final EObject ruleAmpersand_Rule() throws RecognitionException {
        EObject current = null;

        Token lv_a1_0_0=null;
        Token lv_a2_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3792:28: ( ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3793:1: ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3793:1: ( ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3793:2: ( (lv_a1_0_0= RULE_AMPERSAND ) ) ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3793:2: ( (lv_a1_0_0= RULE_AMPERSAND ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3794:1: (lv_a1_0_0= RULE_AMPERSAND )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3794:1: (lv_a1_0_0= RULE_AMPERSAND )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3795:3: lv_a1_0_0= RULE_AMPERSAND
            {
            lv_a1_0_0=(Token)match(input,RULE_AMPERSAND,FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule6665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_a1_0_0, grammarAccess.getAmpersand_RuleAccess().getA1AMPERSANDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAmpersand_RuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"a1",
                      		lv_a1_0_0, 
                      		"AMPERSAND");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3811:2: ( ( (lv_a2_1_0= RULE_AMPERSAND ) ) | otherlv_2= '=' )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_AMPERSAND) ) {
                alt56=1;
            }
            else if ( (LA56_0==76) ) {
                alt56=2;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3811:3: ( (lv_a2_1_0= RULE_AMPERSAND ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3811:3: ( (lv_a2_1_0= RULE_AMPERSAND ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3812:1: (lv_a2_1_0= RULE_AMPERSAND )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3812:1: (lv_a2_1_0= RULE_AMPERSAND )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3813:3: lv_a2_1_0= RULE_AMPERSAND
                    {
                    lv_a2_1_0=(Token)match(input,RULE_AMPERSAND,FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule6688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_a2_1_0, grammarAccess.getAmpersand_RuleAccess().getA2AMPERSANDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAmpersand_RuleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"a2",
                              		lv_a2_1_0, 
                              		"AMPERSAND");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3830:7: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleAmpersand_Rule6711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAmpersand_RuleAccess().getEqualsSignKeyword_1_1());
                          
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
    // $ANTLR end "ruleAmpersand_Rule"


    // $ANTLR start "entryRuleFloat_Literal"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3842:1: entryRuleFloat_Literal returns [EObject current=null] : iv_ruleFloat_Literal= ruleFloat_Literal EOF ;
    public final EObject entryRuleFloat_Literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat_Literal = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3843:2: (iv_ruleFloat_Literal= ruleFloat_Literal EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3844:2: iv_ruleFloat_Literal= ruleFloat_Literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat_LiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloat_Literal_in_entryRuleFloat_Literal6749);
            iv_ruleFloat_Literal=ruleFloat_Literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat_Literal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat_Literal6759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloat_Literal"


    // $ANTLR start "ruleFloat_Literal"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3851:1: ruleFloat_Literal returns [EObject current=null] : ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) ;
    public final EObject ruleFloat_Literal() throws RecognitionException {
        EObject current = null;

        Token lv_decimalDigits1_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalDigits2_2_0=null;
        Token lv_floatTypeSufix_4_0=null;
        AntlrDatatypeRuleToken lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3854:28: ( ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3855:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3855:1: ( ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3855:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) ) otherlv_1= '.' ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )? ( (lv_exp_3_0= ruleEXPOENT_PART ) )? ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3855:2: ( (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3856:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3856:1: (lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3857:3: lv_decimalDigits1_0_0= RULE_DECIMAL_DIGITS
            {
            lv_decimalDigits1_0_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal6801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_decimalDigits1_0_0, grammarAccess.getFloat_LiteralAccess().getDecimalDigits1DECIMAL_DIGITSTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"decimalDigits1",
                      		lv_decimalDigits1_0_0, 
                      		"DECIMAL_DIGITS");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleFloat_Literal6818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloat_LiteralAccess().getFullStopKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3877:1: ( (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_DECIMAL_DIGITS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3878:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3878:1: (lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3879:3: lv_decimalDigits2_2_0= RULE_DECIMAL_DIGITS
                    {
                    lv_decimalDigits2_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal6835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_decimalDigits2_2_0, grammarAccess.getFloat_LiteralAccess().getDecimalDigits2DECIMAL_DIGITSTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"decimalDigits2",
                              		lv_decimalDigits2_2_0, 
                              		"DECIMAL_DIGITS");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3895:3: ( (lv_exp_3_0= ruleEXPOENT_PART ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_EXPONENTIAL) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3896:1: (lv_exp_3_0= ruleEXPOENT_PART )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3896:1: (lv_exp_3_0= ruleEXPOENT_PART )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3897:3: lv_exp_3_0= ruleEXPOENT_PART
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloat_LiteralAccess().getExpEXPOENT_PARTParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEXPOENT_PART_in_ruleFloat_Literal6862);
                    lv_exp_3_0=ruleEXPOENT_PART();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_3_0, 
                              		"EXPOENT_PART");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3913:3: ( (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_FLOAT_TYPE_SUFIX) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3914:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3914:1: (lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3915:3: lv_floatTypeSufix_4_0= RULE_FLOAT_TYPE_SUFIX
                    {
                    lv_floatTypeSufix_4_0=(Token)match(input,RULE_FLOAT_TYPE_SUFIX,FOLLOW_RULE_FLOAT_TYPE_SUFIX_in_ruleFloat_Literal6880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_floatTypeSufix_4_0, grammarAccess.getFloat_LiteralAccess().getFloatTypeSufixFLOAT_TYPE_SUFIXTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFloat_LiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"floatTypeSufix",
                              		lv_floatTypeSufix_4_0, 
                              		"FLOAT_TYPE_SUFIX");
                      	    
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
    // $ANTLR end "ruleFloat_Literal"


    // $ANTLR start "entryRuleLiteral_Expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3939:1: entryRuleLiteral_Expression returns [EObject current=null] : iv_ruleLiteral_Expression= ruleLiteral_Expression EOF ;
    public final EObject entryRuleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral_Expression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3940:2: (iv_ruleLiteral_Expression= ruleLiteral_Expression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3941:2: iv_ruleLiteral_Expression= ruleLiteral_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteral_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_Expression_in_entryRuleLiteral_Expression6922);
            iv_ruleLiteral_Expression=ruleLiteral_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral_Expression6932); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral_Expression"


    // $ANTLR start "ruleLiteral_Expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3948:1: ruleLiteral_Expression returns [EObject current=null] : ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) ) ;
    public final EObject ruleLiteral_Expression() throws RecognitionException {
        EObject current = null;

        Token lv_exp_0_0=null;
        Token this_LONG_1=null;
        Token lv_exp1_2_0=null;
        Token this_LONG_3=null;
        Token lv_string_5_0=null;
        Token lv_char_6_0=null;
        EObject lv_exp2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3951:28: ( ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:1: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) | ( (lv_exp2_4_0= ruleFloat_Literal ) ) | ( (lv_string_5_0= RULE_STRING ) ) | ( (lv_char_6_0= RULE_CHAR ) ) )
            int alt63=4;
            switch ( input.LA(1) ) {
            case RULE_HEXA:
                {
                alt63=1;
                }
                break;
            case RULE_DECIMAL_DIGITS:
                {
                int LA63_2 = input.LA(2);

                if ( (synpred132_InternalMyDsl()) ) {
                    alt63=1;
                }
                else if ( (synpred133_InternalMyDsl()) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt63=3;
                }
                break;
            case RULE_CHAR:
                {
                alt63=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_HEXA) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==RULE_DECIMAL_DIGITS) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:4: ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )?
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:4: ( (lv_exp_0_0= RULE_HEXA ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3953:1: (lv_exp_0_0= RULE_HEXA )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3953:1: (lv_exp_0_0= RULE_HEXA )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3954:3: lv_exp_0_0= RULE_HEXA
                            {
                            lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_ruleLiteral_Expression6976); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_exp_0_0, grammarAccess.getLiteral_ExpressionAccess().getExpHEXATerminalRuleCall_0_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"exp",
                                      		lv_exp_0_0, 
                                      		"HEXA");
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3970:2: (this_LONG_1= RULE_LONG )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==RULE_LONG) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3970:3: this_LONG_1= RULE_LONG
                                    {
                                    this_LONG_1=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_ruleLiteral_Expression6993); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_LONG_1, grammarAccess.getLiteral_ExpressionAccess().getLONGTerminalRuleCall_0_0_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )?
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3976:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3976:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3977:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                            {
                            lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleLiteral_Expression7019); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_exp1_2_0, grammarAccess.getLiteral_ExpressionAccess().getExp1DECIMAL_DIGITSTerminalRuleCall_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"exp1",
                                      		lv_exp1_2_0, 
                                      		"DECIMAL_DIGITS");
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3993:2: (this_LONG_3= RULE_LONG )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==RULE_LONG) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3993:3: this_LONG_3= RULE_LONG
                                    {
                                    this_LONG_3=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_ruleLiteral_Expression7036); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_LONG_3, grammarAccess.getLiteral_ExpressionAccess().getLONGTerminalRuleCall_0_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3998:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3998:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3999:1: (lv_exp2_4_0= ruleFloat_Literal )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3999:1: (lv_exp2_4_0= ruleFloat_Literal )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4000:3: lv_exp2_4_0= ruleFloat_Literal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFloat_Literal_in_ruleLiteral_Expression7066);
                    lv_exp2_4_0=ruleFloat_Literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_4_0, 
                              		"Float_Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4017:6: ( (lv_string_5_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4017:6: ( (lv_string_5_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4018:1: (lv_string_5_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4018:1: (lv_string_5_0= RULE_STRING )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4019:3: lv_string_5_0= RULE_STRING
                    {
                    lv_string_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral_Expression7089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_5_0, grammarAccess.getLiteral_ExpressionAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"string",
                              		lv_string_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4036:6: ( (lv_char_6_0= RULE_CHAR ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4036:6: ( (lv_char_6_0= RULE_CHAR ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4037:1: (lv_char_6_0= RULE_CHAR )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4037:1: (lv_char_6_0= RULE_CHAR )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4038:3: lv_char_6_0= RULE_CHAR
                    {
                    lv_char_6_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleLiteral_Expression7117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_char_6_0, grammarAccess.getLiteral_ExpressionAccess().getCharCHARTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteral_ExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"char",
                              		lv_char_6_0, 
                              		"CHAR");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleLiteral_Expression"


    // $ANTLR start "entryRuleCreating_Expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4062:1: entryRuleCreating_Expression returns [EObject current=null] : iv_ruleCreating_Expression= ruleCreating_Expression EOF ;
    public final EObject entryRuleCreating_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreating_Expression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4063:2: (iv_ruleCreating_Expression= ruleCreating_Expression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4064:2: iv_ruleCreating_Expression= ruleCreating_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreating_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCreating_Expression_in_entryRuleCreating_Expression7158);
            iv_ruleCreating_Expression=ruleCreating_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreating_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreating_Expression7168); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreating_Expression"


    // $ANTLR start "ruleCreating_Expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4071:1: ruleCreating_Expression returns [EObject current=null] : (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) ) ;
    public final EObject ruleCreating_Expression() throws RecognitionException {
        EObject current = null;

        Token this_NEW_0=null;
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_LPAREN_13=null;
        Token this_RPAREN_15=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;

        AntlrDatatypeRuleToken lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_expression_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4074:28: ( (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4075:1: (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4075:1: (this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4075:2: this_NEW_0= RULE_NEW ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) )
            {
            this_NEW_0=(Token)match(input,RULE_NEW,FOLLOW_RULE_NEW_in_ruleCreating_Expression7204); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NEW_0, grammarAccess.getCreating_ExpressionAccess().getNEWTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) )
            int alt66=3;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:3: ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:3: ( (lv_className_1_0= ruleClass_name ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4080:1: (lv_className_1_0= ruleClass_name )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4080:1: (lv_className_1_0= ruleClass_name )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4081:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleCreating_Expression7226);
                    lv_className_1_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"className",
                              		lv_className_1_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCreating_Expression7237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_2, grammarAccess.getCreating_ExpressionAccess().getLPARENTerminalRuleCall_1_0_1()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4101:1: ( (lv_argList_3_0= ruleArg_List ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4102:1: (lv_argList_3_0= ruleArg_List )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4102:1: (lv_argList_3_0= ruleArg_List )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4103:3: lv_argList_3_0= ruleArg_List
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArg_List_in_ruleCreating_Expression7257);
                    lv_argList_3_0=ruleArg_List();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"argList",
                              		lv_argList_3_0, 
                              		"Arg_List");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCreating_Expression7268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_4, grammarAccess.getCreating_ExpressionAccess().getRPARENTerminalRuleCall_1_0_3()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4125:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4125:1: (lv_typeSpecifier_5_0= ruleType_specifier )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4126:3: lv_typeSpecifier_5_0= ruleType_specifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_specifier_in_ruleCreating_Expression7296);
                    lv_typeSpecifier_5_0=ruleType_specifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"typeSpecifier",
                              		lv_typeSpecifier_5_0, 
                              		"Type_specifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:2: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:5: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleCreating_Expression7310); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketKeyword_1_1_1_0_0());
                                  
                            }
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4146:1: ( (lv_expression_7_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:1: (lv_expression_7_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:1: (lv_expression_7_0= ruleExpression )
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4148:3: lv_expression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCreating_Expression7331);
                            lv_expression_7_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_7_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,74,FOLLOW_74_in_ruleCreating_Expression7343); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreating_ExpressionAccess().getRightSquareBracketKeyword_1_1_1_0_2());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4169:7: otherlv_9= '[]'
                            {
                            otherlv_9=(Token)match(input,75,FOLLOW_75_in_ruleCreating_Expression7362); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:3: ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
                    loop65:
                    do {
                        int alt65=3;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==73) ) {
                            int LA65_2 = input.LA(2);

                            if ( (LA65_2==74) ) {
                                alt65=1;
                            }


                        }
                        else if ( (LA65_0==75) ) {
                            alt65=2;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:4: (otherlv_10= '[' otherlv_11= ']' )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:4: (otherlv_10= '[' otherlv_11= ']' )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:6: otherlv_10= '[' otherlv_11= ']'
                    	    {
                    	    otherlv_10=(Token)match(input,73,FOLLOW_73_in_ruleCreating_Expression7378); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketKeyword_1_1_2_0_0());
                    	          
                    	    }
                    	    otherlv_11=(Token)match(input,74,FOLLOW_74_in_ruleCreating_Expression7390); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCreating_ExpressionAccess().getRightSquareBracketKeyword_1_1_2_0_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4182:7: otherlv_12= '[]'
                    	    {
                    	    otherlv_12=(Token)match(input,75,FOLLOW_75_in_ruleCreating_Expression7409); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getCreating_ExpressionAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4187:6: (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4187:6: (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4187:7: this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN
                    {
                    this_LPAREN_13=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCreating_Expression7430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_13, grammarAccess.getCreating_ExpressionAccess().getLPARENTerminalRuleCall_1_2_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4191:1: ( (lv_expression_14_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4192:1: (lv_expression_14_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4192:1: (lv_expression_14_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4193:3: lv_expression_14_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCreating_Expression7450);
                    lv_expression_14_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreating_ExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_14_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RPAREN_15=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCreating_Expression7461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_15, grammarAccess.getCreating_ExpressionAccess().getRPARENTerminalRuleCall_1_2_2()); 
                          
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
    // $ANTLR end "ruleCreating_Expression"


    // $ANTLR start "entryRuleCast_Expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4221:1: entryRuleCast_Expression returns [EObject current=null] : iv_ruleCast_Expression= ruleCast_Expression EOF ;
    public final EObject entryRuleCast_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast_Expression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4222:2: (iv_ruleCast_Expression= ruleCast_Expression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4223:2: iv_ruleCast_Expression= ruleCast_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCast_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCast_Expression_in_entryRuleCast_Expression7498);
            iv_ruleCast_Expression=ruleCast_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCast_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast_Expression7508); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCast_Expression"


    // $ANTLR start "ruleCast_Expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4230:1: ruleCast_Expression returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCast_Expression() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4233:28: ( (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4234:1: (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4234:1: (this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4234:2: this_LPAREN_0= RULE_LPAREN ( (lv_type_1_0= ruleType ) ) this_RPAREN_2= RULE_RPAREN ( (lv_expression_3_0= ruleExpression ) )
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCast_Expression7544); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_0, grammarAccess.getCast_ExpressionAccess().getLPARENTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4238:1: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4239:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4239:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4240:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleCast_Expression7564);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCast_ExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCast_Expression7575); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_2, grammarAccess.getCast_ExpressionAccess().getRPARENTerminalRuleCall_2()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4260:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4261:1: (lv_expression_3_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4261:1: (lv_expression_3_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4262:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCast_ExpressionAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCast_Expression7595);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCast_ExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
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
    // $ANTLR end "ruleCast_Expression"


    // $ANTLR start "entryRuleBit_Expression_NR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4286:1: entryRuleBit_Expression_NR returns [EObject current=null] : iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF ;
    public final EObject entryRuleBit_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBit_Expression_NR = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4287:2: (iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4288:2: iv_ruleBit_Expression_NR= ruleBit_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBit_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_ruleBit_Expression_NR_in_entryRuleBit_Expression_NR7631);
            iv_ruleBit_Expression_NR=ruleBit_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBit_Expression_NR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBit_Expression_NR7641); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBit_Expression_NR"


    // $ANTLR start "ruleBit_Expression_NR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4295:1: ruleBit_Expression_NR returns [EObject current=null] : (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleBit_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4298:28: ( (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4299:1: (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4299:1: (this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4299:2: this_NOT_0= RULE_NOT ( (lv_expression_1_0= ruleExpression ) )
            {
            this_NOT_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleBit_Expression_NR7677); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NOT_0, grammarAccess.getBit_Expression_NRAccess().getNOTTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4303:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4304:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4304:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4305:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBit_Expression_NRAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleBit_Expression_NR7697);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBit_Expression_NRRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
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
    // $ANTLR end "ruleBit_Expression_NR"


    // $ANTLR start "entryRuleLogical_Expression_NR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4329:1: entryRuleLogical_Expression_NR returns [EObject current=null] : iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF ;
    public final EObject entryRuleLogical_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical_Expression_NR = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4330:2: (iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4331:2: iv_ruleLogical_Expression_NR= ruleLogical_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_Expression_NR_in_entryRuleLogical_Expression_NR7733);
            iv_ruleLogical_Expression_NR=ruleLogical_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_Expression_NR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical_Expression_NR7743); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogical_Expression_NR"


    // $ANTLR start "ruleLogical_Expression_NR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4338:1: ruleLogical_Expression_NR returns [EObject current=null] : ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) ;
    public final EObject ruleLogical_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token this_EXCLAMATION_0=null;
        Token lv_true_2_0=null;
        Token lv_false_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4341:28: ( ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4342:1: ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4342:1: ( (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case RULE_EXCLAMATION:
                {
                alt67=1;
                }
                break;
            case RULE_TRUE:
                {
                alt67=2;
                }
                break;
            case RULE_FALSE:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4342:2: (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4342:2: (this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4342:3: this_EXCLAMATION_0= RULE_EXCLAMATION ( (lv_expression_1_0= ruleExpression ) )
                    {
                    this_EXCLAMATION_0=(Token)match(input,RULE_EXCLAMATION,FOLLOW_RULE_EXCLAMATION_in_ruleLogical_Expression_NR7780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXCLAMATION_0, grammarAccess.getLogical_Expression_NRAccess().getEXCLAMATIONTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4346:1: ( (lv_expression_1_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4347:1: (lv_expression_1_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4347:1: (lv_expression_1_0= ruleExpression )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4348:3: lv_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogical_Expression_NRAccess().getExpressionExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLogical_Expression_NR7800);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4365:6: ( (lv_true_2_0= RULE_TRUE ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4365:6: ( (lv_true_2_0= RULE_TRUE ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4366:1: (lv_true_2_0= RULE_TRUE )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4366:1: (lv_true_2_0= RULE_TRUE )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4367:3: lv_true_2_0= RULE_TRUE
                    {
                    lv_true_2_0=(Token)match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_ruleLogical_Expression_NR7824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_true_2_0, grammarAccess.getLogical_Expression_NRAccess().getTrueTRUETerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"true",
                              		lv_true_2_0, 
                              		"TRUE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4384:6: ( (lv_false_3_0= RULE_FALSE ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4384:6: ( (lv_false_3_0= RULE_FALSE ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4385:1: (lv_false_3_0= RULE_FALSE )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4385:1: (lv_false_3_0= RULE_FALSE )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4386:3: lv_false_3_0= RULE_FALSE
                    {
                    lv_false_3_0=(Token)match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_ruleLogical_Expression_NR7852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_false_3_0, grammarAccess.getLogical_Expression_NRAccess().getFalseFALSETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogical_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"false",
                              		lv_false_3_0, 
                              		"FALSE");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleLogical_Expression_NR"


    // $ANTLR start "entryRuleArg_List"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4410:1: entryRuleArg_List returns [EObject current=null] : iv_ruleArg_List= ruleArg_List EOF ;
    public final EObject entryRuleArg_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg_List = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4411:2: (iv_ruleArg_List= ruleArg_List EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4412:2: iv_ruleArg_List= ruleArg_List EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArg_ListRule()); 
            }
            pushFollow(FOLLOW_ruleArg_List_in_entryRuleArg_List7893);
            iv_ruleArg_List=ruleArg_List();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArg_List; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg_List7903); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArg_List"


    // $ANTLR start "ruleArg_List"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4419:1: ruleArg_List returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArg_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4422:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4423:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4423:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4423:2: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4423:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4424:1: (lv_expression_0_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4424:1: (lv_expression_0_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4425:3: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArg_List7949);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArg_ListRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4441:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==70) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4441:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleArg_List7962); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArg_ListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4445:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4446:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4446:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4447:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArg_ListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArg_List7983);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArg_ListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


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
    // $ANTLR end "ruleArg_List"


    // $ANTLR start "entryRuleNumeric_Expression_NR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4471:1: entryRuleNumeric_Expression_NR returns [EObject current=null] : iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF ;
    public final EObject entryRuleNumeric_Expression_NR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeric_Expression_NR = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4472:2: (iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4473:2: iv_ruleNumeric_Expression_NR= ruleNumeric_Expression_NR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_Expression_NRRule()); 
            }
            pushFollow(FOLLOW_ruleNumeric_Expression_NR_in_entryRuleNumeric_Expression_NR8021);
            iv_ruleNumeric_Expression_NR=ruleNumeric_Expression_NR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeric_Expression_NR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeric_Expression_NR8031); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumeric_Expression_NR"


    // $ANTLR start "ruleNumeric_Expression_NR"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4480:1: ruleNumeric_Expression_NR returns [EObject current=null] : ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleNumeric_Expression_NR() throws RecognitionException {
        EObject current = null;

        Token lv_sinal_numeric_0_1=null;
        Token lv_sinal_numeric_0_2=null;
        Token lv_sinal_numeric_0_3=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4483:28: ( ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4484:1: ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4484:1: ( ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4484:2: ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4484:2: ( ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4485:1: ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4485:1: ( (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4486:1: (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4486:1: (lv_sinal_numeric_0_1= '-' | lv_sinal_numeric_0_2= RULE_INCREMENT | lv_sinal_numeric_0_3= RULE_DECREMENT )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt69=1;
                }
                break;
            case RULE_INCREMENT:
                {
                alt69=2;
                }
                break;
            case RULE_DECREMENT:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4487:3: lv_sinal_numeric_0_1= '-'
                    {
                    lv_sinal_numeric_0_1=(Token)match(input,94,FOLLOW_94_in_ruleNumeric_Expression_NR8076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_sinal_numeric_0_1, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericHyphenMinusKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(current, "sinal_numeric", lv_sinal_numeric_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4499:8: lv_sinal_numeric_0_2= RULE_INCREMENT
                    {
                    lv_sinal_numeric_0_2=(Token)match(input,RULE_INCREMENT,FOLLOW_RULE_INCREMENT_in_ruleNumeric_Expression_NR8104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_numeric_0_2, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericINCREMENTTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal_numeric",
                              		lv_sinal_numeric_0_2, 
                              		"INCREMENT");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4514:8: lv_sinal_numeric_0_3= RULE_DECREMENT
                    {
                    lv_sinal_numeric_0_3=(Token)match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_ruleNumeric_Expression_NR8124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sinal_numeric_0_3, grammarAccess.getNumeric_Expression_NRAccess().getSinal_numericDECREMENTTerminalRuleCall_0_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNumeric_Expression_NRRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sinal_numeric",
                              		lv_sinal_numeric_0_3, 
                              		"DECREMENT");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4532:2: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4533:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4533:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4534:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_Expression_NRAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNumeric_Expression_NR8153);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_NRRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
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
    // $ANTLR end "ruleNumeric_Expression_NR"


    // $ANTLR start "entryRuleSwitch_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4558:1: entryRuleSwitch_statement returns [EObject current=null] : iv_ruleSwitch_statement= ruleSwitch_statement EOF ;
    public final EObject entryRuleSwitch_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4559:2: (iv_ruleSwitch_statement= ruleSwitch_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4560:2: iv_ruleSwitch_statement= ruleSwitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement8189);
            iv_ruleSwitch_statement=ruleSwitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch_statement8199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitch_statement"


    // $ANTLR start "ruleSwitch_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4567:1: ruleSwitch_statement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE ) ;
    public final EObject ruleSwitch_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lParen_2_0=null;
        Token lv_rparent_4_0=null;
        Token this_R_CURLY_BRACE_5=null;
        Token otherlv_6=null;
        Token this_COLON_8=null;
        Token otherlv_9=null;
        Token this_COLON_10=null;
        Token this_L_CURLY_BRACE_12=null;
        EObject lv_expression_3_0 = null;

        EObject lv_expression2_7_0 = null;

        EObject lv_switchStatements_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4570:28: ( ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:1: ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:2: () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) this_R_CURLY_BRACE_5= RULE_R_CURLY_BRACE ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )* this_L_CURLY_BRACE_12= RULE_L_CURLY_BRACE
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4571:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4572:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitch_statementAccess().getSwitch_statementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,95,FOLLOW_95_in_ruleSwitch_statement8248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4584:1: ( (lv_lParen_2_0= RULE_LPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4585:1: (lv_lParen_2_0= RULE_LPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4585:1: (lv_lParen_2_0= RULE_LPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4586:3: lv_lParen_2_0= RULE_LPAREN
            {
            lv_lParen_2_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSwitch_statement8265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lParen_2_0, grammarAccess.getSwitch_statementAccess().getLParenLPARENTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitch_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lParen",
                      		lv_lParen_2_0, 
                      		"LPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4602:2: ( (lv_expression_3_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4603:1: (lv_expression_3_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4603:1: (lv_expression_3_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4604:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitch_statement8291);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4620:2: ( (lv_rparent_4_0= RULE_RPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4621:1: (lv_rparent_4_0= RULE_RPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4621:1: (lv_rparent_4_0= RULE_RPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4622:3: lv_rparent_4_0= RULE_RPAREN
            {
            lv_rparent_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSwitch_statement8308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_4_0, grammarAccess.getSwitch_statementAccess().getRparentRPARENTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitch_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_4_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            this_R_CURLY_BRACE_5=(Token)match(input,RULE_R_CURLY_BRACE,FOLLOW_RULE_R_CURLY_BRACE_in_ruleSwitch_statement8324); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_R_CURLY_BRACE_5, grammarAccess.getSwitch_statementAccess().getR_CURLY_BRACETerminalRuleCall_5()); 
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4642:1: ( (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON ) | (otherlv_9= 'default' this_COLON_10= RULE_COLON ) | ( (lv_switchStatements_11_0= ruleStatement ) ) )*
            loop70:
            do {
                int alt70=4;
                switch ( input.LA(1) ) {
                case 96:
                    {
                    alt70=1;
                    }
                    break;
                case 97:
                    {
                    alt70=2;
                    }
                    break;
                case RULE_ID:
                case RULE_R_CURLY_BRACE:
                case RULE_LPAREN:
                case RULE_MOD:
                case RULE_STATIC:
                case RULE_NULL:
                case RULE_SUPER:
                case RULE_THIS:
                case RULE_INCREMENT:
                case RULE_DECREMENT:
                case RULE_DECIMAL_DIGITS:
                case RULE_HEXA:
                case RULE_STRING:
                case RULE_CHAR:
                case RULE_NEW:
                case RULE_NOT:
                case RULE_EXCLAMATION:
                case RULE_TRUE:
                case RULE_FALSE:
                case 69:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 94:
                case 95:
                case 98:
                case 99:
                case 101:
                case 103:
                    {
                    alt70=3;
                    }
                    break;

                }

                switch (alt70) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4642:2: (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4642:2: (otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4642:4: otherlv_6= 'case' ( (lv_expression2_7_0= ruleExpression ) ) this_COLON_8= RULE_COLON
            	    {
            	    otherlv_6=(Token)match(input,96,FOLLOW_96_in_ruleSwitch_statement8337); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSwitch_statementAccess().getCaseKeyword_6_0_0());
            	          
            	    }
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4646:1: ( (lv_expression2_7_0= ruleExpression ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4647:1: (lv_expression2_7_0= ruleExpression )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4647:1: (lv_expression2_7_0= ruleExpression )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4648:3: lv_expression2_7_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getExpression2ExpressionParserRuleCall_6_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleSwitch_statement8358);
            	    lv_expression2_7_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expression2",
            	              		lv_expression2_7_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSwitch_statement8369); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_8, grammarAccess.getSwitch_statementAccess().getCOLONTerminalRuleCall_6_0_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4669:6: (otherlv_9= 'default' this_COLON_10= RULE_COLON )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4669:6: (otherlv_9= 'default' this_COLON_10= RULE_COLON )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4669:8: otherlv_9= 'default' this_COLON_10= RULE_COLON
            	    {
            	    otherlv_9=(Token)match(input,97,FOLLOW_97_in_ruleSwitch_statement8388); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_6_1_0());
            	          
            	    }
            	    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSwitch_statement8399); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_10, grammarAccess.getSwitch_statementAccess().getCOLONTerminalRuleCall_6_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4678:6: ( (lv_switchStatements_11_0= ruleStatement ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4678:6: ( (lv_switchStatements_11_0= ruleStatement ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4679:1: (lv_switchStatements_11_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4679:1: (lv_switchStatements_11_0= ruleStatement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4680:3: lv_switchStatements_11_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getSwitchStatementsStatementParserRuleCall_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleSwitch_statement8426);
            	    lv_switchStatements_11_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"switchStatements",
            	              		lv_switchStatements_11_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            this_L_CURLY_BRACE_12=(Token)match(input,RULE_L_CURLY_BRACE,FOLLOW_RULE_L_CURLY_BRACE_in_ruleSwitch_statement8439); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_L_CURLY_BRACE_12, grammarAccess.getSwitch_statementAccess().getL_CURLY_BRACETerminalRuleCall_7()); 
                  
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
    // $ANTLR end "ruleSwitch_statement"


    // $ANTLR start "entryRuleWhile_Statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4708:1: entryRuleWhile_Statement returns [EObject current=null] : iv_ruleWhile_Statement= ruleWhile_Statement EOF ;
    public final EObject entryRuleWhile_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile_Statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4709:2: (iv_ruleWhile_Statement= ruleWhile_Statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4710:2: iv_ruleWhile_Statement= ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement8474);
            iv_ruleWhile_Statement=ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement8484); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile_Statement"


    // $ANTLR start "ruleWhile_Statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4717:1: ruleWhile_Statement returns [EObject current=null] : (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rparent_2_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_whileStatement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4720:28: ( (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4721:1: (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4721:1: (otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4721:3: otherlv_0= 'while(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_rparent_2_0= RULE_RPAREN ) ) ( (lv_whileStatement_3_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,98,FOLLOW_98_in_ruleWhile_Statement8521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_StatementAccess().getWhileKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4725:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4726:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4726:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4727:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile_Statement8542);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4743:2: ( (lv_rparent_2_0= RULE_RPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4744:1: (lv_rparent_2_0= RULE_RPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4744:1: (lv_rparent_2_0= RULE_RPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4745:3: lv_rparent_2_0= RULE_RPAREN
            {
            lv_rparent_2_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleWhile_Statement8559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_2_0, grammarAccess.getWhile_StatementAccess().getRparentRPARENTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhile_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_2_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4761:2: ( (lv_whileStatement_3_0= ruleStatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4762:1: (lv_whileStatement_3_0= ruleStatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4762:1: (lv_whileStatement_3_0= ruleStatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4763:3: lv_whileStatement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getWhileStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile_Statement8585);
            lv_whileStatement_3_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"whileStatement",
                      		lv_whileStatement_3_0, 
                      		"Statement");
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
    // $ANTLR end "ruleWhile_Statement"


    // $ANTLR start "entryRuleDo_Statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4787:1: entryRuleDo_Statement returns [EObject current=null] : iv_ruleDo_Statement= ruleDo_Statement EOF ;
    public final EObject entryRuleDo_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo_Statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4788:2: (iv_ruleDo_Statement= ruleDo_Statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4789:2: iv_ruleDo_Statement= ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement8621);
            iv_ruleDo_Statement=ruleDo_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDo_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement8631); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDo_Statement"


    // $ANTLR start "ruleDo_Statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4796:1: ruleDo_Statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' ) ;
    public final EObject ruleDo_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_lparent_3_0=null;
        Token lv_rparent_4_0=null;
        Token otherlv_5=null;
        EObject lv_doStatement_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4799:28: ( (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4800:1: (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4800:1: (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4800:3: otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while' ( (lv_lparent_3_0= RULE_LPAREN ) ) ( (lv_rparent_4_0= RULE_RPAREN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleDo_Statement8668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_StatementAccess().getDoKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4804:1: ( (lv_doStatement_1_0= ruleStatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4805:1: (lv_doStatement_1_0= ruleStatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4805:1: (lv_doStatement_1_0= ruleStatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4806:3: lv_doStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getDoStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleDo_Statement8689);
            lv_doStatement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDo_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"doStatement",
                      		lv_doStatement_1_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,100,FOLLOW_100_in_ruleDo_Statement8701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_StatementAccess().getWhileKeyword_2());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4826:1: ( (lv_lparent_3_0= RULE_LPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4827:1: (lv_lparent_3_0= RULE_LPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4827:1: (lv_lparent_3_0= RULE_LPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4828:3: lv_lparent_3_0= RULE_LPAREN
            {
            lv_lparent_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleDo_Statement8718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lparent_3_0, grammarAccess.getDo_StatementAccess().getLparentLPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDo_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lparent",
                      		lv_lparent_3_0, 
                      		"LPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4844:2: ( (lv_rparent_4_0= RULE_RPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4845:1: (lv_rparent_4_0= RULE_RPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4845:1: (lv_rparent_4_0= RULE_RPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4846:3: lv_rparent_4_0= RULE_RPAREN
            {
            lv_rparent_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleDo_Statement8740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_4_0, grammarAccess.getDo_StatementAccess().getRparentRPARENTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDo_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_4_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleDo_Statement8757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDo_StatementAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleDo_Statement"


    // $ANTLR start "entryRuleIf_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4874:1: entryRuleIf_statement returns [EObject current=null] : iv_ruleIf_statement= ruleIf_statement EOF ;
    public final EObject entryRuleIf_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4875:2: (iv_ruleIf_statement= ruleIf_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4876:2: iv_ruleIf_statement= ruleIf_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_entryRuleIf_statement8793);
            iv_ruleIf_statement=ruleIf_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_statement8803); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIf_statement"


    // $ANTLR start "ruleIf_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4883:1: ruleIf_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lparen_1_0=null;
        Token lv_rparent_3_0=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_idStatement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4886:28: ( (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4887:1: (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4887:1: (otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4887:3: otherlv_0= 'if' ( (lv_lparen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_idStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleIf_statement8840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4891:1: ( (lv_lparen_1_0= RULE_LPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4892:1: (lv_lparen_1_0= RULE_LPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4892:1: (lv_lparen_1_0= RULE_LPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4893:3: lv_lparen_1_0= RULE_LPAREN
            {
            lv_lparen_1_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIf_statement8857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lparen_1_0, grammarAccess.getIf_statementAccess().getLparenLPARENTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIf_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lparen",
                      		lv_lparen_1_0, 
                      		"LPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4909:2: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4910:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4910:1: (lv_expression_2_0= ruleExpression )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4911:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIf_statement8883);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4927:2: ( (lv_rparent_3_0= RULE_RPAREN ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4928:1: (lv_rparent_3_0= RULE_RPAREN )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4928:1: (lv_rparent_3_0= RULE_RPAREN )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4929:3: lv_rparent_3_0= RULE_RPAREN
            {
            lv_rparent_3_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIf_statement8900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_3_0, grammarAccess.getIf_statementAccess().getRparentRPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIf_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_3_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4945:2: ( (lv_idStatement_4_0= ruleStatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4946:1: (lv_idStatement_4_0= ruleStatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4946:1: (lv_idStatement_4_0= ruleStatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4947:3: lv_idStatement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getIdStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf_statement8926);
            lv_idStatement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"idStatement",
                      		lv_idStatement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==102) ) {
                int LA71_1 = input.LA(2);

                if ( (synpred150_InternalMyDsl()) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,102,FOLLOW_102_in_ruleIf_statement8947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIf_statementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4968:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4969:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4969:1: (lv_elseStatement_6_0= ruleStatement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4970:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf_statement8969);
                    lv_elseStatement_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"Statement");
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
    // $ANTLR end "ruleIf_statement"


    // $ANTLR start "entryRuleTry_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4994:1: entryRuleTry_statement returns [EObject current=null] : iv_ruleTry_statement= ruleTry_statement EOF ;
    public final EObject entryRuleTry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4995:2: (iv_ruleTry_statement= ruleTry_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4996:2: iv_ruleTry_statement= ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement9007);
            iv_ruleTry_statement=ruleTry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement9017); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTry_statement"


    // $ANTLR start "ruleTry_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5003:1: ruleTry_statement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) ;
    public final EObject ruleTry_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_lParen_3_0=null;
        Token lv_rparent_5_0=null;
        Token otherlv_7=null;
        EObject lv_tryStatement_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_catchStatement_6_0 = null;

        EObject lv_finallyStatement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5006:28: ( (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5007:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5007:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5007:3: otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleTry_statement9054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTry_statementAccess().getTryKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5011:1: ( (lv_tryStatement_1_0= ruleStatement ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5012:1: (lv_tryStatement_1_0= ruleStatement )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5012:1: (lv_tryStatement_1_0= ruleStatement )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5013:3: lv_tryStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement9075);
            lv_tryStatement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
              	        }
                     		set(
                     			current, 
                     			"tryStatement",
                      		lv_tryStatement_1_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:2: ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==104) ) {
                    int LA72_2 = input.LA(2);

                    if ( (synpred152_InternalMyDsl()) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:3: ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:3: ( ( 'catch' )=>otherlv_2= 'catch' )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:4: ( 'catch' )=>otherlv_2= 'catch'
            	    {
            	    otherlv_2=(Token)match(input,104,FOLLOW_104_in_ruleTry_statement9096); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5034:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5035:1: (lv_lParen_3_0= RULE_LPAREN )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5035:1: (lv_lParen_3_0= RULE_LPAREN )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5036:3: lv_lParen_3_0= RULE_LPAREN
            	    {
            	    lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleTry_statement9114); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_lParen_3_0, grammarAccess.getTry_statementAccess().getLParenLPARENTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTry_statementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"lParen",
            	              		lv_lParen_3_0, 
            	              		"LPAREN");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5052:2: ( (lv_parameters_4_0= ruleParameter ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5053:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5053:1: (lv_parameters_4_0= ruleParameter )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5054:3: lv_parameters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleTry_statement9140);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_4_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5070:2: ( (lv_rparent_5_0= RULE_RPAREN ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5071:1: (lv_rparent_5_0= RULE_RPAREN )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5071:1: (lv_rparent_5_0= RULE_RPAREN )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5072:3: lv_rparent_5_0= RULE_RPAREN
            	    {
            	    lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleTry_statement9157); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_rparent_5_0, grammarAccess.getTry_statementAccess().getRparentRPARENTerminalRuleCall_2_3_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTry_statementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"rparent",
            	              		lv_rparent_5_0, 
            	              		"RPAREN");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5088:2: ( (lv_catchStatement_6_0= ruleStatement ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5089:1: (lv_catchStatement_6_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5089:1: (lv_catchStatement_6_0= ruleStatement )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5090:3: lv_catchStatement_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementStatementParserRuleCall_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement9183);
            	    lv_catchStatement_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"catchStatement",
            	              		lv_catchStatement_6_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:4: ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==105) ) {
                int LA73_1 = input.LA(2);

                if ( (synpred154_InternalMyDsl()) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:5: ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:5: ( ( 'finally' )=>otherlv_7= 'finally' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:6: ( 'finally' )=>otherlv_7= 'finally'
                    {
                    otherlv_7=(Token)match(input,105,FOLLOW_105_in_ruleTry_statement9206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5111:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5112:1: (lv_finallyStatement_8_0= ruleStatement )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5112:1: (lv_finallyStatement_8_0= ruleStatement )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5113:3: lv_finallyStatement_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement9228);
                    lv_finallyStatement_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyStatement",
                              		lv_finallyStatement_8_0, 
                              		"Statement");
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
    // $ANTLR end "ruleTry_statement"


    // $ANTLR start "entryRuleImport_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5137:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5138:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5139:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement9266);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement9276); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport_statement"


    // $ANTLR start "ruleImport_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5146:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        AntlrDatatypeRuleToken lv_pacName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5149:28: ( (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5150:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5150:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5150:3: otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleImport_statement9313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5154:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5154:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5154:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5154:3: ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5154:3: ( (lv_className_1_0= ruleClass_name ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5155:1: (lv_className_1_0= ruleClass_name )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5155:1: (lv_className_1_0= ruleClass_name )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5156:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement9336);
                    lv_className_1_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImport_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"className",
                              		lv_className_1_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleImport_statement9348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:7: ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5177:7: ( (lv_pacName_3_0= rulePackage_name ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5178:1: (lv_pacName_3_0= rulePackage_name )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5178:1: (lv_pacName_3_0= rulePackage_name )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5179:3: lv_pacName_3_0= rulePackage_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement9377);
                    lv_pacName_3_0=rulePackage_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImport_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"pacName",
                              		lv_pacName_3_0, 
                              		"Package_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,107,FOLLOW_107_in_ruleImport_statement9389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1());
                          
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
    // $ANTLR end "ruleImport_statement"


    // $ANTLR start "entryRuleClass_name"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5207:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5208:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5209:2: iv_ruleClass_name= ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name9428);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name9439); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass_name"


    // $ANTLR start "ruleClass_name"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5216:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5219:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5221:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name9485);
            this_Package_name_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleClass_name"


    // $ANTLR start "entryRuleInterface_name"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5239:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5240:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5241:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name9530);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name9541); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface_name"


    // $ANTLR start "ruleInterface_name"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5248:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5251:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5253:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name9587);
            this_Package_name_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleInterface_name"


    // $ANTLR start "entryRulePackage_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5271:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5272:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5273:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement9631);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement9641); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage_statement"


    // $ANTLR start "rulePackage_statement"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5280:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_pacName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5283:28: ( (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5284:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5284:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5284:3: otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_rulePackage_statement9678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5288:1: ( (lv_pacName_1_0= rulePackage_name ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5289:1: (lv_pacName_1_0= rulePackage_name )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5289:1: (lv_pacName_1_0= rulePackage_name )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5290:3: lv_pacName_1_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement9699);
            lv_pacName_1_0=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackage_statementRule());
              	        }
                     		set(
                     			current, 
                     			"pacName",
                      		lv_pacName_1_0, 
                      		"Package_name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_69_in_rulePackage_statement9711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "rulePackage_statement"


    // $ANTLR start "entryRulePackage_name"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5318:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5319:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5320:2: iv_rulePackage_name= rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name9748);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name9759); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage_name"


    // $ANTLR start "rulePackage_name"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5327:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_line_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5330:28: ( (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5331:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5331:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5331:6: this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name9799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_rulePackage_name9826);
            this_Package_name_line_1=rulePackage_name_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Package_name_line_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "rulePackage_name"


    // $ANTLR start "entryRulePackage_name_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5357:1: entryRulePackage_name_line returns [String current=null] : iv_rulePackage_name_line= rulePackage_name_line EOF ;
    public final String entryRulePackage_name_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_line = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5358:2: (iv_rulePackage_name_line= rulePackage_name_line EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5359:2: iv_rulePackage_name_line= rulePackage_name_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_lineRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line9872);
            iv_rulePackage_name_line=rulePackage_name_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name_line.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_line9883); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage_name_line"


    // $ANTLR start "rulePackage_name_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5366:1: rulePackage_name_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5369:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5370:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5370:1: (kw= '.' this_ID_1= RULE_ID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==92) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred156_InternalMyDsl()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5371:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,92,FOLLOW_92_in_rulePackage_name_line9921); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_line9936); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // $ANTLR end "rulePackage_name_line"


    // $ANTLR start "entryRuleEXPOENT_PART"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5391:1: entryRuleEXPOENT_PART returns [String current=null] : iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF ;
    public final String entryRuleEXPOENT_PART() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXPOENT_PART = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5392:2: (iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5393:2: iv_ruleEXPOENT_PART= ruleEXPOENT_PART EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPOENT_PARTRule()); 
            }
            pushFollow(FOLLOW_ruleEXPOENT_PART_in_entryRuleEXPOENT_PART9983);
            iv_ruleEXPOENT_PART=ruleEXPOENT_PART();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPOENT_PART.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPOENT_PART9994); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEXPOENT_PART"


    // $ANTLR start "ruleEXPOENT_PART"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5400:1: ruleEXPOENT_PART returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS ) ;
    public final AntlrDatatypeRuleToken ruleEXPOENT_PART() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXPONENTIAL_0=null;
        Token this_DECIMAL_DIGITS_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5403:28: ( (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5404:1: (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5404:1: (this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5404:6: this_EXPONENTIAL_0= RULE_EXPONENTIAL this_DECIMAL_DIGITS_1= RULE_DECIMAL_DIGITS
            {
            this_EXPONENTIAL_0=(Token)match(input,RULE_EXPONENTIAL,FOLLOW_RULE_EXPONENTIAL_in_ruleEXPOENT_PART10034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EXPONENTIAL_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EXPONENTIAL_0, grammarAccess.getEXPOENT_PARTAccess().getEXPONENTIALTerminalRuleCall_0()); 
                  
            }
            this_DECIMAL_DIGITS_1=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_ruleEXPOENT_PART10054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DECIMAL_DIGITS_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DECIMAL_DIGITS_1, grammarAccess.getEXPOENT_PARTAccess().getDECIMAL_DIGITSTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleEXPOENT_PART"

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_variableDeclaration_0_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:2: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1774:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1774:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1775:3: lv_variableDeclaration_0_0= ruleVariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_declaration_in_synpred50_InternalMyDsl3497);
        lv_variableDeclaration_0_0=ruleVariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_g_2_0=null;
        EObject lv_expressionStatement_1_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:6: ( ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:7: ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:7: ( (lv_expressionStatement_1_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1793:1: (lv_expressionStatement_1_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1793:1: (lv_expressionStatement_1_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:3: lv_expressionStatement_1_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementExpressionParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred51_InternalMyDsl3525);
        lv_expressionStatement_1_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:2: ( (lv_g_2_0= ';' ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:1: (lv_g_2_0= ';' )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:1: (lv_g_2_0= ';' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:3: lv_g_2_0= ';'
        {
        lv_g_2_0=(Token)match(input,69,FOLLOW_69_in_synpred51_InternalMyDsl3543); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred69_InternalMyDsl
    public final void synpred69_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_variable_2_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:2: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:2: ( (lv_variable_2_0= ruleVariable_declaration ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:1: (lv_variable_2_0= ruleVariable_declaration )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:1: (lv_variable_2_0= ruleVariable_declaration )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2241:3: lv_variable_2_0= ruleVariable_declaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_declaration_in_synpred69_InternalMyDsl4307);
        lv_variable_2_0=ruleVariable_declaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred69_InternalMyDsl

    // $ANTLR start synpred86_InternalMyDsl
    public final void synpred86_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        EObject lv_argList_1_0 = null;

        EObject lv_aux_3_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:2: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:2: ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:3: (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2772:4: this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN
        {
        this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred86_InternalMyDsl5151); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2776:1: ( (lv_argList_1_0= ruleArg_List ) )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID||LA86_0==RULE_LPAREN||(LA86_0>=RULE_NULL && LA86_0<=RULE_THIS)||(LA86_0>=RULE_INCREMENT && LA86_0<=RULE_DECREMENT)||LA86_0==RULE_DECIMAL_DIGITS||LA86_0==RULE_HEXA||(LA86_0>=RULE_STRING && LA86_0<=RULE_FALSE)||LA86_0==94) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2777:1: (lv_argList_1_0= ruleArg_List )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2777:1: (lv_argList_1_0= ruleArg_List )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2778:3: lv_argList_1_0= ruleArg_List
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getArgListArg_ListParserRuleCall_0_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleArg_List_in_synpred86_InternalMyDsl5171);
                lv_argList_1_0=ruleArg_List();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_synpred86_InternalMyDsl5183); if (state.failed) return ;

        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2798:2: ( (lv_aux_3_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2799:1: (lv_aux_3_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2799:1: (lv_aux_3_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2800:3: lv_aux_3_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred86_InternalMyDsl5204);
        lv_aux_3_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred86_InternalMyDsl

    // $ANTLR start synpred87_InternalMyDsl
    public final void synpred87_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression2_5_0 = null;

        EObject lv_aux_7_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:6: ( ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:6: ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:7: (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2817:9: otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']'
        {
        otherlv_4=(Token)match(input,73,FOLLOW_73_in_synpred87_InternalMyDsl5225); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2821:1: ( (lv_expression2_5_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2822:1: (lv_expression2_5_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2822:1: (lv_expression2_5_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2823:3: lv_expression2_5_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred87_InternalMyDsl5246);
        lv_expression2_5_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,74,FOLLOW_74_in_synpred87_InternalMyDsl5258); if (state.failed) return ;

        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2843:2: ( (lv_aux_7_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:1: (lv_aux_7_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2844:1: (lv_aux_7_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2845:3: lv_aux_7_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred87_InternalMyDsl5280);
        lv_aux_7_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred87_InternalMyDsl

    // $ANTLR start synpred88_InternalMyDsl
    public final void synpred88_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        EObject lv_expression2_9_0 = null;

        EObject lv_aux_10_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:6: ( ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:6: ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:7: (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2862:9: otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) )
        {
        otherlv_8=(Token)match(input,92,FOLLOW_92_in_synpred88_InternalMyDsl5301); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2866:1: ( (lv_expression2_9_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2867:1: (lv_expression2_9_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2867:1: (lv_expression2_9_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2868:3: lv_expression2_9_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpression2ExpressionParserRuleCall_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred88_InternalMyDsl5322);
        lv_expression2_9_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2884:3: ( (lv_aux_10_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2885:1: (lv_aux_10_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2885:1: (lv_aux_10_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2886:3: lv_aux_10_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred88_InternalMyDsl5344);
        lv_aux_10_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred88_InternalMyDsl

    // $ANTLR start synpred89_InternalMyDsl
    public final void synpred89_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        EObject lv_expressionComma_12_0 = null;

        EObject lv_aux_13_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:6: ( ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:6: ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:7: (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2903:9: otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) )
        {
        otherlv_11=(Token)match(input,70,FOLLOW_70_in_synpred89_InternalMyDsl5365); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2907:1: ( (lv_expressionComma_12_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2908:1: (lv_expressionComma_12_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2908:1: (lv_expressionComma_12_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2909:3: lv_expressionComma_12_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionCommaExpressionParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred89_InternalMyDsl5386);
        lv_expressionComma_12_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2925:3: ( (lv_aux_13_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2926:1: (lv_aux_13_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2926:1: (lv_aux_13_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2927:3: lv_aux_13_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred89_InternalMyDsl5408);
        lv_aux_13_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred89_InternalMyDsl

    // $ANTLR start synpred90_InternalMyDsl
    public final void synpred90_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_INSTANCEOF_14=null;
        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_aux_16_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:6: ( ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:6: ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:7: (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2944:8: this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) )
        {
        this_INSTANCEOF_14=(Token)match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_synpred90_InternalMyDsl5428); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2948:1: ( (lv_name_15_0= ruleClass_name ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2949:1: (lv_name_15_0= ruleClass_name )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2949:1: (lv_name_15_0= ruleClass_name )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2950:3: lv_name_15_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getNameClass_nameParserRuleCall_4_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleClass_name_in_synpred90_InternalMyDsl5448);
        lv_name_15_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2966:3: ( (lv_aux_16_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2967:1: (lv_aux_16_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2967:1: (lv_aux_16_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2968:3: lv_aux_16_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_4_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred90_InternalMyDsl5470);
        lv_aux_16_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred90_InternalMyDsl

    // $ANTLR start synpred92_InternalMyDsl
    public final void synpred92_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_sgin_17_1=null;
        Token lv_sgin_17_2=null;
        EObject lv_aux_18_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:6: ( ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:6: ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2985:7: ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2986:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2986:1: ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2987:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2987:1: (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT )
        int alt87=2;
        int LA87_0 = input.LA(1);

        if ( (LA87_0==RULE_INCREMENT) ) {
            alt87=1;
        }
        else if ( (LA87_0==RULE_DECREMENT) ) {
            alt87=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 87, 0, input);

            throw nvae;
        }
        switch (alt87) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2988:3: lv_sgin_17_1= RULE_INCREMENT
                {
                lv_sgin_17_1=(Token)match(input,RULE_INCREMENT,FOLLOW_RULE_INCREMENT_in_synpred92_InternalMyDsl5497); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3003:8: lv_sgin_17_2= RULE_DECREMENT
                {
                lv_sgin_17_2=(Token)match(input,RULE_DECREMENT,FOLLOW_RULE_DECREMENT_in_synpred92_InternalMyDsl5517); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3021:2: ( (lv_aux_18_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3022:1: (lv_aux_18_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3022:1: (lv_aux_18_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3023:3: lv_aux_18_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred92_InternalMyDsl5546);
        lv_aux_18_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred92_InternalMyDsl

    // $ANTLR start synpred102_InternalMyDsl
    public final void synpred102_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_numericSign_19_1=null;
        Token lv_numericSign_19_2=null;
        Token lv_numericSign_19_3=null;
        Token lv_numericSign_19_4=null;
        Token lv_numericSign_19_5=null;
        Token lv_numericSign_19_6=null;
        Token lv_numericSign_19_7=null;
        Token lv_numericSign_19_8=null;
        Token lv_numericSign_19_9=null;
        Token lv_numericSign_19_10=null;
        EObject lv_exp2_20_0 = null;

        EObject lv_aux_21_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:6: ( ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:6: ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3040:7: ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3041:1: ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3042:1: (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL )
        int alt88=10;
        switch ( input.LA(1) ) {
        case 93:
            {
            alt88=1;
            }
            break;
        case RULE_PLUS_EQUAL:
            {
            alt88=2;
            }
            break;
        case 94:
            {
            alt88=3;
            }
            break;
        case RULE_MINUS_EQUAL:
            {
            alt88=4;
            }
            break;
        case RULE_MULTIPLY:
            {
            alt88=5;
            }
            break;
        case RULE_MULTIPLY_EQUAL:
            {
            alt88=6;
            }
            break;
        case RULE_DIVIDE:
            {
            alt88=7;
            }
            break;
        case RULE_DIVIDE_EQUAL:
            {
            alt88=8;
            }
            break;
        case RULE_MODULE:
            {
            alt88=9;
            }
            break;
        case RULE_MODULE_EQUAL:
            {
            alt88=10;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 88, 0, input);

            throw nvae;
        }

        switch (alt88) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3043:3: lv_numericSign_19_1= '+'
                {
                lv_numericSign_19_1=(Token)match(input,93,FOLLOW_93_in_synpred102_InternalMyDsl5574); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3055:8: lv_numericSign_19_2= RULE_PLUS_EQUAL
                {
                lv_numericSign_19_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_synpred102_InternalMyDsl5602); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3070:8: lv_numericSign_19_3= '-'
                {
                lv_numericSign_19_3=(Token)match(input,94,FOLLOW_94_in_synpred102_InternalMyDsl5623); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3082:8: lv_numericSign_19_4= RULE_MINUS_EQUAL
                {
                lv_numericSign_19_4=(Token)match(input,RULE_MINUS_EQUAL,FOLLOW_RULE_MINUS_EQUAL_in_synpred102_InternalMyDsl5651); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3097:8: lv_numericSign_19_5= RULE_MULTIPLY
                {
                lv_numericSign_19_5=(Token)match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_synpred102_InternalMyDsl5671); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3112:8: lv_numericSign_19_6= RULE_MULTIPLY_EQUAL
                {
                lv_numericSign_19_6=(Token)match(input,RULE_MULTIPLY_EQUAL,FOLLOW_RULE_MULTIPLY_EQUAL_in_synpred102_InternalMyDsl5691); if (state.failed) return ;

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3127:8: lv_numericSign_19_7= RULE_DIVIDE
                {
                lv_numericSign_19_7=(Token)match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_synpred102_InternalMyDsl5711); if (state.failed) return ;

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3142:8: lv_numericSign_19_8= RULE_DIVIDE_EQUAL
                {
                lv_numericSign_19_8=(Token)match(input,RULE_DIVIDE_EQUAL,FOLLOW_RULE_DIVIDE_EQUAL_in_synpred102_InternalMyDsl5731); if (state.failed) return ;

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3157:8: lv_numericSign_19_9= RULE_MODULE
                {
                lv_numericSign_19_9=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_synpred102_InternalMyDsl5751); if (state.failed) return ;

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3172:8: lv_numericSign_19_10= RULE_MODULE_EQUAL
                {
                lv_numericSign_19_10=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_synpred102_InternalMyDsl5771); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3190:2: ( (lv_exp2_20_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3191:1: (lv_exp2_20_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3191:1: (lv_exp2_20_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3192:3: lv_exp2_20_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_6_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred102_InternalMyDsl5800);
        lv_exp2_20_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3208:2: ( (lv_aux_21_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3209:1: (lv_aux_21_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3209:1: (lv_aux_21_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3210:3: lv_aux_21_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_6_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred102_InternalMyDsl5821);
        lv_aux_21_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred102_InternalMyDsl

    // $ANTLR start synpred108_InternalMyDsl
    public final void synpred108_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_testingSign_22_1=null;
        Token lv_testingSign_22_2=null;
        Token lv_testingSign_22_3=null;
        Token lv_testingSign_22_4=null;
        Token lv_testingSign_22_5=null;
        Token lv_testingSign_22_6=null;
        EObject lv_exp1_23_0 = null;

        EObject lv_aux_24_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:6: ( ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:6: ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3227:7: ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3228:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3228:1: ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3229:1: (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT )
        int alt89=6;
        switch ( input.LA(1) ) {
        case RULE_BT:
            {
            alt89=1;
            }
            break;
        case RULE_ST:
            {
            alt89=2;
            }
            break;
        case RULE_BE:
            {
            alt89=3;
            }
            break;
        case RULE_SE:
            {
            alt89=4;
            }
            break;
        case RULE_DOUBLE_EQUAL:
            {
            alt89=5;
            }
            break;
        case RULE_DIFFERENT:
            {
            alt89=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3230:3: lv_testingSign_22_1= RULE_BT
                {
                lv_testingSign_22_1=(Token)match(input,RULE_BT,FOLLOW_RULE_BT_in_synpred108_InternalMyDsl5848); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3245:8: lv_testingSign_22_2= RULE_ST
                {
                lv_testingSign_22_2=(Token)match(input,RULE_ST,FOLLOW_RULE_ST_in_synpred108_InternalMyDsl5868); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3260:8: lv_testingSign_22_3= RULE_BE
                {
                lv_testingSign_22_3=(Token)match(input,RULE_BE,FOLLOW_RULE_BE_in_synpred108_InternalMyDsl5888); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3275:8: lv_testingSign_22_4= RULE_SE
                {
                lv_testingSign_22_4=(Token)match(input,RULE_SE,FOLLOW_RULE_SE_in_synpred108_InternalMyDsl5908); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3290:8: lv_testingSign_22_5= RULE_DOUBLE_EQUAL
                {
                lv_testingSign_22_5=(Token)match(input,RULE_DOUBLE_EQUAL,FOLLOW_RULE_DOUBLE_EQUAL_in_synpred108_InternalMyDsl5928); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3305:8: lv_testingSign_22_6= RULE_DIFFERENT
                {
                lv_testingSign_22_6=(Token)match(input,RULE_DIFFERENT,FOLLOW_RULE_DIFFERENT_in_synpred108_InternalMyDsl5948); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3323:2: ( (lv_exp1_23_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3324:1: (lv_exp1_23_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3324:1: (lv_exp1_23_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3325:3: lv_exp1_23_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_7_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred108_InternalMyDsl5977);
        lv_exp1_23_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3341:2: ( (lv_aux_24_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3342:1: (lv_aux_24_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3342:1: (lv_aux_24_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3343:3: lv_aux_24_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_7_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred108_InternalMyDsl5998);
        lv_aux_24_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred108_InternalMyDsl

    // $ANTLR start synpred116_InternalMyDsl
    public final void synpred116_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_logicalSign_25_1=null;
        Token lv_logicalSign_25_2=null;
        Token lv_logicalSign_25_3=null;
        Token lv_logicalSign_25_4=null;
        Token lv_logicalSign_25_5=null;
        Token lv_logicalSign_25_6=null;
        Token lv_logicalSign_25_7=null;
        EObject lv_ampersand_26_0 = null;

        EObject lv_exp1_27_0 = null;

        EObject lv_aux_28_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:6: ( ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:6: ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:7: ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) )
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( ((LA92_0>=RULE_MODULE && LA92_0<=RULE_MODULE_EQUAL)||(LA92_0>=RULE_OR && LA92_0<=RULE_DOUBLE_OR_EQUAL)) ) {
            alt92=1;
        }
        else if ( (LA92_0==RULE_AMPERSAND) ) {
            alt92=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 92, 0, input);

            throw nvae;
        }
        switch (alt92) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3360:8: ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3361:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3361:1: ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3362:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3362:1: (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL )
                int alt91=7;
                switch ( input.LA(1) ) {
                case RULE_OR:
                    {
                    alt91=1;
                    }
                    break;
                case RULE_OR_EQUAL:
                    {
                    alt91=2;
                    }
                    break;
                case RULE_EXP:
                    {
                    alt91=3;
                    }
                    break;
                case RULE_EXP_EQUAL:
                    {
                    alt91=4;
                    }
                    break;
                case RULE_DOUBLE_OR_EQUAL:
                    {
                    alt91=5;
                    }
                    break;
                case RULE_MODULE:
                    {
                    alt91=6;
                    }
                    break;
                case RULE_MODULE_EQUAL:
                    {
                    alt91=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 0, input);

                    throw nvae;
                }

                switch (alt91) {
                    case 1 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3363:3: lv_logicalSign_25_1= RULE_OR
                        {
                        lv_logicalSign_25_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_synpred116_InternalMyDsl6026); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3378:8: lv_logicalSign_25_2= RULE_OR_EQUAL
                        {
                        lv_logicalSign_25_2=(Token)match(input,RULE_OR_EQUAL,FOLLOW_RULE_OR_EQUAL_in_synpred116_InternalMyDsl6046); if (state.failed) return ;

                        }
                        break;
                    case 3 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3393:8: lv_logicalSign_25_3= RULE_EXP
                        {
                        lv_logicalSign_25_3=(Token)match(input,RULE_EXP,FOLLOW_RULE_EXP_in_synpred116_InternalMyDsl6066); if (state.failed) return ;

                        }
                        break;
                    case 4 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3408:8: lv_logicalSign_25_4= RULE_EXP_EQUAL
                        {
                        lv_logicalSign_25_4=(Token)match(input,RULE_EXP_EQUAL,FOLLOW_RULE_EXP_EQUAL_in_synpred116_InternalMyDsl6086); if (state.failed) return ;

                        }
                        break;
                    case 5 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3423:8: lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL
                        {
                        lv_logicalSign_25_5=(Token)match(input,RULE_DOUBLE_OR_EQUAL,FOLLOW_RULE_DOUBLE_OR_EQUAL_in_synpred116_InternalMyDsl6106); if (state.failed) return ;

                        }
                        break;
                    case 6 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3438:8: lv_logicalSign_25_6= RULE_MODULE
                        {
                        lv_logicalSign_25_6=(Token)match(input,RULE_MODULE,FOLLOW_RULE_MODULE_in_synpred116_InternalMyDsl6126); if (state.failed) return ;

                        }
                        break;
                    case 7 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3453:8: lv_logicalSign_25_7= RULE_MODULE_EQUAL
                        {
                        lv_logicalSign_25_7=(Token)match(input,RULE_MODULE_EQUAL,FOLLOW_RULE_MODULE_EQUAL_in_synpred116_InternalMyDsl6146); if (state.failed) return ;

                        }
                        break;

                }


                }


                }


                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3472:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3472:6: ( (lv_ampersand_26_0= ruleAmpersand_Rule ) )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3473:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3473:1: (lv_ampersand_26_0= ruleAmpersand_Rule )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3474:3: lv_ampersand_26_0= ruleAmpersand_Rule
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAmpersandAmpersand_RuleParserRuleCall_8_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleAmpersand_Rule_in_synpred116_InternalMyDsl6181);
                lv_ampersand_26_0=ruleAmpersand_Rule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3490:3: ( (lv_exp1_27_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3491:1: (lv_exp1_27_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3491:1: (lv_exp1_27_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3492:3: lv_exp1_27_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_8_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred116_InternalMyDsl6203);
        lv_exp1_27_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3508:2: ( (lv_aux_28_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3509:1: (lv_aux_28_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3509:1: (lv_aux_28_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3510:3: lv_aux_28_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_8_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred116_InternalMyDsl6224);
        lv_aux_28_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred116_InternalMyDsl

    // $ANTLR start synpred117_InternalMyDsl
    public final void synpred117_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_WAT_29=null;
        Token this_COLON_31=null;
        EObject lv_exp1_30_0 = null;

        EObject lv_exp2_32_0 = null;

        EObject lv_aux_33_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:6: ( (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:6: (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3527:7: this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) )
        {
        this_WAT_29=(Token)match(input,RULE_WAT,FOLLOW_RULE_WAT_in_synpred117_InternalMyDsl6243); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3531:1: ( (lv_exp1_30_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3532:1: (lv_exp1_30_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3532:1: (lv_exp1_30_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3533:3: lv_exp1_30_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_9_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred117_InternalMyDsl6263);
        lv_exp1_30_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_COLON_31=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_synpred117_InternalMyDsl6274); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3553:1: ( (lv_exp2_32_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3554:1: (lv_exp2_32_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3554:1: (lv_exp2_32_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3555:3: lv_exp2_32_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp2ExpressionParserRuleCall_9_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred117_InternalMyDsl6294);
        lv_exp2_32_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3571:2: ( (lv_aux_33_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3572:1: (lv_aux_33_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3572:1: (lv_aux_33_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3573:3: lv_aux_33_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_9_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred117_InternalMyDsl6315);
        lv_aux_33_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred117_InternalMyDsl

    // $ANTLR start synpred119_InternalMyDsl
    public final void synpred119_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_stringSign_34_1=null;
        Token lv_stringSign_34_2=null;
        EObject lv_exp1_35_0 = null;

        EObject lv_aux_36_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:6: ( ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:6: ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3590:7: ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3591:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3591:1: ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3592:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3592:1: (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL )
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==93) ) {
            alt93=1;
        }
        else if ( (LA93_0==RULE_PLUS_EQUAL) ) {
            alt93=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3593:3: lv_stringSign_34_1= '+'
                {
                lv_stringSign_34_1=(Token)match(input,93,FOLLOW_93_in_synpred119_InternalMyDsl6343); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3605:8: lv_stringSign_34_2= RULE_PLUS_EQUAL
                {
                lv_stringSign_34_2=(Token)match(input,RULE_PLUS_EQUAL,FOLLOW_RULE_PLUS_EQUAL_in_synpred119_InternalMyDsl6371); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3623:2: ( (lv_exp1_35_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3624:1: (lv_exp1_35_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3624:1: (lv_exp1_35_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3625:3: lv_exp1_35_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExp1ExpressionParserRuleCall_10_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred119_InternalMyDsl6400);
        lv_exp1_35_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3641:2: ( (lv_aux_36_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3642:1: (lv_aux_36_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3642:1: (lv_aux_36_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3643:3: lv_aux_36_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_10_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred119_InternalMyDsl6421);
        lv_aux_36_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred119_InternalMyDsl

    // $ANTLR start synpred123_InternalMyDsl
    public final void synpred123_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_bitSign_37_1=null;
        Token lv_bitSign_37_2=null;
        Token lv_bitSign_37_3=null;
        Token lv_bitSign_37_4=null;
        EObject lv_expressionBit_38_0 = null;

        EObject lv_aux_39_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:6: ( ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:6: ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3660:7: ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3661:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3661:1: ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3662:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3662:1: (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT )
        int alt94=4;
        switch ( input.LA(1) ) {
        case RULE_R_SHIFT_EQUAL:
            {
            alt94=1;
            }
            break;
        case RULE_L_SHIFT:
            {
            alt94=2;
            }
            break;
        case RULE_R_SHIFT:
            {
            alt94=3;
            }
            break;
        case RULE_SUPER_SHIFT:
            {
            alt94=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3663:3: lv_bitSign_37_1= RULE_R_SHIFT_EQUAL
                {
                lv_bitSign_37_1=(Token)match(input,RULE_R_SHIFT_EQUAL,FOLLOW_RULE_R_SHIFT_EQUAL_in_synpred123_InternalMyDsl6448); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3678:8: lv_bitSign_37_2= RULE_L_SHIFT
                {
                lv_bitSign_37_2=(Token)match(input,RULE_L_SHIFT,FOLLOW_RULE_L_SHIFT_in_synpred123_InternalMyDsl6468); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3693:8: lv_bitSign_37_3= RULE_R_SHIFT
                {
                lv_bitSign_37_3=(Token)match(input,RULE_R_SHIFT,FOLLOW_RULE_R_SHIFT_in_synpred123_InternalMyDsl6488); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3708:8: lv_bitSign_37_4= RULE_SUPER_SHIFT
                {
                lv_bitSign_37_4=(Token)match(input,RULE_SUPER_SHIFT,FOLLOW_RULE_SUPER_SHIFT_in_synpred123_InternalMyDsl6508); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3726:2: ( (lv_expressionBit_38_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3727:1: (lv_expressionBit_38_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3727:1: (lv_expressionBit_38_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3728:3: lv_expressionBit_38_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getExpressionBitExpressionParserRuleCall_11_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred123_InternalMyDsl6537);
        lv_expressionBit_38_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3744:2: ( (lv_aux_39_0= ruleExpression_aux ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3745:1: (lv_aux_39_0= ruleExpression_aux )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3745:1: (lv_aux_39_0= ruleExpression_aux )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3746:3: lv_aux_39_0= ruleExpression_aux
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_auxAccess().getAuxExpression_auxParserRuleCall_11_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_aux_in_synpred123_InternalMyDsl6558);
        lv_aux_39_0=ruleExpression_aux();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred123_InternalMyDsl

    // $ANTLR start synpred132_InternalMyDsl
    public final void synpred132_InternalMyDsl_fragment() throws RecognitionException {   
        Token lv_exp_0_0=null;
        Token this_LONG_1=null;
        Token lv_exp1_2_0=null;
        Token this_LONG_3=null;

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:2: ( ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:2: ( ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? ) | ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? ) )
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_HEXA) ) {
            alt98=1;
        }
        else if ( (LA98_0==RULE_DECIMAL_DIGITS) ) {
            alt98=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 98, 0, input);

            throw nvae;
        }
        switch (alt98) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:3: ( ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )? )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:4: ( (lv_exp_0_0= RULE_HEXA ) ) (this_LONG_1= RULE_LONG )?
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3952:4: ( (lv_exp_0_0= RULE_HEXA ) )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3953:1: (lv_exp_0_0= RULE_HEXA )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3953:1: (lv_exp_0_0= RULE_HEXA )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3954:3: lv_exp_0_0= RULE_HEXA
                {
                lv_exp_0_0=(Token)match(input,RULE_HEXA,FOLLOW_RULE_HEXA_in_synpred132_InternalMyDsl6976); if (state.failed) return ;

                }


                }

                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3970:2: (this_LONG_1= RULE_LONG )?
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_LONG) ) {
                    alt96=1;
                }
                switch (alt96) {
                    case 1 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3970:3: this_LONG_1= RULE_LONG
                        {
                        this_LONG_1=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_synpred132_InternalMyDsl6993); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:6: ( ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )? )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) ) (this_LONG_3= RULE_LONG )?
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3975:7: ( (lv_exp1_2_0= RULE_DECIMAL_DIGITS ) )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3976:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3976:1: (lv_exp1_2_0= RULE_DECIMAL_DIGITS )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3977:3: lv_exp1_2_0= RULE_DECIMAL_DIGITS
                {
                lv_exp1_2_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_RULE_DECIMAL_DIGITS_in_synpred132_InternalMyDsl7019); if (state.failed) return ;

                }


                }

                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3993:2: (this_LONG_3= RULE_LONG )?
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==RULE_LONG) ) {
                    alt97=1;
                }
                switch (alt97) {
                    case 1 :
                        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3993:3: this_LONG_3= RULE_LONG
                        {
                        this_LONG_3=(Token)match(input,RULE_LONG,FOLLOW_RULE_LONG_in_synpred132_InternalMyDsl7036); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred132_InternalMyDsl

    // $ANTLR start synpred133_InternalMyDsl
    public final void synpred133_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_exp2_4_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3998:6: ( ( (lv_exp2_4_0= ruleFloat_Literal ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3998:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3998:6: ( (lv_exp2_4_0= ruleFloat_Literal ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3999:1: (lv_exp2_4_0= ruleFloat_Literal )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:3999:1: (lv_exp2_4_0= ruleFloat_Literal )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4000:3: lv_exp2_4_0= ruleFloat_Literal
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteral_ExpressionAccess().getExp2Float_LiteralParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleFloat_Literal_in_synpred133_InternalMyDsl7066);
        lv_exp2_4_0=ruleFloat_Literal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred133_InternalMyDsl

    // $ANTLR start synpred135_InternalMyDsl
    public final void synpred135_InternalMyDsl_fragment() throws RecognitionException {   
        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_argList_3_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:2: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:2: ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:3: ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4079:3: ( (lv_className_1_0= ruleClass_name ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4080:1: (lv_className_1_0= ruleClass_name )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4080:1: (lv_className_1_0= ruleClass_name )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4081:3: lv_className_1_0= ruleClass_name
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleClass_name_in_synpred135_InternalMyDsl7226);
        lv_className_1_0=ruleClass_name();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred135_InternalMyDsl7237); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4101:1: ( (lv_argList_3_0= ruleArg_List ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4102:1: (lv_argList_3_0= ruleArg_List )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4102:1: (lv_argList_3_0= ruleArg_List )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4103:3: lv_argList_3_0= ruleArg_List
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getArgListArg_ListParserRuleCall_1_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArg_List_in_synpred135_InternalMyDsl7257);
        lv_argList_3_0=ruleArg_List();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_synpred135_InternalMyDsl7268); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred135_InternalMyDsl

    // $ANTLR start synpred136_InternalMyDsl
    public final void synpred136_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expression_7_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:3: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:5: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
        {
        otherlv_6=(Token)match(input,73,FOLLOW_73_in_synpred136_InternalMyDsl7310); if (state.failed) return ;
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4146:1: ( (lv_expression_7_0= ruleExpression ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:1: (lv_expression_7_0= ruleExpression )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:1: (lv_expression_7_0= ruleExpression )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4148:3: lv_expression_7_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred136_InternalMyDsl7331);
        lv_expression_7_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,74,FOLLOW_74_in_synpred136_InternalMyDsl7343); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred136_InternalMyDsl

    // $ANTLR start synpred137_InternalMyDsl
    public final void synpred137_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_9=null;

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4169:7: (otherlv_9= '[]' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4169:7: otherlv_9= '[]'
        {
        otherlv_9=(Token)match(input,75,FOLLOW_75_in_synpred137_InternalMyDsl7362); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_InternalMyDsl

    // $ANTLR start synpred140_InternalMyDsl
    public final void synpred140_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_typeSpecifier_5_0 = null;

        EObject lv_expression_7_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:6: ( ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:6: ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4124:7: ( (lv_typeSpecifier_5_0= ruleType_specifier ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4125:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4125:1: (lv_typeSpecifier_5_0= ruleType_specifier )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4126:3: lv_typeSpecifier_5_0= ruleType_specifier
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getTypeSpecifierType_specifierParserRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleType_specifier_in_synpred140_InternalMyDsl7296);
        lv_typeSpecifier_5_0=ruleType_specifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:2: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )?
        int alt99=3;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==73) ) {
            int LA99_1 = input.LA(2);

            if ( (LA99_1==RULE_ID||LA99_1==RULE_LPAREN||(LA99_1>=RULE_NULL && LA99_1<=RULE_THIS)||(LA99_1>=RULE_INCREMENT && LA99_1<=RULE_DECREMENT)||LA99_1==RULE_DECIMAL_DIGITS||LA99_1==RULE_HEXA||(LA99_1>=RULE_STRING && LA99_1<=RULE_FALSE)||LA99_1==94) ) {
                alt99=1;
            }
        }
        else if ( (LA99_0==75) ) {
            int LA99_2 = input.LA(2);

            if ( (synpred137_InternalMyDsl()) ) {
                alt99=2;
            }
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:3: (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4142:5: otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']'
                {
                otherlv_6=(Token)match(input,73,FOLLOW_73_in_synpred140_InternalMyDsl7310); if (state.failed) return ;
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4146:1: ( (lv_expression_7_0= ruleExpression ) )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:1: (lv_expression_7_0= ruleExpression )
                {
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4147:1: (lv_expression_7_0= ruleExpression )
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4148:3: lv_expression_7_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCreating_ExpressionAccess().getExpressionExpressionParserRuleCall_1_1_1_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred140_InternalMyDsl7331);
                lv_expression_7_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                otherlv_8=(Token)match(input,74,FOLLOW_74_in_synpred140_InternalMyDsl7343); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4169:7: otherlv_9= '[]'
                {
                otherlv_9=(Token)match(input,75,FOLLOW_75_in_synpred140_InternalMyDsl7362); if (state.failed) return ;

                }
                break;

        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:3: ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )*
        loop100:
        do {
            int alt100=3;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==73) ) {
                alt100=1;
            }
            else if ( (LA100_0==75) ) {
                alt100=2;
            }


            switch (alt100) {
        	case 1 :
        	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:4: (otherlv_10= '[' otherlv_11= ']' )
        	    {
        	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:4: (otherlv_10= '[' otherlv_11= ']' )
        	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4173:6: otherlv_10= '[' otherlv_11= ']'
        	    {
        	    otherlv_10=(Token)match(input,73,FOLLOW_73_in_synpred140_InternalMyDsl7378); if (state.failed) return ;
        	    otherlv_11=(Token)match(input,74,FOLLOW_74_in_synpred140_InternalMyDsl7390); if (state.failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4182:7: otherlv_12= '[]'
        	    {
        	    otherlv_12=(Token)match(input,75,FOLLOW_75_in_synpred140_InternalMyDsl7409); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop100;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred140_InternalMyDsl

    // $ANTLR start synpred150_InternalMyDsl
    public final void synpred150_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_elseStatement_6_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:3: ( ( 'else' )=>otherlv_5= 'else' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4963:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,102,FOLLOW_102_in_synpred150_InternalMyDsl8947); if (state.failed) return ;

        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4968:2: ( (lv_elseStatement_6_0= ruleStatement ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4969:1: (lv_elseStatement_6_0= ruleStatement )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4969:1: (lv_elseStatement_6_0= ruleStatement )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:4970:3: lv_elseStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred150_InternalMyDsl8969);
        lv_elseStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred150_InternalMyDsl

    // $ANTLR start synpred152_InternalMyDsl
    public final void synpred152_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token lv_lParen_3_0=null;
        Token lv_rparent_5_0=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_catchStatement_6_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:3: ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:3: ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:3: ( ( 'catch' )=>otherlv_2= 'catch' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5029:4: ( 'catch' )=>otherlv_2= 'catch'
        {
        otherlv_2=(Token)match(input,104,FOLLOW_104_in_synpred152_InternalMyDsl9096); if (state.failed) return ;

        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5034:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5035:1: (lv_lParen_3_0= RULE_LPAREN )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5035:1: (lv_lParen_3_0= RULE_LPAREN )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5036:3: lv_lParen_3_0= RULE_LPAREN
        {
        lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred152_InternalMyDsl9114); if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5052:2: ( (lv_parameters_4_0= ruleParameter ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5053:1: (lv_parameters_4_0= ruleParameter )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5053:1: (lv_parameters_4_0= ruleParameter )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5054:3: lv_parameters_4_0= ruleParameter
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameter_in_synpred152_InternalMyDsl9140);
        lv_parameters_4_0=ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5070:2: ( (lv_rparent_5_0= RULE_RPAREN ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5071:1: (lv_rparent_5_0= RULE_RPAREN )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5071:1: (lv_rparent_5_0= RULE_RPAREN )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5072:3: lv_rparent_5_0= RULE_RPAREN
        {
        lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_synpred152_InternalMyDsl9157); if (state.failed) return ;

        }


        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5088:2: ( (lv_catchStatement_6_0= ruleStatement ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5089:1: (lv_catchStatement_6_0= ruleStatement )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5089:1: (lv_catchStatement_6_0= ruleStatement )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5090:3: lv_catchStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementStatementParserRuleCall_2_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred152_InternalMyDsl9183);
        lv_catchStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred152_InternalMyDsl

    // $ANTLR start synpred154_InternalMyDsl
    public final void synpred154_InternalMyDsl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        EObject lv_finallyStatement_8_0 = null;


        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:5: ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:5: ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:5: ( ( 'finally' )=>otherlv_7= 'finally' )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5106:6: ( 'finally' )=>otherlv_7= 'finally'
        {
        otherlv_7=(Token)match(input,105,FOLLOW_105_in_synpred154_InternalMyDsl9206); if (state.failed) return ;

        }

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5111:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5112:1: (lv_finallyStatement_8_0= ruleStatement )
        {
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5112:1: (lv_finallyStatement_8_0= ruleStatement )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5113:3: lv_finallyStatement_8_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred154_InternalMyDsl9228);
        lv_finallyStatement_8_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred154_InternalMyDsl

    // $ANTLR start synpred156_InternalMyDsl
    public final void synpred156_InternalMyDsl_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_ID_1=null;

        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5371:2: (kw= '.' this_ID_1= RULE_ID )
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:5371:2: kw= '.' this_ID_1= RULE_ID
        {
        kw=(Token)match(input,92,FOLLOW_92_in_synpred156_InternalMyDsl9921); if (state.failed) return ;
        this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred156_InternalMyDsl9936); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred156_InternalMyDsl

    // Delegated rules

    public final boolean synpred90_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred150_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred150_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\3\5\2\uffff";
    static final String DFA5_maxS =
        "\3\107\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\6\uffff\1\1\1\2\71\uffff\1\3",
            "\1\4\6\uffff\1\1\1\2\71\uffff\1\3",
            "\1\4\6\uffff\1\1\1\2\71\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "227:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )";
        }
    }
    static final String DFA16_eotS =
        "\24\uffff";
    static final String DFA16_eofS =
        "\24\uffff";
    static final String DFA16_minS =
        "\16\6\1\12\1\uffff\1\6\2\uffff\1\6";
    static final String DFA16_maxS =
        "\3\125\11\113\1\134\1\113\1\114\1\uffff\1\6\2\uffff\1\134";
    static final String DFA16_acceptS =
        "\17\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA16_specialS =
        "\24\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\14\5\uffff\1\1\1\2\77\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\14\5\uffff\1\1\1\2\77\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\14\5\uffff\1\1\1\2\77\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\104\uffff\1\15",
            "\1\16\3\uffff\1\17\100\uffff\1\15\20\uffff\1\20",
            "\1\16\104\uffff\1\15",
            "\1\21\72\uffff\2\22\2\uffff\1\22\1\uffff\2\22",
            "",
            "\1\23",
            "",
            "",
            "\1\16\104\uffff\1\15\20\uffff\1\20"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "591:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String DFA42_eotS =
        "\32\uffff";
    static final String DFA42_eofS =
        "\32\uffff";
    static final String DFA42_minS =
        "\1\6\1\uffff\1\6\17\uffff\7\6\1\0";
    static final String DFA42_maxS =
        "\1\147\1\uffff\1\136\17\uffff\7\136\1\0";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\15\10\uffff";
    static final String DFA42_specialS =
        "\31\uffff\1\0}>";
    static final String[] DFA42_transitionS = {
            "\1\2\1\uffff\1\14\1\uffff\1\3\1\uffff\2\1\1\uffff\3\3\1\uffff\2\3\31\uffff\1\3\1\uffff\1\3\1\uffff\7\3\14\uffff\1\20\7\uffff\11\1\1\11\1\12\1\13\1\16\1\17\1\7\2\uffff\1\3\1\10\2\uffff\1\6\1\5\1\uffff\1\4\1\uffff\1\15",
            "",
            "\1\1\3\uffff\1\3\3\uffff\1\21\3\uffff\34\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\22\2\3",
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
            "\1\23\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\31\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "\1\1\3\uffff\1\3\7\uffff\34\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\24\2\3",
            "\1\25\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\31\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "\1\1\3\uffff\1\3\7\uffff\34\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\26\2\3",
            "\1\27\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\31\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "\1\1\3\uffff\1\3\7\uffff\34\3\27\uffff\2\3\2\uffff\1\3\1\uffff\1\1\20\uffff\1\30\2\3",
            "\1\31\3\uffff\1\3\4\uffff\3\3\1\uffff\2\3\31\uffff\1\3\1\uffff\1\3\1\uffff\7\3\45\uffff\1\3",
            "\1\uffff"
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1773:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_rparent_10_0= RULE_RPAREN ) ) ( (lv_syncStatement_11_0= ruleStatement ) ) ) | ( () otherlv_13= 'return' ( (lv_expression_14_0= ruleExpression ) )? otherlv_15= ';' ) | ( () otherlv_17= 'throw' ( (lv_expression_18_0= ruleExpression ) )? otherlv_19= ';' ) | this_Statement_block_20= ruleStatement_block | ( (lv_tryStatement_21_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_22_0= RULE_ID ) ) this_COLON_23= RULE_COLON ( (lv_statement_24_0= ruleStatement ) ) ) | ( () otherlv_26= 'break' ( (lv_name_27_0= RULE_ID ) )? otherlv_28= ';' ) | ( () otherlv_30= 'continue' ( (lv_name_31_0= RULE_ID ) )? otherlv_32= ';' ) | ( () otherlv_34= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_25 = input.LA(1);

                         
                        int index42_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred50_InternalMyDsl()) ) {s = 1;}

                        else if ( (synpred51_InternalMyDsl()) ) {s = 3;}

                         
                        input.seek(index42_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\15\uffff";
    static final String DFA43_eofS =
        "\15\uffff";
    static final String DFA43_minS =
        "\1\6\1\uffff\1\6\2\uffff\7\6\1\0";
    static final String DFA43_maxS =
        "\1\136\1\uffff\1\136\2\uffff\7\136\1\0";
    static final String DFA43_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\10\uffff";
    static final String DFA43_specialS =
        "\14\uffff\1\0}>";
    static final String[] DFA43_transitionS = {
            "\1\2\3\uffff\1\4\1\uffff\2\1\1\uffff\3\4\1\uffff\2\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4\14\uffff\1\3\7\uffff\11\1\10\uffff\1\4",
            "",
            "\1\1\3\uffff\1\4\7\uffff\34\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\5\2\4",
            "",
            "",
            "\1\6\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\1\3\uffff\1\4\7\uffff\34\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\7\2\4",
            "\1\10\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\1\3\uffff\1\4\7\uffff\34\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\11\2\4",
            "\1\12\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\1\3\uffff\1\4\7\uffff\34\4\27\uffff\2\4\2\uffff\1\4\1\uffff\1\1\20\uffff\1\13\2\4",
            "\1\14\3\uffff\1\4\4\uffff\3\4\1\uffff\2\4\31\uffff\1\4\1\uffff\1\4\1\uffff\7\4\45\uffff\1\4",
            "\1\uffff"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2239:1: ( ( (lv_variable_2_0= ruleVariable_declaration ) ) | otherlv_3= ';' | ( ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_12 = input.LA(1);

                         
                        int index43_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index43_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\13\uffff";
    static final String DFA46_eofS =
        "\13\uffff";
    static final String DFA46_minS =
        "\1\6\12\uffff";
    static final String DFA46_maxS =
        "\1\136\12\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA46_specialS =
        "\13\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\12\3\uffff\1\4\4\uffff\1\7\1\10\1\11\1\uffff\2\1\31\uffff\1\6\1\uffff\1\6\1\uffff\2\6\1\5\1\3\3\2\45\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2370:1: ( ( ( ( ( ( ruleNumeric_Expression_NR ) ) )=> ( (lv_numericExpression3_0_0= ruleNumeric_Expression_NR ) ) ) ( (lv_aux_1_0= ruleExpression_aux ) ) ) | ( ( (lv_logicalExpression_2_0= ruleLogical_Expression_NR ) ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( ( (lv_bitExpression_4_0= ruleBit_Expression_NR ) ) ( (lv_aux_5_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCast_Expression ) ) )=> ( (lv_castExpression_6_0= ruleCast_Expression ) ) ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( ( ( ( ( ruleCreating_Expression ) ) )=> ( (lv_creatingExpression_8_0= ruleCreating_Expression ) ) ) ( (lv_aux_9_0= ruleExpression_aux ) ) ) | ( ( (lv_literalExpression_10_0= ruleLiteral_Expression ) ) ( (lv_aux_11_0= ruleExpression_aux ) ) ) | ( ( (lv_null_12_0= RULE_NULL ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( ( (lv_super_14_0= RULE_SUPER ) ) ( (lv_aux_15_0= ruleExpression_aux ) ) ) | ( ( (lv_this_16_0= RULE_THIS ) ) ( (lv_aux_17_0= ruleExpression_aux ) ) ) | ( ( (lv_name_18_0= RULE_ID ) ) ( (lv_aux_19_0= ruleExpression_aux ) ) ) )";
        }
    }
    static final String DFA55_eotS =
        "\60\uffff";
    static final String DFA55_eofS =
        "\1\43\57\uffff";
    static final String DFA55_minS =
        "\1\11\42\0\15\uffff";
    static final String DFA55_maxS =
        "\1\136\42\0\15\uffff";
    static final String DFA55_acceptS =
        "\43\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\13\1\11\1\10\1\12\1\14";
    static final String DFA55_specialS =
        "\1\uffff\1\32\1\17\1\37\1\41\1\40\1\30\1\12\1\22\1\13\1\34\1\33\1\6\1\5\1\14\1\7\1\25\1\20\1\23\1\2\1\27\1\26\1\31\1\3\1\21\1\16\1\4\1\10\1\35\1\1\1\11\1\0\1\15\1\24\1\36\15\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\43\1\1\1\43\2\uffff\1\43\3\uffff\1\5\1\6\1\7\1\11\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\36\1\37\1\40\1\41\1\42\1\35\27\uffff\1\43\1\4\2\uffff\1\2\1\43\21\uffff\1\3\1\10\1\12",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "2772:1: ( ( (this_LPAREN_0= RULE_LPAREN ( (lv_argList_1_0= ruleArg_List ) )? this_RPAREN_2= RULE_RPAREN ) ( (lv_aux_3_0= ruleExpression_aux ) ) ) | ( (otherlv_4= '[' ( (lv_expression2_5_0= ruleExpression ) ) otherlv_6= ']' ) ( (lv_aux_7_0= ruleExpression_aux ) ) ) | ( (otherlv_8= '.' ( (lv_expression2_9_0= ruleExpression ) ) ) ( (lv_aux_10_0= ruleExpression_aux ) ) ) | ( (otherlv_11= ',' ( (lv_expressionComma_12_0= ruleExpression ) ) ) ( (lv_aux_13_0= ruleExpression_aux ) ) ) | ( (this_INSTANCEOF_14= RULE_INSTANCEOF ( (lv_name_15_0= ruleClass_name ) ) ) ( (lv_aux_16_0= ruleExpression_aux ) ) ) | ( ( ( (lv_sgin_17_1= RULE_INCREMENT | lv_sgin_17_2= RULE_DECREMENT ) ) ) ( (lv_aux_18_0= ruleExpression_aux ) ) ) | ( ( ( (lv_numericSign_19_1= '+' | lv_numericSign_19_2= RULE_PLUS_EQUAL | lv_numericSign_19_3= '-' | lv_numericSign_19_4= RULE_MINUS_EQUAL | lv_numericSign_19_5= RULE_MULTIPLY | lv_numericSign_19_6= RULE_MULTIPLY_EQUAL | lv_numericSign_19_7= RULE_DIVIDE | lv_numericSign_19_8= RULE_DIVIDE_EQUAL | lv_numericSign_19_9= RULE_MODULE | lv_numericSign_19_10= RULE_MODULE_EQUAL ) ) ) ( (lv_exp2_20_0= ruleExpression ) ) ( (lv_aux_21_0= ruleExpression_aux ) ) ) | ( ( ( (lv_testingSign_22_1= RULE_BT | lv_testingSign_22_2= RULE_ST | lv_testingSign_22_3= RULE_BE | lv_testingSign_22_4= RULE_SE | lv_testingSign_22_5= RULE_DOUBLE_EQUAL | lv_testingSign_22_6= RULE_DIFFERENT ) ) ) ( (lv_exp1_23_0= ruleExpression ) ) ( (lv_aux_24_0= ruleExpression_aux ) ) ) | ( ( ( ( (lv_logicalSign_25_1= RULE_OR | lv_logicalSign_25_2= RULE_OR_EQUAL | lv_logicalSign_25_3= RULE_EXP | lv_logicalSign_25_4= RULE_EXP_EQUAL | lv_logicalSign_25_5= RULE_DOUBLE_OR_EQUAL | lv_logicalSign_25_6= RULE_MODULE | lv_logicalSign_25_7= RULE_MODULE_EQUAL ) ) ) | ( (lv_ampersand_26_0= ruleAmpersand_Rule ) ) ) ( (lv_exp1_27_0= ruleExpression ) ) ( (lv_aux_28_0= ruleExpression_aux ) ) ) | (this_WAT_29= RULE_WAT ( (lv_exp1_30_0= ruleExpression ) ) this_COLON_31= RULE_COLON ( (lv_exp2_32_0= ruleExpression ) ) ( (lv_aux_33_0= ruleExpression_aux ) ) ) | ( ( ( (lv_stringSign_34_1= '+' | lv_stringSign_34_2= RULE_PLUS_EQUAL ) ) ) ( (lv_exp1_35_0= ruleExpression ) ) ( (lv_aux_36_0= ruleExpression_aux ) ) ) | ( ( ( (lv_bitSign_37_1= RULE_R_SHIFT_EQUAL | lv_bitSign_37_2= RULE_L_SHIFT | lv_bitSign_37_3= RULE_R_SHIFT | lv_bitSign_37_4= RULE_SUPER_SHIFT ) ) ) ( (lv_expressionBit_38_0= ruleExpression ) ) ( (lv_aux_39_0= ruleExpression_aux ) ) ) | () )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_31 = input.LA(1);

                         
                        int index55_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_31);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_29 = input.LA(1);

                         
                        int index55_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_29);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_19 = input.LA(1);

                         
                        int index55_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_23 = input.LA(1);

                         
                        int index55_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_26 = input.LA(1);

                         
                        int index55_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_26);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_13 = input.LA(1);

                         
                        int index55_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_15 = input.LA(1);

                         
                        int index55_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_27 = input.LA(1);

                         
                        int index55_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_30 = input.LA(1);

                         
                        int index55_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred117_InternalMyDsl()) ) {s = 46;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_30);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalMyDsl()) ) {s = 41;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (synpred119_InternalMyDsl()) ) {s = 43;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_14 = input.LA(1);

                         
                        int index55_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_32 = input.LA(1);

                         
                        int index55_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA55_25 = input.LA(1);

                         
                        int index55_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_25);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalMyDsl()) ) {s = 37;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA55_17 = input.LA(1);

                         
                        int index55_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA55_24 = input.LA(1);

                         
                        int index55_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_24);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (synpred119_InternalMyDsl()) ) {s = 43;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA55_18 = input.LA(1);

                         
                        int index55_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_18);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA55_33 = input.LA(1);

                         
                        int index55_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_33);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA55_16 = input.LA(1);

                         
                        int index55_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_16);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA55_21 = input.LA(1);

                         
                        int index55_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_21);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA55_20 = input.LA(1);

                         
                        int index55_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_20);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalMyDsl()) ) {s = 41;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA55_22 = input.LA(1);

                         
                        int index55_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalMyDsl()) ) {s = 45;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_22);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalMyDsl()) ) {s = 36;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA55_11 = input.LA(1);

                         
                        int index55_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_11);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA55_28 = input.LA(1);

                         
                        int index55_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_InternalMyDsl()) ) {s = 44;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_28);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA55_34 = input.LA(1);

                         
                        int index55_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred123_InternalMyDsl()) ) {s = 47;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_34);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalMyDsl()) ) {s = 38;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalMyDsl()) ) {s = 40;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalMyDsl()) ) {s = 39;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\15\uffff";
    static final String DFA66_eofS =
        "\15\uffff";
    static final String DFA66_minS =
        "\1\6\1\0\13\uffff";
    static final String DFA66_maxS =
        "\1\125\1\0\13\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\10\uffff\1\3\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\13\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\3\uffff\1\13\102\uffff\11\2",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "4079:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) this_LPAREN_2= RULE_LPAREN ( (lv_argList_3_0= ruleArg_List ) ) this_RPAREN_4= RULE_RPAREN ) | ( ( (lv_typeSpecifier_5_0= ruleType_specifier ) ) ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )? ( (otherlv_10= '[' otherlv_11= ']' ) | otherlv_12= '[]' )* ) | (this_LPAREN_13= RULE_LPAREN ( (lv_expression_14_0= ruleExpression ) ) this_RPAREN_15= RULE_RPAREN ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalMyDsl()) ) {s = 12;}

                        else if ( (synpred140_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\54\uffff";
    static final String DFA64_eofS =
        "\1\3\53\uffff";
    static final String DFA64_minS =
        "\1\11\2\0\51\uffff";
    static final String DFA64_maxS =
        "\1\136\2\0\51\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\1\3\46\uffff\1\1\1\2";
    static final String DFA64_specialS =
        "\1\uffff\1\0\1\1\51\uffff}>";
    static final String[] DFA64_transitionS = {
            "\3\3\2\uffff\1\3\3\uffff\34\3\27\uffff\2\3\2\uffff\1\1\1\3\1\2\20\uffff\3\3",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "4142:2: ( (otherlv_6= '[' ( (lv_expression_7_0= ruleExpression ) ) otherlv_8= ']' ) | otherlv_9= '[]' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_InternalMyDsl()) ) {s = 42;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalMyDsl()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\6\uffff";
    static final String DFA74_eofS =
        "\6\uffff";
    static final String DFA74_minS =
        "\1\6\1\105\1\6\2\uffff\1\105";
    static final String DFA74_maxS =
        "\1\6\1\153\1\6\2\uffff\1\153";
    static final String DFA74_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA74_specialS =
        "\6\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1",
            "\1\4\26\uffff\1\2\16\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\4\26\uffff\1\2\16\uffff\1\3"
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "5154:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit239 = new BitSet(new long[]{0x0000000000003032L,0x0000040000000080L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit261 = new BitSet(new long[]{0x0000000000003032L,0x0000040000000080L});
    public static final BitSet FOLLOW_ruleType_declaration_in_ruleCompilation_unit283 = new BitSet(new long[]{0x0000000000003032L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration372 = new BitSet(new long[]{0x0000000000003030L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_ruleType_declaration400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_ruleType_declaration427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleType_declaration440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterface_declaration532 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_RULE_INTERFACE_in_ruleInterface_declaration544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface_declaration560 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleInterface_declaration577 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration597 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleInterface_declaration610 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration631 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleInterface_declaration646 = new BitSet(new long[]{0x0000000000003250L,0x00000000003FE020L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleInterface_declaration666 = new BitSet(new long[]{0x0000000000003250L,0x00000000003FE020L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleInterface_declaration678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClass_declaration769 = new BitSet(new long[]{0x0000000000003000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleClass_declaration782 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_declaration799 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleClass_declaration816 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleClass_declaration836 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleClass_declaration851 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration872 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleClass_declaration885 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration906 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleClass_declaration921 = new BitSet(new long[]{0x0000000000003250L,0x00000000003FE020L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleClass_declaration941 = new BitSet(new long[]{0x0000000000003250L,0x00000000003FE020L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleClass_declaration953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1041 = new BitSet(new long[]{0x0000000000003050L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleField_declaration1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_ruleField_declaration1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_ruleField_declaration1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleField_declaration1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethod_declaration1276 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod_declaration1298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_declaration1315 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMethod_declaration1337 = new BitSet(new long[]{0x0000000000003840L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleMethod_declaration1363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMethod_declaration1381 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000220L});
    public static final BitSet FOLLOW_73_in_ruleMethod_declaration1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleMethod_declaration1411 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000220L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleMethod_declaration1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleMethod_declaration1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConstructor_declaration1565 = new BitSet(new long[]{0x0000000000003040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor_declaration1583 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleConstructor_declaration1605 = new BitSet(new long[]{0x0000000000003840L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1631 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleConstructor_declaration1649 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list1711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1767 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleParameter_list1780 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1895 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1912 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_73_in_ruleParameter1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleParameter1943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_75_in_ruleParameter1962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleVariable_declaration2056 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable_declaration2078 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_ruleVariable_declaration2112 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleVariable_declaration2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable_declarator2235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001A00L});
    public static final BitSet FOLLOW_73_in_ruleVariable_declarator2254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleVariable_declarator2266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001A00L});
    public static final BitSet FOLLOW_75_in_ruleVariable_declarator2285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001A00L});
    public static final BitSet FOLLOW_76_in_ruleVariable_declarator2300 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_ruleVariable_declarator2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_entryRuleVariable_initializer2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_initializer2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_initializer_in_ruleVariable_initializer2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable_initializer2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_initializer_in_entryRuleArray_initializer2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray_initializer2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleArray_initializer2536 = new BitSet(new long[]{0x01FD4000001B8740L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_ruleArray_initializer2557 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleArray_initializer2570 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleVariable_initializer_in_ruleArray_initializer2591 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleArray_initializer2606 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleArray_initializer2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleType2712 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleType2730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier2781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleType_specifier2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleType_specifier2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleType_specifier2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleType_specifier2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleType_specifier2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleType_specifier2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleType_specifier2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleType_specifier2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleType_specifier2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleType_specifier3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier3056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_ruleModifier3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleModifier3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleStatic_initializer3230 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatic_initializer3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block3292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleStatement_block3356 = new BitSet(new long[]{0x01FD4000001BB740L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement_block3382 = new BitSet(new long[]{0x01FD4000001BB740L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleStatement_block3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement3441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleStatement3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement3525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStatement3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_ruleStatement3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_ruleStatement3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_ruleStatement3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_ruleStatement3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_statement_in_ruleStatement3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleStatement3711 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement3732 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleStatement3749 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleStatement3807 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement3828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStatement3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleStatement3873 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement3894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStatement3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatement3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_ruleStatement3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3989 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleStatement4005 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleStatement4057 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement4074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStatement4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleStatement4124 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement4141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStatement4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleStatement4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement4228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor_Statement4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleFor_Statement4275 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFor_Statement4286 = new BitSet(new long[]{0x01FD4000001BB540L,0x00000000403FE020L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleFor_Statement4307 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000020L});
    public static final BitSet FOLLOW_69_in_ruleFor_Statement4325 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFor_Statement4365 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement4388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFor_Statement4401 = new BitSet(new long[]{0x01FD4000001B8D40L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor_Statement4422 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFor_Statement4434 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor_Statement4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_NR_in_ruleExpression4562 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_Expression_NR_in_ruleExpression4613 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Expression_NR_in_ruleExpression4663 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_Expression_in_ruleExpression4726 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreating_Expression_in_ruleExpression4790 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_Expression_in_ruleExpression4841 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleExpression4887 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SUPER_in_ruleExpression4938 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THIS_in_ruleExpression4989 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression5040 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_entryRuleExpression_aux5103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_aux5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleExpression_aux5151 = new BitSet(new long[]{0x01FD4000001B8D40L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleArg_List_in_ruleExpression_aux5171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleExpression_aux5183 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleExpression_aux5225 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux5246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleExpression_aux5258 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleExpression_aux5301 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux5322 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleExpression_aux5365 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux5386 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_ruleExpression_aux5428 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleExpression_aux5448 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCREMENT_in_ruleExpression_aux5497 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleExpression_aux5517 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleExpression_aux5574 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux5602 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleExpression_aux5623 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MINUS_EQUAL_in_ruleExpression_aux5651 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_ruleExpression_aux5671 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_EQUAL_in_ruleExpression_aux5691 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_ruleExpression_aux5711 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DIVIDE_EQUAL_in_ruleExpression_aux5731 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_in_ruleExpression_aux5751 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux5771 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux5800 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BT_in_ruleExpression_aux5848 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_ST_in_ruleExpression_aux5868 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_BE_in_ruleExpression_aux5888 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_SE_in_ruleExpression_aux5908 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DOUBLE_EQUAL_in_ruleExpression_aux5928 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DIFFERENT_in_ruleExpression_aux5948 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux5977 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleExpression_aux6026 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_OR_EQUAL_in_ruleExpression_aux6046 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_EXP_in_ruleExpression_aux6066 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_EXP_EQUAL_in_ruleExpression_aux6086 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DOUBLE_OR_EQUAL_in_ruleExpression_aux6106 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_in_ruleExpression_aux6126 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_ruleExpression_aux6146 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleAmpersand_Rule_in_ruleExpression_aux6181 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux6203 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WAT_in_ruleExpression_aux6243 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux6263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleExpression_aux6274 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux6294 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleExpression_aux6343 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_ruleExpression_aux6371 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux6400 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_EQUAL_in_ruleExpression_aux6448 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_L_SHIFT_in_ruleExpression_aux6468 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_in_ruleExpression_aux6488 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_SUPER_SHIFT_in_ruleExpression_aux6508 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_aux6537 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_ruleExpression_aux6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmpersand_Rule_in_entryRuleAmpersand_Rule6613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAmpersand_Rule6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule6665 = new BitSet(new long[]{0x0000200000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_AMPERSAND_in_ruleAmpersand_Rule6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAmpersand_Rule6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_entryRuleFloat_Literal6749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat_Literal6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal6801 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleFloat_Literal6818 = new BitSet(new long[]{0x0200C00000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleFloat_Literal6835 = new BitSet(new long[]{0x0200800000000002L});
    public static final BitSet FOLLOW_ruleEXPOENT_PART_in_ruleFloat_Literal6862 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_TYPE_SUFIX_in_ruleFloat_Literal6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_Expression_in_entryRuleLiteral_Expression6922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral_Expression6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXA_in_ruleLiteral_Expression6976 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_ruleLiteral_Expression6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleLiteral_Expression7019 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_ruleLiteral_Expression7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_ruleLiteral_Expression7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral_Expression7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleLiteral_Expression7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreating_Expression_in_entryRuleCreating_Expression7158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreating_Expression7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_ruleCreating_Expression7204 = new BitSet(new long[]{0x0000000000003440L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleCreating_Expression7226 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCreating_Expression7237 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleArg_List_in_ruleCreating_Expression7257 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCreating_Expression7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleCreating_Expression7296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_73_in_ruleCreating_Expression7310 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreating_Expression7331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleCreating_Expression7343 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_75_in_ruleCreating_Expression7362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_73_in_ruleCreating_Expression7378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleCreating_Expression7390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_75_in_ruleCreating_Expression7409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCreating_Expression7430 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCreating_Expression7450 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCreating_Expression7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_Expression_in_entryRuleCast_Expression7498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast_Expression7508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCast_Expression7544 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast_Expression7564 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCast_Expression7575 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCast_Expression7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBit_Expression_NR_in_entryRuleBit_Expression_NR7631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBit_Expression_NR7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleBit_Expression_NR7677 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBit_Expression_NR7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_Expression_NR_in_entryRuleLogical_Expression_NR7733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical_Expression_NR7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXCLAMATION_in_ruleLogical_Expression_NR7780 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogical_Expression_NR7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_ruleLogical_Expression_NR7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_ruleLogical_Expression_NR7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_List_in_entryRuleArg_List7893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg_List7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg_List7949 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleArg_List7962 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg_List7983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_NR_in_entryRuleNumeric_Expression_NR8021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeric_Expression_NR8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleNumeric_Expression_NR8076 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_INCREMENT_in_ruleNumeric_Expression_NR8104 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_ruleNumeric_Expression_NR8124 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNumeric_Expression_NR8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement8189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch_statement8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleSwitch_statement8248 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSwitch_statement8265 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch_statement8291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSwitch_statement8308 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_R_CURLY_BRACE_in_ruleSwitch_statement8324 = new BitSet(new long[]{0x01FD4000001BB740L,0x000000AFCFFFE020L});
    public static final BitSet FOLLOW_96_in_ruleSwitch_statement8337 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch_statement8358 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSwitch_statement8369 = new BitSet(new long[]{0x01FD4000001BB740L,0x000000AFCFFFE020L});
    public static final BitSet FOLLOW_97_in_ruleSwitch_statement8388 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSwitch_statement8399 = new BitSet(new long[]{0x01FD4000001BB740L,0x000000AFCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitch_statement8426 = new BitSet(new long[]{0x01FD4000001BB740L,0x000000AFCFFFE020L});
    public static final BitSet FOLLOW_RULE_L_CURLY_BRACE_in_ruleSwitch_statement8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement8474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleWhile_Statement8521 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile_Statement8542 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleWhile_Statement8559 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile_Statement8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement8621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleDo_Statement8668 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo_Statement8689 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleDo_Statement8701 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleDo_Statement8718 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleDo_Statement8740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleDo_Statement8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_entryRuleIf_statement8793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_statement8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleIf_statement8840 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIf_statement8857 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf_statement8883 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIf_statement8900 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_statement8926 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleIf_statement8947 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_statement8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement9007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement9017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleTry_statement9054 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement9075 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_104_in_ruleTry_statement9096 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleTry_statement9114 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTry_statement9140 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleTry_statement9157 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement9183 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_105_in_ruleTry_statement9206 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement9266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleImport_statement9313 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement9336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleImport_statement9348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement9377 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleImport_statement9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name9428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name9530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name9587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement9631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rulePackage_statement9678 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement9699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePackage_statement9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name9748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name9799 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rulePackage_name9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line9872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_line9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulePackage_name_line9921 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_line9936 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleEXPOENT_PART_in_entryRuleEXPOENT_PART9983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPOENT_PART9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXPONENTIAL_in_ruleEXPOENT_PART10034 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_ruleEXPOENT_PART10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_synpred50_InternalMyDsl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred51_InternalMyDsl3525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_synpred51_InternalMyDsl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_synpred69_InternalMyDsl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred86_InternalMyDsl5151 = new BitSet(new long[]{0x01FD4000001B8D40L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleArg_List_in_synpred86_InternalMyDsl5171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_synpred86_InternalMyDsl5183 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred86_InternalMyDsl5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred87_InternalMyDsl5225 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred87_InternalMyDsl5246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred87_InternalMyDsl5258 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred87_InternalMyDsl5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred88_InternalMyDsl5301 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred88_InternalMyDsl5322 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred88_InternalMyDsl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred89_InternalMyDsl5365 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred89_InternalMyDsl5386 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred89_InternalMyDsl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_synpred90_InternalMyDsl5428 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleClass_name_in_synpred90_InternalMyDsl5448 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred90_InternalMyDsl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCREMENT_in_synpred92_InternalMyDsl5497 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_RULE_DECREMENT_in_synpred92_InternalMyDsl5517 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred92_InternalMyDsl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_synpred102_InternalMyDsl5574 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_synpred102_InternalMyDsl5602 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_synpred102_InternalMyDsl5623 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MINUS_EQUAL_in_synpred102_InternalMyDsl5651 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_synpred102_InternalMyDsl5671 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_EQUAL_in_synpred102_InternalMyDsl5691 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_synpred102_InternalMyDsl5711 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DIVIDE_EQUAL_in_synpred102_InternalMyDsl5731 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_in_synpred102_InternalMyDsl5751 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_synpred102_InternalMyDsl5771 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred102_InternalMyDsl5800 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred102_InternalMyDsl5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BT_in_synpred108_InternalMyDsl5848 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_ST_in_synpred108_InternalMyDsl5868 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_BE_in_synpred108_InternalMyDsl5888 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_SE_in_synpred108_InternalMyDsl5908 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DOUBLE_EQUAL_in_synpred108_InternalMyDsl5928 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DIFFERENT_in_synpred108_InternalMyDsl5948 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred108_InternalMyDsl5977 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred108_InternalMyDsl5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_synpred116_InternalMyDsl6026 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_OR_EQUAL_in_synpred116_InternalMyDsl6046 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_EXP_in_synpred116_InternalMyDsl6066 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_EXP_EQUAL_in_synpred116_InternalMyDsl6086 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_DOUBLE_OR_EQUAL_in_synpred116_InternalMyDsl6106 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_in_synpred116_InternalMyDsl6126 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_MODULE_EQUAL_in_synpred116_InternalMyDsl6146 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleAmpersand_Rule_in_synpred116_InternalMyDsl6181 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred116_InternalMyDsl6203 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred116_InternalMyDsl6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WAT_in_synpred117_InternalMyDsl6243 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred117_InternalMyDsl6263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_COLON_in_synpred117_InternalMyDsl6274 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred117_InternalMyDsl6294 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred117_InternalMyDsl6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_synpred119_InternalMyDsl6343 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_PLUS_EQUAL_in_synpred119_InternalMyDsl6371 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred119_InternalMyDsl6400 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred119_InternalMyDsl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_EQUAL_in_synpred123_InternalMyDsl6448 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_L_SHIFT_in_synpred123_InternalMyDsl6468 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_R_SHIFT_in_synpred123_InternalMyDsl6488 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_SUPER_SHIFT_in_synpred123_InternalMyDsl6508 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred123_InternalMyDsl6537 = new BitSet(new long[]{0x00003FFFFFFC0400L,0x0000000070000240L});
    public static final BitSet FOLLOW_ruleExpression_aux_in_synpred123_InternalMyDsl6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXA_in_synpred132_InternalMyDsl6976 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_synpred132_InternalMyDsl6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_DIGITS_in_synpred132_InternalMyDsl7019 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_synpred132_InternalMyDsl7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_Literal_in_synpred133_InternalMyDsl7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_synpred135_InternalMyDsl7226 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred135_InternalMyDsl7237 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleArg_List_in_synpred135_InternalMyDsl7257 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_synpred135_InternalMyDsl7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred136_InternalMyDsl7310 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred136_InternalMyDsl7331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred136_InternalMyDsl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred137_InternalMyDsl7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_synpred140_InternalMyDsl7296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_73_in_synpred140_InternalMyDsl7310 = new BitSet(new long[]{0x01FD4000001B8540L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred140_InternalMyDsl7331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred140_InternalMyDsl7343 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_75_in_synpred140_InternalMyDsl7362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_73_in_synpred140_InternalMyDsl7378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred140_InternalMyDsl7390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_75_in_synpred140_InternalMyDsl7409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_102_in_synpred150_InternalMyDsl8947 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred150_InternalMyDsl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_synpred152_InternalMyDsl9096 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred152_InternalMyDsl9114 = new BitSet(new long[]{0x0000000000003040L,0x00000000003FE000L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred152_InternalMyDsl9140 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_synpred152_InternalMyDsl9157 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred152_InternalMyDsl9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_synpred154_InternalMyDsl9206 = new BitSet(new long[]{0x01FD4000001BB540L,0x000000ACCFFFE020L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred154_InternalMyDsl9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred156_InternalMyDsl9921 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred156_InternalMyDsl9936 = new BitSet(new long[]{0x0000000000000002L});

}