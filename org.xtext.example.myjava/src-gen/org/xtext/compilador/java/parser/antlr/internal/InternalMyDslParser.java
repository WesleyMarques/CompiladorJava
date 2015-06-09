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

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOC_COMMENT", "RULE_ID", "RULE_MOD", "RULE_STATIC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'interface'", "'extends'", "','", "'{'", "'}'", "'class'", "'implements'", "'('", "')'", "'[]'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'import'", "'.*;'", "'package'", "'.'"
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_STATIC=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_MOD=6;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

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
             
            	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleCompilation_unit_in_ruleModel130);
            lv_greetings_0_0=ruleCompilation_unit();

            state._fsp--;


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

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getCompilation_unitRule()); 
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165);
            iv_ruleCompilation_unit=ruleCompilation_unit();

            state._fsp--;

             current =iv_ruleCompilation_unit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit175); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:115:1: ruleCompilation_unit returns [EObject current=null] : ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclaration_2_0= ruleType_declaration ) )* ) ;
    public final EObject ruleCompilation_unit() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_typeDeclaration_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:118:28: ( ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclaration_2_0= ruleType_declaration ) )* ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:1: ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclaration_2_0= ruleType_declaration ) )* )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:1: ( ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclaration_2_0= ruleType_declaration ) )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:2: ( (lv_name_0_0= rulePackage_statement ) )? ( (lv_imports_1_0= ruleImport_statement ) )* ( (lv_typeDeclaration_2_0= ruleType_declaration ) )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:119:2: ( (lv_name_0_0= rulePackage_statement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_name_0_0= rulePackage_statement )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:120:1: (lv_name_0_0= rulePackage_statement )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:121:3: lv_name_0_0= rulePackage_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_statement_in_ruleCompilation_unit221);
                    lv_name_0_0=rulePackage_statement();

                    state._fsp--;


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
                    break;

            }

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:137:3: ( (lv_imports_1_0= ruleImport_statement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:138:1: (lv_imports_1_0= ruleImport_statement )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:138:1: (lv_imports_1_0= ruleImport_statement )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:139:3: lv_imports_1_0= ruleImport_statement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_statement_in_ruleCompilation_unit243);
            	    lv_imports_1_0=ruleImport_statement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:155:3: ( (lv_typeDeclaration_2_0= ruleType_declaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOC_COMMENT||(LA3_0>=RULE_MOD && LA3_0<=RULE_STATIC)||LA3_0==12||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:156:1: (lv_typeDeclaration_2_0= ruleType_declaration )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:156:1: (lv_typeDeclaration_2_0= ruleType_declaration )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:157:3: lv_typeDeclaration_2_0= ruleType_declaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompilation_unitAccess().getTypeDeclarationType_declarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_declaration_in_ruleCompilation_unit265);
            	    lv_typeDeclaration_2_0=ruleType_declaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompilation_unitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typeDeclaration",
            	            		lv_typeDeclaration_2_0, 
            	            		"Type_declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getType_declarationRule()); 
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration302);
            iv_ruleType_declaration=ruleType_declaration();

            state._fsp--;

             current =iv_ruleType_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration312); 

            }

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
                    lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleType_declaration354); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
                    		

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
                     
                    	        newCompositeNode(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_declaration_in_ruleType_declaration382);
                    lv_classDec_1_0=ruleClass_declaration();

                    state._fsp--;


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
                     
                    	        newCompositeNode(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_declaration_in_ruleType_declaration409);
                    lv_interfaceDec_2_0=ruleInterface_declaration();

                    state._fsp--;


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
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleType_declaration422); 

                	newLeafNode(otherlv_3, grammarAccess.getType_declarationAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getInterface_declarationRule()); 
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration458);
            iv_ruleInterface_declaration=ruleInterface_declaration();

            state._fsp--;

             current =iv_ruleInterface_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration468); 

            }

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
            	     
            	    	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleInterface_declaration514);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInterface_declaration527); 

                	newLeafNode(otherlv_1, grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1());
                
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:296:1: ( (lv_interfaceName_2_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_interfaceName_2_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_interfaceName_2_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:298:3: lv_interfaceName_2_0= RULE_ID
            {
            lv_interfaceName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface_declaration544); 

            			newLeafNode(lv_interfaceName_2_0, grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            		

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
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleInterface_declaration562); 

                        	newLeafNode(otherlv_3, grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0());
                        
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:318:1: ( (lv_interfaceHerdada_4_0= ruleInterface_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_interfaceHerdada_4_0= ruleInterface_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:320:3: lv_interfaceHerdada_4_0= ruleInterface_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration583);
                    lv_interfaceHerdada_4_0=ruleInterface_name();

                    state._fsp--;


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
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInterface_declaration596); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:340:1: ( (lv_interfacesHerdadas_6_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_interfacesHerdadas_6_0= ruleInterface_name )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:342:3: lv_interfacesHerdadas_6_0= ruleInterface_name
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleInterface_declaration617);
                    	    lv_interfacesHerdadas_6_0=ruleInterface_name();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInterface_declaration633); 

                	newLeafNode(otherlv_7, grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInterface_declaration645); 

                	newLeafNode(otherlv_8, grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getClass_declarationRule()); 
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration681);
            iv_ruleClass_declaration=ruleClass_declaration();

            state._fsp--;

             current =iv_ruleClass_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration691); 

            }

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
            	     
            	    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleClass_declaration737);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleClass_declaration750); 

                	newLeafNode(otherlv_1, grammarAccess.getClass_declarationAccess().getClassKeyword_1());
                
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:409:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_className_2_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:411:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass_declaration767); 

            			newLeafNode(lv_className_2_0, grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            		

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
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClass_declaration785); 

                        	newLeafNode(otherlv_3, grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0());
                        
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:431:1: ( (lv_classHerdada_4_0= ruleClass_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_classHerdada_4_0= ruleClass_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_classHerdada_4_0= ruleClass_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:433:3: lv_classHerdada_4_0= ruleClass_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_name_in_ruleClass_declaration806);
                    lv_classHerdada_4_0=ruleClass_name();

                    state._fsp--;


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
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleClass_declaration821); 

                        	newLeafNode(otherlv_5, grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0());
                        
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:453:1: ( (lv_interfaceImplementada_6_0= ruleInterface_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:454:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:454:1: (lv_interfaceImplementada_6_0= ruleInterface_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:455:3: lv_interfaceImplementada_6_0= ruleInterface_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration842);
                    lv_interfaceImplementada_6_0=ruleInterface_name();

                    state._fsp--;


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
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleClass_declaration855); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:475:1: ( (lv_interfacesImplementadas_8_0= ruleInterface_name ) )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:476:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    {
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:476:1: (lv_interfacesImplementadas_8_0= ruleInterface_name )
                    	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:477:3: lv_interfacesImplementadas_8_0= ruleInterface_name
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInterface_name_in_ruleClass_declaration876);
                    	    lv_interfacesImplementadas_8_0=ruleInterface_name();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleClass_declaration892); 

                	newLeafNode(otherlv_9, grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5());
                
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
            	     
            	    	        newCompositeNode(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_declaration_in_ruleClass_declaration913);
            	    lv_fieldsDeclaration_10_0=ruleField_declaration();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleClass_declaration926); 

                	newLeafNode(otherlv_11, grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getField_declarationRule()); 
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration962);
            iv_ruleField_declaration=ruleField_declaration();

            state._fsp--;

             current =iv_ruleField_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration972); 

            }

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
                            lv_comment_0_0=(Token)match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_ruleField_declaration1015); 

                            			newLeafNode(lv_comment_0_0, grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
                            		

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
                             
                            	        newCompositeNode(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariable_declaration_in_ruleField_declaration1043);
                            lv_variableDeclaration_1_0=ruleVariable_declaration();

                            state._fsp--;


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
                             
                            	        newCompositeNode(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConstructor_declaration_in_ruleField_declaration1070);
                            lv_contructorName_2_0=ruleConstructor_declaration();

                            state._fsp--;


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
                             
                            	        newCompositeNode(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMethod_declaration_in_ruleField_declaration1097);
                            lv_methodName_3_0=ruleMethod_declaration();

                            state._fsp--;


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
                     
                    	        newCompositeNode(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatic_initializer_in_ruleField_declaration1126);
                    lv_staticinitializer_4_0=ruleStatic_initializer();

                    state._fsp--;


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

                            current = forceCreateModelElement(
                                grammarAccess.getField_declarationAccess().getField_declarationAction_2_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleField_declaration1154); 

                        	newLeafNode(otherlv_6, grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getMethod_declarationRule()); 
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration1191);
            iv_ruleMethod_declaration=ruleMethod_declaration();

            state._fsp--;

             current =iv_ruleMethod_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration1201); 

            }

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

        AntlrDatatypeRuleToken lv_statementMethod_7_0 = null;


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
            	     
            	    	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleMethod_declaration1247);
            	    lv_modifiersMethod_0_0=ruleModifier();

            	    state._fsp--;


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
             
            	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMethod_declaration1269);
            lv_typeMethod_1_0=ruleType();

            state._fsp--;


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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:701:2: ( (lv_nameMethod_2_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:702:1: (lv_nameMethod_2_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:702:1: (lv_nameMethod_2_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:703:3: lv_nameMethod_2_0= RULE_ID
            {
            lv_nameMethod_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod_declaration1286); 

            			newLeafNode(lv_nameMethod_2_0, grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
            		

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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMethod_declaration1303); 

                	newLeafNode(otherlv_3, grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3());
                
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
                     
                    	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleMethod_declaration1324);
                    lv_parameterListMethod_4_0=ruleParameter_list();

                    state._fsp--;


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
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleMethod_declaration1337); 

                	newLeafNode(otherlv_5, grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5());
                
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
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleMethod_declaration1350); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6());
            	        

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
                     
                    	        newCompositeNode(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_block_in_ruleMethod_declaration1374);
                    lv_statementMethod_7_0=ruleStatement_block();

                    state._fsp--;


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
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:768:7: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleMethod_declaration1392); 

                        	newLeafNode(otherlv_8, grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_7_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getConstructor_declarationRule()); 
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration1429);
            iv_ruleConstructor_declaration=ruleConstructor_declaration();

            state._fsp--;

             current =iv_ruleConstructor_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration1439); 

            }

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

        AntlrDatatypeRuleToken lv_statementConstructor_5_0 = null;


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
            	     
            	    	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConstructor_declaration1485);
            	    lv_modifiersConstructor_0_0=ruleModifier();

            	    state._fsp--;


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
            lv_nameConstructor_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor_declaration1503); 

            			newLeafNode(lv_nameConstructor_1_0, grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
            		

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleConstructor_declaration1520); 

                	newLeafNode(otherlv_2, grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2());
                
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
                     
                    	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_list_in_ruleConstructor_declaration1541);
                    lv_parameterListConstructor_3_0=ruleParameter_list();

                    state._fsp--;


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
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConstructor_declaration1554); 

                	newLeafNode(otherlv_4, grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4());
                
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:855:1: ( (lv_statementConstructor_5_0= ruleStatement_block ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_statementConstructor_5_0= ruleStatement_block )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_statementConstructor_5_0= ruleStatement_block )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:857:3: lv_statementConstructor_5_0= ruleStatement_block
            {
             
            	        newCompositeNode(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_block_in_ruleConstructor_declaration1575);
            lv_statementConstructor_5_0=ruleStatement_block();

            state._fsp--;


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

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list1611);
            iv_ruleParameter_list=ruleParameter_list();

            state._fsp--;

             current =iv_ruleParameter_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list1621); 

            }

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
             
            	        newCompositeNode(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1667);
            lv_parameter_0_0=ruleParameter();

            state._fsp--;


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
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameter_list1680); 

            	        	newLeafNode(otherlv_1, grammarAccess.getParameter_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:916:1: ( (lv_parameters_2_0= ruleParameter ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_parameters_2_0= ruleParameter )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:918:3: lv_parameters_2_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameter_list1701);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1739);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1749); 

            }

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
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleParameter1795);
            lv_type_0_0=ruleType();

            state._fsp--;


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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:973:2: ( (lv_parameterName_1_0= RULE_ID ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:974:1: (lv_parameterName_1_0= RULE_ID )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:974:1: (lv_parameterName_1_0= RULE_ID )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:975:3: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1812); 

            			newLeafNode(lv_parameterName_1_0, grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            		

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
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleParameter1830); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration1868);
            iv_ruleVariable_declaration=ruleVariable_declaration();

            state._fsp--;

             current =iv_ruleVariable_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration1878); 

            }

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
            	     
            	    	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifier_in_ruleVariable_declaration1924);
            	    lv_modifiersVariable_0_0=ruleModifier();

            	    state._fsp--;


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
             
            	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariable_declaration1946);
            lv_type_1_0=ruleType();

            state._fsp--;


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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1052:2: ( (lv_nameVariable_2_0= ruleVariable_declarator ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1053:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1053:1: (lv_nameVariable_2_0= ruleVariable_declarator )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1054:3: lv_nameVariable_2_0= ruleVariable_declarator
            {
             
            	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration1967);
            lv_nameVariable_2_0=ruleVariable_declarator();

            state._fsp--;


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
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleVariable_declaration1980); 

            	        	newLeafNode(otherlv_3, grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1074:1: ( (lv_names_4_0= ruleVariable_declarator ) )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_names_4_0= ruleVariable_declarator )
            	    {
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_names_4_0= ruleVariable_declarator )
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1076:3: lv_names_4_0= ruleVariable_declarator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_declarator_in_ruleVariable_declaration2001);
            	    lv_names_4_0=ruleVariable_declarator();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleVariable_declaration2015); 

                	newLeafNode(otherlv_5, grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getVariable_declaratorRule()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator2051);
            iv_ruleVariable_declarator=ruleVariable_declarator();

            state._fsp--;

             current =iv_ruleVariable_declarator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator2061); 

            }

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
            lv_nameVariable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable_declarator2103); 

            			newLeafNode(lv_nameVariable_0_0, grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
            		

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
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVariable_declarator2121); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2159);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2169); 

            }

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
             
            	        newCompositeNode(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_specifier_in_ruleType2215);
            lv_typeSpecifier_0_0=ruleType_specifier();

            state._fsp--;


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
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleType2228); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getType_specifierRule()); 
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier2267);
            iv_ruleType_specifier=ruleType_specifier();

            state._fsp--;

             current =iv_ruleType_specifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier2278); 

            }

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
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1204:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleType_specifier2316); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1211:2: kw= 'byte'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleType_specifier2335); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1218:2: kw= 'char'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleType_specifier2354); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1225:2: kw= 'short'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleType_specifier2373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1232:2: kw= 'int'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleType_specifier2392); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1239:2: kw= 'float'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleType_specifier2411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1246:2: kw= 'long'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleType_specifier2430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1253:2: kw= 'double'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleType_specifier2449); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1260:5: this_Class_name_8= ruleClass_name
                    {
                     
                            newCompositeNode(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleClass_name_in_ruleType_specifier2477);
                    this_Class_name_8=ruleClass_name();

                    state._fsp--;


                    		current.merge(this_Class_name_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier2523);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier2534); 

            }

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
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1291:6: this_MOD_0= RULE_MOD
                    {
                    this_MOD_0=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_ruleModifier2574); 

                    		current.merge(this_MOD_0);
                        
                     
                        newLeafNode(this_MOD_0, grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1299:10: this_STATIC_1= RULE_STATIC
                    {
                    this_STATIC_1=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleModifier2600); 

                    		current.merge(this_STATIC_1);
                        
                     
                        newLeafNode(this_STATIC_1, grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
             newCompositeNode(grammarAccess.getStatic_initializerRule()); 
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer2645);
            iv_ruleStatic_initializer=ruleStatic_initializer();

            state._fsp--;

             current =iv_ruleStatic_initializer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer2655); 

            }

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
        AntlrDatatypeRuleToken lv_name_1_0 = null;


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
            lv_static_0_0=(Token)match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_ruleStatic_initializer2697); 

            			newLeafNode(lv_static_0_0, grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
            		

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

            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1345:2: ( (lv_name_1_0= ruleStatement_block ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1346:1: (lv_name_1_0= ruleStatement_block )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1346:1: (lv_name_1_0= ruleStatement_block )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1347:3: lv_name_1_0= ruleStatement_block
            {
             
            	        newCompositeNode(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_block_in_ruleStatic_initializer2723);
            lv_name_1_0=ruleStatement_block();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1371:1: entryRuleStatement_block returns [String current=null] : iv_ruleStatement_block= ruleStatement_block EOF ;
    public final String entryRuleStatement_block() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement_block = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1372:2: (iv_ruleStatement_block= ruleStatement_block EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1373:2: iv_ruleStatement_block= ruleStatement_block EOF
            {
             newCompositeNode(grammarAccess.getStatement_blockRule()); 
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block2760);
            iv_ruleStatement_block=ruleStatement_block();

            state._fsp--;

             current =iv_ruleStatement_block.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block2771); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1380:1: ruleStatement_block returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStatement_block() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1383:28: ( (kw= '{' kw= '}' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1384:1: (kw= '{' kw= '}' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1384:1: (kw= '{' kw= '}' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1385:2: kw= '{' kw= '}'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleStatement_block2809); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleStatement_block2822); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_1()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleImport_statement"
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1404:1: entryRuleImport_statement returns [EObject current=null] : iv_ruleImport_statement= ruleImport_statement EOF ;
    public final EObject entryRuleImport_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport_statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1405:2: (iv_ruleImport_statement= ruleImport_statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1406:2: iv_ruleImport_statement= ruleImport_statement EOF
            {
             newCompositeNode(grammarAccess.getImport_statementRule()); 
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement2862);
            iv_ruleImport_statement=ruleImport_statement();

            state._fsp--;

             current =iv_ruleImport_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement2872); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1413:1: ruleImport_statement returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) ;
    public final EObject ruleImport_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        AntlrDatatypeRuleToken lv_pacName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1416:28: ( (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1417:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1417:1: (otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1417:3: otherlv_0= 'import' ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleImport_statement2909); 

                	newLeafNode(otherlv_0, grammarAccess.getImport_statementAccess().getImportKeyword_0());
                
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1421:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1421:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1421:2: ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1421:3: ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1421:3: ( (lv_className_1_0= ruleClass_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1422:1: (lv_className_1_0= ruleClass_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1422:1: (lv_className_1_0= ruleClass_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1423:3: lv_className_1_0= ruleClass_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_name_in_ruleImport_statement2932);
                    lv_className_1_0=ruleClass_name();

                    state._fsp--;


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

                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleImport_statement2944); 

                        	newLeafNode(otherlv_2, grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1444:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1444:6: ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1444:7: ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;'
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1444:7: ( (lv_pacName_3_0= rulePackage_name ) )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1445:1: (lv_pacName_3_0= rulePackage_name )
                    {
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1445:1: (lv_pacName_3_0= rulePackage_name )
                    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1446:3: lv_pacName_3_0= rulePackage_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_name_in_ruleImport_statement2973);
                    lv_pacName_3_0=rulePackage_name();

                    state._fsp--;


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

                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleImport_statement2985); 

                        	newLeafNode(otherlv_4, grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1474:1: entryRuleClass_name returns [String current=null] : iv_ruleClass_name= ruleClass_name EOF ;
    public final String entryRuleClass_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass_name = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1475:2: (iv_ruleClass_name= ruleClass_name EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1476:2: iv_ruleClass_name= ruleClass_name EOF
            {
             newCompositeNode(grammarAccess.getClass_nameRule()); 
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name3024);
            iv_ruleClass_name=ruleClass_name();

            state._fsp--;

             current =iv_ruleClass_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name3035); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1483:1: ruleClass_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleClass_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1486:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1488:5: this_Package_name_0= rulePackage_name
            {
             
                    newCompositeNode(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name3081);
            this_Package_name_0=rulePackage_name();

            state._fsp--;


            		current.merge(this_Package_name_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1506:1: entryRuleInterface_name returns [String current=null] : iv_ruleInterface_name= ruleInterface_name EOF ;
    public final String entryRuleInterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterface_name = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1507:2: (iv_ruleInterface_name= ruleInterface_name EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1508:2: iv_ruleInterface_name= ruleInterface_name EOF
            {
             newCompositeNode(grammarAccess.getInterface_nameRule()); 
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name3126);
            iv_ruleInterface_name=ruleInterface_name();

            state._fsp--;

             current =iv_ruleInterface_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name3137); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1515:1: ruleInterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Package_name_0= rulePackage_name ;
    public final AntlrDatatypeRuleToken ruleInterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Package_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1518:28: (this_Package_name_0= rulePackage_name )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1520:5: this_Package_name_0= rulePackage_name
            {
             
                    newCompositeNode(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name3183);
            this_Package_name_0=rulePackage_name();

            state._fsp--;


            		current.merge(this_Package_name_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1538:1: entryRulePackage_statement returns [EObject current=null] : iv_rulePackage_statement= rulePackage_statement EOF ;
    public final EObject entryRulePackage_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_statement = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1539:2: (iv_rulePackage_statement= rulePackage_statement EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1540:2: iv_rulePackage_statement= rulePackage_statement EOF
            {
             newCompositeNode(grammarAccess.getPackage_statementRule()); 
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement3227);
            iv_rulePackage_statement=rulePackage_statement();

            state._fsp--;

             current =iv_rulePackage_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement3237); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1547:1: rulePackage_statement returns [EObject current=null] : (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_pacName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1550:28: ( (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1551:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1551:1: (otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';' )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1551:3: otherlv_0= 'package' ( (lv_pacName_1_0= rulePackage_name ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePackage_statement3274); 

                	newLeafNode(otherlv_0, grammarAccess.getPackage_statementAccess().getPackageKeyword_0());
                
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1555:1: ( (lv_pacName_1_0= rulePackage_name ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1556:1: (lv_pacName_1_0= rulePackage_name )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1556:1: (lv_pacName_1_0= rulePackage_name )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1557:3: lv_pacName_1_0= rulePackage_name
            {
             
            	        newCompositeNode(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_name_in_rulePackage_statement3295);
            lv_pacName_1_0=rulePackage_name();

            state._fsp--;


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

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_rulePackage_statement3307); 

                	newLeafNode(otherlv_2, grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1585:1: entryRulePackage_name returns [String current=null] : iv_rulePackage_name= rulePackage_name EOF ;
    public final String entryRulePackage_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1586:2: (iv_rulePackage_name= rulePackage_name EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1587:2: iv_rulePackage_name= rulePackage_name EOF
            {
             newCompositeNode(grammarAccess.getPackage_nameRule()); 
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name3344);
            iv_rulePackage_name=rulePackage_name();

            state._fsp--;

             current =iv_rulePackage_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name3355); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1594:1: rulePackage_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) ;
    public final AntlrDatatypeRuleToken rulePackage_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Package_name_line_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1597:28: ( (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line ) )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1598:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1598:1: (this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1598:6: this_ID_0= RULE_ID this_Package_name_line_1= rulePackage_name_line
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name3395); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePackage_name_line_in_rulePackage_name3422);
            this_Package_name_line_1=rulePackage_name_line();

            state._fsp--;


            		current.merge(this_Package_name_line_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1624:1: entryRulePackage_name_line returns [String current=null] : iv_rulePackage_name_line= rulePackage_name_line EOF ;
    public final String entryRulePackage_name_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage_name_line = null;


        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1625:2: (iv_rulePackage_name_line= rulePackage_name_line EOF )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1626:2: iv_rulePackage_name_line= rulePackage_name_line EOF
            {
             newCompositeNode(grammarAccess.getPackage_name_lineRule()); 
            pushFollow(FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line3468);
            iv_rulePackage_name_line=rulePackage_name_line();

            state._fsp--;

             current =iv_rulePackage_name_line.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_line3479); 

            }

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
    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1633:1: rulePackage_name_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken rulePackage_name_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1636:28: ( (kw= '.' this_ID_1= RULE_ID )* )
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1637:1: (kw= '.' this_ID_1= RULE_ID )*
            {
            // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1637:1: (kw= '.' this_ID_1= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.myjava/src-gen/org/xtext/compilador/java/parser/antlr/internal/InternalMyDsl.g:1638:2: kw= '.' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_rulePackage_name_line3517); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            	        
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage_name_line3532); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

             leaveRule(); 
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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA31 dfa31 = new DFA31(this);
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
        "\15\5\1\13\1\5\3\uffff\1\5";
    static final String DFA15_maxS =
        "\3\35\10\25\1\41\2\25\1\5\3\uffff\1\41";
    static final String DFA15_acceptS =
        "\17\uffff\1\2\1\1\1\3\1\uffff";
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
            "\1\15\15\uffff\1\17\1\uffff\1\14\13\uffff\1\16",
            "\1\15\17\uffff\1\14",
            "\1\20\2\uffff\1\20\4\uffff\1\21\1\uffff\1\20",
            "\1\22",
            "",
            "",
            "",
            "\1\15\17\uffff\1\14\13\uffff\1\16"
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
    static final String DFA31_eotS =
        "\6\uffff";
    static final String DFA31_eofS =
        "\6\uffff";
    static final String DFA31_minS =
        "\1\5\1\13\1\5\2\uffff\1\13";
    static final String DFA31_maxS =
        "\1\5\1\41\1\5\2\uffff\1\41";
    static final String DFA31_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA31_specialS =
        "\6\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\4\23\uffff\1\3\1\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\4\23\uffff\1\3\1\uffff\1\2"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1421:1: ( ( ( (lv_className_1_0= ruleClass_name ) ) otherlv_2= ';' ) | ( ( (lv_pacName_3_0= rulePackage_name ) ) otherlv_4= '.*;' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_ruleCompilation_unit221 = new BitSet(new long[]{0x00000000400210D2L});
    public static final BitSet FOLLOW_ruleImport_statement_in_ruleCompilation_unit243 = new BitSet(new long[]{0x00000000400210D2L});
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
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatement_block2809 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement_block2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement2862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleImport_statement2909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClass_name_in_ruleImport_statement2932 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleImport_statement2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleImport_statement2973 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleImport_statement2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement3227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePackage_statement3274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePackage_name_in_rulePackage_statement3295 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePackage_statement3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name3344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name3395 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rulePackage_name3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line3468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_line3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePackage_name_line3517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage_name_line3532 = new BitSet(new long[]{0x0000000200000002L});

}