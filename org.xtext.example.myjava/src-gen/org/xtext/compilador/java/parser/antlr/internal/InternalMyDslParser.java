package org.xtext.compilador.java.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.compilador.java.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_ID", "RULE_MOD", "RULE_STATIC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'interface'", "'extends'", "','", "'{'", "'}'", "'class'", "'implements'", "'('", "')'", "'[]'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'synchronized('", "'return'", "'throw'", "':'", "'break'", "'continue'", "'['", "']'", "'.'", "'null'", "'super'", "'this'", "'instanceof'", "'for('", "';)'", "'switch('", "'){'", "'case'", "'default:'", "'while('", "'do'", "');'", "'if('", "'else'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_DOC_COMMENT=4;
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
    public static final int RULE_STATIC=7;
    public static final int EOF=-1;
    public static final int RULE_MOD=6;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleCompilation_unit ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_greetings_0_0= ruleCompilation_unit ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= ruleCompilation_unit ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= ruleCompilation_unit )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= ruleCompilation_unit )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:82:3: lv_greetings_0_0= ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_ruleModel130);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleCompilation_unit returns [EObject current=null] : iv_ruleCompilation_unit= ruleCompilation_unit EOF ;
    public final EObject entryRuleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilation_unit = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleCompilation_unit= ruleCompilation_unit EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleCompilation_unit= ruleCompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165);
            iv_ruleCompilation_unit=ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompilation_unit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit175); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:115:1: ruleCompilation_unit returns [EObject current=null] : ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_typeDeclarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:118:28: ( ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:1: ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:1: ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:2: ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclarations_2_0= ruleType_declaration ) )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:2: ( (lv_name_0_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==59) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_name_0_0= rulePackage_statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_name_0_0= rulePackage_statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:121:3: lv_name_0_0= rulePackage_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_statement_in_ruleCompilation_unit221);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:137:3: ( (lv_imports_1_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==57) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:138:1: (lv_imports_1_0= ruleImport_statement )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:138:1: (lv_imports_1_0= ruleImport_statement )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:139:3: lv_imports_1_0= ruleImport_statement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_statement_in_ruleCompilation_unit243);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:155:3: ( (lv_typeDeclarations_2_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC_COMMENT||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==12||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:156:1: (lv_typeDeclarations_2_0= ruleType_declaration )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:156:1: (lv_typeDeclarations_2_0= ruleType_declaration )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:157:3: lv_typeDeclarations_2_0= ruleType_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_declaration_in_ruleCompilation_unit265);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:181:1: entryRuleType_declaration returns [EObject current=null] : iv_ruleType_declaration= ruleType_declaration EOF ;
    public final EObject entryRuleType_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_declaration = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:182:2: (iv_ruleType_declaration= ruleType_declaration EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:183:2: iv_ruleType_declaration= ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration302);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration312); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:190:1: ruleType_declaration returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleType_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_3=null;
        EObject lv_classDec_1_0 = null;

        EObject lv_interfaceDec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:193:28: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:194:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:194:1: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:194:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) ) otherlv_3= ';'
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:194:2: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DOC_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:195:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:195:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:196:3: lv_comment_0_0= RULE_DOC_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration354); if (state.failed) return current;
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:212:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:212:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:212:4: ( (lv_classDec_1_0= ruleClass_declaration ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:213:1: (lv_classDec_1_0= ruleClass_declaration )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:213:1: (lv_classDec_1_0= ruleClass_declaration )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:214:3: lv_classDec_1_0= ruleClass_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_declaration_in_ruleType_declaration382);
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:231:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:231:6: ( (lv_interfaceDec_2_0= ruleInterface_declaration ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:232:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:232:1: (lv_interfaceDec_2_0= ruleInterface_declaration )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:233:3: lv_interfaceDec_2_0= ruleInterface_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_declaration_in_ruleType_declaration409);
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

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleType_declaration422); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:261:1: entryRuleInterface_declaration returns [EObject current=null] : iv_ruleInterface_declaration= ruleInterface_declaration EOF ;
    public final EObject entryRuleInterface_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_declaration = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:262:2: (iv_ruleInterface_declaration= ruleInterface_declaration EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:263:2: iv_ruleInterface_declaration= ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration458);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration468); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:270:1: ruleInterface_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) ;
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
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:273:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:274:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:274:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:274:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'interface' ( (lv_interfaceName_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )? otherlv_7= '{' otherlv_8= '}'
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:274:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_MOD && LA6_0<=RULE_STATIC)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:276:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterface_declaration514);
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInterface_declaration527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:296:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_interfaceName_2_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:298:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration544); if (state.failed) return current;
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:314:2: (otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:314:4: otherlv_3= 'extends' ( (lv_interfaceHerdada_4_0= ruleInterface_name ) ) (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleInterface_declaration562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:318:1: ( (lv_interfaceHerdada_4_0= ruleInterface_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:320:3: lv_interfaceHerdada_4_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration583);
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

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:336:2: (otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:336:4: otherlv_5= ',' ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInterface_declaration596); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:340:1: ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:342:3: lv_interfacesHerdadas_6_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration617);
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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInterface_declaration633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInterface_declaration645); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:374:1: entryRuleClass_declaration returns [EObject current=null] : iv_ruleClass_declaration= ruleClass_declaration EOF ;
    public final EObject entryRuleClass_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_declaration = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:375:2: (iv_ruleClass_declaration= ruleClass_declaration EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:376:2: iv_ruleClass_declaration= ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration681);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration691); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:383:1: ruleClass_declaration returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' ) ;
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
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:386:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:387:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:387:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:387:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'class' ( (lv_className_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )? (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )? otherlv_9= '{' ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )* otherlv_11= '}'
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:387:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_MOD && LA9_0<=RULE_STATIC)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:388:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:388:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:389:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClass_declaration737);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleClass_declaration750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:409:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_className_2_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:411:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration767); if (state.failed) return current;
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:427:2: (otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:427:4: otherlv_3= 'extends' ( (lv_classHerdada_4_0= ruleClass_name ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClass_declaration785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:431:1: ( (lv_classHerdada_4_0= ruleClass_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_classHerdada_4_0= ruleClass_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_classHerdada_4_0= ruleClass_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:433:3: lv_classHerdada_4_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration806);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:449:4: (otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:449:6: otherlv_5= 'implements' ( (lv_interfaceImplementada_6_0= ruleInterface_name ) ) (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleClass_declaration821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:453:1: ( (lv_interfaceImplementada_6_0= ruleInterface_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:454:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:454:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:455:3: lv_interfaceImplementada_6_0= ruleInterface_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration842);
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

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:471:2: (otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:471:4: otherlv_7= ',' ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleClass_declaration855); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:475:1: ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:476:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:476:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:477:3: lv_interfacesImplementadas_8_0= ruleInterface_name
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration876);
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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleClass_declaration892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:497:1: ( (lv_fieldsDeclaration_10_0= ruleField_declaration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_DOC_COMMENT && LA13_0<=RULE_STATIC)||LA13_0==11||(LA13_0>=22 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:498:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:498:1: (lv_fieldsDeclaration_10_0= ruleField_declaration )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:499:3: lv_fieldsDeclaration_10_0= ruleField_declaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration913);
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

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleClass_declaration926); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:527:1: entryRuleField_declaration returns [EObject current=null] : iv_ruleField_declaration= ruleField_declaration EOF ;
    public final EObject entryRuleField_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_declaration = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:528:2: (iv_ruleField_declaration= ruleField_declaration EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:529:2: iv_ruleField_declaration= ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration962);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration972); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:536:1: ruleField_declaration returns [EObject current=null] : ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) ) ;
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
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:539:28: ( ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:540:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:540:1: ( ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) ) | ( (lv_staticinitializer_4_0= ruleStatic_initializer ) ) | ( () otherlv_6= ';' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_DOC_COMMENT:
            case RULE_ID:
            case RULE_MOD:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt16=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA16_2 = input.LA(2);

                if ( ((LA16_2>=RULE_ID && LA16_2<=RULE_STATIC)||(LA16_2>=22 && LA16_2<=29)) ) {
                    alt16=1;
                }
                else if ( (LA16_2==15) ) {
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
            case 11:
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:540:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:540:2: ( ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:540:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )? ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:540:3: ( (lv_comment_0_0= RULE_DOC_COMMENT ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_DOC_COMMENT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:541:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:541:1: (lv_comment_0_0= RULE_DOC_COMMENT )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:542:3: lv_comment_0_0= RULE_DOC_COMMENT
                            {
                            lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1015); if (state.failed) return current;
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

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:558:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )
                    int alt15=3;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:558:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:558:4: ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:559:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:559:1: (lv_variableDeclaration_1_0= ruleVariable_declaration )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:560:3: lv_variableDeclaration_1_0= ruleVariable_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1043);
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
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:577:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:577:6: ( (lv_contructorName_2_0= ruleConstructor_declaration ) )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:578:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:578:1: (lv_contructorName_2_0= ruleConstructor_declaration )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:579:3: lv_contructorName_2_0= ruleConstructor_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1070);
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
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:596:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:596:6: ( (lv_methodName_3_0= ruleMethod_declaration ) )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:597:1: (lv_methodName_3_0= ruleMethod_declaration )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:597:1: (lv_methodName_3_0= ruleMethod_declaration )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:598:3: lv_methodName_3_0= ruleMethod_declaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1097);
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:615:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:615:6: ( (lv_staticinitializer_4_0= ruleStatic_initializer ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:616:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:616:1: (lv_staticinitializer_4_0= ruleStatic_initializer )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:617:3: lv_staticinitializer_4_0= ruleStatic_initializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1126);
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:634:6: ( () otherlv_6= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:634:6: ( () otherlv_6= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:634:7: () otherlv_6= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:634:7: ()
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:635:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getField_declarationAccess().getField_declarationAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleField_declaration1154); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:652:1: entryRuleMethod_declaration returns [EObject current=null] : iv_ruleMethod_declaration= ruleMethod_declaration EOF ;
    public final EObject entryRuleMethod_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod_declaration = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:653:2: (iv_ruleMethod_declaration= ruleMethod_declaration EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:654:2: iv_ruleMethod_declaration= ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1191);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1201); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:661:1: ruleMethod_declaration returns [EObject current=null] : ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statementMethod_7_0= ruleStatement_block ) ) | otherlv_8= ';' ) ) ;
    public final EObject ruleMethod_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nameMethod_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_modifiersMethod_0_0 = null;

        EObject lv_typeMethod_1_0 = null;

        EObject lv_parameterListMethod_4_0 = null;

        EObject lv_statementMethod_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:664:28: ( ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statementMethod_7_0= ruleStatement_block ) ) | otherlv_8= ';' ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:665:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statementMethod_7_0= ruleStatement_block ) ) | otherlv_8= ';' ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:665:1: ( ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statementMethod_7_0= ruleStatement_block ) ) | otherlv_8= ';' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:665:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )* ( (lv_typeMethod_1_0= ruleType ) ) ( (lv_nameMethod_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameterListMethod_4_0= ruleParameter_list ) )? otherlv_5= ')' (otherlv_6= '[]' )* ( ( (lv_statementMethod_7_0= ruleStatement_block ) ) | otherlv_8= ';' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:665:2: ( (lv_modifiersMethod_0_0= ruleModifier ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:666:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:666:1: (lv_modifiersMethod_0_0= ruleModifier )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:667:3: lv_modifiersMethod_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethod_declaration1247);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:683:3: ( (lv_typeMethod_1_0= ruleType ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:684:1: (lv_typeMethod_1_0= ruleType )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:684:1: (lv_typeMethod_1_0= ruleType )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:685:3: lv_typeMethod_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1269);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:701:2: ( (lv_nameMethod_2_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:702:1: (lv_nameMethod_2_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:702:1: (lv_nameMethod_2_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:703:3: lv_nameMethod_2_0= RULE_ID
            {
            lv_nameMethod_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1286); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMethod_declaration1303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:723:1: ( (lv_parameterListMethod_4_0= ruleParameter_list ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=22 && LA18_0<=29)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:724:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:724:1: (lv_parameterListMethod_4_0= ruleParameter_list )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:725:3: lv_parameterListMethod_4_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleMethod_declaration1324);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleMethod_declaration1337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:745:1: (otherlv_6= '[]' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:745:3: otherlv_6= '[]'
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleMethod_declaration1350); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:749:3: ( ( (lv_statementMethod_7_0= ruleStatement_block ) ) | otherlv_8= ';' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            else if ( (LA20_0==11) ) {
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:749:4: ( (lv_statementMethod_7_0= ruleStatement_block ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:749:4: ( (lv_statementMethod_7_0= ruleStatement_block ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:750:1: (lv_statementMethod_7_0= ruleStatement_block )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:750:1: (lv_statementMethod_7_0= ruleStatement_block )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:751:3: lv_statementMethod_7_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1374);
                    lv_statementMethod_7_0=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethod_declarationRule());
                      	        }
                             		set(
                             			current, 
                             			"statementMethod",
                              		lv_statementMethod_7_0, 
                              		"Statement_block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:768:7: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleMethod_declaration1392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_7_1());
                          
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:780:1: entryRuleConstructor_declaration returns [EObject current=null] : iv_ruleConstructor_declaration= ruleConstructor_declaration EOF ;
    public final EObject entryRuleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor_declaration = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:781:2: (iv_ruleConstructor_declaration= ruleConstructor_declaration EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:782:2: iv_ruleConstructor_declaration= ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1429);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1439); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:789:1: ruleConstructor_declaration returns [EObject current=null] : ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) ;
    public final EObject ruleConstructor_declaration() throws RecognitionException {
        EObject current = null;

        Token lv_nameConstructor_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_modifiersConstructor_0_0 = null;

        EObject lv_parameterListConstructor_3_0 = null;

        EObject lv_statementConstructor_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:792:28: ( ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statementConstructor_5_0= ruleStatement_block ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:793:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:793:1: ( ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statementConstructor_5_0= ruleStatement_block ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:793:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )* ( (lv_nameConstructor_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )? otherlv_4= ')' ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:793:2: ( (lv_modifiersConstructor_0_0= ruleModifier ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_MOD && LA21_0<=RULE_STATIC)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:794:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:794:1: (lv_modifiersConstructor_0_0= ruleModifier )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:795:3: lv_modifiersConstructor_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructor_declaration1485);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:811:3: ( (lv_nameConstructor_1_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:812:1: (lv_nameConstructor_1_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:812:1: (lv_nameConstructor_1_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:813:3: lv_nameConstructor_1_0= RULE_ID
            {
            lv_nameConstructor_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1503); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleConstructor_declaration1520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:833:1: ( (lv_parameterListConstructor_3_0= ruleParameter_list ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=22 && LA22_0<=29)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_parameterListConstructor_3_0= ruleParameter_list )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:835:3: lv_parameterListConstructor_3_0= ruleParameter_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1541);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConstructor_declaration1554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:855:1: ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_statementConstructor_5_0= ruleStatement_block )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_statementConstructor_5_0= ruleStatement_block )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:857:3: lv_statementConstructor_5_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1575);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:881:1: entryRuleParameter_list returns [EObject current=null] : iv_ruleParameter_list= ruleParameter_list EOF ;
    public final EObject entryRuleParameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter_list = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:882:2: (iv_ruleParameter_list= ruleParameter_list EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:883:2: iv_ruleParameter_list= ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1611);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1621); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:890:1: ruleParameter_list returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameter_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:893:28: ( ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:894:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:894:1: ( ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:894:2: ( (lv_parameter_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:894:2: ( (lv_parameter_0_0= ruleParameter ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_parameter_0_0= ruleParameter )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_parameter_0_0= ruleParameter )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:896:3: lv_parameter_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1667);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:912:2: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:912:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameter_list1680); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:916:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_parameters_2_0= ruleParameter )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:918:3: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1701);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:942:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:943:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:944:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1739);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1749); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:951:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[]' )* ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameterName_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:954:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[]' )* ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:955:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[]' )* )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:955:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[]' )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:955:2: ( (lv_type_0_0= ruleType ) ) ( (lv_parameterName_1_0= RULE_ID ) ) (otherlv_2= '[]' )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:955:2: ( (lv_type_0_0= ruleType ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:956:1: (lv_type_0_0= ruleType )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:956:1: (lv_type_0_0= ruleType )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:957:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter1795);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:973:2: ( (lv_parameterName_1_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:974:1: (lv_parameterName_1_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:974:1: (lv_parameterName_1_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:975:3: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1812); if (state.failed) return current;
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:991:2: (otherlv_2= '[]' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:991:4: otherlv_2= '[]'
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleParameter1830); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
            	          
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1003:1: entryRuleVariable_declaration returns [EObject current=null] : iv_ruleVariable_declaration= ruleVariable_declaration EOF ;
    public final EObject entryRuleVariable_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declaration = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1004:2: (iv_ruleVariable_declaration= ruleVariable_declaration EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1005:2: iv_ruleVariable_declaration= ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1868);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration1878); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1012:1: ruleVariable_declaration returns [EObject current=null] : ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) ;
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
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1015:28: ( ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1016:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1016:1: ( ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1016:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )* ( (lv_type_1_0= ruleType ) ) ( (lv_nameVariable_2_0= ruleVariable_declarator ) ) (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1016:2: ( (lv_modifiersVariable_0_0= ruleModifier ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_MOD && LA25_0<=RULE_STATIC)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1017:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1017:1: (lv_modifiersVariable_0_0= ruleModifier )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1018:3: lv_modifiersVariable_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariable_declaration1924);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1034:3: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1035:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1035:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1036:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration1946);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1052:2: ( (lv_nameVariable_2_0= ruleVariable_declarator ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1053:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1053:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1054:3: lv_nameVariable_2_0= ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration1967);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1070:2: (otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1070:4: otherlv_3= ',' ( (lv_names_4_0= ruleVariable_declarator ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleVariable_declaration1980); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1074:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1076:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2001);
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

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleVariable_declaration2015); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1104:1: entryRuleVariable_declarator returns [EObject current=null] : iv_ruleVariable_declarator= ruleVariable_declarator EOF ;
    public final EObject entryRuleVariable_declarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_declarator = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1105:2: (iv_ruleVariable_declarator= ruleVariable_declarator EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1106:2: iv_ruleVariable_declarator= ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2051);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable_declarator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2061); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1113:1: ruleVariable_declarator returns [EObject current=null] : ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[]' )* ) ;
    public final EObject ruleVariable_declarator() throws RecognitionException {
        EObject current = null;

        Token lv_nameVariable_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1116:28: ( ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[]' )* ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1117:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[]' )* )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1117:1: ( ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[]' )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1117:2: ( (lv_nameVariable_0_0= RULE_ID ) ) (otherlv_1= '[]' )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1117:2: ( (lv_nameVariable_0_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1118:1: (lv_nameVariable_0_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1118:1: (lv_nameVariable_0_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1119:3: lv_nameVariable_0_0= RULE_ID
            {
            lv_nameVariable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2103); if (state.failed) return current;
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1135:2: (otherlv_1= '[]' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1135:4: otherlv_1= '[]'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVariable_declarator2121); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            	          
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1147:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1148:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1149:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType2159);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2169); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1156:1: ruleType returns [EObject current=null] : ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_typeSpecifier_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1159:28: ( ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1160:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1160:1: ( ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1160:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) ) (otherlv_1= '[]' )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1160:2: ( (lv_typeSpecifier_0_0= ruleType_specifier ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1161:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1161:1: (lv_typeSpecifier_0_0= ruleType_specifier )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1162:3: lv_typeSpecifier_0_0= ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType2215);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1178:2: (otherlv_1= '[]' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1178:4: otherlv_1= '[]'
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleType2228); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            	          
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1190:1: entryRuleType_specifier returns [String current=null] : iv_ruleType_specifier= ruleType_specifier EOF ;
    public final String entryRuleType_specifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType_specifier = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1191:2: (iv_ruleType_specifier= ruleType_specifier EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1192:2: iv_ruleType_specifier= ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier2267);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType_specifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier2278); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1199:1: ruleType_specifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) ;
    public final AntlrDatatypeRuleToken ruleType_specifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Class_name_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1202:28: ( (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1203:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1203:1: (kw= 'boolean' | kw= 'byte' | kw= 'char' | kw= 'short' | kw= 'int' | kw= 'float' | kw= 'long' | kw= 'double' | this_Class_name_8= ruleClass_name )
            int alt29=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt29=1;
                }
                break;
            case 23:
                {
                alt29=2;
                }
                break;
            case 24:
                {
                alt29=3;
                }
                break;
            case 25:
                {
                alt29=4;
                }
                break;
            case 26:
                {
                alt29=5;
                }
                break;
            case 27:
                {
                alt29=6;
                }
                break;
            case 28:
                {
                alt29=7;
                }
                break;
            case 29:
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1204:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleType_specifier2316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1211:2: kw= 'byte'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleType_specifier2335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1218:2: kw= 'char'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleType_specifier2354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1225:2: kw= 'short'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleType_specifier2373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1232:2: kw= 'int'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleType_specifier2392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1239:2: kw= 'float'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleType_specifier2411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1246:2: kw= 'long'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleType_specifier2430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1253:2: kw= 'double'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleType_specifier2449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1260:5: this_Class_name_8= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier2477);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1278:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1279:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1280:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier2523);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier2534); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1287:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MOD_0=null;
        Token this_STATIC_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1290:28: ( (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1291:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1291:1: (this_MOD_0= RULE_MOD | this_STATIC_1= RULE_STATIC )
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1291:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_ruleModifier2574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MOD_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1299:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleModifier2600); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1314:1: entryRuleStatic_initializer returns [EObject current=null] : iv_ruleStatic_initializer= ruleStatic_initializer EOF ;
    public final EObject entryRuleStatic_initializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatic_initializer = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1315:2: (iv_ruleStatic_initializer= ruleStatic_initializer EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1316:2: iv_ruleStatic_initializer= ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2645);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatic_initializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer2655); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1323:1: ruleStatic_initializer returns [EObject current=null] : ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) ;
    public final EObject ruleStatic_initializer() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1326:28: ( ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1327:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1327:1: ( ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1327:2: ( (lv_static_0_0= RULE_STATIC ) ) ( (lv_name_1_0= ruleStatement_block ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1327:2: ( (lv_static_0_0= RULE_STATIC ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1328:1: (lv_static_0_0= RULE_STATIC )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1328:1: (lv_static_0_0= RULE_STATIC )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1329:3: lv_static_0_0= RULE_STATIC
            {
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleStatic_initializer2697); if (state.failed) return current;
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1345:2: ( (lv_name_1_0= ruleStatement_block ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1346:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1346:1: (lv_name_1_0= ruleStatement_block )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1347:3: lv_name_1_0= ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer2723);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1371:1: entryRuleStatement_block returns [EObject current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final EObject entryRuleStatement_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_block = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1372:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1373:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block2759);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block2769); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1380:1: ruleStatement_block returns [EObject current=null] : (otherlv_0= '{' ( (lv_statments_1_0= ruleStatement ) )* otherlv_2= '}' ) ;
    public final EObject ruleStatement_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statments_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1383:28: ( (otherlv_0= '{' ( (lv_statments_1_0= ruleStatement ) )* otherlv_2= '}' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1384:1: (otherlv_0= '{' ( (lv_statments_1_0= ruleStatement ) )* otherlv_2= '}' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1384:1: (otherlv_0= '{' ( (lv_statments_1_0= ruleStatement ) )* otherlv_2= '}' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1384:3: otherlv_0= '{' ( (lv_statments_1_0= ruleStatement ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleStatement_block2806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1388:1: ( (lv_statments_1_0= ruleStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STATIC)||LA31_0==11||(LA31_0>=14 && LA31_0<=15)||LA31_0==19||(LA31_0>=22 && LA31_0<=32)||(LA31_0>=34 && LA31_0<=36)||(LA31_0>=38 && LA31_0<=43)||LA31_0==45||(LA31_0>=49 && LA31_0<=50)||LA31_0==52||LA31_0==54) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1389:1: (lv_statments_1_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1389:1: (lv_statments_1_0= ruleStatement )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1390:3: lv_statments_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement_block2827);
            	    lv_statments_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_blockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statments",
            	              		lv_statments_1_0, 
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleStatement_block2840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2());
                  
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1418:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1419:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1420:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2876);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2886); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1427:1: ruleStatement returns [EObject current=null] : (this_Statement_block_0= ruleStatement_block | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';' ) | this_Variable_declaration_3= ruleVariable_declaration | ( (lv_ifStatement_4_0= ruleIf_statement ) ) | ( (lv_doStatement_5_0= ruleDo_Statement ) ) | ( (lv_whileStatement_6_0= ruleWhile_Statement ) ) | ( (lv_forStatement_7_0= ruleFor_Statement ) ) | ( (lv_tryStatement_8_0= ruleTry_statement ) ) | ( (lv_switchStatement_9_0= ruleSwitch_statement ) ) | ( () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) ) ) | ( () otherlv_15= 'return' otherlv_16= ';' ) | ( () otherlv_18= 'throw' otherlv_19= ';' ) | ( ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_nameStatement_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token lv_name_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token lv_name_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        EObject this_Statement_block_0 = null;

        EObject lv_expressionStatement_1_0 = null;

        EObject this_Variable_declaration_3 = null;

        EObject lv_ifStatement_4_0 = null;

        EObject lv_doStatement_5_0 = null;

        EObject lv_whileStatement_6_0 = null;

        EObject lv_forStatement_7_0 = null;

        EObject lv_tryStatement_8_0 = null;

        EObject lv_switchStatement_9_0 = null;

        EObject lv_syncStatement_13_0 = null;

        EObject lv_statement_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1430:28: ( (this_Statement_block_0= ruleStatement_block | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';' ) | this_Variable_declaration_3= ruleVariable_declaration | ( (lv_ifStatement_4_0= ruleIf_statement ) ) | ( (lv_doStatement_5_0= ruleDo_Statement ) ) | ( (lv_whileStatement_6_0= ruleWhile_Statement ) ) | ( (lv_forStatement_7_0= ruleFor_Statement ) ) | ( (lv_tryStatement_8_0= ruleTry_statement ) ) | ( (lv_switchStatement_9_0= ruleSwitch_statement ) ) | ( () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) ) ) | ( () otherlv_15= 'return' otherlv_16= ';' ) | ( () otherlv_18= 'throw' otherlv_19= ';' ) | ( ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1431:1: (this_Statement_block_0= ruleStatement_block | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';' ) | this_Variable_declaration_3= ruleVariable_declaration | ( (lv_ifStatement_4_0= ruleIf_statement ) ) | ( (lv_doStatement_5_0= ruleDo_Statement ) ) | ( (lv_whileStatement_6_0= ruleWhile_Statement ) ) | ( (lv_forStatement_7_0= ruleFor_Statement ) ) | ( (lv_tryStatement_8_0= ruleTry_statement ) ) | ( (lv_switchStatement_9_0= ruleSwitch_statement ) ) | ( () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) ) ) | ( () otherlv_15= 'return' otherlv_16= ';' ) | ( () otherlv_18= 'throw' otherlv_19= ';' ) | ( ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1431:1: (this_Statement_block_0= ruleStatement_block | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';' ) | this_Variable_declaration_3= ruleVariable_declaration | ( (lv_ifStatement_4_0= ruleIf_statement ) ) | ( (lv_doStatement_5_0= ruleDo_Statement ) ) | ( (lv_whileStatement_6_0= ruleWhile_Statement ) ) | ( (lv_forStatement_7_0= ruleFor_Statement ) ) | ( (lv_tryStatement_8_0= ruleTry_statement ) ) | ( (lv_switchStatement_9_0= ruleSwitch_statement ) ) | ( () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) ) ) | ( () otherlv_15= 'return' otherlv_16= ';' ) | ( () otherlv_18= 'throw' otherlv_19= ';' ) | ( ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) )
            int alt34=16;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1432:5: this_Statement_block_0= ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleStatement2933);
                    this_Statement_block_0=ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_block_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1441:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1441:6: ( ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1441:7: ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1441:7: ( (lv_expressionStatement_1_0= ruleExpression ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1442:1: (lv_expressionStatement_1_0= ruleExpression )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1442:1: (lv_expressionStatement_1_0= ruleExpression )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1443:3: lv_expressionStatement_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement2960);
                    lv_expressionStatement_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionStatement",
                              		lv_expressionStatement_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleStatement2972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1465:5: this_Variable_declaration_3= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleStatement3001);
                    this_Variable_declaration_3=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_declaration_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1474:6: ( (lv_ifStatement_4_0= ruleIf_statement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1474:6: ( (lv_ifStatement_4_0= ruleIf_statement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1475:1: (lv_ifStatement_4_0= ruleIf_statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1475:1: (lv_ifStatement_4_0= ruleIf_statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1476:3: lv_ifStatement_4_0= ruleIf_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIf_statement_in_ruleStatement3027);
                    lv_ifStatement_4_0=ruleIf_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"ifStatement",
                              		lv_ifStatement_4_0, 
                              		"If_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1493:6: ( (lv_doStatement_5_0= ruleDo_Statement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1493:6: ( (lv_doStatement_5_0= ruleDo_Statement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1494:1: (lv_doStatement_5_0= ruleDo_Statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1494:1: (lv_doStatement_5_0= ruleDo_Statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1495:3: lv_doStatement_5_0= ruleDo_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDo_Statement_in_ruleStatement3054);
                    lv_doStatement_5_0=ruleDo_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"doStatement",
                              		lv_doStatement_5_0, 
                              		"Do_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1512:6: ( (lv_whileStatement_6_0= ruleWhile_Statement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1512:6: ( (lv_whileStatement_6_0= ruleWhile_Statement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1513:1: (lv_whileStatement_6_0= ruleWhile_Statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1513:1: (lv_whileStatement_6_0= ruleWhile_Statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1514:3: lv_whileStatement_6_0= ruleWhile_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhile_Statement_in_ruleStatement3081);
                    lv_whileStatement_6_0=ruleWhile_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whileStatement",
                              		lv_whileStatement_6_0, 
                              		"While_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1531:6: ( (lv_forStatement_7_0= ruleFor_Statement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1531:6: ( (lv_forStatement_7_0= ruleFor_Statement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1532:1: (lv_forStatement_7_0= ruleFor_Statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1532:1: (lv_forStatement_7_0= ruleFor_Statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1533:3: lv_forStatement_7_0= ruleFor_Statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getForStatementFor_StatementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFor_Statement_in_ruleStatement3108);
                    lv_forStatement_7_0=ruleFor_Statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"forStatement",
                              		lv_forStatement_7_0, 
                              		"For_Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1550:6: ( (lv_tryStatement_8_0= ruleTry_statement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1550:6: ( (lv_tryStatement_8_0= ruleTry_statement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1551:1: (lv_tryStatement_8_0= ruleTry_statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1551:1: (lv_tryStatement_8_0= ruleTry_statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1552:3: lv_tryStatement_8_0= ruleTry_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTry_statement_in_ruleStatement3135);
                    lv_tryStatement_8_0=ruleTry_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"tryStatement",
                              		lv_tryStatement_8_0, 
                              		"Try_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1569:6: ( (lv_switchStatement_9_0= ruleSwitch_statement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1569:6: ( (lv_switchStatement_9_0= ruleSwitch_statement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1570:1: (lv_switchStatement_9_0= ruleSwitch_statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1570:1: (lv_switchStatement_9_0= ruleSwitch_statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1571:3: lv_switchStatement_9_0= ruleSwitch_statement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementSwitch_statementParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitch_statement_in_ruleStatement3162);
                    lv_switchStatement_9_0=ruleSwitch_statement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"switchStatement",
                              		lv_switchStatement_9_0, 
                              		"Switch_statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1588:6: ( () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1588:6: ( () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1588:7: () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1588:7: ()
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1589:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleStatement3190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSynchronizedKeyword_9_1());
                          
                    }
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleStatement3202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_2());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1602:1: ( (lv_syncStatement_13_0= ruleStatement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1603:1: (lv_syncStatement_13_0= ruleStatement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1603:1: (lv_syncStatement_13_0= ruleStatement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1604:3: lv_syncStatement_13_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3223);
                    lv_syncStatement_13_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"syncStatement",
                              		lv_syncStatement_13_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1621:6: ( () otherlv_15= 'return' otherlv_16= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1621:6: ( () otherlv_15= 'return' otherlv_16= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1621:7: () otherlv_15= 'return' otherlv_16= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1621:7: ()
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1622:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_10_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleStatement3252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getReturnKeyword_10_1());
                          
                    }
                    otherlv_16=(Token)match(input,11,FOLLOW_11_in_ruleStatement3264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getSemicolonKeyword_10_2());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1636:6: ( () otherlv_18= 'throw' otherlv_19= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1636:6: ( () otherlv_18= 'throw' otherlv_19= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1636:7: () otherlv_18= 'throw' otherlv_19= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1636:7: ()
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1637:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleStatement3293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getThrowKeyword_11_1());
                          
                    }
                    otherlv_19=(Token)match(input,11,FOLLOW_11_in_ruleStatement3305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_11_2());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1651:6: ( ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1651:6: ( ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1651:7: ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1651:7: ( (lv_nameStatement_20_0= RULE_ID ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1652:1: (lv_nameStatement_20_0= RULE_ID )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1652:1: (lv_nameStatement_20_0= RULE_ID )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1653:3: lv_nameStatement_20_0= RULE_ID
                    {
                    lv_nameStatement_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nameStatement_20_0, grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_12_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nameStatement",
                              		lv_nameStatement_20_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,33,FOLLOW_33_in_ruleStatement3347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getColonKeyword_12_1());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1673:1: ( (lv_statement_22_0= ruleStatement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1674:1: (lv_statement_22_0= ruleStatement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1674:1: (lv_statement_22_0= ruleStatement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1675:3: lv_statement_22_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_12_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3368);
                    lv_statement_22_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"statement",
                              		lv_statement_22_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1692:6: ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1692:6: ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1692:7: () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1692:7: ()
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1693:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_13_0(),
                                  current);
                          
                    }

                    }

                    otherlv_24=(Token)match(input,34,FOLLOW_34_in_ruleStatement3397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getBreakKeyword_13_1());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1702:1: ( (lv_name_25_0= RULE_ID ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1703:1: (lv_name_25_0= RULE_ID )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1703:1: (lv_name_25_0= RULE_ID )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1704:3: lv_name_25_0= RULE_ID
                            {
                            lv_name_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3414); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_25_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_13_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_25_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_26=(Token)match(input,11,FOLLOW_11_in_ruleStatement3432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStatementAccess().getSemicolonKeyword_13_3());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1725:6: ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1725:6: ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1725:7: () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1725:7: ()
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1726:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_14_0(),
                                  current);
                          
                    }

                    }

                    otherlv_28=(Token)match(input,35,FOLLOW_35_in_ruleStatement3461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getStatementAccess().getContinueKeyword_14_1());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1735:1: ( (lv_name_29_0= RULE_ID ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1736:1: (lv_name_29_0= RULE_ID )
                            {
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1736:1: (lv_name_29_0= RULE_ID )
                            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1737:3: lv_name_29_0= RULE_ID
                            {
                            lv_name_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement3478); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_name_29_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_14_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"name",
                                      		lv_name_29_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,11,FOLLOW_11_in_ruleStatement3496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getStatementAccess().getSemicolonKeyword_14_3());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1758:6: ( () otherlv_32= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1758:6: ( () otherlv_32= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1758:7: () otherlv_32= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1758:7: ()
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1759:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getStatementAction_15_0(),
                                  current);
                          
                    }

                    }

                    otherlv_32=(Token)match(input,11,FOLLOW_11_in_ruleStatement3525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStatementAccess().getSemicolonKeyword_15_1());
                          
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1776:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1777:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1778:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3562);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3572); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1785:1: ruleExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_expressionLine_3_0= ruleExpression_line ) ) ) | (otherlv_4= '[' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ']' ( (lv_expressionLine_7_0= ruleExpression_line ) ) ) | (otherlv_8= '.' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_expressionLine_10_0= ruleExpression_line ) ) ) | (otherlv_11= ',' ( (lv_expression_12_0= ruleExpression ) ) ( (lv_expressionLine_13_0= ruleExpression_line ) ) ) | ( ( (lv_name_14_0= RULE_ID ) ) ( (lv_expression_15_0= ruleExpression_line ) ) ) | (otherlv_16= 'null' ( (lv_expression_17_0= ruleExpression_line ) ) ) | (otherlv_18= 'super' ( (lv_expression_19_0= ruleExpression_line ) ) ) | (otherlv_20= 'this' ( (lv_expression_21_0= ruleExpression_line ) ) ) | (otherlv_22= 'instanceof' ( (lv_className_23_0= ruleClass_name ) ) ( (lv_expression_24_0= ruleExpression_line ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token lv_name_14_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expressionLine_3_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expressionLine_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_expressionLine_10_0 = null;

        EObject lv_expression_12_0 = null;

        EObject lv_expressionLine_13_0 = null;

        EObject lv_expression_15_0 = null;

        EObject lv_expression_17_0 = null;

        EObject lv_expression_19_0 = null;

        EObject lv_expression_21_0 = null;

        AntlrDatatypeRuleToken lv_className_23_0 = null;

        EObject lv_expression_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1788:28: ( ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_expressionLine_3_0= ruleExpression_line ) ) ) | (otherlv_4= '[' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ']' ( (lv_expressionLine_7_0= ruleExpression_line ) ) ) | (otherlv_8= '.' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_expressionLine_10_0= ruleExpression_line ) ) ) | (otherlv_11= ',' ( (lv_expression_12_0= ruleExpression ) ) ( (lv_expressionLine_13_0= ruleExpression_line ) ) ) | ( ( (lv_name_14_0= RULE_ID ) ) ( (lv_expression_15_0= ruleExpression_line ) ) ) | (otherlv_16= 'null' ( (lv_expression_17_0= ruleExpression_line ) ) ) | (otherlv_18= 'super' ( (lv_expression_19_0= ruleExpression_line ) ) ) | (otherlv_20= 'this' ( (lv_expression_21_0= ruleExpression_line ) ) ) | (otherlv_22= 'instanceof' ( (lv_className_23_0= ruleClass_name ) ) ( (lv_expression_24_0= ruleExpression_line ) ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1789:1: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_expressionLine_3_0= ruleExpression_line ) ) ) | (otherlv_4= '[' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ']' ( (lv_expressionLine_7_0= ruleExpression_line ) ) ) | (otherlv_8= '.' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_expressionLine_10_0= ruleExpression_line ) ) ) | (otherlv_11= ',' ( (lv_expression_12_0= ruleExpression ) ) ( (lv_expressionLine_13_0= ruleExpression_line ) ) ) | ( ( (lv_name_14_0= RULE_ID ) ) ( (lv_expression_15_0= ruleExpression_line ) ) ) | (otherlv_16= 'null' ( (lv_expression_17_0= ruleExpression_line ) ) ) | (otherlv_18= 'super' ( (lv_expression_19_0= ruleExpression_line ) ) ) | (otherlv_20= 'this' ( (lv_expression_21_0= ruleExpression_line ) ) ) | (otherlv_22= 'instanceof' ( (lv_className_23_0= ruleClass_name ) ) ( (lv_expression_24_0= ruleExpression_line ) ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1789:1: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_expressionLine_3_0= ruleExpression_line ) ) ) | (otherlv_4= '[' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ']' ( (lv_expressionLine_7_0= ruleExpression_line ) ) ) | (otherlv_8= '.' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_expressionLine_10_0= ruleExpression_line ) ) ) | (otherlv_11= ',' ( (lv_expression_12_0= ruleExpression ) ) ( (lv_expressionLine_13_0= ruleExpression_line ) ) ) | ( ( (lv_name_14_0= RULE_ID ) ) ( (lv_expression_15_0= ruleExpression_line ) ) ) | (otherlv_16= 'null' ( (lv_expression_17_0= ruleExpression_line ) ) ) | (otherlv_18= 'super' ( (lv_expression_19_0= ruleExpression_line ) ) ) | (otherlv_20= 'this' ( (lv_expression_21_0= ruleExpression_line ) ) ) | (otherlv_22= 'instanceof' ( (lv_className_23_0= ruleClass_name ) ) ( (lv_expression_24_0= ruleExpression_line ) ) ) )
            int alt35=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt35=1;
                }
                break;
            case 36:
                {
                alt35=2;
                }
                break;
            case 38:
                {
                alt35=3;
                }
                break;
            case 14:
                {
                alt35=4;
                }
                break;
            case RULE_ID:
                {
                alt35=5;
                }
                break;
            case 39:
                {
                alt35=6;
                }
                break;
            case 40:
                {
                alt35=7;
                }
                break;
            case 41:
                {
                alt35=8;
                }
                break;
            case 42:
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1789:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_expressionLine_3_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1789:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_expressionLine_3_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1789:4: otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ')' ( (lv_expressionLine_3_0= ruleExpression_line ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExpression3610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1793:1: ( (lv_expression_1_0= ruleExpression ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1794:1: (lv_expression_1_0= ruleExpression )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1794:1: (lv_expression_1_0= ruleExpression )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1795:3: lv_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3631);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
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

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExpression3643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1815:1: ( (lv_expressionLine_3_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1816:1: (lv_expressionLine_3_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1816:1: (lv_expressionLine_3_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1817:3: lv_expressionLine_3_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3664);
                    lv_expressionLine_3_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_3_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1834:6: (otherlv_4= '[' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ']' ( (lv_expressionLine_7_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1834:6: (otherlv_4= '[' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ']' ( (lv_expressionLine_7_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1834:8: otherlv_4= '[' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ']' ( (lv_expressionLine_7_0= ruleExpression_line ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleExpression3684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1838:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1839:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1839:1: (lv_expression_5_0= ruleExpression )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1840:3: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3705);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleExpression3717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_2());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1860:1: ( (lv_expressionLine_7_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1861:1: (lv_expressionLine_7_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1861:1: (lv_expressionLine_7_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1862:3: lv_expressionLine_7_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3738);
                    lv_expressionLine_7_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_7_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1879:6: (otherlv_8= '.' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_expressionLine_10_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1879:6: (otherlv_8= '.' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_expressionLine_10_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1879:8: otherlv_8= '.' ( (lv_expression_9_0= ruleExpression ) ) ( (lv_expressionLine_10_0= ruleExpression_line ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleExpression3758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getFullStopKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1883:1: ( (lv_expression_9_0= ruleExpression ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1884:1: (lv_expression_9_0= ruleExpression )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1884:1: (lv_expression_9_0= ruleExpression )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1885:3: lv_expression_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3779);
                    lv_expression_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
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

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1901:2: ( (lv_expressionLine_10_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1902:1: (lv_expressionLine_10_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1902:1: (lv_expressionLine_10_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1903:3: lv_expressionLine_10_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3800);
                    lv_expressionLine_10_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_10_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1920:6: (otherlv_11= ',' ( (lv_expression_12_0= ruleExpression ) ) ( (lv_expressionLine_13_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1920:6: (otherlv_11= ',' ( (lv_expression_12_0= ruleExpression ) ) ( (lv_expressionLine_13_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1920:8: otherlv_11= ',' ( (lv_expression_12_0= ruleExpression ) ) ( (lv_expressionLine_13_0= ruleExpression_line ) )
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleExpression3820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getExpressionAccess().getCommaKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1924:1: ( (lv_expression_12_0= ruleExpression ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1925:1: (lv_expression_12_0= ruleExpression )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1925:1: (lv_expression_12_0= ruleExpression )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1926:3: lv_expression_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression3841);
                    lv_expression_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_12_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1942:2: ( (lv_expressionLine_13_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1943:1: (lv_expressionLine_13_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1943:1: (lv_expressionLine_13_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1944:3: lv_expressionLine_13_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionLineExpression_lineParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3862);
                    lv_expressionLine_13_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionLine",
                              		lv_expressionLine_13_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1961:6: ( ( (lv_name_14_0= RULE_ID ) ) ( (lv_expression_15_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1961:6: ( ( (lv_name_14_0= RULE_ID ) ) ( (lv_expression_15_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1961:7: ( (lv_name_14_0= RULE_ID ) ) ( (lv_expression_15_0= ruleExpression_line ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1961:7: ( (lv_name_14_0= RULE_ID ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_name_14_0= RULE_ID )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_name_14_0= RULE_ID )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1963:3: lv_name_14_0= RULE_ID
                    {
                    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression3887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_14_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_4_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_14_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1979:2: ( (lv_expression_15_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1980:1: (lv_expression_15_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1980:1: (lv_expression_15_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1981:3: lv_expression_15_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3913);
                    lv_expression_15_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_15_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1998:6: (otherlv_16= 'null' ( (lv_expression_17_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1998:6: (otherlv_16= 'null' ( (lv_expression_17_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1998:8: otherlv_16= 'null' ( (lv_expression_17_0= ruleExpression_line ) )
                    {
                    otherlv_16=(Token)match(input,39,FOLLOW_39_in_ruleExpression3933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getExpressionAccess().getNullKeyword_5_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2002:1: ( (lv_expression_17_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2003:1: (lv_expression_17_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2003:1: (lv_expression_17_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2004:3: lv_expression_17_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3954);
                    lv_expression_17_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_17_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2021:6: (otherlv_18= 'super' ( (lv_expression_19_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2021:6: (otherlv_18= 'super' ( (lv_expression_19_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2021:8: otherlv_18= 'super' ( (lv_expression_19_0= ruleExpression_line ) )
                    {
                    otherlv_18=(Token)match(input,40,FOLLOW_40_in_ruleExpression3974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getExpressionAccess().getSuperKeyword_6_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2025:1: ( (lv_expression_19_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2026:1: (lv_expression_19_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2026:1: (lv_expression_19_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2027:3: lv_expression_19_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression3995);
                    lv_expression_19_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_19_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2044:6: (otherlv_20= 'this' ( (lv_expression_21_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2044:6: (otherlv_20= 'this' ( (lv_expression_21_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2044:8: otherlv_20= 'this' ( (lv_expression_21_0= ruleExpression_line ) )
                    {
                    otherlv_20=(Token)match(input,41,FOLLOW_41_in_ruleExpression4015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getExpressionAccess().getThisKeyword_7_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2048:1: ( (lv_expression_21_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2049:1: (lv_expression_21_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2049:1: (lv_expression_21_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2050:3: lv_expression_21_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression4036);
                    lv_expression_21_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_21_0, 
                              		"Expression_line");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2067:6: (otherlv_22= 'instanceof' ( (lv_className_23_0= ruleClass_name ) ) ( (lv_expression_24_0= ruleExpression_line ) ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2067:6: (otherlv_22= 'instanceof' ( (lv_className_23_0= ruleClass_name ) ) ( (lv_expression_24_0= ruleExpression_line ) ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2067:8: otherlv_22= 'instanceof' ( (lv_className_23_0= ruleClass_name ) ) ( (lv_expression_24_0= ruleExpression_line ) )
                    {
                    otherlv_22=(Token)match(input,42,FOLLOW_42_in_ruleExpression4056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getExpressionAccess().getInstanceofKeyword_8_0());
                          
                    }
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2071:1: ( (lv_className_23_0= ruleClass_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2072:1: (lv_className_23_0= ruleClass_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2072:1: (lv_className_23_0= ruleClass_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2073:3: lv_className_23_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getClassNameClass_nameParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleExpression4077);
                    lv_className_23_0=ruleClass_name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"className",
                              		lv_className_23_0, 
                              		"Class_name");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2089:2: ( (lv_expression_24_0= ruleExpression_line ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2090:1: (lv_expression_24_0= ruleExpression_line )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2090:1: (lv_expression_24_0= ruleExpression_line )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2091:3: lv_expression_24_0= ruleExpression_line
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpression_lineParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression4098);
                    lv_expression_24_0=ruleExpression_line();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_24_0, 
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


    // $ANTLR start "entryRuleExpression_line"
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2115:1: entryRuleExpression_line returns [EObject current=null] : iv_ruleExpression_line= ruleExpression_line EOF ;
    public final EObject entryRuleExpression_line() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_line = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2116:2: (iv_ruleExpression_line= ruleExpression_line EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2117:2: iv_ruleExpression_line= ruleExpression_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_lineRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_line_in_entryRuleExpression_line4135);
            iv_ruleExpression_line=ruleExpression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_line; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_line4145); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2124:1: ruleExpression_line returns [EObject current=null] : (otherlv_0= '(' ( (lv_args_1_0= ruleArglist ) )? otherlv_2= ')' ( (lv_expression_3_0= ruleExpression_line ) ) ) ;
    public final EObject ruleExpression_line() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_args_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2127:28: ( (otherlv_0= '(' ( (lv_args_1_0= ruleArglist ) )? otherlv_2= ')' ( (lv_expression_3_0= ruleExpression_line ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2128:1: (otherlv_0= '(' ( (lv_args_1_0= ruleArglist ) )? otherlv_2= ')' ( (lv_expression_3_0= ruleExpression_line ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2128:1: (otherlv_0= '(' ( (lv_args_1_0= ruleArglist ) )? otherlv_2= ')' ( (lv_expression_3_0= ruleExpression_line ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2128:3: otherlv_0= '(' ( (lv_args_1_0= ruleArglist ) )? otherlv_2= ')' ( (lv_expression_3_0= ruleExpression_line ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExpression_line4182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpression_lineAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2132:1: ( (lv_args_1_0= ruleArglist ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==14||LA36_0==19||LA36_0==36||(LA36_0>=38 && LA36_0<=42)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2133:1: (lv_args_1_0= ruleArglist )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2133:1: (lv_args_1_0= ruleArglist )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2134:3: lv_args_1_0= ruleArglist
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_lineAccess().getArgsArglistParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArglist_in_ruleExpression_line4203);
                    lv_args_1_0=ruleArglist();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_lineRule());
                      	        }
                             		set(
                             			current, 
                             			"args",
                              		lv_args_1_0, 
                              		"Arglist");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExpression_line4216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpression_lineAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2154:1: ( (lv_expression_3_0= ruleExpression_line ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2155:1: (lv_expression_3_0= ruleExpression_line )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2155:1: (lv_expression_3_0= ruleExpression_line )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2156:3: lv_expression_3_0= ruleExpression_line
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpression_lineAccess().getExpressionExpression_lineParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_line_in_ruleExpression_line4237);
            lv_expression_3_0=ruleExpression_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpression_lineRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"Expression_line");
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
    // $ANTLR end "ruleExpression_line"


    // $ANTLR start "entryRuleArglist"
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2180:1: entryRuleArglist returns [EObject current=null] : iv_ruleArglist= ruleArglist EOF ;
    public final EObject entryRuleArglist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArglist = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2181:2: (iv_ruleArglist= ruleArglist EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2182:2: iv_ruleArglist= ruleArglist EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArglistRule()); 
            }
            pushFollow(FOLLOW_ruleArglist_in_entryRuleArglist4273);
            iv_ruleArglist=ruleArglist();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArglist; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArglist4283); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArglist"


    // $ANTLR start "ruleArglist"
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2189:1: ruleArglist returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArglist() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2192:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2193:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2193:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2193:2: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2193:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2194:1: (lv_expression_0_0= ruleExpression )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2194:1: (lv_expression_0_0= ruleExpression )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2195:3: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArglistAccess().getExpressionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArglist4329);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArglistRule());
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2211:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==14) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2211:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleArglist4342); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArglistAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2215:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2216:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2216:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2217:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArglistAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArglist4363);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArglistRule());
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
            	    break loop37;
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
    // $ANTLR end "ruleArglist"


    // $ANTLR start "entryRuleFor_Statement"
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2241:1: entryRuleFor_Statement returns [EObject current=null] : iv_ruleFor_Statement= ruleFor_Statement EOF ;
    public final EObject entryRuleFor_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor_Statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2242:2: (iv_ruleFor_Statement= ruleFor_Statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2243:2: iv_ruleFor_Statement= ruleFor_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFor_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement4401);
            iv_ruleFor_Statement=ruleFor_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor_Statement4411); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2250:1: ruleFor_Statement returns [EObject current=null] : (otherlv_0= 'for(' (this_Variable_declaration_1= ruleVariable_declaration | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';)' ( (lv_statementInFor_5_0= ruleStatement ) ) ) ;
    public final EObject ruleFor_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_Variable_declaration_1 = null;

        EObject lv_statementInFor_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2253:28: ( (otherlv_0= 'for(' (this_Variable_declaration_1= ruleVariable_declaration | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';)' ( (lv_statementInFor_5_0= ruleStatement ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2254:1: (otherlv_0= 'for(' (this_Variable_declaration_1= ruleVariable_declaration | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';)' ( (lv_statementInFor_5_0= ruleStatement ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2254:1: (otherlv_0= 'for(' (this_Variable_declaration_1= ruleVariable_declaration | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';)' ( (lv_statementInFor_5_0= ruleStatement ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2254:3: otherlv_0= 'for(' (this_Variable_declaration_1= ruleVariable_declaration | otherlv_2= ';' ) otherlv_3= ';' otherlv_4= ';)' ( (lv_statementInFor_5_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleFor_Statement4448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFor_StatementAccess().getForKeyword_0());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2258:1: (this_Variable_declaration_1= ruleVariable_declaration | otherlv_2= ';' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STATIC)||(LA38_0>=22 && LA38_0<=29)) ) {
                alt38=1;
            }
            else if ( (LA38_0==11) ) {
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
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2259:5: this_Variable_declaration_1= ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFor_StatementAccess().getVariable_declarationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_ruleFor_Statement4471);
                    this_Variable_declaration_1=ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_declaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2268:7: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleFor_Statement4488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleFor_Statement4501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFor_StatementAccess().getSemicolonKeyword_2());
                  
            }
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleFor_Statement4513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFor_StatementAccess().getSemicolonRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2280:1: ( (lv_statementInFor_5_0= ruleStatement ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2281:1: (lv_statementInFor_5_0= ruleStatement )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2281:1: (lv_statementInFor_5_0= ruleStatement )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2282:3: lv_statementInFor_5_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFor_StatementAccess().getStatementInForStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor_Statement4534);
            lv_statementInFor_5_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFor_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statementInFor",
                      		lv_statementInFor_5_0, 
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


    // $ANTLR start "entryRuleSwitch_statement"
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2306:1: entryRuleSwitch_statement returns [EObject current=null] : iv_ruleSwitch_statement= ruleSwitch_statement EOF ;
    public final EObject entryRuleSwitch_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch_statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2307:2: (iv_ruleSwitch_statement= ruleSwitch_statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2308:2: iv_ruleSwitch_statement= ruleSwitch_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_statementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement4570);
            iv_ruleSwitch_statement=ruleSwitch_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch_statement4580); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2315:1: ruleSwitch_statement returns [EObject current=null] : (otherlv_0= 'switch(' otherlv_1= '){' ( (otherlv_2= 'case' otherlv_3= ':' ) | otherlv_4= 'default:' | ( (lv_statement_5_0= ruleStatement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSwitch_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2318:28: ( (otherlv_0= 'switch(' otherlv_1= '){' ( (otherlv_2= 'case' otherlv_3= ':' ) | otherlv_4= 'default:' | ( (lv_statement_5_0= ruleStatement ) ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2319:1: (otherlv_0= 'switch(' otherlv_1= '){' ( (otherlv_2= 'case' otherlv_3= ':' ) | otherlv_4= 'default:' | ( (lv_statement_5_0= ruleStatement ) ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2319:1: (otherlv_0= 'switch(' otherlv_1= '){' ( (otherlv_2= 'case' otherlv_3= ':' ) | otherlv_4= 'default:' | ( (lv_statement_5_0= ruleStatement ) ) )* otherlv_6= '}' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2319:3: otherlv_0= 'switch(' otherlv_1= '){' ( (otherlv_2= 'case' otherlv_3= ':' ) | otherlv_4= 'default:' | ( (lv_statement_5_0= ruleStatement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleSwitch_statement4617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitch_statementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleSwitch_statement4629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitch_statementAccess().getRightParenthesisLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2327:1: ( (otherlv_2= 'case' otherlv_3= ':' ) | otherlv_4= 'default:' | ( (lv_statement_5_0= ruleStatement ) ) )*
            loop39:
            do {
                int alt39=4;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    alt39=1;
                    }
                    break;
                case 48:
                    {
                    alt39=2;
                    }
                    break;
                case RULE_ID:
                case RULE_MOD:
                case RULE_STATIC:
                case 11:
                case 14:
                case 15:
                case 19:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 34:
                case 35:
                case 36:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 45:
                case 49:
                case 50:
                case 52:
                case 54:
                    {
                    alt39=3;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2327:2: (otherlv_2= 'case' otherlv_3= ':' )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2327:2: (otherlv_2= 'case' otherlv_3= ':' )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2327:4: otherlv_2= 'case' otherlv_3= ':'
            	    {
            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleSwitch_statement4643); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSwitch_statementAccess().getCaseKeyword_2_0_0());
            	          
            	    }
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleSwitch_statement4655); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSwitch_statementAccess().getColonKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2336:7: otherlv_4= 'default:'
            	    {
            	    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleSwitch_statement4674); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSwitch_statementAccess().getDefaultKeyword_2_1());
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2341:6: ( (lv_statement_5_0= ruleStatement ) )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2341:6: ( (lv_statement_5_0= ruleStatement ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2342:1: (lv_statement_5_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2342:1: (lv_statement_5_0= ruleStatement )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2343:3: lv_statement_5_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitch_statementAccess().getStatementStatementParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleSwitch_statement4701);
            	    lv_statement_5_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitch_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statement",
            	              		lv_statement_5_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSwitch_statement4715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSwitch_statementAccess().getRightCurlyBracketKeyword_3());
                  
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2371:1: entryRuleWhile_Statement returns [EObject current=null] : iv_ruleWhile_Statement= ruleWhile_Statement EOF ;
    public final EObject entryRuleWhile_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile_Statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2372:2: (iv_ruleWhile_Statement= ruleWhile_Statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2373:2: iv_ruleWhile_Statement= ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement4751);
            iv_ruleWhile_Statement=ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement4761); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2380:1: ruleWhile_Statement returns [EObject current=null] : (otherlv_0= 'while(' otherlv_1= ')' ( (lv_statement_2_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2383:28: ( (otherlv_0= 'while(' otherlv_1= ')' ( (lv_statement_2_0= ruleStatement ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2384:1: (otherlv_0= 'while(' otherlv_1= ')' ( (lv_statement_2_0= ruleStatement ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2384:1: (otherlv_0= 'while(' otherlv_1= ')' ( (lv_statement_2_0= ruleStatement ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2384:3: otherlv_0= 'while(' otherlv_1= ')' ( (lv_statement_2_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleWhile_Statement4798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhile_StatementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleWhile_Statement4810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhile_StatementAccess().getRightParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2392:1: ( (lv_statement_2_0= ruleStatement ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_statement_2_0= ruleStatement )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2393:1: (lv_statement_2_0= ruleStatement )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2394:3: lv_statement_2_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile_Statement4831);
            lv_statement_2_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhile_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_2_0, 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2418:1: entryRuleDo_Statement returns [EObject current=null] : iv_ruleDo_Statement= ruleDo_Statement EOF ;
    public final EObject entryRuleDo_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo_Statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2419:2: (iv_ruleDo_Statement= ruleDo_Statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2420:2: iv_ruleDo_Statement= ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement4867);
            iv_ruleDo_Statement=ruleDo_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDo_Statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement4877); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2427:1: ruleDo_Statement returns [EObject current=null] : (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while(' otherlv_3= ');' ) ;
    public final EObject ruleDo_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_statement_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2430:28: ( (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while(' otherlv_3= ');' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2431:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while(' otherlv_3= ');' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2431:1: (otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while(' otherlv_3= ');' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2431:3: otherlv_0= 'do' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'while(' otherlv_3= ');'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleDo_Statement4914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDo_StatementAccess().getDoKeyword_0());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2435:1: ( (lv_statement_1_0= ruleStatement ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2436:1: (lv_statement_1_0= ruleStatement )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2436:1: (lv_statement_1_0= ruleStatement )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2437:3: lv_statement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleDo_Statement4935);
            lv_statement_1_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDo_StatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_1_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleDo_Statement4947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDo_StatementAccess().getWhileKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleDo_Statement4959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDo_StatementAccess().getRightParenthesisSemicolonKeyword_3());
                  
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2469:1: entryRuleIf_statement returns [EObject current=null] : iv_ruleIf_statement= ruleIf_statement EOF ;
    public final EObject entryRuleIf_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf_statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2470:2: (iv_ruleIf_statement= ruleIf_statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2471:2: iv_ruleIf_statement= ruleIf_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_entryRuleIf_statement4995);
            iv_ruleIf_statement=ruleIf_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_statement5005); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2478:1: ruleIf_statement returns [EObject current=null] : (otherlv_0= 'if(' otherlv_1= ')' this_Statement_2= ruleStatement ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Statement_2 = null;

        EObject lv_elseStatement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2481:28: ( (otherlv_0= 'if(' otherlv_1= ')' this_Statement_2= ruleStatement ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2482:1: (otherlv_0= 'if(' otherlv_1= ')' this_Statement_2= ruleStatement ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2482:1: (otherlv_0= 'if(' otherlv_1= ')' this_Statement_2= ruleStatement ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )? )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2482:3: otherlv_0= 'if(' otherlv_1= ')' this_Statement_2= ruleStatement ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleIf_statement5042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleIf_statement5054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_1());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf_statement5076);
            this_Statement_2=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Statement_2; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2499:1: ( ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred1_InternalMyDsl()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2499:2: ( ( 'else' )=>otherlv_3= 'else' ) ( (lv_elseStatement_4_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2499:2: ( ( 'else' )=>otherlv_3= 'else' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2499:3: ( 'else' )=>otherlv_3= 'else'
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleIf_statement5096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIf_statementAccess().getElseKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2504:2: ( (lv_elseStatement_4_0= ruleStatement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2505:1: (lv_elseStatement_4_0= ruleStatement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2505:1: (lv_elseStatement_4_0= ruleStatement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2506:3: lv_elseStatement_4_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf_statement5118);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2530:1: entryRuleTry_statement returns [EObject current=null] : iv_ruleTry_statement= ruleTry_statement EOF ;
    public final EObject entryRuleTry_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry_statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2531:2: (iv_ruleTry_statement= ruleTry_statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2532:2: iv_ruleTry_statement= ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement5156);
            iv_ruleTry_statement=ruleTry_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTry_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement5166); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2539:1: ruleTry_statement returns [EObject current=null] : (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_statementFinally_8_0= ruleStatement ) ) )? ) ;
    public final EObject ruleTry_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_tryStatement_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_statement_6_0 = null;

        EObject lv_statementFinally_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2542:28: ( (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_statementFinally_8_0= ruleStatement ) ) )? ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2543:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_statementFinally_8_0= ruleStatement ) ) )? )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2543:1: (otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_statementFinally_8_0= ruleStatement ) ) )? )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2543:3: otherlv_0= 'try' ( (lv_tryStatement_1_0= ruleStatement ) ) ( ( ( 'catch' )=>otherlv_2= 'catch' ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleStatement ) ) )* ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_statementFinally_8_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleTry_statement5203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTry_statementAccess().getTryKeyword_0());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2547:1: ( (lv_tryStatement_1_0= ruleStatement ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2548:1: (lv_tryStatement_1_0= ruleStatement )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2548:1: (lv_tryStatement_1_0= ruleStatement )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2549:3: lv_tryStatement_1_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement5224);
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2565:2: ( ( ( 'catch' )=>otherlv_2= 'catch' ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleStatement ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==55) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred2_InternalMyDsl()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2565:3: ( ( 'catch' )=>otherlv_2= 'catch' ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleStatement ) )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2565:3: ( ( 'catch' )=>otherlv_2= 'catch' )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2565:4: ( 'catch' )=>otherlv_2= 'catch'
            	    {
            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleTry_statement5245); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTry_statementAccess().getCatchKeyword_2_0());
            	          
            	    }

            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTry_statement5258); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1());
            	          
            	    }
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2574:1: ( (lv_parameters_4_0= ruleParameter ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2575:1: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2575:1: (lv_parameters_4_0= ruleParameter )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2576:3: lv_parameters_4_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleTry_statement5279);
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

            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleTry_statement5291); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3());
            	          
            	    }
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2596:1: ( (lv_statement_6_0= ruleStatement ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2597:1: (lv_statement_6_0= ruleStatement )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2597:1: (lv_statement_6_0= ruleStatement )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2598:3: lv_statement_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTry_statementAccess().getStatementStatementParserRuleCall_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement5312);
            	    lv_statement_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statement",
            	              		lv_statement_6_0, 
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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2614:4: ( ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_statementFinally_8_0= ruleStatement ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred3_InternalMyDsl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2614:5: ( ( 'finally' )=>otherlv_7= 'finally' ) ( (lv_statementFinally_8_0= ruleStatement ) )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2614:5: ( ( 'finally' )=>otherlv_7= 'finally' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2614:6: ( 'finally' )=>otherlv_7= 'finally'
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleTry_statement5335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2619:2: ( (lv_statementFinally_8_0= ruleStatement ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2620:1: (lv_statementFinally_8_0= ruleStatement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2620:1: (lv_statementFinally_8_0= ruleStatement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2621:3: lv_statementFinally_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTry_statementAccess().getStatementFinallyStatementParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleTry_statement5357);
                    lv_statementFinally_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTry_statementRule());
                      	        }
                             		set(
                             			current, 
                             			"statementFinally",
                              		lv_statementFinally_8_0, 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2645:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2646:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2647:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement5395);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement5405); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2654:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        AntlrDatatypeRuleToken lv_pacName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2657:28: ( (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2658:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2658:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2658:3: otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleImport_statement5442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2662:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2662:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2662:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2662:3: ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2662:3: ( (lv_className_1_0= ruleClass_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2663:1: (lv_className_1_0= ruleClass_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2663:1: (lv_className_1_0= ruleClass_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2664:3: lv_className_1_0= ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement5465);
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

                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleImport_statement5477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2685:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2685:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2685:7: ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2685:7: ( (lv_pacName_3_0= rulePackage_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2686:1: (lv_pacName_3_0= rulePackage_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2686:1: (lv_pacName_3_0= rulePackage_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2687:3: lv_pacName_3_0= rulePackage_name
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement5506);
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

                    otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleImport_statement5518); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2715:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2716:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2717:2: iv_ruleClass_name= ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name5557);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name5568); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2724:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2727:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2729:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name5614);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2747:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2748:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2749:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name5659);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name5670); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2756:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2759:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2761:5: this_Package_name_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name5716);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2779:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2780:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2781:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement5760);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_statement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement5770); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2788:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_pacName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2791:28: ( (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2792:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2792:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2792:3: otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_rulePackage_statement5807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                  
            }
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2796:1: ( (lv_pacName_1_0= rulePackage_name ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2797:1: (lv_pacName_1_0= rulePackage_name )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2797:1: (lv_pacName_1_0= rulePackage_name )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2798:3: lv_pacName_1_0= rulePackage_name
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement5828);
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

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_rulePackage_statement5840); if (state.failed) return current;
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2826:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2827:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2828:2: iv_rulePackage_name= rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name5877);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name5888); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2835:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_line_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2838:28: ( (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2839:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2839:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2839:6: this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name5928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_rulePackage_name5955);
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2865:1: entryRulePackage_name_line returns [String current=null] : iv_rulePackage_name_line= rulePackage_name_line EOF ;
    public final String entryRulePackage_name_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_line = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2866:2: (iv_rulePackage_name_line= rulePackage_name_line EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2867:2: iv_rulePackage_name_line= rulePackage_name_line EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackage_name_lineRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line6001);
            iv_rulePackage_name_line=rulePackage_name_line();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage_name_line.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_line6012); if (state.failed) return current;

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2874:1: rulePackage_name_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2877:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2878:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2878:1: (kw= '.' this_ID_1= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==38) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2879:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_rulePackage_name_line6050); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            	          
            	    }
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_line6065); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_1, grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
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

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2499:3: ( 'else' )
        // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2499:5: 'else'
        {
        match(input,53,FOLLOW_53_in_synpred1_InternalMyDsl5088); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2565:4: ( 'catch' )
        // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2565:6: 'catch'
        {
        match(input,55,FOLLOW_55_in_synpred2_InternalMyDsl5237); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2614:6: ( 'finally' )
        // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:2614:8: 'finally'
        {
        match(input,56,FOLLOW_56_in_synpred3_InternalMyDsl5327); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // Delegated rules

    public final boolean synpred3_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\3\6\2\uffff";
    static final String DFA5_maxS =
        "\3\21\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\4\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\4\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\4\uffff\1\4\4\uffff\1\3",
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
            return "212:3: ( ( (lv_classDec_1_0= ruleClass_declaration ) ) | ( (lv_interfaceDec_2_0= ruleInterface_declaration ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\23\uffff";
    static final String DFA15_eofS =
        "\23\uffff";
    static final String DFA15_minS =
        "\15\5\1\13\1\uffff\1\5\2\uffff\1\5";
    static final String DFA15_maxS =
        "\3\35\10\25\1\46\2\25\1\uffff\1\5\2\uffff\1\46";
    static final String DFA15_acceptS =
        "\16\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA15_specialS =
        "\23\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\13\1\1\1\2\16\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\1\1\1\2\16\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\13\1\1\1\2\16\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\15\17\uffff\1\14",
            "\1\15\17\uffff\1\14",
            "\1\15\17\uffff\1\14",
            "\1\15\17\uffff\1\14",
            "\1\15\17\uffff\1\14",
            "\1\15\17\uffff\1\14",
            "\1\15\17\uffff\1\14",
            "\1\15\17\uffff\1\14",
            "\1\15\15\uffff\1\16\1\uffff\1\14\20\uffff\1\17",
            "\1\15\17\uffff\1\14",
            "\1\21\2\uffff\1\21\4\uffff\1\20\1\uffff\1\21",
            "",
            "\1\22",
            "",
            "",
            "\1\15\17\uffff\1\14\20\uffff\1\17"
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
            return "558:3: ( ( (lv_variableDeclaration_1_0= ruleVariable_declaration ) ) | ( (lv_contructorName_2_0= ruleConstructor_declaration ) ) | ( (lv_methodName_3_0= ruleMethod_declaration ) ) )";
        }
    }
    static final String DFA34_eotS =
        "\22\uffff";
    static final String DFA34_eofS =
        "\22\uffff";
    static final String DFA34_minS =
        "\1\5\2\uffff\1\5\16\uffff";
    static final String DFA34_maxS =
        "\1\66\2\uffff\1\46\16\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14\1\16\1\17\1\20\1\15";
    static final String DFA34_specialS =
        "\22\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\2\4\3\uffff\1\20\2\uffff\1\2\1\1\3\uffff\1\2\2\uffff\10"+
            "\4\1\13\1\14\1\15\1\uffff\1\16\1\17\1\2\1\uffff\5\2\1\10\1\uffff"+
            "\1\12\3\uffff\1\7\1\6\1\uffff\1\5\1\uffff\1\11",
            "",
            "",
            "\1\4\15\uffff\1\2\1\uffff\1\4\13\uffff\1\21\4\uffff\1\4",
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
            return "1431:1: (this_Statement_block_0= ruleStatement_block | ( ( (lv_expressionStatement_1_0= ruleExpression ) ) otherlv_2= ';' ) | this_Variable_declaration_3= ruleVariable_declaration | ( (lv_ifStatement_4_0= ruleIf_statement ) ) | ( (lv_doStatement_5_0= ruleDo_Statement ) ) | ( (lv_whileStatement_6_0= ruleWhile_Statement ) ) | ( (lv_forStatement_7_0= ruleFor_Statement ) ) | ( (lv_tryStatement_8_0= ruleTry_statement ) ) | ( (lv_switchStatement_9_0= ruleSwitch_statement ) ) | ( () otherlv_11= 'synchronized(' otherlv_12= ')' ( (lv_syncStatement_13_0= ruleStatement ) ) ) | ( () otherlv_15= 'return' otherlv_16= ';' ) | ( () otherlv_18= 'throw' otherlv_19= ';' ) | ( ( (lv_nameStatement_20_0= RULE_ID ) ) otherlv_21= ':' ( (lv_statement_22_0= ruleStatement ) ) ) | ( () otherlv_24= 'break' ( (lv_name_25_0= RULE_ID ) )? otherlv_26= ';' ) | ( () otherlv_28= 'continue' ( (lv_name_29_0= RULE_ID ) )? otherlv_30= ';' ) | ( () otherlv_32= ';' ) )";
        }
    }
    static final String DFA43_eotS =
        "\6\uffff";
    static final String DFA43_eofS =
        "\6\uffff";
    static final String DFA43_minS =
        "\1\5\1\13\1\5\2\uffff\1\13";
    static final String DFA43_maxS =
        "\1\5\1\72\1\5\2\uffff\1\72";
    static final String DFA43_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA43_specialS =
        "\6\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1",
            "\1\3\32\uffff\1\2\23\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\32\uffff\1\2\23\uffff\1\4"
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
            return "2662:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit221 = new BitSet(new long[]{0x02000000000210D2L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit243 = new BitSet(new long[]{0x02000000000210D2L});
    public static final BitSet FOLLOW_ruleType_declaration_in_ruleCompilation_unit265 = new BitSet(new long[]{0x00000000000210D2L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration354 = new BitSet(new long[]{0x00000000000210D0L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_ruleType_declaration382 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_ruleType_declaration409 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleType_declaration422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterface_declaration514 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_12_in_ruleInterface_declaration527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface_declaration544 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleInterface_declaration562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration583 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleInterface_declaration596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleInterface_declaration617 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleInterface_declaration633 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInterface_declaration645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClass_declaration737 = new BitSet(new long[]{0x00000000000200C0L});
    public static final BitSet FOLLOW_17_in_ruleClass_declaration750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass_declaration767 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_13_in_ruleClass_declaration785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleClass_declaration806 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleClass_declaration821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration842 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleClass_declaration855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInterface_name_in_ruleClass_declaration876 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleClass_declaration892 = new BitSet(new long[]{0x000000003FC108F0L});
    public static final BitSet FOLLOW_ruleField_declaration_in_ruleClass_declaration913 = new BitSet(new long[]{0x000000003FC108F0L});
    public static final BitSet FOLLOW_16_in_ruleClass_declaration926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1015 = new BitSet(new long[]{0x000000003FC000F0L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleField_declaration1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_ruleField_declaration1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_ruleField_declaration1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleField_declaration1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethod_declaration1247 = new BitSet(new long[]{0x000000003FC000E0L});
    public static final BitSet FOLLOW_ruleType_in_ruleMethod_declaration1269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod_declaration1286 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMethod_declaration1303 = new BitSet(new long[]{0x000000003FD000E0L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleMethod_declaration1324 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethod_declaration1337 = new BitSet(new long[]{0x0000000000208800L});
    public static final BitSet FOLLOW_21_in_ruleMethod_declaration1350 = new BitSet(new long[]{0x0000000000208800L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleMethod_declaration1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMethod_declaration1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConstructor_declaration1485 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor_declaration1503 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstructor_declaration1520 = new BitSet(new long[]{0x000000003FD000E0L});
    public static final BitSet FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1541 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstructor_declaration1554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list1611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1667 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleParameter_list1680 = new BitSet(new long[]{0x000000003FC000E0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameter_list1701 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1812 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleParameter1830 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleVariable_declaration1924 = new BitSet(new long[]{0x000000003FC000E0L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariable_declaration1946 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration1967 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_14_in_ruleVariable_declaration1980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2001 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_ruleVariable_declaration2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable_declarator2103 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVariable_declarator2121 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_ruleType2215 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleType2228 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier2267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType_specifier2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType_specifier2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType_specifier2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleType_specifier2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType_specifier2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType_specifier2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleType_specifier2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleType_specifier2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleType_specifier2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_ruleModifier2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleModifier2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_ruleStatic_initializer2697 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatic_initializer2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block2759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatement_block2806 = new BitSet(new long[]{0x00562FDDFFC9C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement_block2827 = new BitSet(new long[]{0x00562FDDFFC9C8E0L});
    public static final BitSet FOLLOW_16_in_ruleStatement_block2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_ruleStatement2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement2960 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStatement2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleStatement3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_ruleStatement3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_ruleStatement3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_ruleStatement3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_ruleStatement3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_ruleStatement3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_statement_in_ruleStatement3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStatement3190 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement3202 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStatement3252 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStatement3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStatement3293 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStatement3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3330 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStatement3347 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStatement3397 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3414 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStatement3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatement3461 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement3478 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleStatement3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatement3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExpression3610 = new BitSet(new long[]{0x000007D000084020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3631 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExpression3643 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleExpression3684 = new BitSet(new long[]{0x000007D000084020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3705 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExpression3717 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExpression3758 = new BitSet(new long[]{0x000007D000084020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3779 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleExpression3820 = new BitSet(new long[]{0x000007D000084020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression3841 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression3887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExpression3933 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpression3974 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExpression4015 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleExpression4056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleExpression4077 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_line_in_entryRuleExpression_line4135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_line4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExpression_line4182 = new BitSet(new long[]{0x000007D000184020L});
    public static final BitSet FOLLOW_ruleArglist_in_ruleExpression_line4203 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExpression_line4216 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExpression_line_in_ruleExpression_line4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArglist_in_entryRuleArglist4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArglist4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArglist4329 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleArglist4342 = new BitSet(new long[]{0x000007D000084020L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArglist4363 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleFor_Statement_in_entryRuleFor_Statement4401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor_Statement4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFor_Statement4448 = new BitSet(new long[]{0x000000003FC008E0L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_ruleFor_Statement4471 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFor_Statement4488 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleFor_Statement4501 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleFor_Statement4513 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor_Statement4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_statement_in_entryRuleSwitch_statement4570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch_statement4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSwitch_statement4617 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSwitch_statement4629 = new BitSet(new long[]{0x0057AFDDFFC9C8E0L});
    public static final BitSet FOLLOW_47_in_ruleSwitch_statement4643 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSwitch_statement4655 = new BitSet(new long[]{0x0057AFDDFFC9C8E0L});
    public static final BitSet FOLLOW_48_in_ruleSwitch_statement4674 = new BitSet(new long[]{0x0057AFDDFFC9C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitch_statement4701 = new BitSet(new long[]{0x0057AFDDFFC9C8E0L});
    public static final BitSet FOLLOW_16_in_ruleSwitch_statement4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement4751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleWhile_Statement4798 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWhile_Statement4810 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile_Statement4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement4867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDo_Statement4914 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo_Statement4935 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleDo_Statement4947 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDo_Statement4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_entryRuleIf_statement4995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_statement5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIf_statement5042 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIf_statement5054 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_statement5076 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIf_statement5096 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf_statement5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement5156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTry_statement5203 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement5224 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTry_statement5245 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTry_statement5258 = new BitSet(new long[]{0x000000003FC000E0L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTry_statement5279 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTry_statement5291 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement5312 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTry_statement5335 = new BitSet(new long[]{0x00562FDDFFC8C8E0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTry_statement5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement5395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImport_statement5442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement5465 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImport_statement5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement5506 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleImport_statement5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name5557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name5659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement5760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePackage_statement5807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement5828 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePackage_statement5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name5877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name5928 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rulePackage_name5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line6001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_line6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePackage_name_line6050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_line6065 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_53_in_synpred1_InternalMyDsl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred2_InternalMyDsl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred3_InternalMyDsl5327 = new BitSet(new long[]{0x0000000000000002L});

}