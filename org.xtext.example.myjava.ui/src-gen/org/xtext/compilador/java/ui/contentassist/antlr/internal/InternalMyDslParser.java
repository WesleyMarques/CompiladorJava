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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MOD", "RULE_STATIC", "RULE_ID", "RULE_DOC_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "'interface'", "'{'", "'}'", "'extends'", "','", "'class'", "'implements'", "'('", "')'", "'[]'", "'synchronized('", "'return'", "'throw'", "':'", "'break'", "'continue'", "'while('", "'do'", "');'", "'if('", "'else'", "'try'", "'catch'", "'finally'", "'import'", "'.*;'", "'package'", "'.'"
    };
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
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
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

                if ( (LA1_0==47) ) {
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_2 ) ) | ( ( rule__Statement__DoStatementAssignment_3 ) ) | ( ( rule__Statement__WhileStatementAssignment_4 ) ) | ( ( rule__Statement__TryStatementAssignment_5 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) | ( ( rule__Statement__Group_10__0 ) ) | ( ( rule__Statement__Group_11__0 ) ) | ( ( rule__Statement__Group_12__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: ( ( ruleStatement_block ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_2 ) ) | ( ( rule__Statement__DoStatementAssignment_3 ) ) | ( ( rule__Statement__WhileStatementAssignment_4 ) ) | ( ( rule__Statement__TryStatementAssignment_5 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) | ( ( rule__Statement__Group_10__0 ) ) | ( ( rule__Statement__Group_11__0 ) ) | ( ( rule__Statement__Group_12__0 ) ) )
            int alt8=13;
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:6: ( ruleVariable_declaration )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:6: ( ruleVariable_declaration )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ruleVariable_declaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2255);
                    ruleVariable_declaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getVariable_declarationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:6: ( ( rule__Statement__IfStatementAssignment_2 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:6: ( ( rule__Statement__IfStatementAssignment_2 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( rule__Statement__IfStatementAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementAssignment_2()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( rule__Statement__IfStatementAssignment_2 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:2: rule__Statement__IfStatementAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Statement__IfStatementAssignment_2_in_rule__Statement__Alternatives2272);
                    rule__Statement__IfStatementAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:6: ( ( rule__Statement__DoStatementAssignment_3 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:6: ( ( rule__Statement__DoStatementAssignment_3 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( rule__Statement__DoStatementAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDoStatementAssignment_3()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( rule__Statement__DoStatementAssignment_3 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:2: rule__Statement__DoStatementAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Statement__DoStatementAssignment_3_in_rule__Statement__Alternatives2290);
                    rule__Statement__DoStatementAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDoStatementAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:6: ( ( rule__Statement__WhileStatementAssignment_4 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:6: ( ( rule__Statement__WhileStatementAssignment_4 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( rule__Statement__WhileStatementAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileStatementAssignment_4()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( rule__Statement__WhileStatementAssignment_4 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:2: rule__Statement__WhileStatementAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Statement__WhileStatementAssignment_4_in_rule__Statement__Alternatives2308);
                    rule__Statement__WhileStatementAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileStatementAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:6: ( ( rule__Statement__TryStatementAssignment_5 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:6: ( ( rule__Statement__TryStatementAssignment_5 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( rule__Statement__TryStatementAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getTryStatementAssignment_5()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( rule__Statement__TryStatementAssignment_5 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:2: rule__Statement__TryStatementAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Statement__TryStatementAssignment_5_in_rule__Statement__Alternatives2326);
                    rule__Statement__TryStatementAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getTryStatementAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:6: ( ( rule__Statement__Group_6__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:6: ( ( rule__Statement__Group_6__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( rule__Statement__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_6()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( rule__Statement__Group_6__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:2: rule__Statement__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives2344);
                    rule__Statement__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_6()); 
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
                case 11 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:6: ( ( rule__Statement__Group_10__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:6: ( ( rule__Statement__Group_10__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: ( rule__Statement__Group_10__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_10()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( rule__Statement__Group_10__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:2: rule__Statement__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_10__0_in_rule__Statement__Alternatives2416);
                    rule__Statement__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:6: ( ( rule__Statement__Group_11__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:6: ( ( rule__Statement__Group_11__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( rule__Statement__Group_11__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_11()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: ( rule__Statement__Group_11__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:2: rule__Statement__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_11__0_in_rule__Statement__Alternatives2434);
                    rule__Statement__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:6: ( ( rule__Statement__Group_12__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:6: ( ( rule__Statement__Group_12__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: ( rule__Statement__Group_12__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_12()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( rule__Statement__Group_12__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:2: rule__Statement__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_12__0_in_rule__Statement__Alternatives2452);
                    rule__Statement__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_12()); 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );
    public final void rule__Import_statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( rule__Import_statement__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( rule__Import_statement__Group_1_0__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:2: rule__Import_statement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12485);
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
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    {
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( rule__Import_statement__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( rule__Import_statement__Group_1_1__0 )
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:2: rule__Import_statement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12503);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: rule__Compilation_unit__Group__0 : rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 ;
    public final void rule__Compilation_unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:2: rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02534);
            rule__Compilation_unit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02537);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: rule__Compilation_unit__Group__0__Impl : ( ( rule__Compilation_unit__NameAssignment_0 )? ) ;
    public final void rule__Compilation_unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( ( ( rule__Compilation_unit__NameAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: ( ( rule__Compilation_unit__NameAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( rule__Compilation_unit__NameAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNameAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( rule__Compilation_unit__NameAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:2: rule__Compilation_unit__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2564);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: rule__Compilation_unit__Group__1 : rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 ;
    public final void rule__Compilation_unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:2: rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12595);
            rule__Compilation_unit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12598);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: rule__Compilation_unit__Group__1__Impl : ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) ;
    public final void rule__Compilation_unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:2: rule__Compilation_unit__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2625);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: rule__Compilation_unit__Group__2 : rule__Compilation_unit__Group__2__Impl ;
    public final void rule__Compilation_unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ( rule__Compilation_unit__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:2: rule__Compilation_unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22656);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: rule__Compilation_unit__Group__2__Impl : ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) ;
    public final void rule__Compilation_unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: ( ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( rule__Compilation_unit__TypeDeclarationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_MOD && LA12_0<=RULE_STATIC)||LA12_0==RULE_DOC_COMMENT||LA12_0==20||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:2: rule__Compilation_unit__TypeDeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2683);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: rule__Type_declaration__Group__0 : rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 ;
    public final void rule__Type_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:2: rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02720);
            rule__Type_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02723);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: rule__Type_declaration__Group__0__Impl : ( ( rule__Type_declaration__CommentAssignment_0 )? ) ;
    public final void rule__Type_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: ( ( ( rule__Type_declaration__CommentAssignment_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( ( rule__Type_declaration__CommentAssignment_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( rule__Type_declaration__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( rule__Type_declaration__CommentAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOC_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:2: rule__Type_declaration__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2750);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: rule__Type_declaration__Group__1 : rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 ;
    public final void rule__Type_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:2: rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12781);
            rule__Type_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12784);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: rule__Type_declaration__Group__1__Impl : ( ( rule__Type_declaration__Alternatives_1 ) ) ;
    public final void rule__Type_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( ( ( rule__Type_declaration__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( rule__Type_declaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( rule__Type_declaration__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:2: rule__Type_declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2811);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: rule__Type_declaration__Group__2 : rule__Type_declaration__Group__2__Impl ;
    public final void rule__Type_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( rule__Type_declaration__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:2: rule__Type_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22841);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: rule__Type_declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Type_declaration__Group__2__Impl2869); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: rule__Interface_declaration__Group__0 : rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 ;
    public final void rule__Interface_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:2: rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02906);
            rule__Interface_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02909);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: rule__Interface_declaration__Group__0__Impl : ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Interface_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_MOD && LA14_0<=RULE_STATIC)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:2: rule__Interface_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2936);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: rule__Interface_declaration__Group__1 : rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 ;
    public final void rule__Interface_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:1: ( rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:2: rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12967);
            rule__Interface_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12970);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: rule__Interface_declaration__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( ( 'interface' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( 'interface' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( 'interface' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2998); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__Interface_declaration__Group__2 : rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 ;
    public final void rule__Interface_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:2: rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__23029);
            rule__Interface_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__23032);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: rule__Interface_declaration__Group__2__Impl : ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) ;
    public final void rule__Interface_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:2: rule__Interface_declaration__InterfaceNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl3059);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: rule__Interface_declaration__Group__3 : rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 ;
    public final void rule__Interface_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: ( rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:2: rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__33089);
            rule__Interface_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__33092);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: rule__Interface_declaration__Group__3__Impl : ( ( rule__Interface_declaration__Group_3__0 )? ) ;
    public final void rule__Interface_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( ( rule__Interface_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( rule__Interface_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( rule__Interface_declaration__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:2: rule__Interface_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl3119);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: rule__Interface_declaration__Group__4 : rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 ;
    public final void rule__Interface_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:2: rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__43150);
            rule__Interface_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__43153);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: rule__Interface_declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl3181); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: rule__Interface_declaration__Group__5 : rule__Interface_declaration__Group__5__Impl ;
    public final void rule__Interface_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( rule__Interface_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:2: rule__Interface_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__53212);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: rule__Interface_declaration__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl3240); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: rule__Interface_declaration__Group_3__0 : rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 ;
    public final void rule__Interface_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:2: rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__03283);
            rule__Interface_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03286);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: rule__Interface_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl3314); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: rule__Interface_declaration__Group_3__1 : rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 ;
    public final void rule__Interface_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: ( rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:2: rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13345);
            rule__Interface_declaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13348);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: rule__Interface_declaration__Group_3__1__Impl : ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) ;
    public final void rule__Interface_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:2: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3375);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__Interface_declaration__Group_3__2 : rule__Interface_declaration__Group_3__2__Impl ;
    public final void rule__Interface_declaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( rule__Interface_declaration__Group_3__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:2: rule__Interface_declaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23405);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: rule__Interface_declaration__Group_3__2__Impl : ( ( rule__Interface_declaration__Group_3_2__0 )* ) ;
    public final void rule__Interface_declaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( ( ( rule__Interface_declaration__Group_3_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( rule__Interface_declaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( rule__Interface_declaration__Group_3_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:2: rule__Interface_declaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3432);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: rule__Interface_declaration__Group_3_2__0 : rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 ;
    public final void rule__Interface_declaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: ( rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:2: rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03469);
            rule__Interface_declaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03472);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: rule__Interface_declaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface_declaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl3500); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: rule__Interface_declaration__Group_3_2__1 : rule__Interface_declaration__Group_3_2__1__Impl ;
    public final void rule__Interface_declaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: ( rule__Interface_declaration__Group_3_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:2: rule__Interface_declaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13531);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: rule__Interface_declaration__Group_3_2__1__Impl : ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) ;
    public final void rule__Interface_declaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasAssignment_3_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:2: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3558);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: rule__Class_declaration__Group__0 : rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 ;
    public final void rule__Class_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: ( rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:2: rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03592);
            rule__Class_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03595);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: rule__Class_declaration__Group__0__Impl : ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Class_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_MOD && LA17_0<=RULE_STATIC)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:2: rule__Class_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3622);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__Class_declaration__Group__1 : rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 ;
    public final void rule__Class_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13653);
            rule__Class_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13656);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: rule__Class_declaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( 'class' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( 'class' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( 'class' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3684); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: rule__Class_declaration__Group__2 : rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 ;
    public final void rule__Class_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: ( rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:2: rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23715);
            rule__Class_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23718);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: rule__Class_declaration__Group__2__Impl : ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) ;
    public final void rule__Class_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: ( ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:2: rule__Class_declaration__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3745);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: rule__Class_declaration__Group__3 : rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 ;
    public final void rule__Class_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: ( rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:2: rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33775);
            rule__Class_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33778);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:1: rule__Class_declaration__Group__3__Impl : ( ( rule__Class_declaration__Group_3__0 )? ) ;
    public final void rule__Class_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ( ( rule__Class_declaration__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( ( rule__Class_declaration__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( ( rule__Class_declaration__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( rule__Class_declaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( rule__Class_declaration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:2: rule__Class_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3805);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:1: rule__Class_declaration__Group__4 : rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 ;
    public final void rule__Class_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ( rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:2: rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43836);
            rule__Class_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43839);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: rule__Class_declaration__Group__4__Impl : ( ( rule__Class_declaration__Group_4__0 )? ) ;
    public final void rule__Class_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ( ( rule__Class_declaration__Group_4__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ( rule__Class_declaration__Group_4__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ( rule__Class_declaration__Group_4__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( rule__Class_declaration__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( rule__Class_declaration__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:2: rule__Class_declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3866);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: rule__Class_declaration__Group__5 : rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 ;
    public final void rule__Class_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:2: rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53897);
            rule__Class_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53900);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: rule__Class_declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Class_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3928); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:1: rule__Class_declaration__Group__6 : rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 ;
    public final void rule__Class_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:2: rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63959);
            rule__Class_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63962);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: rule__Class_declaration__Group__6__Impl : ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) ;
    public final void rule__Class_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ( rule__Class_declaration__FieldsDeclarationAssignment_6 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationAssignment_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( rule__Class_declaration__FieldsDeclarationAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_MOD && LA20_0<=RULE_DOC_COMMENT)||(LA20_0>=11 && LA20_0<=19)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:2: rule__Class_declaration__FieldsDeclarationAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl3989);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: rule__Class_declaration__Group__7 : rule__Class_declaration__Group__7__Impl ;
    public final void rule__Class_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: ( rule__Class_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:2: rule__Class_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__74020);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: rule__Class_declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,22,FOLLOW_22_in_rule__Class_declaration__Group__7__Impl4048); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: rule__Class_declaration__Group_3__0 : rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 ;
    public final void rule__Class_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:2: rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__04095);
            rule__Class_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__04098);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: rule__Class_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( 'extends' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl4126); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: rule__Class_declaration__Group_3__1 : rule__Class_declaration__Group_3__1__Impl ;
    public final void rule__Class_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( rule__Class_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:2: rule__Class_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__14157);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: rule__Class_declaration__Group_3__1__Impl : ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) ;
    public final void rule__Class_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: ( ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( ( rule__Class_declaration__ClassHerdadaAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( rule__Class_declaration__ClassHerdadaAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:2: rule__Class_declaration__ClassHerdadaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl4184);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: rule__Class_declaration__Group_4__0 : rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 ;
    public final void rule__Class_declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: ( rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:2: rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__04218);
            rule__Class_declaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__04221);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: rule__Class_declaration__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Class_declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( ( 'implements' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( 'implements' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( 'implements' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl4249); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: rule__Class_declaration__Group_4__1 : rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 ;
    public final void rule__Class_declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:2: rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__14280);
            rule__Class_declaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__14283);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: rule__Class_declaration__Group_4__1__Impl : ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) ;
    public final void rule__Class_declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaAssignment_4_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( rule__Class_declaration__InterfaceImplementadaAssignment_4_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:2: rule__Class_declaration__InterfaceImplementadaAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4310);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: rule__Class_declaration__Group_4__2 : rule__Class_declaration__Group_4__2__Impl ;
    public final void rule__Class_declaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: ( rule__Class_declaration__Group_4__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:2: rule__Class_declaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24340);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: rule__Class_declaration__Group_4__2__Impl : ( ( rule__Class_declaration__Group_4_2__0 )* ) ;
    public final void rule__Class_declaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( ( ( rule__Class_declaration__Group_4_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( rule__Class_declaration__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( rule__Class_declaration__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:2: rule__Class_declaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4367);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: rule__Class_declaration__Group_4_2__0 : rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 ;
    public final void rule__Class_declaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:2: rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04404);
            rule__Class_declaration__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04407);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: rule__Class_declaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class_declaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl4435); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: rule__Class_declaration__Group_4_2__1 : rule__Class_declaration__Group_4_2__1__Impl ;
    public final void rule__Class_declaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( rule__Class_declaration__Group_4_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:2: rule__Class_declaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14466);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: rule__Class_declaration__Group_4_2__1__Impl : ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) ;
    public final void rule__Class_declaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: ( ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasAssignment_4_2_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:2: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4493);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: rule__Field_declaration__Group_0__0 : rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 ;
    public final void rule__Field_declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:2: rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04527);
            rule__Field_declaration__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04530);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__Field_declaration__Group_0__0__Impl : ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) ;
    public final void rule__Field_declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( ( ( rule__Field_declaration__CommentAssignment_0_0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ( rule__Field_declaration__CommentAssignment_0_0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentAssignment_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:1: ( rule__Field_declaration__CommentAssignment_0_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOC_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:2: rule__Field_declaration__CommentAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4557);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: rule__Field_declaration__Group_0__1 : rule__Field_declaration__Group_0__1__Impl ;
    public final void rule__Field_declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( rule__Field_declaration__Group_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:2: rule__Field_declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14588);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: rule__Field_declaration__Group_0__1__Impl : ( ( rule__Field_declaration__Alternatives_0_1 ) ) ;
    public final void rule__Field_declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ( ( ( rule__Field_declaration__Alternatives_0_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( rule__Field_declaration__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( rule__Field_declaration__Alternatives_0_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:2: rule__Field_declaration__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4615);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: rule__Field_declaration__Group_2__0 : rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 ;
    public final void rule__Field_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:2: rule__Field_declaration__Group_2__0__Impl rule__Field_declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04649);
            rule__Field_declaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04652);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: rule__Field_declaration__Group_2__0__Impl : ( () ) ;
    public final void rule__Field_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getField_declarationAction_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: rule__Field_declaration__Group_2__1 : rule__Field_declaration__Group_2__1__Impl ;
    public final void rule__Field_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: ( rule__Field_declaration__Group_2__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:2: rule__Field_declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14710);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: rule__Field_declaration__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Field_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4738); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: rule__Method_declaration__Group__0 : rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 ;
    public final void rule__Method_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:2: rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04773);
            rule__Method_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04776);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: rule__Method_declaration__Group__0__Impl : ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) ;
    public final void rule__Method_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: ( ( rule__Method_declaration__ModifiersMethodAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( rule__Method_declaration__ModifiersMethodAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_MOD && LA23_0<=RULE_STATIC)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Method_declaration__ModifiersMethodAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4803);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: rule__Method_declaration__Group__1 : rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 ;
    public final void rule__Method_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: ( rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:2: rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14834);
            rule__Method_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14837);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: rule__Method_declaration__Group__1__Impl : ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) ;
    public final void rule__Method_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( ( ( rule__Method_declaration__TypeMethodAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ( rule__Method_declaration__TypeMethodAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( rule__Method_declaration__TypeMethodAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:2: rule__Method_declaration__TypeMethodAssignment_1
            {
            pushFollow(FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl4864);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: rule__Method_declaration__Group__2 : rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 ;
    public final void rule__Method_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: ( rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:2: rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24894);
            rule__Method_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24897);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: rule__Method_declaration__Group__2__Impl : ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) ;
    public final void rule__Method_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: ( ( ( rule__Method_declaration__NameMethodAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( rule__Method_declaration__NameMethodAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( rule__Method_declaration__NameMethodAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:2: rule__Method_declaration__NameMethodAssignment_2
            {
            pushFollow(FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl4924);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: rule__Method_declaration__Group__3 : rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 ;
    public final void rule__Method_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:2: rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34954);
            rule__Method_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34957);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: rule__Method_declaration__Group__3__Impl : ( '(' ) ;
    public final void rule__Method_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4985); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: rule__Method_declaration__Group__4 : rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 ;
    public final void rule__Method_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: ( rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:2: rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__45016);
            rule__Method_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__45019);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: rule__Method_declaration__Group__4__Impl : ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) ;
    public final void rule__Method_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: ( ( rule__Method_declaration__ParameterListMethodAssignment_4 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodAssignment_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: ( rule__Method_declaration__ParameterListMethodAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=12 && LA24_0<=19)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:2: rule__Method_declaration__ParameterListMethodAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl5046);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: rule__Method_declaration__Group__5 : rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 ;
    public final void rule__Method_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: ( rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:2: rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__55077);
            rule__Method_declaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__55080);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: rule__Method_declaration__Group__5__Impl : ( ')' ) ;
    public final void rule__Method_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_28_in_rule__Method_declaration__Group__5__Impl5108); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: rule__Method_declaration__Group__6 : rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 ;
    public final void rule__Method_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:2: rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__65139);
            rule__Method_declaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__65142);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: rule__Method_declaration__Group__6__Impl : ( ( '[]' )* ) ;
    public final void rule__Method_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: ( '[]' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Method_declaration__Group__6__Impl5171); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: rule__Method_declaration__Group__7 : rule__Method_declaration__Group__7__Impl ;
    public final void rule__Method_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( rule__Method_declaration__Group__7__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:2: rule__Method_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__75204);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:1: rule__Method_declaration__Group__7__Impl : ( ( rule__Method_declaration__Alternatives_7 ) ) ;
    public final void rule__Method_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( ( ( rule__Method_declaration__Alternatives_7 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( rule__Method_declaration__Alternatives_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: ( rule__Method_declaration__Alternatives_7 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:2: rule__Method_declaration__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl5231);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: rule__Constructor_declaration__Group__0 : rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 ;
    public final void rule__Constructor_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:2: rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__05277);
            rule__Constructor_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__05280);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2559:1: rule__Constructor_declaration__Group__0__Impl : ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) ;
    public final void rule__Constructor_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( rule__Constructor_declaration__ModifiersConstructorAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_MOD && LA26_0<=RULE_STATIC)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:2: rule__Constructor_declaration__ModifiersConstructorAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5307);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: rule__Constructor_declaration__Group__1 : rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 ;
    public final void rule__Constructor_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: ( rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:2: rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15338);
            rule__Constructor_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15341);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2588:1: rule__Constructor_declaration__Group__1__Impl : ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) ;
    public final void rule__Constructor_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: ( ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( ( rule__Constructor_declaration__NameConstructorAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( rule__Constructor_declaration__NameConstructorAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:2: rule__Constructor_declaration__NameConstructorAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5368);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: rule__Constructor_declaration__Group__2 : rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 ;
    public final void rule__Constructor_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:2: rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25398);
            rule__Constructor_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25401);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: rule__Constructor_declaration__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl5429); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: rule__Constructor_declaration__Group__3 : rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 ;
    public final void rule__Constructor_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: ( rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:2: rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35460);
            rule__Constructor_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35463);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: rule__Constructor_declaration__Group__3__Impl : ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) ;
    public final void rule__Constructor_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: ( ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorAssignment_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( rule__Constructor_declaration__ParameterListConstructorAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=12 && LA27_0<=19)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:2: rule__Constructor_declaration__ParameterListConstructorAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5490);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__Constructor_declaration__Group__4 : rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 ;
    public final void rule__Constructor_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:2: rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45521);
            rule__Constructor_declaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45524);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: rule__Constructor_declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl5552); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: rule__Constructor_declaration__Group__5 : rule__Constructor_declaration__Group__5__Impl ;
    public final void rule__Constructor_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ( rule__Constructor_declaration__Group__5__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:2: rule__Constructor_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55583);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: rule__Constructor_declaration__Group__5__Impl : ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) ;
    public final void rule__Constructor_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: ( ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( ( rule__Constructor_declaration__StatementConstructorAssignment_5 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorAssignment_5()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: ( rule__Constructor_declaration__StatementConstructorAssignment_5 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:2: rule__Constructor_declaration__StatementConstructorAssignment_5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5610);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2741:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05652);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05655);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParameterAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: ( ( ( rule__Parameter_list__ParameterAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: ( rule__Parameter_list__ParameterAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( rule__Parameter_list__ParameterAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:2: rule__Parameter_list__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5682);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( rule__Parameter_list__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15712);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: ( rule__Parameter_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( rule__Parameter_list__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:2: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5739);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05774);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05777);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5805); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( rule__Parameter_list__Group_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15836);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:2: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5863);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05897);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05900);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( rule__Parameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5927);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15957);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15960);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParameterNameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: ( ( ( rule__Parameter__ParameterNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:1: ( rule__Parameter__ParameterNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: ( rule__Parameter__ParameterNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:2: rule__Parameter__ParameterNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl5987);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26017);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: rule__Parameter__Group__2__Impl : ( ( '[]' )* ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:1: ( '[]' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Parameter__Group__2__Impl6046); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06085);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06088);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: ( ( rule__Variable_declaration__ModifiersVariableAssignment_0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( rule__Variable_declaration__ModifiersVariableAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_MOD && LA30_0<=RULE_STATIC)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:2: rule__Variable_declaration__ModifiersVariableAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl6115);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16146);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16149);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: rule__Variable_declaration__Group__1__Impl : ( ( rule__Variable_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:1: ( ( ( rule__Variable_declaration__TypeAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: ( rule__Variable_declaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( rule__Variable_declaration__TypeAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:2: rule__Variable_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl6176);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: ( rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:2: rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26206);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__26209);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: ( ( ( rule__Variable_declaration__NameVariableAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: ( ( rule__Variable_declaration__NameVariableAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: ( rule__Variable_declaration__NameVariableAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:2: rule__Variable_declaration__NameVariableAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl6236);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: rule__Variable_declaration__Group__3 : rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 ;
    public final void rule__Variable_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:2: rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__36266);
            rule__Variable_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__36269);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: rule__Variable_declaration__Group__3__Impl : ( ( rule__Variable_declaration__Group_3__0 )* ) ;
    public final void rule__Variable_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ( ( ( rule__Variable_declaration__Group_3__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:1: ( rule__Variable_declaration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:1: ( rule__Variable_declaration__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:2: rule__Variable_declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6296);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: rule__Variable_declaration__Group__4 : rule__Variable_declaration__Group__4__Impl ;
    public final void rule__Variable_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( rule__Variable_declaration__Group__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:2: rule__Variable_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46327);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: rule__Variable_declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Variable_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,11,FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6355); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: rule__Variable_declaration__Group_3__0 : rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 ;
    public final void rule__Variable_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:2: rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06396);
            rule__Variable_declaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06399);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: rule__Variable_declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:1: ( ( ',' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( ',' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: ( ',' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl6427); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: rule__Variable_declaration__Group_3__1 : rule__Variable_declaration__Group_3__1__Impl ;
    public final void rule__Variable_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: ( rule__Variable_declaration__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:2: rule__Variable_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16458);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: rule__Variable_declaration__Group_3__1__Impl : ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) ;
    public final void rule__Variable_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: ( ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:2: rule__Variable_declaration__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6485);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: rule__Variable_declarator__Group__0 : rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 ;
    public final void rule__Variable_declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:2: rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06519);
            rule__Variable_declarator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06522);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: rule__Variable_declarator__Group__0__Impl : ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) ;
    public final void rule__Variable_declarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:1: ( ( ( rule__Variable_declarator__NameVariableAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( ( rule__Variable_declarator__NameVariableAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( rule__Variable_declarator__NameVariableAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:2: rule__Variable_declarator__NameVariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6549);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: rule__Variable_declarator__Group__1 : rule__Variable_declarator__Group__1__Impl ;
    public final void rule__Variable_declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( rule__Variable_declarator__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:2: rule__Variable_declarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16579);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: rule__Variable_declarator__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Variable_declarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( '[]' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl6608); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06645);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06648);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: rule__Type__Group__0__Impl : ( ( rule__Type__TypeSpecifierAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( ( ( rule__Type__TypeSpecifierAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: ( ( rule__Type__TypeSpecifierAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( rule__Type__TypeSpecifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: ( rule__Type__TypeSpecifierAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:2: rule__Type__TypeSpecifierAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6675);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: ( rule__Type__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16705);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: rule__Type__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ( ( '[]' )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( ( '[]' )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( ( '[]' )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: ( '[]' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:1: ( '[]' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Type__Group__1__Impl6734); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: rule__Static_initializer__Group__0 : rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 ;
    public final void rule__Static_initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: ( rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:2: rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06771);
            rule__Static_initializer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06774);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: rule__Static_initializer__Group__0__Impl : ( ( rule__Static_initializer__StaticAssignment_0 ) ) ;
    public final void rule__Static_initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: ( ( ( rule__Static_initializer__StaticAssignment_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: ( ( rule__Static_initializer__StaticAssignment_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3317:1: ( rule__Static_initializer__StaticAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticAssignment_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( rule__Static_initializer__StaticAssignment_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:2: rule__Static_initializer__StaticAssignment_0
            {
            pushFollow(FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6801);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: rule__Static_initializer__Group__1 : rule__Static_initializer__Group__1__Impl ;
    public final void rule__Static_initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3332:1: ( rule__Static_initializer__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:2: rule__Static_initializer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16831);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: rule__Static_initializer__Group__1__Impl : ( ( rule__Static_initializer__NameAssignment_1 ) ) ;
    public final void rule__Static_initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:1: ( ( ( rule__Static_initializer__NameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( rule__Static_initializer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( rule__Static_initializer__NameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:2: rule__Static_initializer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6858);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:1: rule__Statement_block__Group__0 : rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 ;
    public final void rule__Statement_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: ( rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3365:2: rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06892);
            rule__Statement_block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06895);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: rule__Statement_block__Group__0__Impl : ( '{' ) ;
    public final void rule__Statement_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( ( '{' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ( '{' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ( '{' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Statement_block__Group__0__Impl6923); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: rule__Statement_block__Group__1 : rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 ;
    public final void rule__Statement_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: ( rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:2: rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16954);
            rule__Statement_block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16957);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: rule__Statement_block__Group__1__Impl : ( ( rule__Statement_block__StatmentsAssignment_1 )* ) ;
    public final void rule__Statement_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( ( ( rule__Statement_block__StatmentsAssignment_1 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: ( ( rule__Statement_block__StatmentsAssignment_1 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:1: ( rule__Statement_block__StatmentsAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_MOD && LA34_0<=RULE_ID)||(LA34_0>=11 && LA34_0<=19)||LA34_0==21||(LA34_0>=30 && LA34_0<=32)||(LA34_0>=34 && LA34_0<=37)||LA34_0==39||LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:2: rule__Statement_block__StatmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl6984);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: rule__Statement_block__Group__2 : rule__Statement_block__Group__2__Impl ;
    public final void rule__Statement_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: ( rule__Statement_block__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3425:2: rule__Statement_block__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__27015);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: rule__Statement_block__Group__2__Impl : ( '}' ) ;
    public final void rule__Statement_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:1: ( ( '}' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( '}' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( '}' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Statement_block__Group__2__Impl7043); if (state.failed) return ;
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


    // $ANTLR start "rule__Statement__Group_6__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: rule__Statement__Group_6__0 : rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 ;
    public final void rule__Statement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:2: rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__07080);
            rule__Statement__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__07083);
            rule__Statement__Group_6__1();

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
    // $ANTLR end "rule__Statement__Group_6__0"


    // $ANTLR start "rule__Statement__Group_6__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: rule__Statement__Group_6__0__Impl : ( () ) ;
    public final void rule__Statement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3474:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_6_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_6__0__Impl"


    // $ANTLR start "rule__Statement__Group_6__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3487:1: rule__Statement__Group_6__1 : rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 ;
    public final void rule__Statement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3491:1: ( rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3492:2: rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__17141);
            rule__Statement__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__17144);
            rule__Statement__Group_6__2();

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
    // $ANTLR end "rule__Statement__Group_6__1"


    // $ANTLR start "rule__Statement__Group_6__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: rule__Statement__Group_6__1__Impl : ( 'synchronized(' ) ;
    public final void rule__Statement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:1: ( ( 'synchronized(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: ( 'synchronized(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: ( 'synchronized(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: 'synchronized('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSynchronizedKeyword_6_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Statement__Group_6__1__Impl7172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSynchronizedKeyword_6_1()); 
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
    // $ANTLR end "rule__Statement__Group_6__1__Impl"


    // $ANTLR start "rule__Statement__Group_6__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: rule__Statement__Group_6__2 : rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 ;
    public final void rule__Statement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:2: rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__27203);
            rule__Statement__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__27206);
            rule__Statement__Group_6__3();

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
    // $ANTLR end "rule__Statement__Group_6__2"


    // $ANTLR start "rule__Statement__Group_6__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: rule__Statement__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Statement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Statement__Group_6__2__Impl7234); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_6_2()); 
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
    // $ANTLR end "rule__Statement__Group_6__2__Impl"


    // $ANTLR start "rule__Statement__Group_6__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:1: rule__Statement__Group_6__3 : rule__Statement__Group_6__3__Impl ;
    public final void rule__Statement__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:1: ( rule__Statement__Group_6__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:2: rule__Statement__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__37265);
            rule__Statement__Group_6__3__Impl();

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
    // $ANTLR end "rule__Statement__Group_6__3"


    // $ANTLR start "rule__Statement__Group_6__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: rule__Statement__Group_6__3__Impl : ( ( rule__Statement__SyncStatementAssignment_6_3 ) ) ;
    public final void rule__Statement__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: ( ( ( rule__Statement__SyncStatementAssignment_6_3 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: ( ( rule__Statement__SyncStatementAssignment_6_3 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: ( ( rule__Statement__SyncStatementAssignment_6_3 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: ( rule__Statement__SyncStatementAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSyncStatementAssignment_6_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( rule__Statement__SyncStatementAssignment_6_3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:2: rule__Statement__SyncStatementAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Statement__SyncStatementAssignment_6_3_in_rule__Statement__Group_6__3__Impl7292);
            rule__Statement__SyncStatementAssignment_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSyncStatementAssignment_6_3()); 
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
    // $ANTLR end "rule__Statement__Group_6__3__Impl"


    // $ANTLR start "rule__Statement__Group_7__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__07330);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__07333);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: rule__Statement__Group_7__0__Impl : ( () ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_7_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3604:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: ( rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:2: rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__17391);
            rule__Statement__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__17394);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: rule__Statement__Group_7__1__Impl : ( 'return' ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ( 'return' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( 'return' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( 'return' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnKeyword_7_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Statement__Group_7__1__Impl7422); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnKeyword_7_1()); 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: rule__Statement__Group_7__2 : rule__Statement__Group_7__2__Impl ;
    public final void rule__Statement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: ( rule__Statement__Group_7__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:2: rule__Statement__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__27453);
            rule__Statement__Group_7__2__Impl();

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:1: rule__Statement__Group_7__2__Impl : ( ';' ) ;
    public final void rule__Statement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_7_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_7__2__Impl7481); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_7_2()); 
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


    // $ANTLR start "rule__Statement__Group_8__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3683:1: rule__Statement__Group_8__0 : rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 ;
    public final void rule__Statement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3687:1: ( rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:2: rule__Statement__Group_8__0__Impl rule__Statement__Group_8__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__07518);
            rule__Statement__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__07521);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: rule__Statement__Group_8__0__Impl : ( () ) ;
    public final void rule__Statement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3699:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_8_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3702:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3704:1: 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:1: rule__Statement__Group_8__1 : rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2 ;
    public final void rule__Statement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: ( rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:2: rule__Statement__Group_8__1__Impl rule__Statement__Group_8__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__17579);
            rule__Statement__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_8__2_in_rule__Statement__Group_8__17582);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:1: rule__Statement__Group_8__1__Impl : ( 'throw' ) ;
    public final void rule__Statement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: ( ( 'throw' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: ( 'throw' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: ( 'throw' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3732:1: 'throw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getThrowKeyword_8_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Statement__Group_8__1__Impl7610); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getThrowKeyword_8_1()); 
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: rule__Statement__Group_8__2 : rule__Statement__Group_8__2__Impl ;
    public final void rule__Statement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: ( rule__Statement__Group_8__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:2: rule__Statement__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_8__2__Impl_in_rule__Statement__Group_8__27641);
            rule__Statement__Group_8__2__Impl();

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: rule__Statement__Group_8__2__Impl : ( ';' ) ;
    public final void rule__Statement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3760:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_8_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_8__2__Impl7669); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_8_2()); 
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


    // $ANTLR start "rule__Statement__Group_9__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3781:1: rule__Statement__Group_9__0 : rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1 ;
    public final void rule__Statement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: ( rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:2: rule__Statement__Group_9__0__Impl rule__Statement__Group_9__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__0__Impl_in_rule__Statement__Group_9__07706);
            rule__Statement__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_9__1_in_rule__Statement__Group_9__07709);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3793:1: rule__Statement__Group_9__0__Impl : ( ( rule__Statement__NameStatementAssignment_9_0 ) ) ;
    public final void rule__Statement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:1: ( ( ( rule__Statement__NameStatementAssignment_9_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:1: ( ( rule__Statement__NameStatementAssignment_9_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:1: ( ( rule__Statement__NameStatementAssignment_9_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: ( rule__Statement__NameStatementAssignment_9_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementAssignment_9_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( rule__Statement__NameStatementAssignment_9_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:2: rule__Statement__NameStatementAssignment_9_0
            {
            pushFollow(FOLLOW_rule__Statement__NameStatementAssignment_9_0_in_rule__Statement__Group_9__0__Impl7736);
            rule__Statement__NameStatementAssignment_9_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameStatementAssignment_9_0()); 
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
    // $ANTLR end "rule__Statement__Group_9__0__Impl"


    // $ANTLR start "rule__Statement__Group_9__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:1: rule__Statement__Group_9__1 : rule__Statement__Group_9__1__Impl rule__Statement__Group_9__2 ;
    public final void rule__Statement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:1: ( rule__Statement__Group_9__1__Impl rule__Statement__Group_9__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:2: rule__Statement__Group_9__1__Impl rule__Statement__Group_9__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__1__Impl_in_rule__Statement__Group_9__17766);
            rule__Statement__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_9__2_in_rule__Statement__Group_9__17769);
            rule__Statement__Group_9__2();

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: rule__Statement__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: ( ( ':' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: ( ':' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: ( ':' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_9_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Statement__Group_9__1__Impl7797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_9_1()); 
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


    // $ANTLR start "rule__Statement__Group_9__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: rule__Statement__Group_9__2 : rule__Statement__Group_9__2__Impl ;
    public final void rule__Statement__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: ( rule__Statement__Group_9__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:2: rule__Statement__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_9__2__Impl_in_rule__Statement__Group_9__27828);
            rule__Statement__Group_9__2__Impl();

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
    // $ANTLR end "rule__Statement__Group_9__2"


    // $ANTLR start "rule__Statement__Group_9__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3852:1: rule__Statement__Group_9__2__Impl : ( ( rule__Statement__StatementAssignment_9_2 ) ) ;
    public final void rule__Statement__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: ( ( ( rule__Statement__StatementAssignment_9_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: ( ( rule__Statement__StatementAssignment_9_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: ( ( rule__Statement__StatementAssignment_9_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: ( rule__Statement__StatementAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAssignment_9_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:1: ( rule__Statement__StatementAssignment_9_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:2: rule__Statement__StatementAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_9_2_in_rule__Statement__Group_9__2__Impl7855);
            rule__Statement__StatementAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAssignment_9_2()); 
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
    // $ANTLR end "rule__Statement__Group_9__2__Impl"


    // $ANTLR start "rule__Statement__Group_10__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3875:1: rule__Statement__Group_10__0 : rule__Statement__Group_10__0__Impl rule__Statement__Group_10__1 ;
    public final void rule__Statement__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ( rule__Statement__Group_10__0__Impl rule__Statement__Group_10__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3880:2: rule__Statement__Group_10__0__Impl rule__Statement__Group_10__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_10__0__Impl_in_rule__Statement__Group_10__07891);
            rule__Statement__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_10__1_in_rule__Statement__Group_10__07894);
            rule__Statement__Group_10__1();

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
    // $ANTLR end "rule__Statement__Group_10__0"


    // $ANTLR start "rule__Statement__Group_10__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:1: rule__Statement__Group_10__0__Impl : ( () ) ;
    public final void rule__Statement__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_10_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_10_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_10__0__Impl"


    // $ANTLR start "rule__Statement__Group_10__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__Statement__Group_10__1 : rule__Statement__Group_10__1__Impl rule__Statement__Group_10__2 ;
    public final void rule__Statement__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__Statement__Group_10__1__Impl rule__Statement__Group_10__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__Statement__Group_10__1__Impl rule__Statement__Group_10__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_10__1__Impl_in_rule__Statement__Group_10__17952);
            rule__Statement__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_10__2_in_rule__Statement__Group_10__17955);
            rule__Statement__Group_10__2();

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
    // $ANTLR end "rule__Statement__Group_10__1"


    // $ANTLR start "rule__Statement__Group_10__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__Statement__Group_10__1__Impl : ( 'break' ) ;
    public final void rule__Statement__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( 'break' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( 'break' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( 'break' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getBreakKeyword_10_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Statement__Group_10__1__Impl7983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getBreakKeyword_10_1()); 
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
    // $ANTLR end "rule__Statement__Group_10__1__Impl"


    // $ANTLR start "rule__Statement__Group_10__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:1: rule__Statement__Group_10__2 : rule__Statement__Group_10__2__Impl rule__Statement__Group_10__3 ;
    public final void rule__Statement__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( rule__Statement__Group_10__2__Impl rule__Statement__Group_10__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:2: rule__Statement__Group_10__2__Impl rule__Statement__Group_10__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_10__2__Impl_in_rule__Statement__Group_10__28014);
            rule__Statement__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_10__3_in_rule__Statement__Group_10__28017);
            rule__Statement__Group_10__3();

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
    // $ANTLR end "rule__Statement__Group_10__2"


    // $ANTLR start "rule__Statement__Group_10__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: rule__Statement__Group_10__2__Impl : ( ( rule__Statement__NameAssignment_10_2 )? ) ;
    public final void rule__Statement__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: ( ( ( rule__Statement__NameAssignment_10_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( ( rule__Statement__NameAssignment_10_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( ( rule__Statement__NameAssignment_10_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( rule__Statement__NameAssignment_10_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_10_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( rule__Statement__NameAssignment_10_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:2: rule__Statement__NameAssignment_10_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_10_2_in_rule__Statement__Group_10__2__Impl8044);
                    rule__Statement__NameAssignment_10_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_10_2()); 
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
    // $ANTLR end "rule__Statement__Group_10__2__Impl"


    // $ANTLR start "rule__Statement__Group_10__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: rule__Statement__Group_10__3 : rule__Statement__Group_10__3__Impl ;
    public final void rule__Statement__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( rule__Statement__Group_10__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:2: rule__Statement__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_10__3__Impl_in_rule__Statement__Group_10__38075);
            rule__Statement__Group_10__3__Impl();

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
    // $ANTLR end "rule__Statement__Group_10__3"


    // $ANTLR start "rule__Statement__Group_10__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: rule__Statement__Group_10__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:3983:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_10__3__Impl8103); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_10_3()); 
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
    // $ANTLR end "rule__Statement__Group_10__3__Impl"


    // $ANTLR start "rule__Statement__Group_11__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: rule__Statement__Group_11__0 : rule__Statement__Group_11__0__Impl rule__Statement__Group_11__1 ;
    public final void rule__Statement__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( rule__Statement__Group_11__0__Impl rule__Statement__Group_11__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:2: rule__Statement__Group_11__0__Impl rule__Statement__Group_11__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__0__Impl_in_rule__Statement__Group_11__08142);
            rule__Statement__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_11__1_in_rule__Statement__Group_11__08145);
            rule__Statement__Group_11__1();

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
    // $ANTLR end "rule__Statement__Group_11__0"


    // $ANTLR start "rule__Statement__Group_11__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:1: rule__Statement__Group_11__0__Impl : ( () ) ;
    public final void rule__Statement__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_11_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_11_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_11__0__Impl"


    // $ANTLR start "rule__Statement__Group_11__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:1: rule__Statement__Group_11__1 : rule__Statement__Group_11__1__Impl rule__Statement__Group_11__2 ;
    public final void rule__Statement__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ( rule__Statement__Group_11__1__Impl rule__Statement__Group_11__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:2: rule__Statement__Group_11__1__Impl rule__Statement__Group_11__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__1__Impl_in_rule__Statement__Group_11__18203);
            rule__Statement__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_11__2_in_rule__Statement__Group_11__18206);
            rule__Statement__Group_11__2();

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
    // $ANTLR end "rule__Statement__Group_11__1"


    // $ANTLR start "rule__Statement__Group_11__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: rule__Statement__Group_11__1__Impl : ( 'continue' ) ;
    public final void rule__Statement__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: ( ( 'continue' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: ( 'continue' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: ( 'continue' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: 'continue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getContinueKeyword_11_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Statement__Group_11__1__Impl8234); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getContinueKeyword_11_1()); 
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
    // $ANTLR end "rule__Statement__Group_11__1__Impl"


    // $ANTLR start "rule__Statement__Group_11__2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: rule__Statement__Group_11__2 : rule__Statement__Group_11__2__Impl rule__Statement__Group_11__3 ;
    public final void rule__Statement__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:1: ( rule__Statement__Group_11__2__Impl rule__Statement__Group_11__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:2: rule__Statement__Group_11__2__Impl rule__Statement__Group_11__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__2__Impl_in_rule__Statement__Group_11__28265);
            rule__Statement__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_11__3_in_rule__Statement__Group_11__28268);
            rule__Statement__Group_11__3();

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
    // $ANTLR end "rule__Statement__Group_11__2"


    // $ANTLR start "rule__Statement__Group_11__2__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: rule__Statement__Group_11__2__Impl : ( ( rule__Statement__NameAssignment_11_2 )? ) ;
    public final void rule__Statement__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4082:1: ( ( ( rule__Statement__NameAssignment_11_2 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4083:1: ( ( rule__Statement__NameAssignment_11_2 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4083:1: ( ( rule__Statement__NameAssignment_11_2 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4084:1: ( rule__Statement__NameAssignment_11_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameAssignment_11_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( rule__Statement__NameAssignment_11_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:2: rule__Statement__NameAssignment_11_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_11_2_in_rule__Statement__Group_11__2__Impl8295);
                    rule__Statement__NameAssignment_11_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameAssignment_11_2()); 
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
    // $ANTLR end "rule__Statement__Group_11__2__Impl"


    // $ANTLR start "rule__Statement__Group_11__3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4095:1: rule__Statement__Group_11__3 : rule__Statement__Group_11__3__Impl ;
    public final void rule__Statement__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4099:1: ( rule__Statement__Group_11__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4100:2: rule__Statement__Group_11__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_11__3__Impl_in_rule__Statement__Group_11__38326);
            rule__Statement__Group_11__3__Impl();

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
    // $ANTLR end "rule__Statement__Group_11__3"


    // $ANTLR start "rule__Statement__Group_11__3__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: rule__Statement__Group_11__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4112:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_11__3__Impl8354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_11_3()); 
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
    // $ANTLR end "rule__Statement__Group_11__3__Impl"


    // $ANTLR start "rule__Statement__Group_12__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:1: rule__Statement__Group_12__0 : rule__Statement__Group_12__0__Impl rule__Statement__Group_12__1 ;
    public final void rule__Statement__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ( rule__Statement__Group_12__0__Impl rule__Statement__Group_12__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:2: rule__Statement__Group_12__0__Impl rule__Statement__Group_12__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_12__0__Impl_in_rule__Statement__Group_12__08393);
            rule__Statement__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_12__1_in_rule__Statement__Group_12__08396);
            rule__Statement__Group_12__1();

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
    // $ANTLR end "rule__Statement__Group_12__0"


    // $ANTLR start "rule__Statement__Group_12__0__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: rule__Statement__Group_12__0__Impl : ( () ) ;
    public final void rule__Statement__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: ( ( () ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( () )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( () )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_12_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ()
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_12_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_12__0__Impl"


    // $ANTLR start "rule__Statement__Group_12__1"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:1: rule__Statement__Group_12__1 : rule__Statement__Group_12__1__Impl ;
    public final void rule__Statement__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( rule__Statement__Group_12__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:2: rule__Statement__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_12__1__Impl_in_rule__Statement__Group_12__18454);
            rule__Statement__Group_12__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_12__1"


    // $ANTLR start "rule__Statement__Group_12__1__Impl"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: rule__Statement__Group_12__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_12_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Statement__Group_12__1__Impl8482); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_12_1()); 
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
    // $ANTLR end "rule__Statement__Group_12__1__Impl"


    // $ANTLR start "rule__While_Statement__Group__0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:1: rule__While_Statement__Group__0 : rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1 ;
    public final void rule__While_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4202:1: ( rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4203:2: rule__While_Statement__Group__0__Impl rule__While_Statement__Group__1
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__0__Impl_in_rule__While_Statement__Group__08517);
            rule__While_Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While_Statement__Group__1_in_rule__While_Statement__Group__08520);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: rule__While_Statement__Group__0__Impl : ( 'while(' ) ;
    public final void rule__While_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( ( 'while(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ( 'while(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ( 'while(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: 'while('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getWhileKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__While_Statement__Group__0__Impl8548); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: rule__While_Statement__Group__1 : rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2 ;
    public final void rule__While_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:1: ( rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4234:2: rule__While_Statement__Group__1__Impl rule__While_Statement__Group__2
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__1__Impl_in_rule__While_Statement__Group__18579);
            rule__While_Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__While_Statement__Group__2_in_rule__While_Statement__Group__18582);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: rule__While_Statement__Group__1__Impl : ( ')' ) ;
    public final void rule__While_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getRightParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__While_Statement__Group__1__Impl8610); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4260:1: rule__While_Statement__Group__2 : rule__While_Statement__Group__2__Impl ;
    public final void rule__While_Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4264:1: ( rule__While_Statement__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4265:2: rule__While_Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__While_Statement__Group__2__Impl_in_rule__While_Statement__Group__28641);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: rule__While_Statement__Group__2__Impl : ( ( rule__While_Statement__StatementAssignment_2 ) ) ;
    public final void rule__While_Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: ( ( ( rule__While_Statement__StatementAssignment_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: ( ( rule__While_Statement__StatementAssignment_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: ( ( rule__While_Statement__StatementAssignment_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:1: ( rule__While_Statement__StatementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getStatementAssignment_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4278:1: ( rule__While_Statement__StatementAssignment_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4278:2: rule__While_Statement__StatementAssignment_2
            {
            pushFollow(FOLLOW_rule__While_Statement__StatementAssignment_2_in_rule__While_Statement__Group__2__Impl8668);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4294:1: rule__Do_Statement__Group__0 : rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1 ;
    public final void rule__Do_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: ( rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4299:2: rule__Do_Statement__Group__0__Impl rule__Do_Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__0__Impl_in_rule__Do_Statement__Group__08704);
            rule__Do_Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__1_in_rule__Do_Statement__Group__08707);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: rule__Do_Statement__Group__0__Impl : ( 'do' ) ;
    public final void rule__Do_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: ( ( 'do' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: ( 'do' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: ( 'do' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getDoKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Do_Statement__Group__0__Impl8735); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:1: rule__Do_Statement__Group__1 : rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2 ;
    public final void rule__Do_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: ( rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:2: rule__Do_Statement__Group__1__Impl rule__Do_Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__1__Impl_in_rule__Do_Statement__Group__18766);
            rule__Do_Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__2_in_rule__Do_Statement__Group__18769);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4337:1: rule__Do_Statement__Group__1__Impl : ( ( rule__Do_Statement__StatementAssignment_1 ) ) ;
    public final void rule__Do_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: ( ( ( rule__Do_Statement__StatementAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: ( ( rule__Do_Statement__StatementAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: ( ( rule__Do_Statement__StatementAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( rule__Do_Statement__StatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getStatementAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: ( rule__Do_Statement__StatementAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:2: rule__Do_Statement__StatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Do_Statement__StatementAssignment_1_in_rule__Do_Statement__Group__1__Impl8796);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: rule__Do_Statement__Group__2 : rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3 ;
    public final void rule__Do_Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:2: rule__Do_Statement__Group__2__Impl rule__Do_Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__2__Impl_in_rule__Do_Statement__Group__28826);
            rule__Do_Statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Do_Statement__Group__3_in_rule__Do_Statement__Group__28829);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: rule__Do_Statement__Group__2__Impl : ( 'while(' ) ;
    public final void rule__Do_Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: ( ( 'while(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( 'while(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( 'while(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: 'while('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getWhileKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__Do_Statement__Group__2__Impl8857); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: rule__Do_Statement__Group__3 : rule__Do_Statement__Group__3__Impl ;
    public final void rule__Do_Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4389:1: ( rule__Do_Statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4390:2: rule__Do_Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Do_Statement__Group__3__Impl_in_rule__Do_Statement__Group__38888);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:1: rule__Do_Statement__Group__3__Impl : ( ');' ) ;
    public final void rule__Do_Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:1: ( ( ');' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( ');' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( ');' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ');'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getRightParenthesisSemicolonKeyword_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__Do_Statement__Group__3__Impl8916); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4423:1: rule__If_statement__Group__0 : rule__If_statement__Group__0__Impl rule__If_statement__Group__1 ;
    public final void rule__If_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4427:1: ( rule__If_statement__Group__0__Impl rule__If_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4428:2: rule__If_statement__Group__0__Impl rule__If_statement__Group__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__08955);
            rule__If_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__08958);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4435:1: rule__If_statement__Group__0__Impl : ( 'if(' ) ;
    public final void rule__If_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: ( ( 'if(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:1: ( 'if(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:1: ( 'if(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: 'if('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__If_statement__Group__0__Impl8986); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: rule__If_statement__Group__1 : rule__If_statement__Group__1__Impl rule__If_statement__Group__2 ;
    public final void rule__If_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4458:1: ( rule__If_statement__Group__1__Impl rule__If_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4459:2: rule__If_statement__Group__1__Impl rule__If_statement__Group__2
            {
            pushFollow(FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__19017);
            rule__If_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__19020);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4466:1: rule__If_statement__Group__1__Impl : ( ')' ) ;
    public final void rule__If_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getRightParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__If_statement__Group__1__Impl9048); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: rule__If_statement__Group__2 : rule__If_statement__Group__2__Impl rule__If_statement__Group__3 ;
    public final void rule__If_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:1: ( rule__If_statement__Group__2__Impl rule__If_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:2: rule__If_statement__Group__2__Impl rule__If_statement__Group__3
            {
            pushFollow(FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__29079);
            rule__If_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__29082);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: rule__If_statement__Group__2__Impl : ( ruleStatement ) ;
    public final void rule__If_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getStatementParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If_statement__Group__2__Impl9109);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: rule__If_statement__Group__3 : rule__If_statement__Group__3__Impl ;
    public final void rule__If_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4518:1: ( rule__If_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:2: rule__If_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__39138);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4525:1: rule__If_statement__Group__3__Impl : ( ( rule__If_statement__Group_3__0 )? ) ;
    public final void rule__If_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4529:1: ( ( ( rule__If_statement__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: ( ( rule__If_statement__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: ( ( rule__If_statement__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:1: ( rule__If_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: ( rule__If_statement__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred57_InternalMyDsl()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:2: rule__If_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__If_statement__Group_3__0_in_rule__If_statement__Group__3__Impl9165);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: rule__If_statement__Group_3__0 : rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1 ;
    public final void rule__If_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4554:1: ( rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:2: rule__If_statement__Group_3__0__Impl rule__If_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__If_statement__Group_3__0__Impl_in_rule__If_statement__Group_3__09204);
            rule__If_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__If_statement__Group_3__1_in_rule__If_statement__Group_3__09207);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: rule__If_statement__Group_3__0__Impl : ( ( 'else' ) ) ;
    public final void rule__If_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ( ( ( 'else' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: ( ( 'else' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: ( ( 'else' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseKeyword_3_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: ( 'else' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4570:2: 'else'
            {
            match(input,40,FOLLOW_40_in_rule__If_statement__Group_3__0__Impl9236); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: rule__If_statement__Group_3__1 : rule__If_statement__Group_3__1__Impl ;
    public final void rule__If_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4585:1: ( rule__If_statement__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4586:2: rule__If_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__If_statement__Group_3__1__Impl_in_rule__If_statement__Group_3__19268);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4592:1: rule__If_statement__Group_3__1__Impl : ( ( rule__If_statement__ElseStatementAssignment_3_1 ) ) ;
    public final void rule__If_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:1: ( ( ( rule__If_statement__ElseStatementAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: ( ( rule__If_statement__ElseStatementAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: ( ( rule__If_statement__ElseStatementAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: ( rule__If_statement__ElseStatementAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseStatementAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: ( rule__If_statement__ElseStatementAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:2: rule__If_statement__ElseStatementAssignment_3_1
            {
            pushFollow(FOLLOW_rule__If_statement__ElseStatementAssignment_3_1_in_rule__If_statement__Group_3__1__Impl9295);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: rule__Try_statement__Group__0 : rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 ;
    public final void rule__Try_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:2: rule__Try_statement__Group__0__Impl rule__Try_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__09329);
            rule__Try_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__09332);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4625:1: rule__Try_statement__Group__0__Impl : ( 'try' ) ;
    public final void rule__Try_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4629:1: ( ( 'try' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4630:1: ( 'try' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4630:1: ( 'try' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:1: 'try'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Try_statement__Group__0__Impl9360); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: rule__Try_statement__Group__1 : rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 ;
    public final void rule__Try_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: ( rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:2: rule__Try_statement__Group__1__Impl rule__Try_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__19391);
            rule__Try_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__19394);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4656:1: rule__Try_statement__Group__1__Impl : ( ( rule__Try_statement__TryStatementAssignment_1 ) ) ;
    public final void rule__Try_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:1: ( ( ( rule__Try_statement__TryStatementAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( ( rule__Try_statement__TryStatementAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: ( rule__Try_statement__TryStatementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:1: ( rule__Try_statement__TryStatementAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:2: rule__Try_statement__TryStatementAssignment_1
            {
            pushFollow(FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl9421);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4673:1: rule__Try_statement__Group__2 : rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 ;
    public final void rule__Try_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:2: rule__Try_statement__Group__2__Impl rule__Try_statement__Group__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__29451);
            rule__Try_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__29454);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: rule__Try_statement__Group__2__Impl : ( ( rule__Try_statement__Group_2__0 )* ) ;
    public final void rule__Try_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4689:1: ( ( ( rule__Try_statement__Group_2__0 )* ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:1: ( ( rule__Try_statement__Group_2__0 )* )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:1: ( ( rule__Try_statement__Group_2__0 )* )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: ( rule__Try_statement__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:1: ( rule__Try_statement__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==42) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred58_InternalMyDsl()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:2: rule__Try_statement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl9481);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: rule__Try_statement__Group__3 : rule__Try_statement__Group__3__Impl ;
    public final void rule__Try_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( rule__Try_statement__Group__3__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:2: rule__Try_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__39512);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4713:1: rule__Try_statement__Group__3__Impl : ( ( rule__Try_statement__Group_3__0 )? ) ;
    public final void rule__Try_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4717:1: ( ( ( rule__Try_statement__Group_3__0 )? ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: ( ( rule__Try_statement__Group_3__0 )? )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: ( ( rule__Try_statement__Group_3__0 )? )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:1: ( rule__Try_statement__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getGroup_3()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: ( rule__Try_statement__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred59_InternalMyDsl()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:2: rule__Try_statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl9539);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: rule__Try_statement__Group_2__0 : rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 ;
    public final void rule__Try_statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4742:1: ( rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:2: rule__Try_statement__Group_2__0__Impl rule__Try_statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__09578);
            rule__Try_statement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__09581);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4750:1: rule__Try_statement__Group_2__0__Impl : ( ( 'catch' ) ) ;
    public final void rule__Try_statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4754:1: ( ( ( 'catch' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: ( ( 'catch' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: ( ( 'catch' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: ( 'catch' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getCatchKeyword_2_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4757:1: ( 'catch' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4758:2: 'catch'
            {
            match(input,42,FOLLOW_42_in_rule__Try_statement__Group_2__0__Impl9610); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: rule__Try_statement__Group_2__1 : rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 ;
    public final void rule__Try_statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4773:1: ( rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4774:2: rule__Try_statement__Group_2__1__Impl rule__Try_statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__19642);
            rule__Try_statement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__19645);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4781:1: rule__Try_statement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Try_statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:1: ( ( '(' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: ( '(' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: ( '(' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Try_statement__Group_2__1__Impl9673); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: rule__Try_statement__Group_2__2 : rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 ;
    public final void rule__Try_statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4804:1: ( rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4805:2: rule__Try_statement__Group_2__2__Impl rule__Try_statement__Group_2__3
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__29704);
            rule__Try_statement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__29707);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4812:1: rule__Try_statement__Group_2__2__Impl : ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) ;
    public final void rule__Try_statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: ( ( ( rule__Try_statement__ParametersAssignment_2_2 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: ( ( rule__Try_statement__ParametersAssignment_2_2 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4818:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersAssignment_2_2()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:1: ( rule__Try_statement__ParametersAssignment_2_2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:2: rule__Try_statement__ParametersAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl9734);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4829:1: rule__Try_statement__Group_2__3 : rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 ;
    public final void rule__Try_statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: ( rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:2: rule__Try_statement__Group_2__3__Impl rule__Try_statement__Group_2__4
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__39764);
            rule__Try_statement__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__39767);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: rule__Try_statement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Try_statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: ( ( ')' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ')' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ')' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Try_statement__Group_2__3__Impl9795); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:1: rule__Try_statement__Group_2__4 : rule__Try_statement__Group_2__4__Impl ;
    public final void rule__Try_statement__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4864:1: ( rule__Try_statement__Group_2__4__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:2: rule__Try_statement__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__49826);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: rule__Try_statement__Group_2__4__Impl : ( ( rule__Try_statement__StatementAssignment_2_4 ) ) ;
    public final void rule__Try_statement__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: ( ( ( rule__Try_statement__StatementAssignment_2_4 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:1: ( ( rule__Try_statement__StatementAssignment_2_4 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4877:1: ( rule__Try_statement__StatementAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementAssignment_2_4()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: ( rule__Try_statement__StatementAssignment_2_4 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:2: rule__Try_statement__StatementAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl9853);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4898:1: rule__Try_statement__Group_3__0 : rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 ;
    public final void rule__Try_statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4902:1: ( rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4903:2: rule__Try_statement__Group_3__0__Impl rule__Try_statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__09893);
            rule__Try_statement__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__09896);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: rule__Try_statement__Group_3__0__Impl : ( ( 'finally' ) ) ;
    public final void rule__Try_statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4914:1: ( ( ( 'finally' ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( ( 'finally' ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( ( 'finally' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( 'finally' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getFinallyKeyword_3_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: ( 'finally' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:2: 'finally'
            {
            match(input,43,FOLLOW_43_in_rule__Try_statement__Group_3__0__Impl9925); if (state.failed) return ;

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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4929:1: rule__Try_statement__Group_3__1 : rule__Try_statement__Group_3__1__Impl ;
    public final void rule__Try_statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: ( rule__Try_statement__Group_3__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4934:2: rule__Try_statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__19957);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:1: rule__Try_statement__Group_3__1__Impl : ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) ;
    public final void rule__Try_statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4944:1: ( ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:1: ( ( rule__Try_statement__StatementFinallyAssignment_3_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyAssignment_3_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: ( rule__Try_statement__StatementFinallyAssignment_3_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:2: rule__Try_statement__StatementFinallyAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl9984);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:1: rule__Import_statement__Group__0 : rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 ;
    public final void rule__Import_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: ( rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:2: rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__010018);
            rule__Import_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__010021);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: rule__Import_statement__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4977:1: ( ( 'import' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: ( 'import' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: ( 'import' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4979:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Import_statement__Group__0__Impl10049); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: rule__Import_statement__Group__1 : rule__Import_statement__Group__1__Impl ;
    public final void rule__Import_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4996:1: ( rule__Import_statement__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:2: rule__Import_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__110080);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5003:1: rule__Import_statement__Group__1__Impl : ( ( rule__Import_statement__Alternatives_1 ) ) ;
    public final void rule__Import_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: ( ( ( rule__Import_statement__Alternatives_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( ( rule__Import_statement__Alternatives_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( ( rule__Import_statement__Alternatives_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: ( rule__Import_statement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5010:1: ( rule__Import_statement__Alternatives_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5010:2: rule__Import_statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl10107);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: rule__Import_statement__Group_1_0__0 : rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 ;
    public final void rule__Import_statement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: ( rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:2: rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__010141);
            rule__Import_statement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__010144);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:1: rule__Import_statement__Group_1_0__0__Impl : ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) ;
    public final void rule__Import_statement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5040:1: ( ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5041:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5041:1: ( ( rule__Import_statement__ClassNameAssignment_1_0_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5042:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameAssignment_1_0_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: ( rule__Import_statement__ClassNameAssignment_1_0_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:2: rule__Import_statement__ClassNameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl10171);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:1: rule__Import_statement__Group_1_0__1 : rule__Import_statement__Group_1_0__1__Impl ;
    public final void rule__Import_statement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5057:1: ( rule__Import_statement__Group_1_0__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5058:2: rule__Import_statement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__110201);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5064:1: rule__Import_statement__Group_1_0__1__Impl : ( ';' ) ;
    public final void rule__Import_statement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5070:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl10229); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5087:1: rule__Import_statement__Group_1_1__0 : rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 ;
    public final void rule__Import_statement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5091:1: ( rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:2: rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__010264);
            rule__Import_statement__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__010267);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: rule__Import_statement__Group_1_1__0__Impl : ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) ;
    public final void rule__Import_statement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:1: ( ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( ( rule__Import_statement__PacNameAssignment_1_1_0 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNameAssignment_1_1_0()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5106:1: ( rule__Import_statement__PacNameAssignment_1_1_0 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5106:2: rule__Import_statement__PacNameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl10294);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:1: rule__Import_statement__Group_1_1__1 : rule__Import_statement__Group_1_1__1__Impl ;
    public final void rule__Import_statement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5120:1: ( rule__Import_statement__Group_1_1__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5121:2: rule__Import_statement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__110324);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: rule__Import_statement__Group_1_1__1__Impl : ( '.*;' ) ;
    public final void rule__Import_statement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( ( '.*;' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5132:1: ( '.*;' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5132:1: ( '.*;' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: '.*;'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__Import_statement__Group_1_1__1__Impl10352); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: rule__Package_statement__Group__0 : rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 ;
    public final void rule__Package_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5154:1: ( rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5155:2: rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__010387);
            rule__Package_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__010390);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5162:1: rule__Package_statement__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5166:1: ( ( 'package' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: ( 'package' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: ( 'package' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Package_statement__Group__0__Impl10418); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5181:1: rule__Package_statement__Group__1 : rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 ;
    public final void rule__Package_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5185:1: ( rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5186:2: rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__110449);
            rule__Package_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__110452);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: rule__Package_statement__Group__1__Impl : ( ( rule__Package_statement__PacNameAssignment_1 ) ) ;
    public final void rule__Package_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( ( ( rule__Package_statement__PacNameAssignment_1 ) ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ( ( rule__Package_statement__PacNameAssignment_1 ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5199:1: ( rule__Package_statement__PacNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNameAssignment_1()); 
            }
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5200:1: ( rule__Package_statement__PacNameAssignment_1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5200:2: rule__Package_statement__PacNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl10479);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5210:1: rule__Package_statement__Group__2 : rule__Package_statement__Group__2__Impl ;
    public final void rule__Package_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5214:1: ( rule__Package_statement__Group__2__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5215:2: rule__Package_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__210509);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5221:1: rule__Package_statement__Group__2__Impl : ( ';' ) ;
    public final void rule__Package_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5225:1: ( ( ';' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5226:1: ( ';' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5226:1: ( ';' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5227:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__Package_statement__Group__2__Impl10537); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5246:1: rule__Package_name__Group__0 : rule__Package_name__Group__0__Impl rule__Package_name__Group__1 ;
    public final void rule__Package_name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( rule__Package_name__Group__0__Impl rule__Package_name__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:2: rule__Package_name__Group__0__Impl rule__Package_name__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__010574);
            rule__Package_name__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__010577);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: rule__Package_name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Package_name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5263:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl10604); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5275:1: rule__Package_name__Group__1 : rule__Package_name__Group__1__Impl ;
    public final void rule__Package_name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: ( rule__Package_name__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:2: rule__Package_name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__110633);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5286:1: rule__Package_name__Group__1__Impl : ( rulePackage_name_line ) ;
    public final void rule__Package_name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: ( ( rulePackage_name_line ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5291:1: ( rulePackage_name_line )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5291:1: ( rulePackage_name_line )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: rulePackage_name_line
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_nameAccess().getPackage_name_lineParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl10660);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: rule__Package_name_line__Group__0 : rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 ;
    public final void rule__Package_name_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: ( rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1 )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5312:2: rule__Package_name_line__Group__0__Impl rule__Package_name_line__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__010693);
            rule__Package_name_line__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__010696);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5319:1: rule__Package_name_line__Group__0__Impl : ( '.' ) ;
    public final void rule__Package_name_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5323:1: ( ( '.' ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: ( '.' )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: ( '.' )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getFullStopKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__Package_name_line__Group__0__Impl10724); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5338:1: rule__Package_name_line__Group__1 : rule__Package_name_line__Group__1__Impl ;
    public final void rule__Package_name_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( rule__Package_name_line__Group__1__Impl )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:2: rule__Package_name_line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__110755);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: rule__Package_name_line__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package_name_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5353:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_name_lineAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl10782); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: rule__Model__GreetingsAssignment : ( ruleCompilation_unit ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:1: ( ( ruleCompilation_unit ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5376:1: ( ruleCompilation_unit )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5376:1: ( ruleCompilation_unit )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: ruleCompilation_unit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGreetingsCompilation_unitParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment10820);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: rule__Compilation_unit__NameAssignment_0 : ( rulePackage_statement ) ;
    public final void rule__Compilation_unit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: ( ( rulePackage_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( rulePackage_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( rulePackage_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: rulePackage_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getNamePackage_statementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_010851);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: rule__Compilation_unit__ImportsAssignment_1 : ( ruleImport_statement ) ;
    public final void rule__Compilation_unit__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5405:1: ( ( ruleImport_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5406:1: ( ruleImport_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5406:1: ( ruleImport_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: ruleImport_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_110882);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: rule__Compilation_unit__TypeDeclarationsAssignment_2 : ( ruleType_declaration ) ;
    public final void rule__Compilation_unit__TypeDeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5420:1: ( ( ruleType_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5421:1: ( ruleType_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5421:1: ( ruleType_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: ruleType_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompilation_unitAccess().getTypeDeclarationsType_declarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_210913);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: rule__Type_declaration__CommentAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Type_declaration__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5435:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5436:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5436:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_010944); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: rule__Type_declaration__ClassDecAssignment_1_0 : ( ruleClass_declaration ) ;
    public final void rule__Type_declaration__ClassDecAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5450:1: ( ( ruleClass_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( ruleClass_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( ruleClass_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: ruleClass_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getClassDecClass_declarationParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_010975);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: rule__Type_declaration__InterfaceDecAssignment_1_1 : ( ruleInterface_declaration ) ;
    public final void rule__Type_declaration__InterfaceDecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5465:1: ( ( ruleInterface_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( ruleInterface_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( ruleInterface_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: ruleInterface_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_declarationAccess().getInterfaceDecInterface_declarationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_111006);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: rule__Interface_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Interface_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_011037);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: rule__Interface_declaration__InterfaceNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface_declaration__InterfaceNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5495:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_211068); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5506:1: rule__Interface_declaration__InterfaceHerdadaAssignment_3_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfaceHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5510:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfaceHerdadaInterface_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_111099);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5525:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterface_declarationAccess().getInterfacesHerdadasInterface_nameParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_111130);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5536:1: rule__Class_declaration__ModifiersAssignment_0 : ( ruleModifier ) ;
    public final void rule__Class_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getModifiersModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_011161);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: rule__Class_declaration__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class_declaration__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5555:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5556:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5556:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5557:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_211192); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5566:1: rule__Class_declaration__ClassHerdadaAssignment_3_1 : ( ruleClass_name ) ;
    public final void rule__Class_declaration__ClassHerdadaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getClassHerdadaClass_nameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_111223);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: rule__Class_declaration__InterfaceImplementadaAssignment_4_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfaceImplementadaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5585:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfaceImplementadaInterface_nameParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_111254);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5596:1: rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:1: ( ( ruleInterface_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5601:1: ( ruleInterface_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5601:1: ( ruleInterface_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5602:1: ruleInterface_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getInterfacesImplementadasInterface_nameParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_111285);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: rule__Class_declaration__FieldsDeclarationAssignment_6 : ( ruleField_declaration ) ;
    public final void rule__Class_declaration__FieldsDeclarationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5615:1: ( ( ruleField_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:1: ( ruleField_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:1: ( ruleField_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5617:1: ruleField_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClass_declarationAccess().getFieldsDeclarationField_declarationParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_611316);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: rule__Field_declaration__CommentAssignment_0_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Field_declaration__CommentAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ( RULE_DOC_COMMENT ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ( RULE_DOC_COMMENT )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ( RULE_DOC_COMMENT )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: RULE_DOC_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getCommentDOC_COMMENTTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_011347); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:1: rule__Field_declaration__VariableDeclarationAssignment_0_1_0 : ( ruleVariable_declaration ) ;
    public final void rule__Field_declaration__VariableDeclarationAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( ( ruleVariable_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( ruleVariable_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( ruleVariable_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: ruleVariable_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getVariableDeclarationVariable_declarationParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_011378);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5656:1: rule__Field_declaration__ContructorNameAssignment_0_1_1 : ( ruleConstructor_declaration ) ;
    public final void rule__Field_declaration__ContructorNameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: ( ( ruleConstructor_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleConstructor_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleConstructor_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: ruleConstructor_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getContructorNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_111409);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: rule__Field_declaration__MethodNameAssignment_0_1_2 : ( ruleMethod_declaration ) ;
    public final void rule__Field_declaration__MethodNameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( ( ruleMethod_declaration ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleMethod_declaration )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleMethod_declaration )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ruleMethod_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getMethodNameMethod_declarationParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_211440);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: rule__Field_declaration__StaticinitializerAssignment_1 : ( ruleStatic_initializer ) ;
    public final void rule__Field_declaration__StaticinitializerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( ( ruleStatic_initializer ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ruleStatic_initializer )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ruleStatic_initializer )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ruleStatic_initializer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_declarationAccess().getStaticinitializerStatic_initializerParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_111471);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5701:1: rule__Method_declaration__ModifiersMethodAssignment_0 : ( ruleModifier ) ;
    public final void rule__Method_declaration__ModifiersMethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getModifiersMethodModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_011502);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5716:1: rule__Method_declaration__TypeMethodAssignment_1 : ( ruleType ) ;
    public final void rule__Method_declaration__TypeMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5720:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5721:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getTypeMethodTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_111533);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5731:1: rule__Method_declaration__NameMethodAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method_declaration__NameMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5735:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getNameMethodIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_211564); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5746:1: rule__Method_declaration__ParameterListMethodAssignment_4 : ( ruleParameter_list ) ;
    public final void rule__Method_declaration__ParameterListMethodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5750:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5752:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getParameterListMethodParameter_listParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_411595);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5761:1: rule__Method_declaration__StatementMethodAssignment_7_0 : ( ruleStatement_block ) ;
    public final void rule__Method_declaration__StatementMethodAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5766:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5767:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethod_declarationAccess().getStatementMethodStatement_blockParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_011626);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: rule__Constructor_declaration__ModifiersConstructorAssignment_0 : ( ruleModifier ) ;
    public final void rule__Constructor_declaration__ModifiersConstructorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5780:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5781:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5782:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getModifiersConstructorModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_011657);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:1: rule__Constructor_declaration__NameConstructorAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor_declaration__NameConstructorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5795:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5796:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5797:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getNameConstructorIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_111688); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: rule__Constructor_declaration__ParameterListConstructorAssignment_3 : ( ruleParameter_list ) ;
    public final void rule__Constructor_declaration__ParameterListConstructorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5810:1: ( ( ruleParameter_list ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: ( ruleParameter_list )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:1: ( ruleParameter_list )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5812:1: ruleParameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getParameterListConstructorParameter_listParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_311719);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5821:1: rule__Constructor_declaration__StatementConstructorAssignment_5 : ( ruleStatement_block ) ;
    public final void rule__Constructor_declaration__StatementConstructorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5825:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5826:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5827:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstructor_declarationAccess().getStatementConstructorStatement_blockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_511750);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5836:1: rule__Parameter_list__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5840:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5842:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_011781);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5851:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5856:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5857:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_111812);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5866:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5870:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5871:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5872:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_011843);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5881:1: rule__Parameter__ParameterNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__ParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_111874); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:1: rule__Variable_declaration__ModifiersVariableAssignment_0 : ( ruleModifier ) ;
    public final void rule__Variable_declaration__ModifiersVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5900:1: ( ( ruleModifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( ruleModifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( ruleModifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5902:1: ruleModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getModifiersVariableModifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_011905);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5911:1: rule__Variable_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Variable_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5915:1: ( ( ruleType ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: ( ruleType )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5916:1: ( ruleType )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5917:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_111936);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5926:1: rule__Variable_declaration__NameVariableAssignment_2 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NameVariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5930:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5931:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNameVariableVariable_declaratorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_211967);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5941:1: rule__Variable_declaration__NamesAssignment_3_1 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:1: ( ( ruleVariable_declarator ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: ( ruleVariable_declarator )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: ( ruleVariable_declarator )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5947:1: ruleVariable_declarator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_111998);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:1: rule__Variable_declarator__NameVariableAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_declarator__NameVariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5960:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5961:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5962:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaratorAccess().getNameVariableIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_012029); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5971:1: rule__Type__TypeSpecifierAssignment_0 : ( ruleType_specifier ) ;
    public final void rule__Type__TypeSpecifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5975:1: ( ( ruleType_specifier ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ruleType_specifier )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ruleType_specifier )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ruleType_specifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeSpecifierType_specifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_012060);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5986:1: rule__Static_initializer__StaticAssignment_0 : ( RULE_STATIC ) ;
    public final void rule__Static_initializer__StaticAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5990:1: ( ( RULE_STATIC ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ( RULE_STATIC )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5991:1: ( RULE_STATIC )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: RULE_STATIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STATIC,FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_012091); if (state.failed) return ;
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6001:1: rule__Static_initializer__NameAssignment_1 : ( ruleStatement_block ) ;
    public final void rule__Static_initializer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:1: ( ( ruleStatement_block ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:1: ( ruleStatement_block )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:1: ( ruleStatement_block )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6007:1: ruleStatement_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_112122);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6016:1: rule__Statement_block__StatmentsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Statement_block__StatmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6020:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6021:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6021:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6022:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_blockAccess().getStatmentsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_112153);
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


    // $ANTLR start "rule__Statement__IfStatementAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6031:1: rule__Statement__IfStatementAssignment_2 : ( ruleIf_statement ) ;
    public final void rule__Statement__IfStatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:1: ( ( ruleIf_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6036:1: ( ruleIf_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6036:1: ( ruleIf_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6037:1: ruleIf_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleIf_statement_in_rule__Statement__IfStatementAssignment_212184);
            ruleIf_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getIfStatementIf_statementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Statement__IfStatementAssignment_2"


    // $ANTLR start "rule__Statement__DoStatementAssignment_3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6046:1: rule__Statement__DoStatementAssignment_3 : ( ruleDo_Statement ) ;
    public final void rule__Statement__DoStatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6050:1: ( ( ruleDo_Statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6051:1: ( ruleDo_Statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6051:1: ( ruleDo_Statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6052:1: ruleDo_Statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDo_Statement_in_rule__Statement__DoStatementAssignment_312215);
            ruleDo_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDoStatementDo_StatementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Statement__DoStatementAssignment_3"


    // $ANTLR start "rule__Statement__WhileStatementAssignment_4"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6061:1: rule__Statement__WhileStatementAssignment_4 : ( ruleWhile_Statement ) ;
    public final void rule__Statement__WhileStatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6065:1: ( ( ruleWhile_Statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6066:1: ( ruleWhile_Statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6066:1: ( ruleWhile_Statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6067:1: ruleWhile_Statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleWhile_Statement_in_rule__Statement__WhileStatementAssignment_412246);
            ruleWhile_Statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getWhileStatementWhile_StatementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Statement__WhileStatementAssignment_4"


    // $ANTLR start "rule__Statement__TryStatementAssignment_5"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6076:1: rule__Statement__TryStatementAssignment_5 : ( ruleTry_statement ) ;
    public final void rule__Statement__TryStatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6080:1: ( ( ruleTry_statement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6081:1: ( ruleTry_statement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6081:1: ( ruleTry_statement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6082:1: ruleTry_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_512277);
            ruleTry_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getTryStatementTry_statementParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Statement__TryStatementAssignment_5"


    // $ANTLR start "rule__Statement__SyncStatementAssignment_6_3"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6091:1: rule__Statement__SyncStatementAssignment_6_3 : ( ruleStatement ) ;
    public final void rule__Statement__SyncStatementAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6095:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6096:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6096:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6097:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__SyncStatementAssignment_6_312308);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSyncStatementStatementParserRuleCall_6_3_0()); 
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
    // $ANTLR end "rule__Statement__SyncStatementAssignment_6_3"


    // $ANTLR start "rule__Statement__NameStatementAssignment_9_0"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6106:1: rule__Statement__NameStatementAssignment_9_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameStatementAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6110:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6111:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6111:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6112:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_9_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_9_012339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameStatementIDTerminalRuleCall_9_0_0()); 
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
    // $ANTLR end "rule__Statement__NameStatementAssignment_9_0"


    // $ANTLR start "rule__Statement__StatementAssignment_9_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6121:1: rule__Statement__StatementAssignment_9_2 : ( ruleStatement ) ;
    public final void rule__Statement__StatementAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6125:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6126:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6126:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6127:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_9_212370);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_9_2_0()); 
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
    // $ANTLR end "rule__Statement__StatementAssignment_9_2"


    // $ANTLR start "rule__Statement__NameAssignment_10_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6136:1: rule__Statement__NameAssignment_10_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6140:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6141:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6141:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6142:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_10_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_10_212401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_10_2_0()); 
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
    // $ANTLR end "rule__Statement__NameAssignment_10_2"


    // $ANTLR start "rule__Statement__NameAssignment_11_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6151:1: rule__Statement__NameAssignment_11_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6155:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6156:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6156:1: ( RULE_ID )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6157:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_11_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_11_212432); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_11_2_0()); 
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
    // $ANTLR end "rule__Statement__NameAssignment_11_2"


    // $ANTLR start "rule__While_Statement__StatementAssignment_2"
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6166:1: rule__While_Statement__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__While_Statement__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6170:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6171:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6171:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6172:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__While_Statement__StatementAssignment_212463);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6181:1: rule__Do_Statement__StatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Do_Statement__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6185:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6186:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6186:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6187:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Do_Statement__StatementAssignment_112494);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6196:1: rule__If_statement__ElseStatementAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__If_statement__ElseStatementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6200:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6201:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6201:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6202:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__If_statement__ElseStatementAssignment_3_112525);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6211:1: rule__Try_statement__TryStatementAssignment_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__TryStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6215:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6216:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6216:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6217:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getTryStatementStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_112556);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6226:1: rule__Try_statement__ParametersAssignment_2_2 : ( ruleParameter ) ;
    public final void rule__Try_statement__ParametersAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6230:1: ( ( ruleParameter ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6231:1: ( ruleParameter )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6231:1: ( ruleParameter )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6232:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getParametersParameterParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_212587);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6241:1: rule__Try_statement__StatementAssignment_2_4 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6245:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6246:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6246:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6247:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementStatementParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_412618);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6256:1: rule__Try_statement__StatementFinallyAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__Try_statement__StatementFinallyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6260:1: ( ( ruleStatement ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6261:1: ( ruleStatement )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6261:1: ( ruleStatement )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6262:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTry_statementAccess().getStatementFinallyStatementParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_112649);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6271:1: rule__Import_statement__ClassNameAssignment_1_0_0 : ( ruleClass_name ) ;
    public final void rule__Import_statement__ClassNameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6275:1: ( ( ruleClass_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6276:1: ( ruleClass_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6276:1: ( ruleClass_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6277:1: ruleClass_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getClassNameClass_nameParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_012680);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6286:1: rule__Import_statement__PacNameAssignment_1_1_0 : ( rulePackage_name ) ;
    public final void rule__Import_statement__PacNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6290:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6291:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6291:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6292:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImport_statementAccess().getPacNamePackage_nameParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_012711);
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
    // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6301:1: rule__Package_statement__PacNameAssignment_1 : ( rulePackage_name ) ;
    public final void rule__Package_statement__PacNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6305:1: ( ( rulePackage_name ) )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6306:1: ( rulePackage_name )
            {
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6306:1: ( rulePackage_name )
            // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:6307:1: rulePackage_name
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackage_statementAccess().getPacNamePackage_nameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_112742);
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

    // $ANTLR start synpred57_InternalMyDsl
    public final void synpred57_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:2: ( rule__If_statement__Group_3__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:2: rule__If_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__If_statement__Group_3__0_in_synpred57_InternalMyDsl9165);
        rule__If_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalMyDsl

    // $ANTLR start synpred58_InternalMyDsl
    public final void synpred58_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:2: ( rule__Try_statement__Group_2__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:2: rule__Try_statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_2__0_in_synpred58_InternalMyDsl9481);
        rule__Try_statement__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalMyDsl

    // $ANTLR start synpred59_InternalMyDsl
    public final void synpred59_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:2: ( rule__Try_statement__Group_3__0 )
        // ../org.xtext.example.myjava.ui/src-gen/org/xtext/compilador/java/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:2: rule__Try_statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__Try_statement__Group_3__0_in_synpred59_InternalMyDsl9539);
        rule__Try_statement__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalMyDsl

    // Delegated rules

    public final boolean synpred59_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalMyDsl_fragment(); // can never throw exception
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
        "\3\23\10\35\1\57\2\35\1\6\3\uffff\1\57";
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
            "\1\15\24\uffff\1\17\1\uffff\1\14\21\uffff\1\16",
            "\1\15\26\uffff\1\14",
            "\1\21\14\uffff\1\21\2\uffff\1\20\1\uffff\1\21",
            "\1\22",
            "",
            "",
            "",
            "\1\15\26\uffff\1\14\21\uffff\1\16"
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
        "\17\uffff";
    static final String DFA8_eofS =
        "\17\uffff";
    static final String DFA8_minS =
        "\1\4\2\uffff\1\6\13\uffff";
    static final String DFA8_maxS =
        "\1\51\2\uffff\1\57\13\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14"+
        "\1\15\1\12";
    static final String DFA8_specialS =
        "\17\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\2\1\3\4\uffff\1\15\10\2\1\uffff\1\1\10\uffff\1\10\1\11\1"+
            "\12\1\uffff\1\13\1\14\1\6\1\5\1\uffff\1\4\1\uffff\1\7",
            "",
            "",
            "\1\2\26\uffff\1\2\3\uffff\1\16\15\uffff\1\2",
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
            return "1049:1: rule__Statement__Alternatives : ( ( ruleStatement_block ) | ( ruleVariable_declaration ) | ( ( rule__Statement__IfStatementAssignment_2 ) ) | ( ( rule__Statement__DoStatementAssignment_3 ) ) | ( ( rule__Statement__WhileStatementAssignment_4 ) ) | ( ( rule__Statement__TryStatementAssignment_5 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ( rule__Statement__Group_8__0 ) ) | ( ( rule__Statement__Group_9__0 ) ) | ( ( rule__Statement__Group_10__0 ) ) | ( ( rule__Statement__Group_11__0 ) ) | ( ( rule__Statement__Group_12__0 ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\1\6\1\13\1\6\2\uffff\1\13";
    static final String DFA9_maxS =
        "\1\6\1\57\1\6\2\uffff\1\57";
    static final String DFA9_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\3\41\uffff\1\4\1\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\41\uffff\1\4\1\uffff\1\2"
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
            return "1137:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );";
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
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0_in_rulePackage_name_line1718 = new BitSet(new long[]{0x0000800000000002L});
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
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Statement__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__IfStatementAssignment_2_in_rule__Statement__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoStatementAssignment_3_in_rule__Statement__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileStatementAssignment_4_in_rule__Statement__Alternatives2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__TryStatementAssignment_5_in_rule__Statement__Alternatives2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0_in_rule__Statement__Alternatives2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__0_in_rule__Statement__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__0_in_rule__Statement__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__0_in_rule__Statement__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__0_in_rule__Statement__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_12503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02534 = new BitSet(new long[]{0x00001000021000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__NameAssignment_0_in_rule__Compilation_unit__Group__0__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12595 = new BitSet(new long[]{0x00001000021000B0L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2625 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__TypeDeclarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2683 = new BitSet(new long[]{0x00000000021000B2L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02720 = new BitSet(new long[]{0x00000000021000B0L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__CommentAssignment_0_in_rule__Type_declaration__Group__0__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12781 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type_declaration__Group__2__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02906 = new BitSet(new long[]{0x00000000021000B0L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2936 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__23029 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__23032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__33089 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__33092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__43150 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__43153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__53212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__03283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__03286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__13345 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__13348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceHerdadaAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__23405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl3432 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__03469 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03592 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3622 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13653 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23715 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33775 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43836 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53897 = new BitSet(new long[]{0x00000000004FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63959 = new BitSet(new long[]{0x00000000004FF8F0L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__FieldsDeclarationAssignment_6_in_rule__Class_declaration__Group__6__Impl3989 = new BitSet(new long[]{0x00000000000FF8F2L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__74020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class_declaration__Group__7__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__04095 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__04098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__14157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassHerdadaAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__04218 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__04221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__14280 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__14283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfaceImplementadaAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__24340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl4367 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__04404 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__04407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__14466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04527 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__CommentAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__0__Impl_in_rule__Field_declaration__Group_2__04649 = new BitSet(new long[]{0x00000000000FF8F0L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1_in_rule__Field_declaration__Group_2__04652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_2__1__Impl_in_rule__Field_declaration__Group_2__14710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Field_declaration__Group_2__1__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04773 = new BitSet(new long[]{0x00000000000FF0F0L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ModifiersMethodAssignment_0_in_rule__Method_declaration__Group__0__Impl4803 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14834 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__TypeMethodAssignment_1_in_rule__Method_declaration__Group__1__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24894 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__NameMethodAssignment_2_in_rule__Method_declaration__Group__2__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34954 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__45016 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__45019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ParameterListMethodAssignment_4_in_rule__Method_declaration__Group__4__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__55077 = new BitSet(new long[]{0x0000000020200800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__55080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method_declaration__Group__5__Impl5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__65139 = new BitSet(new long[]{0x0000000020200800L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__65142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method_declaration__Group__6__Impl5171 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__75204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl5231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__05277 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__05280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ModifiersConstructorAssignment_0_in_rule__Constructor_declaration__Group__0__Impl5307 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__15338 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__15341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__NameConstructorAssignment_1_in_rule__Constructor_declaration__Group__1__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__25398 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__25401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__35460 = new BitSet(new long[]{0x00000000100FF070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__35463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ParameterListConstructorAssignment_3_in_rule__Constructor_declaration__Group__3__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__45521 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__45524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__55583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__StatementConstructorAssignment_5_in_rule__Constructor_declaration__Group__5__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05652 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5739 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05774 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05897 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15957 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterNameAssignment_1_in_rule__Parameter__Group__1__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Parameter__Group__2__Impl6046 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__06085 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__06088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__ModifiersVariableAssignment_0_in_rule__Variable_declaration__Group__0__Impl6115 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__16146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__16149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__26206 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__26209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NameVariableAssignment_2_in_rule__Variable_declaration__Group__2__Impl6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__36266 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__36269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl6296 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__46327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Variable_declaration__Group__4__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__06396 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__06399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__16458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__06519 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__06522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__NameVariableAssignment_0_in_rule__Variable_declarator__Group__0__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__16579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl6608 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06645 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeSpecifierAssignment_0_in_rule__Type__Group__0__Impl6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group__1__Impl6734 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06771 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__StaticAssignment_0_in_rule__Static_initializer__Group__0__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06892 = new BitSet(new long[]{0x000002BDC06FF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement_block__Group__0__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16954 = new BitSet(new long[]{0x000002BDC06FF870L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__StatmentsAssignment_1_in_rule__Statement_block__Group__1__Impl6984 = new BitSet(new long[]{0x000002BDC02FF872L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__27015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement_block__Group__2__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__07080 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__07083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__17141 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__17144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_6__1__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__27203 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__27206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group_6__2__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__37265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__SyncStatementAssignment_6_3_in_rule__Statement__Group_6__3__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__07330 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__07333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__17391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__17394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_7__1__Impl7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__27453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_7__2__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__0__Impl_in_rule__Statement__Group_8__07518 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1_in_rule__Statement__Group_8__07521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__1__Impl_in_rule__Statement__Group_8__17579 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__2_in_rule__Statement__Group_8__17582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_8__1__Impl7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_8__2__Impl_in_rule__Statement__Group_8__27641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_8__2__Impl7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__0__Impl_in_rule__Statement__Group_9__07706 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__1_in_rule__Statement__Group_9__07709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameStatementAssignment_9_0_in_rule__Statement__Group_9__0__Impl7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__1__Impl_in_rule__Statement__Group_9__17766 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__2_in_rule__Statement__Group_9__17769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_9__1__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_9__2__Impl_in_rule__Statement__Group_9__27828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_9_2_in_rule__Statement__Group_9__2__Impl7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__0__Impl_in_rule__Statement__Group_10__07891 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__1_in_rule__Statement__Group_10__07894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__1__Impl_in_rule__Statement__Group_10__17952 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__2_in_rule__Statement__Group_10__17955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_10__1__Impl7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__2__Impl_in_rule__Statement__Group_10__28014 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__3_in_rule__Statement__Group_10__28017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_10_2_in_rule__Statement__Group_10__2__Impl8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_10__3__Impl_in_rule__Statement__Group_10__38075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_10__3__Impl8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__0__Impl_in_rule__Statement__Group_11__08142 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__1_in_rule__Statement__Group_11__08145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__1__Impl_in_rule__Statement__Group_11__18203 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__2_in_rule__Statement__Group_11__18206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_11__1__Impl8234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__2__Impl_in_rule__Statement__Group_11__28265 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__3_in_rule__Statement__Group_11__28268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_11_2_in_rule__Statement__Group_11__2__Impl8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_11__3__Impl_in_rule__Statement__Group_11__38326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_11__3__Impl8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__0__Impl_in_rule__Statement__Group_12__08393 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__1_in_rule__Statement__Group_12__08396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_12__1__Impl_in_rule__Statement__Group_12__18454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statement__Group_12__1__Impl8482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__0__Impl_in_rule__While_Statement__Group__08517 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__1_in_rule__While_Statement__Group__08520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__While_Statement__Group__0__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__1__Impl_in_rule__While_Statement__Group__18579 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__2_in_rule__While_Statement__Group__18582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__While_Statement__Group__1__Impl8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__Group__2__Impl_in_rule__While_Statement__Group__28641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__While_Statement__StatementAssignment_2_in_rule__While_Statement__Group__2__Impl8668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__0__Impl_in_rule__Do_Statement__Group__08704 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__1_in_rule__Do_Statement__Group__08707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Do_Statement__Group__0__Impl8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__1__Impl_in_rule__Do_Statement__Group__18766 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__2_in_rule__Do_Statement__Group__18769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__StatementAssignment_1_in_rule__Do_Statement__Group__1__Impl8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__2__Impl_in_rule__Do_Statement__Group__28826 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__3_in_rule__Do_Statement__Group__28829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Do_Statement__Group__2__Impl8857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do_Statement__Group__3__Impl_in_rule__Do_Statement__Group__38888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Do_Statement__Group__3__Impl8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__0__Impl_in_rule__If_statement__Group__08955 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1_in_rule__If_statement__Group__08958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__If_statement__Group__0__Impl8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__1__Impl_in_rule__If_statement__Group__19017 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2_in_rule__If_statement__Group__19020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__If_statement__Group__1__Impl9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__2__Impl_in_rule__If_statement__Group__29079 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3_in_rule__If_statement__Group__29082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If_statement__Group__2__Impl9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group__3__Impl_in_rule__If_statement__Group__39138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0_in_rule__If_statement__Group__3__Impl9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0__Impl_in_rule__If_statement__Group_3__09204 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__1_in_rule__If_statement__Group_3__09207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__If_statement__Group_3__0__Impl9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__1__Impl_in_rule__If_statement__Group_3__19268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__ElseStatementAssignment_3_1_in_rule__If_statement__Group_3__1__Impl9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__0__Impl_in_rule__Try_statement__Group__09329 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1_in_rule__Try_statement__Group__09332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Try_statement__Group__0__Impl9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__1__Impl_in_rule__Try_statement__Group__19391 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2_in_rule__Try_statement__Group__19394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__TryStatementAssignment_1_in_rule__Try_statement__Group__1__Impl9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__2__Impl_in_rule__Try_statement__Group__29451 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3_in_rule__Try_statement__Group__29454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_rule__Try_statement__Group__2__Impl9481 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group__3__Impl_in_rule__Try_statement__Group__39512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_rule__Try_statement__Group__3__Impl9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0__Impl_in_rule__Try_statement__Group_2__09578 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1_in_rule__Try_statement__Group_2__09581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Try_statement__Group_2__0__Impl9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__1__Impl_in_rule__Try_statement__Group_2__19642 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2_in_rule__Try_statement__Group_2__19645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Try_statement__Group_2__1__Impl9673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__2__Impl_in_rule__Try_statement__Group_2__29704 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3_in_rule__Try_statement__Group_2__29707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__ParametersAssignment_2_2_in_rule__Try_statement__Group_2__2__Impl9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__3__Impl_in_rule__Try_statement__Group_2__39764 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4_in_rule__Try_statement__Group_2__39767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Try_statement__Group_2__3__Impl9795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__4__Impl_in_rule__Try_statement__Group_2__49826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementAssignment_2_4_in_rule__Try_statement__Group_2__4__Impl9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0__Impl_in_rule__Try_statement__Group_3__09893 = new BitSet(new long[]{0x000002BDC02FF870L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1_in_rule__Try_statement__Group_3__09896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Try_statement__Group_3__0__Impl9925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__1__Impl_in_rule__Try_statement__Group_3__19957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__StatementFinallyAssignment_3_1_in_rule__Try_statement__Group_3__1__Impl9984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__010018 = new BitSet(new long[]{0x00000000000FF070L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__010021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Import_statement__Group__0__Impl10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__110080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__010141 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__010144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__ClassNameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__110201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import_statement__Group_1_0__1__Impl10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__010264 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__010267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__PacNameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl10294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__110324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Import_statement__Group_1_1__1__Impl10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__010387 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__010390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Package_statement__Group__0__Impl10418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__110449 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__110452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__PacNameAssignment_1_in_rule__Package_statement__Group__1__Impl10479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__210509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Package_statement__Group__2__Impl10537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__010574 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__010577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl10604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__110633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_line_in_rule__Package_name__Group__1__Impl10660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__0__Impl_in_rule__Package_name_line__Group__010693 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1_in_rule__Package_name_line__Group__010696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Package_name_line__Group__0__Impl10724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_line__Group__1__Impl_in_rule__Package_name_line__Group__110755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name_line__Group__1__Impl10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_rule__Model__GreetingsAssignment10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_rule__Compilation_unit__NameAssignment_010851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_110882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_rule__Compilation_unit__TypeDeclarationsAssignment_210913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__CommentAssignment_010944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_rule__Type_declaration__ClassDecAssignment_1_010975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__InterfaceDecAssignment_1_111006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Interface_declaration__ModifiersAssignment_011037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_211068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfaceHerdadaAssignment_3_111099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__InterfacesHerdadasAssignment_3_2_111130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Class_declaration__ModifiersAssignment_011161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_211192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Class_declaration__ClassHerdadaAssignment_3_111223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfaceImplementadaAssignment_4_111254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__InterfacesImplementadasAssignment_4_2_111285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsDeclarationAssignment_611316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__CommentAssignment_0_011347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__VariableDeclarationAssignment_0_1_011378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__ContructorNameAssignment_0_1_111409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__MethodNameAssignment_0_1_211440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__StaticinitializerAssignment_111471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Method_declaration__ModifiersMethodAssignment_011502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method_declaration__TypeMethodAssignment_111533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method_declaration__NameMethodAssignment_211564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterListMethodAssignment_411595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementMethodAssignment_7_011626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Constructor_declaration__ModifiersConstructorAssignment_011657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameConstructorAssignment_111688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParameterListConstructorAssignment_311719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementConstructorAssignment_511750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_011781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_111812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_011843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__ParameterNameAssignment_111874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_rule__Variable_declaration__ModifiersVariableAssignment_011905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_111936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameVariableAssignment_211967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_111998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable_declarator__NameVariableAssignment_012029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_rule__Type__TypeSpecifierAssignment_012060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATIC_in_rule__Static_initializer__StaticAssignment_012091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_112122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement_block__StatmentsAssignment_112153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_statement_in_rule__Statement__IfStatementAssignment_212184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_Statement_in_rule__Statement__DoStatementAssignment_312215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_Statement_in_rule__Statement__WhileStatementAssignment_412246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTry_statement_in_rule__Statement__TryStatementAssignment_512277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__SyncStatementAssignment_6_312308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameStatementAssignment_9_012339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_9_212370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_10_212401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_11_212432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__While_Statement__StatementAssignment_212463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Do_Statement__StatementAssignment_112494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__If_statement__ElseStatementAssignment_3_112525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__TryStatementAssignment_112556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Try_statement__ParametersAssignment_2_212587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementAssignment_2_412618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Try_statement__StatementFinallyAssignment_3_112649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Import_statement__ClassNameAssignment_1_0_012680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Import_statement__PacNameAssignment_1_1_012711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Package_statement__PacNameAssignment_112742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_statement__Group_3__0_in_synpred57_InternalMyDsl9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_2__0_in_synpred58_InternalMyDsl9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Try_statement__Group_3__0_in_synpred59_InternalMyDsl9539 = new BitSet(new long[]{0x0000000000000002L});

}