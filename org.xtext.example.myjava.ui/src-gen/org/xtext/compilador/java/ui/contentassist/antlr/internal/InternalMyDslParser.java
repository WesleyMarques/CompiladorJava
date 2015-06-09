package org.xtext.compilador.java.ui.contentassist.antlr.internal; 

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
import org.xtext.compilador.java.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MOD", "RULE_STATIC", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'interface'", "'{'", "'}'", "'extends'", "','", "'class'", "'implements'", "'('", "')'", "'[]'", "':'", "'break'", "'continue'", "'while('", "'do'", "');'", "'if('", "'else'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int RULE_DOC_COMMENT=7;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_STATIC=5;
    public static final int RULE_MOD=4;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
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
    public String getGrammarFileName() { return "../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ( ruleModel EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:70:1: ruleModel : ( ( rule__Model__GreetingsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:74:2: ( ( ( rule__Model__GreetingsAssignment ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__GreetingsAssignment ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__GreetingsAssignment ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__GreetingsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( rule__Model__GreetingsAssignment )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:77:2: rule__Model__GreetingsAssignment
            {
            pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel100);
            rule__Model__GreetingsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsAssignment()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCompilation_unit"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: entryRuleCompilation_unit : ruleCompilation_unit EOF ;
    public final void entryRuleCompilation_unit() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ( ruleCompilation_unit EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: ruleCompilation_unit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitRule()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit127);
            ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompilation_unit"


    // $ANTLR start "ruleCompilation_unit"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:98:1: ruleCompilation_unit : ( ( rule__Compilation_unit__Group__0 ) ) ;
    public final void ruleCompilation_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:102:2: ( ( ( rule__Compilation_unit__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( ( rule__Compilation_unit__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( ( rule__Compilation_unit__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Compilation_unit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( rule__Compilation_unit__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:105:2: rule__Compilation_unit__Group__0
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0_in_ruleCompilation_unit160);
            rule__Compilation_unit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getGroup()); 
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
    // $ANTLR end "ruleCompilation_unit"


    // $ANTLR start "entryRuleType_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: entryRuleType_declaration : ruleType_declaration EOF ;
    public final void entryRuleType_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ( ruleType_declaration EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ruleType_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration187);
            ruleType_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType_declaration"


    // $ANTLR start "ruleType_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:126:1: ruleType_declaration : ( ( rule__Type_declaration__Group__0 ) ) ;
    public final void ruleType_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:130:2: ( ( ( rule__Type_declaration__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( ( rule__Type_declaration__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( ( rule__Type_declaration__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Type_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( rule__Type_declaration__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:133:2: rule__Type_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0_in_ruleType_declaration220);
            rule__Type_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getGroup()); 
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
    // $ANTLR end "ruleType_declaration"


    // $ANTLR start "entryRuleInterface_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: entryRuleInterface_declaration : ruleInterface_declaration EOF ;
    public final void entryRuleInterface_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ( ruleInterface_declaration EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ruleInterface_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration247);
            ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInterface_declaration"


    // $ANTLR start "ruleInterface_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:154:1: ruleInterface_declaration : ( ( rule__Interface_declaration__Group__0 ) ) ;
    public final void ruleInterface_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:158:2: ( ( ( rule__Interface_declaration__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( ( rule__Interface_declaration__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( ( rule__Interface_declaration__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Interface_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__Interface_declaration__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:161:2: rule__Interface_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0_in_ruleInterface_declaration280);
            rule__Interface_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getGroup()); 
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
    // $ANTLR end "ruleInterface_declaration"


    // $ANTLR start "entryRuleClass_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: entryRuleClass_declaration : ruleClass_declaration EOF ;
    public final void entryRuleClass_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ( ruleClass_declaration EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ruleClass_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration307);
            ruleClass_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClass_declaration"


    // $ANTLR start "ruleClass_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:182:1: ruleClass_declaration : ( ( rule__Class_declaration__Group__0 ) ) ;
    public final void ruleClass_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:186:2: ( ( ( rule__Class_declaration__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( ( rule__Class_declaration__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( ( rule__Class_declaration__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Class_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__Class_declaration__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:189:2: rule__Class_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0_in_ruleClass_declaration340);
            rule__Class_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup()); 
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
    // $ANTLR end "ruleClass_declaration"


    // $ANTLR start "entryRuleField_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: entryRuleField_declaration : ruleField_declaration EOF ;
    public final void entryRuleField_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ( ruleField_declaration EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: ruleField_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration367);
            ruleField_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleField_declaration"


    // $ANTLR start "ruleField_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:210:1: ruleField_declaration : ( ( rule__Field_declaration__Alternatives ) ) ;
    public final void ruleField_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:214:2: ( ( ( rule__Field_declaration__Alternatives ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( ( rule__Field_declaration__Alternatives ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( ( rule__Field_declaration__Alternatives ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Field_declaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getAlternatives()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( rule__Field_declaration__Alternatives )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:217:2: rule__Field_declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_in_ruleField_declaration400);
            rule__Field_declaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleField_declaration"


    // $ANTLR start "entryRuleMethod_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: entryRuleMethod_declaration : ruleMethod_declaration EOF ;
    public final void entryRuleMethod_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ( ruleMethod_declaration EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ruleMethod_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration427);
            ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethod_declaration"


    // $ANTLR start "ruleMethod_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:238:1: ruleMethod_declaration : ( ( rule__Method_declaration__Group__0 ) ) ;
    public final void ruleMethod_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:242:2: ( ( ( rule__Method_declaration__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( ( rule__Method_declaration__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( ( rule__Method_declaration__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Method_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( rule__Method_declaration__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:245:2: rule__Method_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0_in_ruleMethod_declaration460);
            rule__Method_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getGroup()); 
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
    // $ANTLR end "ruleMethod_declaration"


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: entryRuleConstructor_declaration : ruleConstructor_declaration EOF ;
    public final void entryRuleConstructor_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ( ruleConstructor_declaration EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: ruleConstructor_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration487);
            ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstructor_declaration"


    // $ANTLR start "ruleConstructor_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:266:1: ruleConstructor_declaration : ( ( rule__Constructor_declaration__Group__0 ) ) ;
    public final void ruleConstructor_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:270:2: ( ( ( rule__Constructor_declaration__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( ( rule__Constructor_declaration__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( ( rule__Constructor_declaration__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Constructor_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( rule__Constructor_declaration__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:273:2: rule__Constructor_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration520);
            rule__Constructor_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getGroup()); 
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
    // $ANTLR end "ruleConstructor_declaration"


    // $ANTLR start "entryRuleParameter_list"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: entryRuleParameter_list : ruleParameter_list EOF ;
    public final void entryRuleParameter_list() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ( ruleParameter_list EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: ruleParameter_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list547);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:294:1: ruleParameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleParameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:298:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( ( rule__Parameter_list__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( ( rule__Parameter_list__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Parameter_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( rule__Parameter_list__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:301:2: rule__Parameter_list__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list580);
            rule__Parameter_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getGroup()); 
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
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( ruleParameter EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter607);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:322:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:326:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( rule__Parameter__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:329:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter640);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: entryRuleVariable_declaration : ruleVariable_declaration EOF ;
    public final void entryRuleVariable_declaration() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( ruleVariable_declaration EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ruleVariable_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration667);
            ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable_declaration"


    // $ANTLR start "ruleVariable_declaration"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:350:1: ruleVariable_declaration : ( ( rule__Variable_declaration__Group__0 ) ) ;
    public final void ruleVariable_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:354:2: ( ( ( rule__Variable_declaration__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( ( rule__Variable_declaration__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( ( rule__Variable_declaration__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Variable_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( rule__Variable_declaration__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:357:2: rule__Variable_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration700);
            rule__Variable_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getGroup()); 
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
    // $ANTLR end "ruleVariable_declaration"


    // $ANTLR start "entryRuleVariable_declarator"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: entryRuleVariable_declarator : ruleVariable_declarator EOF ;
    public final void entryRuleVariable_declarator() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( ruleVariable_declarator EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ruleVariable_declarator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator727);
            ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable_declarator"


    // $ANTLR start "ruleVariable_declarator"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:378:1: ruleVariable_declarator : ( ( rule__Variable_declarator__Group__0 ) ) ;
    public final void ruleVariable_declarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:382:2: ( ( ( rule__Variable_declarator__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( ( rule__Variable_declarator__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( ( rule__Variable_declarator__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__Variable_declarator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( rule__Variable_declarator__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:385:2: rule__Variable_declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator760);
            rule__Variable_declarator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getGroup()); 
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
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ( ruleType EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType787);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:406:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:410:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( ( rule__Type__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( ( rule__Type__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( rule__Type__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:413:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType820);
            rule__Type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_specifier"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: entryRuleType_specifier : ruleType_specifier EOF ;
    public final void entryRuleType_specifier() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( ruleType_specifier EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ruleType_specifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_specifierRule()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier847);
            ruleType_specifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_specifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType_specifier"


    // $ANTLR start "ruleType_specifier"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ruleType_specifier : ( ( rule__Type_specifier__Alternatives ) ) ;
    public final void ruleType_specifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:438:2: ( ( ( rule__Type_specifier__Alternatives ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( ( rule__Type_specifier__Alternatives ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( ( rule__Type_specifier__Alternatives ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__Type_specifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_specifierAccess().getAlternatives()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( rule__Type_specifier__Alternatives )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:441:2: rule__Type_specifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier880);
            rule__Type_specifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_specifierAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType_specifier"


    // $ANTLR start "entryRuleModifier"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ( ruleModifier EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier907);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:466:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( ( rule__Modifier__Alternatives ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( ( rule__Modifier__Alternatives ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__Modifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModifierAccess().getAlternatives()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( rule__Modifier__Alternatives )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:469:2: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Modifier__Alternatives_in_ruleModifier940);
            rule__Modifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModifierAccess().getAlternatives()); 
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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleStatic_initializer"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: entryRuleStatic_initializer : ruleStatic_initializer EOF ;
    public final void entryRuleStatic_initializer() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ( ruleStatic_initializer EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ruleStatic_initializer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerRule()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer967);
            ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatic_initializer"


    // $ANTLR start "ruleStatic_initializer"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: ruleStatic_initializer : ( ( rule__Static_initializer__Group__0 ) ) ;
    public final void ruleStatic_initializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:494:2: ( ( ( rule__Static_initializer__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( rule__Static_initializer__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( ( rule__Static_initializer__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__Static_initializer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__Static_initializer__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:497:2: rule__Static_initializer__Group__0
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer1000);
            rule__Static_initializer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getGroup()); 
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
    // $ANTLR end "ruleStatic_initializer"


    // $ANTLR start "entryRuleStatement_block"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: entryRuleStatement_block : ruleStatement_block EOF ;
    public final void entryRuleStatement_block() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ( ruleStatement_block EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ruleStatement_block EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block1027);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement_block"


    // $ANTLR start "ruleStatement_block"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ruleStatement_block : ( ( rule__Statement_block__Group__0 ) ) ;
    public final void ruleStatement_block() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:522:2: ( ( ( rule__Statement_block__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( ( rule__Statement_block__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( ( rule__Statement_block__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Statement_block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( rule__Statement_block__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:525:2: rule__Statement_block__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block1060);
            rule__Statement_block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getGroup()); 
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
    // $ANTLR end "ruleStatement_block"


    // $ANTLR start "entryRuleStatement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( ruleStatement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1087);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:550:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Statement__Alternatives ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__Statement__Alternatives )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:553:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement1120);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleWhile_Statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: entryRuleWhile_Statement : ruleWhile_Statement EOF ;
    public final void entryRuleWhile_Statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( ruleWhile_Statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ruleWhile_Statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement1147);
            ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_StatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile_Statement1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhile_Statement"


    // $ANTLR start "ruleWhile_Statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: ruleWhile_Statement : ( ( rule__While_Statement__Group__0 ) ) ;
    public final void ruleWhile_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:578:2: ( ( ( rule__While_Statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__While_Statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__While_Statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__While_Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__While_Statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__While_Statement__Group__0
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__0_in_ruleWhile_Statement1180);
            rule__While_Statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_StatementAccess().getGroup()); 
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
    // $ANTLR end "ruleWhile_Statement"


    // $ANTLR start "entryRuleDo_Statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: entryRuleDo_Statement : ruleDo_Statement EOF ;
    public final void entryRuleDo_Statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( ruleDo_Statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ruleDo_Statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementRule()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement1207);
            ruleDo_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo_Statement1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDo_Statement"


    // $ANTLR start "ruleDo_Statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ruleDo_Statement : ( ( rule__Do_Statement__Group__0 ) ) ;
    public final void ruleDo_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: ( ( ( rule__Do_Statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__Do_Statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__Do_Statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__Do_Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__Do_Statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:609:2: rule__Do_Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__0_in_ruleDo_Statement1240);
            rule__Do_Statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementAccess().getGroup()); 
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
    // $ANTLR end "ruleDo_Statement"


    // $ANTLR start "entryRuleIf_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: entryRuleIf_statement : ruleIf_statement EOF ;
    public final void entryRuleIf_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ( ruleIf_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ruleIf_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementRule()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_entryRuleIf_statement1267);
            ruleIf_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf_statement1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIf_statement"


    // $ANTLR start "ruleIf_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ruleIf_statement : ( ( rule__If_statement__Group__0 ) ) ;
    public final void ruleIf_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: ( ( ( rule__If_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( rule__If_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( rule__If_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( rule__If_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__If_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:637:2: rule__If_statement__Group__0
            {
            pushFollow(FOLLOW_rule__If_statement__Group__0_in_ruleIf_statement1300);
            rule__If_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getGroup()); 
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
    // $ANTLR end "ruleIf_statement"


    // $ANTLR start "entryRuleTry_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: entryRuleTry_statement : ruleTry_statement EOF ;
    public final void entryRuleTry_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( ruleTry_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ruleTry_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementRule()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_entryRuleTry_statement1327);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTry_statement1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTry_statement"


    // $ANTLR start "ruleTry_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ruleTry_statement : ( ( rule__Try_statement__Group__0 ) ) ;
    public final void ruleTry_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:662:2: ( ( ( rule__Try_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( rule__Try_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( rule__Try_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__Try_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( rule__Try_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:665:2: rule__Try_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1360);
            rule__Try_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getGroup()); 
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
    // $ANTLR end "ruleTry_statement"


    // $ANTLR start "entryRuleImport_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: entryRuleImport_statement : ruleImport_statement EOF ;
    public final void entryRuleImport_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( ruleImport_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ruleImport_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementRule()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement1387);
            ruleImport_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement1394); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport_statement"


    // $ANTLR start "ruleImport_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ruleImport_statement : ( ( rule__Import_statement__Group__0 ) ) ;
    public final void ruleImport_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:690:2: ( ( ( rule__Import_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( rule__Import_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ( rule__Import_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__Import_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Import_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:693:2: rule__Import_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1420);
            rule__Import_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getGroup()); 
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
    // $ANTLR end "ruleImport_statement"


    // $ANTLR start "entryRuleClass_name"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: entryRuleClass_name : ruleClass_name EOF ;
    public final void entryRuleClass_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( ruleClass_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ruleClass_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameRule()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name1447);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name1454); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClass_name"


    // $ANTLR start "ruleClass_name"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ruleClass_name : ( rulePackage_name ) ;
    public final void ruleClass_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:718:2: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name1480);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
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
    // $ANTLR end "ruleClass_name"


    // $ANTLR start "entryRuleInterface_name"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: entryRuleInterface_name : ruleInterface_name EOF ;
    public final void entryRuleInterface_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( ruleInterface_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ruleInterface_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name1506);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name1513); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInterface_name"


    // $ANTLR start "ruleInterface_name"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ruleInterface_name : ( rulePackage_name ) ;
    public final void ruleInterface_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:746:2: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name1539);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
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
    // $ANTLR end "ruleInterface_name"


    // $ANTLR start "entryRulePackage_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: entryRulePackage_statement : rulePackage_statement EOF ;
    public final void entryRulePackage_statement() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( rulePackage_statement EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: rulePackage_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementRule()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement1565);
            rulePackage_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement1572); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackage_statement"


    // $ANTLR start "rulePackage_statement"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: rulePackage_statement : ( ( rule__Package_statement__Group__0 ) ) ;
    public final void rulePackage_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:774:2: ( ( ( rule__Package_statement__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( ( rule__Package_statement__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( ( rule__Package_statement__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__Package_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( rule__Package_statement__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:777:2: rule__Package_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1598);
            rule__Package_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getGroup()); 
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
    // $ANTLR end "rulePackage_statement"


    // $ANTLR start "entryRulePackage_name"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: entryRulePackage_name : rulePackage_name EOF ;
    public final void entryRulePackage_name() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( rulePackage_name EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: rulePackage_name EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name1625);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name1632); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackage_name"


    // $ANTLR start "rulePackage_name"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: rulePackage_name : ( ( rule__Package_name__Group__0 ) ) ;
    public final void rulePackage_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:802:2: ( ( ( rule__Package_name__Group__0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( ( rule__Package_name__Group__0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( ( rule__Package_name__Group__0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__Package_name__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( rule__Package_name__Group__0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:805:2: rule__Package_name__Group__0
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1658);
            rule__Package_name__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameAccess().getGroup()); 
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
    // $ANTLR end "rulePackage_name"


    // $ANTLR start "entryRulePackage_name_line"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: entryRulePackage_name_line : rulePackage_name_line EOF ;
    public final void entryRulePackage_name_line() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rulePackage_name_line EOF )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: rulePackage_name_line EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineRule()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line1685);
            rulePackage_name_line();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_lineRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_line1692); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackage_name_line"


    // $ANTLR start "rulePackage_name_line"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rulePackage_name_line : ( ( rule__Package_name_line__Group__0 )* ) ;
    public final void rulePackage_name_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:830:2: ( ( ( rule__Package_name_line__Group__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Package_name_line__Group__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Package_name_line__Group__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Package_name_line__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getGroup()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( rule__Package_name_line__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:833:2: rule__Package_name_line__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Package_name_line__Group__0_in_rulePackage_name_line1718);
            	    rule__Package_name_line__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_lineAccess().getGroup()); 
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
    // $ANTLR end "rulePackage_name_line"


    // $ANTLR start "rule__Type_declaration__Alternatives_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) );
    public final void rule__Type_declaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( rule__Type_declaration__ClassDecAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getClassDecAssignment_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( rule__Type_declaration__ClassDecAssignment_1_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:852:2: rule__Type_declaration__ClassDecAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__ClassDecAssignment_1_0_in_rule__Type_declaration__Alternatives_11755);
                    rule__Type_declaration__ClassDecAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_declarationAccess().getClassDecAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:856:6: ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:856:6: ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( rule__Type_declaration__InterfaceDecAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_declarationAccess().getInterfaceDecAssignment_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( rule__Type_declaration__InterfaceDecAssignment_1_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:858:2: rule__Type_declaration__InterfaceDecAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__InterfaceDecAssignment_1_1_in_rule__Type_declaration__Alternatives_11773);
                    rule__Type_declaration__InterfaceDecAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_declarationAccess().getInterfaceDecAssignment_1_1()); 
                    }

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
    // $ANTLR end "rule__Type_declaration__Alternatives_1"


    // $ANTLR start "rule__Field_declaration__Alternatives"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: rule__Field_declaration__Alternatives : ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) ) | ( ( rule__Field_declaration__Group_2__0 ) ) );
    public final void rule__Field_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) ) | ( ( rule__Field_declaration__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_MOD:
            case RULE_ID:
            case RULE_DOC_COMMENT:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt3=1;
                }
                break;
            case RULE_STATIC:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=RULE_MOD && LA3_2<=RULE_ID)||(LA3_2>=12 && LA3_2<=19)) ) {
                    alt3=1;
                }
                else if ( (LA3_2==21) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( rule__Field_declaration__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( rule__Field_declaration__Group_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:874:2: rule__Field_declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1806);
                    rule__Field_declaration__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:878:6: ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:878:6: ( ( rule__Field_declaration__StaticinitializerAssignment_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( rule__Field_declaration__StaticinitializerAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getStaticinitializerAssignment_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( rule__Field_declaration__StaticinitializerAssignment_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:880:2: rule__Field_declaration__StaticinitializerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__StaticinitializerAssignment_1_in_rule__Field_declaration__Alternatives1824);
                    rule__Field_declaration__StaticinitializerAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getStaticinitializerAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( ( rule__Field_declaration__Group_2__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:884:6: ( ( rule__Field_declaration__Group_2__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( rule__Field_declaration__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getGroup_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( rule__Field_declaration__Group_2__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:886:2: rule__Field_declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_2__0_in_rule__Field_declaration__Alternatives1842);
                    rule__Field_declaration__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getGroup_2()); 
                    }

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
    // $ANTLR end "rule__Field_declaration__Alternatives"


    // $ANTLR start "rule__Field_declaration__Alternatives_0_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) );
    public final void rule__Field_declaration__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getVariableDeclarationAssignment_0_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:902:2: rule__Field_declaration__VariableDeclarationAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__VariableDeclarationAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11875);
                    rule__Field_declaration__VariableDeclarationAssignment_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getVariableDeclarationAssignment_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:906:6: ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:906:6: ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: ( rule__Field_declaration__ContructorNameAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getContructorNameAssignment_0_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( rule__Field_declaration__ContructorNameAssignment_0_1_1 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:908:2: rule__Field_declaration__ContructorNameAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__ContructorNameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11893);
                    rule__Field_declaration__ContructorNameAssignment_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getContructorNameAssignment_0_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:912:6: ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:912:6: ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( rule__Field_declaration__MethodNameAssignment_0_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_declarationAccess().getMethodNameAssignment_0_1_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( rule__Field_declaration__MethodNameAssignment_0_1_2 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:914:2: rule__Field_declaration__MethodNameAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__MethodNameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11911);
                    rule__Field_declaration__MethodNameAssignment_0_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_declarationAccess().getMethodNameAssignment_0_1_2()); 
                    }

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
    // $ANTLR end "rule__Field_declaration__Alternatives_0_1"


    // $ANTLR start "rule__Method_declaration__Alternatives_7"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: rule__Method_declaration__Alternatives_7 : ( ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) ) | ( ';' ) );
    public final void rule__Method_declaration__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) ) | ( ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( ( rule__Method_declaration__StatementMethodAssignment_7_0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( rule__Method_declaration__StatementMethodAssignment_7_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getStatementMethodAssignment_7_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( rule__Method_declaration__StatementMethodAssignment_7_0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:930:2: rule__Method_declaration__StatementMethodAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__StatementMethodAssignment_7_0_in_rule__Method_declaration__Alternatives_71944);
                    rule__Method_declaration__StatementMethodAssignment_7_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethod_declarationAccess().getStatementMethodAssignment_7_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:934:6: ( ';' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:934:6: ( ';' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_7_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Method_declaration__Alternatives_71963); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethod_declarationAccess().getSemicolonKeyword_7_1()); 
                    }

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
    // $ANTLR end "rule__Method_declaration__Alternatives_7"


    // $ANTLR start "rule__Type_specifier__Alternatives"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: rule__Type_specifier__Alternatives : ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) );
    public final void rule__Type_specifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 17:
                {
                alt6=6;
                }
                break;
            case 18:
                {
                alt6=7;
                }
                break;
            case 19:
                {
                alt6=8;
                }
                break;
            case RULE_ID:
                {
                alt6=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( 'boolean' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( 'boolean' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Type_specifier__Alternatives1998); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:960:6: ( 'byte' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:960:6: ( 'byte' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: 'byte'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Type_specifier__Alternatives2018); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:968:6: ( 'char' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:968:6: ( 'char' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: 'char'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Type_specifier__Alternatives2038); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:976:6: ( 'short' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:976:6: ( 'short' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: 'short'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Type_specifier__Alternatives2058); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:984:6: ( 'int' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:984:6: ( 'int' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Type_specifier__Alternatives2078); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:992:6: ( 'float' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:992:6: ( 'float' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Type_specifier__Alternatives2098); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:6: ( 'long' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:6: ( 'long' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: 'long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Type_specifier__Alternatives2118); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:6: ( 'double' )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:6: ( 'double' )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Type_specifier__Alternatives2138); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:6: ( ruleClass_name )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:6: ( ruleClass_name )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: ruleClass_name
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives2157);
                    ruleClass_name();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    }

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
    // $ANTLR end "rule__Type_specifier__Alternatives"


    // $ANTLR start "rule__Modifier__Alternatives"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: rule__Modifier__Alternatives : ( ( RULE_MOD ) | ( RULE_STATIC ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( ( RULE_MOD ) | ( RULE_STATIC ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_MOD) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STATIC) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( RULE_MOD )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( RULE_MOD )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: RULE_MOD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }
                    match(input,RULE_MOD,FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2189); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getMODTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:6: ( RULE_STATIC )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:6: ( RULE_STATIC )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: RULE_STATIC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2206); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModifierAccess().getSTATICTerminalRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Modifier__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_3 ) ) | ( ( rule__Statement__DoStatementAssignment_4 ) ) | ( ( rule__Statement__WhileStatementAssignment_5 ) ) | ( ( rule__Statement__TryStatementAssignment_6 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( ( ruleStatement_block ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_3 ) ) | ( ( rule__Statement__DoStatementAssignment_4 ) ) | ( ( rule__Statement__WhileStatementAssignment_5 ) ) | ( ( rule__Statement__TryStatementAssignment_6 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ruleStatement_block )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( ruleStatement_block )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ruleStatement_block
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2238);
                    ruleStatement_block();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getStatement_blockParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( rule__Statement__Group_1__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives2255);
                    rule__Statement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:6: ( ruleVariable_declaration )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:6: ( ruleVariable_declaration )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2273);
                    ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:6: ( ( rule__Statement__IfStatementAssignment_3 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:6: ( ( rule__Statement__IfStatementAssignment_3 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( rule__Statement__IfStatementAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementAssignment_3()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( rule__Statement__IfStatementAssignment_3 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:2: rule__Statement__IfStatementAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Statement__IfStatementAssignment_3_in_rule__Statement__Alternatives2290);
                    rule__Statement__IfStatementAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:6: ( ( rule__Statement__DoStatementAssignment_4 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:6: ( ( rule__Statement__DoStatementAssignment_4 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( rule__Statement__DoStatementAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDoStatementAssignment_4()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( rule__Statement__DoStatementAssignment_4 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:2: rule__Statement__DoStatementAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Statement__DoStatementAssignment_4_in_rule__Statement__Alternatives2308);
                    rule__Statement__DoStatementAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDoStatementAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:6: ( ( rule__Statement__WhileStatementAssignment_5 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:6: ( ( rule__Statement__WhileStatementAssignment_5 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( rule__Statement__WhileStatementAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileStatementAssignment_5()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( rule__Statement__WhileStatementAssignment_5 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:2: rule__Statement__WhileStatementAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Statement__WhileStatementAssignment_5_in_rule__Statement__Alternatives2326);
                    rule__Statement__WhileStatementAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileStatementAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:6: ( ( rule__Statement__TryStatementAssignment_6 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:6: ( ( rule__Statement__TryStatementAssignment_6 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( rule__Statement__TryStatementAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTryStatementAssignment_6()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( rule__Statement__TryStatementAssignment_6 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:2: rule__Statement__TryStatementAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Statement__TryStatementAssignment_6_in_rule__Statement__Alternatives2344);
                    rule__Statement__TryStatementAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getTryStatementAssignment_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:6: ( ( rule__Statement__Group_7__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:6: ( ( rule__Statement__Group_7__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( rule__Statement__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_7()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( rule__Statement__Group_7__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:2: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives2362);
                    rule__Statement__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:6: ( ( rule__Statement__Group_8__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:6: ( ( rule__Statement__Group_8__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( rule__Statement__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_8()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( rule__Statement__Group_8__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:2: rule__Statement__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives2380);
                    rule__Statement__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:6: ( ( rule__Statement__Group_9__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:6: ( ( rule__Statement__Group_9__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( rule__Statement__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_9()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( rule__Statement__Group_9__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:2: rule__Statement__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_9__0_in_rule__Statement__Alternatives2398);
                    rule__Statement__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_9()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Import_statement__Alternatives_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );
    public final void rule__Import_statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( rule__Import_statement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ( rule__Import_statement__Group_1_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:2: rule__Import_statement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12431);
                    rule__Import_statement__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( rule__Import_statement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( rule__Import_statement__Group_1_1__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:2: rule__Import_statement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12449);
                    rule__Import_statement__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__Import_statement__Alternatives_1"


    // $ANTLR start "rule__Compilation_unit__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: rule__Compilation_unit__Group__0 : rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 ;
    public final void rule__Compilation_unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:2: rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02480);
            rule__Compilation_unit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02483);
            rule__Compilation_unit__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compilation_unit__Group__0"


    // $ANTLR start "rule__Compilation_unit__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: rule__Compilation_unit__Group__0__Impl : ( ( rule__Compilation_unit__NameAssignment_0 )? ) ;
    public final void rule__Compilation_unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( ( rule__Compilation_unit__NameAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( rule__Compilation_unit__NameAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNameAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__Compilation_unit__NameAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:2: rule__Compilation_unit__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2510);
                    rule__Compilation_unit__NameAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Compilation_unit__Group__0__Impl"


    // $ANTLR start "rule__Compilation_unit__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: rule__Compilation_unit__Group__1 : rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 ;
    public final void rule__Compilation_unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:2: rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12541);
            rule__Compilation_unit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12544);
            rule__Compilation_unit__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compilation_unit__Group__1"


    // $ANTLR start "rule__Compilation_unit__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: rule__Compilation_unit__Group__1__Impl : ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) ;
    public final void rule__Compilation_unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:2: rule__Compilation_unit__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2571);
            	    rule__Compilation_unit__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
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
    // $ANTLR end "rule__Compilation_unit__Group__1__Impl"


    // $ANTLR start "rule__Compilation_unit__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: rule__Compilation_unit__Group__2 : rule__Compilation_unit__Group__2__Impl ;
    public final void rule__Compilation_unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( rule__Compilation_unit__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:2: rule__Compilation_unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22602);
            rule__Compilation_unit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compilation_unit__Group__2"


    // $ANTLR start "rule__Compilation_unit__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: rule__Compilation_unit__Group__2__Impl : ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) ;
    public final void rule__Compilation_unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ( ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_MOD && LA12_0<=RULE_STATIC)||LA12_0==RULE_DOC_COMMENT||LA12_0==20||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:2: rule__Compilation_unit__TypeDeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2629);
            	    rule__Compilation_unit__TypeDeclarationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsAssignment_2()); 
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
    // $ANTLR end "rule__Compilation_unit__Group__2__Impl"


    // $ANTLR start "rule__Type_declaration__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: rule__Type_declaration__Group__0 : rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 ;
    public final void rule__Type_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ( rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:2: rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02666);
            rule__Type_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02669);
            rule__Type_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Type_declaration__Group__0"


    // $ANTLR start "rule__Type_declaration__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: rule__Type_declaration__Group__0__Impl : ( ( rule__Type_declaration__CommentAssignment_0 )? ) ;
    public final void rule__Type_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:1: ( ( ( rule__Type_declaration__CommentAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ( rule__Type_declaration__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: ( rule__Type_declaration__CommentAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOC_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:2: rule__Type_declaration__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2696);
                    rule__Type_declaration__CommentAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getCommentAssignment_0()); 
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
    // $ANTLR end "rule__Type_declaration__Group__0__Impl"


    // $ANTLR start "rule__Type_declaration__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: rule__Type_declaration__Group__1 : rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 ;
    public final void rule__Type_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ( rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:2: rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12727);
            rule__Type_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12730);
            rule__Type_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Type_declaration__Group__1"


    // $ANTLR start "rule__Type_declaration__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: rule__Type_declaration__Group__1__Impl : ( ( rule__Type_declaration__Alternatives_1 ) ) ;
    public final void rule__Type_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( ( ( rule__Type_declaration__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: ( rule__Type_declaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: ( rule__Type_declaration__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:2: rule__Type_declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2757);
            rule__Type_declaration__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Type_declaration__Group__1__Impl"


    // $ANTLR start "rule__Type_declaration__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: rule__Type_declaration__Group__2 : rule__Type_declaration__Group__2__Impl ;
    public final void rule__Type_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( rule__Type_declaration__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:2: rule__Type_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22787);
            rule__Type_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Type_declaration__Group__2"


    // $ANTLR start "rule__Type_declaration__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: rule__Type_declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Type_declaration__Group__2__Impl2815); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Type_declaration__Group__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: rule__Interface_declaration__Group__0 : rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 ;
    public final void rule__Interface_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: ( rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:2: rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02852);
            rule__Interface_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02855);
            rule__Interface_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group__0"


    // $ANTLR start "rule__Interface_declaration__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: rule__Interface_declaration__Group__0__Impl : ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Interface_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: ( ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_MOD && LA14_0<=RULE_STATIC)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:2: rule__Interface_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2882);
            	    rule__Interface_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
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
    // $ANTLR end "rule__Interface_declaration__Group__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__Interface_declaration__Group__1 : rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 ;
    public final void rule__Interface_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:2: rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12913);
            rule__Interface_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12916);
            rule__Interface_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group__1"


    // $ANTLR start "rule__Interface_declaration__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: rule__Interface_declaration__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ( ( 'interface' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( 'interface' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( 'interface' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2944); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
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
    // $ANTLR end "rule__Interface_declaration__Group__1__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: rule__Interface_declaration__Group__2 : rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 ;
    public final void rule__Interface_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:2: rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22975);
            rule__Interface_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22978);
            rule__Interface_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group__2"


    // $ANTLR start "rule__Interface_declaration__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: rule__Interface_declaration__Group__2__Impl : ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) ;
    public final void rule__Interface_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: ( ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:2: rule__Interface_declaration__InterfaceNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl3005);
            rule__Interface_declaration__InterfaceNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
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
    // $ANTLR end "rule__Interface_declaration__Group__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: rule__Interface_declaration__Group__3 : rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 ;
    public final void rule__Interface_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:2: rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__33035);
            rule__Interface_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__33038);
            rule__Interface_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group__3"


    // $ANTLR start "rule__Interface_declaration__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: rule__Interface_declaration__Group__3__Impl : ( ( rule__Interface_declaration__Group_3__0 )? ) ;
    public final void rule__Interface_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( ( ( rule__Interface_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( rule__Interface_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( rule__Interface_declaration__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:2: rule__Interface_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl3065);
                    rule__Interface_declaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Interface_declaration__Group__3__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: rule__Interface_declaration__Group__4 : rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 ;
    public final void rule__Interface_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:2: rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__43096);
            rule__Interface_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__43099);
            rule__Interface_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group__4"


    // $ANTLR start "rule__Interface_declaration__Group__4__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: rule__Interface_declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl3127); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Interface_declaration__Group__4__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__5"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: rule__Interface_declaration__Group__5 : rule__Interface_declaration__Group__5__Impl ;
    public final void rule__Interface_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( rule__Interface_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:2: rule__Interface_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__53158);
            rule__Interface_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group__5"


    // $ANTLR start "rule__Interface_declaration__Group__5__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: rule__Interface_declaration__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl3186); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Interface_declaration__Group__5__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: rule__Interface_declaration__Group_3__0 : rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 ;
    public final void rule__Interface_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:2: rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__03229);
            rule__Interface_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03232);
            rule__Interface_declaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group_3__0"


    // $ANTLR start "rule__Interface_declaration__Group_3__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: rule__Interface_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl3260); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
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
    // $ANTLR end "rule__Interface_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: rule__Interface_declaration__Group_3__1 : rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 ;
    public final void rule__Interface_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:2: rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13291);
            rule__Interface_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13294);
            rule__Interface_declaration__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group_3__1"


    // $ANTLR start "rule__Interface_declaration__Group_3__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: rule__Interface_declaration__Group_3__1__Impl : ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) ;
    public final void rule__Interface_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:2: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3321);
            rule__Interface_declaration__InterfaceHerdadaAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaAssignment_3_1()); 
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
    // $ANTLR end "rule__Interface_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: rule__Interface_declaration__Group_3__2 : rule__Interface_declaration__Group_3__2__Impl ;
    public final void rule__Interface_declaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( rule__Interface_declaration__Group_3__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:2: rule__Interface_declaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23351);
            rule__Interface_declaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group_3__2"


    // $ANTLR start "rule__Interface_declaration__Group_3__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: rule__Interface_declaration__Group_3__2__Impl : ( ( rule__Interface_declaration__Group_3_2__0 )* ) ;
    public final void rule__Interface_declaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ( ( ( rule__Interface_declaration__Group_3_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( rule__Interface_declaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( rule__Interface_declaration__Group_3_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:2: rule__Interface_declaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3378);
            	    rule__Interface_declaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__Interface_declaration__Group_3__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: rule__Interface_declaration__Group_3_2__0 : rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 ;
    public final void rule__Interface_declaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:2: rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03415);
            rule__Interface_declaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03418);
            rule__Interface_declaration__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group_3_2__0"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: rule__Interface_declaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface_declaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl3446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
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
    // $ANTLR end "rule__Interface_declaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: rule__Interface_declaration__Group_3_2__1 : rule__Interface_declaration__Group_3_2__1__Impl ;
    public final void rule__Interface_declaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( rule__Interface_declaration__Group_3_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:2: rule__Interface_declaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13477);
            rule__Interface_declaration__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Interface_declaration__Group_3_2__1"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: rule__Interface_declaration__Group_3_2__1__Impl : ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) ;
    public final void rule__Interface_declaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasAssignment_3_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:2: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3504);
            rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasAssignment_3_2_1()); 
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
    // $ANTLR end "rule__Interface_declaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: rule__Class_declaration__Group__0 : rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 ;
    public final void rule__Class_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:2: rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03538);
            rule__Class_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03541);
            rule__Class_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__0"


    // $ANTLR start "rule__Class_declaration__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: rule__Class_declaration__Group__0__Impl : ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Class_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: ( ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:2: rule__Class_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3568);
            	    rule__Class_declaration__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
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
    // $ANTLR end "rule__Class_declaration__Group__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: rule__Class_declaration__Group__1 : rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 ;
    public final void rule__Class_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:2: rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13599);
            rule__Class_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13602);
            rule__Class_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__1"


    // $ANTLR start "rule__Class_declaration__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: rule__Class_declaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: ( ( 'class' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( 'class' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( 'class' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
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
    // $ANTLR end "rule__Class_declaration__Group__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: rule__Class_declaration__Group__2 : rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 ;
    public final void rule__Class_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:2: rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23661);
            rule__Class_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23664);
            rule__Class_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__2"


    // $ANTLR start "rule__Class_declaration__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: rule__Class_declaration__Group__2__Impl : ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) ;
    public final void rule__Class_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__Class_declaration__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3691);
            rule__Class_declaration__ClassNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
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
    // $ANTLR end "rule__Class_declaration__Group__2__Impl"


    // $ANTLR start "rule__Class_declaration__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: rule__Class_declaration__Group__3 : rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 ;
    public final void rule__Class_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1770:1: ( rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:2: rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33721);
            rule__Class_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33724);
            rule__Class_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__3"


    // $ANTLR start "rule__Class_declaration__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: rule__Class_declaration__Group__3__Impl : ( ( rule__Class_declaration__Group_3__0 )? ) ;
    public final void rule__Class_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: ( ( ( rule__Class_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: ( ( rule__Class_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: ( ( rule__Class_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( rule__Class_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( rule__Class_declaration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:2: rule__Class_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3751);
                    rule__Class_declaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Class_declaration__Group__3__Impl"


    // $ANTLR start "rule__Class_declaration__Group__4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__Class_declaration__Group__4 : rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 ;
    public final void rule__Class_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:2: rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43782);
            rule__Class_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43785);
            rule__Class_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__4"


    // $ANTLR start "rule__Class_declaration__Group__4__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: rule__Class_declaration__Group__4__Impl : ( ( rule__Class_declaration__Group_4__0 )? ) ;
    public final void rule__Class_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:1: ( ( ( rule__Class_declaration__Group_4__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( ( rule__Class_declaration__Group_4__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: ( ( rule__Class_declaration__Group_4__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:1: ( rule__Class_declaration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: ( rule__Class_declaration__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:2: rule__Class_declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3812);
                    rule__Class_declaration__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Class_declaration__Group__4__Impl"


    // $ANTLR start "rule__Class_declaration__Group__5"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__Class_declaration__Group__5 : rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 ;
    public final void rule__Class_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:2: rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53843);
            rule__Class_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53846);
            rule__Class_declaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__5"


    // $ANTLR start "rule__Class_declaration__Group__5__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: rule__Class_declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Class_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Class_declaration__Group__5__Impl"


    // $ANTLR start "rule__Class_declaration__Group__6"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: rule__Class_declaration__Group__6 : rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 ;
    public final void rule__Class_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:2: rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63905);
            rule__Class_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63908);
            rule__Class_declaration__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__6"


    // $ANTLR start "rule__Class_declaration__Group__6__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: rule__Class_declaration__Group__6__Impl : ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) ;
    public final void rule__Class_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:1: ( ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationAssignment_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_MOD && LA20_0<=RULE_DOC_COMMENT)||(LA20_0>=11 && LA20_0<=19)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:2: rule__Class_declaration__FieldsDeclarationAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl3935);
            	    rule__Class_declaration__FieldsDeclarationAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getFieldsDeclarationAssignment_6()); 
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
    // $ANTLR end "rule__Class_declaration__Group__6__Impl"


    // $ANTLR start "rule__Class_declaration__Group__7"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: rule__Class_declaration__Group__7 : rule__Class_declaration__Group__7__Impl ;
    public final void rule__Class_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( rule__Class_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:2: rule__Class_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73966);
            rule__Class_declaration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group__7"


    // $ANTLR start "rule__Class_declaration__Group__7__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: rule__Class_declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,22,FOLLOW_22_in_rule__Class_declaration__Group__7__Impl3994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__Class_declaration__Group__7__Impl"


    // $ANTLR start "rule__Class_declaration__Group_3__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: rule__Class_declaration__Group_3__0 : rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 ;
    public final void rule__Class_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:2: rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__04041);
            rule__Class_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__04044);
            rule__Class_declaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group_3__0"


    // $ANTLR start "rule__Class_declaration__Group_3__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: rule__Class_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl4072); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
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
    // $ANTLR end "rule__Class_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_3__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__Class_declaration__Group_3__1 : rule__Class_declaration__Group_3__1__Impl ;
    public final void rule__Class_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( rule__Class_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:2: rule__Class_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__14103);
            rule__Class_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group_3__1"


    // $ANTLR start "rule__Class_declaration__Group_3__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:1: rule__Class_declaration__Group_3__1__Impl : ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) ;
    public final void rule__Class_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:1: ( ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:2: rule__Class_declaration__ClassHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl4130);
            rule__Class_declaration__ClassHerdadaAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassHerdadaAssignment_3_1()); 
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
    // $ANTLR end "rule__Class_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:1: rule__Class_declaration__Group_4__0 : rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 ;
    public final void rule__Class_declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:2: rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__04164);
            rule__Class_declaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__04167);
            rule__Class_declaration__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group_4__0"


    // $ANTLR start "rule__Class_declaration__Group_4__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: rule__Class_declaration__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Class_declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ( ( 'implements' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( 'implements' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( 'implements' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl4195); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
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
    // $ANTLR end "rule__Class_declaration__Group_4__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: rule__Class_declaration__Group_4__1 : rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 ;
    public final void rule__Class_declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:2: rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__14226);
            rule__Class_declaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__14229);
            rule__Class_declaration__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group_4__1"


    // $ANTLR start "rule__Class_declaration__Group_4__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: rule__Class_declaration__Group_4__1__Impl : ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) ;
    public final void rule__Class_declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaAssignment_4_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:2: rule__Class_declaration__InterfaceImplementadaAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4256);
            rule__Class_declaration__InterfaceImplementadaAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaAssignment_4_1()); 
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
    // $ANTLR end "rule__Class_declaration__Group_4__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: rule__Class_declaration__Group_4__2 : rule__Class_declaration__Group_4__2__Impl ;
    public final void rule__Class_declaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( rule__Class_declaration__Group_4__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:2: rule__Class_declaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24286);
            rule__Class_declaration__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group_4__2"


    // $ANTLR start "rule__Class_declaration__Group_4__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__Class_declaration__Group_4__2__Impl : ( ( rule__Class_declaration__Group_4_2__0 )* ) ;
    public final void rule__Class_declaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ( ( rule__Class_declaration__Group_4_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( rule__Class_declaration__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( rule__Class_declaration__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:2: rule__Class_declaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4313);
            	    rule__Class_declaration__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
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
    // $ANTLR end "rule__Class_declaration__Group_4__2__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4_2__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: rule__Class_declaration__Group_4_2__0 : rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 ;
    public final void rule__Class_declaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:2: rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04350);
            rule__Class_declaration__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04353);
            rule__Class_declaration__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group_4_2__0"


    // $ANTLR start "rule__Class_declaration__Group_4_2__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: rule__Class_declaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class_declaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl4381); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
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
    // $ANTLR end "rule__Class_declaration__Group_4_2__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4_2__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: rule__Class_declaration__Group_4_2__1 : rule__Class_declaration__Group_4_2__1__Impl ;
    public final void rule__Class_declaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( rule__Class_declaration__Group_4_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:2: rule__Class_declaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14412);
            rule__Class_declaration__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Class_declaration__Group_4_2__1"


    // $ANTLR start "rule__Class_declaration__Group_4_2__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: rule__Class_declaration__Group_4_2__1__Impl : ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) ;
    public final void rule__Class_declaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: ( ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasAssignment_4_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:2: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4439);
            rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasAssignment_4_2_1()); 
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
    // $ANTLR end "rule__Class_declaration__Group_4_2__1__Impl"


    // $ANTLR start "rule__Field_declaration__Group_0__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: rule__Field_declaration__Group_0__0 : rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 ;
    public final void rule__Field_declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:2: rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04473);
            rule__Field_declaration__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04476);
            rule__Field_declaration__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_declaration__Group_0__0"


    // $ANTLR start "rule__Field_declaration__Group_0__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: rule__Field_declaration__Group_0__0__Impl : ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) ;
    public final void rule__Field_declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentAssignment_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOC_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:2: rule__Field_declaration__CommentAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4503);
                    rule__Field_declaration__CommentAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getCommentAssignment_0_0()); 
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
    // $ANTLR end "rule__Field_declaration__Group_0__0__Impl"


    // $ANTLR start "rule__Field_declaration__Group_0__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: rule__Field_declaration__Group_0__1 : rule__Field_declaration__Group_0__1__Impl ;
    public final void rule__Field_declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: ( rule__Field_declaration__Group_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:2: rule__Field_declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14534);
            rule__Field_declaration__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_declaration__Group_0__1"


    // $ANTLR start "rule__Field_declaration__Group_0__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: rule__Field_declaration__Group_0__1__Impl : ( ( rule__Field_declaration__Alternatives_0_1 ) ) ;
    public final void rule__Field_declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( ( ( rule__Field_declaration__Alternatives_0_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( rule__Field_declaration__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: ( rule__Field_declaration__Alternatives_0_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:2: rule__Field_declaration__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4561);
            rule__Field_declaration__Alternatives_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
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
    // $ANTLR end "rule__Field_declaration__Group_0__1__Impl"


    // $ANTLR start "rule__Field_declaration__Group_2__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2211:1: rule__Field_declaration__Group_2__0 : rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 ;
    public final void rule__Field_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:2: rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04595);
            rule__Field_declaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04598);
            rule__Field_declaration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_declaration__Group_2__0"


    // $ANTLR start "rule__Field_declaration__Group_2__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: rule__Field_declaration__Group_2__0__Impl : ( () ) ;
    public final void rule__Field_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getField_declarationAction_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getField_declarationAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_2__0__Impl"


    // $ANTLR start "rule__Field_declaration__Group_2__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: rule__Field_declaration__Group_2__1 : rule__Field_declaration__Group_2__1__Impl ;
    public final void rule__Field_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:1: ( rule__Field_declaration__Group_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:2: rule__Field_declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14656);
            rule__Field_declaration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Field_declaration__Group_2__1"


    // $ANTLR start "rule__Field_declaration__Group_2__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: rule__Field_declaration__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Field_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4684); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1()); 
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
    // $ANTLR end "rule__Field_declaration__Group_2__1__Impl"


    // $ANTLR start "rule__Method_declaration__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: rule__Method_declaration__Group__0 : rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 ;
    public final void rule__Method_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:2: rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04719);
            rule__Method_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04722);
            rule__Method_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__0"


    // $ANTLR start "rule__Method_declaration__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: rule__Method_declaration__Group__0__Impl : ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) ;
    public final void rule__Method_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: ( ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_MOD && LA23_0<=RULE_STATIC)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:2: rule__Method_declaration__ModifiersMethodAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4749);
            	    rule__Method_declaration__ModifiersMethodAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getModifiersMethodAssignment_0()); 
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
    // $ANTLR end "rule__Method_declaration__Group__0__Impl"


    // $ANTLR start "rule__Method_declaration__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: rule__Method_declaration__Group__1 : rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 ;
    public final void rule__Method_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:2: rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14780);
            rule__Method_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14783);
            rule__Method_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__1"


    // $ANTLR start "rule__Method_declaration__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: rule__Method_declaration__Group__1__Impl : ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) ;
    public final void rule__Method_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:2: rule__Method_declaration__TypeMethodAssignment_1
            {
            pushFollow(FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl4810);
            rule__Method_declaration__TypeMethodAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getTypeMethodAssignment_1()); 
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
    // $ANTLR end "rule__Method_declaration__Group__1__Impl"


    // $ANTLR start "rule__Method_declaration__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: rule__Method_declaration__Group__2 : rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 ;
    public final void rule__Method_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: ( rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:2: rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24840);
            rule__Method_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24843);
            rule__Method_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__2"


    // $ANTLR start "rule__Method_declaration__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__Method_declaration__Group__2__Impl : ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) ;
    public final void rule__Method_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:2: rule__Method_declaration__NameMethodAssignment_2
            {
            pushFollow(FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl4870);
            rule__Method_declaration__NameMethodAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getNameMethodAssignment_2()); 
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
    // $ANTLR end "rule__Method_declaration__Group__2__Impl"


    // $ANTLR start "rule__Method_declaration__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: rule__Method_declaration__Group__3 : rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 ;
    public final void rule__Method_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:2: rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34900);
            rule__Method_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34903);
            rule__Method_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__3"


    // $ANTLR start "rule__Method_declaration__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: rule__Method_declaration__Group__3__Impl : ( '(' ) ;
    public final void rule__Method_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4931); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Method_declaration__Group__3__Impl"


    // $ANTLR start "rule__Method_declaration__Group__4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: rule__Method_declaration__Group__4 : rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 ;
    public final void rule__Method_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44962);
            rule__Method_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44965);
            rule__Method_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__4"


    // $ANTLR start "rule__Method_declaration__Group__4__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: rule__Method_declaration__Group__4__Impl : ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) ;
    public final void rule__Method_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodAssignment_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=12 && LA24_0<=19)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:2: rule__Method_declaration__ParameterListMethodAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl4992);
                    rule__Method_declaration__ParameterListMethodAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getParameterListMethodAssignment_4()); 
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
    // $ANTLR end "rule__Method_declaration__Group__4__Impl"


    // $ANTLR start "rule__Method_declaration__Group__5"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: rule__Method_declaration__Group__5 : rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 ;
    public final void rule__Method_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:2: rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__55023);
            rule__Method_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__55026);
            rule__Method_declaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__5"


    // $ANTLR start "rule__Method_declaration__Group__5__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: rule__Method_declaration__Group__5__Impl : ( ')' ) ;
    public final void rule__Method_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Method_declaration__Group__5__Impl5054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__Method_declaration__Group__5__Impl"


    // $ANTLR start "rule__Method_declaration__Group__6"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: rule__Method_declaration__Group__6 : rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 ;
    public final void rule__Method_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:2: rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__65085);
            rule__Method_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__65088);
            rule__Method_declaration__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__6"


    // $ANTLR start "rule__Method_declaration__Group__6__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: rule__Method_declaration__Group__6__Impl : ( ( '[]' )* ) ;
    public final void rule__Method_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( '[]' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Method_declaration__Group__6__Impl5117); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
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
    // $ANTLR end "rule__Method_declaration__Group__6__Impl"


    // $ANTLR start "rule__Method_declaration__Group__7"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: rule__Method_declaration__Group__7 : rule__Method_declaration__Group__7__Impl ;
    public final void rule__Method_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ( rule__Method_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:2: rule__Method_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__75150);
            rule__Method_declaration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Method_declaration__Group__7"


    // $ANTLR start "rule__Method_declaration__Group__7__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: rule__Method_declaration__Group__7__Impl : ( ( rule__Method_declaration__Alternatives_7 ) ) ;
    public final void rule__Method_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( ( ( rule__Method_declaration__Alternatives_7 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: ( rule__Method_declaration__Alternatives_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( rule__Method_declaration__Alternatives_7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:2: rule__Method_declaration__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl5177);
            rule__Method_declaration__Alternatives_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
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
    // $ANTLR end "rule__Method_declaration__Group__7__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: rule__Constructor_declaration__Group__0 : rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 ;
    public final void rule__Constructor_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:2: rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__05223);
            rule__Constructor_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__05226);
            rule__Constructor_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constructor_declaration__Group__0"


    // $ANTLR start "rule__Constructor_declaration__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: rule__Constructor_declaration__Group__0__Impl : ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) ;
    public final void rule__Constructor_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ( ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_MOD && LA26_0<=RULE_STATIC)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:2: rule__Constructor_declaration__ModifiersConstructorAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5253);
            	    rule__Constructor_declaration__ModifiersConstructorAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorAssignment_0()); 
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
    // $ANTLR end "rule__Constructor_declaration__Group__0__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: rule__Constructor_declaration__Group__1 : rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 ;
    public final void rule__Constructor_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:2: rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15284);
            rule__Constructor_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15287);
            rule__Constructor_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constructor_declaration__Group__1"


    // $ANTLR start "rule__Constructor_declaration__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: rule__Constructor_declaration__Group__1__Impl : ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) ;
    public final void rule__Constructor_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: ( ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2575:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2575:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:2: rule__Constructor_declaration__NameConstructorAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5314);
            rule__Constructor_declaration__NameConstructorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getNameConstructorAssignment_1()); 
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
    // $ANTLR end "rule__Constructor_declaration__Group__1__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:1: rule__Constructor_declaration__Group__2 : rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 ;
    public final void rule__Constructor_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:2: rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25344);
            rule__Constructor_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25347);
            rule__Constructor_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constructor_declaration__Group__2"


    // $ANTLR start "rule__Constructor_declaration__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: rule__Constructor_declaration__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2604:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2604:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl5375); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Constructor_declaration__Group__2__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: rule__Constructor_declaration__Group__3 : rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 ;
    public final void rule__Constructor_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:2: rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35406);
            rule__Constructor_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35409);
            rule__Constructor_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constructor_declaration__Group__3"


    // $ANTLR start "rule__Constructor_declaration__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: rule__Constructor_declaration__Group__3__Impl : ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) ;
    public final void rule__Constructor_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorAssignment_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=12 && LA27_0<=19)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:2: rule__Constructor_declaration__ParameterListConstructorAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5436);
                    rule__Constructor_declaration__ParameterListConstructorAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorAssignment_3()); 
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
    // $ANTLR end "rule__Constructor_declaration__Group__3__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: rule__Constructor_declaration__Group__4 : rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 ;
    public final void rule__Constructor_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ( rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:2: rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45467);
            rule__Constructor_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45470);
            rule__Constructor_declaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constructor_declaration__Group__4"


    // $ANTLR start "rule__Constructor_declaration__Group__4__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:1: rule__Constructor_declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl5498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Constructor_declaration__Group__4__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__5"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: rule__Constructor_declaration__Group__5 : rule__Constructor_declaration__Group__5__Impl ;
    public final void rule__Constructor_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( rule__Constructor_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:2: rule__Constructor_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55529);
            rule__Constructor_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Constructor_declaration__Group__5"


    // $ANTLR start "rule__Constructor_declaration__Group__5__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: rule__Constructor_declaration__Group__5__Impl : ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) ;
    public final void rule__Constructor_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorAssignment_5()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:2: rule__Constructor_declaration__StatementConstructorAssignment_5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5556);
            rule__Constructor_declaration__StatementConstructorAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getStatementConstructorAssignment_5()); 
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
    // $ANTLR end "rule__Constructor_declaration__Group__5__Impl"


    // $ANTLR start "rule__Parameter_list__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05598);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05601);
            rule__Parameter_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter_list__Group__0"


    // $ANTLR start "rule__Parameter_list__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParameterAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: ( ( ( rule__Parameter_list__ParameterAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: ( rule__Parameter_list__ParameterAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( rule__Parameter_list__ParameterAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:2: rule__Parameter_list__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5628);
            rule__Parameter_list__ParameterAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
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
    // $ANTLR end "rule__Parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: ( rule__Parameter_list__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15658);
            rule__Parameter_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter_list__Group__1"


    // $ANTLR start "rule__Parameter_list__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: ( rule__Parameter_list__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:2: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5685);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05720);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05723);
            rule__Parameter_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter_list__Group_1__0"


    // $ANTLR start "rule__Parameter_list__Group_1__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5751); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Parameter_list__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( rule__Parameter_list__Group_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15782);
            rule__Parameter_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter_list__Group_1__1"


    // $ANTLR start "rule__Parameter_list__Group_1__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:2: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5809);
            rule__Parameter_list__ParametersAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
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
    // $ANTLR end "rule__Parameter_list__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2842:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05843);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05846);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5873);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15903);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15906);
            rule__Parameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParameterNameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: ( ( ( rule__Parameter__ParameterNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: ( rule__Parameter__ParameterNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: ( rule__Parameter__ParameterNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:2: rule__Parameter__ParameterNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl5933);
            rule__Parameter__ParameterNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 
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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25963);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: rule__Parameter__Group__2__Impl : ( ( '[]' )* ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: ( '[]' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Parameter__Group__2__Impl5992); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06031);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06034);
            rule__Variable_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declaration__Group__0"


    // $ANTLR start "rule__Variable_declaration__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: ( ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_MOD && LA30_0<=RULE_STATIC)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:2: rule__Variable_declaration__ModifiersVariableAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl6061);
            	    rule__Variable_declaration__ModifiersVariableAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getModifiersVariableAssignment_0()); 
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
    // $ANTLR end "rule__Variable_declaration__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16092);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16095);
            rule__Variable_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declaration__Group__1"


    // $ANTLR start "rule__Variable_declaration__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: rule__Variable_declaration__Group__1__Impl : ( ( rule__Variable_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2981:1: ( ( ( rule__Variable_declaration__TypeAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( rule__Variable_declaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( rule__Variable_declaration__TypeAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:2: rule__Variable_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl6122);
            rule__Variable_declaration__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Variable_declaration__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: ( rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:2: rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26152);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__26155);
            rule__Variable_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declaration__Group__2"


    // $ANTLR start "rule__Variable_declaration__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:2: rule__Variable_declaration__NameVariableAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl6182);
            rule__Variable_declaration__NameVariableAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNameVariableAssignment_2()); 
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
    // $ANTLR end "rule__Variable_declaration__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: rule__Variable_declaration__Group__3 : rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 ;
    public final void rule__Variable_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:1: ( rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:2: rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__36212);
            rule__Variable_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__36215);
            rule__Variable_declaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declaration__Group__3"


    // $ANTLR start "rule__Variable_declaration__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: rule__Variable_declaration__Group__3__Impl : ( ( rule__Variable_declaration__Group_3__0 )* ) ;
    public final void rule__Variable_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ( ( rule__Variable_declaration__Group_3__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( rule__Variable_declaration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( rule__Variable_declaration__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:2: rule__Variable_declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6242);
            	    rule__Variable_declaration__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Variable_declaration__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: rule__Variable_declaration__Group__4 : rule__Variable_declaration__Group__4__Impl ;
    public final void rule__Variable_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( rule__Variable_declaration__Group__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:2: rule__Variable_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46273);
            rule__Variable_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declaration__Group__4"


    // $ANTLR start "rule__Variable_declaration__Group__4__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__Variable_declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Variable_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,11,FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6301); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__Variable_declaration__Group__4__Impl"


    // $ANTLR start "rule__Variable_declaration__Group_3__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:1: rule__Variable_declaration__Group_3__0 : rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 ;
    public final void rule__Variable_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:2: rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06342);
            rule__Variable_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06345);
            rule__Variable_declaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declaration__Group_3__0"


    // $ANTLR start "rule__Variable_declaration__Group_3__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: rule__Variable_declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl6373); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
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
    // $ANTLR end "rule__Variable_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group_3__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: rule__Variable_declaration__Group_3__1 : rule__Variable_declaration__Group_3__1__Impl ;
    public final void rule__Variable_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( rule__Variable_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:2: rule__Variable_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16404);
            rule__Variable_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declaration__Group_3__1"


    // $ANTLR start "rule__Variable_declaration__Group_3__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: rule__Variable_declaration__Group_3__1__Impl : ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) ;
    public final void rule__Variable_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: ( ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:2: rule__Variable_declaration__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6431);
            rule__Variable_declaration__NamesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
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
    // $ANTLR end "rule__Variable_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Variable_declarator__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:1: rule__Variable_declarator__Group__0 : rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 ;
    public final void rule__Variable_declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:2: rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06465);
            rule__Variable_declarator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06468);
            rule__Variable_declarator__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declarator__Group__0"


    // $ANTLR start "rule__Variable_declarator__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: rule__Variable_declarator__Group__0__Impl : ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) ;
    public final void rule__Variable_declarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:2: rule__Variable_declarator__NameVariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6495);
            rule__Variable_declarator__NameVariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getNameVariableAssignment_0()); 
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
    // $ANTLR end "rule__Variable_declarator__Group__0__Impl"


    // $ANTLR start "rule__Variable_declarator__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: rule__Variable_declarator__Group__1 : rule__Variable_declarator__Group__1__Impl ;
    public final void rule__Variable_declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:1: ( rule__Variable_declarator__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:2: rule__Variable_declarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16525);
            rule__Variable_declarator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable_declarator__Group__1"


    // $ANTLR start "rule__Variable_declarator__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:1: rule__Variable_declarator__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Variable_declarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: ( '[]' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3203:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl6554); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__Variable_declarator__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06591);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06594);
            rule__Type__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: rule__Type__Group__0__Impl : ( ( rule__Type__TypeSpecifierAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3234:1: ( ( ( rule__Type__TypeSpecifierAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( rule__Type__TypeSpecifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__Type__TypeSpecifierAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:2: rule__Type__TypeSpecifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6621);
            rule__Type__TypeSpecifierAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeSpecifierAssignment_0()); 
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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( rule__Type__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16651);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: rule__Type__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( '[]' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Type__Group__1__Impl6680); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Static_initializer__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: rule__Static_initializer__Group__0 : rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 ;
    public final void rule__Static_initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:2: rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06717);
            rule__Static_initializer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06720);
            rule__Static_initializer__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Static_initializer__Group__0"


    // $ANTLR start "rule__Static_initializer__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: rule__Static_initializer__Group__0__Impl : ( ( rule__Static_initializer__StaticAssignment_0 ) ) ;
    public final void rule__Static_initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ( ( ( rule__Static_initializer__StaticAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: ( rule__Static_initializer__StaticAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:1: ( rule__Static_initializer__StaticAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:2: rule__Static_initializer__StaticAssignment_0
            {
            pushFollow(FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6747);
            rule__Static_initializer__StaticAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getStaticAssignment_0()); 
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
    // $ANTLR end "rule__Static_initializer__Group__0__Impl"


    // $ANTLR start "rule__Static_initializer__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: rule__Static_initializer__Group__1 : rule__Static_initializer__Group__1__Impl ;
    public final void rule__Static_initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( rule__Static_initializer__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:2: rule__Static_initializer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16777);
            rule__Static_initializer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Static_initializer__Group__1"


    // $ANTLR start "rule__Static_initializer__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: rule__Static_initializer__Group__1__Impl : ( ( rule__Static_initializer__NameAssignment_1 ) ) ;
    public final void rule__Static_initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: ( ( ( rule__Static_initializer__NameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: ( rule__Static_initializer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( rule__Static_initializer__NameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:2: rule__Static_initializer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6804);
            rule__Static_initializer__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Static_initializer__Group__1__Impl"


    // $ANTLR start "rule__Statement_block__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: rule__Statement_block__Group__0 : rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 ;
    public final void rule__Statement_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:2: rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06838);
            rule__Statement_block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06841);
            rule__Statement_block__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement_block__Group__0"


    // $ANTLR start "rule__Statement_block__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: rule__Statement_block__Group__0__Impl : ( '{' ) ;
    public final void rule__Statement_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Statement_block__Group__0__Impl6869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__Statement_block__Group__0__Impl"


    // $ANTLR start "rule__Statement_block__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: rule__Statement_block__Group__1 : rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 ;
    public final void rule__Statement_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ( rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:2: rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16900);
            rule__Statement_block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16903);
            rule__Statement_block__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement_block__Group__1"


    // $ANTLR start "rule__Statement_block__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: rule__Statement_block__Group__1__Impl : ( ( rule__Statement_block__StatmentsAssignment_1 )* ) ;
    public final void rule__Statement_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:1: ( ( ( rule__Statement_block__StatmentsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_MOD && LA34_0<=RULE_ID)||(LA34_0>=11 && LA34_0<=19)||LA34_0==21||(LA34_0>=31 && LA34_0<=34)||LA34_0==36||LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:2: rule__Statement_block__StatmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl6930);
            	    rule__Statement_block__StatmentsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getStatmentsAssignment_1()); 
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
    // $ANTLR end "rule__Statement_block__Group__1__Impl"


    // $ANTLR start "rule__Statement_block__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: rule__Statement_block__Group__2 : rule__Statement_block__Group__2__Impl ;
    public final void rule__Statement_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:1: ( rule__Statement_block__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:2: rule__Statement_block__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26961);
            rule__Statement_block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement_block__Group__2"


    // $ANTLR start "rule__Statement_block__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3413:1: rule__Statement_block__Group__2__Impl : ( '}' ) ;
    public final void rule__Statement_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Statement_block__Group__2__Impl6989); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Statement_block__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3442:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__07026);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__07029);
            rule__Statement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: rule__Statement__Group_1__0__Impl : ( ( rule__Statement__NameStatementAssignment_1_0 ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: ( ( ( rule__Statement__NameStatementAssignment_1_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: ( ( rule__Statement__NameStatementAssignment_1_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: ( ( rule__Statement__NameStatementAssignment_1_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: ( rule__Statement__NameStatementAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementAssignment_1_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: ( rule__Statement__NameStatementAssignment_1_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:2: rule__Statement__NameStatementAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Statement__NameStatementAssignment_1_0_in_rule__Statement__Group_1__0__Impl7056);
            rule__Statement__NameStatementAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameStatementAssignment_1_0()); 
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
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3471:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__17086);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__17089);
            rule__Statement__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: rule__Statement__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ( ( ':' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ( ':' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ( ':' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_1_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Statement__Group_1__1__Impl7117); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_1_1()); 
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
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:1: ( rule__Statement__Group_1__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:2: rule__Statement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__27148);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3509:1: rule__Statement__Group_1__2__Impl : ( ( rule__Statement__StatementAssignment_1_2 ) ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( ( ( rule__Statement__StatementAssignment_1_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: ( ( rule__Statement__StatementAssignment_1_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: ( ( rule__Statement__StatementAssignment_1_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3515:1: ( rule__Statement__StatementAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAssignment_1_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( rule__Statement__StatementAssignment_1_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:2: rule__Statement__StatementAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_1_2_in_rule__Statement__Group_1__2__Impl7175);
            rule__Statement__StatementAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAssignment_1_2()); 
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
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_7__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__07211);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__07214);
            rule__Statement__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_7__0"


    // $ANTLR start "rule__Statement__Group_7__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: rule__Statement__Group_7__0__Impl : ( () ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3548:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_7_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_7__0__Impl"


    // $ANTLR start "rule__Statement__Group_7__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:2: rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__17272);
            rule__Statement__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__17275);
            rule__Statement__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_7__1"


    // $ANTLR start "rule__Statement__Group_7__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3575:1: rule__Statement__Group_7__1__Impl : ( 'break' ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3579:1: ( ( 'break' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: ( 'break' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: ( 'break' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getBreakKeyword_7_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Statement__Group_7__1__Impl7303); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getBreakKeyword_7_1()); 
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
    // $ANTLR end "rule__Statement__Group_7__1__Impl"


    // $ANTLR start "rule__Statement__Group_7__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3594:1: rule__Statement__Group_7__2 : rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3 ;
    public final void rule__Statement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: ( rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:2: rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__27334);
            rule__Statement__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__3_in_rule__Statement__Group_7__27337);
            rule__Statement__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_7__2"


    // $ANTLR start "rule__Statement__Group_7__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:1: rule__Statement__Group_7__2__Impl : ( ( rule__Statement__NameAssignment_7_2 )? ) ;
    public final void rule__Statement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3610:1: ( ( ( rule__Statement__NameAssignment_7_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: ( ( rule__Statement__NameAssignment_7_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: ( ( rule__Statement__NameAssignment_7_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:1: ( rule__Statement__NameAssignment_7_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_7_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: ( rule__Statement__NameAssignment_7_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:2: rule__Statement__NameAssignment_7_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_7_2_in_rule__Statement__Group_7__2__Impl7364);
                    rule__Statement__NameAssignment_7_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_7_2()); 
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
    // $ANTLR end "rule__Statement__Group_7__2__Impl"


    // $ANTLR start "rule__Statement__Group_7__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: rule__Statement__Group_7__3 : rule__Statement__Group_7__3__Impl ;
    public final void rule__Statement__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: ( rule__Statement__Group_7__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:2: rule__Statement__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__3__Impl_in_rule__Statement__Group_7__37395);
            rule__Statement__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_7__3"


    // $ANTLR start "rule__Statement__Group_7__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: rule__Statement__Group_7__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3638:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3639:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3639:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_7_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_7__3__Impl7423); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_7_3()); 
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
    // $ANTLR end "rule__Statement__Group_7__3__Impl"


    // $ANTLR start "rule__Statement__Group_8__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: rule__Statement__Group_8__0 : rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 ;
    public final void rule__Statement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: ( rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:2: rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__07462);
            rule__Statement__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__07465);
            rule__Statement__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_8__0"


    // $ANTLR start "rule__Statement__Group_8__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:1: rule__Statement__Group_8__0__Impl : ( () ) ;
    public final void rule__Statement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_8_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_8__0__Impl"


    // $ANTLR start "rule__Statement__Group_8__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: rule__Statement__Group_8__1 : rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2 ;
    public final void rule__Statement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:1: ( rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3697:2: rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__17523);
            rule__Statement__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__2_in_rule__Statement__Group_8__17526);
            rule__Statement__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_8__1"


    // $ANTLR start "rule__Statement__Group_8__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3704:1: rule__Statement__Group_8__1__Impl : ( 'continue' ) ;
    public final void rule__Statement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ( 'continue' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( 'continue' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( 'continue' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getContinueKeyword_8_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Statement__Group_8__1__Impl7554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getContinueKeyword_8_1()); 
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
    // $ANTLR end "rule__Statement__Group_8__1__Impl"


    // $ANTLR start "rule__Statement__Group_8__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: rule__Statement__Group_8__2 : rule__Statement__Group_8__2__Impl rule__Statement__Group_8__3 ;
    public final void rule__Statement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:1: ( rule__Statement__Group_8__2__Impl rule__Statement__Group_8__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3728:2: rule__Statement__Group_8__2__Impl rule__Statement__Group_8__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__2__Impl_in_rule__Statement__Group_8__27585);
            rule__Statement__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__3_in_rule__Statement__Group_8__27588);
            rule__Statement__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_8__2"


    // $ANTLR start "rule__Statement__Group_8__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: rule__Statement__Group_8__2__Impl : ( ( rule__Statement__NameAssignment_8_2 )? ) ;
    public final void rule__Statement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( ( ( rule__Statement__NameAssignment_8_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( ( rule__Statement__NameAssignment_8_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( ( rule__Statement__NameAssignment_8_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: ( rule__Statement__NameAssignment_8_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_8_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: ( rule__Statement__NameAssignment_8_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:2: rule__Statement__NameAssignment_8_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_8_2_in_rule__Statement__Group_8__2__Impl7615);
                    rule__Statement__NameAssignment_8_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_8_2()); 
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
    // $ANTLR end "rule__Statement__Group_8__2__Impl"


    // $ANTLR start "rule__Statement__Group_8__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: rule__Statement__Group_8__3 : rule__Statement__Group_8__3__Impl ;
    public final void rule__Statement__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( rule__Statement__Group_8__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:2: rule__Statement__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__3__Impl_in_rule__Statement__Group_8__37646);
            rule__Statement__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_8__3"


    // $ANTLR start "rule__Statement__Group_8__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: rule__Statement__Group_8__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_8_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_8__3__Impl7674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_8_3()); 
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
    // $ANTLR end "rule__Statement__Group_8__3__Impl"


    // $ANTLR start "rule__Statement__Group_9__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: rule__Statement__Group_9__0 : rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1 ;
    public final void rule__Statement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:1: ( rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:2: rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__0__Impl_in_rule__Statement__Group_9__07713);
            rule__Statement__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_9__1_in_rule__Statement__Group_9__07716);
            rule__Statement__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_9__0"


    // $ANTLR start "rule__Statement__Group_9__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: rule__Statement__Group_9__0__Impl : ( () ) ;
    public final void rule__Statement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_9_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3809:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_9_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_9__0__Impl"


    // $ANTLR start "rule__Statement__Group_9__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: rule__Statement__Group_9__1 : rule__Statement__Group_9__1__Impl ;
    public final void rule__Statement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3825:1: ( rule__Statement__Group_9__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:2: rule__Statement__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__1__Impl_in_rule__Statement__Group_9__17774);
            rule__Statement__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Statement__Group_9__1"


    // $ANTLR start "rule__Statement__Group_9__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: rule__Statement__Group_9__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_9_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_9__1__Impl7802); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_9_1()); 
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
    // $ANTLR end "rule__Statement__Group_9__1__Impl"


    // $ANTLR start "rule__While_Statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:1: rule__While_Statement__Group__0 : rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1 ;
    public final void rule__While_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:1: ( rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:2: rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__0__Impl_in_rule__While_Statement__Group__07837);
            rule__While_Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While_Statement__Group__1_in_rule__While_Statement__Group__07840);
            rule__While_Statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__While_Statement__Group__0"


    // $ANTLR start "rule__While_Statement__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: rule__While_Statement__Group__0__Impl : ( 'while(' ) ;
    public final void rule__While_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: ( ( 'while(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: ( 'while(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: ( 'while(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: 'while('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getWhileKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__While_Statement__Group__0__Impl7868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_StatementAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__While_Statement__Group__0__Impl"


    // $ANTLR start "rule__While_Statement__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:1: rule__While_Statement__Group__1 : rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2 ;
    public final void rule__While_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: ( rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:2: rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__1__Impl_in_rule__While_Statement__Group__17899);
            rule__While_Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While_Statement__Group__2_in_rule__While_Statement__Group__17902);
            rule__While_Statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__While_Statement__Group__1"


    // $ANTLR start "rule__While_Statement__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:1: rule__While_Statement__Group__1__Impl : ( ')' ) ;
    public final void rule__While_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getRightParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__While_Statement__Group__1__Impl7930); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_StatementAccess().getRightParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__While_Statement__Group__1__Impl"


    // $ANTLR start "rule__While_Statement__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: rule__While_Statement__Group__2 : rule__While_Statement__Group__2__Impl ;
    public final void rule__While_Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( rule__While_Statement__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:2: rule__While_Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__2__Impl_in_rule__While_Statement__Group__27961);
            rule__While_Statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__While_Statement__Group__2"


    // $ANTLR start "rule__While_Statement__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: rule__While_Statement__Group__2__Impl : ( ( rule__While_Statement__StatementAssignment_2 ) ) ;
    public final void rule__While_Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( ( rule__While_Statement__StatementAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( ( rule__While_Statement__StatementAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( ( rule__While_Statement__StatementAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( rule__While_Statement__StatementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getStatementAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: ( rule__While_Statement__StatementAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:2: rule__While_Statement__StatementAssignment_2
            {
            pushFollow(FOLLOW_rule__While_Statement__StatementAssignment_2_in_rule__While_Statement__Group__2__Impl7988);
            rule__While_Statement__StatementAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_StatementAccess().getStatementAssignment_2()); 
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
    // $ANTLR end "rule__While_Statement__Group__2__Impl"


    // $ANTLR start "rule__Do_Statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: rule__Do_Statement__Group__0 : rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1 ;
    public final void rule__Do_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:2: rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__0__Impl_in_rule__Do_Statement__Group__08024);
            rule__Do_Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__1_in_rule__Do_Statement__Group__08027);
            rule__Do_Statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Do_Statement__Group__0"


    // $ANTLR start "rule__Do_Statement__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3963:1: rule__Do_Statement__Group__0__Impl : ( 'do' ) ;
    public final void rule__Do_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:1: ( ( 'do' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3968:1: ( 'do' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3968:1: ( 'do' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getDoKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Do_Statement__Group__0__Impl8055); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementAccess().getDoKeyword_0()); 
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
    // $ANTLR end "rule__Do_Statement__Group__0__Impl"


    // $ANTLR start "rule__Do_Statement__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: rule__Do_Statement__Group__1 : rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2 ;
    public final void rule__Do_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:2: rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__1__Impl_in_rule__Do_Statement__Group__18086);
            rule__Do_Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__2_in_rule__Do_Statement__Group__18089);
            rule__Do_Statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Do_Statement__Group__1"


    // $ANTLR start "rule__Do_Statement__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: rule__Do_Statement__Group__1__Impl : ( ( rule__Do_Statement__StatementAssignment_1 ) ) ;
    public final void rule__Do_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3998:1: ( ( ( rule__Do_Statement__StatementAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:1: ( ( rule__Do_Statement__StatementAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:1: ( ( rule__Do_Statement__StatementAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4000:1: ( rule__Do_Statement__StatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getStatementAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: ( rule__Do_Statement__StatementAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:2: rule__Do_Statement__StatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Do_Statement__StatementAssignment_1_in_rule__Do_Statement__Group__1__Impl8116);
            rule__Do_Statement__StatementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementAccess().getStatementAssignment_1()); 
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
    // $ANTLR end "rule__Do_Statement__Group__1__Impl"


    // $ANTLR start "rule__Do_Statement__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: rule__Do_Statement__Group__2 : rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3 ;
    public final void rule__Do_Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: ( rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:2: rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__2__Impl_in_rule__Do_Statement__Group__28146);
            rule__Do_Statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__3_in_rule__Do_Statement__Group__28149);
            rule__Do_Statement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Do_Statement__Group__2"


    // $ANTLR start "rule__Do_Statement__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: rule__Do_Statement__Group__2__Impl : ( 'while(' ) ;
    public final void rule__Do_Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:1: ( ( 'while(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4028:1: ( 'while(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4028:1: ( 'while(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4029:1: 'while('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getWhileKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Do_Statement__Group__2__Impl8177); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementAccess().getWhileKeyword_2()); 
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
    // $ANTLR end "rule__Do_Statement__Group__2__Impl"


    // $ANTLR start "rule__Do_Statement__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: rule__Do_Statement__Group__3 : rule__Do_Statement__Group__3__Impl ;
    public final void rule__Do_Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( rule__Do_Statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:2: rule__Do_Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__3__Impl_in_rule__Do_Statement__Group__38208);
            rule__Do_Statement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Do_Statement__Group__3"


    // $ANTLR start "rule__Do_Statement__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: rule__Do_Statement__Group__3__Impl : ( ');' ) ;
    public final void rule__Do_Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: ( ( ');' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4058:1: ( ');' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4058:1: ( ');' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4059:1: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getRightParenthesisSemicolonKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__Do_Statement__Group__3__Impl8236); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementAccess().getRightParenthesisSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__Do_Statement__Group__3__Impl"


    // $ANTLR start "rule__If_statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: rule__If_statement__Group__0 : rule__If_statement__Group__0__Impl rule__If_statement__Group__1 ;
    public final void rule__If_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( rule__If_statement__Group__0__Impl rule__If_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:2: rule__If_statement__Group__0__Impl rule__If_statement__Group__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__08275);
            rule__If_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__08278);
            rule__If_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__If_statement__Group__0"


    // $ANTLR start "rule__If_statement__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: rule__If_statement__Group__0__Impl : ( 'if(' ) ;
    public final void rule__If_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: ( ( 'if(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: ( 'if(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: ( 'if(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4098:1: 'if('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__If_statement__Group__0__Impl8306); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__If_statement__Group__0__Impl"


    // $ANTLR start "rule__If_statement__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:1: rule__If_statement__Group__1 : rule__If_statement__Group__1__Impl rule__If_statement__Group__2 ;
    public final void rule__If_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( rule__If_statement__Group__1__Impl rule__If_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:2: rule__If_statement__Group__1__Impl rule__If_statement__Group__2
            {
            pushFollow(FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__18337);
            rule__If_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__18340);
            rule__If_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__If_statement__Group__1"


    // $ANTLR start "rule__If_statement__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: rule__If_statement__Group__1__Impl : ( ')' ) ;
    public final void rule__If_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__If_statement__Group__1__Impl8368); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__If_statement__Group__1__Impl"


    // $ANTLR start "rule__If_statement__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: rule__If_statement__Group__2 : rule__If_statement__Group__2__Impl rule__If_statement__Group__3 ;
    public final void rule__If_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( rule__If_statement__Group__2__Impl rule__If_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:2: rule__If_statement__Group__2__Impl rule__If_statement__Group__3
            {
            pushFollow(FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__28399);
            rule__If_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__28402);
            rule__If_statement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__If_statement__Group__2"


    // $ANTLR start "rule__If_statement__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: rule__If_statement__Group__2__Impl : ( ruleStatement ) ;
    public final void rule__If_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4158:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If_statement__Group__2__Impl8429);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_2()); 
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
    // $ANTLR end "rule__If_statement__Group__2__Impl"


    // $ANTLR start "rule__If_statement__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: rule__If_statement__Group__3 : rule__If_statement__Group__3__Impl ;
    public final void rule__If_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: ( rule__If_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:2: rule__If_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__38458);
            rule__If_statement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__If_statement__Group__3"


    // $ANTLR start "rule__If_statement__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: rule__If_statement__Group__3__Impl : ( ( rule__If_statement__Group_3__0 )? ) ;
    public final void rule__If_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: ( ( ( rule__If_statement__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: ( ( rule__If_statement__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: ( ( rule__If_statement__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: ( rule__If_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: ( rule__If_statement__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred54_InternalMyDsl()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:2: rule__If_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__If_statement__Group_3__0_in_rule__If_statement__Group__3__Impl8485);
                    rule__If_statement__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getGroup_3()); 
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
    // $ANTLR end "rule__If_statement__Group__3__Impl"


    // $ANTLR start "rule__If_statement__Group_3__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: rule__If_statement__Group_3__0 : rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1 ;
    public final void rule__If_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:2: rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group_3__0__Impl_in_rule__If_statement__Group_3__08524);
            rule__If_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group_3__1_in_rule__If_statement__Group_3__08527);
            rule__If_statement__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__If_statement__Group_3__0"


    // $ANTLR start "rule__If_statement__Group_3__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4219:1: rule__If_statement__Group_3__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:1: ( ( ( 'else' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: ( ( 'else' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: ( ( 'else' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseKeyword_3_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( 'else' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:2: 'else'
            {
            match(input,37,FOLLOW_37_in_rule__If_statement__Group_3__0__Impl8556); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getElseKeyword_3_0()); 
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
    // $ANTLR end "rule__If_statement__Group_3__0__Impl"


    // $ANTLR start "rule__If_statement__Group_3__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4238:1: rule__If_statement__Group_3__1 : rule__If_statement__Group_3__1__Impl ;
    public final void rule__If_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ( rule__If_statement__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:2: rule__If_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group_3__1__Impl_in_rule__If_statement__Group_3__18588);
            rule__If_statement__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__If_statement__Group_3__1"


    // $ANTLR start "rule__If_statement__Group_3__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: rule__If_statement__Group_3__1__Impl : ( ( rule__If_statement__ElseStatementAssignment_3_1 ) ) ;
    public final void rule__If_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:1: ( ( ( rule__If_statement__ElseStatementAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: ( ( rule__If_statement__ElseStatementAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:1: ( ( rule__If_statement__ElseStatementAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: ( rule__If_statement__ElseStatementAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseStatementAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( rule__If_statement__ElseStatementAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:2: rule__If_statement__ElseStatementAssignment_3_1
            {
            pushFollow(FOLLOW_rule__If_statement__ElseStatementAssignment_3_1_in_rule__If_statement__Group_3__1__Impl8615);
            rule__If_statement__ElseStatementAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getElseStatementAssignment_3_1()); 
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
    // $ANTLR end "rule__If_statement__Group_3__1__Impl"


    // $ANTLR start "rule__Try_statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: rule__Try_statement__Group__0 : rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 ;
    public final void rule__Try_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: ( rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:2: rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__08649);
            rule__Try_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__08652);
            rule__Try_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group__0"


    // $ANTLR start "rule__Try_statement__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: rule__Try_statement__Group__0__Impl : ( 'try' ) ;
    public final void rule__Try_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: ( ( 'try' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ( 'try' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ( 'try' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:1: 'try'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Try_statement__Group__0__Impl8680); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getTryKeyword_0()); 
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
    // $ANTLR end "rule__Try_statement__Group__0__Impl"


    // $ANTLR start "rule__Try_statement__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: rule__Try_statement__Group__1 : rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 ;
    public final void rule__Try_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: ( rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:2: rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__18711);
            rule__Try_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__18714);
            rule__Try_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group__1"


    // $ANTLR start "rule__Try_statement__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:1: rule__Try_statement__Group__1__Impl : ( ( rule__Try_statement__TryStatementAssignment_1 ) ) ;
    public final void rule__Try_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: ( ( ( rule__Try_statement__TryStatementAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ( rule__Try_statement__TryStatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: ( rule__Try_statement__TryStatementAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:2: rule__Try_statement__TryStatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl8741);
            rule__Try_statement__TryStatementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getTryStatementAssignment_1()); 
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
    // $ANTLR end "rule__Try_statement__Group__1__Impl"


    // $ANTLR start "rule__Try_statement__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: rule__Try_statement__Group__2 : rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 ;
    public final void rule__Try_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4334:1: ( rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:2: rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__28771);
            rule__Try_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__28774);
            rule__Try_statement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group__2"


    // $ANTLR start "rule__Try_statement__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: rule__Try_statement__Group__2__Impl : ( ( rule__Try_statement__Group_2__0 )* ) ;
    public final void rule__Try_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4346:1: ( ( ( rule__Try_statement__Group_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:1: ( ( rule__Try_statement__Group_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:1: ( ( rule__Try_statement__Group_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:1: ( rule__Try_statement__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ( rule__Try_statement__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==39) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred55_InternalMyDsl()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:2: rule__Try_statement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl8801);
            	    rule__Try_statement__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Try_statement__Group__2__Impl"


    // $ANTLR start "rule__Try_statement__Group__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: rule__Try_statement__Group__3 : rule__Try_statement__Group__3__Impl ;
    public final void rule__Try_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4363:1: ( rule__Try_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:2: rule__Try_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__38832);
            rule__Try_statement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group__3"


    // $ANTLR start "rule__Try_statement__Group__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: rule__Try_statement__Group__3__Impl : ( ( rule__Try_statement__Group_3__0 )? ) ;
    public final void rule__Try_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4374:1: ( ( ( rule__Try_statement__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( ( rule__Try_statement__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( ( rule__Try_statement__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: ( rule__Try_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: ( rule__Try_statement__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred56_InternalMyDsl()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:2: rule__Try_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl8859);
                    rule__Try_statement__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Try_statement__Group__3__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4395:1: rule__Try_statement__Group_2__0 : rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 ;
    public final void rule__Try_statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: ( rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:2: rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__08898);
            rule__Try_statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__08901);
            rule__Try_statement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group_2__0"


    // $ANTLR start "rule__Try_statement__Group_2__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4407:1: rule__Try_statement__Group_2__0__Impl : ( ( 'catch' ) ) ;
    public final void rule__Try_statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4411:1: ( ( ( 'catch' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( ( 'catch' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( ( 'catch' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: ( 'catch' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchKeyword_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: ( 'catch' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:2: 'catch'
            {
            match(input,39,FOLLOW_39_in_rule__Try_statement__Group_2__0__Impl8930); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getCatchKeyword_2_0()); 
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
    // $ANTLR end "rule__Try_statement__Group_2__0__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: rule__Try_statement__Group_2__1 : rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 ;
    public final void rule__Try_statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:2: rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__18962);
            rule__Try_statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__18965);
            rule__Try_statement__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group_2__1"


    // $ANTLR start "rule__Try_statement__Group_2__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: rule__Try_statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Try_statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Try_statement__Group_2__1__Impl8993); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
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
    // $ANTLR end "rule__Try_statement__Group_2__1__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4457:1: rule__Try_statement__Group_2__2 : rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 ;
    public final void rule__Try_statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: ( rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:2: rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__29024);
            rule__Try_statement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__29027);
            rule__Try_statement__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group_2__2"


    // $ANTLR start "rule__Try_statement__Group_2__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: rule__Try_statement__Group_2__2__Impl : ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) ;
    public final void rule__Try_statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:1: ( ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4475:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersAssignment_2_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:2: rule__Try_statement__ParametersAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl9054);
            rule__Try_statement__ParametersAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getParametersAssignment_2_2()); 
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
    // $ANTLR end "rule__Try_statement__Group_2__2__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4486:1: rule__Try_statement__Group_2__3 : rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 ;
    public final void rule__Try_statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:1: ( rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4491:2: rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__39084);
            rule__Try_statement__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__39087);
            rule__Try_statement__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group_2__3"


    // $ANTLR start "rule__Try_statement__Group_2__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: rule__Try_statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Try_statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Try_statement__Group_2__3__Impl9115); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
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
    // $ANTLR end "rule__Try_statement__Group_2__3__Impl"


    // $ANTLR start "rule__Try_statement__Group_2__4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4517:1: rule__Try_statement__Group_2__4 : rule__Try_statement__Group_2__4__Impl ;
    public final void rule__Try_statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( rule__Try_statement__Group_2__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:2: rule__Try_statement__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__49146);
            rule__Try_statement__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group_2__4"


    // $ANTLR start "rule__Try_statement__Group_2__4__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:1: rule__Try_statement__Group_2__4__Impl : ( ( rule__Try_statement__StatementAssignment_2_4 ) ) ;
    public final void rule__Try_statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: ( ( ( rule__Try_statement__StatementAssignment_2_4 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4534:1: ( rule__Try_statement__StatementAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementAssignment_2_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( rule__Try_statement__StatementAssignment_2_4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:2: rule__Try_statement__StatementAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl9173);
            rule__Try_statement__StatementAssignment_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getStatementAssignment_2_4()); 
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
    // $ANTLR end "rule__Try_statement__Group_2__4__Impl"


    // $ANTLR start "rule__Try_statement__Group_3__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:1: rule__Try_statement__Group_3__0 : rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 ;
    public final void rule__Try_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:1: ( rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:2: rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__09213);
            rule__Try_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__09216);
            rule__Try_statement__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group_3__0"


    // $ANTLR start "rule__Try_statement__Group_3__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: rule__Try_statement__Group_3__0__Impl : ( ( 'finally' ) ) ;
    public final void rule__Try_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4571:1: ( ( ( 'finally' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4572:1: ( ( 'finally' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4572:1: ( ( 'finally' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4573:1: ( 'finally' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:1: ( 'finally' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:2: 'finally'
            {
            match(input,40,FOLLOW_40_in_rule__Try_statement__Group_3__0__Impl9245); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0()); 
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
    // $ANTLR end "rule__Try_statement__Group_3__0__Impl"


    // $ANTLR start "rule__Try_statement__Group_3__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4586:1: rule__Try_statement__Group_3__1 : rule__Try_statement__Group_3__1__Impl ;
    public final void rule__Try_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4590:1: ( rule__Try_statement__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4591:2: rule__Try_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__19277);
            rule__Try_statement__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Try_statement__Group_3__1"


    // $ANTLR start "rule__Try_statement__Group_3__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: rule__Try_statement__Group_3__1__Impl : ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) ;
    public final void rule__Try_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:1: ( ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4602:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4603:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:2: rule__Try_statement__StatementFinallyAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl9304);
            rule__Try_statement__StatementFinallyAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getStatementFinallyAssignment_3_1()); 
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
    // $ANTLR end "rule__Try_statement__Group_3__1__Impl"


    // $ANTLR start "rule__Import_statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: rule__Import_statement__Group__0 : rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 ;
    public final void rule__Import_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: ( rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4623:2: rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__09338);
            rule__Import_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__09341);
            rule__Import_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import_statement__Group__0"


    // $ANTLR start "rule__Import_statement__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4630:1: rule__Import_statement__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:1: ( ( 'import' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: ( 'import' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: ( 'import' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4636:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Import_statement__Group__0__Impl9369); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import_statement__Group__0__Impl"


    // $ANTLR start "rule__Import_statement__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:1: rule__Import_statement__Group__1 : rule__Import_statement__Group__1__Impl ;
    public final void rule__Import_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4653:1: ( rule__Import_statement__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4654:2: rule__Import_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__19400);
            rule__Import_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import_statement__Group__1"


    // $ANTLR start "rule__Import_statement__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:1: rule__Import_statement__Group__1__Impl : ( ( rule__Import_statement__Alternatives_1 ) ) ;
    public final void rule__Import_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4664:1: ( ( ( rule__Import_statement__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: ( ( rule__Import_statement__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: ( ( rule__Import_statement__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:1: ( rule__Import_statement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:1: ( rule__Import_statement__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4667:2: rule__Import_statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl9427);
            rule__Import_statement__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Import_statement__Group__1__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_0__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: rule__Import_statement__Group_1_0__0 : rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 ;
    public final void rule__Import_statement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: ( rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4686:2: rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__09461);
            rule__Import_statement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__09464);
            rule__Import_statement__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import_statement__Group_1_0__0"


    // $ANTLR start "rule__Import_statement__Group_1_0__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4693:1: rule__Import_statement__Group_1_0__0__Impl : ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) ;
    public final void rule__Import_statement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4697:1: ( ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4699:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameAssignment_1_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:2: rule__Import_statement__ClassNameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl9491);
            rule__Import_statement__ClassNameAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getClassNameAssignment_1_0_0()); 
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
    // $ANTLR end "rule__Import_statement__Group_1_0__0__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_0__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:1: rule__Import_statement__Group_1_0__1 : rule__Import_statement__Group_1_0__1__Impl ;
    public final void rule__Import_statement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: ( rule__Import_statement__Group_1_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:2: rule__Import_statement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__19521);
            rule__Import_statement__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import_statement__Group_1_0__1"


    // $ANTLR start "rule__Import_statement__Group_1_0__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:1: rule__Import_statement__Group_1_0__1__Impl : ( ';' ) ;
    public final void rule__Import_statement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl9549); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
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
    // $ANTLR end "rule__Import_statement__Group_1_0__1__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_1__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:1: rule__Import_statement__Group_1_1__0 : rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 ;
    public final void rule__Import_statement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: ( rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4749:2: rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__09584);
            rule__Import_statement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__09587);
            rule__Import_statement__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import_statement__Group_1_1__0"


    // $ANTLR start "rule__Import_statement__Group_1_1__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: rule__Import_statement__Group_1_1__0__Impl : ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) ;
    public final void rule__Import_statement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: ( ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4761:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4762:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNameAssignment_1_1_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:2: rule__Import_statement__PacNameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl9614);
            rule__Import_statement__PacNameAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getPacNameAssignment_1_1_0()); 
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
    // $ANTLR end "rule__Import_statement__Group_1_1__0__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_1__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:1: rule__Import_statement__Group_1_1__1 : rule__Import_statement__Group_1_1__1__Impl ;
    public final void rule__Import_statement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4777:1: ( rule__Import_statement__Group_1_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:2: rule__Import_statement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__19644);
            rule__Import_statement__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import_statement__Group_1_1__1"


    // $ANTLR start "rule__Import_statement__Group_1_1__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: rule__Import_statement__Group_1_1__1__Impl : ( '.*;' ) ;
    public final void rule__Import_statement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:1: ( ( '.*;' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:1: ( '.*;' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:1: ( '.*;' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:1: '.*;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__Import_statement__Group_1_1__1__Impl9672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1()); 
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
    // $ANTLR end "rule__Import_statement__Group_1_1__1__Impl"


    // $ANTLR start "rule__Package_statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4807:1: rule__Package_statement__Group__0 : rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 ;
    public final void rule__Package_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:1: ( rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:2: rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__09707);
            rule__Package_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__09710);
            rule__Package_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package_statement__Group__0"


    // $ANTLR start "rule__Package_statement__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:1: rule__Package_statement__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4823:1: ( ( 'package' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: ( 'package' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: ( 'package' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Package_statement__Group__0__Impl9738); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__Package_statement__Group__0__Impl"


    // $ANTLR start "rule__Package_statement__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4838:1: rule__Package_statement__Group__1 : rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 ;
    public final void rule__Package_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: ( rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:2: rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__19769);
            rule__Package_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__19772);
            rule__Package_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package_statement__Group__1"


    // $ANTLR start "rule__Package_statement__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: rule__Package_statement__Group__1__Impl : ( ( rule__Package_statement__PacNameAssignment_1 ) ) ;
    public final void rule__Package_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( ( ( rule__Package_statement__PacNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: ( rule__Package_statement__PacNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: ( rule__Package_statement__PacNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:2: rule__Package_statement__PacNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl9799);
            rule__Package_statement__PacNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getPacNameAssignment_1()); 
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
    // $ANTLR end "rule__Package_statement__Group__1__Impl"


    // $ANTLR start "rule__Package_statement__Group__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4867:1: rule__Package_statement__Group__2 : rule__Package_statement__Group__2__Impl ;
    public final void rule__Package_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ( rule__Package_statement__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4872:2: rule__Package_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__29829);
            rule__Package_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package_statement__Group__2"


    // $ANTLR start "rule__Package_statement__Group__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: rule__Package_statement__Group__2__Impl : ( ';' ) ;
    public final void rule__Package_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4882:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4883:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4883:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4884:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Package_statement__Group__2__Impl9857); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Package_statement__Group__2__Impl"


    // $ANTLR start "rule__Package_name__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:1: rule__Package_name__Group__0 : rule__Package_name__Group__0__Impl rule__Package_name__Group__1 ;
    public final void rule__Package_name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4907:1: ( rule__Package_name__Group__0__Impl rule__Package_name__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4908:2: rule__Package_name__Group__0__Impl rule__Package_name__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__09894);
            rule__Package_name__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__09897);
            rule__Package_name__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package_name__Group__0"


    // $ANTLR start "rule__Package_name__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: rule__Package_name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Package_name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4920:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4920:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl9924); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Package_name__Group__0__Impl"


    // $ANTLR start "rule__Package_name__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4932:1: rule__Package_name__Group__1 : rule__Package_name__Group__1__Impl ;
    public final void rule__Package_name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:1: ( rule__Package_name__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4937:2: rule__Package_name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__19953);
            rule__Package_name__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package_name__Group__1"


    // $ANTLR start "rule__Package_name__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: rule__Package_name__Group__1__Impl : ( rulePackage_name_line ) ;
    public final void rule__Package_name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: ( ( rulePackage_name_line ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( rulePackage_name_line )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: ( rulePackage_name_line )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4949:1: rulePackage_name_line
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl9980);
            rulePackage_name_line();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
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
    // $ANTLR end "rule__Package_name__Group__1__Impl"


    // $ANTLR start "rule__Package_name_line__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: rule__Package_name_line__Group__0 : rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 ;
    public final void rule__Package_name_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: ( rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4969:2: rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__010013);
            rule__Package_name_line__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__010016);
            rule__Package_name_line__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package_name_line__Group__0"


    // $ANTLR start "rule__Package_name_line__Group__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: rule__Package_name_line__Group__0__Impl : ( '.' ) ;
    public final void rule__Package_name_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4980:1: ( ( '.' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4981:1: ( '.' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4981:1: ( '.' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4982:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Package_name_line__Group__0__Impl10044); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
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
    // $ANTLR end "rule__Package_name_line__Group__0__Impl"


    // $ANTLR start "rule__Package_name_line__Group__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4995:1: rule__Package_name_line__Group__1 : rule__Package_name_line__Group__1__Impl ;
    public final void rule__Package_name_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: ( rule__Package_name_line__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:2: rule__Package_name_line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__110075);
            rule__Package_name_line__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package_name_line__Group__1"


    // $ANTLR start "rule__Package_name_line__Group__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: rule__Package_name_line__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package_name_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5010:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5011:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5011:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5012:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl10102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Package_name_line__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: rule__Model__GreetingsAssignment : ( ruleCompilation_unit ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: ( ( ruleCompilation_unit ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( ruleCompilation_unit )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( ruleCompilation_unit )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment10140);
            ruleCompilation_unit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Compilation_unit__NameAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: rule__Compilation_unit__NameAssignment_0 : ( rulePackage_statement ) ;
    public final void rule__Compilation_unit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( rulePackage_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( rulePackage_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( rulePackage_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: rulePackage_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_010171);
            rulePackage_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Compilation_unit__NameAssignment_0"


    // $ANTLR start "rule__Compilation_unit__ImportsAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5058:1: rule__Compilation_unit__ImportsAssignment_1 : ( ruleImport_statement ) ;
    public final void rule__Compilation_unit__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ( ( ruleImport_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: ( ruleImport_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: ( ruleImport_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5064:1: ruleImport_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_110202);
            ruleImport_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Compilation_unit__ImportsAssignment_1"


    // $ANTLR start "rule__Compilation_unit__TypeDeclarationsAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5073:1: rule__Compilation_unit__TypeDeclarationsAssignment_2 : ( ruleType_declaration ) ;
    public final void rule__Compilation_unit__TypeDeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: ( ( ruleType_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( ruleType_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( ruleType_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: ruleType_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_210233);
            ruleType_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Compilation_unit__TypeDeclarationsAssignment_2"


    // $ANTLR start "rule__Type_declaration__CommentAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5088:1: rule__Type_declaration__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Type_declaration__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_010264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Type_declaration__CommentAssignment_0"


    // $ANTLR start "rule__Type_declaration__ClassDecAssignment_1_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:1: rule__Type_declaration__ClassDecAssignment_1_0 : ( ruleClass_declaration ) ;
    public final void rule__Type_declaration__ClassDecAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: ( ( ruleClass_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( ruleClass_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( ruleClass_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ruleClass_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_010295);
            ruleClass_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Type_declaration__ClassDecAssignment_1_0"


    // $ANTLR start "rule__Type_declaration__InterfaceDecAssignment_1_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: rule__Type_declaration__InterfaceDecAssignment_1_1 : ( ruleInterface_declaration ) ;
    public final void rule__Type_declaration__InterfaceDecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5122:1: ( ( ruleInterface_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: ( ruleInterface_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: ( ruleInterface_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: ruleInterface_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_110326);
            ruleInterface_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Type_declaration__InterfaceDecAssignment_1_1"


    // $ANTLR start "rule__Interface_declaration__ModifiersAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: rule__Interface_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Interface_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5137:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5138:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5138:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5139:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_010357);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Interface_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Interface_declaration__InterfaceNameAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5148:1: rule__Interface_declaration__InterfaceNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface_declaration__InterfaceNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5154:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_210388); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Interface_declaration__InterfaceNameAssignment_2"


    // $ANTLR start "rule__Interface_declaration__InterfaceHerdadaAssignment_3_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:1: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfaceHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5169:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_110419);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Interface_declaration__InterfaceHerdadaAssignment_3_1"


    // $ANTLR start "rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5178:1: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5182:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5184:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_110450);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
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
    // $ANTLR end "rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1"


    // $ANTLR start "rule__Class_declaration__ModifiersAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: rule__Class_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Class_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5199:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_010481);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Class_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Class_declaration__ClassNameAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5208:1: rule__Class_declaration__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class_declaration__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5214:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_210512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Class_declaration__ClassNameAssignment_2"


    // $ANTLR start "rule__Class_declaration__ClassHerdadaAssignment_3_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: rule__Class_declaration__ClassHerdadaAssignment_3_1 : ( ruleClass_name ) ;
    public final void rule__Class_declaration__ClassHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5227:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5228:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5228:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5229:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_110543);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Class_declaration__ClassHerdadaAssignment_3_1"


    // $ANTLR start "rule__Class_declaration__InterfaceImplementadaAssignment_4_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5238:1: rule__Class_declaration__InterfaceImplementadaAssignment_4_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfaceImplementadaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5242:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5243:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5243:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5244:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_110574);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__Class_declaration__InterfaceImplementadaAssignment_4_1"


    // $ANTLR start "rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5253:1: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5257:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5259:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_110605);
            ruleInterface_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
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
    // $ANTLR end "rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1"


    // $ANTLR start "rule__Class_declaration__FieldsDeclarationAssignment_6"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: rule__Class_declaration__FieldsDeclarationAssignment_6 : ( ruleField_declaration ) ;
    public final void rule__Class_declaration__FieldsDeclarationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5272:1: ( ( ruleField_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5273:1: ( ruleField_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5273:1: ( ruleField_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5274:1: ruleField_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_610636);
            ruleField_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Class_declaration__FieldsDeclarationAssignment_6"


    // $ANTLR start "rule__Field_declaration__CommentAssignment_0_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5283:1: rule__Field_declaration__CommentAssignment_0_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Field_declaration__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_010667); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__Field_declaration__CommentAssignment_0_0"


    // $ANTLR start "rule__Field_declaration__VariableDeclarationAssignment_0_1_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:1: rule__Field_declaration__VariableDeclarationAssignment_0_1_0 : ( ruleVariable_declaration ) ;
    public final void rule__Field_declaration__VariableDeclarationAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5302:1: ( ( ruleVariable_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:1: ( ruleVariable_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:1: ( ruleVariable_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5304:1: ruleVariable_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_010698);
            ruleVariable_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
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
    // $ANTLR end "rule__Field_declaration__VariableDeclarationAssignment_0_1_0"


    // $ANTLR start "rule__Field_declaration__ContructorNameAssignment_0_1_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5313:1: rule__Field_declaration__ContructorNameAssignment_0_1_1 : ( ruleConstructor_declaration ) ;
    public final void rule__Field_declaration__ContructorNameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5317:1: ( ( ruleConstructor_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5318:1: ( ruleConstructor_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5318:1: ( ruleConstructor_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5319:1: ruleConstructor_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_110729);
            ruleConstructor_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
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
    // $ANTLR end "rule__Field_declaration__ContructorNameAssignment_0_1_1"


    // $ANTLR start "rule__Field_declaration__MethodNameAssignment_0_1_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: rule__Field_declaration__MethodNameAssignment_0_1_2 : ( ruleMethod_declaration ) ;
    public final void rule__Field_declaration__MethodNameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5332:1: ( ( ruleMethod_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5333:1: ( ruleMethod_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5333:1: ( ruleMethod_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5334:1: ruleMethod_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_210760);
            ruleMethod_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
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
    // $ANTLR end "rule__Field_declaration__MethodNameAssignment_0_1_2"


    // $ANTLR start "rule__Field_declaration__StaticinitializerAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:1: rule__Field_declaration__StaticinitializerAssignment_1 : ( ruleStatic_initializer ) ;
    public final void rule__Field_declaration__StaticinitializerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5347:1: ( ( ruleStatic_initializer ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5348:1: ( ruleStatic_initializer )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5348:1: ( ruleStatic_initializer )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: ruleStatic_initializer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_110791);
            ruleStatic_initializer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Field_declaration__StaticinitializerAssignment_1"


    // $ANTLR start "rule__Method_declaration__ModifiersMethodAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:1: rule__Method_declaration__ModifiersMethodAssignment_0 : ( ruleModifier ) ;
    public final void rule__Method_declaration__ModifiersMethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_010822);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Method_declaration__ModifiersMethodAssignment_0"


    // $ANTLR start "rule__Method_declaration__TypeMethodAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5373:1: rule__Method_declaration__TypeMethodAssignment_1 : ( ruleType ) ;
    public final void rule__Method_declaration__TypeMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5379:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_110853);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Method_declaration__TypeMethodAssignment_1"


    // $ANTLR start "rule__Method_declaration__NameMethodAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: rule__Method_declaration__NameMethodAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method_declaration__NameMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5394:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_210884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Method_declaration__NameMethodAssignment_2"


    // $ANTLR start "rule__Method_declaration__ParameterListMethodAssignment_4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5403:1: rule__Method_declaration__ParameterListMethodAssignment_4 : ( ruleParameter_list ) ;
    public final void rule__Method_declaration__ParameterListMethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5409:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_410915);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Method_declaration__ParameterListMethodAssignment_4"


    // $ANTLR start "rule__Method_declaration__StatementMethodAssignment_7_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: rule__Method_declaration__StatementMethodAssignment_7_0 : ( ruleStatement_block ) ;
    public final void rule__Method_declaration__StatementMethodAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5424:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_010946);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
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
    // $ANTLR end "rule__Method_declaration__StatementMethodAssignment_7_0"


    // $ANTLR start "rule__Constructor_declaration__ModifiersConstructorAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5433:1: rule__Constructor_declaration__ModifiersConstructorAssignment_0 : ( ruleModifier ) ;
    public final void rule__Constructor_declaration__ModifiersConstructorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_010977);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Constructor_declaration__ModifiersConstructorAssignment_0"


    // $ANTLR start "rule__Constructor_declaration__NameConstructorAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: rule__Constructor_declaration__NameConstructorAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor_declaration__NameConstructorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5453:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5453:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5454:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_111008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Constructor_declaration__NameConstructorAssignment_1"


    // $ANTLR start "rule__Constructor_declaration__ParameterListConstructorAssignment_3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5463:1: rule__Constructor_declaration__ParameterListConstructorAssignment_3 : ( ruleParameter_list ) ;
    public final void rule__Constructor_declaration__ParameterListConstructorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5468:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5468:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5469:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_311039);
            ruleParameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Constructor_declaration__ParameterListConstructorAssignment_3"


    // $ANTLR start "rule__Constructor_declaration__StatementConstructorAssignment_5"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: rule__Constructor_declaration__StatementConstructorAssignment_5 : ( ruleStatement_block ) ;
    public final void rule__Constructor_declaration__StatementConstructorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5484:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_511070);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Constructor_declaration__StatementConstructorAssignment_5"


    // $ANTLR start "rule__Parameter_list__ParameterAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: rule__Parameter_list__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5498:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5498:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5499:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_011101);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Parameter_list__ParameterAssignment_0"


    // $ANTLR start "rule__Parameter_list__ParametersAssignment_1_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5513:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5513:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5514:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_111132);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Parameter_list__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5523:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5528:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5528:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5529:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_011163);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__ParameterNameAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: rule__Parameter__ParameterNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__ParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5543:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5543:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5544:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_111194); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Parameter__ParameterNameAssignment_1"


    // $ANTLR start "rule__Variable_declaration__ModifiersVariableAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: rule__Variable_declaration__ModifiersVariableAssignment_0 : ( ruleModifier ) ;
    public final void rule__Variable_declaration__ModifiersVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5557:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5558:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5558:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5559:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_011225);
            ruleModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Variable_declaration__ModifiersVariableAssignment_0"


    // $ANTLR start "rule__Variable_declaration__TypeAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: rule__Variable_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Variable_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5573:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5573:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5574:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_111256);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Variable_declaration__TypeAssignment_1"


    // $ANTLR start "rule__Variable_declaration__NameVariableAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5583:1: rule__Variable_declaration__NameVariableAssignment_2 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NameVariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5588:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5588:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5589:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_211287);
            ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Variable_declaration__NameVariableAssignment_2"


    // $ANTLR start "rule__Variable_declaration__NamesAssignment_3_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: rule__Variable_declaration__NamesAssignment_3_1 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5603:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5603:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5604:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_111318);
            ruleVariable_declarator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Variable_declaration__NamesAssignment_3_1"


    // $ANTLR start "rule__Variable_declarator__NameVariableAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: rule__Variable_declarator__NameVariableAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_declarator__NameVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5618:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5618:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5619:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_011349); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Variable_declarator__NameVariableAssignment_0"


    // $ANTLR start "rule__Type__TypeSpecifierAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5628:1: rule__Type__TypeSpecifierAssignment_0 : ( ruleType_specifier ) ;
    public final void rule__Type__TypeSpecifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: ( ( ruleType_specifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5633:1: ( ruleType_specifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5633:1: ( ruleType_specifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_011380);
            ruleType_specifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Type__TypeSpecifierAssignment_0"


    // $ANTLR start "rule__Static_initializer__StaticAssignment_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5643:1: rule__Static_initializer__StaticAssignment_0 : ( RULE_STATIC ) ;
    public final void rule__Static_initializer__StaticAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: ( ( RULE_STATIC ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5648:1: ( RULE_STATIC )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5648:1: ( RULE_STATIC )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5649:1: RULE_STATIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_011411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Static_initializer__StaticAssignment_0"


    // $ANTLR start "rule__Static_initializer__NameAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5658:1: rule__Static_initializer__NameAssignment_1 : ( ruleStatement_block ) ;
    public final void rule__Static_initializer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5663:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5663:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5664:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_111442);
            ruleStatement_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Static_initializer__NameAssignment_1"


    // $ANTLR start "rule__Statement_block__StatmentsAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5673:1: rule__Statement_block__StatmentsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Statement_block__StatmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5679:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_111473);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Statement_block__StatmentsAssignment_1"


    // $ANTLR start "rule__Statement__NameStatementAssignment_1_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5688:1: rule__Statement__NameStatementAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameStatementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5693:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5693:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5694:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_1_011504); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Statement__NameStatementAssignment_1_0"


    // $ANTLR start "rule__Statement__StatementAssignment_1_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5703:1: rule__Statement__StatementAssignment_1_2 : ( ruleStatement ) ;
    public final void rule__Statement__StatementAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5708:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5708:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_1_211535);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Statement__StatementAssignment_1_2"


    // $ANTLR start "rule__Statement__IfStatementAssignment_3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5718:1: rule__Statement__IfStatementAssignment_3 : ( ruleIf_statement ) ;
    public final void rule__Statement__IfStatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ( ( ruleIf_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: ( ruleIf_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: ( ruleIf_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5724:1: ruleIf_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_rule__Statement__IfStatementAssignment_311566);
            ruleIf_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Statement__IfStatementAssignment_3"


    // $ANTLR start "rule__Statement__DoStatementAssignment_4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5733:1: rule__Statement__DoStatementAssignment_4 : ( ruleDo_Statement ) ;
    public final void rule__Statement__DoStatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ( ( ruleDo_Statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ( ruleDo_Statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ( ruleDo_Statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5739:1: ruleDo_Statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_rule__Statement__DoStatementAssignment_411597);
            ruleDo_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Statement__DoStatementAssignment_4"


    // $ANTLR start "rule__Statement__WhileStatementAssignment_5"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5748:1: rule__Statement__WhileStatementAssignment_5 : ( ruleWhile_Statement ) ;
    public final void rule__Statement__WhileStatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: ( ( ruleWhile_Statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5753:1: ( ruleWhile_Statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5753:1: ( ruleWhile_Statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5754:1: ruleWhile_Statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_rule__Statement__WhileStatementAssignment_511628);
            ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Statement__WhileStatementAssignment_5"


    // $ANTLR start "rule__Statement__TryStatementAssignment_6"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5763:1: rule__Statement__TryStatementAssignment_6 : ( ruleTry_statement ) ;
    public final void rule__Statement__TryStatementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5767:1: ( ( ruleTry_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5768:1: ( ruleTry_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5768:1: ( ruleTry_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5769:1: ruleTry_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_611659);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Statement__TryStatementAssignment_6"


    // $ANTLR start "rule__Statement__NameAssignment_7_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5778:1: rule__Statement__NameAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5782:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5783:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5783:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5784:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_7_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_7_211690); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_7_2_0()); 
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
    // $ANTLR end "rule__Statement__NameAssignment_7_2"


    // $ANTLR start "rule__Statement__NameAssignment_8_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5793:1: rule__Statement__NameAssignment_8_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5798:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5799:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_8_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_8_211721); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_8_2_0()); 
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
    // $ANTLR end "rule__Statement__NameAssignment_8_2"


    // $ANTLR start "rule__While_Statement__StatementAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5808:1: rule__While_Statement__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__While_Statement__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5813:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5813:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5814:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__While_Statement__StatementAssignment_211752);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__While_Statement__StatementAssignment_2"


    // $ANTLR start "rule__Do_Statement__StatementAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5823:1: rule__Do_Statement__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Do_Statement__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5827:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5828:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5828:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5829:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Do_Statement__StatementAssignment_111783);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Do_Statement__StatementAssignment_1"


    // $ANTLR start "rule__If_statement__ElseStatementAssignment_3_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5838:1: rule__If_statement__ElseStatementAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__If_statement__ElseStatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5842:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5843:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5843:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5844:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If_statement__ElseStatementAssignment_3_111814);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__If_statement__ElseStatementAssignment_3_1"


    // $ANTLR start "rule__Try_statement__TryStatementAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5853:1: rule__Try_statement__TryStatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__TryStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5858:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5858:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5859:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_111845);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Try_statement__TryStatementAssignment_1"


    // $ANTLR start "rule__Try_statement__ParametersAssignment_2_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: rule__Try_statement__ParametersAssignment_2_2 : ( ruleParameter ) ;
    public final void rule__Try_statement__ParametersAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5872:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5873:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5873:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5874:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_211876);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Try_statement__ParametersAssignment_2_2"


    // $ANTLR start "rule__Try_statement__StatementAssignment_2_4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5883:1: rule__Try_statement__StatementAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5888:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5889:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementStatementParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_411907);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getStatementStatementParserRuleCall_2_4_0()); 
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
    // $ANTLR end "rule__Try_statement__StatementAssignment_2_4"


    // $ANTLR start "rule__Try_statement__StatementFinallyAssignment_3_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5898:1: rule__Try_statement__StatementFinallyAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementFinallyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5902:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5903:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5903:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5904:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_111938);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTry_statementAccess().getStatementFinallyStatementParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Try_statement__StatementFinallyAssignment_3_1"


    // $ANTLR start "rule__Import_statement__ClassNameAssignment_1_0_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5913:1: rule__Import_statement__ClassNameAssignment_1_0_0 : ( ruleClass_name ) ;
    public final void rule__Import_statement__ClassNameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5918:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5919:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_011969);
            ruleClass_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
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
    // $ANTLR end "rule__Import_statement__ClassNameAssignment_1_0_0"


    // $ANTLR start "rule__Import_statement__PacNameAssignment_1_1_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: rule__Import_statement__PacNameAssignment_1_1_0 : ( rulePackage_name ) ;
    public final void rule__Import_statement__PacNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5934:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_012000);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
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
    // $ANTLR end "rule__Import_statement__PacNameAssignment_1_1_0"


    // $ANTLR start "rule__Package_statement__PacNameAssignment_1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5943:1: rule__Package_statement__PacNameAssignment_1 : ( rulePackage_name ) ;
    public final void rule__Package_statement__PacNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5948:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5949:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_112031);
            rulePackage_name();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Package_statement__PacNameAssignment_1"

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:2: ( rule__If_statement__Group_3__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:2: rule__If_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__If_statement__Group_3__0_in_synpred54_InternalMyDsl8485);
        rule__If_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred55_InternalMyDsl
    public final void synpred55_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:2: ( rule__Try_statement__Group_2__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:2: rule__Try_statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_synpred55_InternalMyDsl8801);
        rule__Try_statement__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalMyDsl

    // $ANTLR start synpred56_InternalMyDsl
    public final void synpred56_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:2: ( rule__Try_statement__Group_3__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:2: rule__Try_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_synpred56_InternalMyDsl8859);
        rule__Try_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalMyDsl

    // Delegated rules

    public final boolean synpred56_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA2_eotS =
        "\5\uffff";
    static final String DFA2_eofS =
        "\5\uffff";
    static final String DFA2_minS =
        "\3\4\2\uffff";
    static final String DFA2_maxS =
        "\3\31\2\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\16\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\16\uffff\1\4\4\uffff\1\3",
            "\1\1\1\2\16\uffff\1\4\4\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "845:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__ClassDecAssignment_1_0 ) ) | ( ( rule__Type_declaration__InterfaceDecAssignment_1_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\23\uffff";
    static final String DFA4_eofS =
        "\23\uffff";
    static final String DFA4_minS =
        "\3\4\12\6\1\13\1\6\3\uffff\1\6";
    static final String DFA4_maxS =
        "\3\23\10\35\1\54\2\35\1\6\3\uffff\1\54";
    static final String DFA4_acceptS =
        "\17\uffff\1\2\1\3\1\1\1\uffff";
    static final String DFA4_specialS =
        "\23\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\13\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\1\1\2\1\13\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\1\1\2\1\13\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\15\26\uffff\1\14",
            "\1\15\26\uffff\1\14",
            "\1\15\26\uffff\1\14",
            "\1\15\26\uffff\1\14",
            "\1\15\26\uffff\1\14",
            "\1\15\26\uffff\1\14",
            "\1\15\26\uffff\1\14",
            "\1\15\26\uffff\1\14",
            "\1\15\24\uffff\1\17\1\uffff\1\14\16\uffff\1\16",
            "\1\15\26\uffff\1\14",
            "\1\21\14\uffff\1\21\2\uffff\1\20\1\uffff\1\21",
            "\1\22",
            "",
            "",
            "",
            "\1\15\26\uffff\1\14\16\uffff\1\16"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "895:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__VariableDeclarationAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__ContructorNameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__MethodNameAssignment_0_1_2 ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\4\1\uffff\1\6\11\uffff";
    static final String DFA8_maxS =
        "\1\46\1\uffff\1\54\11\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\2";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\3\1\2\4\uffff\1\12\10\3\1\uffff\1\1\11\uffff\1\10\1\11\1"+
            "\6\1\5\1\uffff\1\4\1\uffff\1\7",
            "",
            "\1\3\26\uffff\1\3\1\13\15\uffff\1\3",
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1049:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_3 ) ) | ( ( rule__Statement__DoStatementAssignment_4 ) ) | ( ( rule__Statement__WhileStatementAssignment_5 ) ) | ( ( rule__Statement__TryStatementAssignment_6 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\1\6\1\13\1\6\2\uffff\1\13";
    static final String DFA9_maxS =
        "\1\6\1\54\1\6\2\uffff\1\54";
    static final String DFA9_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\4\36\uffff\1\3\1\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\4\36\uffff\1\3\1\uffff\1\2"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1119:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0_in_ruleCompilation_unit160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0_in_ruleType_declaration220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0_in_ruleInterface_declaration280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0_in_ruleClass_declaration340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_in_ruleField_declaration400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0_in_ruleMethod_declaration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modifier__Alternatives_in_ruleModifier940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_entryRuleWhile_Statement1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile_Statement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__0_in_ruleWhile_Statement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_entryRuleDo_Statement1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo_Statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__0_in_ruleDo_Statement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_entryRuleIf_statement1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf_statement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__0_in_ruleIf_statement1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_entryRuleTry_statement1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTry_statement1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0_in_ruleTry_statement1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement1565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_entryRulePackage_name_line1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_line1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0_in_rulePackage_name_line1718 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__ClassDecAssignment_1_0_in_rule__Type_declaration__Alternatives_11755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__InterfaceDecAssignment_1_1_in_rule__Type_declaration__Alternatives_11773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__StaticinitializerAssignment_1_in_rule__Field_declaration__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__0_in_rule__Field_declaration__Alternatives1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__VariableDeclarationAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__ContructorNameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__MethodNameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__StatementMethodAssignment_7_0_in_rule__Method_declaration__Alternatives_71944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Method_declaration__Alternatives_71963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type_specifier__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type_specifier__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type_specifier__Alternatives2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type_specifier__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type_specifier__Alternatives2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type_specifier__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type_specifier__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type_specifier__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOD_in_rule__Modifier__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Modifier__Alternatives2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Statement__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__IfStatementAssignment_3_in_rule__Statement__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoStatementAssignment_4_in_rule__Statement__Alternatives2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileStatementAssignment_5_in_rule__Statement__Alternatives2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__TryStatementAssignment_6_in_rule__Statement__Alternatives2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__0_in_rule__Statement__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02480 = new BitSet(new long[]{0x00000200021000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12541 = new BitSet(new long[]{0x00000200021000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2571 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2629 = new BitSet(new long[]{0x00000000021000B2L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02666 = new BitSet(new long[]{0x00000000021000B0L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12727 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type_declaration__Group__2__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02852 = new BitSet(new long[]{0x00000000021000B0L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2882 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12913 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22975 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__33035 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__33038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__43096 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__43099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__53158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__03229 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13291 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3378 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03538 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3568 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13599 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23661 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33721 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43782 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53843 = new BitSet(new long[]{0x00000000004FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63905 = new BitSet(new long[]{0x00000000004FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl3935 = new BitSet(new long[]{0x00000000000FF8F2L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class_declaration__Group__7__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__04041 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__04044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__14103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__04164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__04167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__14226 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__14229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4313 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04350 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04473 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04595 = new BitSet(new long[]{0x00000000000FF8F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04719 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4749 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24840 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34900 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44962 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__55023 = new BitSet(new long[]{0x0000000020200800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__55026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method_declaration__Group__5__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__65085 = new BitSet(new long[]{0x0000000020200800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__65088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method_declaration__Group__6__Impl5117 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__75150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__05223 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__05226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5253 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15284 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25344 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35406 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45467 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05598 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5685 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05720 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05843 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15903 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Parameter__Group__2__Impl5992 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06031 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl6061 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16092 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26152 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__26155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__36212 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__36215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6242 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06342 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06465 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl6554 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06591 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group__1__Impl6680 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06717 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06838 = new BitSet(new long[]{0x00000057806FF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement_block__Group__0__Impl6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16900 = new BitSet(new long[]{0x00000057806FF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl6930 = new BitSet(new long[]{0x00000057802FF872L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement_block__Group__2__Impl6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__07026 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__07029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameStatementAssignment_1_0_in_rule__Statement__Group_1__0__Impl7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__17086 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__17089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_1__1__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__27148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_1_2_in_rule__Statement__Group_1__2__Impl7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__07211 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__07214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__17272 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__17275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_7__1__Impl7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__27334 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__3_in_rule__Statement__Group_7__27337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_7_2_in_rule__Statement__Group_7__2__Impl7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__3__Impl_in_rule__Statement__Group_7__37395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_7__3__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__07462 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__07465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__17523 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__2_in_rule__Statement__Group_8__17526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_8__1__Impl7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__2__Impl_in_rule__Statement__Group_8__27585 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__3_in_rule__Statement__Group_8__27588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_8_2_in_rule__Statement__Group_8__2__Impl7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__3__Impl_in_rule__Statement__Group_8__37646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_8__3__Impl7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__0__Impl_in_rule__Statement__Group_9__07713 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__1_in_rule__Statement__Group_9__07716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__1__Impl_in_rule__Statement__Group_9__17774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_9__1__Impl7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__0__Impl_in_rule__While_Statement__Group__07837 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__1_in_rule__While_Statement__Group__07840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__While_Statement__Group__0__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__1__Impl_in_rule__While_Statement__Group__17899 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__2_in_rule__While_Statement__Group__17902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__While_Statement__Group__1__Impl7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__2__Impl_in_rule__While_Statement__Group__27961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__StatementAssignment_2_in_rule__While_Statement__Group__2__Impl7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__0__Impl_in_rule__Do_Statement__Group__08024 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__1_in_rule__Do_Statement__Group__08027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Do_Statement__Group__0__Impl8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__1__Impl_in_rule__Do_Statement__Group__18086 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__2_in_rule__Do_Statement__Group__18089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__StatementAssignment_1_in_rule__Do_Statement__Group__1__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__2__Impl_in_rule__Do_Statement__Group__28146 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__3_in_rule__Do_Statement__Group__28149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Do_Statement__Group__2__Impl8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__3__Impl_in_rule__Do_Statement__Group__38208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Do_Statement__Group__3__Impl8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__08275 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__08278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__If_statement__Group__0__Impl8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__18337 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__18340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__If_statement__Group__1__Impl8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__28399 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__28402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If_statement__Group__2__Impl8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__38458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0_in_rule__If_statement__Group__3__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0__Impl_in_rule__If_statement__Group_3__08524 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__1_in_rule__If_statement__Group_3__08527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__If_statement__Group_3__0__Impl8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__1__Impl_in_rule__If_statement__Group_3__18588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__ElseStatementAssignment_3_1_in_rule__If_statement__Group_3__1__Impl8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__08649 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__08652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Try_statement__Group__0__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__18711 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__18714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__28771 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__28774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl8801 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__38832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__08898 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__08901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Try_statement__Group_2__0__Impl8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__18962 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__18965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Try_statement__Group_2__1__Impl8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__29024 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__29027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__39084 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__39087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Try_statement__Group_2__3__Impl9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__49146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__09213 = new BitSet(new long[]{0x00000057802FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__09216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Try_statement__Group_3__0__Impl9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__19277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__09338 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__09341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Import_statement__Group__0__Impl9369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__19400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__09461 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__09464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__19521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__09584 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__09587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__19644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Import_statement__Group_1_1__1__Impl9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__09707 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__09710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Package_statement__Group__0__Impl9738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__19769 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__19772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__29829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Package_statement__Group__2__Impl9857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__09894 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__09897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__19953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__010013 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__010016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Package_name_line__Group__0__Impl10044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__110075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_010171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_110202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_210233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_010264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_010295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_110326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_010357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_210388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_110419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_110450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_010481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_210512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_110543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_110574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_110605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_610636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_010667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_010698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_110729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_210760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_110791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_010822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_110853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_210884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_410915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_010946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_010977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_111008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_311039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_511070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_011101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_111132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_011163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_111194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_011225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_111256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_211287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_111318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_011349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_011380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_011411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_111442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_111473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_1_011504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_1_211535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_rule__Statement__IfStatementAssignment_311566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_rule__Statement__DoStatementAssignment_411597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_rule__Statement__WhileStatementAssignment_511628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_611659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_7_211690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_8_211721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__While_Statement__StatementAssignment_211752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Do_Statement__StatementAssignment_111783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If_statement__ElseStatementAssignment_3_111814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_111845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_211876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_411907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_111938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_011969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_012000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_112031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0_in_synpred54_InternalMyDsl8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_synpred55_InternalMyDsl8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_synpred56_InternalMyDsl8859 = new BitSet(new long[]{0x0000000000000002L});

}