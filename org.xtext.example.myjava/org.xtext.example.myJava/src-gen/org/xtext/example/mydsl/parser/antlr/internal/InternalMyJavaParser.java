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
import org.xtext.example.mydsl.services.MyJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_ID", "RULE_LPAREN", "RULE_RPAREN", "RULE_MOD", "RULE_STATIC", "RULE_MINUS", "RULE_PLUS", "RULE_EQUAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'interface'", "'extends'", "','", "'{'", "'}'", "'class'", "'implements'", "'['", "']'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'synchronized('", "'return'", "'throw'", "':'", "'break'", "'continue'", "'.'", "'null'", "'super'", "'this'", "'--'", "'++'", "'+='", "'-='", "'*'", "'*='", "'/'", "'/='", "'%'", "'%='", "'switch'", "'case'", "'default:'", "'for('", "'while('", "'do'", "'if('", "'else'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'"
    };
    public static final int T__50=50;
    public static final int RULE_LPAREN=6;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_MOD=8;
    public static final int RULE_EQUAL=12;
    public static final int RULE_DOC_COMMENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=11;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_STATIC=9;
    public static final int RULE_MINUS=10;
    public static final int RULE_RPAREN=7;
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


        public InternalMyJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyJavaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MyJavaGrammarAccess grammarAccess;
     	
        public InternalMyJavaParser(TokenStream input, MyJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:74:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:75:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:82:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleCompilation_unit ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:85:28: ( ( (lv_greetings_0_0= ruleCompilation_unit ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:86:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:86:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:87:1: (lv_greetings_0_0= ruleCompilation_unit )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:87:1: (lv_greetings_0_0= ruleCompilation_unit )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:88:3: lv_greetings_0_0= ruleCompilation_unit
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:112:1: entryRuleCompilation_unit returns [EObject current=null] : iv_ruleCompilation_unit= ruleCompilation_unit EOF ;
    public final EObject entryRuleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilation_unit = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:113:2: (iv_ruleCompilation_unit= ruleCompilation_unit EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:114:2: iv_ruleCompilation_unit= ruleCompilation_unit EOF
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:121:1: ruleCompilation_unit returns [EObject current=null] : ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_typeDeclarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:124:28: ( ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:125:1: ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:125:1: ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:125:2: ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )*
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:125:2: ( (lv_name_0_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==67) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:126:1: (lv_name_0_0= rulePackage_statement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:126:1: (lv_name_0_0= rulePackage_statement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:127:3: lv_name_0_0= rulePackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_statement_in_ruleCompilation_unit227);
                    lv_name_0_0=rulePackage_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"Package_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:143:3: ( (lv_imports_1_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==65) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:144:1: (lv_imports_1_0= ruleImport_statement )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:144:1: (lv_imports_1_0= ruleImport_statement )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:145:3: lv_imports_1_0= ruleImport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_statement_in_ruleCompilation_unit249);
            	    lv_imports_1_0=ruleImport_statement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:161:3: ( (lv_typeDeclarations_2_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC_COMMENT||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==17||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:162:1: (lv_typeDeclarations_2_0= ruleType_declaration )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:162:1: (lv_typeDeclarations_2_0= ruleType_declaration )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:163:3: lv_typeDeclarations_2_0= ruleType_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_declaration_in_ruleCompilation_unit271);
            	    lv_typeDeclarations_2_0=ruleType_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDeclarations",
            	              		lv_typeDeclarations_2_0, 
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:187:1: entryRuleType_declaration returns [EObject current=null] : iv_ruleType_declaration= ruleType_declaration EOF ;
    public final EObject entryRuleType_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_declaration = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:188:2: (iv_ruleType_declaration= ruleType_declaration EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:189:2: iv_ruleType_declaration= ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration308);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration318); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:196:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_3=null;
        EObject lv_classDec_1_0 = null;

        EObject lv_interfaceDec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:199:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:200:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:200:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:200:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';'
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:200:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:201:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:201:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:202:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration360); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:218:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:218:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:218:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:219:1: (lv_classDec_1_0= ruleClass_declaration )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:219:1: (lv_classDec_1_0= ruleClass_declaration )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:220:3: lv_classDec_1_0= ruleClass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_declaration_in_ruleType_declaration388);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:237:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:237:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:238:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:238:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:239:3: lv_interfaceDec_2_0= ruleInterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_declaration_in_ruleType_declaration415);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleType_declaration428); if (state.failed) return current;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:267:1: entryRuleInterface_declaration returns [EObject current=null] : iv_ruleInterface_declaration= ruleInterface_declaration EOF ;
    public final EObject entryRuleInterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_declaration = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:268:2: (iv_ruleInterface_declaration= ruleInterface_declaration EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:269:2: iv_ruleInterface_declaration= ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration464);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration474); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:276:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) ;
    public final EObject ruleInterface_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_interfaceName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_interfaceHerdada_4_0 = null;

        AntlrDatatypeRuleToken lv_interfacesHerdadas_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:279:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:280:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:280:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:280:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}'
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:280:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_MOD && LA6_0<=RULE_STATIC)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:281:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:281:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:282:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterface_declaration520);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleInterface_declaration533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:302:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:303:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:303:1: (lv_interfaceName_2_0= RULE_ID )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:304:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration550); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:320:2: (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:320:4: otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleInterface_declaration568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:324:1: ( (lv_interfaceHerdada_4_0= ruleInterface_name ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:325:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:325:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:326:3: lv_interfaceHerdada_4_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration589);
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

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:342:2: (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:342:4: otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInterface_declaration602); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:346:1: ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:347:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:347:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:348:3: lv_interfacesHerdadas_6_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration623);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleInterface_declaration639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleInterface_declaration651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:380:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:381:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:382:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration687);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration697); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:389:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' ) ;
    public final EObject ruleClass_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_modifiers_0_0 = null;

        AntlrDatatypeRuleToken lv_classHerdada_4_0 = null;

        AntlrDatatypeRuleToken lv_interfaceImplementada_6_0 = null;

        AntlrDatatypeRuleToken lv_interfacesImplementadas_8_0 = null;

        EObject lv_fieldsDeclaration_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:392:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:393:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:393:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:393:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}'
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:393:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_MOD && LA9_0<=RULE_STATIC)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:394:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:394:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:395:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClass_declaration743);
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
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleClass_declaration756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:415:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:416:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:416:1: (lv_className_2_0= RULE_ID )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:417:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration773); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:433:2: (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:433:4: otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleClass_declaration791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:437:1: ( (lv_classHerdada_4_0= ruleClass_name ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:438:1: (lv_classHerdada_4_0= ruleClass_name )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:438:1: (lv_classHerdada_4_0= ruleClass_name )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:439:3: lv_classHerdada_4_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration812);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:455:4: (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:455:6: otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleClass_declaration827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:459:1: ( (lv_interfaceImplementada_6_0= ruleInterface_name ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:460:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:460:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:461:3: lv_interfaceImplementada_6_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration848);
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

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:477:2: (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:477:4: otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleClass_declaration861); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:481:1: ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:482:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:482:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:483:3: lv_interfacesImplementadas_8_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration882);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleClass_declaration898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:503:1: ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOC_COMMENT && LA13_0<=RULE_ID)||(LA13_0>=RULE_MOD && LA13_0<=RULE_STATIC)||LA13_0==16||(LA13_0>=26 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:504:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:504:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:505:3: lv_fieldsDeclaration_10_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration919);
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
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleClass_declaration932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:533:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:534:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:535:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration968);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration978); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:542:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | otherlv_5= ';' ) ;
    public final EObject ruleField_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_5=null;
        EObject lv_variableDeclaration_1_0 = null;

        EObject lv_contructorName_2_0 = null;

        EObject lv_methodName_3_0 = null;

        EObject lv_staticinitializer_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:545:28: ( ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | otherlv_5= ';' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:546:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | otherlv_5= ';' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:546:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | otherlv_5= ';' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_ID:
            case RULE_MOD:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt16=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_ID||(LA16_2>=RULE_MOD && LA16_2<=RULE_STATIC)||(LA16_2>=26 && LA16_2<=33)) ) {
                    alt16=1;
                }
                else if ( (LA16_2==20) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:546:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:546:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:546:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:546:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DOC_COMMENT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:547:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:547:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:548:3: lv_comment_0_0= RULE_DOC_COMMENT
                            {
                            lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1021); if (state.failed) return current;
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

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:564:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    int alt15=3;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:564:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:564:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:565:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:565:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:566:3: lv_variableDeclaration_1_0= ruleVariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1049);
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
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:583:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:583:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:584:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:584:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:585:3: lv_contructorName_2_0= ruleConstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1076);
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
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:602:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:602:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:603:1: (lv_methodName_3_0= ruleMethod_declaration )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:603:1: (lv_methodName_3_0= ruleMethod_declaration )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:604:3: lv_methodName_3_0= ruleMethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1103);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:621:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:621:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:622:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:622:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:623:3: lv_staticinitializer_4_0= ruleStatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1132);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:640:7: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleField_declaration1150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getField_declarationAccess().getSemicolonKeyword_2());
                          
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:652:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:653:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:654:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1186);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1196); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:661:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) ) ;
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
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:664:28: ( ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:665:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:665:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:665:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? ( (lv_rparent_5_0= RULE_RPAREN ) ) (otherlv_6= '[' otherlv_7= ']' )* ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:665:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:666:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:666:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:667:3: lv_modifiersMethod_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethod_declaration1242);
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
            	    break loop17;
                }
            } while (true);

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:683:3: ( (lv_typeMethod_1_0= ruleType ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:684:1: (lv_typeMethod_1_0= ruleType )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:684:1: (lv_typeMethod_1_0= ruleType )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:685:3: lv_typeMethod_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1264);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:701:2: ( (lv_nameMethod_2_0= RULE_ID ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:702:1: (lv_nameMethod_2_0= RULE_ID )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:702:1: (lv_nameMethod_2_0= RULE_ID )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:703:3: lv_nameMethod_2_0= RULE_ID
            {
            lv_nameMethod_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1281); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:719:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:720:1: (lv_lParen_3_0= RULE_LPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:720:1: (lv_lParen_3_0= RULE_LPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:721:3: lv_lParen_3_0= RULE_LPAREN
            {
            lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMethod_declaration1303); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:737:2: ( (lv_parameterListMethod_4_0= ruleParameter_list ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=26 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:738:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:738:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:739:3: lv_parameterListMethod_4_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleMethod_declaration1329);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:755:3: ( (lv_rparent_5_0= RULE_RPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:756:1: (lv_rparent_5_0= RULE_RPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:756:1: (lv_rparent_5_0= RULE_RPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:757:3: lv_rparent_5_0= RULE_RPAREN
            {
            lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMethod_declaration1347); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:773:2: (otherlv_6= '[' otherlv_7= ']' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:773:4: otherlv_6= '[' otherlv_7= ']'
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleMethod_declaration1365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketKeyword_6_0());
            	          
            	    }
            	    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleMethod_declaration1377); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMethod_declarationAccess().getRightSquareBracketKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:781:3: ( ( (lv_statementMethod_8_0= ruleStatement_block ) ) | ( (lv_debug_9_0= ';' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            else if ( (LA20_0==16) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:781:4: ( (lv_statementMethod_8_0= ruleStatement_block ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:781:4: ( (lv_statementMethod_8_0= ruleStatement_block ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:782:1: (lv_statementMethod_8_0= ruleStatement_block )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:782:1: (lv_statementMethod_8_0= ruleStatement_block )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:783:3: lv_statementMethod_8_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1401);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:800:6: ( (lv_debug_9_0= ';' ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:800:6: ( (lv_debug_9_0= ';' ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:801:1: (lv_debug_9_0= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:801:1: (lv_debug_9_0= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:802:3: lv_debug_9_0= ';'
                    {
                    lv_debug_9_0=(Token)match(input,16,FOLLOW_16_in_ruleMethod_declaration1425); if (state.failed) return current;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:823:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:824:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:825:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1475);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1485); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:832:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) ;
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
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:835:28: ( ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:836:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:836:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:836:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? ( (lv_rparent_4_0= RULE_RPAREN ) ) ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:836:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_MOD && LA21_0<=RULE_STATIC)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:837:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:837:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:838:3: lv_modifiersConstructor_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructor_declaration1531);
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
            	    break loop21;
                }
            } while (true);

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:854:3: ( (lv_nameConstructor_1_0= RULE_ID ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:855:1: (lv_nameConstructor_1_0= RULE_ID )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:855:1: (lv_nameConstructor_1_0= RULE_ID )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:856:3: lv_nameConstructor_1_0= RULE_ID
            {
            lv_nameConstructor_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1549); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:872:2: ( (lv_lParen_2_0= RULE_LPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:873:1: (lv_lParen_2_0= RULE_LPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:873:1: (lv_lParen_2_0= RULE_LPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:874:3: lv_lParen_2_0= RULE_LPAREN
            {
            lv_lParen_2_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleConstructor_declaration1571); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:890:2: ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=26 && LA22_0<=33)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:891:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:891:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:892:3: lv_parameterListConstructor_3_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1597);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:908:3: ( (lv_rparent_4_0= RULE_RPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:909:1: (lv_rparent_4_0= RULE_RPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:909:1: (lv_rparent_4_0= RULE_RPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:910:3: lv_rparent_4_0= RULE_RPAREN
            {
            lv_rparent_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleConstructor_declaration1615); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:926:2: ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:927:1: (lv_statementConstructor_5_0= ruleStatement_block )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:927:1: (lv_statementConstructor_5_0= ruleStatement_block )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:928:3: lv_statementConstructor_5_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1641);
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:952:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:953:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:954:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1677);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1687); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:961:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:964:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:965:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:965:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:965:2: ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:965:2: ( (lv_parameter_0_0= ruleParameter ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:966:1: (lv_parameter_0_0= ruleParameter )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:966:1: (lv_parameter_0_0= ruleParameter )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:967:3: lv_parameter_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1733);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:983:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:983:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleParameter_list1746); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:987:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:988:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:988:1: (lv_parameters_2_0= ruleParameter )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:989:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1767);
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
            	    break loop23;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1013:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1014:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1015:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1805);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1815); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1022:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= ']' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameterName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1025:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= ']' )* ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1026:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1026:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= ']' )* )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1026:2: ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= ']' )*
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1026:2: ( (lv_type_0_0= ruleType ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1027:1: (lv_type_0_0= ruleType )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1027:1: (lv_type_0_0= ruleType )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1028:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter1861);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1044:2: ( (lv_parameterName_1_0= RULE_ID ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1045:1: (lv_parameterName_1_0= RULE_ID )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1045:1: (lv_parameterName_1_0= RULE_ID )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1046:3: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1878); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1062:2: (otherlv_2= '[' otherlv_3= ']' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1062:4: otherlv_2= '[' otherlv_3= ']'
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleParameter1896); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleParameter1908); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1());
            	          
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1078:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1079:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1080:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1946);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration1956); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1087:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) ;
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
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1090:28: ( ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1091:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1091:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1091:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1091:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_MOD && LA25_0<=RULE_STATIC)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1092:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1092:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1093:3: lv_modifiersVariable_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariable_declaration2002);
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
            	    break loop25;
                }
            } while (true);

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1109:3: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1110:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1110:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1111:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration2024);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1127:2: ( (lv_nameVariable_2_0= ruleVariable_declarator ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1128:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1128:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1129:3: lv_nameVariable_2_0= ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2045);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1145:2: (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1145:4: otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleVariable_declaration2058); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1149:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1150:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1150:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1151:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2079);
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
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleVariable_declaration2093); if (state.failed) return current;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1179:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1180:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1181:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2129);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2139); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1188:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_nameVariable_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1191:28: ( ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1192:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1192:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )* )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1192:2: ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[' otherlv_2= ']' )*
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1192:2: ( (lv_nameVariable_0_0= RULE_ID ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1193:1: (lv_nameVariable_0_0= RULE_ID )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1193:1: (lv_nameVariable_0_0= RULE_ID )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1194:3: lv_nameVariable_0_0= RULE_ID
            {
            lv_nameVariable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2181); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1210:2: (otherlv_1= '[' otherlv_2= ']' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1210:4: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleVariable_declarator2199); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleVariable_declarator2211); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariable_declaratorAccess().getRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1226:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1227:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1228:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType2249);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2259); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1235:1: ruleType returns [EObject current=null] : ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[' otherlv_2= ']' )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_typeSpecifier_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1238:28: ( ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[' otherlv_2= ']' )* ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1239:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[' otherlv_2= ']' )* )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1239:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[' otherlv_2= ']' )* )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1239:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[' otherlv_2= ']' )*
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1239:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1240:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1240:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1241:3: lv_typeSpecifier_0_0= ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType2305);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1257:2: (otherlv_1= '[' otherlv_2= ']' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1257:4: otherlv_1= '[' otherlv_2= ']'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleType2318); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleType2330); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1273:1: entryRuleType_specifier returns [String current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final String entryRuleType_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_specifier = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1274:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1275:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier2369);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier2380); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1282:1: ruleType_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) ;
    public final AntlrDatatypeRuleToken ruleType_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Class_name_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1285:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1286:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1286:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt29=1;
                }
                break;
            case 27:
                {
                alt29=2;
                }
                break;
            case 28:
                {
                alt29=3;
                }
                break;
            case 29:
                {
                alt29=4;
                }
                break;
            case 30:
                {
                alt29=5;
                }
                break;
            case 31:
                {
                alt29=6;
                }
                break;
            case 32:
                {
                alt29=7;
                }
                break;
            case 33:
                {
                alt29=8;
                }
                break;
            case RULE_ID:
                {
                alt29=9;
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1287:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleType_specifier2418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1294:2: kw= 'byte'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleType_specifier2437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1301:2: kw= 'char'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleType_specifier2456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1308:2: kw= 'short'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleType_specifier2475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1315:2: kw= 'int'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleType_specifier2494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1322:2: kw= 'float'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleType_specifier2513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1329:2: kw= 'long'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleType_specifier2532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1336:2: kw= 'double'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleType_specifier2551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1343:5: this_Class_name_8= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier2579);
                    this_Class_name_8=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Class_name_8);
                          
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1361:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1362:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1363:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier2625);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier2636); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1370:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MOD_0=null;
        Token this_STATIC_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1373:28: ( (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1374:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1374:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_MOD) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STATIC) ) {
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1374:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_ruleModifier2676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MOD_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1382:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleModifier2702); if (state.failed) return current;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1397:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1398:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1399:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2747);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer2757); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1406:1: ruleStatic_initializer returns [EObject current=null] : ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1409:28: ( ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1410:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1410:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1410:2: ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1410:2: ( (lv_static_0_0= RULE_STATIC ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1411:1: (lv_static_0_0= RULE_STATIC )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1411:1: (lv_static_0_0= RULE_STATIC )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1412:3: lv_static_0_0= RULE_STATIC
            {
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleStatic_initializer2799); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1428:2: ( (lv_name_1_0= ruleStatement_block ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1429:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1429:1: (lv_name_1_0= ruleStatement_block )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1430:3: lv_name_1_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer2825);
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1454:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1455:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1456:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block2861);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block2871); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1463:1: ruleStatement_block returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statments_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1466:28: ( ( () otherlv_1= '{' ( (lv_statments_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1467:1: ( () otherlv_1= '{' ( (lv_statments_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1467:1: ( () otherlv_1= '{' ( (lv_statments_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1467:2: () otherlv_1= '{' ( (lv_statments_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1467:2: ()
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1468:2: 
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleStatement_block2920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1480:1: ( (lv_statments_2_0= ruleStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_LPAREN)||(LA31_0>=RULE_MOD && LA31_0<=RULE_MINUS)||LA31_0==16||(LA31_0>=19 && LA31_0<=20)||LA31_0==24||(LA31_0>=26 && LA31_0<=36)||(LA31_0>=38 && LA31_0<=45)||LA31_0==54||(LA31_0>=57 && LA31_0<=60)||LA31_0==62) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1481:1: (lv_statments_2_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1481:1: (lv_statments_2_0= ruleStatement )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1482:3: lv_statments_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement_block2941);
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
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleStatement_block2954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3());
                  
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1510:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1511:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1512:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2990);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3000); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1519:1: ruleStatement returns [EObject current=null] : ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'return' otherlv_13= ';' ) | ( () otherlv_15= 'throw' otherlv_16= ';' ) | this_Statement_block_17= ruleStatement_block | ( (lv_tryStatement_18_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) ) ) | ( () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';' ) | ( () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';' ) | ( () otherlv_31= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_g_2_0=null;
        Token otherlv_8=null;
        Token lv_rparent_9_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_nameStatement_19_0=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token lv_name_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token lv_name_28_0=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_variableDeclaration_0_0 = null;

        EObject lv_expressionStatement_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_doStatement_4_0 = null;

        EObject lv_whileStatement_5_0 = null;

        EObject lv_forStatement_6_0 = null;

        EObject lv_switchStatement_7_0 = null;

        EObject lv_syncStatement_10_0 = null;

        EObject this_Statement_block_17 = null;

        EObject lv_tryStatement_18_0 = null;

        EObject lv_statement_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1522:28: ( ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'return' otherlv_13= ';' ) | ( () otherlv_15= 'throw' otherlv_16= ';' ) | this_Statement_block_17= ruleStatement_block | ( (lv_tryStatement_18_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) ) ) | ( () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';' ) | ( () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';' ) | ( () otherlv_31= ';' ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1523:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'return' otherlv_13= ';' ) | ( () otherlv_15= 'throw' otherlv_16= ';' ) | this_Statement_block_17= ruleStatement_block | ( (lv_tryStatement_18_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) ) ) | ( () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';' ) | ( () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';' ) | ( () otherlv_31= ';' ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1523:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'return' otherlv_13= ';' ) | ( () otherlv_15= 'throw' otherlv_16= ';' ) | this_Statement_block_17= ruleStatement_block | ( (lv_tryStatement_18_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) ) ) | ( () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';' ) | ( () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';' ) | ( () otherlv_31= ';' ) )
            int alt34=16;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1523:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1523:2: ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1524:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1524:1: (lv_variableDeclaration_0_0= ruleVariable_declaration )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1525:3: lv_variableDeclaration_0_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleStatement3046);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1542:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1542:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1542:7: ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1542:7: ( (lv_expressionStatement_1_0= ruleExpression ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1543:1: (lv_expressionStatement_1_0= ruleExpression )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1543:1: (lv_expressionStatement_1_0= ruleExpression )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1544:3: lv_expressionStatement_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement3074);
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

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1560:2: ( (lv_g_2_0= ';' ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1561:1: (lv_g_2_0= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1561:1: (lv_g_2_0= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1562:3: lv_g_2_0= ';'
                    {
                    lv_g_2_0=(Token)match(input,16,FOLLOW_16_in_ruleStatement3092); if (state.failed) return current;
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1576:6: ( (lv_ifStatement_3_0= ruleIf_statement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1576:6: ( (lv_ifStatement_3_0= ruleIf_statement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1577:1: (lv_ifStatement_3_0= ruleIf_statement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1577:1: (lv_ifStatement_3_0= ruleIf_statement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1578:3: lv_ifStatement_3_0= ruleIf_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_statement_in_ruleStatement3133);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1595:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1595:6: ( (lv_doStatement_4_0= ruleDo_Statement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1596:1: (lv_doStatement_4_0= ruleDo_Statement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1596:1: (lv_doStatement_4_0= ruleDo_Statement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1597:3: lv_doStatement_4_0= ruleDo_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDo_Statement_in_ruleStatement3160);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1614:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1614:6: ( (lv_whileStatement_5_0= ruleWhile_Statement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1615:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1615:1: (lv_whileStatement_5_0= ruleWhile_Statement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1616:3: lv_whileStatement_5_0= ruleWhile_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_Statement_in_ruleStatement3187);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1633:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1633:6: ( (lv_forStatement_6_0= ruleFor_Statement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1634:1: (lv_forStatement_6_0= ruleFor_Statement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1634:1: (lv_forStatement_6_0= ruleFor_Statement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1635:3: lv_forStatement_6_0= ruleFor_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getForStatementFor_StatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_Statement_in_ruleStatement3214);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1652:6: ( (lv_switchStatement_7_0= ruleSwitch_statement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1652:6: ( (lv_switchStatement_7_0= ruleSwitch_statement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1653:1: (lv_switchStatement_7_0= ruleSwitch_statement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1653:1: (lv_switchStatement_7_0= ruleSwitch_statement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1654:3: lv_switchStatement_7_0= ruleSwitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementSwitch_statementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitch_statement_in_ruleStatement3241);
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1671:6: (otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1671:6: (otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1671:8: otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleStatement3260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSynchronizedKeyword_7_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1675:1: ( (lv_rparent_9_0= RULE_RPAREN ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1676:1: (lv_rparent_9_0= RULE_RPAREN )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1676:1: (lv_rparent_9_0= RULE_RPAREN )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1677:3: lv_rparent_9_0= RULE_RPAREN
                    {
                    lv_rparent_9_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleStatement3277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rparent_9_0, grammarAccess.getStatementAccess().getRparentRPARENTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rparent",
                              		lv_rparent_9_0, 
                              		"RPAREN");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1693:2: ( (lv_syncStatement_10_0= ruleStatement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1694:1: (lv_syncStatement_10_0= ruleStatement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1694:1: (lv_syncStatement_10_0= ruleStatement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1695:3: lv_syncStatement_10_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3303);
                    lv_syncStatement_10_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"syncStatement",
                              		lv_syncStatement_10_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1712:6: ( () otherlv_12= 'return' otherlv_13= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1712:6: ( () otherlv_12= 'return' otherlv_13= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1712:7: () otherlv_12= 'return' otherlv_13= ';'
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1712:7: ()
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1713:2: 
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

                    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleStatement3335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getReturnKeyword_8_1());
                          
                    }
                    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleStatement3347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getSemicolonKeyword_8_2());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1730:6: ( () otherlv_15= 'throw' otherlv_16= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1730:6: ( () otherlv_15= 'throw' otherlv_16= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1730:7: () otherlv_15= 'throw' otherlv_16= ';'
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1730:7: ()
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1731:2: 
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

                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleStatement3379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getThrowKeyword_9_1());
                          
                    }
                    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleStatement3391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getSemicolonKeyword_9_2());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1749:2: this_Statement_block_17= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleStatement3423);
                    this_Statement_block_17=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_block_17; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1761:6: ( (lv_tryStatement_18_0= ruleTry_statement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1761:6: ( (lv_tryStatement_18_0= ruleTry_statement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1762:1: (lv_tryStatement_18_0= ruleTry_statement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1762:1: (lv_tryStatement_18_0= ruleTry_statement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1763:3: lv_tryStatement_18_0= ruleTry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_11_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTry_statement_in_ruleStatement3449);
                    lv_tryStatement_18_0=ruleTry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"tryStatement",
                              		lv_tryStatement_18_0, 
                              		"Try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1780:6: ( ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1780:6: ( ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1780:7: ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1780:7: ( (lv_nameStatement_19_0= RULE_ID ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1781:1: (lv_nameStatement_19_0= RULE_ID )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1781:1: (lv_nameStatement_19_0= RULE_ID )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1782:3: lv_nameStatement_19_0= RULE_ID
                    {
                    lv_nameStatement_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nameStatement_19_0, grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_12_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nameStatement",
                              		lv_nameStatement_19_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,37,FOLLOW_37_in_ruleStatement3490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStatementAccess().getColonKeyword_12_1());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1802:1: ( (lv_statement_21_0= ruleStatement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1803:1: (lv_statement_21_0= ruleStatement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1803:1: (lv_statement_21_0= ruleStatement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1804:3: lv_statement_21_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_12_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3511);
                    lv_statement_21_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_21_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1821:6: ( () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1821:6: ( () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1821:7: () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';'
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1821:7: ()
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1822:2: 
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

                    otherlv_23=(Token)match(input,38,FOLLOW_38_in_ruleStatement3543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getStatementAccess().getBreakKeyword_13_1());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1834:1: ( (lv_name_24_0= RULE_ID ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1835:1: (lv_name_24_0= RULE_ID )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1835:1: (lv_name_24_0= RULE_ID )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1836:3: lv_name_24_0= RULE_ID
                            {
                            lv_name_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3560); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_24_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_13_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_24_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,16,FOLLOW_16_in_ruleStatement3578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getStatementAccess().getSemicolonKeyword_13_3());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1857:6: ( () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1857:6: ( () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1857:7: () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';'
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1857:7: ()
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1858:2: 
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

                    otherlv_27=(Token)match(input,39,FOLLOW_39_in_ruleStatement3610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getStatementAccess().getContinueKeyword_14_1());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1870:1: ( (lv_name_28_0= RULE_ID ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1871:1: (lv_name_28_0= RULE_ID )
                            {
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1871:1: (lv_name_28_0= RULE_ID )
                            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1872:3: lv_name_28_0= RULE_ID
                            {
                            lv_name_28_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3627); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_28_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_14_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_28_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,16,FOLLOW_16_in_ruleStatement3645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getStatementAccess().getSemicolonKeyword_14_3());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1893:6: ( () otherlv_31= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1893:6: ( () otherlv_31= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1893:7: () otherlv_31= ';'
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1893:7: ()
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1894:2: 
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

                    otherlv_31=(Token)match(input,16,FOLLOW_16_in_ruleStatement3677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getStatementAccess().getSemicolonKeyword_15_1());
                          
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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1914:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1915:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1916:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3714);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3724); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1923:1: ruleExpression returns [EObject current=null] : ( ( (lv_expression_0_0= ruleNumeric_Expression ) ) | ( ( (lv_lParen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | (otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ( (lv_expressionLine_8_0= ruleExpression_line ) ) ) | (otherlv_9= '.' ( (lv_expression_10_0= ruleExpression ) ) ( (lv_expressionLine_11_0= ruleExpression_line ) ) ) | (otherlv_12= ',' ( (lv_expression_13_0= ruleExpression ) ) ( (lv_expressionLine_14_0= ruleExpression_line ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_expression_16_0= ruleExpression_line ) ) ) | (otherlv_17= 'null' ( (lv_expression_18_0= ruleExpression_line ) ) ) | (otherlv_19= 'super' ( (lv_expression_20_0= ruleExpression_line ) ) ) | (otherlv_21= 'this' ( (lv_expression_22_0= ruleExpression_line ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_lParen_1_0=null;
        Token lv_rparent_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token lv_name_15_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expressionLine_4_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expressionLine_8_0 = null;

        EObject lv_expression_10_0 = null;

        EObject lv_expressionLine_11_0 = null;

        EObject lv_expression_13_0 = null;

        EObject lv_expressionLine_14_0 = null;

        EObject lv_expression_16_0 = null;

        EObject lv_expression_18_0 = null;

        EObject lv_expression_20_0 = null;

        EObject lv_expression_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1926:28: ( ( ( (lv_expression_0_0= ruleNumeric_Expression ) ) | ( ( (lv_lParen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | (otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ( (lv_expressionLine_8_0= ruleExpression_line ) ) ) | (otherlv_9= '.' ( (lv_expression_10_0= ruleExpression ) ) ( (lv_expressionLine_11_0= ruleExpression_line ) ) ) | (otherlv_12= ',' ( (lv_expression_13_0= ruleExpression ) ) ( (lv_expressionLine_14_0= ruleExpression_line ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_expression_16_0= ruleExpression_line ) ) ) | (otherlv_17= 'null' ( (lv_expression_18_0= ruleExpression_line ) ) ) | (otherlv_19= 'super' ( (lv_expression_20_0= ruleExpression_line ) ) ) | (otherlv_21= 'this' ( (lv_expression_22_0= ruleExpression_line ) ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1927:1: ( ( (lv_expression_0_0= ruleNumeric_Expression ) ) | ( ( (lv_lParen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | (otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ( (lv_expressionLine_8_0= ruleExpression_line ) ) ) | (otherlv_9= '.' ( (lv_expression_10_0= ruleExpression ) ) ( (lv_expressionLine_11_0= ruleExpression_line ) ) ) | (otherlv_12= ',' ( (lv_expression_13_0= ruleExpression ) ) ( (lv_expressionLine_14_0= ruleExpression_line ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_expression_16_0= ruleExpression_line ) ) ) | (otherlv_17= 'null' ( (lv_expression_18_0= ruleExpression_line ) ) ) | (otherlv_19= 'super' ( (lv_expression_20_0= ruleExpression_line ) ) ) | (otherlv_21= 'this' ( (lv_expression_22_0= ruleExpression_line ) ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1927:1: ( ( (lv_expression_0_0= ruleNumeric_Expression ) ) | ( ( (lv_lParen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | (otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ( (lv_expressionLine_8_0= ruleExpression_line ) ) ) | (otherlv_9= '.' ( (lv_expression_10_0= ruleExpression ) ) ( (lv_expressionLine_11_0= ruleExpression_line ) ) ) | (otherlv_12= ',' ( (lv_expression_13_0= ruleExpression ) ) ( (lv_expressionLine_14_0= ruleExpression_line ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_expression_16_0= ruleExpression_line ) ) ) | (otherlv_17= 'null' ( (lv_expression_18_0= ruleExpression_line ) ) ) | (otherlv_19= 'super' ( (lv_expression_20_0= ruleExpression_line ) ) ) | (otherlv_21= 'this' ( (lv_expression_22_0= ruleExpression_line ) ) ) )
            int alt35=9;
            switch ( input.LA(1) ) {
            case RULE_MINUS:
            case 44:
            case 45:
                {
                alt35=1;
                }
                break;
            case RULE_LPAREN:
                {
                alt35=2;
                }
                break;
            case 24:
                {
                alt35=3;
                }
                break;
            case 40:
                {
                alt35=4;
                }
                break;
            case 19:
                {
                alt35=5;
                }
                break;
            case RULE_ID:
                {
                alt35=6;
                }
                break;
            case 41:
                {
                alt35=7;
                }
                break;
            case 42:
                {
                alt35=8;
                }
                break;
            case 43:
                {
                alt35=9;
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1927:2: ( (lv_expression_0_0= ruleNumeric_Expression ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1927:2: ( (lv_expression_0_0= ruleNumeric_Expression ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1928:1: (lv_expression_0_0= ruleNumeric_Expression )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1928:1: (lv_expression_0_0= ruleNumeric_Expression )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1929:3: lv_expression_0_0= ruleNumeric_Expression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionNumeric_ExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumeric_Expression_in_ruleExpression3770);
                    lv_expression_0_0=ruleNumeric_Expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"Numeric_Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1946:6: ( ( (lv_lParen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1946:6: ( ( (lv_lParen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1946:7: ( (lv_lParen_1_0= RULE_LPAREN ) ) ( (lv_expression_2_0= ruleExpression ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1946:7: ( (lv_lParen_1_0= RULE_LPAREN ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1947:1: (lv_lParen_1_0= RULE_LPAREN )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1947:1: (lv_lParen_1_0= RULE_LPAREN )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1948:3: lv_lParen_1_0= RULE_LPAREN
                    {
                    lv_lParen_1_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleExpression3794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_lParen_1_0, grammarAccess.getExpressionAccess().getLParenLPARENTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"lParen",
                              		lv_lParen_1_0, 
                              		"LPAREN");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1964:2: ( (lv_expression_2_0= ruleExpression ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1965:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1965:1: (lv_expression_2_0= ruleExpression )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1966:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3820);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
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

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1982:2: ( (lv_rparent_3_0= RULE_RPAREN ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1983:1: (lv_rparent_3_0= RULE_RPAREN )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1983:1: (lv_rparent_3_0= RULE_RPAREN )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:1984:3: lv_rparent_3_0= RULE_RPAREN
                    {
                    lv_rparent_3_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleExpression3837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rparent_3_0, grammarAccess.getExpressionAccess().getRparentRPARENTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rparent",
                              		lv_rparent_3_0, 
                              		"RPAREN");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2000:2: ( (lv_expressionLine_4_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2001:1: (lv_expressionLine_4_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2001:1: (lv_expressionLine_4_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2002:3: lv_expressionLine_4_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3863);
                    lv_expressionLine_4_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_4_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2019:6: (otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ( (lv_expressionLine_8_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2019:6: (otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ( (lv_expressionLine_8_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2019:8: otherlv_5= '[' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ']' ( (lv_expressionLine_8_0= ruleExpression_line ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleExpression3883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2023:1: ( (lv_expression_6_0= ruleExpression ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2024:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2024:1: (lv_expression_6_0= ruleExpression )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2025:3: lv_expression_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3904);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleExpression3916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_2_2());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2045:1: ( (lv_expressionLine_8_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2046:1: (lv_expressionLine_8_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2046:1: (lv_expressionLine_8_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2047:3: lv_expressionLine_8_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3937);
                    lv_expressionLine_8_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_8_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2064:6: (otherlv_9= '.' ( (lv_expression_10_0= ruleExpression ) ) ( (lv_expressionLine_11_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2064:6: (otherlv_9= '.' ( (lv_expression_10_0= ruleExpression ) ) ( (lv_expressionLine_11_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2064:8: otherlv_9= '.' ( (lv_expression_10_0= ruleExpression ) ) ( (lv_expressionLine_11_0= ruleExpression_line ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleExpression3957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getFullStopKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2068:1: ( (lv_expression_10_0= ruleExpression ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2069:1: (lv_expression_10_0= ruleExpression )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2069:1: (lv_expression_10_0= ruleExpression )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2070:3: lv_expression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3978);
                    lv_expression_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_10_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2086:2: ( (lv_expressionLine_11_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2087:1: (lv_expressionLine_11_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2087:1: (lv_expressionLine_11_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2088:3: lv_expressionLine_11_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3999);
                    lv_expressionLine_11_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_11_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2105:6: (otherlv_12= ',' ( (lv_expression_13_0= ruleExpression ) ) ( (lv_expressionLine_14_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2105:6: (otherlv_12= ',' ( (lv_expression_13_0= ruleExpression ) ) ( (lv_expressionLine_14_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2105:8: otherlv_12= ',' ( (lv_expression_13_0= ruleExpression ) ) ( (lv_expressionLine_14_0= ruleExpression_line ) )
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleExpression4019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getCommaKeyword_4_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2109:1: ( (lv_expression_13_0= ruleExpression ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2110:1: (lv_expression_13_0= ruleExpression )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2110:1: (lv_expression_13_0= ruleExpression )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2111:3: lv_expression_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4040);
                    lv_expression_13_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_13_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2127:2: ( (lv_expressionLine_14_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2128:1: (lv_expressionLine_14_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2128:1: (lv_expressionLine_14_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2129:3: lv_expressionLine_14_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression4061);
                    lv_expressionLine_14_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_14_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2146:6: ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_expression_16_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2146:6: ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_expression_16_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2146:7: ( (lv_name_15_0= RULE_ID ) ) ( (lv_expression_16_0= ruleExpression_line ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2146:7: ( (lv_name_15_0= RULE_ID ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2147:1: (lv_name_15_0= RULE_ID )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2147:1: (lv_name_15_0= RULE_ID )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2148:3: lv_name_15_0= RULE_ID
                    {
                    lv_name_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression4086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_15_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_5_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2164:2: ( (lv_expression_16_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2165:1: (lv_expression_16_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2165:1: (lv_expression_16_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2166:3: lv_expression_16_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression4112);
                    lv_expression_16_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_16_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2183:6: (otherlv_17= 'null' ( (lv_expression_18_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2183:6: (otherlv_17= 'null' ( (lv_expression_18_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2183:8: otherlv_17= 'null' ( (lv_expression_18_0= ruleExpression_line ) )
                    {
                    otherlv_17=(Token)match(input,41,FOLLOW_41_in_ruleExpression4132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getExpressionAccess().getNullKeyword_6_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2187:1: ( (lv_expression_18_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2188:1: (lv_expression_18_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2188:1: (lv_expression_18_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2189:3: lv_expression_18_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression4153);
                    lv_expression_18_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_18_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2206:6: (otherlv_19= 'super' ( (lv_expression_20_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2206:6: (otherlv_19= 'super' ( (lv_expression_20_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2206:8: otherlv_19= 'super' ( (lv_expression_20_0= ruleExpression_line ) )
                    {
                    otherlv_19=(Token)match(input,42,FOLLOW_42_in_ruleExpression4173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getExpressionAccess().getSuperKeyword_7_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2210:1: ( (lv_expression_20_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2211:1: (lv_expression_20_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2211:1: (lv_expression_20_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2212:3: lv_expression_20_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression4194);
                    lv_expression_20_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_20_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2229:6: (otherlv_21= 'this' ( (lv_expression_22_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2229:6: (otherlv_21= 'this' ( (lv_expression_22_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2229:8: otherlv_21= 'this' ( (lv_expression_22_0= ruleExpression_line ) )
                    {
                    otherlv_21=(Token)match(input,43,FOLLOW_43_in_ruleExpression4214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getExpressionAccess().getThisKeyword_8_0());
                          
                    }
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2233:1: ( (lv_expression_22_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2234:1: (lv_expression_22_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2234:1: (lv_expression_22_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2235:3: lv_expression_22_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression4235);
                    lv_expression_22_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_22_0, 
                              		"Expression_line");
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


    // $ANTLR start "entryRuleNumeric_Expression"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2259:1: entryRuleNumeric_Expression returns [EObject current=null] : iv_ruleNumeric_Expression= ruleNumeric_Expression EOF ;
    public final EObject entryRuleNumeric_Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeric_Expression = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2260:2: (iv_ruleNumeric_Expression= ruleNumeric_Expression EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2261:2: iv_ruleNumeric_Expression= ruleNumeric_Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_ExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumeric_Expression_in_entryRuleNumeric_Expression4272);
            iv_ruleNumeric_Expression=ruleNumeric_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeric_Expression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeric_Expression4282); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumeric_Expression"


    // $ANTLR start "ruleNumeric_Expression"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2268:1: ruleNumeric_Expression returns [EObject current=null] : ( ( (lv_unaryOp_0_0= ruleUNARYOP ) ) ( (lv_expression_1_0= ruleExpression ) ) ( (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line ) ) ) ;
    public final EObject ruleNumeric_Expression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_unaryOp_0_0 = null;

        EObject lv_expression_1_0 = null;

        EObject lv_numericExpressionLine_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2271:28: ( ( ( (lv_unaryOp_0_0= ruleUNARYOP ) ) ( (lv_expression_1_0= ruleExpression ) ) ( (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2272:1: ( ( (lv_unaryOp_0_0= ruleUNARYOP ) ) ( (lv_expression_1_0= ruleExpression ) ) ( (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2272:1: ( ( (lv_unaryOp_0_0= ruleUNARYOP ) ) ( (lv_expression_1_0= ruleExpression ) ) ( (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2272:2: ( (lv_unaryOp_0_0= ruleUNARYOP ) ) ( (lv_expression_1_0= ruleExpression ) ) ( (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2272:2: ( (lv_unaryOp_0_0= ruleUNARYOP ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2273:1: (lv_unaryOp_0_0= ruleUNARYOP )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2273:1: (lv_unaryOp_0_0= ruleUNARYOP )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2274:3: lv_unaryOp_0_0= ruleUNARYOP
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_ExpressionAccess().getUnaryOpUNARYOPParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUNARYOP_in_ruleNumeric_Expression4328);
            lv_unaryOp_0_0=ruleUNARYOP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_ExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"unaryOp",
                      		lv_unaryOp_0_0, 
                      		"UNARYOP");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2290:2: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2291:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2291:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2292:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_ExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleNumeric_Expression4349);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_ExpressionRule());
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2308:2: ( (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2309:1: (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2309:1: (lv_numericExpressionLine_2_0= ruleNumeric_Expression_line )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2310:3: lv_numericExpressionLine_2_0= ruleNumeric_Expression_line
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumeric_ExpressionAccess().getNumericExpressionLineNumeric_Expression_lineParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumeric_Expression_line_in_ruleNumeric_Expression4370);
            lv_numericExpressionLine_2_0=ruleNumeric_Expression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumeric_ExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"numericExpressionLine",
                      		lv_numericExpressionLine_2_0, 
                      		"Numeric_Expression_line");
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
    // $ANTLR end "ruleNumeric_Expression"


    // $ANTLR start "entryRuleNumeric_Expression_line"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2334:1: entryRuleNumeric_Expression_line returns [EObject current=null] : iv_ruleNumeric_Expression_line= ruleNumeric_Expression_line EOF ;
    public final EObject entryRuleNumeric_Expression_line() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeric_Expression_line = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2335:2: (iv_ruleNumeric_Expression_line= ruleNumeric_Expression_line EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2336:2: iv_ruleNumeric_Expression_line= ruleNumeric_Expression_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeric_Expression_lineRule()); 
            }
            pushFollow(FOLLOW_ruleNumeric_Expression_line_in_entryRuleNumeric_Expression_line4406);
            iv_ruleNumeric_Expression_line=ruleNumeric_Expression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeric_Expression_line; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumeric_Expression_line4416); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumeric_Expression_line"


    // $ANTLR start "ruleNumeric_Expression_line"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2343:1: ruleNumeric_Expression_line returns [EObject current=null] : ( ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) ) | ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | () ) ;
    public final EObject ruleNumeric_Expression_line() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_increment_0_0 = null;

        EObject lv_expressionLine_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expressionLine_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2346:28: ( ( ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) ) | ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | () ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:1: ( ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) ) | ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | () )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:1: ( ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) ) | ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | () )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:2: ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:2: ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:3: ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:3: ( (lv_increment_0_0= ruleINCREMENT ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2348:1: (lv_increment_0_0= ruleINCREMENT )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2348:1: (lv_increment_0_0= ruleINCREMENT )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2349:3: lv_increment_0_0= ruleINCREMENT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getIncrementINCREMENTParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleINCREMENT_in_ruleNumeric_Expression_line4463);
                    lv_increment_0_0=ruleINCREMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_lineRule());
                      	        }
                             		set(
                             			current, 
                             			"increment",
                              		lv_increment_0_0, 
                              		"INCREMENT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2365:2: ( (lv_expressionLine_1_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2366:1: (lv_expressionLine_1_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2366:1: (lv_expressionLine_1_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2367:3: lv_expressionLine_1_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getExpressionLineExpression_lineParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleNumeric_Expression_line4484);
                    lv_expressionLine_1_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_lineRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_1_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:6: ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:6: ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:7: ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:7: ( (lv_op_2_0= ruleOP ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2385:1: (lv_op_2_0= ruleOP )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2385:1: (lv_op_2_0= ruleOP )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2386:3: lv_op_2_0= ruleOP
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getOpOPParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOP_in_ruleNumeric_Expression_line4513);
                    lv_op_2_0=ruleOP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_lineRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"OP");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2402:2: ( (lv_expression_3_0= ruleExpression ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2403:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2403:1: (lv_expression_3_0= ruleExpression )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2404:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleNumeric_Expression_line4534);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_lineRule());
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

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2420:2: ( (lv_expressionLine_4_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2421:1: (lv_expressionLine_4_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2421:1: (lv_expressionLine_4_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2422:3: lv_expressionLine_4_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getExpressionLineExpression_lineParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleNumeric_Expression_line4555);
                    lv_expressionLine_4_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumeric_Expression_lineRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_4_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2439:6: ()
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2439:6: ()
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2440:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumeric_Expression_lineAccess().getExpression_lineAction_2(),
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
    // $ANTLR end "ruleNumeric_Expression_line"


    // $ANTLR start "entryRuleUNARYOP"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2456:1: entryRuleUNARYOP returns [String current=null] : iv_ruleUNARYOP= ruleUNARYOP EOF ;
    public final String entryRuleUNARYOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNARYOP = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2457:2: (iv_ruleUNARYOP= ruleUNARYOP EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2458:2: iv_ruleUNARYOP= ruleUNARYOP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUNARYOPRule()); 
            }
            pushFollow(FOLLOW_ruleUNARYOP_in_entryRuleUNARYOP4611);
            iv_ruleUNARYOP=ruleUNARYOP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUNARYOP.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNARYOP4622); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNARYOP"


    // $ANTLR start "ruleUNARYOP"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2465:1: ruleUNARYOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MINUS_0= RULE_MINUS | this_INCREMENT_1= ruleINCREMENT ) ;
    public final AntlrDatatypeRuleToken ruleUNARYOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MINUS_0=null;
        AntlrDatatypeRuleToken this_INCREMENT_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2468:28: ( (this_MINUS_0= RULE_MINUS | this_INCREMENT_1= ruleINCREMENT ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2469:1: (this_MINUS_0= RULE_MINUS | this_INCREMENT_1= ruleINCREMENT )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2469:1: (this_MINUS_0= RULE_MINUS | this_INCREMENT_1= ruleINCREMENT )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_MINUS) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=44 && LA37_0<=45)) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2469:6: this_MINUS_0= RULE_MINUS
                    {
                    this_MINUS_0=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleUNARYOP4662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_0, grammarAccess.getUNARYOPAccess().getMINUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2478:5: this_INCREMENT_1= ruleINCREMENT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUNARYOPAccess().getINCREMENTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleINCREMENT_in_ruleUNARYOP4695);
                    this_INCREMENT_1=ruleINCREMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INCREMENT_1);
                          
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
    // $ANTLR end "ruleUNARYOP"


    // $ANTLR start "entryRuleINCREMENT"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2496:1: entryRuleINCREMENT returns [String current=null] : iv_ruleINCREMENT= ruleINCREMENT EOF ;
    public final String entryRuleINCREMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINCREMENT = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2497:2: (iv_ruleINCREMENT= ruleINCREMENT EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2498:2: iv_ruleINCREMENT= ruleINCREMENT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINCREMENTRule()); 
            }
            pushFollow(FOLLOW_ruleINCREMENT_in_entryRuleINCREMENT4741);
            iv_ruleINCREMENT=ruleINCREMENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINCREMENT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINCREMENT4752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINCREMENT"


    // $ANTLR start "ruleINCREMENT"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2505:1: ruleINCREMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '--' | kw= '++' ) ;
    public final AntlrDatatypeRuleToken ruleINCREMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2508:28: ( (kw= '--' | kw= '++' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2509:1: (kw= '--' | kw= '++' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2509:1: (kw= '--' | kw= '++' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            else if ( (LA38_0==45) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2510:2: kw= '--'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleINCREMENT4790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getINCREMENTAccess().getHyphenMinusHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2517:2: kw= '++'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleINCREMENT4809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getINCREMENTAccess().getPlusSignPlusSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleINCREMENT"


    // $ANTLR start "entryRuleOP"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2530:1: entryRuleOP returns [String current=null] : iv_ruleOP= ruleOP EOF ;
    public final String entryRuleOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2531:2: (iv_ruleOP= ruleOP EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2532:2: iv_ruleOP= ruleOP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOPRule()); 
            }
            pushFollow(FOLLOW_ruleOP_in_entryRuleOP4850);
            iv_ruleOP=ruleOP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOP.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOP4861); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOP"


    // $ANTLR start "ruleOP"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2539:1: ruleOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | kw= '+=' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) ;
    public final AntlrDatatypeRuleToken ruleOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2542:28: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | kw= '+=' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2543:1: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | kw= '+=' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2543:1: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | kw= '+=' | kw= '-=' | kw= '*' | kw= '*=' | kw= '/' | kw= '/=' | kw= '%' | kw= '%=' )
            int alt39=10;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt39=1;
                }
                break;
            case RULE_MINUS:
                {
                alt39=2;
                }
                break;
            case 46:
                {
                alt39=3;
                }
                break;
            case 47:
                {
                alt39=4;
                }
                break;
            case 48:
                {
                alt39=5;
                }
                break;
            case 49:
                {
                alt39=6;
                }
                break;
            case 50:
                {
                alt39=7;
                }
                break;
            case 51:
                {
                alt39=8;
                }
                break;
            case 52:
                {
                alt39=9;
                }
                break;
            case 53:
                {
                alt39=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2543:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOP4901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getOPAccess().getPLUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2551:10: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOP4927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_1, grammarAccess.getOPAccess().getMINUSTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2560:2: kw= '+='
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOP4951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getPlusSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2567:2: kw= '-='
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOP4970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getHyphenMinusEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2574:2: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOP4989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getAsteriskKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2581:2: kw= '*='
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOP5008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getAsteriskEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2588:2: kw= '/'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOP5027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getSolidusKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2595:2: kw= '/='
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOP5046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getSolidusEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2602:2: kw= '%'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOP5065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getPercentSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2609:2: kw= '%='
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleOP5084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOPAccess().getPercentSignEqualsSignKeyword_9()); 
                          
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
    // $ANTLR end "ruleOP"


    // $ANTLR start "entryRuleExpression_line"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2622:1: entryRuleExpression_line returns [EObject current=null] : iv_ruleExpression_line= ruleExpression_line EOF ;
    public final EObject entryRuleExpression_line() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_line = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2623:2: (iv_ruleExpression_line= ruleExpression_line EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2624:2: iv_ruleExpression_line= ruleExpression_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_lineRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_line_in_entryRuleExpression_line5124);
            iv_ruleExpression_line=ruleExpression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_line; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_line5134); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_line"


    // $ANTLR start "ruleExpression_line"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2631:1: ruleExpression_line returns [EObject current=null] : ( ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) ) | () ) ;
    public final EObject ruleExpression_line() throws RecognitionException {
        EObject current = null;

        Token lv_lParen_0_0=null;
        Token lv_rparent_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2634:28: ( ( ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) ) | () ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:1: ( ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) ) | () )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:1: ( ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) ) | () )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_LPAREN) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred79_InternalMyJava()) ) {
                    alt40=1;
                }
                else if ( (true) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==EOF||LA40_0==RULE_RPAREN||(LA40_0>=RULE_MINUS && LA40_0<=RULE_PLUS)||LA40_0==16||LA40_0==25||(LA40_0>=44 && LA40_0<=53)) ) {
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
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:2: ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:2: ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:3: ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:3: ( (lv_lParen_0_0= RULE_LPAREN ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2636:1: (lv_lParen_0_0= RULE_LPAREN )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2636:1: (lv_lParen_0_0= RULE_LPAREN )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2637:3: lv_lParen_0_0= RULE_LPAREN
                    {
                    lv_lParen_0_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleExpression_line5177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_lParen_0_0, grammarAccess.getExpression_lineAccess().getLParenLPARENTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpression_lineRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"lParen",
                              		lv_lParen_0_0, 
                              		"LPAREN");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2653:2: ( (lv_rparent_1_0= RULE_RPAREN ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2654:1: (lv_rparent_1_0= RULE_RPAREN )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2654:1: (lv_rparent_1_0= RULE_RPAREN )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2655:3: lv_rparent_1_0= RULE_RPAREN
                    {
                    lv_rparent_1_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleExpression_line5199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_rparent_1_0, grammarAccess.getExpression_lineAccess().getRparentRPARENTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpression_lineRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"rparent",
                              		lv_rparent_1_0, 
                              		"RPAREN");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2671:2: ( (lv_expression_2_0= ruleExpression_line ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2672:1: (lv_expression_2_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2672:1: (lv_expression_2_0= ruleExpression_line )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2673:3: lv_expression_2_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_lineAccess().getExpressionExpression_lineParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression_line5225);
                    lv_expression_2_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_lineRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2690:6: ()
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2690:6: ()
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2691:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_lineAccess().getExpression_lineAction_1(),
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
    // $ANTLR end "ruleExpression_line"


    // $ANTLR start "entryRuleSwitch_statement"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2709:1: entryRuleSwitch_statement returns [EObject current=null] : iv_ruleSwitch_statement= ruleSwitch_statement EOF ;
    public final EObject entryRuleSwitch_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch_statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2710:2: (iv_ruleSwitch_statement= ruleSwitch_statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2711:2: iv_ruleSwitch_statement= ruleSwitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement5282);
            iv_ruleSwitch_statement=ruleSwitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch_statement5292); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2718:1: ruleSwitch_statement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | otherlv_7= 'default:' | ( (lv_switchStatements_8_0= ruleStatement ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleSwitch_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lParen_2_0=null;
        Token lv_rparent_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_switchStatements_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2721:28: ( ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | otherlv_7= 'default:' | ( (lv_switchStatements_8_0= ruleStatement ) ) )* otherlv_9= '}' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2722:1: ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | otherlv_7= 'default:' | ( (lv_switchStatements_8_0= ruleStatement ) ) )* otherlv_9= '}' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2722:1: ( () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | otherlv_7= 'default:' | ( (lv_switchStatements_8_0= ruleStatement ) ) )* otherlv_9= '}' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2722:2: () otherlv_1= 'switch' ( (lv_lParen_2_0= RULE_LPAREN ) ) ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= '{' ( (otherlv_5= 'case' otherlv_6= ':' ) | otherlv_7= 'default:' | ( (lv_switchStatements_8_0= ruleStatement ) ) )* otherlv_9= '}'
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2722:2: ()
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2723:2: 
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleSwitch_statement5341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2735:1: ( (lv_lParen_2_0= RULE_LPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2736:1: (lv_lParen_2_0= RULE_LPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2736:1: (lv_lParen_2_0= RULE_LPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2737:3: lv_lParen_2_0= RULE_LPAREN
            {
            lv_lParen_2_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSwitch_statement5358); if (state.failed) return current;
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2753:2: ( (lv_rparent_3_0= RULE_RPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2754:1: (lv_rparent_3_0= RULE_RPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2754:1: (lv_rparent_3_0= RULE_RPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2755:3: lv_rparent_3_0= RULE_RPAREN
            {
            lv_rparent_3_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSwitch_statement5380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_3_0, grammarAccess.getSwitch_statementAccess().getRparentRPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitch_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_3_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleSwitch_statement5397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitch_statementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2775:1: ( (otherlv_5= 'case' otherlv_6= ':' ) | otherlv_7= 'default:' | ( (lv_switchStatements_8_0= ruleStatement ) ) )*
            loop41:
            do {
                int alt41=4;
                switch ( input.LA(1) ) {
                case 55:
                    {
                    alt41=1;
                    }
                    break;
                case 56:
                    {
                    alt41=2;
                    }
                    break;
                case RULE_ID:
                case RULE_LPAREN:
                case RULE_MOD:
                case RULE_STATIC:
                case RULE_MINUS:
                case 16:
                case 19:
                case 20:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 54:
                case 57:
                case 58:
                case 59:
                case 60:
                case 62:
                    {
                    alt41=3;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2775:2: (otherlv_5= 'case' otherlv_6= ':' )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2775:2: (otherlv_5= 'case' otherlv_6= ':' )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2775:4: otherlv_5= 'case' otherlv_6= ':'
            	    {
            	    otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleSwitch_statement5411); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSwitch_statementAccess().getCaseKeyword_5_0_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleSwitch_statement5423); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSwitch_statementAccess().getColonKeyword_5_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2784:7: otherlv_7= 'default:'
            	    {
            	    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleSwitch_statement5442); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_5_1());
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2789:6: ( (lv_switchStatements_8_0= ruleStatement ) )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2789:6: ( (lv_switchStatements_8_0= ruleStatement ) )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2790:1: (lv_switchStatements_8_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2790:1: (lv_switchStatements_8_0= ruleStatement )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2791:3: lv_switchStatements_8_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getSwitchStatementsStatementParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleSwitch_statement5469);
            	    lv_switchStatements_8_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"switchStatements",
            	              		lv_switchStatements_8_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleSwitch_statement5483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSwitch_statementAccess().getRightCurlyBracketKeyword_6());
                  
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


    // $ANTLR start "entryRuleFor_Statement"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2819:1: entryRuleFor_Statement returns [EObject current=null] : iv_ruleFor_Statement= ruleFor_Statement EOF ;
    public final EObject entryRuleFor_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_Statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2820:2: (iv_ruleFor_Statement= ruleFor_Statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2821:2: iv_ruleFor_Statement= ruleFor_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement5519);
            iv_ruleFor_Statement=ruleFor_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor_Statement5529); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2828:1: ruleFor_Statement returns [EObject current=null] : (otherlv_0= 'for(' ( ( (lv_variable_1_0= ruleVariable_declaration ) ) | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';' ( (lv_rParent_5_0= RULE_RPAREN ) ) ( (lv_forStatement_6_0= ruleStatement ) ) ) ;
    public final EObject ruleFor_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_rParent_5_0=null;
        EObject lv_variable_1_0 = null;

        EObject lv_forStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2831:28: ( (otherlv_0= 'for(' ( ( (lv_variable_1_0= ruleVariable_declaration ) ) | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';' ( (lv_rParent_5_0= RULE_RPAREN ) ) ( (lv_forStatement_6_0= ruleStatement ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2832:1: (otherlv_0= 'for(' ( ( (lv_variable_1_0= ruleVariable_declaration ) ) | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';' ( (lv_rParent_5_0= RULE_RPAREN ) ) ( (lv_forStatement_6_0= ruleStatement ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2832:1: (otherlv_0= 'for(' ( ( (lv_variable_1_0= ruleVariable_declaration ) ) | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';' ( (lv_rParent_5_0= RULE_RPAREN ) ) ( (lv_forStatement_6_0= ruleStatement ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2832:3: otherlv_0= 'for(' ( ( (lv_variable_1_0= ruleVariable_declaration ) ) | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';' ( (lv_rParent_5_0= RULE_RPAREN ) ) ( (lv_forStatement_6_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleFor_Statement5566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_StatementAccess().getForKeyword_0());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2836:1: ( ( (lv_variable_1_0= ruleVariable_declaration ) ) | otherlv_2= ';' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||(LA42_0>=RULE_MOD && LA42_0<=RULE_STATIC)||(LA42_0>=26 && LA42_0<=33)) ) {
                alt42=1;
            }
            else if ( (LA42_0==16) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2836:2: ( (lv_variable_1_0= ruleVariable_declaration ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2836:2: ( (lv_variable_1_0= ruleVariable_declaration ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2837:1: (lv_variable_1_0= ruleVariable_declaration )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2837:1: (lv_variable_1_0= ruleVariable_declaration )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2838:3: lv_variable_1_0= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFor_StatementAccess().getVariableVariable_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleFor_Statement5588);
                    lv_variable_1_0=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_1_0, 
                              		"Variable_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2855:7: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFor_Statement5606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFor_Statement5619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_2());
                  
            }
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFor_Statement5631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2867:1: ( (lv_rParent_5_0= RULE_RPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2868:1: (lv_rParent_5_0= RULE_RPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2868:1: (lv_rParent_5_0= RULE_RPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2869:3: lv_rParent_5_0= RULE_RPAREN
            {
            lv_rParent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleFor_Statement5648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rParent_5_0, grammarAccess.getFor_StatementAccess().getRParentRPARENTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFor_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rParent",
                      		lv_rParent_5_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2885:2: ( (lv_forStatement_6_0= ruleStatement ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2886:1: (lv_forStatement_6_0= ruleStatement )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2886:1: (lv_forStatement_6_0= ruleStatement )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2887:3: lv_forStatement_6_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_StatementAccess().getForStatementStatementParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor_Statement5674);
            lv_forStatement_6_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"forStatement",
                      		lv_forStatement_6_0, 
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


    // $ANTLR start "entryRuleWhile_Statement"
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2911:1: entryRuleWhile_Statement returns [EObject current=null] : iv_ruleWhile_Statement= ruleWhile_Statement EOF ;
    public final EObject entryRuleWhile_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile_Statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2912:2: (iv_ruleWhile_Statement= ruleWhile_Statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2913:2: iv_ruleWhile_Statement= ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement5710);
            iv_ruleWhile_Statement=ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement5720); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2920:1: ruleWhile_Statement returns [EObject current=null] : (otherlv_0= 'while(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_whileStatement_2_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rparent_1_0=null;
        EObject lv_whileStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2923:28: ( (otherlv_0= 'while(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_whileStatement_2_0= ruleStatement ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2924:1: (otherlv_0= 'while(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_whileStatement_2_0= ruleStatement ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2924:1: (otherlv_0= 'while(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_whileStatement_2_0= ruleStatement ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2924:3: otherlv_0= 'while(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_whileStatement_2_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleWhile_Statement5757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_StatementAccess().getWhileKeyword_0());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2928:1: ( (lv_rparent_1_0= RULE_RPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2929:1: (lv_rparent_1_0= RULE_RPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2929:1: (lv_rparent_1_0= RULE_RPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2930:3: lv_rparent_1_0= RULE_RPAREN
            {
            lv_rparent_1_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleWhile_Statement5774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_1_0, grammarAccess.getWhile_StatementAccess().getRparentRPARENTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhile_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_1_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2946:2: ( (lv_whileStatement_2_0= ruleStatement ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2947:1: (lv_whileStatement_2_0= ruleStatement )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2947:1: (lv_whileStatement_2_0= ruleStatement )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2948:3: lv_whileStatement_2_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getWhileStatementStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile_Statement5800);
            lv_whileStatement_2_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"whileStatement",
                      		lv_whileStatement_2_0, 
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2972:1: entryRuleDo_Statement returns [EObject current=null] : iv_ruleDo_Statement= ruleDo_Statement EOF ;
    public final EObject entryRuleDo_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo_Statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2973:2: (iv_ruleDo_Statement= ruleDo_Statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2974:2: iv_ruleDo_Statement= ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement5836);
            iv_ruleDo_Statement=ruleDo_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDo_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement5846); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2981:1: ruleDo_Statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while(' ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= ';' ) ;
    public final EObject ruleDo_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_rparent_3_0=null;
        Token otherlv_4=null;
        EObject lv_doStatement_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2984:28: ( (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while(' ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= ';' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2985:1: (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while(' ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= ';' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2985:1: (otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while(' ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= ';' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2985:3: otherlv_0= 'do' ( (lv_doStatement_1_0= ruleStatement ) ) otherlv_2= 'while(' ( (lv_rparent_3_0= RULE_RPAREN ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleDo_Statement5883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_StatementAccess().getDoKeyword_0());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2989:1: ( (lv_doStatement_1_0= ruleStatement ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2990:1: (lv_doStatement_1_0= ruleStatement )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2990:1: (lv_doStatement_1_0= ruleStatement )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2991:3: lv_doStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getDoStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleDo_Statement5904);
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

            otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleDo_Statement5916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_StatementAccess().getWhileKeyword_2());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3011:1: ( (lv_rparent_3_0= RULE_RPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3012:1: (lv_rparent_3_0= RULE_RPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3012:1: (lv_rparent_3_0= RULE_RPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3013:3: lv_rparent_3_0= RULE_RPAREN
            {
            lv_rparent_3_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleDo_Statement5933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_3_0, grammarAccess.getDo_StatementAccess().getRparentRPARENTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDo_StatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_3_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDo_Statement5950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDo_StatementAccess().getSemicolonKeyword_4());
                  
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3041:1: entryRuleIf_statement returns [EObject current=null] : iv_ruleIf_statement= ruleIf_statement EOF ;
    public final EObject entryRuleIf_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3042:2: (iv_ruleIf_statement= ruleIf_statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3043:2: iv_ruleIf_statement= ruleIf_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_entryRuleIf_statement5986);
            iv_ruleIf_statement=ruleIf_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_statement5996); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3050:1: ruleIf_statement returns [EObject current=null] : (otherlv_0= 'if(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_idStatement_2_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rparent_1_0=null;
        Token otherlv_3=null;
        EObject lv_idStatement_2_0 = null;

        EObject lv_elseStatement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3053:28: ( (otherlv_0= 'if(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_idStatement_2_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3054:1: (otherlv_0= 'if(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_idStatement_2_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3054:1: (otherlv_0= 'if(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_idStatement_2_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3054:3: otherlv_0= 'if(' ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_idStatement_2_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleIf_statement6033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3058:1: ( (lv_rparent_1_0= RULE_RPAREN ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3059:1: (lv_rparent_1_0= RULE_RPAREN )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3059:1: (lv_rparent_1_0= RULE_RPAREN )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3060:3: lv_rparent_1_0= RULE_RPAREN
            {
            lv_rparent_1_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIf_statement6050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rparent_1_0, grammarAccess.getIf_statementAccess().getRparentRPARENTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIf_statementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rparent",
                      		lv_rparent_1_0, 
                      		"RPAREN");
              	    
            }

            }


            }

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3076:2: ( (lv_idStatement_2_0= ruleStatement ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3077:1: (lv_idStatement_2_0= ruleStatement )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3077:1: (lv_idStatement_2_0= ruleStatement )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3078:3: lv_idStatement_2_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIf_statementAccess().getIdStatementStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf_statement6076);
            lv_idStatement_2_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
              	        }
                     		set(
                     			current, 
                     			"idStatement",
                      		lv_idStatement_2_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:2: ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==61) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred85_InternalMyJava()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:3: ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:3: ( ( 'else' )=>otherlv_3= 'else' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:4: ( 'else' )=>otherlv_3= 'else'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleIf_statement6097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIf_statementAccess().getElseKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3099:2: ( (lv_elseStatement_4_0= ruleStatement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3100:1: (lv_elseStatement_4_0= ruleStatement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3100:1: (lv_elseStatement_4_0= ruleStatement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3101:3: lv_elseStatement_4_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf_statement6119);
                    lv_elseStatement_4_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_4_0, 
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3125:1: entryRuleTry_statement returns [EObject current=null] : iv_ruleTry_statement= ruleTry_statement EOF ;
    public final EObject entryRuleTry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry_statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3126:2: (iv_ruleTry_statement= ruleTry_statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3127:2: iv_ruleTry_statement= ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement6157);
            iv_ruleTry_statement=ruleTry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement6167); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3134:1: ruleTry_statement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) ;
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
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3137:28: ( (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3138:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3138:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )? )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3138:3: otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleTry_statement6204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTry_statementAccess().getTryKeyword_0());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3142:1: ( (lv_tryStatement_1_0= ruleStatement ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3143:1: (lv_tryStatement_1_0= ruleStatement )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3143:1: (lv_tryStatement_1_0= ruleStatement )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3144:3: lv_tryStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement6225);
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

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:2: ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==63) ) {
                    int LA44_2 = input.LA(2);

                    if ( (synpred87_InternalMyJava()) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:3: ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:3: ( ( 'catch' )=>otherlv_2= 'catch' )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:4: ( 'catch' )=>otherlv_2= 'catch'
            	    {
            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleTry_statement6246); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3165:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3166:1: (lv_lParen_3_0= RULE_LPAREN )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3166:1: (lv_lParen_3_0= RULE_LPAREN )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3167:3: lv_lParen_3_0= RULE_LPAREN
            	    {
            	    lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleTry_statement6264); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_lParen_3_0, grammarAccess.getTry_statementAccess().getLParenLPARENTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTry_statementRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"lParen",
            	              		lv_lParen_3_0, 
            	              		"LPAREN");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3183:2: ( (lv_parameters_4_0= ruleParameter ) )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3184:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3184:1: (lv_parameters_4_0= ruleParameter )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3185:3: lv_parameters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleTry_statement6290);
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

            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3201:2: ( (lv_rparent_5_0= RULE_RPAREN ) )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3202:1: (lv_rparent_5_0= RULE_RPAREN )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3202:1: (lv_rparent_5_0= RULE_RPAREN )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3203:3: lv_rparent_5_0= RULE_RPAREN
            	    {
            	    lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleTry_statement6307); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_rparent_5_0, grammarAccess.getTry_statementAccess().getRparentRPARENTerminalRuleCall_2_3_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTry_statementRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"rparent",
            	              		lv_rparent_5_0, 
            	              		"RPAREN");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3219:2: ( (lv_catchStatement_6_0= ruleStatement ) )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3220:1: (lv_catchStatement_6_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3220:1: (lv_catchStatement_6_0= ruleStatement )
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3221:3: lv_catchStatement_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementStatementParserRuleCall_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement6333);
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
            	    break loop44;
                }
            } while (true);

            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:4: ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==64) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred89_InternalMyJava()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:5: ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:5: ( ( 'finally' )=>otherlv_7= 'finally' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:6: ( 'finally' )=>otherlv_7= 'finally'
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_64_in_ruleTry_statement6356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3242:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3243:1: (lv_finallyStatement_8_0= ruleStatement )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3243:1: (lv_finallyStatement_8_0= ruleStatement )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3244:3: lv_finallyStatement_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement6378);
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3268:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3269:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3270:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement6416);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement6426); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3277:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        AntlrDatatypeRuleToken lv_pacName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3280:28: ( (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3281:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3281:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3281:3: otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleImport_statement6463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3285:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3285:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3285:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3285:3: ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3285:3: ( (lv_className_1_0= ruleClass_name ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3286:1: (lv_className_1_0= ruleClass_name )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3286:1: (lv_className_1_0= ruleClass_name )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3287:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement6486);
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

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleImport_statement6498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3308:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3308:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3308:7: ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;'
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3308:7: ( (lv_pacName_3_0= rulePackage_name ) )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3309:1: (lv_pacName_3_0= rulePackage_name )
                    {
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3309:1: (lv_pacName_3_0= rulePackage_name )
                    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3310:3: lv_pacName_3_0= rulePackage_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement6527);
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

                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleImport_statement6539); if (state.failed) return current;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3338:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3339:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3340:2: iv_ruleClass_name= ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name6578);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name6589); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3347:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3350:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3352:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name6635);
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3370:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3371:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3372:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name6680);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name6691); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3379:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3382:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3384:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name6737);
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3402:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3403:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3404:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement6781);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement6791); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3411:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_pacName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3414:28: ( (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3415:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3415:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3415:3: otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_rulePackage_statement6828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3419:1: ( (lv_pacName_1_0= rulePackage_name ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3420:1: (lv_pacName_1_0= rulePackage_name )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3420:1: (lv_pacName_1_0= rulePackage_name )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3421:3: lv_pacName_1_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement6849);
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulePackage_statement6861); if (state.failed) return current;
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3449:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3450:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3451:2: iv_rulePackage_name= rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name6898);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name6909); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3458:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_line_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3461:28: ( (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3462:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3462:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3462:6: this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name6949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_rulePackage_name6976);
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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3488:1: entryRulePackage_name_line returns [String current=null] : iv_rulePackage_name_line= rulePackage_name_line EOF ;
    public final String entryRulePackage_name_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_line = null;


        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3489:2: (iv_rulePackage_name_line= rulePackage_name_line EOF )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3490:2: iv_rulePackage_name_line= rulePackage_name_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_lineRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line7022);
            iv_rulePackage_name_line=rulePackage_name_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name_line.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_line7033); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3497:1: rulePackage_name_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3500:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3501:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3501:1: (kw= '.' this_ID_1= RULE_ID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==40) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3502:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_rulePackage_name_line7071); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_line7086); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
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

    // $ANTLR start synpred66_InternalMyJava
    public final void synpred66_InternalMyJava_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_increment_0_0 = null;

        EObject lv_expressionLine_1_0 = null;


        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:2: ( ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:2: ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:2: ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:3: ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2347:3: ( (lv_increment_0_0= ruleINCREMENT ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2348:1: (lv_increment_0_0= ruleINCREMENT )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2348:1: (lv_increment_0_0= ruleINCREMENT )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2349:3: lv_increment_0_0= ruleINCREMENT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getIncrementINCREMENTParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleINCREMENT_in_synpred66_InternalMyJava4463);
        lv_increment_0_0=ruleINCREMENT();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2365:2: ( (lv_expressionLine_1_0= ruleExpression_line ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2366:1: (lv_expressionLine_1_0= ruleExpression_line )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2366:1: (lv_expressionLine_1_0= ruleExpression_line )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2367:3: lv_expressionLine_1_0= ruleExpression_line
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getExpressionLineExpression_lineParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_line_in_synpred66_InternalMyJava4484);
        lv_expressionLine_1_0=ruleExpression_line();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalMyJava

    // $ANTLR start synpred67_InternalMyJava
    public final void synpred67_InternalMyJava_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expressionLine_4_0 = null;


        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:6: ( ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:6: ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:6: ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:7: ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2384:7: ( (lv_op_2_0= ruleOP ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2385:1: (lv_op_2_0= ruleOP )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2385:1: (lv_op_2_0= ruleOP )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2386:3: lv_op_2_0= ruleOP
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getOpOPParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOP_in_synpred67_InternalMyJava4513);
        lv_op_2_0=ruleOP();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2402:2: ( (lv_expression_3_0= ruleExpression ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2403:1: (lv_expression_3_0= ruleExpression )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2403:1: (lv_expression_3_0= ruleExpression )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2404:3: lv_expression_3_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred67_InternalMyJava4534);
        lv_expression_3_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2420:2: ( (lv_expressionLine_4_0= ruleExpression_line ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2421:1: (lv_expressionLine_4_0= ruleExpression_line )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2421:1: (lv_expressionLine_4_0= ruleExpression_line )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2422:3: lv_expressionLine_4_0= ruleExpression_line
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumeric_Expression_lineAccess().getExpressionLineExpression_lineParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_line_in_synpred67_InternalMyJava4555);
        lv_expressionLine_4_0=ruleExpression_line();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred67_InternalMyJava

    // $ANTLR start synpred79_InternalMyJava
    public final void synpred79_InternalMyJava_fragment() throws RecognitionException {   
        Token lv_lParen_0_0=null;
        Token lv_rparent_1_0=null;
        EObject lv_expression_2_0 = null;


        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:2: ( ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:2: ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:2: ( ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:3: ( (lv_lParen_0_0= RULE_LPAREN ) ) ( (lv_rparent_1_0= RULE_RPAREN ) ) ( (lv_expression_2_0= ruleExpression_line ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2635:3: ( (lv_lParen_0_0= RULE_LPAREN ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2636:1: (lv_lParen_0_0= RULE_LPAREN )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2636:1: (lv_lParen_0_0= RULE_LPAREN )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2637:3: lv_lParen_0_0= RULE_LPAREN
        {
        lv_lParen_0_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred79_InternalMyJava5177); if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2653:2: ( (lv_rparent_1_0= RULE_RPAREN ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2654:1: (lv_rparent_1_0= RULE_RPAREN )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2654:1: (lv_rparent_1_0= RULE_RPAREN )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2655:3: lv_rparent_1_0= RULE_RPAREN
        {
        lv_rparent_1_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_synpred79_InternalMyJava5199); if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2671:2: ( (lv_expression_2_0= ruleExpression_line ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2672:1: (lv_expression_2_0= ruleExpression_line )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2672:1: (lv_expression_2_0= ruleExpression_line )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:2673:3: lv_expression_2_0= ruleExpression_line
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_lineAccess().getExpressionExpression_lineParserRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_line_in_synpred79_InternalMyJava5225);
        lv_expression_2_0=ruleExpression_line();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred79_InternalMyJava

    // $ANTLR start synpred85_InternalMyJava
    public final void synpred85_InternalMyJava_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_elseStatement_4_0 = null;


        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:3: ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:3: ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:3: ( ( 'else' )=>otherlv_3= 'else' )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3094:4: ( 'else' )=>otherlv_3= 'else'
        {
        otherlv_3=(Token)match(input,61,FOLLOW_61_in_synpred85_InternalMyJava6097); if (state.failed) return ;

        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3099:2: ( (lv_elseStatement_4_0= ruleStatement ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3100:1: (lv_elseStatement_4_0= ruleStatement )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3100:1: (lv_elseStatement_4_0= ruleStatement )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3101:3: lv_elseStatement_4_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred85_InternalMyJava6119);
        lv_elseStatement_4_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred85_InternalMyJava

    // $ANTLR start synpred87_InternalMyJava
    public final void synpred87_InternalMyJava_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token lv_lParen_3_0=null;
        Token lv_rparent_5_0=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_catchStatement_6_0 = null;


        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:3: ( ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:3: ( ( 'catch' )=>otherlv_2= 'catch' ) ( (lv_lParen_3_0= RULE_LPAREN ) ) ( (lv_parameters_4_0= ruleParameter ) ) ( (lv_rparent_5_0= RULE_RPAREN ) ) ( (lv_catchStatement_6_0= ruleStatement ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:3: ( ( 'catch' )=>otherlv_2= 'catch' )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3160:4: ( 'catch' )=>otherlv_2= 'catch'
        {
        otherlv_2=(Token)match(input,63,FOLLOW_63_in_synpred87_InternalMyJava6246); if (state.failed) return ;

        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3165:2: ( (lv_lParen_3_0= RULE_LPAREN ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3166:1: (lv_lParen_3_0= RULE_LPAREN )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3166:1: (lv_lParen_3_0= RULE_LPAREN )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3167:3: lv_lParen_3_0= RULE_LPAREN
        {
        lv_lParen_3_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred87_InternalMyJava6264); if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3183:2: ( (lv_parameters_4_0= ruleParameter ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3184:1: (lv_parameters_4_0= ruleParameter )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3184:1: (lv_parameters_4_0= ruleParameter )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3185:3: lv_parameters_4_0= ruleParameter
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleParameter_in_synpred87_InternalMyJava6290);
        lv_parameters_4_0=ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3201:2: ( (lv_rparent_5_0= RULE_RPAREN ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3202:1: (lv_rparent_5_0= RULE_RPAREN )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3202:1: (lv_rparent_5_0= RULE_RPAREN )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3203:3: lv_rparent_5_0= RULE_RPAREN
        {
        lv_rparent_5_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_synpred87_InternalMyJava6307); if (state.failed) return ;

        }


        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3219:2: ( (lv_catchStatement_6_0= ruleStatement ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3220:1: (lv_catchStatement_6_0= ruleStatement )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3220:1: (lv_catchStatement_6_0= ruleStatement )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3221:3: lv_catchStatement_6_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getCatchStatementStatementParserRuleCall_2_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred87_InternalMyJava6333);
        lv_catchStatement_6_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred87_InternalMyJava

    // $ANTLR start synpred89_InternalMyJava
    public final void synpred89_InternalMyJava_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        EObject lv_finallyStatement_8_0 = null;


        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:5: ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:5: ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_finallyStatement_8_0= ruleStatement ) )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:5: ( ( 'finally' )=>otherlv_7= 'finally' )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3237:6: ( 'finally' )=>otherlv_7= 'finally'
        {
        otherlv_7=(Token)match(input,64,FOLLOW_64_in_synpred89_InternalMyJava6356); if (state.failed) return ;

        }

        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3242:2: ( (lv_finallyStatement_8_0= ruleStatement ) )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3243:1: (lv_finallyStatement_8_0= ruleStatement )
        {
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3243:1: (lv_finallyStatement_8_0= ruleStatement )
        // ../org.xtext.example.myJava/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyJava.g:3244:3: lv_finallyStatement_8_0= ruleStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTry_statementAccess().getFinallyStatementStatementParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStatement_in_synpred89_InternalMyJava6378);
        lv_finallyStatement_8_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred89_InternalMyJava

    // Delegated rules

    public final boolean synpred89_InternalMyJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalMyJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalMyJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalMyJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalMyJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalMyJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalMyJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalMyJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalMyJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalMyJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalMyJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalMyJava_fragment(); // can never throw exception
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
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\3\10\2\uffff";
    static final String DFA5_maxS =
        "\3\26\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\7\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\7\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\7\uffff\1\4\4\uffff\1\3",
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
            return "218:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\24\uffff";
    static final String DFA15_eofS =
        "\24\uffff";
    static final String DFA15_minS =
        "\14\5\1\31\1\6\1\uffff\2\5\2\uffff\1\5";
    static final String DFA15_maxS =
        "\3\41\10\30\1\50\1\31\1\30\1\uffff\1\5\1\30\2\uffff\1\50";
    static final String DFA15_acceptS =
        "\16\uffff\1\2\2\uffff\1\1\1\3\1\uffff";
    static final String DFA15_specialS =
        "\24\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\13\2\uffff\1\1\1\2\20\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
            "\1\12",
            "\1\13\2\uffff\1\1\1\2\20\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12",
            "\1\13\2\uffff\1\1\1\2\20\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12",
            "\1\15\22\uffff\1\14",
            "\1\15\22\uffff\1\14",
            "\1\15\22\uffff\1\14",
            "\1\15\22\uffff\1\14",
            "\1\15\22\uffff\1\14",
            "\1\15\22\uffff\1\14",
            "\1\15\22\uffff\1\14",
            "\1\15\22\uffff\1\14",
            "\1\15\1\16\21\uffff\1\14\17\uffff\1\17",
            "\1\20",
            "\1\22\11\uffff\1\21\2\uffff\1\21\4\uffff\1\21",
            "",
            "\1\23",
            "\1\15\22\uffff\1\14",
            "",
            "",
            "\1\15\22\uffff\1\14\17\uffff\1\17"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "564:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String DFA34_eotS =
        "\22\uffff";
    static final String DFA34_eofS =
        "\22\uffff";
    static final String DFA34_minS =
        "\1\5\1\uffff\1\5\17\uffff";
    static final String DFA34_maxS =
        "\1\76\1\uffff\1\50\17\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\16\1\17\1\20\1\15";
    static final String DFA34_specialS =
        "\22\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\1\3\1\uffff\2\1\1\3\5\uffff\1\20\2\uffff\1\3\1\14\3\uffff"+
            "\1\3\1\uffff\10\1\1\11\1\12\1\13\1\uffff\1\16\1\17\6\3\10\uffff"+
            "\1\10\2\uffff\1\7\1\6\1\5\1\4\1\uffff\1\15",
            "",
            "\1\1\1\3\11\uffff\1\3\7\uffff\1\1\14\uffff\1\21\2\uffff\1"+
            "\1",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1523:1: ( ( (lv_variableDeclaration_0_0= ruleVariable_declaration ) ) | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) ( (lv_g_2_0= ';' ) ) ) | ( (lv_ifStatement_3_0= ruleIf_statement ) ) | ( (lv_doStatement_4_0= ruleDo_Statement ) ) | ( (lv_whileStatement_5_0= ruleWhile_Statement ) ) | ( (lv_forStatement_6_0= ruleFor_Statement ) ) | ( (lv_switchStatement_7_0= ruleSwitch_statement ) ) | (otherlv_8= 'synchronized(' ( (lv_rparent_9_0= RULE_RPAREN ) ) ( (lv_syncStatement_10_0= ruleStatement ) ) ) | ( () otherlv_12= 'return' otherlv_13= ';' ) | ( () otherlv_15= 'throw' otherlv_16= ';' ) | this_Statement_block_17= ruleStatement_block | ( (lv_tryStatement_18_0= ruleTry_statement ) ) | ( ( (lv_nameStatement_19_0= RULE_ID ) ) otherlv_20= ':' ( (lv_statement_21_0= ruleStatement ) ) ) | ( () otherlv_23= 'break' ( (lv_name_24_0= RULE_ID ) )? otherlv_25= ';' ) | ( () otherlv_27= 'continue' ( (lv_name_28_0= RULE_ID ) )? otherlv_29= ';' ) | ( () otherlv_31= ';' ) )";
        }
    }
    static final String DFA36_eotS =
        "\20\uffff";
    static final String DFA36_eofS =
        "\1\15\17\uffff";
    static final String DFA36_minS =
        "\1\6\14\0\3\uffff";
    static final String DFA36_maxS =
        "\1\65\14\0\3\uffff";
    static final String DFA36_acceptS =
        "\15\uffff\1\3\1\1\1\2";
    static final String DFA36_specialS =
        "\1\uffff\1\5\1\13\1\11\1\2\1\6\1\3\1\0\1\12\1\7\1\4\1\1\1\10\3"+
        "\uffff}>";
    static final String[] DFA36_transitionS = {
            "\2\15\2\uffff\1\4\1\3\4\uffff\1\15\10\uffff\1\15\22\uffff\1"+
            "\1\1\2\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
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
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2347:1: ( ( ( (lv_increment_0_0= ruleINCREMENT ) ) ( (lv_expressionLine_1_0= ruleExpression_line ) ) ) | ( ( (lv_op_2_0= ruleOP ) ) ( (lv_expression_3_0= ruleExpression ) ) ( (lv_expressionLine_4_0= ruleExpression_line ) ) ) | () )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_11 = input.LA(1);

                         
                        int index36_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalMyJava()) ) {s = 14;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_12 = input.LA(1);

                         
                        int index36_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalMyJava()) ) {s = 15;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalMyJava()) ) {s = 14;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\6\uffff";
    static final String DFA46_eofS =
        "\6\uffff";
    static final String DFA46_minS =
        "\1\5\1\20\1\5\2\uffff\1\20";
    static final String DFA46_maxS =
        "\1\5\1\102\1\5\2\uffff\1\102";
    static final String DFA46_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA46_specialS =
        "\6\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1",
            "\1\4\27\uffff\1\2\31\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\4\27\uffff\1\2\31\uffff\1\3"
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
            return "3285:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleModel136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit227 = new BitSet(new long[]{0x0000000000420312L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit249 = new BitSet(new long[]{0x0000000000420312L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_ruleCompilation_unit271 = new BitSet(new long[]{0x0000000000420312L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration360 = new BitSet(new long[]{0x0000000000420310L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_ruleType_declaration388 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_ruleType_declaration415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleType_declaration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterface_declaration520 = new BitSet(new long[]{0x0000000000020300L});
    public static final BitSet FOLLOW_17_in_ruleInterface_declaration533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface_declaration550 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleInterface_declaration568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration589 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleInterface_declaration602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration623 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleInterface_declaration639 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInterface_declaration651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClass_declaration743 = new BitSet(new long[]{0x0000000000400300L});
    public static final BitSet FOLLOW_22_in_ruleClass_declaration756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_declaration773 = new BitSet(new long[]{0x0000000000940000L});
    public static final BitSet FOLLOW_18_in_ruleClass_declaration791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleClass_declaration812 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleClass_declaration827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration848 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleClass_declaration861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration882 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleClass_declaration898 = new BitSet(new long[]{0x00000003FC210330L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleClass_declaration919 = new BitSet(new long[]{0x00000003FC210330L});
    public static final BitSet FOLLOW_21_in_ruleClass_declaration932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1021 = new BitSet(new long[]{0x00000003FC000330L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleField_declaration1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_ruleField_declaration1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_ruleField_declaration1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleField_declaration1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethod_declaration1242 = new BitSet(new long[]{0x00000003FC000320L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod_declaration1264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_declaration1281 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMethod_declaration1303 = new BitSet(new long[]{0x00000003FC0003A0L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleMethod_declaration1329 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMethod_declaration1347 = new BitSet(new long[]{0x0000000001110000L});
    public static final BitSet FOLLOW_24_in_ruleMethod_declaration1365 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMethod_declaration1377 = new BitSet(new long[]{0x0000000001110000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleMethod_declaration1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMethod_declaration1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConstructor_declaration1531 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor_declaration1549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleConstructor_declaration1571 = new BitSet(new long[]{0x00000003FC0003A0L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1597 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleConstructor_declaration1615 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list1677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1733 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParameter_list1746 = new BitSet(new long[]{0x00000003FC000320L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1767 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1878 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleParameter1896 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleParameter1908 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleVariable_declaration2002 = new BitSet(new long[]{0x00000003FC000320L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable_declaration2024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2045 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleVariable_declaration2058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2079 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleVariable_declaration2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable_declarator2181 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleVariable_declarator2199 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable_declarator2211 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleType2305 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleType2318 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleType2330 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier2369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType_specifier2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType_specifier2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleType_specifier2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleType_specifier2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleType_specifier2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType_specifier2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType_specifier2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType_specifier2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleType_specifier2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_ruleModifier2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleModifier2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleStatic_initializer2799 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatic_initializer2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block2861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStatement_block2920 = new BitSet(new long[]{0x5E403FDFFD390760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement_block2941 = new BitSet(new long[]{0x5E403FDFFD390760L});
    public static final BitSet FOLLOW_21_in_ruleStatement_block2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleStatement3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement3074 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_ruleStatement3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_ruleStatement3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_ruleStatement3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_ruleStatement3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_statement_in_ruleStatement3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStatement3260 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleStatement3277 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatement3335 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStatement3379 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatement3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_ruleStatement3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3473 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleStatement3490 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStatement3543 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3560 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStatement3610 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3627 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStatement3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_in_ruleExpression3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleExpression3794 = new BitSet(new long[]{0x00003F0001080460L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3820 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleExpression3837 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExpression3883 = new BitSet(new long[]{0x00003F0001080460L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3904 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExpression3916 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpression3957 = new BitSet(new long[]{0x00003F0001080460L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3978 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExpression4019 = new BitSet(new long[]{0x00003F0001080460L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4040 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression4086 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExpression4132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleExpression4173 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleExpression4214 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_in_entryRuleNumeric_Expression4272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeric_Expression4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARYOP_in_ruleNumeric_Expression4328 = new BitSet(new long[]{0x00003F0001080460L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNumeric_Expression4349 = new BitSet(new long[]{0x003FF00000000C00L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_line_in_ruleNumeric_Expression4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumeric_Expression_line_in_entryRuleNumeric_Expression_line4406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumeric_Expression_line4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINCREMENT_in_ruleNumeric_Expression_line4463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleNumeric_Expression_line4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOP_in_ruleNumeric_Expression_line4513 = new BitSet(new long[]{0x00003F0001080460L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNumeric_Expression_line4534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleNumeric_Expression_line4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARYOP_in_entryRuleUNARYOP4611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNARYOP4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleUNARYOP4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINCREMENT_in_ruleUNARYOP4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINCREMENT_in_entryRuleINCREMENT4741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINCREMENT4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleINCREMENT4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleINCREMENT4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOP_in_entryRuleOP4850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOP4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOP4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOP4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOP4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOP4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOP4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOP5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOP5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOP5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOP5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOP5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_line_in_entryRuleExpression_line5124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_line5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleExpression_line5177 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleExpression_line5199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression_line5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement5282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch_statement5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSwitch_statement5341 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSwitch_statement5358 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSwitch_statement5380 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSwitch_statement5397 = new BitSet(new long[]{0x5FC03FDFFD390760L});
    public static final BitSet FOLLOW_55_in_ruleSwitch_statement5411 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSwitch_statement5423 = new BitSet(new long[]{0x5FC03FDFFD390760L});
    public static final BitSet FOLLOW_56_in_ruleSwitch_statement5442 = new BitSet(new long[]{0x5FC03FDFFD390760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitch_statement5469 = new BitSet(new long[]{0x5FC03FDFFD390760L});
    public static final BitSet FOLLOW_21_in_ruleSwitch_statement5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement5519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor_Statement5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFor_Statement5566 = new BitSet(new long[]{0x00000003FC010320L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleFor_Statement5588 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFor_Statement5606 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFor_Statement5619 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFor_Statement5631 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFor_Statement5648 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor_Statement5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement5710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleWhile_Statement5757 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleWhile_Statement5774 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile_Statement5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement5836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDo_Statement5883 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo_Statement5904 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleDo_Statement5916 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleDo_Statement5933 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDo_Statement5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_entryRuleIf_statement5986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_statement5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIf_statement6033 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIf_statement6050 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_statement6076 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIf_statement6097 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_statement6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement6157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTry_statement6204 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement6225 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleTry_statement6246 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleTry_statement6264 = new BitSet(new long[]{0x00000003FC000320L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTry_statement6290 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleTry_statement6307 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement6333 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleTry_statement6356 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement6416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleImport_statement6463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement6486 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImport_statement6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement6527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleImport_statement6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name6578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name6680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name6737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement6781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePackage_statement6828 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement6849 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePackage_statement6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name6949 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rulePackage_name6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line7022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_line7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePackage_name_line7071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_line7086 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleINCREMENT_in_synpred66_InternalMyJava4463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_synpred66_InternalMyJava4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOP_in_synpred67_InternalMyJava4513 = new BitSet(new long[]{0x00003F0001080460L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred67_InternalMyJava4534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_synpred67_InternalMyJava4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred79_InternalMyJava5177 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_synpred79_InternalMyJava5199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleExpression_line_in_synpred79_InternalMyJava5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred85_InternalMyJava6097 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred85_InternalMyJava6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_synpred87_InternalMyJava6246 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred87_InternalMyJava6264 = new BitSet(new long[]{0x00000003FC000320L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred87_InternalMyJava6290 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_synpred87_InternalMyJava6307 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred87_InternalMyJava6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred89_InternalMyJava6356 = new BitSet(new long[]{0x5E403FDFFD190760L});
    public static final BitSet FOLLOW_ruleStatement_in_synpred89_InternalMyJava6378 = new BitSet(new long[]{0x0000000000000002L});

}